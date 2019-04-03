/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial;

import java.util.logging.Level;
import java.util.logging.Logger;
import server.Exception_Exception;
import server.Person;


public class MyClient {

   
    public static void main(String[] args) {
        MyClient client = new MyClient();
        client.executeTest();
        
        System.out.println("[Client] - Find the Shortest between Short and Long");
        
        if(client.findShortestBetween("Short","long").equals("long")){
              System.out.println("[Client] - findShortestBetween(), Correct Answer..");
        }else{
               System.out.println("[Client] - findShortestBetween(), Wrong Answer..");
        }
        
        System.out.println("[Client] - Adding Strings....");
        client.addString("One");
        client.addString("Three");
        client.addString("Four");
        client.addString("Five");
        
        System.out.println("[Client] - Adding Finished....");
        
        System.out.println("[Client] -finding the shortest among the added Strings....");
        if(client.findShortestAmongStrings().equals("One")){
              System.out.println("[Client] - findShortestAmongStrings(), Correct Answer..");
        }else{
             System.out.println("[Client] - findShortestAmongStrings(), Wrong Answer..");
        }
        
        System.out.println("[Client] - Find the Shortest between Short and Long with exception..");
        
        try {
            if(client.findShortestBetweenWithException("Short", "long").equals("long")){
                System.out.println("[Client] - findShortestBetweenWithException(), Correct Answer..");
            }else{
                System.out.println("[Client] - findShortestBetweenWithException(), Wrong Answer..");
            }
        } catch (Exception_Exception ex) {
            System.out.println("[Client] - findShortestBetweenWithException(), ERROR!! You should not see this Exeception..");
        }
         try {
            if(client.findShortestBetweenWithException(null, "long").equals("long")){
                System.out.println("[Client] - findShortestBetweenWithException(), Correct Answer..");
            }else{
                System.out.println("[Client] - findShortestBetweenWithException(), Wrong Answer..");
            }
        } catch (Exception_Exception ex) {
            System.out.println("[Client] - findShortestBetweenWithException(), ERROR!! You should not see this Exeception..");
        }
         try {
            if(client.findShortestBetweenWithException("Short", null).equals("long")){
                System.out.println("[Client] - findShortestBetweenWithException(), Correct Answer..");
            }else{
                System.out.println("[Client] - findShortestBetweenWithException(), Wrong Answer..");
            }
        } catch (Exception_Exception ex) {
            System.out.println("[Client] - findShortestBetweenWithException(), ERROR!! You should be see this Exeception..");
        }
          try {
            if(client.findShortestBetweenWithException(null,null).equals("long")){
                System.out.println("[Client] - findShortestBetweenWithException(), Correct Answer..");
            }else{
                System.out.println("[Client] - findShortestBetweenWithException(), Wrong Answer..");
            }
        } catch (Exception_Exception ex) {
            System.out.println("[Client] - findShortestBetweenWithException(), ERROR!! You should be see this Exeception..");
        }
          
          Person john = new Person();
          john.setName("John");
          john.setSurname("Connor");
          addPerson(john);
          
          Person ali = new Person();
          ali.setName("Ali");
          ali.setSurname("Rehman");
          addPerson(ali);
          
          Person jasmine = new Person();
          jasmine.setName("Jasmine");
          jasmine.setSurname("Afjani");
          addPerson(jasmine);
          
          if(findPersonWithLongestName().getName().equals("Jasmine")){
               System.out.println("[Client] - findPersonWithLongestName(), Correct Answer..");
        }else{
               System.out.println("[Client] - findPersonWithLongestName(), Wrong Answer..");
        }
          
          
    }

    private void executeTest() {
        System.out.println("[Client] - Execute test, Test starting....");
        if(testConnection()==0){
            System.out.println("[Client] - Server is Connected.. Test can Proceed..");
            
        }else{
           System.out.println("[Client] - Server is NOT Connected.. Test failed.."); 
        }
        System.out.println("[Client] - Test Completed.....");
    }

    private static Integer testConnection() {
        server.TestWebService_Service service = new server.TestWebService_Service();
        server.TestWebService port = service.getTestWebServicePort();
        return port.testConnection();
    }

    private static String findShortestBetween(java.lang.String a, java.lang.String b) {
        server.TestWebService_Service service = new server.TestWebService_Service();
        server.TestWebService port = service.getTestWebServicePort();
        return port.findShortestBetween(a, b);
    }

    private static Integer addString(java.lang.String str) {
        server.TestWebService_Service service = new server.TestWebService_Service();
        server.TestWebService port = service.getTestWebServicePort();
        return port.addString(str);
    }

    private static String findShortestBetweenWithException(java.lang.String a, java.lang.String b) throws Exception_Exception {
        server.TestWebService_Service service = new server.TestWebService_Service();
        server.TestWebService port = service.getTestWebServicePort();
        return port.findShortestBetweenWithException(a, b);
    }

    private static Integer addPerson(server.Person person) {
        server.TestWebService_Service service = new server.TestWebService_Service();
        server.TestWebService port = service.getTestWebServicePort();
        return port.addPerson(person);
    }

    private static Person findPersonWithLongestName() {
        server.TestWebService_Service service = new server.TestWebService_Service();
        server.TestWebService port = service.getTestWebServicePort();
        return port.findPersonWithLongestName();
    }

    private static String findShortestAmongStrings() {
        server.TestWebService_Service service = new server.TestWebService_Service();
        server.TestWebService port = service.getTestWebServicePort();
        return port.findShortestAmongStrings();
    }
    
}