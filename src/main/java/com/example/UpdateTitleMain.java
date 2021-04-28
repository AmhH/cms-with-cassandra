package com.example;

import com.google.common.collect.Maps;
import com.example.common.dto.AttributeNames;
import com.example.common.dto.CommonPersistenceHandler;
import com.example.listing.Listing;
import com.example.persistence.Connector;
import com.example.product.Product;

import java.util.Map;

/**
 * Uodates title in the com.example.product and com.example.listing CF
 * Created by navdeepsingh on 24/07/16.
 * You can test this example by running the main() method
 */
public class UpdateTitleMain {

    public static void main(String[] args){

        updateTitle();
        Connector.close();
        System.out.println("Closing the session");
    }

    private static void updateTitle(){
        CommonPersistenceHandler persistenceHandler = new CommonPersistenceHandler();

        // create com.example.listing object containg primary key and title
        Listing listing = new Listing();
        listing.setListingId("LISTINGFABSOFA5");
        Map<String, Object> attributes = Maps.newHashMap();
        attributes.put(AttributeNames.PRODUCTID.getValue(), "SOFA5");
        // new title value
        attributes.put(AttributeNames.TITLE.getValue(), "Urban Living Sofa-Bed 3 Seater");
        listing.setAttributes(attributes);

        // create com.example.product object containg primary key and title
        Product product = new Product();
        product.setProductId("SOFA5");

        Map<String, Object> attributesMap = Maps.newHashMap();
        attributesMap.put(AttributeNames.CATEGORY.getValue(), "sofa");
        attributesMap.put(AttributeNames.BRAND.getValue(), "Fab");
        // new title value
        attributesMap.put(AttributeNames.TITLE.getValue(), "Urban Living Sofa-Bed 3 Seater");
        product.setAttributesMap(attributesMap);

        // updates the data
        persistenceHandler.updatetitle(listing, product);


    }
}
