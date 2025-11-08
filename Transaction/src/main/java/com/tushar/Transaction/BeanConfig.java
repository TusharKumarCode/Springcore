package com.tushar.Transaction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    
	  @Bean("tranc")
	  public TransactionDetails createTransactionBean() {
		  
		    TransactionDetails trc= new TransactionDetails();
		    
		    trc.setName("rakesh");
		    trc.setBranch("sbi");
		    trc.setAmount(34788);
		    
		    return trc;
	  }
}
