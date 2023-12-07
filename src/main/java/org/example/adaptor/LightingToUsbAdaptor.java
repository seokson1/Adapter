package org.example.adaptor;

import org.example.IPhone;
import org.example.cable.CtypeCable;
import org.example.cable.LightingCable;
import org.example.cable.UsbCable;

public class LightingToUsbAdaptor implements CtypeCable {
    private LightingCable lightingCable;
    public LightingToUsbAdaptor(LightingCable lightingCable) {
        this.lightingCable = lightingCable;
    }

    @Override
    public String getCtypeConnectDeviceName() {
        return lightingCable.getLightingConnectDeviceName();
    }
}
