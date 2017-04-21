package com.gome.o2m.dubbo.sku.api;

import java.io.Serializable;

/**
 * Created by songyigui on 2017/4/21.
 */
public class Sku implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;

    public Sku() {
    }

    public Sku(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sku{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
