package space.hw.entity;

import lombok.Data;

@Data
public class Employee {
    public int empid;
    private String name;
    private String phone;
    private String branch;
    private String email;
//使用lombok @Data代替生成getter setter tostring
//    public int getEmpid() {
//        return empid;
//    }
//
//    public void setEmpid(int empid) {
//        this.empid = empid;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getBranch() {
//        return branch;
//    }
//
//    public void setBranch(String branch) {
//        this.branch = branch;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "empid=" + empid +
//                ", name='" + name + '\'' +
//                ", phone='" + phone + '\'' +
//                ", branch='" + branch + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
}
