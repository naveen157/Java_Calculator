# Java_Calculator

Using the Java concepts created Calculator Functionality.

Execution process :
1. Run the Cal1.java file // go to command prompt and go to the folder in which files are saved and type 
                                       // javac Cal1.java  - for compilation
                                      // java Cal1  - for execution. 

Description about files :
Cal1.java file :  //This file is the mail file from which execution starts, in this file i have created the Frame and added the components on to that frame like Buttons and text                     //field.
                   //Registered the buttons to the action Listeners. And created the object of CalculatorEventListener class which internally implements the                                          //ActionListener Interface. So when you click on buttons public void actionPerformed(ActionEvent e) method gets executed which performs the mathematical part.
                        
CalculatorEventListener .java file :  //This class implements the ActionListener Interface, whenever any action is performed on the Cal1.java components this class takes care of                                         //of the internal calculation by catching the ActionEvent instance(Object) which is sent by the registered Listeners.
