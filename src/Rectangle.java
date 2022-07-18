public class Rectangle {
    int top = 0, left = 0, width = 0, height = 0;
   public Rectangle(int top, int left, int width, int height) { // по 2 сторонам и кордам
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    /* public Rectangle( int width, int height) { //по 2 сторонам
        this.width = width;
        this.height = height;
        this.top = 0;
        this.left = 0;
      } */

    /* public Rectangle(int top, int left, int width) { // по кордам и 1 стороне
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = this.width;
    } */

   /* public Rectangle(int width) { //по 1 стороне
        this.width = width;
        this.height = this.width;
        this.top = 0;
        this.left = 0;
    }
   */

     /* public Rectangle(int top, int left, int x, int y) { // по 4 кордам
        this.top = top;
        this.left = left;
        this.width = (x - left)<0 ? -(x - left) : (x - left);
        this.height = (y - top)<0 ? -(y - top) : (y - top);
    }
    */

    /*public Rectangle(int x, int y) { // по 2 кордам
        this.top = 0;
        this.left = 0;
        this.width = x;
        this.height = y;
    } */

    /* public Rectangle(int x, int height) { //по корде и высоте
        this.top = 0;
        this.left = 0;
        this.width = x
        this.height = height;
    }
  */

    /* public Rectangle(int y, int width) { //по корде и ширине
        this.top = 0;
        this.left = 0;
        this.width = width;
        this.height = y;
    }
    */

    public void status(){
        System.out.println("x "+top+" y "+left+" width "+width+" height "+height+" height");
    }
}
