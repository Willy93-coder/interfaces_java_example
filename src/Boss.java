import java.util.Date;

public class Boss extends Employee implements BossInterface {

    // Attributes
    private double incentive;
    private String cargo;

    // Constructor
    public Boss(String name, double salary, Date entryDate) {
        super(name, salary, entryDate);
    }

    // Methods
    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }

    @Override
    public void setCharge(String charge) {
        cargo = charge;
    }

    @Override
    public String getCharge() {
        return "Además tiene el cargo de " + cargo;
    }

    @Override
    public double setBonus(double gratification) {
        double prima = 2000;
        return prima + gratification + ForEmployee.bonus;
    }
}
