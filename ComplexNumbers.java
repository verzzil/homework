//import java.util.Scanner;
//
//public class ComplexNumbers {
//    double[] firstComplex = new double[2];
//
//    ComplexNumbers(){
//        this.firstComplex[0] = 0;
//        this.firstComplex[1] = 0;
//    }
//    ComplexNumbers(double x1, double y1){
//        this.firstComplex[0] = x1;
//        this.firstComplex[1] = y1;
//    }
//
//
//    ComplexNumbers addition(ComplexNumbers second, String para){
//        ComplexNumbers result = new ComplexNumbers();
//        if(para.equals("+")){
//            result.firstComplex[0] = this.firstComplex[0]+second.firstComplex[0]; result.firstComplex[1] = this.firstComplex[1]+second.firstComplex[1];
//            return result;
//        }
//        result.firstComplex[0] = this.firstComplex[0]-second.firstComplex[0]; result.firstComplex[1] = this.firstComplex[1]-second.firstComplex[1];
//        return result;
//    }
//    void writeComplex(){
//        System.out.println(this.firstComplex[0]+" + "+this.firstComplex[1]+"i");
//    }
//    ComplexNumbers mulit(ComplexNumbers b){
//
//    }
////    double[] multiplication(double[] first, double[] second){
////        double[] result = new double[2];
////        result[0] = first[0]*second[0]-first[1]*second[1]; result[1]=first[0]*second[1]+first[1]*second[0];
////        return result;
////    }
////    double[] multiplication(double realNumber, double[] complex){
////        double[] nComplex = complex.clone();
////
////        return nComplex;
////    }
////    String division(double[] first, double[] second){
////        double[] numerator = multiplication(first,reverse(second));
////        double[] den = multiplication(second,reverse(second));
////        double denumerator = den[0]+den[1];
////        double[] result = new double[2];
////        result[0] = numerator[0]/denumerator;
////        result[1] = numerator[1]/denumerator;
////        return result[0]+" + "+result[1]+"i";
////    }
////    double modul(double[] complex){
////        return Math.sqrt(complex[0]*complex[0]+complex[1]*complex[1]);
////    }
////    double angle(double[] complex){
////        return Math.atan2(complex[0],complex[1]);
////    }
//    // возвести в n степень
////    String raiceToThePower(int n){
////        return modul(this.)+" * ("+(Math.cos(Math.atan2(complex[0],complex[1])/modul(complex)*n)+" + "+Math.sin(Math.atan2(complex[0],complex[1])/modul(complex)*n)+"*i)");
////    }
////    // изменить полярные координаты
////
////    public static double[] reverse(double[] ex){
////        double[] exam = ex.clone();
////        exam[1] = exam[1]*-1;
////        return exam;
////    }
//}