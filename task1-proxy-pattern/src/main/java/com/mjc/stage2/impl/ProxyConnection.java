package com.mjc.stage2.impl;


import com.mjc.stage2.Connection;

public class ProxyConnection implements Connection {
    private RealConnection realConnection;

    public ProxyConnection(RealConnection realConnection) {
        this.realConnection = realConnection;
    }

    public void reallyClose() {
        // Write your code here!

    }

    public RealConnection getRealConnection() {
        return realConnection;
    }

    public void setRealConnection(RealConnection realConnection) {
        this.realConnection = realConnection;
    }

    @Override
    public void close() {

    }

    @Override
    public boolean isClosed() {
        return false;
    }
    // Implement methods here!
}
