package org.example;

import org.example.cable.LightingCable;

public class IPhone implements LightingCable {


    @Override
    public String getLightingConnectDeviceName() {
        return getClass().getSimpleName();
    }
}
