// Algo in Generic Tree

// 1. Level Order Of Generic Tree -> Use 
//             Deque<Node> mq = new Deque<>();

// 2. Level Order Linewise -> Use
//             Deque<Node> mq = new Deque<>();
//             Deque<Node> cq = new Deque<>();
            
// 3. Level Order Linewise Zig Zag -> Use
//                 Stack<Node> ms = new Stack<>();
//                 Stack<Node> cs = new Stack<>();
//                 level

// 4. Linearize A Generic Tree
    // Awesome Algorithm---
// public static void linearize(Node root){
    
//     for( Node child : root.children){
//         linearize(child);
//     }
    
//     for(int i = root.children.size() - 1; i >= 1 ; i--){
        
//         Node child1 = root.children.remove(i);
        
//         //here we are finding out the tail of i-1th node of the root child..
//         Node temp = root.children.get(i-1);
//         while(temp.children.size() != 0 ){
//             temp = temp.children.get(0);
//         }
        
//         temp.children.add(child1);
//     }
    
// }


// 5.

