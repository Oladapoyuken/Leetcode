package MyLeetCodes;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public Test(){

    }
    public class sub{
        int x;
        sub nes;
        sub(){}
        sub(int x){
            this.x = x;
        }
        sub(int x, sub nes){
            this.x = x; this.nes = nes;
        }

    }

    public void mapping(){
        Map<String, Integer> map = new HashMap<>();
        map.put("oladapo", 3);
        map.put("yusuf", 2);
        map.put("opeyemi", 5);
        map.put("olamide", 9);

        if(map.containsKey("yusuf")){
            int k = map.get("yusuf");
            map.put("yusuf", k+1);
            System.out.println(map.get("yusuf"));
        }
    }

    public void sum(){
        int[] vals = {1,2,3,4,5,6,7,8,9,0};
        for(int i = 0; i < vals.length; i++){
            System.out.println(vals[i]);
            i++;
        }
    }

    public void prefixCheck(){
        String longString = "Oladapo";
        String prefix = "Olap";

        System.out.println(longString.indexOf(prefix));
    }

    public void sendMid(int[] data){

    }

    public void saved(){
        int a = 5;
        int b = 6;

        //if else in a single line
        int max = (a > b) ? b : a;


    }






    public static void main(String[] args) {
        List list = new ArrayList<>();

        list.add(4);
        list.add(-4);
        list.add(0);

        if (list.contains(0)) {
            System.out.println("List contains zero");
        } else {
            System.out.println("NOTHING");
        }


    }
}
