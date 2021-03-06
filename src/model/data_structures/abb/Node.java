package model.data_structures.abb;

import java.io.Serializable;

import model.Person;

public class Node<K extends Comparable<K>, T extends Person> implements Serializable {
	protected K key;
	protected T value;
	protected int height;
	protected int size;
	protected Node<K, T> right;
	protected Node<K, T> left;
	protected Node<K, T> parent;

	public Node(K key, T value, int height, int size) {
		this.key = key;
		this.value = value;
		this.height = height;
		this.size=size;
	}

	public void update() {
		int lh = left != null ? left.height : 0;
		int rh = right != null ? right.height : 0;

		height = ((lh > rh) ? lh : rh) + 1;
	}

	public K getKey() {
		return key;
	}

	public T getValue() {
		return value;
	}

	public int getHeight() {
		return height;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public Node<K, T> getRight() {
		return right;
	}

	public Node<K, T> getLeft() {
		return left;
	}

	public Node<K, T> getParent() {
		return parent;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void setRight(Node<K, T> right) {
		this.right = right;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setLeft(Node<K, T> left) {
		this.left = left;
	}

	public void setParent(Node<K, T> father) {
		this.parent = father;
	}
	
	public int compareTo(K k) {
		
		
		return key.compareTo(k);
	}
	
	public T search(K datoBuscado) {
		if(key.compareTo(datoBuscado)==0)
			return this.value;
		else if(key.compareTo(datoBuscado)>0)
			return (left==null)? null : left.search(datoBuscado);
		else
			return (right==null)? null : right.search(datoBuscado);
	}
}
