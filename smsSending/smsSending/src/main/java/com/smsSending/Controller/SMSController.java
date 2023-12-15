package com.smsSending.Controller;

import com.smsSending.Payload.SmsRequest;
import com.smsSending.Service.SMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SMSController {

    @Autowired
    private SMSService smsService;




    //http://localhost:8080/sendSMS
    @PostMapping("/sendSMS")
    public String sendSMS(@RequestBody SmsRequest smsRequest) {
        smsService.sendSMS(smsRequest.getTo(), smsRequest.getMessage());
        return "SMS sent!";
    }

}
