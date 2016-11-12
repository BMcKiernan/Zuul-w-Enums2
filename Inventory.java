import java.util.ArrayList;
/**
 * Write a description of class Inventory here.
 * 
 * @author Brian McKiernan 
 * @version 11/11/2016
 */
public class Inventory
{
    ArrayList<Item> inventory;
    int items=0;
    
    /**
     * No-Arg Constructor that intializes a new ArrayList for an Inventory.
     */
    public Inventory(){
        inventory = new ArrayList<Item>();
    }
    
    /**
     * addItem method adds an item to the inventory array;
     */
    public void addItem(Item itemToAdd){
        inventory.add(itemToAdd);
        items++;
    }
    
    /**
     * Method contains just reuses ArrayList contains which returns boolean.
     */
    public boolean contains(Item itemContained)
    {
        return inventory.contains(itemContained);
    }
    
    /**
     * removeItem method removes an item from the inventory array.
     */
    public void removeItem(Item itemToRemove){
        if(inventory.contains(itemToRemove)){
            inventory.remove(itemToRemove);
            items--;
       }
       else{
           System.out.println("You can't remove an item from your inventory that you don't have");
       }
    }
    
    /**
     * Method that returns the index of an Item.
     */
    public int getItemIndex(Item itemToIndex){
        int index = inventory.indexOf(itemToIndex);
        return index;
    }
    
    /**
     * Method that returns the Item found with an Index.
     */
    public Item getItem(int indexForItem){
        Item itemToReturn = inventory.get(indexForItem);
        return itemToReturn; 
    }
    
    /**
     * This method returns the size of the array which has been tracked by an incrementor.
     */
    public int size()
    {
        return items;
    }
    
    /**
     * Gets an item from the inventory array based on a string.
     * IF THE ITEM IS NOT IN THE INVENTORY THEN THIS METHOD RETURNS NULL!!!!!! <--incase of null pointer excep.
     */
    public Item getItemFromString(String itemName)
    {
        Item itemToFind = null;
        for(int i = 0; i<inventory.size(); i++)
        {
            itemToFind = inventory.get(i);
            if(itemName.equalsIgnoreCase(itemToFind.getName()))
            {
                inventory.remove(itemToFind);
                int remainder = (inventory.size() - i);
                i += remainder;
            }
            else{
                itemToFind = null;
            }
        }
        return itemToFind;
    }
}
