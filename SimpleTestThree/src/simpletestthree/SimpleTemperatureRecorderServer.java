/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletestthree;

import java.util.ArrayList;

/**
 *
 * @author 2017486
 */
public class SimpleTemperatureRecorderServer {
    
    
    ArrayList temperatures = new ArrayList();
    
    public boolean isServerConnected(){
        System.out.println("[Server] - Testing if the server is connected");
        return true;
    }
    
    public void addTemperature(double sample, String type){
        if(type=="celsius"){
               temperatures.add(sample);
            System.out.println("[Server] - " +temperatures);
        }else{
      
           if(type=="farenhite"){
               sample=0.55555*(sample-32);
                 temperatures.add(sample);
            System.out.println("[Server] - " +temperatures);
           }else{
               if(type=="kelvin"){
                   sample= sample-273.15;
                    temperatures.add(sample);
            System.out.println("[Server] - " +temperatures);
               }
            
           }
    }
    }
    
    public double getClodestTempreture(){
//        double min= 0;
//        
//        for(int index =0; index< temperatures.size(); index++)
//            if(min>(double)temperatures.get(index))
//                min = (double) temperatures.get(index);
//        return min;

  double min= (double) temperatures.get(0);
        
        for(int index =1; index< temperatures.size(); index++)
            if(min>(double)temperatures.get(index))
                min = (double) temperatures.get(index);

        return min;
    }
    
    public double getHottestTemperature(){
        double max = (double) temperatures.get(0);
        
         for(int index =1; index>temperatures.size(); index++)
            if(max<(double)temperatures.get(index))
                max= (double) temperatures.get(index);
        return max;
    }
    
    public double getAverageTemperature(){
        double sum = (double) temperatures.get(0);
        
        for(int index =1; index<temperatures.size(); index++)
            sum += index;
        
        double avg = sum/temperatures.size();
        return avg;
        
    }
    
    public int getNumberOfSamples(){
        int sample= (int) temperatures.size();
        return sample;
    }
}
