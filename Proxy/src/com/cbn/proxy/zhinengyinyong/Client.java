package com.cbn.proxy.zhinengyinyong;
/**
 * 智能引用代理
 * 系统的功能为查询
 * 辅助功能为身份校验和次数统计
 * 这两者应该由独立的类负责
 * 1.查询功能由RealSearcher对象提供
 * 2.检查用户权限的功能由AccessValidator提供
 * 3.记录查询次数功能由UsageLogger对象提供
 * @author boning
 *
 */
public class Client {
	public static void main(String[] args) {
		//可以看出，变量searcher的静态类型是Searcher，真实类型Proxy，这就保证了客户端的调用不能分辨
		//RealSearcher和Proxy
		Searcher searcher = new Proxy();
		System.out.println(searcher.doSearch("Admin", "Admin"));
	}
}
