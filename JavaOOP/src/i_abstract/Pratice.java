package i_abstract;


abstract class Pratice{

	   abstract  int  getNumber( );

	}

class Child extends Pratice {

	private  int  number = 100;

	 int  getNumber() {   return  number;  }

}

	