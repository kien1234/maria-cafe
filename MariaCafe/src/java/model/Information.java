/*
* Information.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
 */
package model;

/**
 * Information.<br>
 *
 * <pre>
 * Class mô tả đối tượng Information
 * Trong class này sẽ tiến hành các xử lí dưới đây
 *
 * . getId.
 * . getId.
 * . getTitle.
 * . setTitle.
 * . getPicture.
 * . setPicture.
 * . getShortDescription.
 * . setShortDescription.
 * . getDetailDescription.
 * . setDetailDescription.
 * . getAddress.
 * . setAddress.
 * . getTel.
 * . setTel.
 * . getEmail.
 * . setEmail.
 * . getOpeningHours.
 * . setOpeningHours.
 * . getMap.
 * . setMap.
 * </pre>
 *
 * @author FU Kiennthe130540
 * @version 1.0
 */
public class Information {
    /**
     * Store ID.
     */
    private int id;
    /**
     * Store Title.
     */
    private String title;
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
     * Store Address.
     */
    private String address;
    /**
     * Store Tel.
     */
    private String tel;
    /**
     * Store Email.
     */
    private String email;
    /**
     * Store OpeningHours.
     */
    private String openingHours;
    /**
     * Store Map.
     */
    private String map;

    /**
     * Constructor no parameter.<br>
     */
    public Information() {
    }

    /**
     * Constructor full parameter<br>
     *
     * @param id
     * @param title 
     * @param picture 
     * @param shortDescription 
     * @param detailDescription
     * @param address
     * @param tel
     * @param email
     * @param openingHours
     * @param map
     */
    public Information(int id, String title, String picture, String shortDescription, String detailDescription, String address, String tel, String email, String openingHours, String map) {
        this.id = id;
        this.title = title;
        this.picture = picture;
        this.shortDescription = shortDescription;
        this.detailDescription = detailDescription;
        this.address = address;
        this.tel = tel;
        this.email = email;
        this.openingHours = openingHours;
        this.map = map;
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
     * get title <br>
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set title.<br>
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
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
     * get address <br>
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set address.<br>
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * get tel <br>
     *
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * Set tel.<br>
     *
     * @param tel the tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * get email <br>
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set email.<br>
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get openingHours <br>
     *
     * @return the openingHours
     */
    public String getOpeningHours() {
        return openingHours;
    }

    /**
     * Set openingHours.<br>
     *
     * @param openingHours the openingHours
     */
    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    /**
     * get map <br>
     *
     * @return the map
     */
    public String getMap() {
        return map;
    }

    /**
     * Set map.<br>
     *
     * @param map the map
     */
    public void setMap(String map) {
        this.map = map;
    }
    
    
}
