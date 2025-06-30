package org.viktsh.builder;

/**
 * @author Viktor Shvidkiy
 */
public class User {
    private final String name;
    private final String email;
    private final int age;
    private final String country;
    private final String phone;

    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.country = builder.country;
        this.phone=builder.phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class Builder{
        private String name;
        private String email;
        private int age;
        private String country;
        private String phone;

        public Builder(String name){
            this.name = name;
        }
        public Builder email(String email){
            this.email=email;
            return this;
        }
        public Builder age(int age){
            this.age=age;
            return this;
        }

        public Builder country(String country){
            this.country=country;
            return this;
        }
        public Builder phone(String phone){
            this.phone=phone;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
