import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double finalSalary;
    Employee emp1 = new Employee("Ebenezer", "Oyenuga", 10000);

      
    System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " Yearly Salary is " + emp1.getMonthlySalary()*12);
    finalSalary = (emp1.calculatePercentageRaise()*12) + emp1.getMonthlySalary() * 12;

    System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + "Yearly Salary after the 10% raise is " + finalSalary);

Employee emp2 =new Employee("", "", 0);

    emp2.setFirstName("Olubukola");
    emp2.setLastName("Adekola");

    Scanner scan = new Scanner(System.in);
    System.out.print("Kindly input " + emp2.getLastName() + ", " + emp2.getFirstName() + " monthly salary");
    int mSalary = scan.nextInt();
    emp2.setMonthlySalary(mSalary);
    System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "Yearly Salary is " + emp2.getMonthlySalary()*12);

     finalSalary = (emp2.calculatePercentageRaise()*12) + emp2.getMonthlySalary() * 12;

     System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + "Yearly Salary after the 10% raise is " + finalSalary);
  }
}

class Employee{
  private String firstName;
  private String lastName;
  private int monthlySalary;
  
  
  Employee(String fName, String lName, int mSalary){
    firstName = fName;
    lastName = lName.toUpperCase();
    monthlySalary = mSalary;
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

  public float calculatePercentageRaise(){
    return monthlySalary * 0.1f;
  }


}