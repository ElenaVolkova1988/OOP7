package UI;

import java.util.ArrayList;

public interface View {
    int printMenu();
    int choiceMenu();

    void printAll(String text);
    void delNote();

    int choiceRemove(int size);

    void removedNote();

    void emptyNotebook();

    ArrayList<String> addNote();

    void addedNote();


}
