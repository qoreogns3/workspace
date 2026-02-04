import java.util.*;

public class BaseballSimulator {

  // 중복 없는 3자리 랜덤 숫자 생성
  public static int[] generateAnswer() {
    int[] answer = new int[3];
    Random rand = new Random();

    for (int i = 0; i < 3; i++) {
      answer[i] = rand.nextInt(9) + 1;

      // 중복 체크
      for (int j = 0; j < i; j++) {
        if (answer[j] == answer[i]) {
          i--;
          break;
        }
      }
    }
    return answer;
  }

  // 스트라이크와 볼 계산
  public static int[] check(int[] answer, int[] guess) {
    int strike = 0;
    int ball = 0;

    for (int i = 0; i < 3; i++) {
      if (answer[i] == guess[i]) {
        strike++;
      } else {
        for (int j = 0; j < 3; j++) {
          if (i != j && answer[i] == guess[j]) {
            ball++;
            break;
          }
        }
      }
    }

    return new int[]{strike, ball};
  }

  // 배열을 문자열로 변환
  public static String arrayToString(int[] arr) {
    return arr[0] + " " + arr[1] + " " + arr[2];
  }

  // 게임 진행 (개선된 전략)
  public static int solveGameWithLog(int[] answer, boolean showLog) {
    List<int[]> candidates = new ArrayList<>();

    // 모든 가능한 조합 생성 (504가지)
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        for (int k = 1; k <= 9; k++) {
          if (i != j && j != k && i != k) {
            candidates.add(new int[]{i, j, k});
          }
        }
      }
    }

    int attempts = 0;

    // 고정된 첫 3회 시도
    int[][] fixedGuesses = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    if (showLog) {
      System.out.println("\n=== 게임 진행 상황 ===");
      System.out.println("정답: [" + arrayToString(answer) + "]");
      System.out.println();
    }

    // 처음 3회는 고정된 시도
    for (int i = 0; i < 3; i++) {
      attempts++;
      int[] guess = fixedGuesses[i];
      int[] result = check(answer, guess);

      if (showLog) {
        System.out.printf("%d회 시도: [%s] → %d스트라이크 %d볼 (남은 후보: %d개)\n",
                attempts, arrayToString(guess), result[0], result[1], candidates.size());
      }

      // 정답 찾음 (확률은 낮지만)
      if (result[0] == 3) {
        if (showLog) {
          System.out.println(">>> " + attempts + "회 만에 정답을 맞췄습니다!\n");
        }
        return attempts;
      }

      // 결과에 맞지 않는 후보들 제거
      List<int[]> newCandidates = new ArrayList<>();
      for (int[] candidate : candidates) {
        int[] testResult = check(candidate, guess);
        if (testResult[0] == result[0] && testResult[1] == result[1]) {
          newCandidates.add(candidate);
        }
      }
      candidates = newCandidates;
    }

    // 4회부터는 남은 후보 중에서 선택
    while (!candidates.isEmpty()) {
      attempts++;

      // 첫 번째 후보로 시도
      int[] guess = candidates.get(0);
      int[] result = check(answer, guess);

      if (showLog) {
        System.out.printf("%d회 시도: [%s] → %d스트라이크 %d볼 (남은 후보: %d개)\n",
                attempts, arrayToString(guess), result[0], result[1], candidates.size());
      }

      // 정답 찾음
      if (result[0] == 3) {
        if (showLog) {
          System.out.println(">>> " + attempts + "회 만에 정답을 맞췄습니다!\n");
        }
        return attempts;
      }

      // 결과에 맞지 않는 후보들 제거
      List<int[]> newCandidates = new ArrayList<>();
      for (int[] candidate : candidates) {
        int[] testResult = check(candidate, guess);
        if (testResult[0] == result[0] && testResult[1] == result[1]) {
          newCandidates.add(candidate);
        }
      }
      candidates = newCandidates;
    }

    return attempts;
  }

  // 1000번 시뮬레이션
  public static void main(String[] args) {
    int[] results = new int[1000];
    List<int[]> eightAttemptAnswers = new ArrayList<>();

    System.out.println("숫자야구 1000회 시뮬레이션 시작...");
    System.out.println("전략: 처음 3회는 [1 2 3], [4 5 6], [7 8 9] 고정\n");

    for (int i = 0; i < 1000; i++) {
      int[] answer = generateAnswer();
      int attempts = solveGameWithLog(answer, false);
      results[i] = attempts;

      // 8회가 나온 경우 저장
      if (attempts == 8) {
        eightAttemptAnswers.add(answer);
      }

      // 진행상황 표시 (100번마다)
      if ((i + 1) % 100 == 0) {
        System.out.println((i + 1) + "번 완료...");
      }
    }

    // 통계 계산
    int min = Arrays.stream(results).min().getAsInt();
    int max = Arrays.stream(results).max().getAsInt();
    double avg = Arrays.stream(results).average().getAsDouble();

    System.out.println("\n=== 전체 결과 통계 ===");
    System.out.printf("최소 시도 횟수: %d회\n", min);
    System.out.printf("최대 시도 횟수: %d회\n", max);
    System.out.printf("평균 시도 횟수: %.2f회\n", avg);

    // 분포 출력
    Map<Integer, Integer> distribution = new HashMap<>();
    for (int result : results) {
      distribution.put(result, distribution.getOrDefault(result, 0) + 1);
    }

    System.out.println("\n=== 시도 횟수 분포 ===");
    for (int i = min; i <= max; i++) {
      if (distribution.containsKey(i)) {
        System.out.printf("%d회: %d번 (%.1f%%)\n",
                i, distribution.get(i), distribution.get(i) * 100.0 / 1000);
      }
    }

    // 8회가 나온 경우 상세 출력
    System.out.println("\n" + "=".repeat(60));
    System.out.println("8회가 걸린 경우: " + eightAttemptAnswers.size() + "번");
    System.out.println("=".repeat(60));

    if (eightAttemptAnswers.isEmpty()) {
      System.out.println("8회가 걸린 경우가 없습니다.");
    } else {
      // 처음 5개만 상세 출력 (너무 많으면 5개로 제한)
      int showCount = Math.min(5, eightAttemptAnswers.size());
      System.out.println("\n처음 " + showCount + "개의 8회 케이스 상세 진행:");

      for (int i = 0; i < showCount; i++) {
        System.out.println("\n" + "-".repeat(60));
        System.out.println("케이스 " + (i + 1));
        System.out.println("-".repeat(60));
        solveGameWithLog(eightAttemptAnswers.get(i), true);
      }

      if (eightAttemptAnswers.size() > 5) {
        System.out.println("\n... 외 " + (eightAttemptAnswers.size() - 5) + "개 케이스 더 있음");
      }
    }

    // 최대 횟수 케이스도 출력
    System.out.println("\n" + "=".repeat(60));
    System.out.println("최대 시도 횟수 (" + max + "회) 케이스:");
    System.out.println("=".repeat(60));

    for (int i = 0; i < 1000; i++) {
      if (results[i] == max) {
        int[] answer = generateAnswer();
        // 같은 결과가 나올 때까지 재시도 (확인용)
        while (solveGameWithLog(answer, false) != max) {
          answer = generateAnswer();
        }
        solveGameWithLog(answer, true);
        break;
      }
    }
  }
}