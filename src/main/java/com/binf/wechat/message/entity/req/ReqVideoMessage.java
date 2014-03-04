package com.binf.wechat.message.entity.req;

/**
 * Created by wangbin on 14-2-17.
 */
public class ReqVideoMessage extends ReqMessage {

    //视频消息媒体id
    private String MediaId;
    //视频消息缩略图的媒体id
    private String ThumbMediaId;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getThumbMediaId() {
        return ThumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }
}
