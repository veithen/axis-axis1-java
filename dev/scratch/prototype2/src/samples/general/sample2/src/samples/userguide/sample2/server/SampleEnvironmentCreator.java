/*
 * Copyright 2001-2004 The Apache Software Foundation.
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
package samples.userguide.sample2.server;

import javax.xml.namespace.QName;

import org.apache.axis.context.MessageContext;
import org.apache.axis.description.AxisGlobal;
import org.apache.axis.description.AxisOperation;
import org.apache.axis.description.AxisService;
import org.apache.axis.description.SimpleAxisOperationImpl;
import org.apache.axis.engine.EngineRegistry;
import org.apache.axis.engine.EngineRegistryImpl;
import org.apache.axis.engine.EngineUtils;
import org.apache.axis.testUtils.SimpleJavaProvider;
import org.apache.axis.transport.http.SimpleHTTPServer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author chathura@opensource.lk
 * 
 */
public class SampleEnvironmentCreator {
	
    private Log log = LogFactory.getLog(getClass());
    private QName serviceName = new QName("","sample2");
    private QName operationName1 = new QName("http://localhost/my","echoInt");
    private QName operationName2 = new QName("http://localhost/my","echoString");
    private QName transportName = new QName("http://localhost/my","NullTransport");

    private EngineRegistry engineRegistry;
    private MessageContext mc;
    private Thread thisThread = null;
    private SimpleHTTPServer sas;
    
    public SampleEnvironmentCreator(){
       
        
    }

    
    public void setUp() throws Exception {
        AxisGlobal global = new AxisGlobal();
        engineRegistry = new EngineRegistryImpl(global);
        
        AxisService service = new AxisService(serviceName);
        service.setClassLoader(Thread.currentThread().getContextClassLoader());
        service.setServiceClass(EchoImpl.class);
        service.setProvider(new SimpleJavaProvider());

        AxisOperation operation1 = new SimpleAxisOperationImpl(operationName1);
        service.addOperation(operation1);
        
        AxisOperation operation2 = new SimpleAxisOperationImpl(operationName2);
        service.addOperation(operation2);

        EngineUtils.createExecutionChains(service);
        engineRegistry.addService(service);
        
        sas = EngineUtils.startServer(engineRegistry);        
    }
    
    
    protected void tearDown() throws Exception {
        EngineUtils.stopServer();    
        Thread.sleep(1000);
}


    
}