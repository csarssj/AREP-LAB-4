package edu.escuelaing.arep.nanoSpring;

public class HelloController {
	@RequestMapping(value = "/hola")
	static public String hola() {
		System.out.println("ejecutando:"+HelloController.class);
		return "Greetings from Micro Spring Boot!";
	}
	@RequestMapping("/pi")
	public static String theValueOfPi(){
		return "PI: " + Math.PI;
	}

}