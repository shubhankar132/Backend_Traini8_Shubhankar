package com.restapi.springboot.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "Info")
public class Trains {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 40, nullable = false)
    @Size(max = 40, message = "Center name must be less than 40 characters")
    @NotNull(message = "Center name is required")
    private String centerName;

    @Column(length = 12, nullable = false, unique = true)
    @Size(min = 12, max = 12, message = "Center code must be exactly 12 characters")
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center code must be alphanumeric and exactly 12 characters")
    @NotNull(message = "Center code is required")
    private String centerCode;

    @Embedded
    private Address address;

    @NotNull(message = "Student capacity is required")
    private Integer studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    @NotNull(message = "Created on is required")
    private Long createdOn;

    @Email(message = "Email should be valid")
    private String contactEmail;

    @Column(nullable = false)
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be exactly 10 digits")
    @NotNull(message = "Contact phone is required")
    private String contactPhone;

    // Default constructor
    public Trains() {
        this.createdOn = Instant.now().getEpochSecond();
    }

    // Parameterized constructor
    public Trains(String centerName, String centerCode, Address address, Integer studentCapacity, List<String> coursesOffered, String contactEmail, String contactPhone) {
        this.centerName = centerName;
        this.centerCode = centerCode;
        this.address = address;
        this.studentCapacity = studentCapacity;
        this.coursesOffered = coursesOffered;
        this.createdOn = Instant.now().getEpochSecond();
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(Integer studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public List<String> getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(List<String> coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public Long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}

@Embeddable
class Address {
    @NotNull(message = "Detailed address is required")
    private String detailedAddress;

    @NotNull(message = "City is required")
    private String city;

    @NotNull(message = "State is required")
    private String state;

    @NotNull(message = "Pincode is required")
    private String pincode;

    // Default constructor
    public Address() {}

    // Parameterized constructor
    public Address(String detailedAddress, String city, String state, String pincode) {
        this.detailedAddress = detailedAddress;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    // Getters and setters
    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
