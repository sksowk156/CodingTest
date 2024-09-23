import java.io.FileInputStream;
import java.util.Scanner;


class Main {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
    }
}

/**
 * https://www.acmicpc.net/problem/10158, 실패
 * x축, y축 규칙을 따로 찾아야 함, 왜 틀린지는 모르겟음.
 */
//class Main {
//
////    public static void main(String[] args) throws Exception {
////        System.setIn(new FileInputStream("src/input.txt"));
////        Scanner sc = new Scanner(System.in);
////        int w = sc.nextInt();
////        int h = sc.nextInt();
////        int p = sc.nextInt();
////        int q = sc.nextInt();
////        int time = sc.nextInt();
////
////        int realXPosition = time + p;
////        int realYPosition = time + q;
////
////        int xResult = 0;
////        int xPositionColumn = (realXPosition / w) % 2;
////        int xPostionRemain = realXPosition % w;
////        if (xPostionRemain == 0) {
////            if (xPositionColumn == 0) {
////                xResult = 0;
////            } else {
////                xResult = w;
////            }
////        } else {
////            if (xPositionColumn == 0) {
////                xResult = xPostionRemain;
////            } else {
////                xResult = w - xPostionRemain;
////            }
////        }
////
////        int yResult = 0;
////        int yPositionColumn = (realYPosition / h) % 2;
////        int yPositionRemain = realYPosition % h;
////        if (yPositionRemain == 0) {
////            if (yPositionColumn == 0) {
////                yResult = 0;
////            } else {
////                yResult = h;
////            }
////        } else {
////            if (yPositionColumn == 0) {
////                yResult = yPositionRemain;
////            } else {
////                yResult = h - yPositionRemain;
////            }
////        }
////
////        System.out.println(xResult + " " + yResult);
////    }
//
////    static int[] xDist = {1, 1, -1, -1};
////    static int[] yDist = {1, -1, 1, -1};
////
////    public static void main(String[] args) throws Exception {
////        System.setIn(new FileInputStream("src/input.txt"));
////        Scanner sc = new Scanner(System.in);
////        int w = sc.nextInt();
////        int h = sc.nextInt();
////        int p = sc.nextInt();
////        int q = sc.nextInt();
////        int time = sc.nextInt();
////
////        int newP = p;
////        int newQ = q;
////        int preP = p;
////        int preQ = q;
////
////        int direction = 0;
////        for (int i = 0; i < time; i++) {
////            if (newP == w || newQ == h || newP == 0 || newQ == 0) {
////                int count = 0;
////                for (int j = 0; j < 4; j++) {
////                    int reflectX = newP + xDist[j];
////                    int reflectY = newQ + yDist[j];
////
////                    if (reflectX <= w && reflectY <= h && reflectX >= 0 && reflectY >= 0) {
////                        count++;
////                        if (count == 2 && reflectX == preP && reflectY == preQ) break;
////                        direction = j;
////                    }
////                }
////            }
////            preP = newP;
////            preQ = newQ;
////            newP += xDist[direction];
////            newQ += yDist[direction];
////        }
////
////        System.out.print(newP + " " + newQ);
////    }
//}


/** 13223 */
//class Main {
//    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("src/input.txt"));
//        Scanner sc = new Scanner(System.in);
//        String currentTime = sc.nextLine();
//        String targetTime = sc.nextLine();
//
//        int currentTimeInSec = calculateTimeInSec(currentTime);
//        int targetTimeInSec = calculateTimeInSec(targetTime);
//        int oneDayInSec = 24 * 60 * 60;
//        int waitingTimeInSec = 0;
//        if (currentTimeInSec >= targetTimeInSec) { // 시간이 같은 경우엔, 24시간 후가 targetTime이다.
//            waitingTimeInSec = oneDayInSec - currentTimeInSec + targetTimeInSec;
//        } else {
//            waitingTimeInSec = targetTimeInSec - currentTimeInSec;
//        }
//        String waitingTime = makeTimeFormat(waitingTimeInSec);
//        System.out.println(waitingTime);
//    }
//
//    public static int calculateTimeInSec(String time) {
//        String[] times = time.split(":");
//        int hours = Integer.parseInt(times[0]);
//        int minutes = Integer.parseInt(times[1]);
//        int seconds = Integer.parseInt(times[2]);
//
//        return (hours * 3600) + (minutes * 60) + seconds;
//    }
//
//    public static String makeTimeFormat(int timeInSec) {
//        int hours = (timeInSec / 3600);
//        timeInSec %= 3600;
//        int minutes = (timeInSec / 60);
//        timeInSec %= 60;
//        int seconds = timeInSec;
//
//        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
//    }
//}

/** 1543 */
//class Main {
//    /** 이 코드의 문제점은 문자열을 비교할 때, 다름을 발견하면 그 문자부터 다시 비교를 시작하기 때문이다. 예외 상황은 다름을 발견하기 전에 일치하는 문자가 시작하는 경우가 있다.
//     * aaabaaab
//     * aab
//     * 정답은 2이지만, 이 코드는 0을 반환한다.
//     * */
////        public static void main(String[] args) throws Exception {
////        System.setIn(new FileInputStream("src/input.txt"));
////        Scanner sc = new Scanner(System.in);
////        String str = sc.nextLine();
////        char[] word = sc.nextLine().toCharArray();
////        int i = 0;
////        int count = 0;
////        for (char ch : str.toCharArray()) {
////            if (word[i] == ch) {
////                i++;
////            } else {
////                i = 0;
////                if (word[i] == ch) {
////                    i++;
////                }
////            }
////
////            if (i == word.length) {
////                i = 0;
////                count++;
////            }
////        }
////
////        System.out.print(count);
////    }
//    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("src/input.txt"));
//        Scanner sc = new Scanner(System.in);
//        String doc = sc.nextLine();
//        String word = sc.nextLine();
//
//        int count = 0;
//        int startIndex = 0;
//        while (true) {
//            int findIndex = doc.indexOf(word, startIndex);
//            if (findIndex < 0) break;
//            count++;
//            startIndex = findIndex + word.length();
//        }
//        System.out.println(count);
//    }
//}


/** 1157 */
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
