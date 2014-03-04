package com.binf.wechat.message.handle.impl;

import com.binf.wechat.message.entity.Message;
import com.binf.wechat.message.entity.req.*;
import com.binf.wechat.message.handle.HandleMessage;
import com.binf.wechat.utils.ClassUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.*;

/**
 * Created by wangbin on 14-2-10.
 */
public class DefHandleMessageImpl extends HandleMessage{



    @Override
    public ReqTextMessage textMessageHandle(Map<String, Object> messageMap)  {

       return ClassUtils.map2Message(messageMap,ReqTextMessage.class);
    }

    @Override
    public ReqImageMessage imageMessageHandle(Map<String, Object> messageMap) {
        return ClassUtils.map2Message(messageMap,ReqImageMessage.class);
    }

    @Override
    public ReqVoiceMessage voiceMessageHandle(Map<String, Object> messageMap) {
        return ClassUtils.map2Message(messageMap,ReqVoiceMessage.class);
    }

    @Override
    public ReqVideoMessage videoMessageHandle(Map<String, Object> messageMap) {
        return ClassUtils.map2Message(messageMap,ReqVideoMessage.class);
    }

    @Override
    public ReqLocationMessage locationMessageHandle(Map<String, Object> messageMap) {
        return ClassUtils.map2Message(messageMap,ReqLocationMessage.class);
    }

    @Override
    public ReqLinkMessage linkMessageHandle(Map<String, Object> messageMap) {
        return ClassUtils.map2Message(messageMap,ReqLinkMessage.class);
    }

    @Override
    public ReqEventMessage eventMessageHandle(Map<String, Object> messageMap) {
        return ClassUtils.map2Message(messageMap,ReqEventMessage.class);
    }
}
