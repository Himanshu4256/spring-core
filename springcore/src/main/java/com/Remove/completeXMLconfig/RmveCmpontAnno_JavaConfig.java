package com.Remove.completeXMLconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RmveCmpontAnno_JavaConfig {

	//------------------------------------------------------------------------------	
	//Yaha ham ek method banaenge jo Class ko return krega.
		@Bean(name = {"student","temp","temp2"})   // ye @Component ka kaam krega & bean name hi method name hai. esme aap koi sa bhi bean ka name le skte ho.
		public Student2WoutComponent getStudent() {
			//creating a new student object
			Student2WoutComponent st2 = new Student2WoutComponent();
			return st2;
		}
	//------------------------------------------------------------------------------	
		
}


//Note :- Yaha Hamne @Component ko htane k liye ek method banaya jisme Student2 class ka object ko return kraya hai, Jisse wo Student2 class ka data hme dega which is understanding() method.
//In sort :- getStudent bean name hai Student2 cls ka jo Hmne Runner Class ko diya hai.