package com.talentica.Spring.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.talentica.Spring"})
public class TextEditorConfig {

   @Bean 
   public TextEditor textEditor(){
      return new TextEditor( spellChecker() );
   }

   @Bean
   public SpellChecker spellChecker(){
      return new SpellChecker( );
   }
}