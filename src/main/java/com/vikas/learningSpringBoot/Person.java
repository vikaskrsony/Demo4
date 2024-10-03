package com.vikas.learningSpringBoot;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    @JsonProperty("Person_Name")
    String name;
    int salary;

    String nickname;

    Person(String name, int salary, String nickname){
        this.name = name;
        this.salary = salary;
        this.nickname = nickname;
    }

//    public String getName() {
//        return name;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    public String getNickname() {
//        return nickname;
//    }
//
//    public void setNickname(String nickname) {
//        this.nickname = nickname;
//    }
}
