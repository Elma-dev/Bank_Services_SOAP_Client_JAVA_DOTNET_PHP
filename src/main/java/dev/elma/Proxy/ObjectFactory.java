
package dev.elma.Proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Proxy package. 
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

    private static final QName _AllComptes_QNAME = new QName("http://services.elma.dev/", "AllComptes");
    private static final QName _AllComptesResponse_QNAME = new QName("http://services.elma.dev/", "AllComptesResponse");
    private static final QName _ConversionToDH_QNAME = new QName("http://services.elma.dev/", "conversionToDH");
    private static final QName _ConversionToDHResponse_QNAME = new QName("http://services.elma.dev/", "conversionToDHResponse");
    private static final QName _CreateNewCompte_QNAME = new QName("http://services.elma.dev/", "createNewCompte");
    private static final QName _CreateNewCompteResponse_QNAME = new QName("http://services.elma.dev/", "createNewCompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AllComptes }
     * 
     * @return
     *     the new instance of {@link AllComptes }
     */
    public AllComptes createAllComptes() {
        return new AllComptes();
    }

    /**
     * Create an instance of {@link AllComptesResponse }
     * 
     * @return
     *     the new instance of {@link AllComptesResponse }
     */
    public AllComptesResponse createAllComptesResponse() {
        return new AllComptesResponse();
    }

    /**
     * Create an instance of {@link ConversionToDH }
     * 
     * @return
     *     the new instance of {@link ConversionToDH }
     */
    public ConversionToDH createConversionToDH() {
        return new ConversionToDH();
    }

    /**
     * Create an instance of {@link ConversionToDHResponse }
     * 
     * @return
     *     the new instance of {@link ConversionToDHResponse }
     */
    public ConversionToDHResponse createConversionToDHResponse() {
        return new ConversionToDHResponse();
    }

    /**
     * Create an instance of {@link CreateNewCompte }
     * 
     * @return
     *     the new instance of {@link CreateNewCompte }
     */
    public CreateNewCompte createCreateNewCompte() {
        return new CreateNewCompte();
    }

    /**
     * Create an instance of {@link CreateNewCompteResponse }
     * 
     * @return
     *     the new instance of {@link CreateNewCompteResponse }
     */
    public CreateNewCompteResponse createCreateNewCompteResponse() {
        return new CreateNewCompteResponse();
    }

    /**
     * Create an instance of {@link Client }
     * 
     * @return
     *     the new instance of {@link Client }
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllComptes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AllComptes }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.elma.dev/", name = "AllComptes")
    public JAXBElement<AllComptes> createAllComptes(AllComptes value) {
        return new JAXBElement<>(_AllComptes_QNAME, AllComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllComptesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AllComptesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.elma.dev/", name = "AllComptesResponse")
    public JAXBElement<AllComptesResponse> createAllComptesResponse(AllComptesResponse value) {
        return new JAXBElement<>(_AllComptesResponse_QNAME, AllComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionToDH }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionToDH }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.elma.dev/", name = "conversionToDH")
    public JAXBElement<ConversionToDH> createConversionToDH(ConversionToDH value) {
        return new JAXBElement<>(_ConversionToDH_QNAME, ConversionToDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionToDHResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionToDHResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.elma.dev/", name = "conversionToDHResponse")
    public JAXBElement<ConversionToDHResponse> createConversionToDHResponse(ConversionToDHResponse value) {
        return new JAXBElement<>(_ConversionToDHResponse_QNAME, ConversionToDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateNewCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.elma.dev/", name = "createNewCompte")
    public JAXBElement<CreateNewCompte> createCreateNewCompte(CreateNewCompte value) {
        return new JAXBElement<>(_CreateNewCompte_QNAME, CreateNewCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateNewCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.elma.dev/", name = "createNewCompteResponse")
    public JAXBElement<CreateNewCompteResponse> createCreateNewCompteResponse(CreateNewCompteResponse value) {
        return new JAXBElement<>(_CreateNewCompteResponse_QNAME, CreateNewCompteResponse.class, null, value);
    }

}
