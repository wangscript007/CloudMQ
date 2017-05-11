package org.mengyun.cloudmq.client;

import org.mengyun.cloudmq.common.message.Message;

/**
 * Created by changming.xie on 5/9/17.
 */
public interface MQProducer {

    void start();

    void shutdown();

    void send(Message msg);
}
