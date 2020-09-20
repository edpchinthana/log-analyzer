package output;

public interface Output {
    void showMessage(String message);
    void showMenu();
    void showException(Exception exception);
}