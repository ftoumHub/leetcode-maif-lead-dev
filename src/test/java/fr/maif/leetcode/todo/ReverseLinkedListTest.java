package fr.maif.leetcode.todo;

import fr.maif.leetcode.commons.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLinkedListTest {

  private ReverseLinkedList t = new ReverseLinkedList();

  @Test
  public void testReverseList() throws Exception {
    ListNode l = ListNode.createList(new int[]{1,2});
    l = t.reverseList(l);
    assertEquals(2, l.val);
    assertEquals(1, l.next.val);
  }
}