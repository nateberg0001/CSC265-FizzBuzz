package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples();
        System.out.println(count);
    }

    public static int multiples(int amount){
        int count = 0;
        count += (amount-1)/3;
        count += (amount-1)/5;
        count -= (amount-1)/15;
        return count;
    }

    public static int multiples(){
        int count = 0;
        count += 999/3;
        count += 999/5;
        count -= 999/15;
        return count;
    }

    public static int multiples(int amount, int a, int b){
        if(a==b){
            return (amount-1)/a;
        }
        int count = 0;
        count += (amount-1)/a;
        count += (amount-1)/b;
        count -= (amount-1)/(a*b);
        return count;
    }
}
