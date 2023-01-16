package com.kirschke;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;


    private static int numberOfCalculations;
    private static double sumOfResults;


    public MathEquation() {} //default constructor

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }
    
    void execute() {
        switch (opCode) {
            case 'a' -> result = leftVal + rightVal;
            case 's' -> result = leftVal - rightVal;
            case 'd' -> result = (rightVal != 0) ? (leftVal / rightVal) : 0.0d;
            case 'm' -> result = leftVal * rightVal;
            default -> {
                System.out.println("Invalid opCode:" + opCode);
                result = 0.0d;
            }
        }
        numberOfCalculations++;
        sumOfResults += result;
        }

        public void execute(double leftVal, double rightVal) {
            this.leftVal = leftVal;
            this.rightVal = rightVal;
            execute();
        }

        public void execute(int leftVal, int rightVal) {
            this.leftVal = leftVal;
            this.rightVal = rightVal;
            execute();

            result = (int) result;
        }

        public static double getAverageResult() {
            return sumOfResults / numberOfCalculations;
        }
        public double getLeftVal() {
            return this.leftVal;
        }
        public double getRightVal() {
            return this.rightVal;
        }
        public double setLeftVal(double leftVal) {
            this.leftVal = leftVal;
            return leftVal;
        }
        public double setRightVal(double rightVal) {
            this.rightVal = rightVal;
            return rightVal;
        }
        public double setOpCode(char opCode) {
            this.opCode = opCode;
            return opCode;
        }
        public double getResult() {
            return this.result;
        }
    }
