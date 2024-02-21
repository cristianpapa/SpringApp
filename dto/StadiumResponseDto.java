package com.examen.examen.dto;

public class StadiumResponseDto {
    private long id;
    private String name;
    private String city;
    private String country;
    private int capacity;
    public StadiumResponseDto() {
    }
    public StadiumResponseDto(long id, String name, String city, String country, int capacity) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.country = country;
        this.capacity = capacity;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    
}
