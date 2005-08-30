package org.apache.axis2.interopt.sun.round4.simple;

import org.apache.axis2.addressing.EndpointReference;

import org.apache.axis2.clientapi.Call;
import org.apache.axis2.Constants;
import org.apache.axis2.AxisFault;
import org.apache.axis2.interopt.sun.round4.simple.util.SunGroupHClientUtil;
import org.apache.axis2.soap.SOAPEnvelope;
import org.apache.axis2.soap.impl.llom.builder.StAXSOAPModelBuilder;
import org.apache.axis2.om.OMElement;
import org.apache.axis2.om.OMXMLParserWrapper;
import org.apache.axis2.om.impl.llom.util.XMLComparator;
import org.apache.axis2.om.impl.llom.exception.XMLComparisonException;


import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLInputFactory;

import java.io.StringWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

/**
 * Created by IntelliJ IDEA.
 * User: Nadana
 * Date: Aug 5, 2005
 * Time: 10:08:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class EchoBlockingClient {
    public OMElement sendMsg(SunGroupHClientUtil util,String soapAction){
        OMElement firstchild=null;
        EndpointReference targetEPR =
                new EndpointReference("http://soapinterop.java.sun.com:80/round4/grouph/simplerpcenc" );
        try {


            Call call = new Call();
            call.setTo(targetEPR);
            call.setExceptionToBeThrownOnSOAPFault(false);
            call.setTransportInfo(Constants.TRANSPORT_HTTP,Constants.TRANSPORT_HTTP,false);
            call.setSoapAction(soapAction);
            //Blocking invocation

            firstchild = call.invokeBlocking("",util.getEchoOMElement());

            StringWriter writer = new StringWriter();



            System.out.println(writer.toString());

        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();


        }
        return firstchild;

    }






}
