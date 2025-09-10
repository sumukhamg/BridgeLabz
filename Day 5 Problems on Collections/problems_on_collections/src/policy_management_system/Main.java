package policy_management_system;

public class Main {
    public static void main(String args[]) {
        Policy policy1 = new Policy(101, "Health ", "Prime", 2000, "22-04-2027");
        Policy policy2 = new Policy(102, "Life ", "General", 3000, "23-04-2027");
        Policy policy3 = new Policy(103, "Vehicle ", "Prime Plus", 4000, "24-04-2027");
        Policy policy4 = new Policy(104, "Health", "Prime", 5000, "21-04-2027");
        Policy policy5 = new Policy(105, "Life", "General", 1000, "22-04-2026");

        PolicyManager policyManager = new PolicyManager();
        policyManager.add(policy1);
        policyManager.add(policy2);
        policyManager.add(policy3);
        policyManager.add(policy4);
        policyManager.add(policy5);

        System.out.println(policyManager.displayByInsertion());

    }
}
