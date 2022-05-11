public class AgeUnderNullException extends Exception {

    public AgeUnderNullException(int age) {
        super("Нужно было передать возраст не ниже 0: '" + age + "'");
    }
}
