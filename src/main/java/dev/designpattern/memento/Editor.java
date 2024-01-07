package dev.designpattern.memento;

import java.util.ArrayDeque;
import java.util.Deque;

import dev.designpattern.memento.TextArea.Memento;
/**
 * CareTaker class of memento pattern
 */
public class Editor {
    private Deque<Memento> snapshots;
    private TextArea textArea;

    public Editor() {
        snapshots = new ArrayDeque<>();
        textArea = new TextArea();
    }

    public void printCurrentSnapshot() {
        System.out.println(textArea.takeSnapshot().getText());
    }

    public void write(String text) {
        textArea.setText(text);
        snapshots.push(textArea.takeSnapshot());
    }

    public void undo() {
        textArea.restore(snapshots.pop());
    }
}
