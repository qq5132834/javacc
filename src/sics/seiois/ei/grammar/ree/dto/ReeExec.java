package sics.seiois.ei.grammar.ree.dto;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import sics.seiois.ei.grammar.ree.ParseException;
import sics.seiois.ei.grammar.ree.ReeGrammar;

public class ReeExec {
	
	private String statement;
	
	private ReeExec(){ }
	
	public ReeExec(String statement){
		this.statement = statement;
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws ParseException {
		String statement = "table(t0) ^ ML('234', 黄聊, 'GFSD') ^ table1(t1)  ^ t0.id != t1.id ^ t0.name > t1.name -> t0.city <= t1.city ;";
		ReeExec reeExec = new ReeExec(statement);
		Set<String> set = reeExec.getTablenames();
		System.out.println(set);
	}
	
	public Set<String> getTablenames() throws ParseException{
		
	  	InputStream inputStream = new ByteArrayInputStream(this.statement.getBytes());
	    ReeGrammar parser = new ReeGrammar(inputStream);
	    ReeCondition reeCondition = parser.statement();
	    //
	    List<ReeTableInfo> xReeTableInfoList = reeCondition.getxReeTableInfoList();
	    Map<String, Set<String>> tableAlias = new HashMap<>();
	    for (ReeTableInfo reeTableInfo : xReeTableInfoList) {
	    	if(reeTableInfo.getTableName() != null && !reeTableInfo.getTableName().toUpperCase().equals("ML")){
	    		String tableName = reeTableInfo.getTableName();
	    		String aliasName = reeTableInfo.getAliasName();
	    		if(tableAlias.get(tableName) == null){
	    			Set<String> alias = new HashSet<String>();
	    			alias.add(aliasName);
	    			tableAlias.put(tableName, alias);
	    		}
	    		else{
	    			tableAlias.get(tableName).add(aliasName);
	    		}
	    	}
		}
	    //
	    Set<String> tablesNames = null;
	    if(tableAlias.size() == 1){
	    	tablesNames = tableAlias.keySet();
	    }
	    else{
	    	tablesNames = new HashSet<>();
		    List<ReeTableInfo> yReeTableInfoList = reeCondition.getyReeTableInfoList();
		    for (ReeTableInfo reeTableInfo : yReeTableInfoList) {
		    	String aliasname = reeTableInfo.getAliasName();
		    	for(Map.Entry<String, Set<String>> entry : tableAlias.entrySet()){
		    		String tablename = entry.getKey();
		    		Set<String> alias = entry.getValue();
		    		if(alias.contains(aliasname)){
		    			tablesNames.add(tablename);
		    		}
		    	}
		    }
	    }
	    
	    return tablesNames;
		
	}

}
