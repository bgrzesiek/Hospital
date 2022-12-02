package App;

import Data.Doctor;
import Data.Hospital;
import Data.Nurse;
import Data.Person;

public class HospitalApp {
    public static void main(String[] args) {
        HospitalControlLoop hospitalControlLoop = new HospitalControlLoop();
        hospitalControlLoop.controlLoop();
    }
}
