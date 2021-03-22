package com.shivenderkumar.encodedecode.models;

public class ChainDetailResponseLocationList {
    public int Id;
    public String Name;
    public ChainDetailResponseAddress Address;
    public String Tel;
    public double Lon;
    public double Lat;
    public double Tax;
    public String MiscMask;
    public String UrlName;
    public String Active;
    public boolean isUnlinkedForPortal;



    @Override
    public String toString() {
        return "{" +
                "\"Id\":" + Id +
                ",\"Name\":'" + Name + '\'' +
                ",\"Address\":" + Address +
                ",\"Tel\":'" + Tel + '\'' +
                ",\"Lon\":" + Lon +
                ",\"Lat\":" + Lat +
                ",\"Tax\":" + Tax +
                ",\"MiscMask\":'" + MiscMask + '\'' +
                ",\"UrlName\":'" + UrlName + '\'' +
                ",\"Active\":'" + Active + '\'' +
                ",\"isUnlinkedForPortal\":" + isUnlinkedForPortal +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ChainDetailResponseAddress getAddress() {
        return Address;
    }

    public void setAddress(ChainDetailResponseAddress address) {
        Address = address;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public double getLon() {
        return Lon;
    }

    public void setLon(double lon) {
        Lon = lon;
    }

    public double getLat() {
        return Lat;
    }

    public void setLat(double lat) {
        Lat = lat;
    }

    public double getTax() {
        return Tax;
    }

    public void setTax(double tax) {
        Tax = tax;
    }

    public String getMiscMask() {
        return MiscMask;
    }

    public void setMiscMask(String miscMask) {
        MiscMask = miscMask;
    }

    public String getUrlName() {
        return UrlName;
    }

    public void setUrlName(String urlName) {
        UrlName = urlName;
    }

    public String getActive() {
        return Active;
    }

    public void setActive(String active) {
        Active = active;
    }

    public boolean isUnlinkedForPortal() {
        return isUnlinkedForPortal;
    }

    public void setUnlinkedForPortal(boolean unlinkedForPortal) {
        isUnlinkedForPortal = unlinkedForPortal;
    }
}
