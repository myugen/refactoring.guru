package refactoring_guru.design_patterns.behavioral.command.example.commands;

import refactoring_guru.design_patterns.behavioral.command.example.editor.Editor;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
