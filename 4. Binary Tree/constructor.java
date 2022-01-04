import java.util.*;

public class Main{
    
    // Pair class
    public static class Pair{
        Node node;
        int state;
        
        public Pair(){
            
        }
        
        public Pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
        
    }
    
    // Node class
    public static class Node{
        
        int data;
        Node left;
        Node right;
        
        public Node(){
            
        }
        
        public Node(int data){
            this.data = data;
        }
        
    }
    
    public static void main(String[] args){
        
        Integer[] arr = { 10, 20, 40, null, null, 50, 60, null, null, null, 30, 70, null, 80, null, null, 90, null, null};
        Node root = construct(arr);
        
        display(root);
    }
    
    // Binary Tree Constructor
    public static Node construct(Integer[] arr){
        
        Stack<Pair> st = new Stack<>();
        
        Node root = new Node(arr[0]);
        Pair rootPair = new Pair(root, 0);
        st.push(rootPair);
        
        for( int i = 1; i < arr.length; i++){
            Pair np = st.peek();
            
            if( arr[i] == null ){
                np.state++;
                if( np.state == 2 ){
                    st.pop();
                }
            }else{
                Node n = np.node;
                Node newN = new Node(arr[i]);
                if( np.state == 0 ){
                    n.left = newN;
                    np.state++;
                }else{
                    n.right = newN;
                    st.pop();
                }
                
                st.push(new Pair(newN, 0));
            }
            
            // if( np.state == 0){
                
            //     np.state++;
                
            //     if( arr[i] != null ){
            //         Pair newNP = new Pair(newN, 0);
            //         st.push(newNP);
            //     }
                
            // }else if( np.state == 1 ){
                
            //     Node n = np.node;
            //     st.pop();
                
            //     if( arr[i] != null ){
            //         Node newN = new Node(arr[i]);
            //         n.right = newN;
            //         Pair newNP = new Pair(newN, 0);
            //         st.push(newNP);
            //     }
                
            // }
            
        }
        
        return root;
        
    }
    
    // Display Binary Tree.
    public static void display(Node root){
        
        if( root == null){
            return;
        }
        
        if( root.left != null ){
            System.out.print(root.left.data + " ");
        }else{
            System.out.print( " n " + " " );
        }
        
        System.out.print( " <- " + root.data + " -> ");
        
        
        if( root.right != null ){
            System.out.print(root.right.data + " ");
        }else{
            System.out.print( " n " + " " );
        }
        
        System.out.println();
        
        display( root.left );
        display( root.right );
        
    }
    
}
