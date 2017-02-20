package sample.test.collection.list;

public class Main {

	public static void main(String[] args) {

		 LinkedList<Integer> list = new LinkedList<Integer>();
		 list.add(1);
		 list.add(3);
		 list.add(4);
		 list.add(6);
		 list.printAll();
		 list.deleteEven();
		 list.printAll();
	}

}
