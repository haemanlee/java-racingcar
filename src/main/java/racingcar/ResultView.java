package racingcar;

import java.util.List;

public class ResultView {
    public void print(RacingGame racingGame) {
        List<RaceRecord> raceRecords = racingGame.getRaceRecords();
        for (RaceRecord raceRecord : raceRecords) {
            System.out.println("ROUND " + raceRecord.getRound());
            raceRecord.getRecordsWithCarName()
                    .forEach((key, value) -> System.out.printf("%s : %s \n", key, StateUtil.makeStateLine(value)));
        }
        System.out.println(racingGame.getWinner() + "가 우승했습니다.");
    }
}