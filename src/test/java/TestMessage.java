import com.binf.wechat.constant.MessageType;
import com.binf.wechat.message.entity.Message;
import com.binf.wechat.message.entity.req.ReqImageMessage;
import com.binf.wechat.message.entity.req.ReqTextMessage;
import com.binf.wechat.message.handle.HandleMessage;
import com.binf.wechat.message.handle.impl.DefHandleMessageImpl;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by wangbin on 14-2-16.
 */
public class TestMessage {


    public static void main(String[] args) {


        HandleMessage handleMessage = new DefHandleMessageImpl();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("ToUserName", "tusername");
        map.put("FromUserName", "fusername");
        map.put("CreateTime", 1122L);
        map.put("MsgType", "text");
        map.put("content", "xxxxx");
        map.put("MsgId", 1234567890123456L);

//        Message message = handleMessage.reqMessageHandel(map);
//
//        String msgType =   message.getMsgType();
//
//        if(msgType.equals(MessageType.REQ_MESSAGE_TYPE_TEXT.toString())){
//            ReqTextMessage reqTextMessage =(ReqTextMessage)message;
//            System.out.println(reqTextMessage);
//        }




    }


    public void sky() {
        System.out.println("sky...");
    }
}
