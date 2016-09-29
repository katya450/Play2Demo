package controllers;

import models.Item;
import play.*;
import play.libs.Json;
import play.mvc.*;
import com.avaje.ebean.*;
import com.fasterxml.jackson.databind.JsonNode;

public class ShoppingListController extends Controller{

	  @BodyParser.Of(BodyParser.Json.class)

       public Result addItem() {
		   JsonNode json = request().body().asJson(); 
		   Item item = Json.fromJson(json, Item.class);
    	   Ebean.save(item);
    	   return ok();
       }
       
       public Result deleteItem(Long id) {
    	   return ok();
       }
       
       public Result listItems() {	
    	   return ok();
       }
}
