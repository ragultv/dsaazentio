class Solution {
    private int preIndex;
    private Map<Integer, Integer> inMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preIndex = 0;
        inMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) inMap.put(inorder[i], i);
        return build(preorder, 0, inorder.length - 1);
    }
    private TreeNode build(int[] pre, int inStart, int inEnd) {
        if (inStart > inEnd) return null;
        TreeNode root = new TreeNode(pre[preIndex++]);
        int inRoot = inMap.get(root.val);
        root.left = build(pre, inStart, inRoot - 1);
        root.right = build(pre, inRoot + 1, inEnd);
        return root;
    }
}
