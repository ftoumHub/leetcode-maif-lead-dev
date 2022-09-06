package fr.maif.leetcode.todo;

import fr.maif.leetcode.commons.ListNode;
import org.junit.Test;

public class OddEvenLinkedListTest {

  private OddEvenLinkedList t = new OddEvenLinkedList();

  @Test
  public void testOddEvenList() throws Exception {
    ListNode a = ListNode.createList(new int[]{1,2,3,4,5});
    System.out.println(t.oddEvenList(a));
  }
}