package sics.seiois.ei.grammar.ree.dto;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import sics.seiois.ei.grammar.ree.ParseException;
import sics.seiois.ei.grammar.ree.ReeGrammar;

public class ReeExec {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws ParseException {
		String statement = "table(t0) ^ ML('234', 黄聊, 'GFSD') ^ table1(t1)  ^ t0.id != t1.id ^ t0.name > t1.name -> t0.city <= t1.city ;";
	  	InputStream inputStream = new ByteArrayInputStream(statement.getBytes());
	    ReeGrammar parser = new ReeGrammar(inputStream);
	    ReeCondition reeCondition = parser.statement();
	    
	}

}
