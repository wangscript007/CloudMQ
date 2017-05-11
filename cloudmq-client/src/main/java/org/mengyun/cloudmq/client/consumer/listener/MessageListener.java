package org.mengyun.cloudmq.client.consumer.listener;

import org.mengyun.cloudmq.common.message.Message;

import java.util.List;

/**
 * Created by changming.xie on 5/10/17.
 */
public interface MessageListener {
    void consumeMessage(List<Message> messages);
}
