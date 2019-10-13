class Main{
    public static void main(String[] args){
// ДЗ НА ДВЕ НЕДЕЛИ

            // 1 без массива
//        int n,a,i;
//        Scanner scan = new Scanner(System.in);
//
//        n = scan.nextInt();
//        i=0;
//        a = 1;
//        while(i<n && a>=0){
//            a = scan.nextInt();
//            i++;
//        }
//        if(i!=n){
//            System.out.println("В последовательности есть отрицательные числа");
//        }
//        else{
//            System.out.println("В последовательности нет отрицательных чисел");
//        }

            // 1 с массивом
//        int[] arr;
//        int i,n;
//        Scanner scan = new Scanner(System.in);
//
//        n = scan.nextInt();
//        arr = new int[n+1];
//
//        i=1;
//
//        while(i<n+1 && arr[i-1]>=0){
//            arr[i] = scan.nextInt();
//            i++;
//        }
//        if(i!=n+1){
//            System.out.println("Есть отриц числа");
//        }
//        else{
//            System.out.println("Нет отриц чисел");
//        }



        // 2 без массива

//        int n,i,a;
//        Scanner scan = new Scanner(System.in);
//
//        n = scan.nextInt();
//        i=0;
//        a=1;
//        while(i<n && a!=0){
//            a = scan.nextInt();
//            i++;
//        }
//        if(a==0){
//            System.out.println("Есть 0");
//        }
//        else{
//            System.out.println("Нет 0");
//        }


            // 2 с массивом

//        int[] arr;
//        int i,n;
//        Scanner scan = new Scanner(System.in);
//
//        n = scan.nextInt();
//        i=1;
//        arr = new int[n+1];
//        arr[0] = 1;
//        while(i<n+1 && arr[i-1]!=0){
//            arr[i]= scan.nextInt();
//            i++;
//        }
//        if(i != n+1){
//            System.out.println("Есть 0");
//        }
//        else{
//            System.out.println("Нет 0");
//        }



                // 3 без массива
//        int n,x,i,k;
//        Scanner scan = new Scanner(System.in);
//
//        n = scan.nextInt();
//        x = scan.nextInt();
//        k = scan.nextInt();
//        i=1;
//
//        while(i<n && k < x){
//            i++;
//            k = scan.nextInt();
//        }
//        if(k==x) {
//            System.out.println("В данной последовательности присутствует " + x);
//        }
//        else{
//            System.out.println(x+" Нет в данной последовательности");
//        }


                // 3 с массивом
//        int[] arr;
//        int x,n,i;
//        Scanner scan = new Scanner(System.in);
//
//        n = scan.nextInt();
//        x = scan.nextInt();
//        i=1;
//
//        arr = new int[n];
//        arr[0] = scan.nextInt();
//        while(i<n && arr[i]<x){
//            i++;
//            arr[i]=scan.nextInt();
//        }
//        if(arr[i] == x){
//            System.out.println("В данной последовательности присутствует " + x);
//        }
//        else {
//            System.out.println(x+" Нет в данной последовательности");
//        }



            ///4 
//        int[] a,b,c;
//        int n,m,i;
//
//        Scanner scan = new Scanner(System.in);
//
//        n = scan.nextInt();
//        m= scan.nextInt();
//        a = new int[n];
//        b = new int[m];
//        c = new int[n+m];
//
//        i=0;
//        while(i<n){
//            a[i]=scan.nextInt();
//        }
//        i=0;
//        while(i<m){
//            b[i]=scan.nextInt();
//        }



        /// Пункт А
//        int n,m,i,j,ci;
//        int[] a,b,c;
//        Scanner scan = new Scanner(System.in);
//
//        n = scan.nextInt();
//        m = scan.nextInt();
//
//        a = new int[n];
//        b = new int[m];
//        c = new int[n+m];
//
//        i=0;
//
//        while(i<n){
//            a[i] = scan.nextInt();
//            i++;
//        }
//        i=0;
//        while(i<m){
//            b[i] = scan.nextInt();
//            i++;
//        }
//
//        i=0;
//        j=0;
//        ci=0;
//        while(ci<m+n){
//            if(i!=n && a[i]<b[j]){
//                c[ci]=a[i];
//                i++;
//            }
//            else{
//                c[ci]=b[j];
//                j++;
//            }
//            ci++;
//        }
//
//        i=0;
//        while(i<m+n){
//            System.out.println(c[i]);
//            i++;
//        }

        //  Пункт b
//        int n,m,i,j,k;
//        int[] a,b,c;
//        Scanner scan = new Scanner(System.in);
//
//        n = scan.nextInt();
//        m = scan.nextInt();
//
//        a = new int[n];
//        b = new int[m];
//        c = new int[n+m];
//
//        i=0;
//        while(i<n){
//            a[i] = scan.nextInt();
//            i++;
//        }
//        i=0;
//        while(i<m){
//            b[i] = scan.nextInt();
//            i++;
//        }
//
//
//        i=0;
//        j=0;
//        k=0;
//        while(i<n){
//            while(j<m){
//                if(a[i]==b[j]){
//                    c[k++] = a[i];
//                    if(i<j){
//                        i=j+1;
//                    }
//                }
//                j++;
//            }
//            j=0;
//            i++;
//        }
//
//        i=0;
//        while(i<n+m && c[i]!=0 || i==0){
//            System.out.println(c[i]);
//            i++;
//        }



        // Пункт С
        // int n,m,i,j,k;
        // int[] a,b,c;
        // Scanner scan = new Scanner(System.in);

        // n = scan.nextInt();
        // m = scan.nextInt();

        // a = new int[n];
        // b = new int[m];
        // c = new int[n+m];

        // i=0;
        // while(i<n){
        //     a[i] = scan.nextInt();
        //     i++;
        // }
        // i=0;
        // while(i<m){
        //     b[i] = scan.nextInt();
        //     i++;
        // }

        // i=0;
        // j=0;
        // while(i<n){
        //     while(j<m && a[i]!=b[j]){
        //         j++;
        //     }
        //     if(j==m){
        //         c[i] = a[i];
        //     }
        //     j=0;
        //     i++;
        // }

        // i=0;
        // while(i<n+m){
        //     if(c[i]!=0){
        //         System.out.println(c[i]);
        //     }
        //     i++;
        // }
    

    }
}   