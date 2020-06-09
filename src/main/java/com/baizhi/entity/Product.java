package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {
    private static final long serialVersionUID = -2202431845517087703L;

    private int p_id;
    private String p_name;
    private String produce_place;
    private double p_price;
    private Date onsale_date;

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "p_id=" + p_id +
                ", p_name='" + p_name + '\'' +
                ", produce_place='" + produce_place + '\'' +
                ", p_price=" + p_price +
                ", onsale_date=" + onsale_date +
                '}';
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getProduce_place() {
        return produce_place;
    }

    public void setProduce_place(String produce_place) {
        this.produce_place = produce_place;
    }

    public double getP_price() {
        return p_price;
    }

    public void setP_price(double p_price) {
        this.p_price = p_price;
    }

    public Date getOnsale_date() {
        return onsale_date;
    }

    public void setOnsale_date(Date onsale_date) {
        this.onsale_date = onsale_date;
    }
}
