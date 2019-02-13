package org.mengyun.cloudmq.client.impl;

import org.mengyun.cloudmq.client.impl.factory.MQClientInstance;

/**
 * Created by changming.xie on 06/11/18.
 */
public class DefaultMQProducerImpl {

    private MQClientInstance mQClientInstance;
    public void start() {
        mQClientInstance = new MQClientInstance();
    }
}
