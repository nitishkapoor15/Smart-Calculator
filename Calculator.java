import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        //  A Smart Calculator

        // to take input from the user
Scanner sc= new Scanner(System.in);  

while(true) {
    System.out.println("\nEnter first number : ");
     double num1 = sc.nextDouble();

    System.out.println("Enter Second number : ");
    double num2 = sc.nextDouble();

    // show menu
    System.out.println("\nChoose an operation:");
    System.out.println("+ -> Addition");
    System.out.println("- -> Subtraction");
    System.out.println("* -> Multiplication");
    System.out.println("/ -> Division"); 

    System.out.print("Enter your choice (+, -, *, /): ");
    char op = sc.next().charAt(0);

// Perform calculation
    switch (op) {
        case '+' :
        System.out.println("Result: " + (num1 + num2));
            break;
    
            case '-' :
            System.out.println("Result: " + (num1 - num2));
                break;
    
                case '*' :
                System.out.println("Result: " + (num1 * num2));
                    break;
    
                    case '/' :
                    if(num2!=0){

                        System.out.println("Result: " + (num1 / num2));
                    }else{
                        System.out.println("❌ Cannot divide by zero!");
                    }
                        break;

        default:
        System.out.println("Invaild Operation");
            break;
    }
System.out.println("\nDo you want to Calculate again ? (y/n)");
    char again = sc.next().charAt(0);

    if(again == 'n' || again == 'N'){
        System.out.println("👋 Thank you for using Smart Calculator!");
        break;
    }


}




    }
}