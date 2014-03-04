package com.binf.wechat.message.entity.resp;

import com.binf.wechat.message.entity.resp.model.Music;

/**
 * Created by wangbin on 14-2-18.
 */
public class RespMusicMessage extends RespMessage{

    // 音乐
    private Music Music;

    public Music getMusic() {
        return Music;
    }

    public void setMusic(Music music) {
        Music = music;
    }
}
