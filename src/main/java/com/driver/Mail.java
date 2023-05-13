package com.driver;

import java.util.Date;

public class Mail {
    private String senderId;
    private String message;
    private Date date;
    public Mail(Date date ,String senderId,String message){
        this.date=date;
        this.senderId=senderId;
        this.message=message;
    }
    public Mail(){

    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
