package com.tdd.ds.dll;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DoublyLinkedListTests {

  DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>(0);

  @Test
  @DisplayName("check linked list empty")
  void isLinkedListEmpty(){
    assertFalse(linkedList.isEmpty());
  }

  @Test
  @DisplayName("add 1 item linked list tail")
  void add1ItemToLinkedList(){
    linkedList.addAtTail(1);
    assertEquals(1,linkedList.getSize());
  }

  @Test
  @DisplayName("add item at linked list head")
  void addItemAtLinkedListHead(){
    Node<Integer> newNode = linkedList.addAtHead(1);
    Node<Integer> head = linkedList.getHead();
    assertEquals(head,newNode.prev);
  }


  @Test
  @DisplayName("should add 10 items at linked list head")
  void shouldAdd10ItemsAtLinkedListHead(){
    Node<Integer> head = linkedList.getHead();
    for (int i = 0; i < 10; i++) {
      linkedList.addAtHead(i);
    }
    assertEquals(9,head.next.val);
  }







}
