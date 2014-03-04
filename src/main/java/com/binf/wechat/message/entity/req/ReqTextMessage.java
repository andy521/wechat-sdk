package com.binf.wechat.message.entity.req;

/**
 * Created by wangbin on 14-2-10.
 */

/**
 * 请求文本消息类
 */
public class ReqTextMessage extends ReqMessage {

    /**
     * 消息内容
     */
    private  String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Override
    public String toString() {
        return super.toString()+";ReqTextMessage{" +
                "Content='" + Content + '\'' +
                '}';
    }
}
