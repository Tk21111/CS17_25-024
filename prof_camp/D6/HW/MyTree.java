package prof_camp.D6.HW;

import java.util.LinkedList;
import java.util.Queue;

//25 N'Tonkla
public class MyTree {
    public static void main(String[] args) {
        System.err.println();
        MyTree tree = new MyTree();
        tree.addNode(6);
        tree.addNode(2);
        tree.addNode(8);
        tree.addNode(13);
        tree.addNode(28);
        tree.addNode(10);
        System.out.println("Leaf of Tree 1");
        tree.printTree();
        MyTree tree2 = new MyTree();
        tree2.addNode(9);
        tree2.addNode(6);
        tree2.addNode(2);
        tree2.addNode(7);
        tree2.addNode(5);
        tree2.addNode(11);
        tree2.addNode(4);
        tree2.addNode(20);
        System.out.println("Leaf of Tree 2");
        tree2.printTree();
    }

    Node root;

    MyTree() {
        root = null;
    }

    public void addNode(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        Node curNode = root;
        while (curNode != null) {

            if (value < curNode.data) {
                if (curNode.left == null) {
                    curNode.left = new Node(value);
                    return;
                }
                curNode = curNode.left;
            } else {
                if (curNode.right == null) {
                    curNode.right = new Node(value);
                    return;
                }
                curNode = curNode.right;
            }
        }
    }

    public void printTree() {
        Queue<Node> queue = new LinkedList<>();
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            Node curNode = queue.poll();
            
            if(curNode.left == null && curNode.right == null)
            {
                System.out.print(curNode.data + " ");
            }
            if (curNode.left != null) {
                queue.add(curNode.left);
            }
            if (curNode.right != null) {
                queue.add(curNode.right);
            }
        }
        System.out.println();
    }

}

class Node {
    int data;
    Node left;
    Node right;

    Node(int dataIn) {
        data = dataIn;
        left = null;
        right = null;
    }
}