package com.kirschke;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //performCalculation();
//        Divider divider = new Divider();
//        doCalculation(divider, 100, 50);
//
//        Adder adder = new Adder();
//        doCalculation(adder, 25, 92);
//
//        performMoreCalculations();
        executeInteractively();


        }

    private static CalculateBase createCalculation(MathOperation operation, double leftVal, double rightVal) {
        CalculateBase calculation = null;
        switch(operation) {
            case ADD:
                calculation = new Adder(leftVal, rightVal);
                break;
            case SUBTRACT:
                calculation = new Subtractor(leftVal, rightVal);
                break;
            case MULTIPLY:
                calculation = new Multiplier(leftVal, rightVal);
                break;
            case DIVIDER:
                calculation = new Divider(leftVal, rightVal);
                break;
        }

        return calculation;
    }

    static void executeInteractively() {
        System.out.println("Enter an operation and two numbers: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }

    private static void performOperation(String[] parts) {
        MathOperation operation = MathOperation.valueOf(parts[0].toUpperCase());
        double leftVal = Double.parseDouble(parts[1]);
        double rightVal = Double.parseDouble(parts[2]);
        CalculateBase calculation = createCalculation(operation, leftVal, rightVal);
        calculation.calculate();
        System.out.println("Operation performed: " + operation);
        System.out.println(calculation.getResult());
    }

    private static void performMoreCalculations() {
        CalculateBase[] calculations = {
                new Divider(100, 50),
                new Adder(25, 92),
                new Subtractor(225, 17),
                new Multiplier(11, 3)
        };

        System.out.println();
        System.out.println("Array Calculations");

        for (CalculateBase calculation : calculations) {
            calculation.calculate();
            System.out.println("Result = " + calculation.getResult());
        }
    }

    static void doCalculation(CalculateBase calculation, double leftVal, double rightVal) {
            calculation.setLeftVal(leftVal);
            calculation.setRightVal(rightVal);
            calculation.calculate();
            System.out.println("Calculation result = " + calculation.getResult());

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
