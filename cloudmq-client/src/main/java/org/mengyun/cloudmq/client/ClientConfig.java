package org.mengyun.cloudmq.client;

import org.mengyun.cloudmq.common.MqConstants;

/**
 * Created by changming.xie on 02/11/18.
 */
public class ClientConfig {

    private String namesrvAddr = System.getProperty(MqConstants.NAMESRV_ADDR_PROPERTY, System.getenv(MqConstants.NAMESRV_ADDR_ENV));


    public String getNamesrvAddr() {
        return namesrvAddr;
    }

    public void setNamesrvAddr(String namesrvAddr) {
        this.namesrvAddr = namesrvAddr;
    }
}
