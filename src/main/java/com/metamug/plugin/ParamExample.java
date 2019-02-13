/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metamug.plugin;

import java.util.Map;
import javax.sql.DataSource;

/**
 *
 * @author anishhirlekar
 */
public class ParamExample extends RequestExample {
    @Override
    public Object process(Map<String, String> params, DataSource ds, Map<String, String> requestHeaders) {
        params.entrySet().forEach(entry -> {
            System.out.println();
            System.out.println("Name: "+entry.getKey());
            System.out.println("Value: "+entry.getValue());
        });
        
        return null;
    }
}
