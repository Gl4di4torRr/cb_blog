package com.bolton.blog.entities;

@Entity
public class Authors {

	private int id;
	private String firstName;
	private String lastName;
	private byte[] photo;
	private int postId;

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

    public void setPhoto(byte[] photo) {
    	this.photo = photo;
    }

    public byte[] getPhoto() {
    	return this.photo;
    }
	
	public void setPostId(int postId) {
		this.postId = postId;
	}
}