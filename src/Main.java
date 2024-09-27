import java.io.*;
import java.util.*;

/*
* https://www.acmicpc.net/problem/10448,
*
* */
class Main {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] map = new int[50];
        int n = 0;
        while(true) {
            int num = ((n + 1) * (n + 2)) / 2;
            if (num > 1000) break;
            map[n] = num;
            n++;
        }

        int[] result = new int[T];
        for (int count = 0; count < T; count++) {
            int targetNum = sc.nextInt();
            boolean found = false;

            for (int i = 0; i < n && !found; i++) {
                for (int j = i; j < n && !found; j++) {
                    for (int k = j; k < n && !found; k++) {
                        if (map[i] + map[j] + map[k] == targetNum) {
                            found = true;
                        }
                    }
                }
            }
            result[count] = found ? 1 : 0; // 결과 저장
        }

        for (int i = 0; i < T; i++) {
            System.out.println(result[i]);
        }
    }
}

/*
* https://fastcampus.co.kr/classroom/215135,
* 조건을 잘 확인해야 한다. 중복은 없다.
* */
//class Main {
//    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("src/input.txt"));
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int[] map = new int[1000000];
//        int[] array = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            int num = sc.nextInt();
//            map[num]++;
//            array[i] = num;
//        }
//
//        int sum = sc.nextInt();
//
//        int count = 0;
//        for (int i : array) {
//            int findNum = sum - i;
//            if (0 <= findNum && findNum <= 1000000) {
//                if (map[findNum] > 0) count++;
//            }
//        }
//
//        System.out.println(count/2);
//    }
//}

/*
 * https://www.acmicpc.net/problem/15552,
 */
//class Main {
//    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("src/input.txt"));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int N = Integer.parseInt(br.readLine());
//        int[] cnt = new int[10001];
//        for (int i = 0; i < N; i++){
//            cnt[Integer.parseInt(br.readLine())]++;
//        }
//
//        for (int i = 1; i <= 10000; i++) {
//            while(cnt[i]-- > 0) {
//                bw.write(i + "\n");
//            }
//        }
//        bw.flush();
//    }
//}

/*
 * https://www.acmicpc.net/problem/15552,
 */
//class Main {
//    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("src/input.txt"));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int T = Integer.parseInt(br.readLine());
//        while (T-- > 0) {
//            String[] nums = br.readLine().split(" ");
//            int a = Integer.parseInt(nums[0]);
//            int b = Integer.parseInt(nums[1]);
//            bw.write(a + b + "\n");
//        }
//        bw.flush();
//    }
//}

/* https://www.acmicpc.net/problem/1043, */
//class Main {
//    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("src/input.txt"));
//        Scanner sc = new Scanner(System.in);
//        int P = sc.nextInt();
//        int[] result = new int[P];
//        int count = P;
//        while (P-- > 0) {
//            int T = sc.nextInt();
//            int[] h = new int[20];
//            for (int i = 0; i < 20; i++) {
//                h[i] = sc.nextInt();
//            }
//
//            int cnt = 0;
//            for (int i = 0; i < 20; i++) {
//                for (int j = 0; j < i; j++) {
//                    if (h[j] > h[i]) {
//                        cnt++;
//                    }
//                }
//            }
//            result[T - 1] = cnt;
//        }
//
//        for (int i = 0; i < count; i++) {
//
//            System.out.println((i + 1) + " " + result[i]);
//        }
//    }
//    public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("src/input.txt"));
//        Scanner sc = new Scanner(System.in);
//        int P = sc.nextInt();
//        int[] result = new int[P];
//
//        for (int i = 0; i < P; i++) {
//            int num = sc.nextInt();
//
//            int[] line = new int[20];
//            for (int j = 0; j < 20; j++) {
//                int student = sc.nextInt();
//
//                if (j == 0) { // 엣지 케이스
//                    line[j] = student;
//                    continue;
//                }
//
//                int count = 0;
//                for (int k = j - 1; k >= 0; k--) {
//                    if (line[k] > student) {
//                        line[k + 1] = line[k];
//                        line[k] = student; // 엣지 케이스
//                        count++;
//                    } else {
//                        line[k + 1] = student;
//                        break;
//                    }
//                }
//
//                result[i] += count;
//            }
//        }
//
//        for (int i = 0; i < P; i++) {
//            System.out.println((i + 1) + " " + result[i]);
//        }
//    }
//}

/*
 * https://www.acmicpc.net/problem/1236,
 */
//class Main {
//        public static void main(String[] args) throws Exception {
//        System.setIn(new FileInputStream("src/input.txt"));
//        Scanner sc = new Scanner(System.in);
//        int y = sc.nextInt();
//        int x = sc.nextInt();
//        sc.nextLine(); // 남은 줄바꿈을 소비
//
//        char[] currentState = new char[x];
//        int resultY = 0;
//        for (int i = 0; i < y; i++) {
//            char[] line = sc.nextLine().toCharArray();
//            boolean isEmptyLine = false;
//            for (int j = 0; j < x; j++) {
//                if (line[j] == 'X') {
//                    isEmptyLine = true;
//                    currentState[j] = 'X';
//                }
//            }
//            if (!isEmptyLine) resultY++;
//        }
//
//        int resultX = 0;
//        for (int i : currentState) {
//            if (i != 'X') {
//                resultX++;
//            }
//        }
//
//        int result = 0;
//        if (resultX > resultY) {
//            result = resultX;
//        } else {
//            result = resultY;
//        }
//        System.out.println(result);
//    }
//}

/*
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


/* 13223 */
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

/* 1543 */
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


/* 1157 */
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

/* 1919 */
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
