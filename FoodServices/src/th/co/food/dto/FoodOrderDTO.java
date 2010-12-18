package th.co.food.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import th.co.food.domain.FoodBill;
import th.co.food.domain.FoodMenu;

import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("foodOrderDTO")
public class FoodOrderDTO  extends BaseDTO  implements Serializable {
	private static final long serialVersionUID = 1L;
 
 
	@XStreamAlias("foId")
	private Integer foId;

	@XStreamAlias("foOrderDate")
	private Date foOrderDate;

	@XStreamAlias("foOrderTime")
	private Timestamp foOrderTime;

	@XStreamAlias("foPhoneNumber")
	private String foPhoneNumber;

	@XStreamAlias("foQuantity")
	private Integer foQuantity;

	@XStreamAlias("foTotalCalories")
	private Float foTotalCalories;

	@XStreamAlias("foTotalPrice")
	private Float foTotalPrice;

	@XStreamAlias("foodBill")
	private FoodBill foodBill;

	@XStreamAlias("foodMenu")
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