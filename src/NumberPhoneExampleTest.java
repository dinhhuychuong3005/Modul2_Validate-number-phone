public class NumberPhoneExampleTest {
    private static NumberPhoneExample numberPhoneExample;
    public static final String[] isNumberPhone = {"(84)-(0978489648)", "(a8)-(22222222)"};

    public static void main(String[] args) {
        numberPhoneExample = new NumberPhoneExample();
        for (String numberPhone : isNumberPhone) {
            boolean isValid = numberPhoneExample.validate(numberPhone);
            System.out.println("Number phone: " + numberPhone + " is valid " + isValid);
        }
    }
}
