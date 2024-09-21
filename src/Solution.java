/**
 * 1919  1157
 * 1157
 * 1157
 */
//import java.io.FileInputStream;
//import java.util.Scanner;
//
//class Solution {
//    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("src/input.txt"));
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        String b = sc.next();
//
//        int[] countA = getAlphabetCount(a);
//        int[] countB = getAlphabetCount(b);
//
//        int ans = 0;
//        for (int i = 0; i < 26; i++) {
//            ans += Math.abs(countA[i] - countB[i]);
//        }
//        System.out.print(ans);
//    }
//
//    public static int[] getAlphabetCount(String str) {
//        int[] count = new int[26];
//        for (int i = 0; i < str.length(); i++) {
//            count[str.charAt(i) - 'a']++;
//        }
//        return count;
//    }
//}

/** 1157 */
//import java.io.FileInputStream;
//import java.util.Scanner;
//
//class Solution {
//    //    public static void main(String[] args) throws Exception {
////        System.setIn(new FileInputStream("src/input.txt"));
////        Scanner sc = new Scanner(System.in);
////        String a = sc.next();
////
////        Map<Character, Integer> alphabetCounting = new HashMap<>();
////
////        int maxCount = 0;
////        char alphabet = 'A';
////        for (char c : a.toCharArray()) {
////            char targetChar = c;
////            if (targetChar >= 'a' && targetChar <= 'z') targetChar = (char)((targetChar - 'a') + 'A');
////            alphabetCounting.put(targetChar, alphabetCounting.getOrDefault(targetChar, 0) + 1);
////
////            int currentCount = alphabetCounting.getOrDefault(targetChar, 0);
////            if (maxCount < currentCount) {
////                maxCount = currentCount;
////                alphabet = targetChar;
////            }
////        }
////
////        int count = 0;
////        for (int i : alphabetCounting.values()) {
////            if (i == maxCount) {
////                count++;
////            }
////        }
////
////        if (count > 1) {
////            System.out.print("?");
////        } else {
////            System.out.print(alphabet);
////        }
////    }
//    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("src/input.txt"));
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next().toUpperCase();
//
//        int[] count = getAlphabetCount(str);
//
//        int maxCount = -1;
//        char maxAlphabet = '?';
//        for (int i = 0; i < 26; i++) {
//            if (count[i] > maxCount) {
//                maxCount = count[i];
//                maxAlphabet = (char) (i + 'A');
//            } else if (count[i] == maxCount) {
//                maxAlphabet = '?';
//            }
//        }
//        System.out.println(maxAlphabet);
//    }
//
//    public static int[] getAlphabetCount(String str) {
//        int[] count = new int[26];
//        for (int i = 0; i < str.length(); i++) {
//            count[str.charAt(i) - 'A']++;
//        }
//        return count;
//    }
//}

/** 1543 */
import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws Exception {

    }
}
