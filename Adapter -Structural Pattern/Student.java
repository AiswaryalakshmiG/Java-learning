public class Student{
Pen pen;
public void setPen(Pen pen){
	this.pen=pen;
}
public void writeAssignment(String text){
	pen.write(text);
}
}