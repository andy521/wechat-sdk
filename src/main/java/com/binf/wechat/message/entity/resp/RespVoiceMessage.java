package com.binf.wechat.message.entity.resp;

import com.binf.wechat.message.entity.resp.model.Voice;

/**
 * Created by wangbin on 14-2-18.
 */
public class RespVoiceMessage extends RespMessage {

    //语音对象
    private Voice Voice;

    public Voice getVoice() {
        return Voice;
    }

    public void setVoice(Voice voice) {
        Voice = voice;
    }
}
