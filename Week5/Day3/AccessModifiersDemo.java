class AccessExample {

    public String publicMessage = "Public access";
    private String privateMessage = "Private access";
    protected String protectedMessage = "Protected access";
    String defaultMessage = "Default access";

    public void showPrivateMessage() {
        System.out.println(privateMessage);
    }
}

public class AccessModifiersDemo {

    public static void main(String[] args) {

        AccessExample obj = new AccessExample();

        System.out.println(obj.publicMessage);
        System.out.println(obj.protectedMessage);
        System.out.println(obj.defaultMessage);

        obj.showPrivateMessage();
    }
}
