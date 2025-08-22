package prof_camp.D6;

import java.util.LinkedList;
import java.util.Queue;

public class Mytree {
    Node root;

    Mytree()
    {
        root = null;
    }

    public void addNode(int value)
    {
        if(root == null)
        {
            root = new Node(value);
            return;
        }

        Node curr = root;

        while (curr != null) {
            if(value < curr.data)
            {
                if(curr.left == null)
                {
                    curr.left = new Node(value);
                    return;
                } 

                curr = curr.left;
            } else 
            {
                if (curr.right == null)
                {
                    curr.right = new Node(value);
                    return;
                }

                curr = curr.right;
            }
        }
    }

    public void deleteNode(int value)
    {
    }

    public Node deleteNodeRecursive(Node root , int value)
    {
        if( root == null)
        {
            return root;
        }

        if(value < root.data)
        {
            root.left = deleteNodeRecursive(root.left, value);
        } else if (value > root.data)
        {
            root.right = deleteNodeRecursive(root.right, value);
        } else 
        {
            if(root.left == null)
            {
                return root.right;
            } else if(root.right == null)
            {
                return root.left;
            }
        }

        return null;
    }

    public void printTree()
    {
        Queue<Node> queue = new LinkedList<Node>();

        if (root == null)
        {
            System.out.println("Tree is empty");
            return;
        }

        queue.add(root);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            if(curr.left == null && curr.right == null)
            {
                System.out.println(curr.data + " ");
            }

            if (curr.left != null)
            {
                queue.add(curr.left);
            }

            if (curr.right != null)
            {
                queue.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {
        Mytree tMytree = new Mytree();
        
        tMytree.addNode(6);
        tMytree.addNode(2);
    

        tMytree.printTree();
    }
}

class Node 
{
    int data;
    Node left;
    Node right;

    public Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
