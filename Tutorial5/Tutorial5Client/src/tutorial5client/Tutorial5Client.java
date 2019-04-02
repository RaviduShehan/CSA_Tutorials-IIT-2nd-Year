/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial5client;

/**
 *
 * @author HP
 */
public class Tutorial5Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Tutorial5Client client = new Tutorial5Client();
        client.executeTest();
    }
    
    public void executeTest(){
        System.out.println("[Client] - Executing Connection Test...");
        if(isConnected()){
            System.out.println("[Client] - Server is connected, Test can proceed..");
        }else{
            System.out.println("[Client] - Server is Not connected, Test has failed..");
        }
    }

    private static Boolean isConnected() {
        tutorial5client.SimpleWebService_Service service = new tutorial5client.SimpleWebService_Service();
        tutorial5client.SimpleWebService port = service.getSimpleWebServicePort();
        return port.isConnected();
    }
    
    
}
