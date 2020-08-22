package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {
	
	private ArrayList<Integer> listaDeRegistrados=new ArrayList<Integer>();
	
    public RegisterResult registerVoter(Person p) {
    	if(p.isAlive()){
    		if(!listaDeRegistrados.contains(p.getId())) {
		    	if(p.getAge()>0 && p.getAge()<131) {
		    		if(p.getAge()>17) {
		    			listaDeRegistrados.add(p.getId());
		    			return RegisterResult.VALID;
		    		}else {
		    			return RegisterResult.UNDERAGE;
		    		}
		    	}else {
		    		return RegisterResult.INVALID_AGE;
		    	}
    		}else {
    			return RegisterResult.DUPLICATED;
    		}
    	}else {
    		return RegisterResult.DEAD;
    	}
    }
}