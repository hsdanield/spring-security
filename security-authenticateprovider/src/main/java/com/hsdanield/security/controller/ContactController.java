package com.hsdanield.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daniel
 */
@RestController
public class ContactController {

    @GetMapping("/contact")
    public String saveContactInquiryDetails(String input) {
        return "Inquiry details are saved to the DB";
    }

}