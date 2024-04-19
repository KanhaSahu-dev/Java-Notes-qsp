public class class8{
    public static void main(String...args){
        // for(int i=0;i<5;i++){
        //     for(int j =0;j<5;j++){
        //         if(i>=j){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();

//                 15
//             24  25
//         33  34  35
//     42  43  44  45
// 51  52  53  54  55

        for(int i = 0;i<5;i++){
            for(int j=5;j<i;j--){
                if(i<=j){
                    System.out.print("*");
                }                   
                else{
                    System.out.print(" ");
                }    
            }
            System.out.println();
        }
            
        }






       }

    
