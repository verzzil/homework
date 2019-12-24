public class MyDate {
    static int startDay = 1, startMounth = 1, startYear = 1900;
    int nowDay,nowMounth,nowYear;
    String ready;
    MyDate(int day,int mounth,int year){
        this.nowDay = day;
        this.nowMounth = mounth;
        this.nowYear = year;
        this.ready = this.nowDay+"."+this.nowMounth+"."+this.nowYear;
    }

    String valueOf(String pattern, String value){
        if(pattern.equals(value)) return value;

        String[] pat = pattern.split("\\"+getSymb(pattern));
        String[] val = value.split("\\"+getSymb(value));
        String res ="";


        for(int i = 0; i<2; i++){
            if(pat[i].length()>val[i].length()) val[i] = "0"+val[i];
        }
        if(pat[2].length()<val[2].length()) val[2] = val[2].substring(val[2].length()-2,val[2].length());

        for(int i = 0; i<val.length;i++){
            res+=val[i]+getSymb(pattern);
        }

        return res.substring(0,res.length()-1);
    }

    int howDayLate(){
        int deltaDay,deltaMounth,deltaYear,days=0;
        for(int i = startYear; i<this.nowYear; i++){
            if(i%4==0) days+=366;
            else days += 365;
        }
        for(int i = startMounth; i<this.nowMounth; i++){
            if(i==2 && this.nowYear%4!=0) days += 28;
            else if(i==1 || i%2==0 && i!=8 && i!=10 && i!=12) days +=30;
            else days += 31;
        }
        days += this.nowDay - startDay;
        return days+1;
    }

    public static boolean map(String symb){
        String[] map = new String[]{".","/","|",":","-",","};
        for(int i = 0; i<map.length; i++){
            if(symb.equals(map[i])){
                return true;
            }
        }
        return false;
    }
    public static String getSymb(String pattern){
        for(int i = 0; i<pattern.length();i++){
            if(map(String.valueOf(pattern.charAt(i)))) return String.valueOf(pattern.charAt(i));
        }
        return"";
    }

//    format(String pattern){
//        // pattern dd(?)mm(?)yyyy or yy
//
//    }
}