package com.binf.wechat.message.handle;

import com.binf.wechat.constant.MessageType;
import com.binf.wechat.message.entity.Message;
import com.binf.wechat.message.entity.req.*;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangbin on 14-2-10.
 * 处理短信信息接口
 */
public abstract class HandleMessage{

    /**
     * 处理接收的输入流，返回一个Message对象
     * @param
     * @return
     */
    public  Message reqMessageHandle(InputStream inputStream)throws Exception{


            Map<String,Object> map = new HashMap<String, Object>();

            // 从request中取得输入流
            //读取输入流
            SAXReader reader = new SAXReader();
            Document doucument = reader.read(inputStream);

            // 得到xml根元素
            Element root =   doucument.getRootElement();

            // 得到根元素的所有子节点
            List<Element> elementList = root.elements();
            // 遍历所有子节点
            for (Element e : elementList) {
                map.put(e.getName(), e.getText());
            }
            // 释放资源
            inputStream.close();

            MessageType messageType[] =  MessageType.values();

            for(MessageType type : messageType){

                if(type.toString().equals(map.get("MsgType"))){
                    Method method =  this.getClass().getMethod(map.get("MsgType")+"MessageHandle",Map.class);

                    return (Message)method.invoke(this,map);
                }

            }

            return null;
    }

    /**
     * 处理文本消息
     * @param messageMap
     * @return
     */
    public abstract ReqTextMessage textMessageHandle(Map<String, Object> messageMap);

    /**
     * 处理图片消息
     * @param messageMap
     * @return
     */
    public abstract ReqImageMessage imageMessageHandle(Map<String, Object> messageMap);

    /**
     * 处理语音消息
     * @param messageMap
     * @return
     */
    public abstract ReqVoiceMessage voiceMessageHandle(Map<String, Object> messageMap);

    /**
     * 处理视频消息
     * @param messageMap
     * @return
     */
    public abstract ReqVideoMessage videoMessageHandle(Map<String, Object> messageMap);

    /**
     * 处理地理位置消息
     * @param messageMap
     * @return
     */
    public abstract ReqLocationMessage locationMessageHandle(Map<String, Object> messageMap);

    /**
     * 处理链接消息
     * @param messageMap
     * @return
     */
    public abstract ReqLinkMessage linkMessageHandle(Map<String, Object> messageMap);

    /**
     * 处理事件信息
     * @param messageMap
     * @return
     */
    public abstract ReqEventMessage eventMessageHandle(Map<String, Object> messageMap);
}
