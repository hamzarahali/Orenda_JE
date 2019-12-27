package com.example.demo.entites;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="articles")
@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Article {
	
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String desc;
	
	@Column(name="prix")
	private String prix;
	
	@Column(name="img")
	private String img;
	
	
	public Article(int id,String title,String desc,String prix,String img) {
		
		super();
		
		this.id=id;
		this.title=title;
		this.desc=desc;
		this.prix=prix;
		this.img=img;
		
	}
	
public Article(String title,String desc,String prix,String img) {
		
		super();
		
		this.title=title;
		this.desc=desc;
		this.prix=prix;
		this.img=img;
		
	}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDesc() {
	return desc;
}

public void setDesc(String desc) {
	this.desc = desc;
}

public String getPrix() {
	return prix;
}

public void setPrix(String prix) {
	this.prix = prix;
}

public String getImg() {
	return img;
}

public void setImg(String img) {
	this.img = img;
}
	
	

}