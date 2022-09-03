/*
  Given the root of a binary tree, return the inorder traversal of its nodes' values.

  Example 1:

  Input: root = [1,null,2,3]
  Output: [1,3,2]
*/
// FYI this solution is NOT mine this is leetCodes solution to the problem.

class binaryTreeInOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> myList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        if(root == null)
            return myList;
        while(curr != null || !stack.isEmpty()) {
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            myList.add(curr.val);
            curr = curr.right;
        }
        return myList;
    }
}
