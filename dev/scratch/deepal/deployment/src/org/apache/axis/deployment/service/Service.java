package org.apache.axis.deployment.service;

import org.apache.axis.deployment.util.*;

import java.io.InputStream;
import java.util.Vector;

import com.thoughtworks.xstream.XStream;

/**
 * Copyright 2001-2004 The Apache Software Foundation.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author Deepal Jayasinghe
 *         Oct 18, 2004
 *         3:10:34 PM
 *
 */


/**
 * actual service class which is to deserilize Service.xml
 */
public class Service {
    //TODO Complte this class
    private Vector parameters = new Vector();
    private String provider;
    private String style;
    private String contextPath;

    // flow objects
    private OutFlow outFlow;
    private InFlow inFlow;
    private FaultFlow faultFlow;

    private Operation operation;

    public Service() {
        //jsut to clear the vector
        parameters.removeAllElements();
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public static String PROVIDERNAME = "provider";
    public static String STYLENAME = "style";

    public OutFlow getOutFlow() {
        return outFlow;
    }

    public void setOutFlow(OutFlow outFlow) {
        this.outFlow = outFlow;
    }

    public InFlow getInFlow() {
        return inFlow;
    }

    public void setInFlow(InFlow inFlow) {
        this.inFlow = inFlow;
    }

    public FaultFlow getFaultFlow() {
        return faultFlow;
    }

    public void setFaultFlow(FaultFlow faultFlow) {
        this.faultFlow = faultFlow;
    }

    public static String CONTEXTPATHNAME = "contextPath";

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public void appParameter(Parameter parameter){
        parameters.add(parameter) ;
    }

    public Parameter getParameter(int index){
        return (Parameter)parameters.get(index);
    }



    public void prinData(){
        XStream xstream = new XStream();
        String xml = xstream.toXML(this);
        System.out.println("Serialization out put \n"  + xml );
    }

}
