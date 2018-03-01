package com.softserve.adjoint.controller;

import adjoint.uplink_sdk.client.Response;
import adjoint.uplink_sdk.client.UplinkSDK;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/v1/")
public class AdjointController {

//    @Autowired
//    private AdjointService adjointService;

    private String unsecure = "http://";
    private UplinkSDK uplink = new UplinkSDK(unsecure, "localhost", "8545");

    @RequestMapping(value = "/blocks", method = RequestMethod.GET)
    public Response getBlocks() {
        return uplink.getBlocks();
    }

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public Response getAccounts() {
        return uplink.getAccounts();
    }

    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public Response getAccount(@RequestParam String address) {
        return uplink.getAccount(address);
    }

    @RequestMapping(value = "/assets", method = RequestMethod.GET)
    public Response getAssets() {
        return uplink.getAssets();
    }

}
