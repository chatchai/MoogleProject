package th.co.food.service;

import java.util.List;

import th.co.food.domain.FoodBill;
import th.co.food.domain.FoodMenu;
import th.co.food.domain.FoodOrder;

public interface FoodService { 
	public void deleteFoodBill(FoodBill persistentInstance);	
	public void deleteFoodMenu(FoodMenu persistentInstance); 
	public void deleteFoodOrder(FoodOrder persistentInstance); 
	public FoodBill findFoodBillById(Integer fbId) ; 
	public FoodMenu findFoodMenuById(Integer fmId) ; 
	public FoodOrder findFoodOrderById(Integer foId);  
	public Integer saveFoodBill(FoodBill transientInstance); 
	public Integer saveFoodMenu(FoodBill transientInstance); 
	public Integer saveFoodOrder(FoodBill transientInstance); 
	public List searchFoodBill(FoodBill instance); 
	public List searchFoodMenu(FoodMenu instance);
	public List searchFoodOrder(FoodOrder instance); 
	public int updateFoodBill(FoodBill transientInstance);
	public int updateFoodMenu(FoodMenu transientInstance);	 
	public int updateFoodOrder(FoodOrder transientInstance); 

}
