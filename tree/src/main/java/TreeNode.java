class TreeNode {
    /** Data for the node */
    public int val;
    /** The Node to the left of this one */
    public TreeNode left;
    /** The Node to the right of this one */
    public TreeNode right;

    /**
     * Constructor of Node
     *
     * @param value Value to put in the node
     */
    public TreeNode(int value) {
        val = value;
        left = null;
        right = null;
    }
}