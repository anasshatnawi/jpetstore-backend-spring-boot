package com.example.petstoremonolithique.Entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "\"inventory_lines\"") // Adjusted table name to match typical database naming conventions
public class InventoryLine {
	@Id
	@GeneratedValue
	private Long id;
	@Enumerated(EnumType.STRING)
	private PetStatus status;
	private int count;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public void setStatus(PetStatus status) {
		this.status = status;
	}

	public PetStatus getStatus() {
		return this.status;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getCount() {
		return this.count;
	}
}
