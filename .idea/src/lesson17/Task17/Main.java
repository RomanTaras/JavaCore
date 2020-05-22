package lesson17.Task17;

public class Main {
    public static void main(String[] args) {

        Number[] number = {2, 5, 7, 585, -254, -635, 58, 10, 17};

        CollEctions collEctions = new CollEctions();

        CollEctions.MyInnerClassOne myInnerClassOne = collEctions.new MyInnerClassOne();
        CollEctions.MyInnerClassTwo myInnerClassTwo = collEctions.new MyInnerClassTwo();

        myInnerClassOne.next(number);
        System.out.println(myInnerClassOne.hasNext(number));

        myInnerClassTwo.next(number);
    }

    @Override
    public String toString() {
        return "Main{}";
    }
}

