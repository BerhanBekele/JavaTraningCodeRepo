/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package et.com.inhousetraining.L12.models;

/**
 *
 * @author MOD
 */
public abstract  class  InventoryComponent {
    protected String type=this.getClass().getSimpleName();
    public String getType(){
    return this.type;
    }
    public abstract  void display();           
            
}
