/*
 * Copyright 2004,2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sample.axis2rest;

import org.apache.axis2.Constants;
import org.apache.axis2.addressing.AddressingConstants;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.clientapi.Call;
import org.apache.axis2.engine.AxisFault;
import org.apache.axis2.om.*;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

/**
 * This is a Client progam that accesses 'MyService' web service in Axis2 samples 
 */
public class MyServiceClient {

	private static String toEpr = "http://localhost:8080/axis2/services/MyService";
	
	public static void main(String[] args) throws AxisFault {
		
			Call  call = new Call();
			call.setTo(new EndpointReference(AddressingConstants.WSA_TO,toEpr));
			call.setTransportInfo(Constants.TRANSPORT_HTTP,Constants.TRANSPORT_HTTP,false);
			call.setDoREST(true);
			
			OMElement result = call.invokeBlocking("echo", getPayload());
		
			try {
				XMLStreamWriter writer = XMLOutputFactory.newInstance().createXMLStreamWriter(System.out);
				result.serializeWithCache(new OMOutput(writer));
				writer.flush();
			} catch (XMLStreamException e) {
				e.printStackTrace();
			} catch (FactoryConfigurationError e) {
				e.printStackTrace();
			}
	}
	
	
	private static OMElement getPayload() {
		OMFactory fac = OMAbstractFactory.getOMFactory();
		OMNamespace omNs = fac.createOMNamespace(
				"http://example1.org/example1", "example1");
		OMElement method = fac.createOMElement("echo", omNs);
		OMElement value = fac.createOMElement("Text", omNs);
		value.addChild(fac.createText(value, "Axis2 Echo String "));
		method.addChild(value);

		return method;
	}
}