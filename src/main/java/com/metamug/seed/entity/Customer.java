/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metamug.seed.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author deepak
 */
@XmlRootElement
public class Customer {

    private String name;
    @XmlElement(name = "contact")
    private Contact contact;

    public void setName(String n) {
        name = n;
    }

    public void setContact(String phone, String email) {
        contact = new Contact();
        contact.setEmail(email);
        contact.setPhone(phone);
    }

    public String getName() {
        return name;
    }

    public Contact getContact() {
        return contact;
    }    
 }