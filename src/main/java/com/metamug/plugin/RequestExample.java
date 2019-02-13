/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metamug.plugin;

import com.metamug.exec.RequestProcessable;
import com.metamug.plugin.entity.Customer;
import java.util.Map;
import javax.sql.DataSource;

/**
 *
 * @author anishhirlekar
 */
public class RequestExample implements RequestProcessable {
    @Override
    public Object process(Map<String, String> params, DataSource ds, Map<String, String> requestHeaders) {

        params.entrySet().forEach(entry -> {
            System.out.println();
            System.out.println("Name: "+entry.getKey());
            System.out.println("Value: "+entry.getValue());
        });
        
        Customer customer = new Customer();
        customer.setName("John");
        customer.setId(1);
        customer.setContact("8080808080", "john@example.com");

        return customer;
    }
}