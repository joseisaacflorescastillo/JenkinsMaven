import org.example.Operations;
import org.junit.jupiter.api.Test;

public class OperationTest {
    Operations operations = new Operations();

    int n1 = 10;
    int n2 = 20;
    @Test
    public void sumTest(){
        System.out.println("Sum Result: " + operations.sumNumbers(n1, n2));
    }

    @Test
    public void subtractTest(){
        System.out.println("Subtract Result: " + operations.subtractNumbers(n1, n2));
    }
}
