package dev.designpattern.memento;

public class MementoClient {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("This is just for demo");       
        editor.write("This is just for demo purpose");
        editor.undo();
        editor.printCurrentSnapshot();
        editor.undo();
        editor.printCurrentSnapshot();
    }
}
