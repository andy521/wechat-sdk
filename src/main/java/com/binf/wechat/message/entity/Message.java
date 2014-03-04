package com.binf.wechat.message.entity;

import com.binf.wechat.utils.ClassUtils;

/**
 * Created by wangbin on 14-2-10.
 * 消息根类
 */
public class Message {

    /**
     * 开发者微信号
     */
    private String ToUserName;

    /**
     * 发送方帐号（一个OpenID）
     */
    private String FromUserName;

    /**
     * 消息创建时间 （整型）
     */
    private Long CreateTime;

    /**
     * 消息类型
     */
    private String MsgType;


    public <T extends Message> T setField(String fieldName,Object obj){
        try {
            ClassUtils.parSetVal(fieldName,this,obj);
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
        return (T)this;
    }


    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public Long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Long createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

    @Override
    public String toString() {
        return "Message{" +
                "ToUserName='" + ToUserName + '\'' +
                ", FromUserName='" + FromUserName + '\'' +
                ", CreateTime=" + CreateTime +
                ", MsgType='" + MsgType + '\'' +
                '}';
    }
}
