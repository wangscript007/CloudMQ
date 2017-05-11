package org.mengyun.cloudmq.sample.quickstart;

import org.mengyun.cloudmq.client.MQPushConsumer;
import org.mengyun.cloudmq.client.consumer.listener.MessageListener;
import org.mengyun.cloudmq.common.message.Message;

import java.util.List;

/**
 * Created by changming.xie on 5/9/17.
 */
public class Consumer {

    public static void main(String[] args) {

        MQPushConsumer consumer = null;

        consumer.registerMessageListener(new MessageListener() {

            @Override
            public void consumeMessage(List<Message> messages) {
                System.out.println(messages.get(0).getBody());
            }
        });
    }
}
