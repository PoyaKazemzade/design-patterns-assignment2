public class Main {
    public static void main(String[] args) {
        // Lazy Initialization
        RootUserLazy lazy1 = RootUserLazy.getInstance();
        RootUserLazy lazy2 = RootUserLazy.getInstance();
        System.out.println("Lazy Initialization:");
        System.out.println("Same instance: " + (lazy1 == lazy2));

        // Public Static Final Instance
        RootUserStaticFinal static1 = RootUserStaticFinal.INSTANCE;
        RootUserStaticFinal static2 = RootUserStaticFinal.INSTANCE;
        System.out.println("\nPublic Static Final Instance:");
        System.out.println("Same instance: " + (static1 == static2));

        // Enum
        RootUserEnum enum1 = RootUserEnum.INSTANCE;
        RootUserEnum enum2 = RootUserEnum.INSTANCE;
        System.out.println("\nEnum:");
        System.out.println("Same instance: " + (enum1 == enum2));
    }
}