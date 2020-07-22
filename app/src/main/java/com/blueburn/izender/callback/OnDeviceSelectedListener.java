package com.blueburn.izender.callback;

import com.blueburn.izender.object.NetworkDevice;

import java.util.List;

public interface OnDeviceSelectedListener
{
    void onDeviceSelected(NetworkDevice.Connection connection, List<NetworkDevice.Connection> availableInterfaces);
}
