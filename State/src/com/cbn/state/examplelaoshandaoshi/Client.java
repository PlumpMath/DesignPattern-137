package com.cbn.state.examplelaoshandaoshi;
/**
 * 崂山道士和状态模式
 * 
 * 墙是有状态的对象，墙的状态有开和闭两种。正常的口诀是墙的状态发生转变的外界事件，而墙在王生的头碰上来的行为是墙的状态决定的。
 * 
 * ！！！对象在不同状态下的行为包装到不同的状态类里面，这是状态模式所要求的。
 * ！！！状态模式所不指明的是控制状态转移的逻辑放在哪里。1.可以放在环境类。2.可以包装在状态类里，让状态对象自己决定何时进行状态转移，以及下一个状态是谁
 * @author boning
 *
 */
public class Client {
private static WallEntry wall;
public static void main(String[] args) {
	wall = new WallEntry();
	try {
		wall.pass();
		
	} catch (WallEntryException e) {
	}
	try {
		wall.spell("abc");
		wall.pass();
	} catch (WallEntryException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		wall.pass();
	} catch (WallEntryException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
