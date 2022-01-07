import processing.core.PApplet;

public class Sketch extends PApplet {

 
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(750, 750);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    //Quad One

    for (int circleY = height/40; circleY < height/2; circleY += height/2/5){
      for (int circleX = width/18 * 17; circleX > width/2; circleX -= width/2/5){
        fill(255);
        ellipse(circleX, circleY, width/40, height/40);
      }
    }
    


    //Quad Two
    stroke(255);
    for (int lineX = 0; lineX < width/2; lineX += width/2/10){
      line(lineX, 0, lineX, height/2);
    }
    for (int lineY = 0; lineY < height/2; lineY += height/2/10){
      line(0, lineY, width/2, lineY);
    }

    //Quad Three
    for (int i = 0; i < width/2; i++){
      stroke(i, i , i);
      line(i, height/2, i, height);
    }

    // Quad Four

    for (int j = 0; j < 136; j+=45){
      pushMatrix();
      translate(width/4*3, height/4*3);
      rotate(radians(j));
      ellipse(0, 0, width/20, height/3);
      popMatrix();
    }
    
    fill (255, 255, 0);
    ellipse(width/4*3, height/4*3, width/10, height/10);
   
   
    
  }
  

}