package th.co.food.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("foodBillDTO")
public class FoodBillDTO  extends BaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
 
	 
	@XStreamAlias("fbId")
	private Integer fbId;

	@XStreamAlias("fbBillDate")
	private Date fbBillDate;

	@XStreamAlias("fbBillTime")
	private Timestamp fbBillTime;

	@XStreamAlias("fbTotalCalories")
	private Float fbTotalCalories;

	@XStreamAlias("fbTotalPrice")
	private Float fbTotalPrice;

	@XStreamAlias("fbTotalQuantity")
	private Integer fbTotalQuantity;

	 
	public Integer getFbId() {
		return fbId;
	}

	public void setFbId(Integer fbId) {
		this.fbId = fbId;
	}

	public Date getFbBillDate() {
		return fbBillDate;
	}

	public void setFbBillDate(Date fbBillDate) {
		this.fbBillDate = fbBillDate;
	}

	public Timestamp getFbBillTime() {
		return fbBillTime;
	}

	public void setFbBillTime(Timestamp fbBillTime) {
		this.fbBillTime = fbBillTime;
	}

	public Float getFbTotalCalories() {
		return fbTotalCalories;
	}

	public void setFbTotalCalories(Float fbTotalCalories) {
		this.fbTotalCalories = fbTotalCalories;
	}

	public Float getFbTotalPrice() {
		return fbTotalPrice;
	}

	public void setFbTotalPrice(Float fbTotalPrice) {
		this.fbTotalPrice = fbTotalPrice;
	}

	public Integer getFbTotalQuantity() {
		return fbTotalQuantity;
	}

	public void setFbTotalQuantity(Integer fbTotalQuantity) {
		this.fbTotalQuantity = fbTotalQuantity;
	}
   
}