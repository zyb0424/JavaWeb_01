package com.zyb.entity;

public class User {
    private Integer UserAge;
    private String UserNmae;
    private String UserPassword;
    private Integer UserId;

    public Integer getUserAge() {
        return UserAge;
    }

    public void setUserAge(Integer userAge) {
        UserAge = userAge;
    }

    public String getUserName() {
        return UserNmae;
    }

    public void setUserName(String userName) {
        UserNmae = userName;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserAge=" + UserAge +
                ", UserName='" + UserNmae + '\'' +
                ", UserPassword='" + UserPassword + '\'' +
                ", UserId=" + UserId +
                '}';
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }
}
