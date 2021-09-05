package com.com.visitors.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "visitor")
public class Visitor {

    @Column
    @Id
    @SequenceGenerator(name="visitor",sequenceName="visitor_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="visitor")
    private Long id;

    @Column
    private String firstName;

    private String lastName;

    @Column
    private String phoneNumber;

    @Column
    private String personToVisit;

    @Column
    private String reasonToVisit;

    @Column
    private LocalDateTime visitDateTime;

    @Column
    private LocalDateTime checkOutDateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPersonToVisit() {
        return personToVisit;
    }

    public void setPersonToVisit(String personToVisit) {
        this.personToVisit = personToVisit;
    }

    public String getReasonToVisit() {
        return reasonToVisit;
    }

    public void setReasonToVisit(String reasonToVisit) {
        this.reasonToVisit = reasonToVisit;
    }

    public LocalDateTime getVisitDateTime() {
        return visitDateTime;
    }

    public void setVisitDateTime(LocalDateTime visitDateTime) {
        this.visitDateTime = visitDateTime;
    }

    public LocalDateTime getCheckOutDateTime() {
        return checkOutDateTime;
    }

    public void setCheckOutDateTime(LocalDateTime checkOutDateTime) {
        this.checkOutDateTime = checkOutDateTime;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", personToVisit='" + personToVisit + '\'' +
                ", reasonToVisit='" + reasonToVisit + '\'' +
                ", visitDateTime=" + visitDateTime +
                ", checkOutDateTime=" + checkOutDateTime +
                '}';
    }
}
