package com.master.spring.restful.webservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @GetMapping("/url-version1")
    public ProductV1 getURIProductV1() {
        ProductV1 version1 = new ProductV1("Amazon V1", Long.valueOf(1L), "Version 1 of Amazon");
        return version1;
    }

    @GetMapping("/url-version2")
    public ProductV2 getURIProductV2() {
        RestVersion version = new RestVersion("2.0", "Amazon");
        ProductV2 product = new ProductV2("Amazon", Long.valueOf(1L), version);
        return product;
    }

    @GetMapping(value = "/url-param-version1", params = "version=1")
    public ProductV1 getVersionParam1() {
        ProductV1 version1 = new ProductV1("Amazon V1", Long.valueOf(1L), "Version 1 of Amazon");
        return version1;
    }

    @GetMapping(value = "/url-param-version2", params = "version=2")
    public ProductV2 getVersionParam2() {
        RestVersion version = new RestVersion("2.0", "Amazon");
        ProductV2 product = new ProductV2("Amazon", Long.valueOf(1L), version);
        return product;

    }

    @GetMapping(value = "/url-headers-version1", headers = "version=1")
    public ProductV1 getVersionHeaders1() {
        ProductV1 version1 = new ProductV1("Amazon V1", Long.valueOf(1L), "Version 1 of Amazon");
        return version1;
    }


    @GetMapping(value = "/url-headers-version2", headers = "version=2")
    public ProductV2 getVersionHeaders2() {
        RestVersion version = new RestVersion("2.0", "Amazon");
        ProductV2 product = new ProductV2("Amazon", Long.valueOf(1L), version);
        return product;

    }

    @GetMapping(value = "/url-produces-version1", produces = "application/app-v1+json")
    public ProductV1 getVersionProduces1() {
        ProductV1 version1 = new ProductV1("Amazon V1", Long.valueOf(1L), "Version 1 of Amazon");
        return version1;
    }


    @GetMapping(value = "/url-produces-version2", produces = "application/app-v2+json")
    public ProductV2 getVersionProduces2() {
        RestVersion version = new RestVersion("2.0", "Amazon");
        ProductV2 product = new ProductV2("Amazon", Long.valueOf(1L), version);
        return product;

    }
}
