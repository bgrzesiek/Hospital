package App;

import Data.Doctor;
import Data.Nurse;
import Data.Person;

import java.util.Scanner;

public class DataReader {
    Scanner scanner = new Scanner(System.in);

    public Doctor addDoctor(){
        String name = getName();
        String lastName = getLastName();
        double salary = getSalary();
        scanner.nextLine();
        System.out.println("Podaj bonus:");
        double bonus = scanner.nextDouble();
        scanner.nextLine();
        return new Doctor(name, lastName, salary, bonus);
    }
    public Nurse addNurse(){
        String name = getName();
        String lastName = getLastName();
        double salary = getSalary();
        scanner.nextLine();
        System.out.println("Podaj nadgodziny:");
        int overtime = scanner.nextInt();
        scanner.nextLine();
        return new Nurse(name, lastName, salary, overtime);
    }
    private String getName(){
        System.out.println("Podaj imie:");
        String name = scanner.nextLine();
        scanner.nextLine();
        return name;
    }
    private String getLastName(){
        System.out.println("Podaj nazwisko:");
        String name = scanner.nextLine();
        scanner.nextLine();
        return name;
    }
    private double getSalary(){
        System.out.println("Podaj wynagrodzenie:");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        return salary;
    }
    public int getIn(){
       int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }
    public void closeScaner(){
        scanner.close();
    }
}
