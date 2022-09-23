package project.entity;

import java.util.Arrays;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TableRestaurantImageEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long restaurantImageId;
	@Column
	private String name;
	@Column
	private String type;
	@Lob
	@Column(name = "imagedata",length = 1000)
    private byte[] imageData;
	
	@JsonIgnore
	@OneToOne
	private RestaurantInfoEntity info;
	
	public TableRestaurantImageEntity()
	{
		
	}

	public TableRestaurantImageEntity(long restaurantImageId, String name, String type, byte[] imageData) {
		super();
		this.restaurantImageId = restaurantImageId;
		this.name = name;
		this.type = type;
		this.imageData = imageData;
	}

	public long getRestaurantImageId() {
		return restaurantImageId;
	}

	public void setRestaurantImageId(long restaurantImageId) {
		this.restaurantImageId = restaurantImageId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getImageData() {
		return imageData;
	}

	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}

	public RestaurantInfoEntity getInfo() {
		return info;
	}

	public void setInfo(RestaurantInfoEntity info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "TableRestaurantImageEntity [restaurantImageId=" + restaurantImageId + ", name=" + name + ", type="
				+ type + ", imageData=" + Arrays.toString(imageData) + ", info=" + info + "]";
	}
}
