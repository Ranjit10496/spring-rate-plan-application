package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "rate_plan")
public class RatePlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private Integer hotel_id;
    private Integer hotel_type_id;

    public RatePlan() {
    }

    public RatePlan(String name, Integer hotel_id, Integer hotel_type_id) {
        this.name = name;
        this.hotel_id = hotel_id;
        this.hotel_type_id = hotel_type_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Integer getHotel_type_id() {
        return hotel_type_id;
    }

    public void setHotel_type_id(Integer hotel_type_id) {
        this.hotel_type_id = hotel_type_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RatePlan ratePlan = (RatePlan) o;
        return Objects.equals(id, ratePlan.id) && Objects.equals(name, ratePlan.name) && Objects.equals(hotel_id, ratePlan.hotel_id) && Objects.equals(hotel_type_id, ratePlan.hotel_type_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, hotel_id, hotel_type_id);
    }

    @Override
    public String toString() {
        return "RatePlan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hotel_id=" + hotel_id +
                ", hotel_type_id=" + hotel_type_id +
                '}';
    }
}
