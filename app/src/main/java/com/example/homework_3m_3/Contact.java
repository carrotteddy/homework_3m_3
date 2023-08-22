package com.example.homework_3m_3;

public class Contact {
    private String name;
    private int contactImage;

    public Contact(String name, int contactImage) {
        this.name = name;
        this.contactImage = contactImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContactImage() {
        return contactImage;
    }

    public void setContactImage(int contactImage) {
        this.contactImage = contactImage;
    }
}
