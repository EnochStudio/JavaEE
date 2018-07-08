package com.enoch.studio.model;

import java.util.Date;

public class Deploy extends DeployKey {
    private String title;

    private Short regionid;

    private Short districtid;

    private String address;

    private Float longitude;

    private Float latitude;

    private String contact;

    private String tel;

    private Date timesave;

    private String operator;

    private Byte deleteflag;

    private String installationcompany;

    private Date installationtime;

    private String installationpersonnelname;

    private String installationpersonnelcontacts;

    private String maintenancepersonnelname;

    private String maintenancepersonnelcontacts;

    private String note;

    private Short sort;

    public Deploy(Short terminalid, Short stationid, String title, Short regionid, Short districtid, String address, Float longitude, Float latitude, String contact, String tel, Date timesave, String operator, Byte deleteflag, String installationcompany, Date installationtime, String installationpersonnelname, String installationpersonnelcontacts, String maintenancepersonnelname, String maintenancepersonnelcontacts, String note, Short sort) {
        super(terminalid, stationid);
        this.title = title;
        this.regionid = regionid;
        this.districtid = districtid;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
        this.contact = contact;
        this.tel = tel;
        this.timesave = timesave;
        this.operator = operator;
        this.deleteflag = deleteflag;
        this.installationcompany = installationcompany;
        this.installationtime = installationtime;
        this.installationpersonnelname = installationpersonnelname;
        this.installationpersonnelcontacts = installationpersonnelcontacts;
        this.maintenancepersonnelname = maintenancepersonnelname;
        this.maintenancepersonnelcontacts = maintenancepersonnelcontacts;
        this.note = note;
        this.sort = sort;
    }

    public Deploy() {
        super();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Short getRegionid() {
        return regionid;
    }

    public void setRegionid(Short regionid) {
        this.regionid = regionid;
    }

    public Short getDistrictid() {
        return districtid;
    }

    public void setDistrictid(Short districtid) {
        this.districtid = districtid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Date getTimesave() {
        return timesave;
    }

    public void setTimesave(Date timesave) {
        this.timesave = timesave;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Byte getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(Byte deleteflag) {
        this.deleteflag = deleteflag;
    }

    public String getInstallationcompany() {
        return installationcompany;
    }

    public void setInstallationcompany(String installationcompany) {
        this.installationcompany = installationcompany == null ? null : installationcompany.trim();
    }

    public Date getInstallationtime() {
        return installationtime;
    }

    public void setInstallationtime(Date installationtime) {
        this.installationtime = installationtime;
    }

    public String getInstallationpersonnelname() {
        return installationpersonnelname;
    }

    public void setInstallationpersonnelname(String installationpersonnelname) {
        this.installationpersonnelname = installationpersonnelname == null ? null : installationpersonnelname.trim();
    }

    public String getInstallationpersonnelcontacts() {
        return installationpersonnelcontacts;
    }

    public void setInstallationpersonnelcontacts(String installationpersonnelcontacts) {
        this.installationpersonnelcontacts = installationpersonnelcontacts == null ? null : installationpersonnelcontacts.trim();
    }

    public String getMaintenancepersonnelname() {
        return maintenancepersonnelname;
    }

    public void setMaintenancepersonnelname(String maintenancepersonnelname) {
        this.maintenancepersonnelname = maintenancepersonnelname == null ? null : maintenancepersonnelname.trim();
    }

    public String getMaintenancepersonnelcontacts() {
        return maintenancepersonnelcontacts;
    }

    public void setMaintenancepersonnelcontacts(String maintenancepersonnelcontacts) {
        this.maintenancepersonnelcontacts = maintenancepersonnelcontacts == null ? null : maintenancepersonnelcontacts.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }
}