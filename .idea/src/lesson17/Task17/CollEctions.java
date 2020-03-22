package lesson17.Task17;

import java.util.Arrays;
import java.util.Collections;

class CollEctions {
    public static void main(String[] args) {


        Integer[] numberArray = new Integer[14];
        final Integer[] temp = {0};

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = (int) (Math.random() * 10);
        }

        class Test1 implements Iterator {
            @Override
            public void hasNext() {
                Arrays.sort(numberArray);
                System.out.println("Sorted array from nested class Test1 : " + Arrays.toString(numberArray));
            }

            @Override
            public void next() {
                for (int i = 0; i < numberArray.length; i++) {
                    if (numberArray[i] % 2 != 0) {
                        numberArray[i] = 0;
                    }
                }
                System.out.println("After replacing odd elements to '0'  : " + Arrays.toString(numberArray));

            }


        }
        class Test2 implements Iterator {

            @Override
            public void hasNext() {

                Arrays.sort(numberArray, Collections.reverseOrder());
                ;
                System.out.println("Reversed array from nested class Test2 : " + Arrays.toString(numberArray));

            }

            @Override
            public void next() {

                Arrays.sort(numberArray, Collections.reverseOrder());
                Arrays.toString(numberArray);
                for (int i = 0; i < numberArray.length; i++) {
                    if (numberArray[i] != numberArray[i]++) {
                        numberArray[i] = numberArray[i];
                    }
                }

               Arrays.stream(numberArray).limit(7).forEach(System.out::println);
            }
        }

        Test1 test1 = new Test1();
        Test2 test2 = new Test2();

        test1.hasNext();
        test1.next();

        test2.hasNext();
        test2.next();


    }
}


