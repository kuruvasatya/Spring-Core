package com.pojo;

public class Hardware {
	private String display;
	private String keybord;

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getKeybord() {
		return keybord;
	}

	public void setKeybord(String keybord) {
		this.keybord = keybord;
	}

	@Override
	public String toString() {
		return "Hardware [display=" + display + ", keybord=" + keybord + "]";
	}
}
