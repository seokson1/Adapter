package org.example;

import org.example.adaptor.CtypeToUsbAdaptor;
import org.example.adaptor.LightingToUsbAdaptor;
import org.example.cable.LightingCable;
import org.example.cable.UsbCable;

public class Main {
    public static void main(String[] args) {

        MacBook macBook = new MacBook(); // C-type
        IPhone iphone = new IPhone(); // 8-pin
        PortablePan pan = new PortablePan(); // USB

        PortableCharger portableCharger = new PortableCharger(); // USB
        portableCharger.charge(pan);
        portableCharger.charge(new CtypeToUsbAdaptor(macBook));
        portableCharger.charge(new CtypeToUsbAdaptor(new LightingToUsbAdaptor(iphone)));

        //8-pin -> USB X
        //8-pin -> C type -> USB
    }
}