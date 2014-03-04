import com.binf.wechat.message.entity.resp.RespNewsMessage;
import com.binf.wechat.message.entity.resp.RespTextMessage;
import com.binf.wechat.message.entity.resp.model.Article;
import com.binf.wechat.utils.XmlUtils;
import sun.misc.MessageUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wangbin on 14-2-18.
 */
public class TestXml {

    public static void main(String[] args) {

        // 默认回复此文本消息
        RespTextMessage textMessage = new RespTextMessage();
        textMessage.setToUserName("fromUserName");
        textMessage.setFromUserName("toUserName");
        textMessage.setCreateTime(new Date().getTime());
        textMessage.setMsgType("text");
        textMessage.setFuncFlag(0);
        // 由于href属性值必须用双引号引起，这与字符串本身的双引号冲突，所以要转义
        textMessage.setContent("请求处理异常，请稍候尝试！");

        System.out.println(XmlUtils.messageToXml(textMessage));

    }
}
