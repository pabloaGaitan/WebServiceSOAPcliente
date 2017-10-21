
package autenticacion;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ApiAuthService", targetNamespace = "http://api/", wsdlLocation = "http://localhost:8181/ws/javearticulos/auth?wsdl")
public class ApiAuthService
    extends Service
{

    private final static URL APIAUTHSERVICE_WSDL_LOCATION;
    private final static WebServiceException APIAUTHSERVICE_EXCEPTION;
    private final static QName APIAUTHSERVICE_QNAME = new QName("http://api/", "ApiAuthService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8181/ws/javearticulos/auth?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        APIAUTHSERVICE_WSDL_LOCATION = url;
        APIAUTHSERVICE_EXCEPTION = e;
    }

    public ApiAuthService() {
        super(__getWsdlLocation(), APIAUTHSERVICE_QNAME);
    }

    public ApiAuthService(WebServiceFeature... features) {
        super(__getWsdlLocation(), APIAUTHSERVICE_QNAME, features);
    }

    public ApiAuthService(URL wsdlLocation) {
        super(wsdlLocation, APIAUTHSERVICE_QNAME);
    }

    public ApiAuthService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, APIAUTHSERVICE_QNAME, features);
    }

    public ApiAuthService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ApiAuthService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ApiAuth
     */
    @WebEndpoint(name = "ApiAuthPort")
    public ApiAuth getApiAuthPort() {
        return super.getPort(new QName("http://api/", "ApiAuthPort"), ApiAuth.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ApiAuth
     */
    @WebEndpoint(name = "ApiAuthPort")
    public ApiAuth getApiAuthPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://api/", "ApiAuthPort"), ApiAuth.class, features);
    }

    private static URL __getWsdlLocation() {
        if (APIAUTHSERVICE_EXCEPTION!= null) {
            throw APIAUTHSERVICE_EXCEPTION;
        }
        return APIAUTHSERVICE_WSDL_LOCATION;
    }

}