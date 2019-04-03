
package tutorial;

import server.*;
import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Exception", targetNamespace = "http://server/")
public class Exception_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private server.Exception faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public Exception_Exception(String message, server.Exception faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public Exception_Exception(String message, server.Exception faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: server.Exception
     */
    public server.Exception getFaultInfo() {
        return faultInfo;
    }

}
