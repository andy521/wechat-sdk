package com.binf.wechat.message.entity.resp;

import com.binf.wechat.message.entity.resp.model.Video;

/**
 * Created by wangbin on 14-2-18.
 */
public class RespVideoMessage extends RespMessage {

    private Video Video;

    public Video getVideo() {
        return Video;
    }

    public void setVideo(Video video) {
        Video = video;
    }
}
