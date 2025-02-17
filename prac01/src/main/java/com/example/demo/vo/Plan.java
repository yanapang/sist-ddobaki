package com.example.demo.vo;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
@Table(name="plan")
public class Plan {
	@Id //PK
	private int	plan_num;
	
	
	//FK
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name="user_num", insertable=true, updatable=true, nullable = false)
	private UserInfo userinfo;
	
	//FK
	@ManyToOne
	@JoinColumn(name="place_num", insertable=true, updatable=true, nullable = true)
	private Place place;
	
	@Column(columnDefinition = "varchar2(3000)", nullable = false)
	private String plan_name;
	//@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date plan_date;
	@Column(nullable = false)
	private int plan_flow_num;	
	@Column(columnDefinition = "varchar2(3000)", nullable = false)
	private String plan_flow_name;	
	@Column(nullable = false)
	private int plan_group_num;	
	
	
}
