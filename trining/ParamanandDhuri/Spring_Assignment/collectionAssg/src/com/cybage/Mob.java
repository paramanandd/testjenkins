package com.cybage;
							//pojo class for Collection along with getter setter and tostring
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mob {
	
private List<Object> ls;
private Set<Object> st;
private Map<Object,Object> mp;
public List<Object> getLs() {
	return ls;
}
public void setLs(List<Object> ls) {
	this.ls = ls;
}
public Set<Object> getSt() {
	return st;
}
public void setSt(Set<Object> st) {
	this.st = st;
}
public Map<Object, Object> getMp() {
	return mp;
}
public void setMp(Map<Object, Object> mp) {
	this.mp = mp;
}
@Override
public String toString() {
	return "Mob [ls=" + ls + ", st=" + st + ", mp=" + mp + "]";
}

}
