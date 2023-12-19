package Ex2_2;
public class App {
    public static void main(String[] args) {
        SortingProcessor.process(new InsertionSort());
        SortingProcessor.process(new MergeSort());
        SortingProcessor.process(new SelectionSort());
    }
}
