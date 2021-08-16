package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	private Object[] list;
	private int size = 0;
	public ArrayList() {
		list = new Object[size];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
        return (T) list[loc];
	}
	
	public void add(T val) {
		size++;
		Object[] temp = list;
		list = new Object[size];
		for (int i = 0; i < temp.length; i++) {
				list[i]=temp[i];
		}
		list[size-1] = val;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		size++;
		Object[] temp = list;
		list = new Object[size];
		for (int i = 0; i < list.length; i++) {
			if(i!=loc&&i<loc) {
				list[i]=temp[i];
			}
			else if(i!=loc&&i>loc) {
				list[i]=temp[i-1];
			}
			else {
				list[i] = val;
			}
		}
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		list[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		size--;
		Object[] temp = list;
		list = new Object[size];
		for (int i = 0; i < temp.length; i++) {
			if(i!=loc&&i<loc) {
				list[i] = temp[i];
			}
			else if(i!=loc&&i>loc) {
				list[i-1] = temp[i];
			}
		}
	}
	
	public boolean contains(T val) {
		for (Object object : list) {
			if(object==val) {
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		return size;
	}
}