package com.binf.wechat.message.entity.req;

/**
 * Created by wangbin on 14-2-17.
 */
public class ReqImageMessage  extends ReqMessage{

    //图片链接
    private String PicUrl;

    //图片消息媒体id
    private String MediaId;


    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    @Override
    public String toString() {
        return "ReqImageMessage{" +
                "PicUrl='" + PicUrl + '\'' +
                ", MediaId='" + MediaId + '\'' +
                '}';
    }
}
