/*
* Share.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
 */
package model;

/**
 * Share.<br>
 *
 * <pre>
 * Class mô tả đối tượng Share
 * Trong class này sẽ tiến hành các xử lí dưới đây
 *
 * . GetIcon.
 * . SetIcon.
 * . GetSocialNetwork.
 * . SetSocialNetwork.
 * . GetUrl.
 * . SetUrl.
 * </pre>
 *
 * @author FU Kiennthe130540
 * @version 1.0
 */
public class Share {

    /**
     * Store icon.
     */
    private String icon;
    /**
     * Store socialNetwork.
     */
    private String socialNetwork;
    /**
     * Store url.
     */
    private String url;

    /**
     * Constructor no parameter.<br>
     */
    public Share() {
    }

    /**
     * Constructor full parameter<br>
     *
     * @param icon
     * @param socialNetwork 
     * @param url
     */
    public Share(String icon, String socialNetwork, String url) {
        this.icon = icon;
        this.socialNetwork = socialNetwork;
        this.url = url;
    }

    /**
     * get icon <br>
     *
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Set icon.<br>
     *
     * @param icon the icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * get socialNetwork <br>
     *
     * @return the socialNetwork
     */
    public String getSocialNetwork() {
        return socialNetwork;
    }

    /**
     * Set socialNetwork.<br>
     *
     * @param socialNetwork the socialNetwork
     */
    public void setSocialNetwork(String socialNetwork) {
        this.socialNetwork = socialNetwork;
    }

    /**
     * get url <br>
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Set url.<br>
     *
     * @param url the url
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
