/*
 * JBoss, Home of Professional Open Source.
 * See the COPYRIGHT.txt file distributed with this work for information
 * regarding copyright ownership.  Some portions may be licensed
 * to Red Hat, Inc. under one or more contributor license agreements.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA.
 */
package org.teiid.examples.app.customer;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.io.Serializable;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@XmlRootElement(name = "customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = 4766793820542316647L;
    
    private String customernumber;
    
    private String customername;
    
    private String contactlastname;
    
    private String contactfirstname;
    
    private String phone;
    
    private String addressline1;
    
    private String addressline2;
    
    private String city;
    
    private String state;
    
    private String postalcode;
    
    private String country;
    
    private String salesrepemployeenumber;
    
    private String creditlimit;
    
    @GET
    @Produces({ MediaType.APPLICATION_XML })
    @ApiOperation(value = "get a customer", notes = "get a customer as xml")
    @ApiResponses({@ApiResponse(code = 404, message = "Customer not found")})
    public Customer get() {
        return this;
    }
    
    @PUT
    @ApiOperation(value = "Update an existing customer")
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid Customer supplied") })
    public void update(@ApiParam(value = "Customer object that needs to be passed", required = true) Customer c){
        this.setCustomernumber(c.getCustomernumber());
        this.setCustomername(c.getCustomername());
        this.setContactfirstname(c.getContactfirstname());
        this.setContactlastname(c.getContactlastname());
        this.setPhone(c.getPhone());
        this.setAddressline1(c.getAddressline1());
        this.setAddressline2(c.getAddressline2());
        this.setCity(c.getCity());
        this.setState(c.getState());
        this.setPostalcode(c.getPostalcode());
        this.setCountry(c.getCountry());
        this.setSalesrepemployeenumber(c.getSalesrepemployeenumber());
        this.setCreditlimit(c.getCreditlimit());
    }

    @XmlElement(name = "customernumber")
    public String getCustomernumber() {
        return customernumber;
    }

    @PUT
    @Consumes("text/plain")
    @Path("customernumber")
    @ApiOperation(value = "Update an existing customer's number")
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid customernumber supplied") })
    public void setCustomernumber(@ApiParam(value = "Customer number that needs to be passed", required = true) String customernumber) {
        this.customernumber = customernumber;
    }

    @XmlElement(name = "customername")
    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    @XmlElement(name = "contactlastname")
    public String getContactlastname() {
        return contactlastname;
    }

    public void setContactlastname(String contactlastname) {
        this.contactlastname = contactlastname;
    }

    @XmlElement(name = "contactfirstname")
    public String getContactfirstname() {
        return contactfirstname;
    }

    public void setContactfirstname(String contactfirstname) {
        this.contactfirstname = contactfirstname;
    }

    @XmlElement(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @XmlElement(name = "addressline1")
    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    @XmlElement(name = "addressline2")
    public String getAddressline2() {
        return addressline2;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    @XmlElement(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @XmlElement(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @XmlElement(name = "postalcode")
    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    @XmlElement(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @XmlElement(name = "salesrepemployeenumber")
    public String getSalesrepemployeenumber() {
        return salesrepemployeenumber;
    }

    public void setSalesrepemployeenumber(String salesrepemployeenumber) {
        this.salesrepemployeenumber = salesrepemployeenumber;
    }

    @XmlElement(name = "creditlimit")
    public String getCreditlimit() {
        return creditlimit;
    }

    public void setCreditlimit(String creditlimit) {
        this.creditlimit = creditlimit;
    }

    @Override
    public String toString() {
        return "Customer [customernumber=" + customernumber + ", customername="
                + customername + ", contactlastname=" + contactlastname
                + ", contactfirstname=" + contactfirstname + ", phone=" + phone
                + ", addressline1=" + addressline1 + ", addressline2="
                + addressline2 + ", city=" + city + ", state=" + state
                + ", postalcode=" + postalcode + ", country=" + country
                + ", salesrepemployeenumber=" + salesrepemployeenumber
                + ", creditlimit=" + creditlimit + "]";
    }
    

}
