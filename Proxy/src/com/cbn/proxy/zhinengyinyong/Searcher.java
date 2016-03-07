package com.cbn.proxy.zhinengyinyong;
/**
 * 抽象主题角色
 * @author boning
 *
 */
public interface Searcher {
	String doSearch(String userID, String searchType);
}
