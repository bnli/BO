package com.sdyx.boss.service.internal.customer.echannel.webservice.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * com.sdyx.boss.service.internal.customer.echannel.webservice.impl package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _DoRequestResponse_QNAME = new QName(
			"http://impl.webservice.echannel.customer.internal.service.boss.sdyx.com/",
			"doRequestResponse");
	private final static QName _DoRequest_QNAME = new QName(
			"http://impl.webservice.echannel.customer.internal.service.boss.sdyx.com/",
			"doRequest");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package:
	 * com.sdyx.boss.service.internal.customer.echannel.webservice.impl
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link DoRequestResponse }
	 * 
	 */
	public DoRequestResponse createDoRequestResponse() {
		return new DoRequestResponse();
	}

	/**
	 * Create an instance of {@link DoRequest }
	 * 
	 */
	public DoRequest createDoRequest() {
		return new DoRequest();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DoRequestResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://impl.webservice.echannel.customer.internal.service.boss.sdyx.com/", name = "doRequestResponse")
	public JAXBElement<DoRequestResponse> createDoRequestResponse(
			DoRequestResponse value) {
		return new JAXBElement<DoRequestResponse>(_DoRequestResponse_QNAME,
				DoRequestResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DoRequest }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://impl.webservice.echannel.customer.internal.service.boss.sdyx.com/", name = "doRequest")
	public JAXBElement<DoRequest> createDoRequest(DoRequest value) {
		return new JAXBElement<DoRequest>(_DoRequest_QNAME, DoRequest.class,
				null, value);
	}

}
