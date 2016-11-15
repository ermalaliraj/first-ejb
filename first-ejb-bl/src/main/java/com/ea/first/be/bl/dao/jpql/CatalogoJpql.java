package com.ea.first.be.bl.dao.jpql;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CatalogoJpql {
	
	protected static transient Log log = LogFactory.getLog(CatalogoJpql.class);

	public static String getQuery_GetAllNames() {
		StringBuffer sb = new StringBuffer();
		sb.append("select e from NameEntity e ");
		sb.append("order by e.id");
		return sb.toString();
	}

}
