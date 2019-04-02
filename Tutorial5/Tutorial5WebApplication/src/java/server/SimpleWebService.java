/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceRef;
import tutorial5client.SimpleWebService_Service;

/**
 *
 * @author HP
 */
@WebService(serviceName = "SimpleWebService")
public class SimpleWebService {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Tutorial5WebApplication/SimpleWebService.wsdl")
    private SimpleWebService_Service service;
    private String name;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) throws Exception{
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd: HH.mm.ss").format(new Date());
        return "["+timeStamp+"] - "+this.name+": Connection from " + txt + " succeeded ! --- "+InetAddress.getLocalHost();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "isConnected")
    public Boolean isConnected() {
        
        System.out.println("[Server] - Testing if Server is connected..");
        return true;
    }

    private String hello_1(java.lang.String name) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        tutorial5client.SimpleWebService port = service.getSimpleWebServicePort();
        return port.hello(name);
    }
}
