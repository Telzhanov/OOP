
public class MyVector extends MyCollection {
	static void removeElement(int a[], int index,int size) {
		int[] tmp= new int[size];
		for (int i=0; i<size; i++ )
		{
			tmp[i]=a[index+1+i];
		}
		size--;
		for (int i=0; i<size; i++ ) {
			a[index+i]=tmp[i];
		}
	}
	static void addingElement(int a[], int index,int element, int size) {
		int[] tmp= new int[size];
		for ( int i=0; i<size-index-1; i++) {
			tmp[i]=a[index+i];
		}
		a[index]=element;
		for (int i=0; i<size-index-1; i++) {
			a[index+1+i]=tmp[i];
		}
	}
	static boolean isOutRange(int size,int index) {
		if (index>size-1) {
			System.out.println("Index out of range");
			return true;
		}
		else {
			return false;
		}
	}
	public MyVector() {
		size=0;
	}
	public MyVector(int[] a) {
		this.a=a;
		size=a.length;
	}
	@Override
	public void add(int element) {
		size++;
		a[size-1]=element;
	}

	@Override
	public void add(int index, int element) {
		if (!isOutRange(size,index)) {
			size++;
			addingElement(a,index,element,size);
		}
	}
	@Override
	public void clear() {
		this.a= new int[1000];
		size=0;
	}

	@Override
	public boolean contains(int o) {
		return indexOf(o)!=-1;
	}

	@Override
	public int indexOf(int o) {
		for (int i=0; i<size; i++) {
			if (a[i]==o) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void insertElementAt(int element, int index) {
		if (!isOutRange(size,index)) {
			size++;
			addingElement(a,index,element,size);
		}
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public void removeAt(int index) {
		if(!isOutRange(size,index)) {
		removeElement(a,index,size);
		size--;
		}
	}

	@Override
	public void remove(int element) {
		int index;
		for (int i=0; i<size; i++) {
			if (a[i]==element) {
				index=i;
				removeElement(a,index,size);
				size--;
				break;
			}
		}
		
	}

	@Override
	public void removeAll(int element) {
		for (int i=0; i<size; i++) {
			if (a[i]==element) {
				removeElement(a,i,size);
				size--;
			}
		}
		
	}

	@Override
	public void reverse() {
		for (int i=0; i<size/2; i++) {
			int tmp;
			tmp=a[i];
			a[i]=a[size-1-i];
			a[size-1-i]=tmp;
		}
	}

	@Override
	public void set(int index, int element) {
		if (!isOutRange(size,index)) {
			a[index]=element;
		}
	}
	public void sort() {
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				if (a[i]<a[j]) {
					int tmp;
					tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	int[] toArray() {
		int[] tmp= new int[size];
		for (int i=0; i<size; i++) {
			tmp[i]=a[i];
		}
		return tmp;	
	}

	@Override
	public String toString() {
		String arrays="";
		for (int i=0; i<size(); i++) {
			arrays=arrays+a[i]+" ";
		}
		return arrays;
	}

}
