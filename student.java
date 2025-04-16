public class student {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments were passed.");
        } else {
            System.out.println("Arguments in reverse order:");
            for (int i = args.length - 1; i >= 0; i--) {
                System.out.println(args[i]);
            }
        }
    }
}
