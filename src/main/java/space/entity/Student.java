package space.entity;

import lombok.Data;

@Data
public class Student {
    private int stuid;
    private String stuname;
    private Course course;
}
