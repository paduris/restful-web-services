package com.master.spring.restful.webservices.versioning;

public class RestVersion {

    private String versionNumber;
    private String versionName;

    public RestVersion(String versionNumber, String versionName) {
        this.versionNumber = versionNumber;
        this.versionName = versionName;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }


}
