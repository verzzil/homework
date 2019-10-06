class Main{
    public static void main(String[] args){ 
        int a,b,c,d,e;
        int res,res2;


        a=52;
        b=21;
        c=22;
        d = 51;
        e = 50;

        //1
        res = a>b ? a>c ? a>d ? a>e ? a : e : d>e ? d : e : c>d ? c>e ? c : e : d>e ? d : e : b>c ? b>d ? b>e ? b : e : d>e ? d : e : c>d ? c>e ? c : e : d>e ? d : e;
        res2 = a<b ? a<c ? a<d ? a<e ? a : e : d<e ? d : e : c<d ? c<e ? c : e : d<e ? d : e : b<c ? b<d ? b<e ? b : e : d<e ? d : e : c<d ? c<e ? c : e : d<e ? d : e;
        System.out.println(res+" "+res2); // ПРИБЬЕТЕ ЗА ТАКОЕ РЕШЕНИЕ, НО В ДАННОМ СЛУЧАЕ ЛУЧШЕ НАПИСАТЬ ОДИН
                                            // РАЗ И ПОЛЬЗОВАТЬСЯ БЕЗ РЕДАКТИРОВАНИЯ ЛОГИКИ


        // 2
        // if(a>b){
        //     if(a>c){
        //         if(a>d){
        //             if(a>e){
        //                 System.out.println(a);
        //             }
        //             else{
        //                 System.out.println(e);
        //             }
        //         }
        //         else{
        //             if(d>e){
        //                 System.out.println(d);
        //             }
        //             else{
        //                 System.out.println(e);
        //             }
        //         }
        //     }
        //     else{
        //         if(c>d){
        //             if(c>e){
        //                 System.out.println(c);
        //             }
        //             else{
        //                 System.out.println(e);
        //             }
        //         }
        //         else{
        //             if(d>e){
        //                 System.out.println(d);
        //             }
        //             else{
        //                 System.out.println(e);
        //             }
        //         }
        //     }
        // }
        // else{
        //     if (b>c){
        //         if(b>d){
        //             if(b>e){
        //                 System.out.println(b);
        //             }
        //             else{
        //                 System.out.println(e);
        //             }
        //         }
        //         else{
        //             if(d>e){
        //                 System.out.println(d);
        //             }
        //             else{
        //                 System.out.println(e);
        //             }
        //         }
        //     }
        //     else{
        //         if(c>d){
        //             if(c>e){
        //                 System.out.println(c);
        //             }
        //             else{
        //                 System.out.println(e);
        //             }
        //         }
        //         else{
        //             if(d>e){
        //                 System.out.println(d);
        //             }
        //             else{
        //                 System.out.println(e);
        //             }
        //         }
        //     }
        // }



    }
}
