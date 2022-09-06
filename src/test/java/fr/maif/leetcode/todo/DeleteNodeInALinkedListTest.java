package fr.maif.leetcode.todo;

import fr.maif.leetcode.commons.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteNodeInALinkedListTest {

  DeleteNodeInALinkedList t = new DeleteNodeInALinkedList();

  @Test
  public void testDeleteNode() throws Exception {
    ListNode a1 = new ListNode(0);
    ListNode a2 = new ListNode(1);
    ListNode a3 = new ListNode(0);

    a1.next = a2;
    a2.next = a3;

    t.deleteNode(a1);
    assertEquals(1, a1.val);
    assertEquals(0, a1.next.val);
    assertEquals(null, a1.next.next);
  }
}