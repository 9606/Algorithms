import java.util.*;

public class BinaryTree {
    public List<Integer> preOrderRecursive(TreeNode root){
        List<Integer> result = new ArrayList<>();
        preOrderRecursiveCore(root, result);
        return result;
    }
    private void preOrderRecursiveCore(TreeNode root, List<Integer> result){
        if (root == null){
            return;
        }
        result.add(root.val);
        preOrderRecursiveCore(root.left, result);
        preOrderRecursiveCore(root.right, result);
    }

    public List<Integer> inOrderRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrderRecursiveCore(root, result);
        return result;
    }
    private void inOrderRecursiveCore(TreeNode root, List<Integer> result){
        if (root == null){
            return;
        }
        inOrderRecursiveCore(root.left, result);
        result.add(root.val);
        inOrderRecursiveCore(root.right, result);
    }

    public List<Integer> postOrderRecursive(TreeNode root){
        List<Integer> result = new ArrayList<>();
        postOrderRecursiveCore(root, result);
        return result;
    }
    private void postOrderRecursiveCore(TreeNode root, List<Integer> result){
        if (root == null){
            return;
        }
        postOrderRecursiveCore(root.left, result);
        postOrderRecursiveCore(root.right, result);
        result.add(root.val);
    }

    public List<Integer> preOrderIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return result;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                result.add(node.val);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return result;
    }

    public List<Integer> inOrderIterative(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()){
            while (curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            result.add(curr.val);
            curr = curr.right;
        }
        return result;
    }

    public List<Integer> postOrderIterative(TreeNode root){
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return result;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                result.add(0, node.val);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        return result;
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder stringBuilder = new StringBuilder();
        serializeRecursive(root, stringBuilder);
        return stringBuilder.toString();
    }

    private void serializeRecursive(TreeNode root, StringBuilder result) {
        if (root == null){
            result.append('$').append(',');
            return;
        }
        result.append(root.val).append(',');
        serializeRecursive(root.left, result);
        serializeRecursive(root.right, result);
    }
    // private String serializeIterative(TreeNode root) {
    //
    // }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] data_array = data.split(",");
        List<String> data_list = new LinkedList<String>(Arrays.asList(data_array));
        return deserializeRecursive(data_list);
    }

    private TreeNode deserializeRecursive(List<String> data){
        // Recursive deserialization.
        if (data.get(0).equals("$")) {
            data.remove(0);
            return null;
        }

        TreeNode root = new TreeNode(Integer.valueOf(data.get(0)));
        data.remove(0);
        root.left = deserializeRecursive(data);
        root.right = deserializeRecursive(data);

        return root;
    }
}
