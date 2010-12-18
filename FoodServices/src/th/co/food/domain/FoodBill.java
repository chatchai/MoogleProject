package th.co.food.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the FOOD_BILL database table.
 * 
 */ 
@Entity
@Table(name="FOOD_BILL")
public class FoodBill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="FB_ID")
	private Integer fbId;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="FB_BILL_DATE")
	private Date fbBillDate;

	@Column(name="FB_BILL_TIME")
	private Timestamp fbBillTime;

	@Column(name="FB_TOTAL_CALORIES")
	private Float fbTotalCalories;

	@Column(name="FB_TOTAL_PRICE")
	private Float fbTotalPrice;

	@Column(name="FB_TOTAL_QUANTITY")
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