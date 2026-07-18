package practical3_2;
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
      
}


class ExceptionDemo {
    public void performTask(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Value cannot be negative");
        } else if (value > 100) {
            throw new CustomException("Value cannot exceed 100");
        } else {
            System.out.println("Task performed successfully");
        }
    }
}

public class Practical3_2 {
    public static void main(String[] args) {
        System.out.println("Shreyash S091");
        ExceptionDemo demo = new ExceptionDemo();
        try {
            demo.performTask(91);
            demo.performTask(119); // CustomException will be raised
        } catch (CustomException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());   
        }
        try {
            demo.performTask(-85);
        } catch (CustomException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());   
        }
        
    }
}

