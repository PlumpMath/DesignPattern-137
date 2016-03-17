package com.cbn.state.examplelaoshandaoshi;

import java.util.Date;

/**
 * 具体状态角色，解锁的墙
 * @author boning
 *
 */
public class UnlockedState implements WallStateIF{
	private Date timeOfUnlock;
	public UnlockedState() {
		this.setTimeOfUnlock(new Date());
		// TODO Auto-generated constructor stub
	}
	@Override
	public void spell(WallEntry wall, String spell) throws WallEntryException {
		
	}

	@Override
	public void pass(WallEntry wall) throws WallEntryException {
		System.out.println("顺利通过");
		wall.setWallstate(new LockedState());
	}
	public Date getTimeOfUnlock() {
		return timeOfUnlock;
	}
	public void setTimeOfUnlock(Date timeOfUnlock) {
		this.timeOfUnlock = timeOfUnlock;
	}


}
