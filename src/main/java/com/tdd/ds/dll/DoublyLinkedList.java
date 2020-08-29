package com.tdd.ds.dll;

public class DoublyLinkedList<E> {

  private Node<E> head;
  private Node<E> tail;
  private int size;

  public DoublyLinkedList(E obj){
    head = new Node<>(obj);
    tail = new Node<>(obj);
    head.next = tail;
    tail.prev = head;
  }

  public boolean isEmpty() {
    return head == tail;
  }

  public Node<E> addAtTail(E val) {

    Node<E> newNode = new Node<>(val);
    newNode.next = tail;
    newNode.prev = tail.prev;
    tail.prev.next = newNode;
    tail.prev = newNode;
    size++;
    return newNode;
  }

  public int getSize() {
    return size;
  }

  public Node<E> addAtHead(E val) {
    Node<E> newNode = new Node<>(val);
    Node<E> prev= head.next;
    newNode.next = prev;
    newNode.prev = head;
    head.next = newNode;
    prev.prev = newNode;
    size++;
    return newNode;
  }

  public Node<E> getHead() {
    return head;
  }

}

class Node<E>{
  E val;
  Node<E> prev;
  Node<E> next;
  Node(E val){
    this.val = val;
  }
}
