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
// 


// 5. Node root Path
    // public static ArrayList<Integer> nodeToRootPath(Node node, int val){
            
    //     ArrayList<Integer> bans = new ArrayList<>();
    //     if( node.data == val){
    //         bans.add(node.data);
    //         return bans;
    //     }
        
    //     for( Node child : node.children){
    //         ArrayList<Integer> mr = nodeToRootPath(child, val);
    //         if( mr.size() > 0 ){
    //             mr.add(node.data);
    //             return mr;
    //         }
    //     }
        
    //     return bans;
    // }
// 

// 6.Similar Trees?
    // public static boolean areSimilar(Node n1, Node n2) {
            
    //     if( n1.children.size() != n2.children.size()){
    //         return false;
    //     }
        
    //     for( int i = 0; i < n1.children.size(); i++){

    //          // Use this when asked to verify Mirror Trees -> int j = n2.children.size() - 1 - i;
    //          //                                       and  -> Node n2 = n2.children.get(j);
    //          // This changes should be made while asked about Mirror Tree?   

    //         Node n1c = n1.children.get(i);
    //         Node n2c = n2.children.get(i);
    //         boolean ans = areSimilar( n1c, n2c);
            
    //         if( ans == false){
    //             return false;
    //         }
    //     }
        
    //     return true;
    // }
// 

// 7.Is Symmetric Tree?
    // public static boolean IsSymmetric(Node node) {
            
    //     int i = 0;
    //     int j = node.children.size() - 1;
        
    //     while( i < j ){
            
    //         Node ic = node.children.get(i);
    //         Node jc = node.children.get(j);
            
    //         if( ic.children.size() != jc.children.size() ){
    //             return false;
    //         }
            
    //         i++;
    //         j--;
    //     }
        
    //     for( Node child : node.children ){
            
    //         boolean ans = IsSymmetric(child);
    //         if( ans == false){
    //             return false;
    //         }
    //     }
        
    //     return true;
    // }
// 

// 8. Predecessor And Successor Of An Element?
    // static Node predecessor;
    // static Node successor;
    // static int state;
    
    // public static void predecessorAndSuccessor(Node node, int val) {
        
    //     if( state == 0 ){
            
    //         if( node.data == val ){
    //             state = 1;
    //         }else{
    //             predecessor = node;
    //         }
            
    //     }else if( state == 1 ){
    //         successor = node;
    //         state = 2;
    //     }
        
        
        
    //     for( Node child : node.children){
    //         predecessorAndSuccessor(child, val);
    //     }
        
        
    // }
// 

// 9. Ceil and Floor
    // Ceil -> Smallest amoung the largest
    // Floor -> Largest amoung the Smallest

    // static int ceil;
    // static int floor;
    // public static void ceilAndFloor(Node node, int val) {
        
    //     if( floor < node.data && node.data < val){
    //         floor = node.data;
    //     }
        
    //     if( ceil > node.data && node.data > val){
    //         ceil = node.data;
    //     }
        
    //     for( Node child : node.children ){
    //         ceilAndFloor(child, val);
    //     }
        
    // }
    
    // Kth Largest
    // public static int kthLargest(Node node, int k){
        
    //     int data = Integer.MAX_VALUE;
    //     ceil = Integer.MAX_VALUE;
    //     floor = Integer.MIN_VALUE;
        
    //     for( int i = 0; i < k; i++){
    //         ceilAndFloor(node, data);
    //         data = floor;
    //         floor = Integer.MIN_VALUE;
            
    //     }
        
    //     return data;
        
    // }


// 

// 10. Max Sub Tree sum by using Pair Class
    // public static class Pair {
    //     int sum = 0;
    //     int mss = Integer.MIN_VALUE;
    //     Node mssNode;
        
    // }

    // public static Pair MaxSubTreeSum(Node node){
            
    //     Pair mp = new Pair();
    //     mp.sum += node.data;
        
    //     for( Node child : node.children ){
            
    //         Pair cp = MaxSubTreeSum(child);
    //         mp.sum += cp.sum;
            
    //         if( cp.mss > mp.mss ){
    //             mp.mss = cp.mss;
    //             mp.mssNode = cp.mssNode;
    //         }
            
    //     }
        
    //     if( mp.mss < mp.sum ){
    //         mp.mss = mp.sum;
    //         mp.mssNode = node;
    //     }
        
    //     return mp;
        
    // }

// 
