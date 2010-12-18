package th.co.food.dto;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("foodMenuDTO")
public class FoodMenuDTO extends BaseDTO  implements Serializable {
	private static final long serialVersionUID = 1L;
 

	@XStreamAlias("fmId")
	private Integer fmId;

	@XStreamAlias("fmCalories")
	private Float fmCalories;

	@XStreamAlias("fmDetail")
	private String fmDetail;

	@XStreamAlias("fmName")
	private String fmName;

	@XStreamAlias("fmPictureName")
	private String fmPictureName;

	@XStreamAlias("fmPicturePath")
	private String fmPicturePath;

	@XStreamAlias("fmPrice")
	private Float fmPrice;

 

	public Integer getFmId() {
		return fmId;
	}

	public void setFmId(Integer fmId) {
		this.fmId = fmId;
	}

	public Float getFmCalories() {
		return fmCalories;
	}

	public void setFmCalories(Float fmCalories) {
		this.fmCalories = fmCalories;
	}

	public String getFmDetail() {
		return fmDetail;
	}

	public void setFmDetail(String fmDetail) {
		this.fmDetail = fmDetail;
	}

	public String getFmName() {
		return fmName;
	}

	public void setFmName(String fmName) {
		this.fmName = fmName;
	}

	public String getFmPictureName() {
		return fmPictureName;
	}

	public void setFmPictureName(String fmPictureName) {
		this.fmPictureName = fmPictureName;
	}

	public String getFmPicturePath() {
		return fmPicturePath;
	}

	public void setFmPicturePath(String fmPicturePath) {
		this.fmPicturePath = fmPicturePath;
	}

	public Float getFmPrice() {
		return fmPrice;
	}

	public void setFmPrice(Float fmPrice) {
		this.fmPrice = fmPrice;
	}

	
 }