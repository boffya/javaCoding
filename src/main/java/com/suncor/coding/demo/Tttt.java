//package com.suncor.coding.demo;
//
///**
// * @program: coding
// * @description:
// * @author: sunc
// * @create: 2020-07-09 15:12
// **/
//public class Tttt {
//    package com.zjhcsoft.eddmp.webService.dao;
//
//
//import org.apache.axiom.om.OMAbstractFactory;
//import org.apache.axiom.om.OMElement;
//import org.apache.axiom.om.OMFactory;
//import org.apache.axiom.om.OMNamespace;
//import org.apache.axis2.AxisFault;
//import org.apache.axis2.addressing.EndpointReference;
//import org.apache.axis2.client.Options;
//import org.apache.axis2.client.ServiceClient;
//
//    /**
//     * 使用serviceClient进行xml定制发送
//     * User: Francis.Hu
//     * Date: 13-12-4
//     * Time: 下午1:41
//     */
//    public class BaseUtil {
//        public static void main(String[] args) {
//            String url = "http://10.7.92.232:8080/SMS_Send_Service/services/smsSend";
//
//            String serviceNameH = "SendSMS10001";
//            String serviceVer = "1.0";
//            String consumer = "********";
//            String requestTime = "2013-12-04T14:19:47.0Z";
//
//            String destTermID = "*********";
//            String srcTermID = "10001";
//            String msgContent = "sen****i";
//            String disturbType = "0";
//            String needReport = "1";
//            String serviceName = "****";
//            String serialID = "201312041419351034756432";
//            String serviceProvider = "*****";
//            String pwd = "****";
//
//            try {
//                Options options = new Options();
//
//                // 指定调用WebService的URL
//                EndpointReference targetEPR = new EndpointReference(url);
//                options.setTo(targetEPR);
//
//                //client
//                ServiceClient sender = new ServiceClient();
//                sender.setOptions(options);
//
//                OMFactory factory = OMAbstractFactory.getOMFactory();
//                OMNamespace omNs =  factory.createOMNamespace("http://www.shtel.com.cn/csb/v2/","");
//
//                //头消息指定
//                OMElement header = factory.createOMElement("CSBHeader",omNs);
//
//                OMElement sn = factory.createOMElement("ServiceName", omNs);
//                sn.setText(serviceNameH);
//                header.addChild(sn);
//
//                OMElement sv = factory.createOMElement("ServiceVer", omNs);
//                sv.setText(serviceVer);
//                header.addChild(sv);
//
//                OMElement cs = factory.createOMElement("Consumer", omNs);
//                cs.setText(consumer);
//                header.addChild(cs);
//
//                OMElement rt = factory.createOMElement("RequestTime", omNs);
//                rt.setText(requestTime);
//                header.addChild(rt);
//
//                sender.addHeader(header);
//
//                //方法的定义，namespace和后面m0的效果，参考下面报文示例
//                OMNamespace bodyNM =  factory.createOMNamespace("http://webservice.ideal.com","m0");
//                OMElement method = factory.createOMElement("send", bodyNM);
//
//                //方法里的参数1
//                OMElement destTermXML = factory.createOMElement("destTermID", bodyNM);
//                destTermXML.setText(destTermID);
//                method.addChild(destTermXML);
//                //方法里的参数2，下面依次类推
//                OMElement srcTermIDXML = factory.createOMElement("srcTermID", bodyNM);
//                srcTermIDXML.setText(srcTermID);
//                method.addChild(srcTermIDXML);
//
//                OMElement msgContentXML = factory.createOMElement("msgContent", bodyNM);
//                msgContentXML.setText(msgContent);
//                method.addChild(msgContentXML);
//
//                OMElement disturbTypeXML = factory.createOMElement("disturbType", bodyNM);
//                disturbTypeXML.setText(disturbType);
//                method.addChild(disturbTypeXML);
//
//                OMElement needReportXML = factory.createOMElement("needReport", bodyNM);
//                needReportXML.setText(needReport);
//                method.addChild(needReportXML);
//
//                OMElement serviceNameXML = factory.createOMElement("serviceName", bodyNM);
//                serviceNameXML.setText(serviceName);
//                method.addChild(serviceNameXML);
//
//                OMElement serialIDXML = factory.createOMElement("serialID", bodyNM);
//                serialIDXML.setText(serialID);
//                method.addChild(serialIDXML);
//
//                OMElement serviceProviderXML = factory.createOMElement("serviceProvider", bodyNM);
//                serviceProviderXML.setText(serviceProvider);
//                method.addChild(serviceProviderXML);
//
//                OMElement pwdXML = factory.createOMElement("pwd", bodyNM);
//                pwdXML.setText(pwd);
//                method.addChild(pwdXML);
//
//                //构建request报文
//                method.build();
//
//                //发送报文请求，返回OMElement
//                OMElement result = sender.sendReceive(method);
//
//                System.out.println(result);
//            } catch (AxisFault axisFault) {
//                axisFault.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//            }
//        }
//
//    }
//}
