package home.solmaz.spoj;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LifeUniverseAndEverything implements Imitation,InputOutputAble<Integer> {
    private final List<Integer> nums ;


    public LifeUniverseAndEverything() {
        this.nums = new ArrayList<>();
    }

    @Override
    public void imitate() {
        System.out.println("Enter the -100< Integer <100: ");
        Integer num= 0;
        do{
            num = getInput();

            if((num!=42 && num!=-100)) // 42 means terminate the  getting Inputs and print results.
                nums.add(num);
            else if(num!=-100)
                break;
        }while (true);

        nums.forEach(this::displayInput);
    }

    @Override
    public Integer getInput()  {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if(num<100 && num>-100)
            return num;
        else
           System.out.println("Please enter the Integer between -99 and 99");
        // -100 means the Integer is not between -99 and 99.
        return -100;
    }

    @Override
    public void displayInput(Integer integer) {
        System.out.println(integer);

    }

    public static void main(String[] args) {
        LifeUniverseAndEverything lifeUniverseAndEverything=new LifeUniverseAndEverything();
        lifeUniverseAndEverything.imitate();
    }

}
