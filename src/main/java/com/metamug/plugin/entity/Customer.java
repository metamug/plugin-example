/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metamug.plugin.entity;

import com.metamug.entity.DTO;


/**
 *
 * @author deepak
 */
public class Customer implements DTO {
    private int id;
    private String name;
    private Contact contact;

    public void setName(String n) {
        name = n;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setContact(String phone, String email) {
        contact = new Contact();
        contact.setEmail(email);
        contact.setPhone(phone);
    }

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public Contact getContact() {
        return contact;
    }    
 }