package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import junit.framework.TestCase;

/**
 * 
 * @author Sarah Heckman
 *
 * Unit tests for CoffeeMaker class.
 */
public class CoffeeMakerTest extends TestCase {
	
	private CoffeeMaker cm;
	private CoffeeMaker cm2;
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
               
                
                cm2 = new CoffeeMaker();
                cm2.addRecipe(r1);
                cm2.addRecipe(r2);
                
		super.setUp();
	}


/*	public void testAddRecipe(){
            try {
            //Alles Integer? 
                //Recipe laesst sich nicht erstellen
            assertEquals(false, cm.addRecipe(null));
            
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
            
            //zu viel (laut Spezifikation maximal 3 Rezepte)
            assertEquals(false,cm.addRecipe(r4));
                
		} catch (Exception e) {
			fail("RecipeException should not be thrown");
		}
        }
  */      
        public void testAddRecipe1(){
            try {     
                    cm.addRecipe(r1);
		} catch (Exception e) {
                    fail("RecipeException should not be thrown");
		}
        }
        
        public void testAddRecipe2(){
            try {
                    cm.addRecipe(r2);
		} catch (Exception e) {
                    fail("RecipeException should not be thrown");
		}
        }
        
        public void testAddRecipe3(){
            try {
                    cm.addRecipe(r3);
		} catch (Exception e) {
                    fail("RecipeException should not be thrown");
		}
        }
        
        public void testAddRecipeException1(){
            try{
                cm.addRecipe(null);
                fail("Exception should be thrown");
            }
            catch(Exception e){
            }
        }
        
        public void testAddRecipeException2(){
            try{
            cm.addRecipe(r1);
            fail("Exception should be thrown");
            }
            catch(Exception e){
            }
        }
        
        public void testAddRecipeException3(){
            try{
                cm.addRecipe(r2);
                fail("Exception should be thrown");
            }
            catch(Exception e){
            }
        }
        
        public void testAddRecipeException4(){
            try{
                cm.addRecipe(r3);
                fail("Exception should be thrown");
            }
            catch(Exception e){
            }
        }
        
        public void testAddRecipeException5(){
            try{
                cm.addRecipe(r4);
                fail("Exception should be thrown");
            }
            catch(Exception e){
            }
        }
        
 /*       public void testDeleteRecipe(){
            try{
            //Recipe loeschen zulaessig
            assertEquals(true, cm.deleteRecipe(1));
            assertEquals(true, cm.deleteRecipe(2));
            assertEquals(true, cm.deleteRecipe(3));
            
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
                fail("RecipeException should not be thrown");
            }
        }
     */   
        public void testDeleteRecipe1(){
            try{
                
                 cm.deleteRecipe(1);
            } catch (Exception e) {
                fail("RecipeException should not be thrown");
            }
        }
        
        public void testDeleteRecipe2(){
            try{
                 cm.deleteRecipe(2);
            } catch (Exception e) {
                fail("RecipeException should not be thrown");
            }
        }
        
        public void testDeleteRecipe3(){
            try{
                 cm.deleteRecipe(3);
            } catch (Exception e) {
                fail("RecipeException should not be thrown");
            }
        }
               
        public void testDeleteRecipeException1(){
            try{
                    cm.deleteRecipe(Integer.MIN_VALUE);
                fail("Exception should be thrown");
            }
            catch(Exception e){
            }
        }
        
        public void testDeleteRecipeException2(){
            try{
                cm.deleteRecipe(0);
                fail("Exception should be thrown");
            }
            catch(Exception e){
            }
        }
        
        public void testDeleteRecipeException3(){
            try{
                cm.deleteRecipe(Integer.MAX_VALUE);
                fail("Exception should be thrown");
            }
            catch(Exception e){
            }
        }
        
        public void testDeleteRecipeException4(){
            try{
                cm.deleteRecipe(1);
                fail("Exception should be thrown");
            }
            catch(Exception e){
            }
        }
        
        public void testDeleteRecipeException5(){
            try{
                cm.deleteRecipe(2);
                fail("Exception should be thrown");
            }
            catch(Exception e){
            }
        }
        
        public void testDeleteRecipeException6(){
            try{
                cm.deleteRecipe(3);
                fail("Exception should be thrown");
            }
            catch(Exception e){
            }
        }
        
        public void testDeleteRecipeException7(){
            try{
                cm.deleteRecipe(4);
                fail("Exception should be thrown");
            }
            catch(Exception e){
            }
        }
        
        public void testDeleteRecipeException8(){
            try{
                cm.deleteRecipe(4);
                fail("Exception should be thrown");
            }
            catch(Exception e){
            }
        }
 /*       public void testEditRecipe(){
            try{
            //SetUp
                
            //
            
            //Recipe editieren zulaessig
            assertEquals(true, cm2.editRecipe(1, r4));
            assertEquals(true, cm2.editRecipe(2, r3));
            
            //Index OutOfBounds
            assertEquals(false, cm2.editRecipe(Integer.MIN_VALUE, r4));
            assertEquals(false, cm2.editRecipe(0, r4));
            assertEquals(false, cm2.editRecipe(Integer.MAX_VALUE, r4));
            
            //schon vorhanden?
            assertEquals(false, cm2.editRecipe(1, r4));
            assertEquals(false, cm2.editRecipe(2, r3));
            
            //Alles Integer?
                //Exception werden in Recipe geworfen
            
            //Alles Positiv?
                //Exception werden in Recipe geworfen
            }
            catch(Exception e){
                fail("Exception should not be thrown");
            }
        }
    */    
        public void testEditRecipe1(){
            try{
                cm2.editRecipe(1, r4);
            }
            catch(Exception e){
                fail("Exception should not be thrown");
            }
        }
        
        public void testEditRecipe2(){
            try{
                cm2.editRecipe(2, r3);
            }
            catch(Exception e){
                fail("Exception should not be thrown");
            }
        }
        
        public void testEditRecipeException1(){
            try{
                cm2.editRecipe(Integer.MIN_VALUE, r4);
                fail("Exception should be thrown");
            }
            catch(Exception e){
            }
        }
        
        public void testEditRecipeException2(){
            try{
                cm2.editRecipe(0, r4);
                fail("Exception should be thrown");
            }
            catch(Exception e){
            }
        }
        
        public void testEditRecipeException3(){
            try{
                cm2.editRecipe(Integer.MAX_VALUE, r4);
                fail("Exception should be thrown");
            }
            catch(Exception e){
            }
        }
        
        public void testEditRecipeException4(){
            try{
                cm2.editRecipe(1, r4);
                fail("Exception should be thrown");
            }
            catch(Exception e){
            }
        }

        public void testEditRecipeException5(){
            try{
                cm2.editRecipe(2, r3);
                fail("Exception should be thrown");
            }
            catch(Exception e){
            }
        }

    
        public void testAddInventory1() {
            try {
			cm.addInventory("1","2","3","100");
		} catch (InventoryException e) {
			fail("InventoryException should not be thrown");
		}
	}

	public void testAddInventory2() {
            try {
			cm.addInventory("0","1","2","100");
		} catch (InventoryException e) {
			fail("InventoryException should not be thrown");
		}
	}

        public void testAddInventory3() {
            try {
			cm.addInventory("1","0","2","100");
		} catch (InventoryException e) {
			fail("InventoryException should not be thrown");
		}
	}

        public void testAddInventory4() {
            try {
			cm.addInventory("1","2","0","100");
		} catch (InventoryException e) {
			fail("InventoryException should not be thrown");
		}
	}

       public void testAddInventory5() {
            try {
			cm.addInventory("1","2","100","0");
		} catch (InventoryException e) {
			fail("InventoryException should not be thrown");
		}
	}

	public void testAddInventoryException1() {
            try {
                cm.addInventory("-1", "1", "1", "1");
            	fail("InventoryException should be thrown");
            }
            catch (InventoryException e) {
                //success if thrown
            }
	}

        public void testAddInventoryException2() {
            try {
                cm.addInventory("1", "-1", "1", "1");
            	fail("InventoryException should be thrown");
            }
            catch (InventoryException e) {
                //success if thrown
            }
	}

        public void testAddInventoryException3() {
            try {
                cm.addInventory("1", "1", "-1", "1");
            	fail("InventoryException should be thrown");
            }
            catch (InventoryException e) {
                //success if thrown
            }
	}

        public void testAddInventoryException4() {
            try {
                cm.addInventory("1", "1", "1", "-1");
            	fail("InventoryException should be thrown");
            }
            catch (InventoryException e) {
                //success if thrown
            }
	}

        public void testAddInventoryException5() {
            try {
                cm.addInventory("a", "1", "1", "1");
            	fail("InventoryException should be thrown");
            }
            catch (InventoryException e) {
                //success if thrown
            }
	}

        public void testAddInventoryException6() {
            try {
                cm.addInventory("1", "a", "1", "1");
            	fail("InventoryException should be thrown");
            }
            catch (InventoryException e) {
                //success if thrown
            }
	}

        public void testAddInventoryException7() {
            try {
                cm.addInventory("1", "1", "a", "1");
            	fail("InventoryException should be thrown");
            }
            catch (InventoryException e) {
                //success if thrown
            }
	}

        public void testAddInventoryException8() {
            try {
                cm.addInventory("1", "1", "1", "a");
            	fail("InventoryException should be thrown");
            }
            catch (InventoryException e) {
                //success if thrown
            }
	}

         public void testAddInventoryException9() {
            try {
                cm.addInventory("0.1", "1", "1", "1");
            	fail("InventoryException should be thrown");
            }
            catch (InventoryException e) {
                //success if thrown
            }
	}

        public void testAddInventoryException10() {
            try {
                cm.addInventory("1", "0.1", "1", "1");
            	fail("InventoryException should be thrown");
            }
            catch (InventoryException e) {
                //success if thrown
            }
	}

       public void testAddInventoryException11() {
            try {
                cm.addInventory("1", "1", "0.1", "1");
            	fail("InventoryException should be thrown");
            }
            catch (InventoryException e) {
                //success if thrown
            }
	}

        public void testAddInventoryException12() {
            try {
                cm.addInventory("1", "1", "1", "0.1");
            	fail("InventoryException should be thrown");
            }
            catch (InventoryException e) {
                //success if thrown
            }
	}

         public void testAddInventoryState1() {
            try {
                cm.addInventory("1", "1", "0", "1");

                StringBuilder inventory = new StringBuilder();
                inventory.append("Coffee: ");
                inventory.append(16);
                inventory.append("\n");
                inventory.append("Milk: ");
                inventory.append(16);
                inventory.append("\n");
                inventory.append("Sugar: ");
                inventory.append(15);
                inventory.append("\n");
                inventory.append("Chocolate: ");
                inventory.append(16);
                inventory.append("\n");
                assertEquals(cm.checkInventory(), inventory.toString());
            }
            catch (InventoryException e) {
                fail("Error in TestCase AddInventory");
            }
	}

         public void testAddInventoryState2() {
            try {
                cm.addInventory("1", "1", "a", "1");
                fail("Error in TestCase AddInventory");
            }
            catch (InventoryException e) {
                StringBuilder inventory = new StringBuilder();
                inventory.append("Coffee: ");
                inventory.append(15);
                inventory.append("\n");
                inventory.append("Milk: ");
                inventory.append(15);
                inventory.append("\n");
                inventory.append("Sugar: ");
                inventory.append(15);
                inventory.append("\n");
                inventory.append("Chocolate: ");
                inventory.append(15);
                inventory.append("\n");
                assertEquals(cm.checkInventory(), inventory.toString());
            }
	}

        public void testCheckInventory1() {

            StringBuilder inventory = new StringBuilder();
            inventory.append("Coffee: ");
            inventory.append(15);
            inventory.append("\n");
            inventory.append("Milk: ");
            inventory.append(15);
            inventory.append("\n");
            inventory.append("Sugar: ");
            inventory.append(15);
            inventory.append("\n");
            inventory.append("Chocolate: ");
            inventory.append(15);
            inventory.append("\n");
            assertEquals(cm.checkInventory(), inventory.toString());
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
