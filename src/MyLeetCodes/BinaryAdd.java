package MyLeetCodes;

import java.util.Stack;

public class BinaryAdd {
    public String addBinary(String a, String b) {
        String sum = "";
        Stack store = new Stack();
        int temp = 0;
        int count_one = a.length()-1;
        int count_two = b.length()-1;
        int counter = Math.max(count_one, count_two);
        while(counter >= 0){
            int one = 0;
            int two = 0;
            if(count_one >= 0){
                one = Integer.parseInt(String.valueOf(a.charAt(count_one)));
            }
            if(count_two >= 0){
                two = Integer.parseInt(String.valueOf(b.charAt(count_two)));
            }
            int add  = one + two + temp;

            if(add < 2){
                store.add(add);
                temp = 0;
            }
            else{
                store.add(add % 2);
                temp = add / 2;

            }
            count_one--;
            count_two--;
            counter--;
        }
        if(temp == 1){
            store.add(temp);
        }
        else{
            while(temp > 1){
                store.add(temp % 2);
                temp = temp / 2;
            }
        }
        while(!store.isEmpty()) sum += store.pop();
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new BinaryAdd().addBinary("0", "0"));
    }
}
