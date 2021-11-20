# font-and-line-details-

to use fonts and lines, we first have ti import some java libraries, mainly

iimport java.awt.font.FontRenderContext;

then we do the work. By the work i mean defining a new object, as we were doing with shapes and lines, but this time with fonts.

Defining a font be like

Font nameofthefont = new Font("style", "type, Font.BOLD/ITALIC, ETC", 60//size;

then if we want to asing a context of our font then we do, so the g2 can draw it we code:

String StringLine = "This is just a test Message";


for priting this we code:

g2.draw(StringLine);

but it needs more atturbutes, so 

g2.drawString(StringLine, 0, 0);

if we set the x and y cordinates to zero, it will be at the top of the penel, so we change the values a bit, so it can be visiable

g2.drawstring(StringLine, 200,200);

the output will be:

![image](https://user-images.githubusercontent.com/63984422/142703972-39c5d3fe-de62-4f3f-9f64-2d2ac3cf55d9.png)

![image](https://user-images.githubusercontent.com/63984422/142704003-65825706-98e1-4c01-9293-ba8402e089b6.png)




for more hocus pocus things, related to the text, say for example we want to make the text thicker, and fill it with diffrent colors.
for this purpose, we use the method Gly vector.

before jumbing into defining Glyvector as such:

Glyvector valueOfGlyVect;

we have first to define a new FrontRenderContext, as follows:

FrontRenderContext frontline;
frontline g2.getFrontRenderContext();

then after that, we connect the gly vector, and font line together, as follows:


valueOfGlyVect =fontline.createGlyvector(frontline, "hey, its 3 am");

just as what we did with the string, when we difned cordinates, we have to do the same too with glyvector.
this time, we will define a new shape, then recall it within another function. follow up

shape XyCords = XyCords.valueOfGlyVect.getOutline(200,200);

then we can finally print the final oubut as follows:

g2.draw(valueOfGlyVect);


![image](https://user-images.githubusercontent.com/63984422/142703018-df1a8620-f267-434e-8520-94f576599ee7.png)


for more hocus pocus edits, lets make the text winy!!

 Font font = new Font("Serif", Font.BOLD, 36);
        
        AffineTransform tx = new AffineTransform();
        tx.shear(0.5, 0);
        g2.setFont(font.deriveFont(tx));
        g2.drawString("Derived font", 100, 100);



![image](https://user-images.githubusercontent.com/63984422/142712343-a31a7107-aa08-41e0-84b9-84757f89595f.png)
