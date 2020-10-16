package com.projects.universidad.users;
import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userid;
    @Column
    private String name;
    @Column 
    private String lastname;
    @Column 
    private Boolean enrolled ;
    @Column 
    private Boolean active;
    @Column 
    private Date birthdate;
    @Column 
    private Integer age;
    @Column 
    private String role;
    @Column 
    private String carrer;
    @Column 
    private String grade;
    
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Boolean getEnrolled() {
		return enrolled;
	}
	public void setEnrolled(Boolean enrolled) {
		this.enrolled = enrolled;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCarrer() {
		return carrer;
	}
	public void setCarrer(String carrer) {
		this.carrer = carrer;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}


   
}
