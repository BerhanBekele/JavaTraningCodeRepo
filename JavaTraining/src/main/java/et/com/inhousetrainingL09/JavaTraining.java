/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package et.com.inhousetrainingL09;

import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

/**
 *
 * @author MOD
 */
public class JavaTraining {

    public static void main(String[] args) {
        List<String> names=new ArrayList<String>();
        names.add("Berhan");
        names.add("Zewdineh");
        names.add(1,"Bekele");
        
         List<String> newNames=new ArrayList<String>();
        newNames.add("Feleke");
        newNames.add("Zewdineh");
        newNames.add(1,"Bekele");
        names.addAll(newNames);
        for (String name:names){
            System.err.println(name);
        }
            
    }
}
