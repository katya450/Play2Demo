package controllers;

import models.Item;
import play.*;
import play.mvc.*;

public class ShoppingListController extends Controller{

       
       public Result addItem() {
    	   return ok();
       }
       public Result deleteItem(Long id) {
    	   return ok();
       }
       
       public Result listItems() {	
    	   return ok();
       }
}
