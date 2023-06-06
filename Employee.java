
//import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.time.LocalDate;

public class Employee {

    public int id;

    @Patern(regexp = "^[A-Z][a-z]*$")
    public String name;
    public LocalDate dob;
    public Gender gender;

    @Patern(regexp = "^([0-9]{9}[x|X|v|V]|[0-9]{12})$") // "^[0-9]{9}V$"
    public String nic;

    @Patern(regexp = "^0[0-9]{9}$")
    public String mobile;

    @Patern(regexp = "^[a-z]*@[a-z]*.[a-z]*$")
    public String email;
    public Designation designation;
    public Statusemployee statusemployee;

    Employee() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getNic() {
        return nic;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setStatusemployee(Statusemployee statusemployee) {
        this.statusemployee = statusemployee;
    }

    public Statusemployee getStatusemployee() {
        return statusemployee;
    }

    // public Field[] getFields() {
    // return null;
    // }

    // public Method[] getAnnotation() {
    // return null;
    // }

}