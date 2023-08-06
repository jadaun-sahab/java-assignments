package Methods;

import org.hibernate.annotations.DialectOverride.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @ColumnDefault(dialect = null, override = @org.hibernate.annotations.ColumnDefault(value = "e101")) 
//    @Column(columnDefinition = "int default 100")
    private int studentRoll;
    private String studentName;
    private double mobileNumber;
    private String email;

    @JoinColumn(name = "collageId")
    @ManyToOne
    private Collage collage;

    public int getStudentRoll() {
        return studentRoll;
    }

    public void setStudentRoll(int studentRoll) {
        this.studentRoll = studentRoll;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(double mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collage getCollage() {
        return collage;
    }

    public void setCollage(Collage collage) {
        this.collage = collage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentRoll=" + studentRoll +
                ", studentName='" + studentName + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", email='" + email + '\'' +
                ", collage=" + collage +
                '}';
    }
}
