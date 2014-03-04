package cn.lee.demo;

import com.binf.wechat.message.entity.resp.RespTextMessage;


/**
 * Created by wangbin on 14-3-2.
 */
public class TestSetField {

    public static RespTextMessage d = new RespTextMessage().setField("Content","dd")
                                                           .setField("ToUserName","cc");

    public static void main(String[] args) {
        System.out.println(d);
    }

}
