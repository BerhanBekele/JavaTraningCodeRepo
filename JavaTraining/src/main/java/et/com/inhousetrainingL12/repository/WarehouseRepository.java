/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package et.com.inhousetrainingL12.repository;

import et.com.inhousetrainingL12.models.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MOD
 */
public class WarehouseRepository {
    private static List <Warehouse> warehouses = new ArrayList<>();
    
    public void addWarehouse(Warehouse warehouse){
        warehouses.add(warehouse);
    }
    
      public void deleteWarehouse(int warehouseId){
//          Warehouse warehousesToDelete=this.getWarehouseById(warehouseId);
    //          warehouses.remove(warehousesToDelete);
            for (int i=0; i<warehouses.size();i++){
                if(warehouseId==warehouses.get(i).getWarehouseID()){
                    warehouses.remove(i);
                    break;
                }
           }
    }
    public Warehouse getWarehouseById(int warehouseId){
    for(Warehouse warehouse:warehouses){
    if(warehouse.getWarehouseID()==warehouseId){
    return warehouse;
            }
         }
    return null;
    }
    public void updateWarehouse(Warehouse updateWarehouse){
    for (int i=0; i<warehouses.size();i++){
                if(warehouses.get(i).getWarehouseID()==updateWarehouse.getWarehouseID()){
                    warehouses.set(i,updateWarehouse);
                    break;
                }
           }
    }
    public List<Warehouse> getAllWarehouses(){
    return warehouses;
    }
}
   

