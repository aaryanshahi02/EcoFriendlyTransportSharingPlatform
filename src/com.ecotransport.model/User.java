package com.ecotransport.model;

public class User {
    private int userId;
    private String name;
    private String contactInfo;
    private String email;

    // Getters and Setters
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}

