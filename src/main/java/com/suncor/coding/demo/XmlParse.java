package com.suncor.coding.demo;

import com.google.common.collect.Maps;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: coding
 * @description: xmlParse
 * @author: sunc
 * @create: 2020-08-11 14:30
 **/
public class XmlParse {
    public static void main(String[] args) throws DocumentException {
        String xml = "<xml>\n" +
                "  <ToUserName><![CDATA[toUser]]></ToUserName>\n" +
                "  <FromUserName><![CDATA[fromUser]]></FromUserName>\n" +
                "  <CreateTime>12345678</CreateTime>\n" +
                "  <MsgType><![CDATA[music]]></MsgType>\n" +
                "  <Music>\n" +
                "    <Title><![CDATA[TITLE]]></Title>\n" +
                "    <Description><![CDATA[DESCRIPTION]]></Description>\n" +
                "    <MusicUrl><![CDATA[MUSIC_Url]]></MusicUrl>\n" +
                "    <HQMusicUrl><![CDATA[HQ_MUSIC_Url]]></HQMusicUrl>\n" +
                "    <ThumbMediaId><![CDATA[media_id]]></ThumbMediaId>\n" +
                "  </Music>\n" +
                "</xml>";

//        Document doc = DocumentHelper.parseText(xml);
//        Element root = doc.getRootElement();
//        String username = root.elementText("ToUserName");
//        String FromUserName = root.elementText("FromUserName");
//        String title = root.elementText("Title");
////        String raw = "//Title";
//        String title1 =doc.selectSingleNode("//Title").getText();
////        selectSingleNode
//        System.out.println(username);
//        System.out.println(FromUserName);
//        System.out.println(title);
//        System.out.println(title1);

        //解析返回的xml字符串，生成document对象
        Document document = DocumentHelper.parseText(xml);
//根节点
        Element root = document.getRootElement();
//子节点
        List<Element> childElements = root.elements();

        Map<String,Object> mapEle = Maps.newHashMap();
//遍历子节点
        mapEle = getAllElements(childElements,mapEle);
//        System.out.println(mapEle.toString());
        System.out.println("ssss" + mapEle.get("Music"));
    }
    static private Map<String, Object> getAllElements(List<Element> childElements, Map<String,Object> mapEle) {
        for (Element ele : childElements) {
            mapEle.put(ele.getName(), ele.getText());
            if(ele.elements().size()>0){
                mapEle = getAllElements(ele.elements(), mapEle);
            }
        }
        return mapEle;
    }
}
