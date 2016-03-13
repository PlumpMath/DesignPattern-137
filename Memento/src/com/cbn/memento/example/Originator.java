package com.cbn.memento.example;

/**
 * Originator类中定义了一个内部的Memento类，由此Memento类的全部接口都是私有的，因此只有他自己和发起人类可以调用
 * 
 * @author boning
 *
 */
public class Originator {
	private String state;

	public MementoIF createMemento() {
		return new Memento(this.state);
	}

	public void restoreMemento(MementoIF mementoIF) {
		Memento aMemento = (Memento) mementoIF;
		this.setState(aMemento.getState());
	}

	class Memento implements MementoIF {
		private String savedState;

		public Memento(String state) {
			this.savedState = state;
		}

		private void setState(String state) {
			this.savedState = state;
		}

		private String getState() {
			return savedState;
		}
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		System.out.println("改变之前状态 = "+ this.state);
		this.state = state;
		System.out.println("改变之后状态 = "+ this.state);
	}

}
