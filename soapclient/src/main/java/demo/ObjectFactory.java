
package demo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the demo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SomeMethod_QNAME = new QName("http://demo/", "someMethod");
    private final static QName _SomeMethodResponse_QNAME = new QName("http://demo/", "someMethodResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: demo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SomeMethod }
     * 
     */
    public SomeMethod createSomeMethod() {
        return new SomeMethod();
    }

    /**
     * Create an instance of {@link SomeMethodResponse }
     * 
     */
    public SomeMethodResponse createSomeMethodResponse() {
        return new SomeMethodResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomeMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo/", name = "someMethod")
    public JAXBElement<SomeMethod> createSomeMethod(SomeMethod value) {
        return new JAXBElement<SomeMethod>(_SomeMethod_QNAME, SomeMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomeMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo/", name = "someMethodResponse")
    public JAXBElement<SomeMethodResponse> createSomeMethodResponse(SomeMethodResponse value) {
        return new JAXBElement<SomeMethodResponse>(_SomeMethodResponse_QNAME, SomeMethodResponse.class, null, value);
    }

}
