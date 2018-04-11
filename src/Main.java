import analysis.basics.statistics.Divider;
import analysis.basics.statistics.Divisor;
import analysis.basics.strings.StringParser;
import data.structure.tree.LinkedBinaryTree;

public class Main {
	public static void main(String args[]) {
		LinkedBinaryTree<String> lbt =  new LinkedBinaryTree<String>();
		String[] parsed;
		String expression = "X 1 + X * 9 5 - 2 + / X 7 4 - * Y + - #";
		String delim = " ";
		
		StringParser sp = new StringParser(expression, delim);
		parsed = sp.getParsedString();
		
		Divisor dvs = new Divisor(100);
		dvs.printDivisor();
	}
}
