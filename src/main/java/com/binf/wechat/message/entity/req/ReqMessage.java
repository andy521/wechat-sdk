package com.binf.wechat.message.entity.req;

import com.binf.wechat.message.entity.Message;

/**
 * Created by wangbin on 14-2-10.
 * 请求消息总类
 */
public class ReqMessage extends Message{

    //消息id，64位整型
    private Long MsgId ;

    public Long getMsgId() {
        return MsgId;
    }

    public void setMsgId(Long msgId) {
        MsgId = msgId;
    }

    @Override
    public String toString() {
        return super.toString()+";ReqMessage{" +
                "MsgId=" + MsgId +
                '}';
    }
}
