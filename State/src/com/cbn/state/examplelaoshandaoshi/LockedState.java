package com.cbn.state.examplelaoshandaoshi;

import java.util.Date;

/**
 * 具体状态角色，锁住的墙
 * 
 * 这个具体状态类包装了墙在“闭”状态时的行为。当调用spell方法时，此方法可根据念的口诀是否正确来决定是否将墙的状态改为“开”
 * @author boning
 *
 */
public class LockedState implements WallStateIF{
	private static final String rightSpell = "abc";
	private Date timeOfLock;
	@Override
	public void spell(WallEntry wall, String spell) throws WallEntryException {
		if(this.rightSpell.equals(spell)){
			wall.setWallstate(new UnlockedState());//具体状态对象自己进行状态转移的逻辑
		}else{
			throw new WallEntryException("错误的密码");
		}
	}

	@Override
	public void pass(WallEntry wall) throws WallEntryException {
		throw new WallEntryException("碰！");
	}

	public Date getTimeOfLock() {
		return timeOfLock;
	}

	public void setTimeOfLock(Date timeOfLock) {
		this.timeOfLock = timeOfLock;
	}


}
