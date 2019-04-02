/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingex1client;

/**
 *
 * @author HP
 */
public class CodingEX1Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CodingEX1Client client = new CodingEX1Client();
       client.executeTest();
       
    }

     private void executeTest() {
        System.out.println("[CLIENT] - Test Starting...");
        if(testConnection("1406")!=null){
            System.out.println("[CLIENT] - Server has returned: "+sendMessage("Hello !"));
        }
        else{
            System.out.println("[CLIENT] - Server is not reachable");
        }
        System.out.println("[CLIENT] - Test completed");
    }

    private static String sendMessage(java.lang.String message) {
        codingex1client.TestWebService_Service service = new codingex1client.TestWebService_Service();
        codingex1client.TestWebService port = service.getTestWebServicePort();
        return port.sendMessage(message);
    }

    private static Boolean testConnection(java.lang.String arg) {
        codingex1client.TestWebService_Service service = new codingex1client.TestWebService_Service();
        codingex1client.TestWebService port = service.getTestWebServicePort();
        return port.testConnection();
    }

   
}
