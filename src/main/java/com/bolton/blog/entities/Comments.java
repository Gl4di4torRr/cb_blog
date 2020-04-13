package com.bolton.blog.entities;

@Entity
public class Comments {

	private int id;
	private String firstName;
	private String lastName;
	private String content;
	private int likeCount;
	private int replyCount;

	public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }

    public String getFirstName() {
    	return this.firstName;
    }

    public void setLastName(String lastName) {
    	this.lastName = lastName;
    }

    public String getLastName() {
    	return this.lastName;
    }

    public void setContent(String content) {
    	this.content = content;
    }

    public String getContent() {
    	return this.content;
    }

    public void setLikeCount(int likeCount) {
    	this.likeCount = likeCount;
    }	

    public int getLikeCount() {
    	return this.likeCount;
    }

    public void setReplyCount() {
    	this.replyCount = replyCount;
    }

    public int getReplyCount() {
    	return this.replyCount;
    }
}