/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package et.com.inhousetraining.L12.repository;

import et.com.inhousetraining.L12.models.*;
import java.util.ArrayList;

/**
 *
 * @author MOD
 */
public class Demo {
    public static void main(String[] args) {
        GenericRepo<Item> itemRepo=new GenericRepo<Item>(new ArrayList<Item>());
            itemRepo.add(new Item(101,"Computer","Lenovo Disktop"));
            itemRepo.add(new Item(102,"Laptop","Lenovo Laptop"));
            for (Item i: itemRepo.getAll()){
                i.display();           
            }
        
        GenericRepo<Section> sectionRepo=new GenericRepo<Section>(new ArrayList<Section>());
            sectionRepo.add(new Section(1,"Aisle A",1,4000));
            sectionRepo.add(new Section(2,"Aisle B",2,+000));
            for (Section s: sectionRepo.getAll()){
                s.display();           
            }
    }
}
