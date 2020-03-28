import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void serialize() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        BinaryTree binaryTree = new BinaryTree();
        String s = binaryTree.serialize(root);
        System.out.println(s);
        binaryTree.deserialize(s);
    }

    @Test
    public void deserialize() {
    }
}