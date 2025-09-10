package policy_management_system;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class PolicyManager {
    private Map<Integer, Policy> sortById = new HashMap<>();
    private Map<String, Policy> sortByExpiry = new TreeMap<>();
    private Map<Integer, Policy> storePolicy = new LinkedHashMap<>();
    private int i = 1;

    public void add(Policy policyObject) {
        storePolicy.put(i, policyObject);
        i++;
        sortById.put(policyObject.getID(), policyObject);
        sortByExpiry.put(policyObject.getExpirtDate(), policyObject);
    }

    public Map<Integer, Policy> displayById() {
        if (sortById != null)
            return sortById;
        else {
            System.out.println("Empty policy");
            return null;
        }
    }

    public Map<String, Policy> displayByExpiry() {
        if (sortByExpiry != null)
            return sortByExpiry;
        else {
            System.out.println("Empty policy");
            return null;
        }
    }

    public Map<Integer, Policy> displayByInsertion() {
        if (storePolicy != null)
            return storePolicy;
        else {
            System.out.println("Empty policy");
            return null;
        }
    }

    public Policy getPolicy(Policy policy) {
        return sortById.get(policy.getID());
    }

    public void removePolicy(Policy policy) {
        if (sortById != null) {
            sortByExpiry.remove(policy);
            sortById.remove(policy);
            storePolicy.remove(policy);

        }
    }

}
