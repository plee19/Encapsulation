package lab4;

/**
 * Class for a company, to handle creation of an HR Representative instance and to tell that representative to hire employees.
 * @author plee19
 * @version 1
 */

public class Company {
    private HrRepresentative hrRep;

    public Company() { hrRep = new HrRepresentative(); }

    public HrRepresentative getHrRep() {
        return hrRep;
    }

    public void setHrRep(HrRepresentative hrRep) {
        this.hrRep = hrRep;
    }

    public void hireEmployee(String firstName, String lastName, String ssn) {
        hrRep.hireEmployee(firstName, lastName, ssn);
        hrRep.outputReport(ssn);
    }

}
