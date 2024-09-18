package Shorts;

public class SwitchStatement {
    public static void main(String[] args) {

        int number = 4;

        switch (number) {
            case 1:
                System.out.println("This is winter");
                break;
                case 2:
                    System.out.println("This is spring");
                    break;
                    case 3:
                        System.out.println("This is summer");
                        break;
                        case 4:
                            System.out.println("This is fall");
                            break;
            default:
                System.out.println("No such number");
                break;
        }
    }
}
