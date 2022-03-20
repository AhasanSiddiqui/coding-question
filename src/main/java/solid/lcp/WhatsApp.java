package com.ahasan.arraysdemo.solid.lcp;

public class WhatsApp extends SocialMedia{
	@Override
	public void chatWithFriend() {

	}

	//This Feature is not applicable in whats app So parent can't be replace with child.
	@Override
	public void publishPost(Object post) {

	}

	@Override
	public void sendPhotosAndVideos() {

	}

	@Override
	public void groupVideoCall() {

	}
}
