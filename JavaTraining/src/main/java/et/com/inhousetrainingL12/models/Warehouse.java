/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package et.com.inhousetrainingL11.models;
import java.util.List;

/**
 *
 * @author MOD
 */



public class Warehouse {
private int warehouseID;
private String location;
private int currentQuantity;
private int maxCapacity;
private List<Section> sections; 

public int getwarehouseID(){
return warehouseID;
}
public void setwarehouseID(int warehouseID){
 this.warehouseID=warehouseID;
}
public String getLocation(){
return location;
}
public void setLocation(String  location){
 this.location=location;
}
public int getCurrentQuantityD(){
return currentQuantity;
}
public void setCurrentQuantity(int currentQuantity){
 this.currentQuantity=currentQuantity;
}
public int getmaxCapacity(){
return maxCapacity;
}
public void setMaxCapacity(int maxCapacity){
 this.maxCapacity=maxCapacity;
}

}
