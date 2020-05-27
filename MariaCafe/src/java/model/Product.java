/*
* Product.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
 */
package model;

/**
 * Product.<br>
 *
 * <pre>
 * Class mô tả đối tượng Product
 * Trong class này sẽ tiến hành các xử lí dưới đây
 *
 * . getId.
 * . getId.
 * . getName.
 * . setName.
 * . getPicture.
 * . setPicture.
 * . getShortDescription.
 * . setShortDescription.
 * . getDetailDescription.
 * . setDetailDescription.
 * . getPrice.
 * . setPrice.
 * </pre>
 *
 * @author FU Kiennthe130540
 * @version 1.0
 */
public class Product {

    /**
     * Store ID.
     */
    private int id;
    /**
     * Store Name.
     */
    private String name;
    /**
     * Store Picture.
     */
    private String picture;
    /**
     * Store ShortDescription.
     */
    private String shortDescription;
    /**
     * Store DetailDescription.
     */
    private String detailDescription;
    /**
     * Store Price.
     */
    private String price;

    /**
     * Constructor no parameter.<br>
     */
    public Product() {
    }
    
    /**
     * Constructor full parameter<br>
     *
     * @param id
     * @param name 
     * @param picture 
     * @param shortDescription 
     * @param detailDescription
     * @param price
     */
    public Product(int id, String name, String picture, String shortDescription, String detailDescription, String price) {
        this.id = id;
        this.name = name;
        this.picture = picture;
        this.shortDescription = shortDescription;
        this.detailDescription = detailDescription;
        this.price = price;
    }

    /**
     * get id <br>
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Set id.<br>
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * get name <br>
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set name.<br>
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get picture <br>
     *
     * @return the picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     * Set picture.<br>
     *
     * @param picture the picture
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * get shortDescription <br>
     *
     * @return the shortDescription
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Set shortDescription.<br>
     *
     * @param shortDescription the shortDescription
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * get detailDescription <br>
     *
     * @return the detailDescription
     */
    public String getDetailDescription() {
        return detailDescription;
    }

    /**
     * Set detailDescription.<br>
     *
     * @param detailDescription the detailDescription
     */
    public void setDetailDescription(String detailDescription) {
        this.detailDescription = detailDescription;
    }

    /**
     * get price <br>
     *
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * Set price.<br>
     *
     * @param price the price
     */
    public void setPrice(String price) {
        this.price = price;
    }
    
    
}
