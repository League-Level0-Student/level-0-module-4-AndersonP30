PImage face;
int x = 100;
int y= 100;
void setup() {
  face = loadImage("goldfish.jpg");
  size(800, 600);
  face.resize(800, 600);
  
}

void draw() {
  background(face);
  fill(250, 250, 250);
  ellipse(255, 260, 75, 75);
  ellipse(370, 350, 75, 75);
  fill(1, 1, 1);
  //ellipse(mouseX, mouseY, 35, 35);
  //ellipse(mouseX + 125, mouseY + 90, 35, 35);
  if(mousePressed){
  println("X: " + mouseX + " Y: " + mouseY);
  }
}
// X: 218 Y: 263 X: 292 Y: 258
