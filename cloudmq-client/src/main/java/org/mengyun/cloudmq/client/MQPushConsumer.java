package org.mengyun.cloudmq.client;

import org.mengyun.cloudmq.client.consumer.listener.MessageListener;

/**
 * Created by changming.xie on 5/10/17.
 */
public interface MQPushConsumer {

    void registerMessageListener(MessageListener messageListener);
}
