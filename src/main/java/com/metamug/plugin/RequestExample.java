/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metamug.plugin;

import com.metamug.entity.Request;
import com.metamug.entity.Response;
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
    public Response process(Request request, DataSource ds, Map<String, Object> args) throws Exception {
        Customer customer = new Customer();
        customer.setName("John");
        customer.setId(1);
        customer.setContact("8080808080", "john@example.com");

        Response resp = new Response(customer);
        return resp;
    }
}