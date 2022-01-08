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


// 2. 