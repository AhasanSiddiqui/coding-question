package com.ahasan.arraysdemo.solid.lcp.Solution;

import com.ahasan.arraysdemo.solid.lcp.SocialMedia;

public class Instagram extends SocialMedia {
	@Override
	public void chatWithFriend() {

	}

	@Override
	public void publishPost(Object post) {

	}

	@Override
	public void sendPhotosAndVideos() {

	}

	//This Feature is not applicable in whats app So parent can't be replace with child.
	@Override
	public void groupVideoCall() {

	}
}
