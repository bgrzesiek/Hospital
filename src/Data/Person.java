package Data;

import App.DataReader;

public class Person {
    String firstName;
    String lastName;
    double Salary;

    DataReader dataReader = new DataReader();

    public Person(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        Salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }
    public String getInfo(){
        return "Imię: " + getFirstName() + ", Nazwisko: " + getLastName() + ", Wypłata: " + getSalary();
    }
}
