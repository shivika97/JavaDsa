import java.util.ArrayList;
import java.util.Scanner;

class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

public class MainClass {
   
    public static TreeNode addElement(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);  
        }
        if (value < node.value) {
            node.left = addElement(node.left, value); 
        } else {
            node.right = addElement(node.right, value);  
        }
        return node;  
    }

  
    public static void displayElements(TreeNode node) {
        if (node != null) {
            displayElements(node.left);  
            System.out.print(node.value + " "); 
            displayElements(node.right);  
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<>();

     
        System.out.println("Enter 4 values:");
        for (int i = 0; i < 4; i++) {
            values.add(sc.nextInt());
        }
        sc.close();  

        TreeNode root = null;
        for (int val : values) {
            root = addElement(root, val);  
        }

        
        System.out.println("Display the elements : ");
        displayElements(root); 
    }
}