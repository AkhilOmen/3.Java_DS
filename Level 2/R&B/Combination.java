// Combination - 1
// Levels -> Boxes , Options -> Items
// Time Complexity -> O(2^n)
// public static void combinations(int cb, int tb, int ssf, int ts, String asf){
        
//     if( cb > tb ){
//         if( ssf == ts ){
//             System.out.println(asf);
//         }
//         return;
//     }
    
//     // We are giving an option to item whether it want to get into the current box or not.
//     // If Yes
//     combinations(cb + 1, tb, ssf + 1, ts, asf + "i");
    
//     // If No
//     combinations(cb + 1, tb, ssf, ts, asf + "-");
// }

// Combination - 2
// Levels -> Items, Options -> Boxes

// public static void combinations(int[] boxes, int ci, int ti, int lb){
        
//     if( ci > ti ){
//         for( int i = 0; i < boxes.length; i++){
//             if( boxes[i] != 0 ){
//                 System.out.print("i");
//             }else{
//                 System.out.print("-");
//             }
//         }
//         System.out.println();
//         return;
//     }
    
//     for( int i = lb + 1; i < boxes.length; i++){
//         boxes[i] = ci;
//         combinations(boxes, ci + 1, ti, i);
//         boxes[i] = 0;
//     }
// }