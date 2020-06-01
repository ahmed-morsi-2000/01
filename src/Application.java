public class Application implements Message, Calculator{

    @Override
    public void showMessage() {

    }

    @Override
    public void addNumber() {

    }


    public void showMessage(String name) {
        System.out.println("Welcome to the world of Java" + name);
    }


    public void addNumber(int x, int y) {
        System.out.println("the final value is " + x+y);

    }

    @Override
    public void addValue(int x, int y) {
        System.out.println(x + y);
    }


}
