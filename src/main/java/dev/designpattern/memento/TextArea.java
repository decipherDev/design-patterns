package dev.designpattern.memento;

/**
 * Originator class of memento pattern
 */
public class TextArea {
   private String text; //state
   
   public void setText(String text) {
      this.text = text;   
   }

   public Memento takeSnapshot() {
      return new Memento(this.text);
   }

   public void restore(Memento memento) {
      text = memento.text;
   }

   public static class Memento {
      private final String text;

      private Memento(String text) {
         this.text = text;
      }

      public String getText() {
         return text;
      }
   }
}
