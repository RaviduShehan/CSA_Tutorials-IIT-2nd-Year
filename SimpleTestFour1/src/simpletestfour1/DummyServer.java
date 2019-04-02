/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletestfour1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DummyServer {
    
     ArrayList<TemperatureSample> samples = new ArrayList<TemperatureSample>();
     String fileName = "Sample.ser";
     
     
     public DummyServer(){
         
         try {
             loadFromFile();
         } catch (IOException ex) {
             Logger.getLogger(DummyServer.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(DummyServer.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
    public boolean isConnected(){
        
        System.out.println("[Sever] - Testing if server is connected..");
        
        return true;
    }
    public void addSample(TemperatureSample s) throws IOException{
        
        System.out.println("[Server] - Adding " +s+ " to " +samples);
        samples.add(s);
        System.out.println("[Server] - Samples are "+samples);
        saveToFile();
        
    }
    private void saveToFile() throws FileNotFoundException, IOException{
        System.out.println("[Server] - Saving " +samples+ " to file " +fileName);
        
        FileOutputStream file = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(file);
        
        out.writeObject(samples);
        
        out.close();
        file.close();
        
        
        
    }
    
    private void loadFromFile() throws FileNotFoundException, IOException, ClassNotFoundException{
        System.out.println("[Server] - Loading files from "+fileName);
        
        FileInputStream file = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(file);
        
        samples = (ArrayList<TemperatureSample>)in.readObject();
        
        in.close();
        file.close();
    }
    
    public double getColdestTemperatureIn(String city) throws FileNotFoundException, IOException, ClassNotFoundException{
        System.out.println("[SERVER] - Loading sample from this " + fileName);
        //reading the object from a file
        FileInputStream file = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(file);
        
        //Method for deserialization of objects
        ArrayList<TemperatureSample> sampleTemp = (ArrayList<TemperatureSample>)in.readObject();
       // List<Double> value = new Arraylist<>();
       double min = sampleTemp.get(0).value; 
       for(int i=0; i<sampleTemp.size(); i++){
           if(sampleTemp.get(i).value<min){
               min = sampleTemp.get(i).value;
           }
       }

       System.out.println("[SERVER] - Minimum temperature recorded is " + min);
       
       return min;
       
    }
    
      public double getHottestTemperatureIn(String city) throws FileNotFoundException, IOException, ClassNotFoundException{
        System.out.println("[SERVER] - Loading sample from this " + fileName);
        //reading the object from a file
        FileInputStream file = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(file);
        
        //Method for deserialization of objects
        ArrayList<TemperatureSample> sampleTemp = (ArrayList<TemperatureSample>)in.readObject();
       // List<Double> value = new Arraylist<>();
       double max = sampleTemp.get(0).value; 
       for(int i=0; i<sampleTemp.size(); i++){
           if(sampleTemp.get(i).value>max){
               max = sampleTemp.get(i).value;
           }
       }
       
       System.out.println("[SERVER] - Hottest temperature recorded is " + max);

       return max;
       
    }
}
