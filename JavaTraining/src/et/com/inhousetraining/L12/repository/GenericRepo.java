/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package et.com.inhousetraining.L12.repository;

import java.util.List;

/**
 *
 * @author MOD
 */
public class GenericRepo <T>{
    public  List<T> generics;
         public GenericRepo(List <T> generics){
             this.generics=generics;
    }
         public void add(T t){
         generics.add(t);
         }
         public List<T> getAll(){
         return generics;
         }
}
