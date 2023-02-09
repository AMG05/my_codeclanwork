package Management;

public class Director extends Manager {

        private Double salary;

        private Double budget;

        public Director(String name, String NInumber, Double salary, String deptName, Double budget) {
            super(name, NInumber, salary, deptName);
            this.budget = budget;
        }

        public Double getBudget(){
            return this.budget;
        }

        public Double payBonus(){
            return this.salary * 0.02;
        }

    }

