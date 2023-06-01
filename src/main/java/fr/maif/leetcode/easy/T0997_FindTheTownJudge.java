package fr.maif.leetcode.easy;

import static io.vavr.API.println;

/**
 * In a town, there are n people labeled from 1 to n.
 * There is a rumor that one of these people is secretly the town judge.
 * <p>
 * If the town judge exists, then:
 * <p>
 * The town judge trusts nobody.
 * Everybody (except for the town judge) trusts the town judge.
 * There is exactly one person that satisfies properties 1 and 2.
 * You are given an array <code>trust</code> where <code>trust[i] = [ai, bi]</code> representing that the person
 * labeled <code>ai</code> trusts the person labeled bi. If a trust relationship does not exist in trust array,
 * then such a trust relationship does not exist.
 * <p>
 * Return the label of the town judge
 * if the town judge exists and can be identified, or return -1 otherwise.
 * <p>
 * <a href="https://www.youtube.com/watch?v=2AdzmA1IC1k">...</a>
 */
public class T0997_FindTheTownJudge {

    public static int findJudge(int n, int[][] trust) {
        // On ignore le 0, car personne n'est libellé 0 dans la ville.
        // On représente le score de chaque personne via un tableau d'entier
        // Si n = 3 alors trustScore : [0, 0, 0, 0]
        int[] trustScore = new int[n + 1];

        for (int[] trustPair : trust) {
            trustScore[trustPair[0]]--; // on décrémente la personne qui fait confiance
            trustScore[trustPair[1]]++; // on incrémente celui à qui on fait confiance
        }
        for (int i = 1; i <= n; i++) {
            // Le juge a un score de n - 1, soit le score maximum, car tout le monde lui fait confiance
            if (trustScore[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // {1,2} : 1 fait confiance à 2.
        println("Résultat : " + findJudge(2, new int[][] {{1,2}})); // 2
        // 1 fait confiance à 3.
        // 2 fait confiance à 3 donc 3 est le juge
        println("Résultat : " + findJudge(3, new int[][] {{1,3}, {2,3}})); // 3
        // 1 fait confiance à 3.
        // 2 fait confiance à 3.
        // 3 fait confiance à 1 donc il n'y a pas de juge identifiable.
        println("Résultat : " + findJudge(3, new int[][] {{1,3}, {2,3}, {3,1}})); // -1
    }
}
