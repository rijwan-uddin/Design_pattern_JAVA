
package facade;

public class ShapeMaker {
   private shape circle;
   private shape rectangle;
   private shape  square;

   public ShapeMaker() {
      circle = new circle();
      rectangle = new rectangle();
      square = new square();
   }

   public void drawCircle(){
      circle.draw();
   }
   public void drawRectangle(){
      rectangle.draw();
   }
   public void drawSquare(){
      square.draw();
   }
}