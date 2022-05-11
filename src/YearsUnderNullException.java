public class YearsUnderNullException extends RuntimeException {

    public YearsUnderNullException(int years) {
        super("Нужно было передать срок инвестирования  больше  0: '" + years + "'");
    }

}
