package com.binf.wechat.message.entity.resp;

import com.binf.wechat.message.entity.resp.model.Image;

/**
 * Created by wangbin on 14-2-18.
 */
public class RespImageMessage extends RespMessage {

    private Image Image;

    public Image getImage() {
        return Image;
    }

    public void setImage(Image image) {
        Image = image;
    }
}
