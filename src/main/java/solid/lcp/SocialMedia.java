package com.ahasan.arraysdemo.solid.lcp;

public abstract class SocialMedia {
	//@Support WhatsApp, FaceBook, Instagram
	public abstract void chatWithFriend();

	//@Support  FaceBook, Instagram
	public abstract void publishPost(Object post);

	//@Support WhatsApp, FaceBook, Instagram
	public abstract void sendPhotosAndVideos();

	//@Support WhatsApp, FaceBook
	public abstract void groupVideoCall();

}
