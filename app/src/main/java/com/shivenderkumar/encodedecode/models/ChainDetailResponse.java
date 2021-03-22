package com.shivenderkumar.encodedecode.models;

import java.util.List;

public class ChainDetailResponse {
    public int id;
    public String Name;
    public String Desc;
    public String Tel;
    public String Fax;
    public String Email;
    public int LoyaltyRulesCnt;
    public List<ChainDetailResponseLocationList> LocationList;


    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ",\"Name\":'" + Name + '\'' +
                ",\"Desc\":'" + Desc + '\'' +
                ",\"Tel\":'" + Tel + '\'' +
                ",\"Fax\":'" + Fax + '\'' +
                ",\"Email\":'" + Email + '\'' +
                ",\"LoyaltyRulesCnt\":" + LoyaltyRulesCnt +
                ",\"LocationList\":" + LocationList +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tell) {
        Tel = tell;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getLoyaltyRulesCnt() {
        return LoyaltyRulesCnt;
    }

    public void setLoyaltyRulesCnt(int loyaltyRulesCnt) {
        LoyaltyRulesCnt = loyaltyRulesCnt;
    }

    public List<ChainDetailResponseLocationList> getLocationList() {
        return LocationList;
    }

    public void setLocationList(List<ChainDetailResponseLocationList> locationList) {
        LocationList = locationList;
    }
}
