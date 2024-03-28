package collections;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class TreeDemo {
    public static void main(String[] args) {
        Tree1<Integer> tree = new Tree1<>(1);
        Tree1.Node root = tree.getRoot();
        root.addChild(tree.new Node(root,2));
        root.addChild(tree.new Node(root,3));
        root.addChild(tree.new Node(root,4));
        root.preOrder(root);
    }
}
//простая реализация стека на основе ArrayList

