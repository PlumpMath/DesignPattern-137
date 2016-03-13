package com.cbn.command.example;

/**
 * 扩展的宏命令功能
 * 
 * @author boning
 *
 */
public interface MacroCommand extends Command {
	/**
	 * 执行方法
	 */
	void execute();

	/**
	 * 宏命令聚集的管理方法 可以删除一个成员命令
	 */
	void remove(int index);

	/**
	 * 宏命令聚集的管理方法 可以添加一个成员命令
	 */
	void add(Command command);
}
