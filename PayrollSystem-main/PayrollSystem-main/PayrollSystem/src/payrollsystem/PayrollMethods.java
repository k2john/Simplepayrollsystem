package payrollsystem;

public class PayrollMethods {
   private int id;
   private String employee;
   private String username;
   private int age;
   private String gender;
   private String address;
   private int balance;
   private String position;

   public PayrollMethods(String employee, String username, int age, String gender, String address, int balance, String position){
       
       this.employee = employee;
       this.username = username;
       this.age = age;
       this.gender = gender;
       this.address = address;
       this.balance = balance;
       this.position = position;
   } 
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
 
}
