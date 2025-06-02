public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.add(new ConcreteObserver("Ana"));
        subject.add(new ConcreteObserver("Carlos"));

        subject.notifyAllObservers("Nova atualização disponível!");
    }
}