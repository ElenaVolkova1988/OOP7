package commands;

import java.io.IOException;

import UI.Console;

public class AddNote extends Command{

    public AddNote(Console console) {
        super(console);
    }

    @Override
    public String descriptions() {
        return "Добавить заметку";
    }

    @Override
    public void execute() throws IOException, ClassNotFoundException {
        getConsole().addNote();
    }

}
