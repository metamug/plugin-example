/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metamug.plugin;

import com.metamug.entity.Response;
import com.metamug.exec.ResponseProcessable;
import org.json.JSONObject;

/**
 *
 * @author anishhirlekar
 */
public class ResponseExample implements ResponseProcessable {

    @Override
    public Response process(Response response) throws Exception {
        JSONObject body = (JSONObject)response.getPayload();
        JSONObject args = body.getJSONObject("args");
        
        args.put("foo3", "bar3");
        args.put("foo4", "bar4");
        
        return response;
    }    
}
