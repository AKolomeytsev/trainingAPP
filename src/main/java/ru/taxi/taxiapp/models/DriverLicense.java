package ru.taxi.taxiapp.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "driverlicense")
public class DriverLicense {

    @Id
    @GeneratedValue(generator = "uuid")
    private String id;
    private String drLicenseSeries;
    private String drLicenseNumber;
    private Date drLicenseDateIn;
    private Date drLicenseDateOut;
    private String drLicenseCategories;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDrLicenseSeries() {
        return drLicenseSeries;
    }

    public void setDrLicenseSeries(String drLicenseSeries) {
        this.drLicenseSeries = drLicenseSeries;
    }

    public String getDrLicenseNumber() {
        return drLicenseNumber;
    }

    public void setDrLicenseNumber(String drLicenseNumber) {
        this.drLicenseNumber = drLicenseNumber;
    }

    public Date getDrLicenseDateIn() {
        return drLicenseDateIn;
    }

    public void setDrLicenseDateIn(Date drLicenseDateIn) {
        this.drLicenseDateIn = drLicenseDateIn;
    }

    public Date getDrLicenseDateOut() {
        return drLicenseDateOut;
    }

    public void setDrLicenseDateOut(Date drLicenseDateOut) {
        this.drLicenseDateOut = drLicenseDateOut;
    }

    public String getDrLicenseCategories() {
        return drLicenseCategories;
    }

    public void setDrLicenseCategories(String drLicenseCategories) {
        this.drLicenseCategories = drLicenseCategories;
    }
}
