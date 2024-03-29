package com.talentica.Spring.Annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
	      /*ApplicationContext ctx = 
	      new AnnotationConfigApplicationContext(HelloWorldConfig.class);
	   
	      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

	      helloWorld.setMessage("Hello World!");
	      helloWorld.getMessage();
	   */
		AnnotationConfigApplicationContext ctx = 
			      new AnnotationConfigApplicationContext(TextEditorConfig.class);

			      TextEditor te = ctx.getBean(TextEditor.class);

			      te.spellCheck();
			  ctx.close();    
		
	}

}
