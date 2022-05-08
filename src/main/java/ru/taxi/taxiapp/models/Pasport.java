package ru.taxi.taxiapp.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "passport")
public class Pasport {
    @Id
    @GeneratedValue(generator = "uuid")
    private String id;
    private String passportSeries;
    private String passportNumber;
    private String issuedBy;
    private Date dateOfIssue;

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
