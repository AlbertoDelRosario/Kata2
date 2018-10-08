/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata2;

import java.util.Map;


public class Kata2 {

    public static void main(String[] args) {
        
        int[] data = {1,2,3,4,5,4,5,6,3,24,32,24,43,55,0,98,0,54,3,44,54,0};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        } 
    }

}
