package test.main;

import test.auto.Engine;
import test.auto.Grandeur;

public class MainClass08 {
	public static void main(String[] args) {
		Grandeur car1 = new Grandeur(new Engine());
		car1.drive();
		
	}
}
