package com.kirschke;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    public MathEquation() {}

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
