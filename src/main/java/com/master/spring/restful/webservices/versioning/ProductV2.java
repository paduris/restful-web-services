package com.master.spring.restful.webservices.versioning;

public class ProductV2 {

    private String productName;
    private Long productId;
    private RestVersion versionInfo;

    public ProductV2(String productName, Long productId, RestVersion versionInfo) {
        this.productName = productName;
        this.productId = productId;
        this.versionInfo = versionInfo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public RestVersion getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(RestVersion versionInfo) {
        this.versionInfo = versionInfo;
    }
}
