/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metamug.plugin;

import com.metamug.exec.RequestProcessable;
import com.metamug.plugin.entity.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;


/**
 *
 * @author anishhirlekar
 */
public class RequestExample implements RequestProcessable {
    @Override
    public Object process(Map<String, String> params, DataSource ds, Map<String, String> requestHeaders) {

        Customer customer = new Customer();
        customer.setName("John");
        customer.setContact("8080808080", "john@example.com");

        Customer customer2 = new Customer();
        customer2.setName("Jane");
        customer2.setContact("1212121212", "jane@example.com");

        List<Customer> customers = new ArrayList<>();
        customers.add(customer);
        customers.add(customer2);

        return customers;
    }
}
