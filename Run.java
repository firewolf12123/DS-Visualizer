
public class Run {

	public static void main(String[] args) {
		Main_frame mf = new Main_frame();
		
		int[] ar = {5,7,3,1,9};
		BST bst = new BST(5, ar);
		System.out.print(bst.getT().getH());
		System.out.print(bst.getT().getVal());
		System.out.print(bst.getT().getL().getVal());
		System.out.print(bst.getT().getL().getL().getVal());
		System.out.print(bst.getT().getR().getR().getVal());
		System.out.print(bst.getT().getR().getVal());
	}
}
