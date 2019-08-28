/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metamug.plugin;

import com.metamug.entity.Response;
import com.metamug.exec.ResultProcessable;
import com.metamug.plugin.entity.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

/**
 *
 * @author anishhirlekar
 */
public class ResultExample implements ResultProcessable {
    @Override
    public Response process(SortedMap[] results, String[] columnNames, int rowCount) {
        List<Customer> customers = new ArrayList<>();
        for(SortedMap row: results) {
            Customer customer = new Customer();
            customer.setName(row.get("customer_name").toString());
            customer.setContact("8080808080","ex@ample.com");
            customers.add(customer);
        }
        Response resp = new Response(customers);
        return resp;
    }    
}
