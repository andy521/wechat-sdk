package com.binf.wechat.message.entity.resp;

import com.binf.wechat.message.entity.Message;

/**
 * Created by wangbin on 14-2-18.
 */
public class RespMessage extends Message {

    // 位0x0001被标志时，星标刚收到的消息
    private int FuncFlag;

    public int getFuncFlag() {
        return FuncFlag;
    }

    public void setFuncFlag(int funcFlag) {
        FuncFlag = funcFlag;
    }


    @Override
    public String toString() {

        return super.toString()+";RespMessage{" +
                "FuncFlag=" + FuncFlag +
                '}';
    }
}
