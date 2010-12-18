package th.co.food.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the FOOD_ORDER database table.
 * 
 */
@Entity
@Table(name="FOOD_ORDER")
public class FoodOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="FO_ID")
	private Integer foId;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="FO_ORDER_DATE")
	private Date foOrderDate;

	@Column(name="FO_ORDER_TIME")
	private Timestamp foOrderTime;

	@Column(name="FO_PHONE_NUMBER")
	private String foPhoneNumber;

	@Column(name="FO_QUANTITY")
	private Integer foQuantity;

	@Column(name="FO_TOTAL_CALORIES")
	private Float foTotalCalories;

	@Column(name="FO_TOTAL_PRICE")
	private Float foTotalPrice;

	//bi-directional many-to-one association to FoodBill
    @ManyToOne
	@JoinColumn(name="FB_ID")
	private FoodBill foodBill;

	//bi-directional many-to-one association to FoodMenu
    @ManyToOne
	@JoinColumn(name="FM_ID")
	private FoodMenu foodMenu;

	public Integer getFoId() {
		return foId;
	}

	public void setFoId(Integer foId) {
		this.foId = foId;
	}

	public Date getFoOrderDate() {
		return foOrderDate;
	}

	public void setFoOrderDate(Date foOrderDate) {
		this.foOrderDate = foOrderDate;
	}

	public Timestamp getFoOrderTime() {
		return foOrderTime;
	}

	public void setFoOrderTime(Timestamp foOrderTime) {
		this.foOrderTime = foOrderTime;
	}

	public String getFoPhoneNumber() {
		return foPhoneNumber;
	}

	public void setFoPhoneNumber(String foPhoneNumber) {
		this.foPhoneNumber = foPhoneNumber;
	}

	public Integer getFoQuantity() {
		return foQuantity;
	}

	public void setFoQuantity(Integer foQuantity) {
		this.foQuantity = foQuantity;
	}

	public Float getFoTotalCalories() {
		return foTotalCalories;
	}

	public void setFoTotalCalories(Float foTotalCalories) {
		this.foTotalCalories = foTotalCalories;
	}

	public Float getFoTotalPrice() {
		return foTotalPrice;
	}

	public void setFoTotalPrice(Float foTotalPrice) {
		this.foTotalPrice = foTotalPrice;
	}

	public FoodBill getFoodBill() {
		return foodBill;
	}

	public void setFoodBill(FoodBill foodBill) {
		this.foodBill = foodBill;
	}

	public FoodMenu getFoodMenu() {
		return foodMenu;
	}

	public void setFoodMenu(FoodMenu foodMenu) {
		this.foodMenu = foodMenu;
	}

    
}