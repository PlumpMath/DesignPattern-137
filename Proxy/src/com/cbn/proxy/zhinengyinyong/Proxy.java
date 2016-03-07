package com.cbn.proxy.zhinengyinyong;
/**
 * 代理角色 
 * 代理角色不是单纯地将调用传递给具体主题角色，而是进行了委派前的权限查询和委派后的次数记录
 * @author boning
 *
 */
public class Proxy implements Searcher{
	private Searcher searcher;
	private UsageLogger usageLogger;
	private AccessValidator accessValidator;
	public Proxy() {
		this.searcher = new RealSearcher();
	}
	@Override
	public String doSearch(String userID, String searchType) {
		if(checkAccess(userID)){
			String result = searcher.doSearch(userID, searchType);
			logUsage(userID);
			return result;
		}
		return null;
	}
	private boolean checkAccess(String userID) {
		accessValidator = new AccessValidator();
		return accessValidator.validateUser(userID);
	}
	
	private void logUsage(String userID){
		UsageLogger logger = new UsageLogger();
		logger.setUserID(userID);
		logger.save();
	}
}
