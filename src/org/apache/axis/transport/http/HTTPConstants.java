/*
 * The Apache Software License, Version 1.1
 *
 *
 * Copyright (c) 2001-2003 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The names "Axis" and "Apache Software Foundation" must
 *    not be used to endorse or promote products derived from this
 *    software without prior written permission. For written
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache",
 *    nor may "Apache" appear in their name, without prior written
 *    permission of the Apache Software Foundation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 */

package org.apache.axis.transport.http;

/**
 * HTTP protocol and message context constants.
 *
 * @author Rob Jellinghaus (robj@unrealities.com)
 * @author Doug Davis (dug@us.ibm.com)
 * @author Jacek Kopecky (jacek@idoox.com)
 */
public class HTTPConstants {
    /** The MessageContext transport ID of HTTP.
     *  (Maybe this should be more specific, like "http_servlet",
     *   whaddya think? - todo by Jacek)
     */

    public static final String HEADER_PROTOCOL_10 = "HTTP/1.0";
    public static final String HEADER_PROTOCOL_11 = "HTTP/1.1";
    public static final String HEADER_PROTOCOL_V10 = "1.0".intern();
    public static final String HEADER_PROTOCOL_V11 = "1.1".intern();
    public static final String HEADER_POST = "POST";
    public static final String HEADER_HOST = "Host";
    public static final String HEADER_CONTENT_DESCRIPTION = "Content-Description";
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_CONTENT_TRANSFER_ENCODING = "Content-Transfer-Encoding";
    public static final String HEADER_CONTENT_TYPE_JMS = "ContentType";
    public static final String HEADER_CONTENT_LENGTH = "Content-Length";
    public static final String HEADER_CONTENT_LOCATION = "Content-Location";
    public static final String HEADER_CONTENT_ID = "Content-Id";
    public static final String HEADER_SOAP_ACTION = "SOAPAction";
    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String HEADER_PROXY_AUTHORIZATION = "Proxy-Authorization";
    public static final String HEADER_EXPECT = "Expect";
    public static final String HEADER_EXPECT_100_Continue = "100-continue";
    public static final String HEADER_USER_AGENT = "User-Agent";
    public static final String HEADER_CACHE_CONTROL = "Cache-Control";
    public static final String HEADER_CACHE_CONTROL_NOCACHE = "no-cache";
    public static final String HEADER_PRAGMA = "Pragma";



    
    public static final String REQUEST_HEADERS = "HTTP-Request-Headers";
    public static final String RESPONSE_HEADERS = "HTTP-Response-Headers";

    /*http 1.1*/
    public static final String HEADER_TRANSFER_ENCODING = "Transfer-Encoding".intern();
    public static final String HEADER_TRANSFER_ENCODING_CHUNKED = "chunked".intern();

    public static final String HEADER_CONNECTION = "Connection";
    public static final String HEADER_CONNECTION_CLOSE = "close".intern();
    public static final String HEADER_CONNECTION_KEEPALIVE = "Keep-Alive".intern();//The default don't send.

    public static final String HEADER_ACCEPT = "Accept";
    public static final String HEADER_ACCEPT_TEXT_ALL = "text/*";
    public static final String HEADER_ACCEPT_APPL_SOAP = "application/soap+xml";
    public static final String HEADER_ACCEPT_MULTIPART_RELATED = "multipart/related";
    public static final String HEADER_ACCEPT_APPLICATION_DIME = "application/dime";
    

    /**
     * Cookie headers
     */
    public static final String HEADER_COOKIE = "Cookie";
    public static final String HEADER_COOKIE2 = "Cookie2";
    public static final String HEADER_SET_COOKIE = "Set-Cookie";
    public static final String HEADER_SET_COOKIE2 = "Set-Cookie2";
    
    /** Integer
     */
    public static String MC_HTTP_STATUS_CODE    = "transport.http.statusCode";

    /** String
     */
    public static String MC_HTTP_STATUS_MESSAGE = "transport.http.statusMessage";

    /** HttpServlet
     */
    public static String MC_HTTP_SERVLET        = "transport.http.servlet" ;

    /** HttpServletRequest
     */
    public static String MC_HTTP_SERVLETREQUEST = "transport.http.servletRequest";
    /** HttpServletResponse
     */
    public static String MC_HTTP_SERVLETRESPONSE= "transport.http.servletResponse";
    public static String MC_HTTP_SERVLETLOCATION= "transport.http.servletLocation";
    public static String MC_HTTP_SERVLETPATHINFO= "transport.http.servletPathInfo";

    /**
     * @deprecated Should use javax.xml.rpc.Call.SOAPACTION_URI_PROPERTY instead.
     */
    public static String MC_HTTP_SOAPACTION = javax.xml.rpc.Call.SOAPACTION_URI_PROPERTY;

    /** HTTP header field values
     */
    public static final String HEADER_DEFAULT_CHAR_ENCODING = "iso-8859-1";
    
    /**
     * AXIS servlet plugin parameter names.
     */
    
    public static final String PLUGIN_NAME = "transport.http.plugin.pluginName";
    public static final String PLUGIN_SERVICE_NAME = "transport.http.plugin.serviceName";
    public static final String PLUGIN_IS_DEVELOPMENT = "transport.http.plugin.isDevelopment";
    public static final String PLUGIN_ENABLE_LIST = "transport.http.plugin.enableList";
    public static final String PLUGIN_ENGINE = "transport.http.plugin.engine";
    public static final String PLUGIN_WRITER = "transport.http.plugin.writer";
    public static final String PLUGIN_LOG = "transport.http.plugin.log";
    public static final String PLUGIN_EXCEPTION_LOG = "transport.http.plugin.exceptionLog";
}
