package com.binf.wechat.verify;

import com.binf.wechat.utils.EncryptUtils;

import java.util.Arrays;

/**
 * Created by wangbin on 14-2-9.
 */
public class VerifyToken {




    public static boolean checkServeToken(String[] tokenArray,String signature){

        Arrays.sort(tokenArray);
        StringBuilder content = new StringBuilder();
        for(String s : tokenArray){
            content.append(s);
        }
        //将三个参数字符串拼接成一个字符串进行sha1加密，并与signature对比,如果相同返回echostr
        if(EncryptUtils.sha(content.toString()).equals(signature)){
            return true;
        }
        return  false;
    }
}
