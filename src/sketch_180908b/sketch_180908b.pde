void setup(){size(500, 500);


}


void draw() {
fill(#D1AC26);
ellipse(200,200,400,400);
PImage pepperoni = loadImage("pepperoni.ppm.gif");
image(pepperoni, 100, 100);
PImage pepperoni1 = loadImage("pepperoni.ppm.gif");
image(pepperoni, 200, 200);
PImage pork = loadImage("pork.ppm.gif");
image(pork, 300, 300);
}
