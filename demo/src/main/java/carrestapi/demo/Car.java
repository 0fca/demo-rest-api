package carrestapi.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// TODO: Czemu ta klasa i kilka innych jest tutaj skoro masz folder model w którym masz inne encje?
// TODO: Staraj się nie tworzyć anemicznych encji, które nic nie robią.
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private int year;

    public Car() {
    }

    public Car(Long id, String make, String model, int year) {
        this.id = id;
        this.brand = make;
        this.model = model;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
