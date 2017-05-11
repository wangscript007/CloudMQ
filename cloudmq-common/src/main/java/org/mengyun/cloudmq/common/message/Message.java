package org.mengyun.cloudmq.common.message;

import java.util.Map;

/**
 * Created by changming.xie on 5/9/17.
 */
public class Message {
    private String topic;
    private Map<String, String> properties;
    private byte[] body;

    public Message(String topic,byte[] body) {
        this.topic = topic;
        this.body = body;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }
}
