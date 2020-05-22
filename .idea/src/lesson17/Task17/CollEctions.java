package lesson17.Task17;

import java.util.Arrays;
import java.util.Collections;

class CollEctions {

    public Number[] myNumbers;


    public CollEctions(Number[] myNumbers) {
        this.myNumbers = myNumbers;
    }

    public CollEctions() {
    }

    public Number[] getMyNumbers() {
        return myNumbers;
    }

    public void setMyNumbers(Number[] myNumbers) {
        this.myNumbers = myNumbers;
    }


    public class MyInnerClassOne implements Iterator {
        boolean v;
        int i = 0;


        @Override
        public boolean hasNext(Number[] myNumbers) {

            if (myNumbers.length > i) {
                v = true;
            } else {
                v = false;
            }
            return v;
        }


        @Override
        public Object next(Number[] myNumbers) {
            for (int i = 0; i < myNumbers.length; i++) {
                if (i % 2 != 0) {
                    myNumbers[i] = 0;
                    Arrays.sort(myNumbers);
                }

                System.out.println("Arrays.asList(myNumbers) = " + Arrays.asList(myNumbers));
            }
            return myNumbers;

        }
    }


    public class MyInnerClassTwo implements Iterator {
        boolean v;
        int i =0;
        @Override
        public boolean hasNext(Number[] number) {


            if (myNumbers.length > i) {
                v = true;
            } else {
                v = false;
            }
            return v;
        }

        @Override
        public Object next(Number[] myNumbers) {

            Arrays.sort(myNumbers, Collections.reverseOrder());

            System.out.println("Arrays.asList(myNumbers) = " + Arrays.asList(myNumbers));
            return myNumbers;
        }


    }
}









