/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tute8aclient;

import Server.Exception_Exception;
import Server.Point2D;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class MockClient {

    
    public static void main(String[] args) {
       MockClient client = new MockClient();
       client.executeTest();
       System.out.println("[Client] - Find the minimum betwenn 3.0 and 5.0...");
       
    if(client.findMinimumBetween(3.0, 5.0)==3.0){
           System.out.println("[Client] - findMinimumBetween(), correct answer");
       }else{
         System.out.println("[CLIENT] - findMinimumBetween(), wrong answer");
    }
    System.out.println("[Client] - Adding sample....");
    client.addSample(1.0);
    client.addSample(3.4);
    client.addSample(5.0);
    client.addSample(7.12);
    
    System.out.println("[Client] - Find the minimum among sample..");
    
   if(client.findMinimumAmongSamples()==1.0){
       System.out.println("[Client] -findMinimumAmongSample(), Correct answer.. ");
        
    }else{
        System.out.println("[Client] -findMinimumAmongSample(), Wronganswer.. ");
   }
    
      System.out.println("[Client] - Find the minimum with exception..");
        try {
            if(client.findMinimumBetweenWithException(3.0,1.0)==1.0){
                System.out.println("[Client] -findMinimumBetweenWithException(), Correct answer.. ");
            }
        } catch (Exception_Exception ex) {
            System.out.println("[Client] -findMinimumBetweenWithException(),  ERROR!!! You should see this exception ");
        }
       try {
            if(client.findMinimumBetweenWithException(null,1.0)==1.0){
                System.out.println("[Client] -findMinimumBetweenWithException(), Correct answer.. ");
            }
        } catch (Exception_Exception ex) {
            System.out.println("[Client] -findMinimumBetweenWithException(),  ERROR!!! You should see this exception ");
        }
       try {
            if(client.findMinimumBetweenWithException(null,null)==1.0){
                System.out.println("[Client] -findMinimumBetweenWithException(), Correct answer.. ");
            }
        } catch (Exception_Exception ex) {
            System.out.println("[Client] -findMinimumBetweenWithException(),  ERROR!!! You should see this exception ");
        }
       
    }

    private void executeTest() {
        System.out.println("[Client] - Execute test,Test Starting..");
        if(testConnection().equals("OK")){
            System.out.println("[Server] - Server is connected..test starting ");
        }else{
            System.out.println("[Server] - Server is not connected, test has failed");
        }
        
       Point2D p= new Point2D();
       p.x= 5.4;
       p.y=4.5;
       
       if(findMinimumCoordinate(p)==4.5){
           System.out.println("[Client] -findMinimumCoordinate(), Correct answer.. ");
        
    }else{
        System.out.println("[Client] -findMinimumCoordinate, Wrong answer.. ");
   }
    
        System.out.println("[Client] - Test Completed... ");
    }

    private static String addSample(java.lang.Double sample) {
        Server.TestWebService_Service service = new Server.TestWebService_Service();
        Server.TestWebService port = service.getTestWebServicePort();
        return port.addSample(sample);
    }

    private static Double findMinimumAmongSamples() {
        Server.TestWebService_Service service = new Server.TestWebService_Service();
        Server.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumAmongSamples();
    }

    private static Double findMinimumBetween(java.lang.Double a, java.lang.Double b) {
        Server.TestWebService_Service service = new Server.TestWebService_Service();
        Server.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumBetween(a, b);
    }

    private static Double findMinimumBetweenWithException(java.lang.Double a, java.lang.Double parameter1) throws Exception_Exception {
        Server.TestWebService_Service service = new Server.TestWebService_Service();
        Server.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumBetweenWithException(a, parameter1);
    }

    private static Double findMinimumCoordinate(Server.Point2D point) {
        Server.TestWebService_Service service = new Server.TestWebService_Service();
        Server.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumCoordinate(point);
    }

    private static String testConnection() {
        Server.TestWebService_Service service = new Server.TestWebService_Service();
        Server.TestWebService port = service.getTestWebServicePort();
        return port.testConnection();
    }
    
}
