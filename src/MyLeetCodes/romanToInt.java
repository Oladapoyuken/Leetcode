package MyLeetCodes;

public class romanToInt {
    public int romanToInt(String s){
        int x = 0;
        int i = 0;
        char[] c = s.toCharArray();
        while(i < c.length){
            if(c[i] == 'M'){
                x += 1000;
            }
            else if(c[i] == 'D'){
                x += 500;
            }
            else if(c[i] == 'C'){
                if((i+1) < c.length){
                    if(c[i+1] == 'M'){
                        x += 900;
                        i++;
                    }
                    else if(c[i+1] == 'D'){
                        x += 400;
                        i++;
                    }
                    else{
                        x += 100;
                    }
                }
                else{
                    x += 100;
                }
            }
            else if(c[i] == 'L'){
                x += 50;
            }
            else if(c[i] == 'X'){
                if((i+1) < c.length){
                    if(c[i+1] == 'C'){
                        x += 90;
                        i++;
                    }
                    else if(c[i+1] == 'L'){
                        x += 40;
                        i++;
                    }
                    else{
                        x += 10;
                    }

                }else{
                    x += 10;
                }
            }
            else if(c[i] == 'V'){
                x += 5;
            }
            else if(c[i] == 'I') {
                if((i+1) < c.length){
                    if(c[i+1] == 'X'){
                        x += 9;
                        i++;
                    }
                    else if(c[i+1] == 'V'){
                        x += 4;
                        i++;
                    }

                    else{
                        x += 1;
                    }
                }
                else{
                    x += 1;
                }
            }
            i++;
        }
        return x;
    }

    public static void main(String[] ags){
        System.out.println(new romanToInt().romanToInt("XIII")) ;
    }
}
