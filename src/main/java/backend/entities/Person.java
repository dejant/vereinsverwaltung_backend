package backend.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String FName;
    private String LName;
    private Date Birthdate;
    private String Mail;
    private Integer PhoneNr;
    private String StreetName;
    private Integer StreetNr;
    private Integer PLZ;
    private String Place;
    private String Gender;
    private Boolean PowerUser;
    private String EntryDate;
    private String LeaveDate;

    @OneToMany
    private Set<Trainer> trainer;

    @OneToMany
    private Set<Member> member;

    @OneToMany
    private Set<Roommanager> roommanagers;

    // constructor
    //
    public Person() {
    }

    // getter und setter
    //


    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public Date getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(Date birthdate) {
        Birthdate = birthdate;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public Integer getPhoneNr() {
        return PhoneNr;
    }

    public void setPhoneNr(Integer phoneNr) {
        PhoneNr = phoneNr;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String streetName) {
        StreetName = streetName;
    }

    public Integer getStreetNr() {
        return StreetNr;
    }

    public void setStreetNr(Integer streetNr) {
        StreetNr = streetNr;
    }

    public Integer getPLZ() {
        return PLZ;
    }

    public void setPLZ(Integer PLZ) {
        this.PLZ = PLZ;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Boolean isPowerUser() {
        return PowerUser;
    }

    public void setPowerUser(Boolean powerUser) {
        PowerUser = powerUser;
    }

    public String getEntryDate() {
        return EntryDate;
    }

    public void setEntryDate(String entryDate) {
        EntryDate = entryDate;
    }

    public String getLeaveDate() {
        return LeaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        LeaveDate = leaveDate;
    }

}