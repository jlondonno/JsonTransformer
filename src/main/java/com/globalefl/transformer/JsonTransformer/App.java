package com.globalefl.transformer.JsonTransformer;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.globalefl.transformer.JsonTransformer.model.QQuestion;

public class App 
{
    public static void main( String[] args )
    {
    	//JSON from file to Object
    	ObjectMapper mapper = new ObjectMapper();
    	try {
    		File file = new File(ClassLoader.getSystemResource("payload.js").toURI());
    		QQuestion[] theQuestion = mapper.readValue(file, QQuestion[].class);
    		
    		for (QQuestion qQuestion : theQuestion) {
    			System.out.println(qQuestion.getUid());
    			System.out.println(qQuestion.getStep());
    			System.out.println(qQuestion.getSequence());
    			System.out.println(qQuestion.getMetas());
    			System.out.println(qQuestion.getObservations());
    			
    			System.out.println();
    			System.out.println();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
    }
}
