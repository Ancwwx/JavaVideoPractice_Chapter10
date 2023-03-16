package com.hspedu.enum_;

public class EnumDetail {
	public static void main(String[] args) {
		Music.CLASSICMUISC.playing();
	}
}

interface IPlaying {
	public void playing();
}

enum Music implements IPlaying {
	CLASSICMUISC;

	public void playing() {
		System.out.println("播放好听的音乐");
	}
}