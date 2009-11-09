import org.antlr.runtime.tree.Tree;

public class COOLWalker {
	private Tree root;
	private String outputFile;

	public COOLWalker(Tree root, String outputFile) {
		this.root = root;
		this.outputFile = outputFile;
	}

	public void generateAST() {
		Tree child;
		int size = root.getChildCount();

		for (int i = 0; i < size; i++) {
			child = root.getChild(i);
			System.out.print(child + " ");
		}
	}
}
