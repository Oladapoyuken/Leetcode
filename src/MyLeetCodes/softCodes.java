package MyLeetCodes;

import java.util.*;

public class softCodes {

    public softCodes(){

    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }



    LinkedList one = new LinkedList();
    LinkedList two = new LinkedList();

    public void addTwoNumbers() {

        one.add(2); one.add(4); one.add(3);
        two.add(5); two.add(6); two.add(4);
        Iterator itr1 = one.descendingIterator();
        Iterator itr2 = two.descendingIterator();
        String sone = "";
        String stwo = "";
        while(itr1.hasNext()){
            sone += itr1.next().toString();
            stwo += itr2.next().toString();
        }
        int result = Integer.parseInt(sone)  + Integer.parseInt(stwo);
        char[] chars = String.valueOf(result).toCharArray();
        two.clear();
        for(int i=chars.length-1; i>=0; i--){
            two.add(Character.getNumericValue(chars[i]));
        }
        System.out.println(two);

    }








    public static void main(String[] args) {

        softCodes programs = new softCodes();


    }
}
