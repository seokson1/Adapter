package org.example.adaptor;

import org.example.MacBook;
import org.example.cable.CtypeCable;
import org.example.cable.UsbCable;

public class CtypeToUsbAdaptor implements UsbCable {
    private CtypeCable ctypeCable;
    public CtypeToUsbAdaptor(CtypeCable ctypeCable) {
        this.ctypeCable = ctypeCable;
    }

    @Override
    public String getConnectDeviceName() {
        return ctypeCable.getCtypeConnectDeviceName();
    }
}
