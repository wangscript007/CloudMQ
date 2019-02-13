package org.mengyun.cloudmq.client;

import org.mengyun.cloudmq.client.impl.DefaultMQProducerImpl;
import org.mengyun.cloudmq.common.message.Message;

/**
 * Created by changming.xie on 02/11/18.
 */
public class DefaultMQProducer extends ClientConfig implements MQProducer {

    private DefaultMQProducerImpl defaultMQProducerImpl;

    public DefaultMQProducer(DefaultMQProducerImpl defaultMQProducerImpl) {
        this.defaultMQProducerImpl = defaultMQProducerImpl;
    }

    @Override
    public void start() {
        this.defaultMQProducerImpl.start();
    }

    @Override
    public void shutdown() {

    }

    @Override
    public void send(Message msg) {

    }
}
