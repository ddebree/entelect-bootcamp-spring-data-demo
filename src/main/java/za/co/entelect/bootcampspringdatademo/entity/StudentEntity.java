package za.co.entelect.bootcampspringdatademo.entity;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT", schema = "PUBLIC", catalog = "TESTDB")
public class StudentEntity {
    private Integer id;
    private String firstName;
    private Integer age;
    private ClassroomEntity classroom;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "AGE")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @ManyToOne
    @JoinColumn(name = "CLASS_ID", referencedColumnName = "ID", nullable = false)
    public ClassroomEntity getClassroom() {
        return classroom;
    }

    public void setClassroom(ClassroomEntity classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}
