package App;

import Data.Doctor;
import Data.Hospital;
import Data.Nurse;

public class HospitalControlLoop {

    private static final int EXIT=0;
    private static final int ADD_DOCTOR =1;
    private static final int ADD_NURSE =2;
    private static final int PRINT_EMPLOYEES=3;

    DataReader dataReader = new DataReader();
    Hospital hospital = new Hospital();

    public void controlLoop() {
        int option;
        do {
            printoption();
            option=dataReader.getIn();
            switch (option){
                case EXIT:
                    exit();
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case ADD_NURSE:
                    addNurse();
                    break;
                case PRINT_EMPLOYEES:
                    hospital.getInfo();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
            }
        }while (option!=0);
    }

    private void printoption(){
        System.out.println("Wyjście z programu - " + EXIT);
        System.out.println("Dodaj lekarza - " + ADD_DOCTOR);
        System.out.println("Dodaj pielęgniarkę - " + ADD_NURSE);
        System.out.println("Wyświetl pracowników - " + PRINT_EMPLOYEES);
    }

    private void addDoctor(){
        if (hospital.isEmployeeBaseFull()==false){
            Doctor doctor = dataReader.addDoctor();
            hospital.add(doctor);
        }else
            System.out.println("Baza pracowników jest zapełniona. Nie mozna dodać nowego praconika");
    }
    private void addNurse(){
        if (hospital.isEmployeeBaseFull()==false){
            Nurse nurse = dataReader.addNurse();
            hospital.add(nurse);
        }else
            System.out.println("Baza pracowników jest zapełniona. Nie mozna dodać nowego praconika");
    }
    private void exit(){
        System.out.println("Do zobaczenia");
        dataReader.closeScaner();
    }
}
