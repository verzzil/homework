import java.util.Scanner;

public class Auditory {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


//        Student albert = new Student("Albert","Khannanov", "Ildarovich");
//        Student yasmina = new Student("Yasmina", "Khannanova","Ildarovna");
//
//        Student[] st = Student.mas;
//        for(int i = 0; i<st.length;i++){
//            System.out.println(st[i].getShortName());
//        }

        String[] deps = {"IT","Translate","Libraries","Frameworks","NanoTechnology", "Artificial Intelligence", "Smart house","Smart car","SmartPhone"
                        ,"Software","Space programm","Social network","Social progarm","Charity","Games","Study program","Medical","Content","New City","I don`t now"};

        // Создание компаний
        Shop google = new Shop("Google"); Shop yandex = new Shop("Yandex"); Shop yahoo = new Shop("Yahoo");
        Shop mail = new Shop("Mail"); Shop facebook = new Shop("Facebook"); Shop instagram = new Shop("Instagram");
        Shop youtube = new Shop("YouTube"); Shop rambler = new Shop("Rambler"); Shop intel = new Shop("Intel");
        Shop alibaba = new Shop("Alibaba");

        // Добавление отделов в компании
        setInMainProgrammDep(google,deps);setInMainProgrammDep(yandex,deps);setInMainProgrammDep(yahoo,deps);
        setInMainProgrammDep(mail,deps);setInMainProgrammDep(facebook,deps);setInMainProgrammDep(instagram,deps);
        setInMainProgrammDep(youtube,deps);setInMainProgrammDep(rambler,deps);setInMainProgrammDep(intel,deps);
        setInMainProgrammDep(alibaba,deps);

        // Сохранение отделов для каждой компании в переменные
        ShopDepartament[] googleDeps = google.getDep();ShopDepartament[] yandexDeps = yandex.getDep();ShopDepartament[] yahooDeps = yahoo.getDep();
        ShopDepartament[] mailDeps = mail.getDep();ShopDepartament[] facebookDeps = facebook.getDep();ShopDepartament[] instagramDeps = instagram.getDep();
        ShopDepartament[] youtubeDeps = youtube.getDep();ShopDepartament[] ramblerDeps = rambler.getDep();ShopDepartament[] intelDeps = intel.getDep();
        ShopDepartament[] alibabaDeps = alibaba.getDep();



//        ShopDepartament[] googleDeps = google.getDep();
//        googleDeps[0].setSeller(new Seller("Albert",(int)Math.ceil(Math.random()*10000)));
//        googleDeps[0].setSeller(new Seller("Yasmina",(int)Math.ceil(Math.random()*10000)));
//        googleDeps[0].setSeller(new Seller("Marina",(int)Math.ceil(Math.random()*10000)));
//
//        Seller[] googleItSellers = googleDeps[0].getSellers();
//        System.out.println(googleItSellers[0].getName()+" "+googleItSellers[0].getRev());

    }

    public static void setInMainProgrammDep(Shop company, String[] deps){
        for(int i = 0; i<deps.length; i++) {
            company.setDep(new ShopDepartament(deps[i]));
        }
    }

    public static String getRandomName(int count){
        String uIn = "ABCDEFGHIJKLMNOPQRSTUVIXYZ";
        String lIn = "abcdefghijklnmopqrstuvwxyz";
        String res ="";
        for(int i = 0; i<count; i++){
            if(i==0) res+=uIn.charAt((int)Math.ceil(Math.random()*uIn.length()));
            else res+=lIn.charAt((int)Math.ceil(Math.random()*uIn.length()));
        }
        return res;
    }


    public static void cutSecond(Scanner scan){
        String str = scan.nextLine();
        StringBuilder str2 = new StringBuilder("");
        int count_spaces = 0;
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)==' ') count_spaces++;
            if(count_spaces!=1){
                str2.append(str.charAt(i));
            }
        }
        System.out.println(str2);
    }
    public static void cutTherd(Scanner scan){
        String str = scan.nextLine();
        StringBuilder str2 = new StringBuilder("");
        int count_spaces = 0;
        for(int i =0; i<str.length();i++){
            if(str.charAt(i)==' ')  count_spaces++;
            if(count_spaces!=2) str2.append(str.charAt(i));
            else{
                while(str.charAt(i+1) != ' ') i++;
                str2.append(" Albert");
            }

        }
        System.out.println(str2);
    }

    public static int getMinLength(String s1, String s2){
        int result=0;
        if(s1.length()>=s2.length()) result = s2.length();
        else result = s1.length();

        return result;
    }
    public static int compateTo(String s1, String s2){
        int result, count = getMinLength(s1,s2);
        if(s1.equals(s2)) return 0;
        for(int i = 0; i<count; i++){
            if(s1.charAt(i) > s2.charAt(i)) return 1;
        }

        return -1;
    }
    public static String trim(String s1){
        if(s1.charAt(0) == ' ' || s1.charAt(s1.length()-1) == ' '){
            if(s1.charAt(0) == ' ' && s1.charAt(s1.length()-1) != ' ') return s1.substring(1,s1.length());
            if(s1.charAt(0) != ' ' && s1.charAt(s1.length()-1) == ' ') return s1.substring(0,s1.length()-1);
        }
        return s1.substring(1,s1.length()-1);
    }
    public static String insert(String s1,String s2, int id){
        StringBuilder result = new StringBuilder("");
        for(int i = 0; i<s1.length(); i++){
            if(i == id){
                for(int j = 0; j<s2.length(); j++){
                    result.append(s2.charAt(j));
                }
            }
            result.append(s1.charAt(i));
        }
        return result.toString();
    }
    public static String delete(String s1, int start, int end){
        StringBuilder result = new StringBuilder("");
        for(int i =0; i<s1.length(); i++){
            if (i<=start || i>end) result.append(s1.charAt(i));
        }
        return result.toString();
    }

    public static String findWithQ(String str, String ex){
        String res="";
        for(int i = 0; i<str.length() && res.equals("");i++){
            if(str.charAt(i)==ex.charAt(0)){
                int start = i;
                int j = 0;
                while(j<ex.length() && (ex.charAt(j) == str.charAt(i) ||ex.charAt(j) == '?')){
                    j+=1; i+=1;
                }
                if(j==ex.length()) res+=str.substring(start, start+ex.length());
            }
        }
        return res;
    }



}
