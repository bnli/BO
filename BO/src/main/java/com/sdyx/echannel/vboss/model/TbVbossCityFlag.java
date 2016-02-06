package com.sdyx.echannel.vboss.model;

public class TbVbossCityFlag {
    private String cityFlag;

    private String stdCityFlag;

    public String getCityFlag() {
        return cityFlag;
    }

    public void setCityFlag(String cityFlag) {
        this.cityFlag = cityFlag == null ? null : cityFlag.trim();
    }

    public String getStdCityFlag() {
        return stdCityFlag;
    }

    public void setStdCityFlag(String stdCityFlag) {
        this.stdCityFlag = stdCityFlag == null ? null : stdCityFlag.trim();
    }
}