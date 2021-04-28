package com.example.listing;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * This class is used for representing com.example.listing data
 * @contains
 * com.example.listing id
 * attributes - com.example.listing attributes are stored in attributes map
 * Key is the name of the attribute and value is the data of the attribute
 *
 *getter and setter methods for listingId and attributes
 * Created by jananiravi on 7/7/16.
 */
public class Listing {
    // listingid value
    private String listingId;
    // attributes of com.example.listing object
    private Map<String, Object> attributes = Maps.newHashMap();


    public Listing() {
    }

    // Returns the listingid
    public String getListingId() {
        return listingId;
    }
    // to set the com.example.listing id when creating com.example.listing object
    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    //Returns map of attributes of com.example.listing
    public Map<String, Object> getAttributes() {
        return attributes;
    }
    // to set the attributes map when creating com.example.listing object
    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Listing{" +
                "listingId='" + listingId + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}

