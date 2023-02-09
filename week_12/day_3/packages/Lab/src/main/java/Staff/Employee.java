package Staff;

public abstract class Employee {

    private String name;
    private String NInumber;
    private double salary;

    public Employee(String name, String NInumber, double salary) {
        this.name = name;
        this.NInumber = NInumber;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNInumber() {
        return NInumber;
    }


    public double getSalary() {
        return salary;
    }


    public void raiseSalary(Double percent){
        if (percent > 0) {
            Double multiplier = (percent / 100) + 1;
            this.salary *= multiplier;
        }
    }

    public Double payBonus(){
        return this.salary * 0.01;
    }





}
