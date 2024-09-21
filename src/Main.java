/**
 * 1543
 */

import java.io.*;
import java.util.*;

class Main {
    /** 이 코드의 문제점은 문자열을 비교할 때, 다름을 발견하면 그 문자부터 다시 비교를 시작하기 때문이다. 예외 상황은 다름을 발견하기 전에 일치하는 문자가 시작하는 경우가 있다.
     * aaabaaab
     * aab
     * 정답은 2이지만, 이 코드는 0을 반환한다.
     * */
//        public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("src/input.txt"));
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        char[] word = sc.nextLine().toCharArray();
//        int i = 0;
//        int count = 0;
//        for (char ch : str.toCharArray()) {
//            if (word[i] == ch) {
//                i++;
//            } else {
//                i = 0;
//                if (word[i] == ch) {
//                    i++;
//                }
//            }
//
//            if (i == word.length) {
//                i = 0;
//                count++;
//            }
//        }
//
//        System.out.print(count);
//    }
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();

        int count = 0;
        int startIndex = 0;
        while (true) {
            int findIndex = doc.indexOf(word, startIndex);
            if (findIndex < 0) break;
            count++;
            startIndex = findIndex + word.length();
        }
        System.out.println(count);
    }
}


/** 1157 */
//import java.io.FileInputStream;
//import java.util.Scanner;
//
//class Main {
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

/** 1919 */
//import java.io.FileInputStream;
//import java.util.Scanner;
//
//class Main {
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
