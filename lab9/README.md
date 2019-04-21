
The regular solution for decorator involves an interface, one concrete implementation of the interface, an abstract class extending the interface,  and a number of classes that extend the abstract class in order to achieve decorating the object we want. This solution involves multiple classes and a lot of repetitive code. As seen in the ChristmasTree example, we have one concrete class for a regular ChristmasTree and 4 separate decorator classes that will help decorate the ChristmasTree. These decorator classes have a lot of code thats similar or shared between them, and it can be troublesome to write all of it out.


The lambda solution for decorator only required the interface, concrete implementation of the interface, and a main/tester class to execute the labmda functions. In the tester class, we instantiate a generic ChristmasTree and use lambda on the decorate() method so we can append the variety of ChristmasTree to the end of whatever the decorate() method returns (which is always "Christmas Tree"). This is just repeated for each type of tree so there is no need for separate decorator classes. This saves a lot of code and excess class implementations that might just be clutter for users.


All in all, the lambda solution for the decorator pattern is much more code efficient, as it eliminates the need for the extra decorator classes, and lowers the volume of code required in order to execute the Decorator pattern.
