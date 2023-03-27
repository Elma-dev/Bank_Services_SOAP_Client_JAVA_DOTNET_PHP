
package dev.elma.proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "BankServices", targetNamespace = "http://services.elma.dev/", wsdlLocation = "http://localhost:2001/?wsdl")
public class BankServices_Service
    extends Service
{

    private static final URL BANKSERVICES_WSDL_LOCATION;
    private static final WebServiceException BANKSERVICES_EXCEPTION;
    private static final QName BANKSERVICES_QNAME = new QName("http://services.elma.dev/", "BankServices");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:2001/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANKSERVICES_WSDL_LOCATION = url;
        BANKSERVICES_EXCEPTION = e;
    }

    public BankServices_Service() {
        super(__getWsdlLocation(), BANKSERVICES_QNAME);
    }

    public BankServices_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANKSERVICES_QNAME, features);
    }

    public BankServices_Service(URL wsdlLocation) {
        super(wsdlLocation, BANKSERVICES_QNAME);
    }

    public BankServices_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANKSERVICES_QNAME, features);
    }

    public BankServices_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankServices_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BankServices
     */
    @WebEndpoint(name = "BankServicesPort")
    public BankServices getBankServicesPort() {
        return super.getPort(new QName("http://services.elma.dev/", "BankServicesPort"), BankServices.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BankServices
     */
    @WebEndpoint(name = "BankServicesPort")
    public BankServices getBankServicesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.elma.dev/", "BankServicesPort"), BankServices.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANKSERVICES_EXCEPTION!= null) {
            throw BANKSERVICES_EXCEPTION;
        }
        return BANKSERVICES_WSDL_LOCATION;
    }

}
