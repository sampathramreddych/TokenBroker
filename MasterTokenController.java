package com.tokenbroker.broker.controller;

import com.tokenbroker.broker.controller.model.CosmosHeaders;
import com.tokenbroker.broker.logic.MasterTokenService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/token/master")
public class MasterTokenController {
    public static final Logger LOG = LoggerFactory.getLogger(MasterTokenController.class);

    @Autowired
    MasterTokenService tokenService;

    @GetMapping("read")
    public CosmosHeaders generateAllReadToken(@RequestParam(value = "role")String role) {
        CosmosHeaders headers = tokenService.generateReadAllToken(role);
        return headers;
    }

}
