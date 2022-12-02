package Data;

public class Hospital {
    private static final int MAX_EMPLOYEE=3;
    Person[] people = new Person[MAX_EMPLOYEE];
    private int employeesNumber=0;
    private int employeeCounter=0;


    public void add(Person person){
        if (employeesNumber<MAX_EMPLOYEE){
            people[employeesNumber] = person;
            employeesNumber++;
        }
    }

    public boolean isEmployeeBaseFull(){
       if (employeesNumber==MAX_EMPLOYEE){
           return true;
       }else
        return false;
    }

    public void getInfo(){
        if (employeesNumber == 0) {
            System.out.println("Lista pracowników jest pusta.");
            System.out.println();
        } else {
            System.out.println("Aktualnie pracuje " + employeesNumber + " " + "pracowników:");
            int i = 0;
            do {
                System.out.println(i + 1 + ". "+ people[i].getInfo());
                i++;
                if (i == people.length) { //zabezpieczenie przed przekroczeniem wielkości tablicy
                    break;
                }
            } while (people[i] != null);
            System.out.println("Koniec listy");
            System.out.println();
        }
    }

}
