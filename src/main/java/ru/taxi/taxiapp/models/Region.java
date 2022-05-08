package ru.taxi.taxiapp.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "region")
public class Region {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "id", unique = true)
    private String id;
    @Column(name = "code_region")
    private String codeRegion;
    @Column(name = "name_region")
    private String nameRegion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(String codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public void setNameRegion(String nameRegion) {
        this.nameRegion = nameRegion;
    }

    @Override
    public String toString() {
        return "Region{" +
                "id='" + id + '\'' +
                ", codeRegion='" + codeRegion + '\'' +
                ", nameRegion='" + nameRegion + '\'' +
                '}';
    }
}
