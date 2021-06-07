package racing.view;

import racing.domain.Car;
import racing.domain.Cars;
import racing.domain.RoundCars;
import racing.domain.Winners;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {


    public void printCars(RoundCars roundCars) {
        for (Cars cars : roundCars) {
            for (Car car : cars.getCars()) {
                System.out.print(car.getName() + " : ");
                int movingRange = car.getMovingRange();
                resultMovingRange(movingRange);
                System.out.println();
            }
            System.out.println();
        }
    }

    private void resultMovingRange(int movingRange) {
        for (int i = 0; i < movingRange; i++) {
            System.out.print("-");
        }
    }

    public void printWinners(Winners winners) {
        System.out.print("최종 우승자: ");
        String winner = winners.winners().stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(winner);
    }

}
