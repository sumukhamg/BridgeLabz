package linked_list_problems.palindrome_lonked_list;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(10);

        if (isPalindrome(list))
            System.out.println("List" + list + " List is a palindrome");

        else
            System.out.println("List" + list + " is not a palindrome");
    }

    static boolean isPalindrome(List<Integer> list) {

        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
            if (list.get(i) != list.get(j))
                break;
            i++;
            j--;
        }
        return list.size() % 2 == 0 ? j == i - 1 : i == j;
    }

}
