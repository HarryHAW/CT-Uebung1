package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import edu.ncsu.csc326.coffeemaker.*;
import junit.framework.TestCase;

/**
 * 
 * @author Sarah Heckman
 *
 * Unit tests for CoffeeMaker class.
 */
public class CoffeeMakerTest extends TestCase {
	
	private CoffeeMaker cm;
	//zulässig
        private Recipe r1;
	private Recipe r2;
	private Recipe r3;
	private Recipe r4;
        

    @Override
	protected void setUp() throws Exception {
		cm = new CoffeeMaker();
		
		//Set up for r1
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setAmtChocolate("0");
		r1.setAmtCoffee("3");
		r1.setAmtMilk("1");
		r1.setAmtSugar("1");
		r1.setPrice("50");
		
		//Set up for r2
		r2 = new Recipe();
		r2.setName("Mocha");
		r2.setAmtChocolate("20");
		r2.setAmtCoffee("3");
		r2.setAmtMilk("1");
		r2.setAmtSugar("1");
		r2.setPrice("75");
		
		//Set up for r3
		r3 = new Recipe();
		r3.setName("Latte");
		r3.setAmtChocolate("0");
		r3.setAmtCoffee("3");
		r3.setAmtMilk("3");
		r3.setAmtSugar("1");
		r3.setPrice("100");
		
		//Set up for r4
		r4 = new Recipe();
		r4.setName("Hot Chocolate");
		r4.setAmtChocolate("4");
		r4.setAmtCoffee("0");
		r4.setAmtMilk("1");
		r4.setAmtSugar("1");
		r4.setPrice("65");
               
                
		super.setUp();
	}
        
	public void testAddRecipe(){
            try {
            //Alles Integer? 
                //Recipe laesst sich nicht erstellen
            
            //Alles positiv? 
                //Recipe laesst sich nicht erstellen    
                
            //zulässige Recipe
            assertEquals(true,cm.addRecipe(r1));
            assertEquals(true,cm.addRecipe(r2));
            assertEquals(true,cm.addRecipe(r3));
            
            //schon vorhanden?
            assertEquals(false, cm.addRecipe(r1));
            assertEquals(false, cm.addRecipe(r2));
            assertEquals(false, cm.addRecipe(r3));
            
            //zu viel
            assertEquals(false,cm.addRecipe(r4));
                
		} catch (Exception e) {
			fail("InventoryException should not be thrown");
		}
        }
        public void testAddRecipeException(){
        }
        
        public void testDeleteRecipe(){
            try{
            //Recipe loeschen zulaessig
            assertEquals(true, cm.deleteRecipe(1));
            assertEquals(true, cm.deleteRecipe(2));
            assertEquals(true, cm.deleteRecipe(3));
            assertEquals(true, cm.deleteRecipe(4));
            
            //Index Out of Bounds
            assertEquals(false, cm.deleteRecipe(Integer.MIN_VALUE));
            assertEquals(false, cm.deleteRecipe(0));
            assertEquals(false, cm.deleteRecipe(Integer.MAX_VALUE));
            
            //Recipe nicht vorhanden
            assertEquals(false, cm.deleteRecipe(1));
            assertEquals(false, cm.deleteRecipe(2));
            assertEquals(false, cm.deleteRecipe(3));
            assertEquals(false, cm.deleteRecipe(4));
            
            //Kein Integer?
                //Integer benötigt! (Typenbasiert)
            
            //Empty Recipe?
            
            

            } catch (Exception e) {
                fail("InventoryException should not be thrown");
            }
        }
        public void testDeleteRecipeException(){

        }
        
        public void testEditRecipe(){
            //SetUp
                cm = new CoffeeMaker();
                cm.addRecipe(r1);
                cm.addRecipe(r2);
            //
            
            //Recipe editieren zulaessig
            assertEquals(true, cm.editRecipe(1, r4));
            assertEquals(true, cm.editRecipe(2, r3));
            
            //Index OutOfBounds
            assertEquals(true, cm.editRecipe(Integer.MIN_VALUE, r4));
            assertEquals(true, cm.editRecipe(0, r4));
            assertEquals(true, cm.editRecipe(Integer.MAX_VALUE, r4));
            
            //schon vorhanden?
            assertEquals(false, cm.editRecipe(1, r4));
            assertEquals(false, cm.editRecipe(2, r3));
            
            //Alles Integer?
                //Exception werden in Recipe geworfen
            
            //Alles Positiv?
                //Exception werden in Recipe geworfen
          

        }
        public void testEditRecipeException(){

        }
        
        
	public void testAddInventory() {
            //Planung
                //The user will be prompted for the units of each of the four ingredients they wish to add to the inventory.
            
            //Spezifikation
                //Alles Integer? Wenn nein, Fehler
                //Alles Positiv? Wenn nein, Fehler
                //Wenn Buchstabe ==> Fehler

            try {
			cm.addInventory("4","7","0","9");
		} catch (InventoryException e) {
			fail("InventoryException should not be thrown");
		}
	}

	public void testAddInventoryException() {

            try {
			cm.addInventory("4", "-1", "asdf", "3");
			fail("InventoryException should be thrown");
		} catch (InventoryException e) {
			//success if thrown
		}
	}
        
        public void testCheckInventory() {
            //Planung
                //The user will be shown a listing of the inventory of ingredients in the CoffeeMaker 
            //Spezifikation
                //listing of the inventory of ingredients

	}

	public void testCheckInventoryException() {

	}
	
	public void testMakeCoffee() {
            //Planung
                //The user will select the beverage they wish to purchase. The user will deposit money to pay for the beverage
                    //enough ingredients in the inventory to make the selected drink?
                    //enough money was deposited?, the beverage will be dispensed, and any extra change will be returned.
            //Spezifikation
                //If there is not enough inventory to make the beverage, a message will be displayed, the user's money will be returned, and the user will be returned to the main menu.
                //If the user does not enter enough money, their money will be returned, and the user will be returned to the main menu. 

		cm.addRecipe(r1);
		assertEquals(25, cm.makeCoffee(0, 75));
	}
        public void testMakeCoffeeException(){

        }

}
