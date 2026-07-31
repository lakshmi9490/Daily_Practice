package com.many.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "software")

public class Software {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sId")
	private int sId;
	@Column (name = "name")
	private String name;
	
	@ManyToMany(mappedBy = "softwares" ,cascade = CascadeType.ALL)
	Set<TeamLeader> leaders = new HashSet<TeamLeader>();
	
	
	public void addLeaders(TeamLeader tl) {
		leaders.add(tl);
		tl.getSoftwares().add(this);
	}
	
	public Set<TeamLeader> getLeaders() {
		return leaders;
	}
	public void setLeaders(Set<TeamLeader> leaders) {
		this.leaders = leaders;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Software(int sId, String name) {
		super();
		this.sId = sId;
		this.name = name;
	}
	public Software(String name) {
		super();
		this.name = name;
	}
	public Software() {
		super();
	}
	
	
}
