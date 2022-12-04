package sumtotarget;

public class NoSolutionFoundException extends RuntimeException{
    NoSolutionFoundException() {
        super("No Solution Found");
    }
}
