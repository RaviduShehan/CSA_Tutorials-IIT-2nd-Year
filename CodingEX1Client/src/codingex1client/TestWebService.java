
package codingex1client;

import codingex1client.*;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TestWebService", targetNamespace = "http://Server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TestWebService {


    /**
     * 
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "testConnection", targetNamespace = "http://Server/", className = "codingex1client.TestConnection")
    @ResponseWrapper(localName = "testConnectionResponse", targetNamespace = "http://Server/", className = "codingex1client.TestConnectionResponse")
    @Action(input = "http://Server/TestWebService/testConnectionRequest", output = "http://Server/TestWebService/testConnectionResponse")
    public Boolean testConnection();

    /**
     * 
     * @param message
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sendMessage", targetNamespace = "http://Server/", className = "codingex1client.SendMessage")
    @ResponseWrapper(localName = "sendMessageResponse", targetNamespace = "http://Server/", className = "codingex1client.SendMessageResponse")
    @Action(input = "http://Server/TestWebService/sendMessageRequest", output = "http://Server/TestWebService/sendMessageResponse")
    public String sendMessage(
        @WebParam(name = "message", targetNamespace = "")
        String message);

}
