public class Test {
    public static void main(String[] args) {
        BinarySearchTreeDemo tree = new BinarySearchTreeDemo();
        tree.addNode('A');
        tree.addNode('B');
        tree.addNode('C');
        tree.addNode('D');
        tree.addNode('E');
        tree.addNode('F');
        tree.addNode('G');
        tree.preOrderTraverse(tree.getRoot());
        System.out.println();
        tree.inOrderTraverse(tree.getRoot());
        System.out.println();
        tree.postOrderTraverse(tree.getRoot());
    }
}
