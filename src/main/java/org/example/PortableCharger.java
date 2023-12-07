package org.example;

import org.example.cable.UsbCable;

public class PortableCharger {

    public void charge(UsbCable usbCable){
        System.out.println("PortableCharger :" + usbCable.getConnectDeviceName() + "USB 충전 ...");
    }

}
