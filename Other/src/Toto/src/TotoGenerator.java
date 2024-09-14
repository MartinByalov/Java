import java.util.*;

public class TotoGenerator {

    private static final Random RANDOMIZER = new Random();


    public static Set<Integer> generateUniqueRandomNumbers(int count){

        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < count){

            numbers.add(RANDOMIZER.nextInt(35) + 1);

        }
        return numbers;
    }

    public static List<Toto_5_35> generateRandomTickets(int drawNumber, int drawYear){

        List<Toto_5_35> tickets = new ArrayList<>();

    while (tickets.size() < 10000){

        Set<Integer> numbers = generateUniqueRandomNumbers(5);

        // запазваме елементите на Set в обикновен масив
        int[] array = new int[5];
        int i = 0;
        for(Integer number : numbers){

            array[i] = number;
            i++;
        }
        tickets.add(new Toto_5_35(array, drawNumber, drawYear));

    }
    return tickets;
    }
    }

