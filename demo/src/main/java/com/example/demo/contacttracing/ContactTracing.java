package com.example.demo.contacttracing;

import java.text.spi.DateFormatProvider;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ContactTracing {
    private int uuid;
    private String name;
    private String email;
    private String contactNumber;
    private LocalDate dateOfVisit;
    private LocalTime timeVisit;

    public ContactTracing(int uuid,String name,
                          String email,String contactNumber,
                          LocalDate dateOfVisit, LocalTime timeVisit) {
        this.uuid = uuid;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.dateOfVisit = dateOfVisit;
        this.timeVisit = timeVisit;
    }

    public ContactTracing(String name,String email,String contactNumber,
                          LocalDate dateOfVisit, LocalTime timeVisit) {
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.dateOfVisit = dateOfVisit;
        this.timeVisit = timeVisit;
    }

    public int getUuid() {
        return uuid;
    }

    public void setUuid() {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber() {
        this.contactNumber = contactNumber;
    }

    public LocalDate getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit() {
        this.dateOfVisit = dateOfVisit;
    }

    public LocalTime getTimeVisit() {
        return timeVisit;
    }

    public void setTimeVisit() {
        this.timeVisit = timeVisit;
    }
}
