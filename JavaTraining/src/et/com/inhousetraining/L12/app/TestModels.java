/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package et.com.inhousetraining.L12.app;

import et.com.inhousetraining.L12.models.Item;

/**
 *
 * @author MOD
 */
public class TestModels {
    public static void main(String[] args) {
        Item itm1=new Item();
        itm1.setItemID(101);
        itm1.setName("Computer");
        itm1.setDescription("Lenovo Computer");
         Item itm2=new Item(102,"Laptop","Lenovo Laptop");
        desplayItems(itm1);
        desplayItems(itm2);
    }
    
    public static void desplayItems(Item itm){
         System.out.println("----desplay Items----");
        System.out.println("Item Id: "+ itm.getItemID());
        System.out.println("Item Name: "+ itm.getName());
        System.out.println("Item Name: "+ itm.getDescription());
    }
    
}
