package GameSimulation.gameSimulation.Entities;

public class Gamer {
    private int id;
    private String firstName;
    private String lastName;
    private int birthOfYear;
    private String nationalId;
    private double money;

    public Gamer() {
    }

    public Gamer(int id, String firstName, String lastName, int birthOfYear, String nationalId, double money) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfYear = birthOfYear;
        this.nationalId = nationalId;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getBirthOfYear() {
        return birthOfYear;
    }

    public void setBirthOfYear(int birthOfYear) {
        this.birthOfYear = birthOfYear;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
