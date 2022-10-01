package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import project.entity.RestaurantInfoEntity;
import project.entity.TableRestaurantImageEntity;
import project.repository.TableRestaurantImageRepository;
import java.io.IOException;
import java.util.Optional;

@Service
public class StorageService 
{
    @Autowired
    private TableRestaurantImageRepository repository;

    public TableRestaurantImageEntity uploadImage(MultipartFile file,RestaurantInfoEntity restInfo) throws IOException
    {
    	TableRestaurantImageEntity img = new TableRestaurantImageEntity();
    	img.setName(file.getOriginalFilename());
    	img.setImageData(ImageUtils.compressImage(file.getBytes()));
    	img.setType(file.getContentType());
    	img.setInfo(restInfo);
    	TableRestaurantImageEntity imageData = repository.save(img);          
        if (imageData!= null) 
        {
            return imageData;
        }
        return null;
    }

    public byte[] downloadImage(RestaurantInfoEntity restInfo)
    {
        Optional<TableRestaurantImageEntity> dbImageData = repository.findByInfo(restInfo);
        byte[] images=ImageUtils.decompressImage(dbImageData.get().getImageData());
        return images;
    }
}
