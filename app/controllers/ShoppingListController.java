package controllers;

import models.Item;
import play.*;
import play.libs.Json;
import play.mvc.*;
import java.util.List;
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
    	    List<Item> items = find.all();

    	   return ok(Json.toJson(items));
       }
       
       public static Finder<Long, Item> find = 
			      new Finder<Long, Item>(Item.class);
}

