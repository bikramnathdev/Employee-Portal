package com.example.work.user.models;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class Users {

    @Id
    private ObjectId _id;

    private String firstname;
    private String lastname;
    private String gender;
    private String dob;
    private String department;

    public Users() {
        
    }
    public Users(ObjectId _id, String firstname, String lastname, String gender, String dob, String department) {
        this._id = _id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.dob = dob;
        this.department = department;
    }

    
    @Override
    public String toString() {
        return "Users{" +
                ", Name='" + firstname +' '+ lastname  +'\'' +
                ", DOB=" + dob +
                ", Gender =" +gender+
                ", Department=" + department +
                '}';
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
		this.department = department;
	}
}
    