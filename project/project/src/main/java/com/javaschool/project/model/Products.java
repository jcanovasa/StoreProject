package com.javaschool.project.model;

//import org.apache.commons.math3.analysis.function.Identity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name = "products")
public class Products { 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Primary key autoincremental
    private int id;

    @Column(name = "title_product", nullable = false)
    private String title;

    @Column(name =  "price", nullable = false)
    private float price;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "parameters")
    private String parameters;

    @Column(name = "weight")
    private float weight;

    @Column(name = "volume")
    private float volume; 

    //Constructor
    public Products(int id, String title, float price, String category, String parameters, float weight, float volume) {
        super(); //No sería necesario, el super(...) es para cuando heredamos ... de otra clase.
        this.id = id;
        this.title = title;
        this.price = price;
        this.category = category;
        this.parameters = parameters;
        this.weight = weight;
        this.volume = volume;
    }

    //Genero los getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category; 
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }
}
