package com.blz.queue.QueueTest;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {

	@Test
	public void given3NumbersWhenAddedToQueueShouldHaveFirstAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyQueue<Integer> myQueue = new MyQueue<>();
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		INode<Integer> peekNode = myQueue.peek();
		myQueue.printStack();
		boolean result = peekNode.equals(myFirstNode);
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstElementWhenDeletedShouldPassQueueResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyQueue<Integer> myQueue = new MyQueue<>();
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		INode<Integer> deletedNode = myQueue.dequeue();
		myQueue.printStack();
		boolean result = deletedNode.equals(myFirstNode);
		Assert.assertTrue(result);
	}

}
