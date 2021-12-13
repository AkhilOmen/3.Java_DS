// we use stack for construction.

// Code
import java.util.*;

public class Main{
    
    public static class Node{
        
        int data;
        ArrayList<Node> children;
        
        public Node(int data){
            this.data = data;
            children = new ArrayList<>();
        }
        
    }
    
    public static void main(String[] args){
        
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        Node root = construct(arr);
        
        display(root);
    }
    
    public static Node construct(int[] arr){
        Stack<Node> st = new Stack<>();
        Node root = new Node(arr[0]);
        st.push(root);
        
        for( int i = 1; i < arr.length; i++){
            
            if( arr[i] == -1){
                st.pop();
            }else{
                
                Node temp = new Node(arr[i]);
                
                st.peek().children.add(temp);
                st.push(temp);
                
            }
            
        }
        
        return root;
        
    }
    
    public static void display(Node root){
        
        if( root.data == -1){
            return;
        }
        
        System.out.print(root.data + " -> ");
        for( Node child : root.children){
            System.out.print(child.data + ", ");
        }
        System.out.println(".");
        
        for(Node child : root.children){
            display(child);
        }
    }
}

// Out Put
// 10 -> 20, 30, 40, .
// 20 -> 50, 60, .
// 50 -> .
// 60 -> .
// 30 -> 70, 80, 90, .
// 70 -> .
// 80 -> 110, 120, .
// 110 -> .
// 120 -> .
// 90 -> .
// 40 -> 100, .
// 100 -> .
