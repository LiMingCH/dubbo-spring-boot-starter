package com.alibaba.dubbo.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * dubbo properties
 *
 * @author xionghui
 * @version 1.0.0
 * @since 1.0.0
 */
@ConfigurationProperties(prefix = "spring.dubbo") public class DubboProperties {

    /**
     * dubbo application name
     */
    private String appname;

    /**
     * dubbo registry address
     */
    private String registry;

    /**
     * communication protocol, default is dubbo
     */
    private String protocol = "dubbo";

    /**
     * dubbo listen port, default 20800
     */
    private int port = 20800;

    /**
     * dubbo thread count, default 200
     */
    private int threads = 200;

    /**
     * dubbo version, may override by {@link com.alibaba.dubbo.config.annotation.Service#version
     * Service.version} or {@link com.alibaba.dubbo.config.annotation.Reference#version
     * Reference.version}
     */
    private String version = "";

    /**
     * dubbo group, may override by {@link com.alibaba.dubbo.config.annotation.Service#group
     * Service.group} or {@link com.alibaba.dubbo.config.annotation.Reference#group Reference.group}
     */
    private String group = "";

    private String client = "";

    private String server = "";

    public String getAppname() {
        return this.appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getRegistry() {
        return this.registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getThreads() {
        return this.threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getClient() {
        return client;
    }

    public DubboProperties setClient(String client) {
        this.client = client;
        return this;
    }

    public String getServer() {
        return server;
    }

    public DubboProperties setServer(String server) {
        this.server = server;
        return this;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("DubboProperties{");
        sb.append("appname='").append(appname).append('\'');
        sb.append(", registry='").append(registry).append('\'');
        sb.append(", protocol='").append(protocol).append('\'');
        sb.append(", port=").append(port);
        sb.append(", threads=").append(threads);
        sb.append(", version='").append(version).append('\'');
        sb.append(", group='").append(group).append('\'');
        sb.append(", client='").append(client).append('\'');
        sb.append(", server='").append(server).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
