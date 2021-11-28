import java.util.Scanner;
class Main {
  public static void main(String[] args) {
 
    Employee emp1 = new Employee("Ebenezer", "Oyenuga", 10000);

    
    System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "Yearly Salary is " + emp1.getMonthlySalary()*12);

Employee emp2 =new Employee("", "", 0);

    emp2.setFirstName("Olubukola");
    emp2.setLastName("Adekola");

    Scanner scan = new Scanner(System.in);
    int mSalary = scan.nextInt();
    emp2.setMonthlySalary(mSalary);
    System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "Yearly Salary is " + emp2.getMonthlySalary()*12);
  }
}
q
class Employee{
  private String firstName;
  private String lastName;
  private int monthlySalary;
  public String department;
  
  Employee(String fName, String lName, int mSalary){
    this.firstName = fName;
    this.lastName = lName.toUpperCase();
    this.monthlySalary = mSalary;
  }

  public void setFirstName(String fnam){
    firstName = fnam;
  }
  public String getFirstName(){
    return firstName;
  }

  public void setLastName(String lnam){
    lastName = lnam.toUpperCase();
  }
  public String getLastName(){
    return lastName;
  }

  public void setMonthlySalary(int msal){
    
    if (msal < 0){
      System.out.println("You inputted a negative salary. Therfore, your input has been changed to zero");
      monthlySalary = 0;
    }
    else{
      monthlySalary = msal;
    }
  }
  public int getMonthlySalary(){
    return monthlySalary;
  }


}