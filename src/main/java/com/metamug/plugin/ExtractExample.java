/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metamug.plugin;

import com.metamug.entity.Request;
import com.metamug.entity.Response;
import com.metamug.exec.RequestProcessable;
import java.util.Map;
import javax.sql.DataSource;

/**
 *
 * @author anishhirlekar
 */
public class ExtractExample implements RequestProcessable {

    @Override
    public Response process(Request request, DataSource ds, Map<String, Object> bus, Map<String, String> args) throws Exception {
        String value = args.get("foo1");
        
        Response r = new Response("foo1");
        return r;
    }
}