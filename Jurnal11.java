import java.util.Scanner;

public class Jurnal11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BinaryTree2<Integer> bt = new BinaryTree2<>();
        System.out.println("Binary Tree Test\n");
        char ch;
        do {
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");
            System.out.println("Enter your choice:");
            int choice = scan.nextInt();
            scan.nextLine(); // Consume the newline character after integer input

            switch (choice) {
                case 1:
                    System.out.println("Enter integer elements to insert (separated by space):");
                    String[] inputs = scan.nextLine().split("\\s+"); // Read multiple integers in one line
                    for (String input : inputs) {
                        try {
                            int element = Integer.parseInt(input);
                            bt.insert(element);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input: " + input + ", not an integer.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter integer element to search:");
                    int elementToSearch = scan.nextInt();
                    System.out.println("Search result : " + bt.search(elementToSearch));
                    break;
                case 3:
                    System.out.println("Nodes = " + bt.countNodes());
                    break;
                case 4:
                    System.out.println("Empty status = " + bt.isEmpty());
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            System.out.print("\nPost order : ");
            bt.postorder();
            System.out.print("\nPre order : ");
            bt.preorder();
            System.out.print("\nIn order : ");
            bt.inorder();
            System.out.println("\n\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
            scan.nextLine(); // Consume the newline after reading a character
        } while (ch == 'Y' || ch == 'y');
        scan.close();
    }
}
