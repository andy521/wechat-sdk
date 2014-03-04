package com.binf.wechat.utils;

import com.binf.wechat.message.entity.Message;
import com.binf.wechat.message.entity.resp.RespNewsMessage;
import com.binf.wechat.message.entity.resp.model.Article;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;

import java.io.Writer;

/**
 * Created by wangbin on 14-2-18.
 */
public class XmlUtils {


    /**
     * 文本消息对象转换成xml
     * @param  message 文本消息对象
     * @return xml
     */
    public static <T extends Message>String messageToXml(T  message) {
        xstream.alias("xml", message.getClass());

        if(message.getClass()== RespNewsMessage.class){
            xstream.alias("item", new Article().getClass());
        }

        return xstream.toXML(message);
    }

    /**
     * 扩展xstream，使其支持CDATA块
     *
     * @date 2013-05-19
     */
    private static XStream xstream = new XStream(new XppDriver() {
        public HierarchicalStreamWriter createWriter(Writer out) {
            return new PrettyPrintWriter(out) {
                // 对所有xml节点的转换都增加CDATA标记
                boolean cdata = true;

                public void startNode(String name, Class clazz) {
                    super.startNode(name, clazz);
                }

                protected void writeText(QuickWriter writer, String text) {
                    if (cdata) {
                        writer.write("<![CDATA[");
                        writer.write(text);
                        writer.write("]]>");
                    } else {
                        writer.write(text);
                    }
                }
            };
        }
    });



}
