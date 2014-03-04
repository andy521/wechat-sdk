package com.binf.wechat.message.entity.req;

/**
 * Created by wangbin on 14-2-17.
 */
public class ReqVoiceMessage extends ReqMessage {

    //语音消息媒体id
    private String MediaId;
    //语音格式，如amr，speex等
    private String Format;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }
}
