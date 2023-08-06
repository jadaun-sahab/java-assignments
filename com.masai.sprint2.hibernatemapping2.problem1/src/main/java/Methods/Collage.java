package Methods;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Collage {
    @Id
    private String collageId;
    private String collageName;
    private String collageAddress;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "collage")
//    @JoinTable(name = "collage", joinColumns = @JoinColumn(name = "collageId"))
    private List<Student> studentList = new ArrayList<Student>();


    public String getCollageId() {
        return collageId;
    }

    public void setCollageId(String collageId) {
        this.collageId = collageId;
    }

    public String getCollageName() {
        return collageName;
    }


    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }


    public String getCollageAddress() {
        return collageAddress;
    }


    public void setCollageAddress(String collageAddress) {
        this.collageAddress = collageAddress;
    }


    public List<Student> getStudentList() {
        return studentList;
    }


    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Collage{" +
                "collageId='" + collageId + '\'' +
                ", collageName='" + collageName + '\'' +
                ", collageAddress='" + collageAddress + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}