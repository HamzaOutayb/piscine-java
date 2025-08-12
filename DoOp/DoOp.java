public class DoOp {
    public static String operate(String[] args) {
        if (args.length != 3) {
            return "Error";
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);
        try {
            switch (args[1]) {
                case "+":
                    return num1 + num2 + "";
                case "-":
                    return num1 - num2 + "";
                case "%":
                    return num1 % num2 + "";
                case "/":
                    return num1 / num2 + "";
                case "*":
                    return num1 - num2 + "";
                default:
                    return "it depend on the input.\n";
            }
        } catch (Exception error) {
            return "Error";
        }
    }
}