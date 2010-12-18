package th.co.food.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the FOOD_MENU database table.
 * 
 */
@Entity
@Table(name="FOOD_MENU")
public class FoodMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="FM_ID")
	private Integer fmId;

	@Column(name="FM_CALORIES")
	private Float fmCalories;

	@Column(name="FM_DETAIL")
	private String fmDetail;

	@Column(name="FM_NAME")
	private String fmName;

	@Column(name="FM_PICTURE_NAME")
	private String fmPictureName;

	@Column(name="FM_PICTURE_PATH")
	private String fmPicturePath;

	@Column(name="FM_PRICE")
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