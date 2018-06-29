# CurrencyConverter
Java Library for Currency converter with updated currency exchange rates

## Prerequisites

Step 1.Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.rishikumars:CurrencyConverter:CurrencyConverter-1.1'
	}  

# Usage

## 1.Call the function 

     CurrencyConverter.convert("currency_code_1","currency_code_2")
    
    Example:
      double value=CurrencyConverter.convert("btc","usd");
 
 This returns the one Bitcoin value in terms of USD
 
 ## 2.Call the function
 
      CurrencyConverter.convert(<int rate>,"currency_code_1","currency_code_2")
      
    Example:
      double value=CurrencyConverter.convert(5,"USD","inr");
      
 This returns the value of five USD in terms of INR
   
