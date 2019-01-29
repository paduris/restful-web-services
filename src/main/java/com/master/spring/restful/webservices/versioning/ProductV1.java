package com.master.spring.restful.webservices.versioning;

public class ProductV1 {
    private String name;
    private Long id;
    private String desc;

    public ProductV1(String name, Long id, String desc) {
        this.name = name;
        this.id = id;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
