package fr.maif.leetcode.todo;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstBadVersionTest {

  @Test
  public void testFirstBadVersion() throws Exception {
    FirstBadVersion t = new FirstBadVersion(1702766719);
    assertEquals(t.firstBadVersion, t.firstBadVersion(2126753390));
  }
}
