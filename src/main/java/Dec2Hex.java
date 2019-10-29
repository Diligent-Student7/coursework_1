class Dec2Hex {

    private static int arg1;
    private static String errorMessage;
    private static String output;

    public static void main(String args[]) {
        convertToHex(args);
        System.out.println(output);
    }

    public static String convertToHex(String args[]){
        if(!checkInput(args))
            showErrorAndEnd(errorMessage);

        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        num = arg1;
        String hexadecimal="";

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        output = arg1 + " in hexadecimal representation is : " + hexadecimal;
        return hexadecimal;
    }

    static boolean checkInput(String args[]){
        if (args.length > 0) {
            try
            {
                arg1 = Integer.parseInt(args[0]);
                return true;
            }
            catch (NumberFormatException e)
            {
                errorMessage = "Argument '" + args[0] + "' must be an integer.";
                return false;
            }
        }else{
            errorMessage = "An input must be given to convert";
            return false;
        }
    }

    static void showErrorAndEnd(String message){
        System.err.println(message);
        System.exit(1);
    }
}
