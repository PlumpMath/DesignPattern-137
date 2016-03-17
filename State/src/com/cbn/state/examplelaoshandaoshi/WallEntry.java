package com.cbn.state.examplelaoshandaoshi;
/**
 * 环境角色
 * @author boning
 *
 */
public class WallEntry {
	private WallStateIF wallstate;
	public WallEntry() {
		this.setWallstate(new LockedState());
	}
	
	public WallStateIF getWallstate() {
		return wallstate;
	}

	public void setWallstate(WallStateIF wallstate) {
		this.wallstate = wallstate;
	}

	public void pass() throws WallEntryException{
		wallstate.pass(this);
	}
	
	public void spell(String spell) throws WallEntryException{
		wallstate.spell(this, spell);
	}
}
