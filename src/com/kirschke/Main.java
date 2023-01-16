package com.kirschke;

public class Main {
    public static void main(String[] args) {
        performCalculation();
        }
        static void performCalculation() {
            MathEquation[] equations = new MathEquation[4];
            equations[0] = new MathEquation('d', 100.0d, 50);
            equations[1] = new MathEquation('a', 25, 92);
            equations[2] = new MathEquation('s',225, 17);
            equations[3] = new MathEquation('m', 11, 3);

            for (MathEquation equation : equations) {
                equation.execute();
                System.out.println("result = " + equation.getResult());
            }
            System.out.println("Average result = " + MathEquation.getAverageResult());

            System.out.println();
            System.out.println("Using execute overloads");
            System.out.println();

            MathEquation equationOverload = new MathEquation('d');
            double leftDouble = 9.0;
            double rightDouble = 4.0;
            equationOverload.execute(leftDouble, rightDouble);
            System.out.println("Overloaded result with doubles: " + equationOverload.getResult());

            int leftInt = 9;
            int rightInt = 4;
            equationOverload.execute(leftInt, rightInt);
            System.out.println("Overloaded result with ints: " + equationOverload.getResult());
        }


    }
