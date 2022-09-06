package fr.maif.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static io.vavr.API.println;

/**
 * <p>Given an array of integers <code>nums</code> and an integer <code>target</code>,
 * return <em>indices of the two numbers such that they add up to <code>target</code></em>.</p>
 *
 * <p>You may assume that each input would have <strong><em>exactly</em> one solution</strong>,
 * and you may not use the <em>same</em> element twice.</p>
 *
 * <p>You can return the answer in any order.</p>
 *
 *
 * L'idée ici est de stocker les éléments dans une HashMap avec en clé les valeurs du tableau
 * d'entier et en valeur l'indice de
 */
public class T0001_TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        println("Tableau d'entier : " + Arrays.toString(nums));
        println("cible : " + 9);
        // on doit retourner les indices des 2 éléments répondant au problème
        int[] resultat = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i < nums.length; i++) {
            if (!map.containsKey(target - nums[i])) { // On cherche si une clé égale à la différence existe
                map.put(nums[i], i); // si non, on alimente la map
            } else {
                // si oui, on retourne le tableau à 2 éléments
                resultat[0] = map.get(target - nums[i]);
                resultat[1] = i;
                break;
            }
        }
        return resultat;
    }

    public static void main(String[] args) {
        /**
         * Arrays.toString returns a string representation of the contents of the specified array.
         * The string representation consists of a list of the array's elements, enclosed in square
         * brackets ("[]"). Adjacent elements are separated by the characters ", " (a comma followed by a space).
         * Elements are converted to strings as by String.valueOf(int). Returns "null" if a is null.
         */
        println("Résultat : " + Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));

        println("Résultat : " + Arrays.toString(twoSum(new int[]{15,11,7,2}, 9)));
    }
}
