package com.hsdanield.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daniel
 */

@RestController
public class LoansController {

    @GetMapping("/myLoans")
    public String getLoanDetails(String input) {
        return "Here are the loan details from the DB";
    }

}
