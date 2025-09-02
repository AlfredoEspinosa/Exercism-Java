class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        String result = null;
        try {
            switch(operation){
                case "+" -> result = String.valueOf(operand1)+" + "+String.valueOf(operand2)+" = "+String.valueOf(operand1+operand2);
                case "*" -> result = String.valueOf(operand1)+" * "+String.valueOf(operand2)+" = "+String.valueOf(operand1*operand2);
                case "/" -> result = String.valueOf(operand1)+" / "+String.valueOf(operand2)+" = "+String.valueOf(operand1/operand2);        
                case null ->throw new IllegalArgumentException("Operation cannot be null"); 
                case "" -> throw new IllegalArgumentException("Operation cannot be empty"); 
                default -> throw new IllegalOperationException("Operation '"+operation+"' does not exist"); 
            }
        } catch (ArithmeticException ae) {
            if(operand2==0 && "/".equals(operation)){
                throw new IllegalOperationException("Division by zero is not allowed", ae);
            }
        }
        return result;
    }
}
