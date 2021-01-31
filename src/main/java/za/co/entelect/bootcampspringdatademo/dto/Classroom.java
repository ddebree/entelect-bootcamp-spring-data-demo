package za.co.entelect.bootcampspringdatademo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import za.co.entelect.bootcampspringdatademo.entity.ClassroomEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Classroom {
    private Integer id;
    private int grade;
    private String teacherName;
    private List<Student> students;

    public Classroom() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "id=" + id +
                ", grade=" + grade +
                ", teacherName='" + teacherName + '\'' +
                ", students=" + students +
                '}';
    }

    public static Classroom fromEntity(ClassroomEntity classroomEntity) {
        Classroom classroom = new Classroom();
        classroom.id = classroomEntity.getId();
        classroom.grade = classroomEntity.getGrade();
        classroom.teacherName = classroomEntity.getTeacherName();
        classroom.students = classroomEntity.getStudents().stream().map(Student::fromEntity).collect(Collectors.toList());
        return classroom;
    }

    @JsonIgnore
    public ClassroomEntity toEntity() {
        ClassroomEntity classroom = new ClassroomEntity();
        classroom.setId(getId());
        classroom.setGrade(getGrade());
        classroom.setTeacherName(getTeacherName());
        classroom.setStudents(new ArrayList<>());
        return classroom;
    }
}
