import analysis.datastructure.stack.Stack;

public class Main {
	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();
		stack.empty();
		stack.push("1");
		stack.push("a");
		stack.push("가");
		//stack.printAll();
		stack.top();
		
		stack.push("2");
		stack.push("3");
		stack.push("b");
		//stack.printAll();
		
		stack.pop();
		stack.pop();
		stack.printAll();
	}
}
