package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "team_member")
public class TeamMember {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tmId")
	private int tmId;
	@Column(name = "name")
	private String name;
	@Column(name = "role")
	private String role;
	
	@ManyToOne
	@JoinColumn(name = "tlId")
	private TeamLeader teamLeader;

	public TeamLeader getTeamLeader() {
		return teamLeader;
	}
	public void setTeamLeader(TeamLeader teamLeader) {
		this.teamLeader = teamLeader;
	}
	
	public TeamMember() {
		super();
	}
	public TeamMember(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	public TeamMember(int tmId, String name, String role) {
		super();
		this.tmId = tmId;
		this.name = name;
		this.role = role;
	}
	public int getTmId() {
		return tmId;
	}
	public void setTmId(int tmId) {
		this.tmId = tmId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return  tmId + " " + name + " " + role + " " + teamLeader  ;
	}
	
	
}
