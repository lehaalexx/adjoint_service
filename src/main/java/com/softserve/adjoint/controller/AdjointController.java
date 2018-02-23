package com.softserve.adjoint.controller;

import adjoint.uplink_sdk.client.Response;
import com.softserve.adjoint.service.AdjointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/v1/")
public class AdjointController {

    @Autowired
    private AdjointService adjointService;

    @RequestMapping(value = "/blocks", method = RequestMethod.GET)
    public Response getBLocks() {
        return adjointService.getBlocks();
    }
}
