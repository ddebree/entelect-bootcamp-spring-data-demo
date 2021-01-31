package za.co.entelect.bootcampspringdatademo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import za.co.entelect.bootcampspringdatademo.entity.StudentEntity;

public class Student {
    private Integer id;
    private String firstName;
    private int age;

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }

    public static Student fromEntity(StudentEntity studentEntity) {
        Student student = new Student();
        student.id = studentEntity.getId();
        student.firstName = studentEntity.getFirstName();
        student.age = studentEntity.getAge();
        return student;
    }

    @JsonIgnore
    public StudentEntity toEntity() {
        StudentEntity student = new StudentEntity();
        student.setId(student.getId());
        student.setFirstName(student.getFirstName());
        student.setAge(student.getAge());
        return student;
    }

}
