package ru.taxi.taxiapp.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="driver")
public class Driver {
    @Id
    @GeneratedValue(generator = "uuid")
    private String  id;
    private String fam;
    private String  name;
    private String  ot;
    private Date birthday;
    private String dLicenseId;
    private String addressId;
    private String passportId;

    public Driver() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public String getOt() {
        return ot;
    }

    public void setOt(String ot) {
        this.ot = ot;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getdLicenseId() {
        return dLicenseId;
    }

    public void setdLicenseId(String dLicenseId) {
        this.dLicenseId = dLicenseId;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }
}
