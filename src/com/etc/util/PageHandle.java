package com.etc.util;

public class PageHandle {


	/**
	 * ·ÖÒ³²Ù×÷ mysql;
	 * 
	 * @param sql
	 * @param page
	 * @param pageSize
	 * @param cla
	 * @param param
	 * @return
	 */
	public static String getPageSql(String oldSQL, int pageNo, int pageSize) {
		StringBuffer sql = new StringBuffer(oldSQL);
		
		if (pageSize > 0) {
            int firstResult = (pageNo - 1)*pageSize;
            if (firstResult <= 0) {
                sql.append(" limit ").append(pageSize);
            } else {
                sql.append(" limit ").append(firstResult).append(",")
                        .append(pageSize);
            }
        }
        return sql.toString();
	}
	
	
}
