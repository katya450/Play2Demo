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
		  //Logger.info("addItem");
		   JsonNode json = request().body().asJson(); 
		   if(json == null) {
			   return badRequest("Ei sopiva muoto!");
		   }
		   Item item = Json.fromJson(json, Item.class);
		   Ebean.save(item);
		   return ok();
       }
       
       public Result deleteItem(Long id) {
    	   Ebean.createSqlUpdate("DELETE FROM item WHERE id=" + id).execute();
    	   return ok();
       }
       

       
       public Result listItems() {	
    	   return ok("jepa");
       }
}

