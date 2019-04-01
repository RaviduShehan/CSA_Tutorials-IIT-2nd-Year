
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author HP
 */
public class SimpleClient {
    
    SimpleCalculatorServer server = new SimpleCalculatorServer();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SimpleCalculatorServerException {
       
        SimpleClient simpleClient = new SimpleClient();
        simpleClient.executeTest();
    }
    public void executeTest() throws SimpleCalculatorServerException{
        System.out.println("[Client] - Testing if the Server is connected..");
        
        if(server.isServerConnected()){
            System.out.println("[Client] - The Client is connected , the test can proceed..");
            
            int a = 2;
            int b = 5;
            
            System.out.println(" [Client] - Asking the server wjat is the sum of " + a+ " and " +b + " ....");
            
            int sum = server.addIntegerNumbers(a, b);
            
            System.out.println(" [Client] - The server has replied that the sum of " +a + " and "+ b +" is " + sum);
            
            if(sum == a+b){
                System.out.println(" [Client] - The result return from the server is correct..");
                        
            }else{
                System.out.println(" [Client] - The result return from the server is NOT Correct..");
            }
                
           a = 4;
           b = 2;
            System.out.println("[CLIENT] - Asking the server what is the ratio of " + a + " and " + b + "...");
            int div = server.divideIntegerNumbers(a, b);
         
            System.out.println("[CLIENT] - The server has replied that the ratio of " + a + " and " + b + " is " + div);
            if(div == a/b){
                 System.out.println("[CLIENT] - the result return from the server is correct.");
            }else{
                 System.out.println("[CLIENT] - the result return from the server is NOT correct.");
          
            
        }
            System.out.println("[Client] - The client is NOT Connected, the test has failed...");
        }
    }
}

