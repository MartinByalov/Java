import java.util.HashSet;
import java.util.Set;

public class Toto_5_35 {

    private Set<Integer> numbers;
    private int drawNumber;
    private int drawYear;

    public Toto_5_35(int[] numbers, int drawNumber, int drawYear){

        if(numbers.length != 5){
            throw new IllegalArgumentException("Фишът трябва да съдържа точно 5 числа.");
        }
        this.numbers = new HashSet<>();

        for(int number : numbers){
            if(number < 1 || number > 35){
                throw new IllegalArgumentException("Числата трябва да са в интервала [1; 35]");
            }
            this.numbers.add(number);
        }
        if(this.numbers.size() != 5){
            throw new IllegalArgumentException("Числата трябва да са различни.");
        }

        if(drawNumber < 1 || drawNumber > 52 || drawYear < 2001 || drawYear > 2023){
            throw new IllegalArgumentException("Номера на тиража или годината са  допустимите граници");
        }
        this.drawNumber = drawNumber;
        this.drawYear = drawYear;
    }

    public Set<Integer> getNumbers(){
        return numbers;
    }

    public int getDrawNumber(){
        return drawNumber;
    }

    public int getDrawYear(){
        return drawYear;
    }

    @Override
    public String toString() {
        return "Фиш: " + numbers + " | Тираж: " + drawNumber + " | Година: " + drawYear;
    }
}
