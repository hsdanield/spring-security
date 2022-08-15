package com.hsdanield.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daniel
 */
@RestController
public class BalanceController {

    @GetMapping("/myBalance")
    public String getBalanceDetails(String input) {
        return "Here are the balance details from the DB";
    }

}