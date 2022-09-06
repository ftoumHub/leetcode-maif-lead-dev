package fr.maif.leetcode.todo;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Permutations2Test {

  Permutations2 t = new Permutations2();

  @Test
  public void test() {
    List<List<Integer>> actual = t.permuteUnique(new int[] { 1, 1, 2 });
    assertEquals(3, actual.size());
    assertThat(actual, hasItem(Arrays.asList(1, 1, 2)));
    assertThat(actual, hasItem(Arrays.asList(1, 2, 1)));
    assertThat(actual, hasItem(Arrays.asList(2, 1, 1)));
  }

}
