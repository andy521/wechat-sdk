package com.binf.wechat.message.entity.resp;

import com.binf.wechat.message.entity.Message;

/**
 * Created by wangbin on 14-2-10.
 * 推送相应文本消息
 */
public class RespTextMessage extends RespMessage{

    /**
     * 消息内容
     */
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Override
    public String toString() {
        return super.toString()+";RespTextMessage{" +
                "Content='" + Content + '\'' +
                '}';
    }
}
