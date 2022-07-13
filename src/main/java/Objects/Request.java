package Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Request {
    public Request() {
    }

    public String msgId;
    public String msgType;
    public User user;
    public boolean isInBlackList;

    public Request(String msgId, String msgType, User user, boolean isInBlackListList) {
        this.msgId = msgId;
        this.msgType = msgType;
        this.user = user;
        this.isInBlackList = isInBlackListList;
    }

    public String getMsgId() {
        return msgId;
    }
    public String getMsgType() {
        return msgType;
    }
    public User getUser() {
        return user;
    }
}
