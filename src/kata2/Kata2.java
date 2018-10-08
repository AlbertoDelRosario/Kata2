/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata2;

import java.util.Map;


public class Kata2 {

    public static void main(String[] args) {
        
        String[] data = {"uno","dos","tres","cuatro","cinco","cuatro","cinco","seis","tres","veinticuatro","treinta_y_cuatro","veinticuatro","cuarenta_y_tres","cincuenta_y_cinco","cero","noventa_y_ocho","cero","cincuenta_y_cuatro","tres","cuarenta_y_cuatro","cincuenta_y_cuatro","cero"};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        } 
    }

}
