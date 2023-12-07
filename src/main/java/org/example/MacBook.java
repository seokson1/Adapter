package org.example;

import org.example.cable.CtypeCable;

public class MacBook implements CtypeCable {

    @Override
    public String getCtypeConnectDeviceName() {
        return getClass().getSimpleName();
    }
}
