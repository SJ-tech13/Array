public class Index {
    public static void main(String[] args) {
        double[] exampleArray = {1, 5, 6, 5, 4, 1};

        double[] examplesArray = new double[0];
        double maximum = examplesArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++) {

            if (exampleArray[i] > maximum) {

                maximum = exampleArray[i];

                index = i;

            }

        }

        System.out.println(index);

    }}