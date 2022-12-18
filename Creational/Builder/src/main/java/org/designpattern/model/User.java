package org.designpattern.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private String name;
    private String password;
    private int age;
    private Company company;

    public User(Builder builder){
        this.name = builder.name;
        this.password = builder.password;
        this.age=builder.age;
        this.company = builder.company;
    }
    public static class Builder{
        private String name;
        private String password;
        private int age;
        private Company company;

        public Builder(){}
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder password(String password){
            this.password = password;
            return this;
        }
        public Builder age(int age){
            this.age=age;
            return this;
        }
        public Builder company(Company company){
            this.company=company;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
