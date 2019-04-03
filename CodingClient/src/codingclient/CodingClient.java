/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingclient;

/**
 *
 * @author HP
 */
public class CodingClient {

 private int id=16;
    public static void main(String[] args) {
        CodingClient client = new CodingClient();
        client.executeTest();
    }
    
    public void executeTest(){
        System.out.println("[Client]- Test starting...");
         if(isConnected(String.valueOf(id))!=null){
       System.out.println(isConnected(String.valueOf(id)));
            try{
                System.out.println("Connection to the server succeeded. Server replied: "+sendMessage(null));
            }
            catch(NullPointerException e){
                e.printStackTrace();
            }
        }
        else{
            System.out.println("[CLIENT] - Can't reach the server");
        }
        System.out.println("[CLIENT] - Test completed");
    }

    private static String isConnected(java.lang.String arg0) {
        Server.TestWebService_Service service = new Server.TestWebService_Service();
        Server.TestWebService port = service.getTestWebServicePort();
        return port.isConnected(arg0);
    }

    private static String sendMessage(java.lang.String message) {
        Server.TestWebService_Service service = new Server.TestWebService_Service();
        Server.TestWebService port = service.getTestWebServicePort();
        return port.sendMessage(message);
    }

    private static String hello(java.lang.String name) {
        Server.TestWebService_Service service = new Server.TestWebService_Service();
        Server.TestWebService port = service.getTestWebServicePort();
        return port.hello(name);
    }
    
}
