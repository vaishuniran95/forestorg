public class ForestOrganization {
    private String name;
    private int employeeCount;
    private String headquartersLocation;
    private String[] departments;

    public ForestOrganization(String name, int employeeCount, String headquartersLocation, String[] departments) {
        this.name = name;
        this.employeeCount = employeeCount;
        this.headquartersLocation = headquartersLocation;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public String getHeadquartersLocation() {
        return headquartersLocation;
    }

    public String[] getDepartments() {
        return departments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public void setHeadquartersLocation(String headquartersLocation) {
        this.headquartersLocation = headquartersLocation;
    }

    public void setDepartments(String[] departments) {
        this.departments = departments;
    }

    public void displayOrganizationInfo() {
        System.out.println("Organization Name: " + name);
        System.out.println("Employee Count: " + employeeCount);
        System.out.println("Headquarters Location: " + headquartersLocation);
        System.out.println("Departments: ");
        for (String department : departments) {
            System.out.println("- " + department);
        }
    }

    public static void main(String[] args) {
        String[] departments = {"Finance", "Human Resources", "Marketing", "IT"};
        ForestOrganization organization = new ForestOrganization("forest.org", 100, "City X", departments);
        organization.displayOrganizationInfo();
    }
}
