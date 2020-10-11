package com.blz.queue.QueueTest;

public class MyQueue<T> {
	private LinkedList<T> myLinkedList;

	public MyQueue() {
		myLinkedList = new LinkedList<>();
	}

	public void enqueue(INode<T> newNode) {
		myLinkedList.append(newNode);
	}

	public INode<T> peek() {
		return myLinkedList.head;
	}

	public INode<T> dequeue() {
		return myLinkedList.pop();
	}

	public void printStack() {
		myLinkedList.printMyNodes();
	}

	public void printWelcome() {
		System.out.println("Welcome to Queue Data Structure");
	}
}
