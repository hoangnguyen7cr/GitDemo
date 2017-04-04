
package business;


public class Student {
    int studentNo;
    String studentName;
    String studentAddress;
    
    public Student() {
    }

    public Student(int studentNo, String studentName, String studentAddress) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    
}
