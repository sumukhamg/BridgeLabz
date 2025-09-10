package employee_promotion_system;

class EmployeeImpl {
    private int id;
    private String name;
    private String designation;
    private double salary;
    private Promotions level;

    public EmployeeImpl(int id, String name, String designation, double salary, Promotions level) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public Promotions getLevel() {
        return level;
    }

    public void promote() {
        Promotions next = level.getNext();
        if (next != null) {
            this.level = next;
            this.salary += level.getSalaryIncrement();
            System.out.println(name + " promoted to " + level + " with new salary: " + salary);
        } else {
            System.out.println(name + " is already at the highest level.");
        }
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Promotions: " + level + ", Salary: " + salary);
    }
}