package com.cbn.proxy.zhinengyinyong;

public class RealSearcher implements Searcher{

	@Override
	public String doSearch(String userID, String searchType) {
		String sql = "Select * from data_table Where key_col = "+ searchType + "";
		return sql + "result set";
	}

}
