package baiiiiiii7;

public class Stack<T> {
	protected T[] a;
	protected int size = 0 , capacity = 77;
	
	public boolean isEmty() {
		if(size == 0)
			return true;
		return false;
	}
	public boolean isFull() {
		if(size == capacity)
			return true;
		return false;
	}
	public T peek() {
		return a[size - 1];
	}
	public void push(T x) {
		if(size == capacity)
			return;
		a[size] = x;
		size++;
	}
	public T pop() {
		size --;
		return a[size];
	}
	public int getSize() {
		return size;
	}
}