package com.greymatter.qrpayment.domain;

public class Merchant {
    private String merchantId;
    private String name;
    private String email;
    private String type;
    private String callBackUrl;

    public Merchant(String merchantId, String name, String email, String type) {
        this.merchantId = merchantId;
        this.name = name;
        this.email = email;
        this.type = type;
    }

    private void validateRequiredField(){
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("email is required");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name is required");
        }
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type is required");
        }
    }
}
