package com.binf.wechat.message.entity.req;

import com.binf.wechat.message.entity.Message;

/**
 * Created by wangbin on 14-2-17.
 */
public class ReqEventMessage extends Message {

    //事件类型
    private String Event;

    public String getEvent() {
        return Event;
    }

    public void setEvent(String event) {
        Event = event;
    }

    @Override
    public String toString() {
        return "ReqEventMessage{" +
                "Event='" + Event + '\'' +
                '}';
    }
}
