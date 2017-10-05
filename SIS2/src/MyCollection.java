
public abstract class MyCollection {
	int size;
	int[] a = new int[1000];
	 abstract void add(int element);
	 abstract void add(int index, int element);
	 abstract void clear();
	 abstract boolean contains(int o);
	 abstract int indexOf(int o);
	 abstract void insertElementAt(int element,int index);
	 abstract boolean isEmpty();
	 abstract void removeAt(int index);
	 abstract void remove(int element);
	 abstract void removeAll(int element);
	 abstract void reverse();
	 abstract void set(int index,int element);
	 abstract void sort();
	 abstract int size();
	 abstract int[] toArray();
	 public abstract String toString();
}
