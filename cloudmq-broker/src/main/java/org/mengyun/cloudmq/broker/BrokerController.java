package org.mengyun.cloudmq.broker;

import org.mengyun.cloudmq.remoting.NettyRemotingServer;
import org.mengyun.cloudmq.remoting.RemotingServer;

/**
 * Created by changming.xie on 5/11/17.
 */
public class BrokerController {

    private RemotingServer remotingServer;

    public void initialize() {
        remotingServer = new NettyRemotingServer();
    }

    public void start() {
        remotingServer.start();
    }
}
