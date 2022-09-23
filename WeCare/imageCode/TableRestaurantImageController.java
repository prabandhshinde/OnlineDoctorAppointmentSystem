package project.controllers;

import java.io.IOException;
import java.lang.StackWalker.Option;
import java.util.Optional;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;
import project.entity.RestaurantInfoEntity;
import project.entity.TableRestaurantImageEntity;
import project.repository.RestaurantInfoRepository;
import project.entity.Response;
import project.service.StorageService;

@RestController
@RequestMapping("/image")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TableRestaurantImageController 
{
		@Autowired
		private StorageService service;
		
		@Autowired
		RestaurantInfoRepository repo;

		@PostMapping("/postImage/{restInfoId}")
		public Response<?> uploadImage(@PathVariable int restInfoId,@RequestParam("image")MultipartFile file) throws IOException 
		{
			Optional<RestaurantInfoEntity> restInfo = repo.findById(restInfoId);
			
			if(restInfo.isPresent())
			{
				RestaurantInfoEntity restInfo1 = restInfo.get();
				TableRestaurantImageEntity savedImage = service.uploadImage(file,restInfo1);
				RestaurantInfoEntity restInfo2 = repo.save(restInfo1);
				return Response.getSuccessResponse(savedImage);
			}
			return Response.getErrorResponse("File Not Uploaded");
		}

		@GetMapping("/getImage/{restInfoId}")
		public ResponseEntity<?> downloadImage(@PathVariable int restInfoId)
		{
			Optional<RestaurantInfoEntity> obj = repo.findById(restInfoId);
			if(obj.isPresent())
			{
				byte[] imageData=service.downloadImage(obj.get());
				
				String base64 = Base64.encodeBase64String(imageData);
				return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("image/png")).body(base64);
			}
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
}