/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletestthree;

/**
 *
 * @author 2017486
 */
public class SimpleClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SimpleClient client = new SimpleClient();
       client.executeTest();
    }
    
    public void executeTest(){
        SimpleTemperatureRecorderServer  server = new SimpleTemperatureRecorderServer ();
        if(server.isServerConnected()){
            System.out.println("[Client]- The server is connected. The test can proceed");
            
        try{
            server.addTemperature(10,"celsius");
            System.out.println("[Cleint] - The minimum recorded temperature is " +server.getClodestTempreture()+ " Celsius");
            System.out.println("[Cleint] - The Maximum recorded temperature is " +server.getHottestTemperature()+" Celsius");
            System.out.println("[Cleint] - The Average recorded temperature is " +server.getAverageTemperature()+" Celsius");
            System.out.println("[Cleint] - The Number of samples so far  " +server.getNumberOfSamples());
            
          
            server.addTemperature(267,"kelvin");
              System.out.println("[Cleint] - The minimum recorded temperature is " +server.getClodestTempreture()+ " Celsius");
            System.out.println("[Cleint] - The Maximum recorded temperature is " +server.getHottestTemperature()+" Celsius");
            System.out.println("[Cleint] - The Average recorded temperature is " +server.getAverageTemperature()+" Celsius");
              System.out.println("[Cleint] - The Number of samples so far  " +server.getNumberOfSamples());
              
            server.addTemperature(12,"celsius");
              System.out.println("[Cleint] - The minimum recorded temperature is " +server.getClodestTempreture()+ " Celsius");
            System.out.println("[Cleint] - The Maximum recorded temperature is " +server.getHottestTemperature()+" Celsius");
            System.out.println("[Cleint] - The Average recorded temperature is " +server.getAverageTemperature()+" Celsius");
              System.out.println("[Cleint] - The Number of samples so far  " +server.getNumberOfSamples());
              
            server.addTemperature(-0.1,"celsius");
             System.out.println("[Cleint] - The minimum recorded temperature is " +server.getClodestTempreture()+ " Celsius");
            System.out.println("[Cleint] - The Maximum recorded temperature is " +server.getHottestTemperature()+" Celsius");
            System.out.println("[Cleint] - The Average recorded temperature is " +server.getAverageTemperature()+" Celsius");
              System.out.println("[Cleint] - The Number of samples so far  " +server.getNumberOfSamples());
              
             
            server.addTemperature(-18,"celsius");
              System.out.println("[Cleint] - The minimum recorded temperature is " +server.getClodestTempreture()+ "Celsius");
            System.out.println("[Cleint] - The Maximum recorded temperature is " +server.getHottestTemperature()+" Celsius");
            System.out.println("[Cleint] - The Average recorded temperature is " +server.getAverageTemperature()+"Celsius");
              System.out.println("[Cleint] - The Number of samples so far  " +server.getNumberOfSamples());
              
            server.addTemperature(18.0,"celsius");
             System.out.println("[Cleint] - The minimum recorded temperature is " +server.getClodestTempreture()+ "Celsius");
            System.out.println("[Cleint] - The Maximum recorded temperature is " +server.getHottestTemperature()+"Celsius");
            System.out.println("[Cleint] - The Average recorded temperature is " +server.getAverageTemperature()+"Celsius");
              System.out.println("[Cleint] - The Number of samples so far  " +server.getNumberOfSamples());
              
        }catch(IndexOutOfBoundsException e){
            System.out.println("Please add Temperatures......");
        
        }
        }else{
            System.out.println("[Client]- The server is NOT connected. terminating test");
        }
    }
    
}
