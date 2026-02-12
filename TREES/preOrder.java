import java.util.*;


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val =val;
    }
}
TreeNode buildTree(){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter -1 for null");
    int rootval =sc.nextInt();
    if(rootval==-1)  return null;

    TreeNode root =new TreeNode(rootval);
    Queue<TreeNode> q= new LinkedList<>();
    q.add(root);

    while(!q.isEmpty()){
        TreeNode curr =q.poll();
        System.out.println("Enter the left child of"+curr+" :");
        int left=sc.nextInt();
        if(left!=-1){
            curr.left=new TreeNode(left);
            q.add(curr.left);
        }
        System.out.println("Enter the right child of"+curr+" :");
        int right=sc.nextInt();
        if(right!=-1){
            curr.right=new TreeNode(left);
            q.add(curr.right);
        }
    }
    return root;

}
class preOrder{
    public static void main(String[] args) {
        
    }
}