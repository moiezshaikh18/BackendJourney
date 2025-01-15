package SpringJourney.Enums;

enum Status {
    RUNNING, FAILED, PENDING, SUCCESS;
}

public class EnumsExample {
    public static void main(String[] args) {

        // Loop through and print all enum values
        System.out.println("All Status Values:");
        for (Status s : Status.values()) {
            System.out.println(s);
        }

        System.out.println();

        // Example of using switch with enums
        Status currentStatus = Status.RUNNING;



        String message = switch (currentStatus) {
            case RUNNING -> "The process is running smoothly.";
            case FAILED -> "The process has failed. Please try again.";
            case PENDING -> "The process is pending. Please wait.";
            case SUCCESS -> "The process completed successfully!";
        };

        System.out.println(STR."Current Status: \{currentStatus}");
        System.out.println(STR."Message: \{message}");
    }
}
