package ru.kpfu.itis.model;


public class User {

    private String name1;

    private String name2;

    private String name3;

    private String birthDay;

    private String gender;

    public User() {
    }

    public User(String name, String name2, String name3, String birthDay, String gender) {
        this.name1 = name;
        this.name2 = name2;
        this.name3 = name3;
        this.birthDay = birthDay;
        this.gender = gender;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public String getName3() {
        return name3;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

}
