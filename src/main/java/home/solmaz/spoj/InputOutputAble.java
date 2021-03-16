package home.solmaz.spoj;

import java.io.IOException;

public interface InputOutputAble<T> {
     T getInput() throws IOException;
     void displayInput(T t);
}
