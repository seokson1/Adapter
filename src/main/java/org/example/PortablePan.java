package org.example;

import org.example.cable.UsbCable;

public class PortablePan implements UsbCable {
    @Override
    public String getConnectDeviceName() {
        return getClass().getSimpleName();
    }
}
