import java.util.Scanner;

class stackOp {
    int item, n, top;
    int[] A;

    // Constructor to initialize stack size
    stackOp(int size) {
        this.n = size;
        this.top = -1;
        this.A = new int[n];
    }

    void push(int item) {
        if (top >= n - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            A[top] = item;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("The deleted element is: " + A[top]);
            top--;
        }
    }

    void full() {
        if (top == n - 1) {
            System.out.println("Stack is full");
        } else {
            System.out.println("Stack is not full");
        }
    }

    void empty() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("The element is: " + A[top]);
        }
    }
}

public class Stack2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();
        stackOp ob = new stackOp(size);

        char c;
        int choice;

        do {
            System.out.println("\nStack operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. IsFull");
            System.out.println("4. IsEmpty");
            System.out.println("5. peek");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to be inserted: ");
                    int item = sc.nextInt();
                    ob.push(item);
                    break;
                case 2:
                    ob.pop();
                    break;
                case 3:
                    ob.full();
                    break;
                case 4:
                    ob.empty();
                    break;
                case 5:
                    ob.peek();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.print("Do you want to continue (y/n): ");
            c = sc.next().charAt(0);
        } while (c == 'y' || c == 'Y');

        System.out.println("Exiting...");
        sc.close(); // Close the scanner
    }
}
