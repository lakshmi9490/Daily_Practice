package com.many.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="leam_leader")
public class TeamLeader {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tlId")
	private int tlId;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	Set<TeamMember> teamMembers = new HashSet<TeamMember>();
	
	
	public Set<TeamMember> getTeamMembers() {
		return teamMembers;
	}
	
	public void addMember(TeamMember tm) {
		teamMembers.add(tm);
		tm.setTeamLeader(this);
		
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


	@Override
	public String toString() {
		return  tlId + " " + name ;
	}
	
	
	
}
