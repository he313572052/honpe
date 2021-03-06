
package com.honpe.erp;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PuPriceQuery", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://183.11.227.203:8066/PuPriceQuery.asmx?wsdl")
public class PuPriceQuery
    extends Service
{

    private final static URL PUPRICEQUERY_WSDL_LOCATION;
    private final static WebServiceException PUPRICEQUERY_EXCEPTION;
    private final static QName PUPRICEQUERY_QNAME = new QName("http://tempuri.org/", "PuPriceQuery");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://183.11.227.203:8066/PuPriceQuery.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PUPRICEQUERY_WSDL_LOCATION = url;
        PUPRICEQUERY_EXCEPTION = e;
    }

    public PuPriceQuery() {
        super(__getWsdlLocation(), PUPRICEQUERY_QNAME);
    }

    public PuPriceQuery(WebServiceFeature... features) {
        super(__getWsdlLocation(), PUPRICEQUERY_QNAME, features);
    }

    public PuPriceQuery(URL wsdlLocation) {
        super(wsdlLocation, PUPRICEQUERY_QNAME);
    }

    public PuPriceQuery(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PUPRICEQUERY_QNAME, features);
    }

    public PuPriceQuery(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PuPriceQuery(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PuPriceQuerySoap
     */
    @WebEndpoint(name = "PuPriceQuerySoap")
    public PuPriceQuerySoap getPuPriceQuerySoap() {
        return super.getPort(new QName("http://tempuri.org/", "PuPriceQuerySoap"), PuPriceQuerySoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PuPriceQuerySoap
     */
    @WebEndpoint(name = "PuPriceQuerySoap")
    public PuPriceQuerySoap getPuPriceQuerySoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "PuPriceQuerySoap"), PuPriceQuerySoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PUPRICEQUERY_EXCEPTION!= null) {
            throw PUPRICEQUERY_EXCEPTION;
        }
        return PUPRICEQUERY_WSDL_LOCATION;
    }

}
