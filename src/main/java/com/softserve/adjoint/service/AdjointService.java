package com.softserve.adjoint.service;

import adjoint.uplink_sdk.client.Response;
import adjoint.uplink_sdk.client.UplinkSDK;
import org.springframework.stereotype.Service;

@Service
public class AdjointService {
    private String unsecure = "http://";
    String secure = "https://";
    private UplinkSDK uplink = new UplinkSDK(unsecure, "localhost", "8545");

    public Response getBlocks() {
        return uplink.getBlocks();
    }
}
