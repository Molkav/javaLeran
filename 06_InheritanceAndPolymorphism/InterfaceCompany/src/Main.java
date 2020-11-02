public class Main {
    public static void main(String[] args) {
        Company test = new Company();

        System.out.println("Условие 1");
        test.hire(new Operator(), 180);
        test.hire(new Manager(), 80);
        test.hire(new TopManager(), 10);

        System.out.println(test.employees.size() + " - нанято сотрудников");
        System.out.println(test.getIncome() + " - доход компании");

        System.out.println("\nУсловие 2");
        test.getTopSalaryStaff(15);

        System.out.println("\nУсловие 3");
        test.getLowestSalaryStaff(30);

        System.out.println("\nУсловие 4");
        test.fire(50.);
        System.out.println(test.getIncome() + " - доход компании");

        System.out.println("\nУсловие 5");
        test.getTopSalaryStaff(15);
        System.out.println("\nУсловие 6");
        test.getLowestSalaryStaff(30);
    }
}
