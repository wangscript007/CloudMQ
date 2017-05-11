package org.mengyun.cloudmq.broker;

/**
 * Created by changming.xie on 5/11/17.
 */
public class BrokerStartup {

    public static void main(String[] args) {
        start(createBrokerController(args));
    }

    private static BrokerController createBrokerController(String[] args) {

        BrokerController brokerController = new BrokerController();
        return brokerController;
    }

    public static BrokerController start(BrokerController controller) {
            controller.start();
        return controller;
    }
}
