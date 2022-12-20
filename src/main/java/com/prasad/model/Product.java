package com.prasad.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productid")
    private long productId;

    @Column(name = "productname")
    private String productName;

    @Column(name = "productdescription")
    private String productDescription;

    @Column(name = "productmeasure")
    private String productMeasure;

    @Column(name = "productquantity")
    private String productQuantity;

    @Column(name = "productcategory")
    private String productCategory;

    public Product(String productName, String productDescription, String productMeasure, String productQuantity, String productCategory) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productMeasure = productMeasure;
        this.productQuantity = productQuantity;
        this.productCategory = productCategory;
    }
}
