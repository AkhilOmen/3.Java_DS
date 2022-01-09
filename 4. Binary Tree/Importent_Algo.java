// Some basic question are similar to Generic tree.
// for generic tree -> 
    
    // public static class Node{
    //     int data;
    //     ArrayList<Node> children;
    // }

    // for( Node child : root.children ){
    //     some_recursionfn(child);
    // }

// 

// for Binary tree ->

    // public static class Node{
    //     int data;
    //     Node left;
    //     Node right;
    // }

    // some_recursionfn(root.left);
    // some_recursionfn(root.right);

// 


// 1. Print Nodes K Distance Away ->

    // Node to Root path Algo...........................

        // public static ArrayList<Node> nodeToRootPath(Node node, int data){
                
        //     ArrayList<Node> ans = new ArrayList<>();
            
        //     if( node == null ){
        //         return ans;
        //     }
            
        //     if( node.data == data){
        //         ans.add(node);
        //         return ans;
        //     }
            
        //     ArrayList<Node> leftnodeal =  nodeToRootPath(node.left, data);
        //     if(leftnodeal.size() != 0 ){
        //         leftnodeal.add(node);
        //         return leftnodeal;
        //     }
            
        //     ArrayList<Node> rightnodeal =  nodeToRootPath(node.right, data);
        //     if(rightnodeal.size() != 0 ){
        //         rightnodeal.add(node);
        //         return rightnodeal;
        //     }
            
        //     return ans;
        // }

    // 

    // Print K level down Algo.............................

        // public static void printKLevelsDown(Node node, int k, Node blocker){
            
        //     if( node == null || node == blocker ){
        //         return;
        //     }
            
        //     if( k == 0 ){
        //         System.out.println(node.data);
        //     }
            
        //     printKLevelsDown(node.left, k - 1, blocker);
        //     printKLevelsDown(node.right, k - 1, blocker);
            
        // }

    //
    
    // This is the main question

    // public static void printKNodesFar(Node node, int data, int k) {
        
    //     ArrayList<Node> ntrp =  nodeToRootPath(node, data);
        
    //     for( int i = 0; i < ntrp.size(); i++ ){
    //         if( i != 0 ){
    //             printKLevelsDown(ntrp.get(i), k - i, ntrp.get(i-1));
    //         }else{
    //             printKLevelsDown(ntrp.get(i), k - i, null );
    //         }
    //     }

    // }
// 


// 2. Is Balanced Tree

    // public static class Pair2{
            
    //     boolean flag;
    //     int ht;
        
    //     public Pair2(boolean flag, int ht){
    //         this.flag = flag;
    //         this.ht = ht;
    //     }
        
    // }

    // public static Pair2 height(Node node){
            
    //     if( node == null ){
    //         return new Pair2(true, -1);
    //     }
        
    //     Pair2 lp = height(node.left);
    //     Pair2 rp = height(node.right);
        
    //     int th = Math.max(lp.ht, rp.ht) + 1;
        
    //     if( lp.flag != false && rp.flag != false){
            
    //         boolean isSimilar = false;
            
    //         if( Math.abs(lp.ht - rp.ht) <= 1 ){
    //             isSimilar = true;
    //         }
            
    //         return new Pair2(isSimilar, th);
            
    //     }else{
    //         return new Pair2(false, th);
    //     }

    // }

// 

// 3. Is a Binary Search Tree?
    // public static class Pair2 {
            
    //     int min;
    //     int max;
    //     boolean flag;
        
    //     public Pair2(int min, int max, boolean flag) {
    //         this.min = min;
    //         this.max = max;
    //         this.flag = flag;
    //     }
        
    // }

    // public static Pair2 isBST(Node node){
            
    //     if( node == null ){
    //         return new Pair2(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
    //     }
        
    //     Pair2 lp = isBST(node.left);
    //     Pair2 rp = isBST(node.right);
        
    //     int minn = Math.min(lp.min, Math.min(rp.min, node.data));
    //     int maxn = Math.max(lp.max, Math.max(rp.max, node.data));
        
    //     if( lp.flag != false && rp.flag != false ){
            
    //         if( node.data > lp.max && node.data < rp.min){
    //             return new Pair2(minn, maxn, true);
    //         }else{
    //             return new Pair2( minn, maxn, false);
    //         }
            
    //     }else{
    //         return new Pair2(minn, maxn, false);
    //     }
        
    // }
    
// 

