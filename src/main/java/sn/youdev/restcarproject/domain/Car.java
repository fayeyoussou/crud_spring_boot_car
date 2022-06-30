package sn.youdev.restcarproject.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "brand",nullable = false)
    private String brand;
    @Column(name = "modele",nullable = false)
    private String modele;
    @Column(name = "color",nullable = false)
    private String color;
    @Column(name = "register_number",nullable = false)
    private String registerNumber;
    @Column(name = "year",nullable = false)
    private int year;
    @Column(name = "price",nullable = false)
    private int price;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn( name="owner")
    private Owner owner;

    public Car(String brand, String modele, String color, String registerNumber, int year, int price, Owner owner) {
        this.brand = brand;
        this.modele = modele;
        this.color = color;
        this.registerNumber = registerNumber;
        this.year = year;
        this.price = price;
        this.owner = owner;
    }
}
