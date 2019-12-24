import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

//        double a = 8; // левая граница
//        double b = 10; // правая граница
//        System.out.printf("%.10f",methodDihotom(a,b));

        MyDate date = new MyDate(2,2,1971);
        MyDate alba = new MyDate(3,11,2000);
        MyDate yasya = new MyDate(17,5,2005);
        MyDate papa = new MyDate(24,4,1976);
        MyDate mama = new MyDate(24,6, 1981);
        MyDate now = new MyDate(20,11,2019);
        MyDate dalya = new MyDate(29,6,2001);
        MyDate babai = new MyDate(5,1,1947);


        System.out.println(date.valueOf("dd/mm/yyyy",alba.ready));
        System.out.println("Прошло дней со дня рождения Мамы: "+(now.howDayLate()-mama.howDayLate()+2));
        System.out.println("Прошло дней со дня рождения Папы: "+(now.howDayLate()-papa.howDayLate()+2));
        System.out.println("Прошло дней со дня рождения Яси: "+(now.howDayLate()-yasya.howDayLate()));
        System.out.println("Прошло дней со дня рождения Альберта: "+(now.howDayLate()-alba.howDayLate()));
        System.out.println("Прошло дней со дня рождения Дали: "+(now.howDayLate()-dalya.howDayLate()));
        System.out.println("Прошло дней со дня рождения Бабая: "+(now.howDayLate()-babai.howDayLate()));
        int al = now.howDayLate()-alba.howDayLate(), dal = now.howDayLate()-dalya.howDayLate();
        System.out.println("Я старше тебя на "+(al-dal)+" дней, малявка!");


    }


    // Метод дихотомии
    public static double function(double x){
        return Math.tan(x)*Math.cos(x)*factorial((int)x-1)/factorial((int)x);
    }
    public static double methodDihotom(double a, double b){
        double f_a = function(a), f_b = function(b), f_mid, mid, sigma = 0.0000000001;
        int k=0, max_step = 1000000;
        while(b-a > sigma){
            mid = (a+b)/2;
            f_mid = function(mid);
            if(f_a*f_mid<0){
                b = mid;
                f_b = f_mid;
            }
            else{
                a = mid;
                f_a = f_mid;
            }
        }
        return (a+b)/2;
    }
    public static long factorial(int n){
        long result = 1;
        for(int i =2;i<=n;i++){
            result*=i;
        }
        return result;
     }

}