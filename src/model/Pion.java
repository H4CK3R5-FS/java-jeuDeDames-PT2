package model;

public class Pion {
String couleur;
int id,y,x;

public Pion(String couleur, int id, int y, int x) {
	this.couleur = couleur;
	this.id = id;
	this.y = y;
	this.x = x;
}
public String getCouleur() {
	return couleur;
}
public void setCouleur(String couleur) {
	this.couleur = couleur;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}



}
