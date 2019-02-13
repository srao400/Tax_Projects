/**
 *This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.
 */
package com.tax_projects.emailservice.controller;

import com.tax_projects.emailservice.EmailService;
import java.lang.Exception;
import java.lang.String;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

@RestController
@RequestMapping(value = "/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "")
    public void init() throws Exception {
        emailService.init();
    }

    @RequestMapping(value = "/sendEmail", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "")
    public void sendEmail(@RequestParam(value = "toEmailAddress", required = false) String toEmailAddress, @RequestParam(value = "emailSubject", required = false) String emailSubject, @RequestParam(value = "emailMessage", required = false) String emailMessage) {
        emailService.sendEmail(toEmailAddress, emailSubject, emailMessage);
    }
}
