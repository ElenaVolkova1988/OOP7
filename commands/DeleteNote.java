package commands;

import java.io.IOException;

import UI.Console;

public class DeleteNote extends Command{

    public DeleteNote(Console console) {
        super(console);
    }

    @Override
    public String descriptions() {
        return "Удалить заметку";
    }

    @Override
    public void execute() throws IOException, ClassNotFoundException {

    }

}
