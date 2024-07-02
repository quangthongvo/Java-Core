package com.vti.entity;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class User {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private Role role;
    private int projectId;
    private String proSkill;
    private int expInYear;

    public void setRole(String role) {
        this.role = Role.valueOf(role);
    }

    public enum Role {
        MANAGER, EMPLOYEE
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
