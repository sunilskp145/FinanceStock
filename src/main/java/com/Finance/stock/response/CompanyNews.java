package com.Finance.stock.response;

public class CompanyNews {

    private String uuid;
    private String title;
    private String publisher;
    private Integer providerPublishTime;
    private String type;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getProviderPublishTime() {
        return providerPublishTime;
    }

    public void setProviderPublishTime(Integer providerPublishTime) {
        this.providerPublishTime = providerPublishTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
