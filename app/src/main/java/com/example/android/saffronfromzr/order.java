package com.example.android.saffronfromzr;

import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;

@IgnoreExtraProperties

public class order {
    private String orderDate;
    private String deliveryDate;
    private String customerName;
    private Boolean isHandWork;
    private Boolean workComplete;
    private String designerId;
    private String designerId_deliveryDate;
   private HashMap<String,String> items=new HashMap<>();
    public order()
    {

    }


    public order(String designerId_deliveryDate,String designerId,String orderDate, String deliveryDate, String customerName,Boolean isHandWork,HashMap<String, String> items,Boolean workComplete)
    {
        this.workComplete=workComplete;
        this.designerId_deliveryDate=designerId_deliveryDate;
        this.designerId=designerId;
        this.orderDate=orderDate;
        this.deliveryDate=deliveryDate;
        this.customerName=customerName;
        this.isHandWork=isHandWork;
        this.items=items;

    }

    public Boolean getWorkComplete() {
        return workComplete;
    }

    public String getDesignerId_deliveryDate() {
        return designerId_deliveryDate;
    }

    public String getDesignerId() {
        return designerId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Boolean getHandWork() {
        return isHandWork;
    }

    public HashMap<String, String> getItems() {
        return items;
    }
}
