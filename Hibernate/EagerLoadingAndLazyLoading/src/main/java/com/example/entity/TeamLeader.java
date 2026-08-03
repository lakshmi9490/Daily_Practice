package com.example.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "team_leader")
public class TeamLeader {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name  = "tlId")
	private int tlId;
	@Column(name = "name")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL,fetch =FetchType.LAZY )
	Set<TeamMember> teamMembers = new HashSet<TeamMember> ();
	
	public  void addmembers(TeamMember tm) {
		teamMembers.add(tm);
		tm.setTeamLeader(this);
	}
	public Set<TeamMember> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(Set<TeamMember> teamMembers) {
		this.teamMembers = teamMembers;
	}
	
	
	public TeamLeader() {
		super();
	}
	public TeamLeader(String name) {
		super();
		this.name = name;
	}
	public TeamLeader(int tlId, String name) {
		super();
		this.tlId = tlId;
		this.name = name;
	}
	public int getTlId() {
		return tlId;
	}
	public void setTlId(int tlId) {
		this.tlId = tlId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return  tlId + " " + name  ;
	}
	
	
	
}	
