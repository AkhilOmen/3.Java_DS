
// Permutation 1 ->

// While Iteams choose boxes. Therefore here 
// level -> Iteams && Options -> Boxes
// Time complexity -> O(n^2) && Space Complexity -> O(n) 
// public static void permutations(int[] boxes, int ci, int ti){
        
//     if( ci > ti ){
//         for( int i = 0; i < boxes.length; i++){
//             System.out.print(boxes[i]);
//         }
//         System.out.println();
//         return;
//     }
    
//     // 5 boxes on 3 iteams
//     // Here boxes will select the items
    
//     for( int i = 0; i < boxes.length; i++){
//         if( boxes[i] == 0){
//             boxes[i] = ci;
//             permutations(boxes, ci + 1, ti);
//             boxes[i] = 0;
//         }
//     }
    
// }


// Permutation 2 ->

// While Boxes choose Iteam. Therefore here 
// level -> Boxes && Options -> Items
// public static void permutations(int cb, int tb, int[] items, int ssf, int ts, String asf){
        
//     if( cb > tb ){
//         if( ssf == ts ){
//             System.out.println(asf);
//         }
//         return;
//     }

//    // 3 items in 5 boxes.
//    // Here items will select the boxes.
    
//     // Multiple Yes
//     for( int i = 0; i < items.length; i++){
//         if( items[i] == 0 ){
//             items[i] = cb;
//             permutations(cb+1, tb, items, ssf + 1, ts, asf + (i+1));
//             items[i] = 0;
//         }
//     }
    
//     // No
//     permutations(cb + 1, tb, items, ssf, ts, asf + "0");
    
// }


