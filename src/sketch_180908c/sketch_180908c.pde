void setup(){

 size(500,500);
 

PImage face = loadImage("face.jpg");
face.resize(400,400);
image(face, 100, 50);

}


void draw(){ellipse(250, 200, 50,50);
ellipse(350, 200, 50,50);
fill(#06C907);
}
