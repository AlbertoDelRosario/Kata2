/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata2;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author ALberto del Rosario Déniz
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] data = {1,2,3,4,5,4,5,6,3,24,32,24,43,55,0,98,0,54,3,44,54,0};
        Map <Integer,Integer> histogram  = new HashMap <>();
        //histogram.put(data[0],1);
        for (int i = 0; i < data.length; i++) {
             if (histogram.containsKey(data[i])){
                 histogram.put(data[i], histogram.get(data[i])+1);
             } else {
                 histogram.put(data[i], 1);
            }
            
        }
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        } 
    }

}
