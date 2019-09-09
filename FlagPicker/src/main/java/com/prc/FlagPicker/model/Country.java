package com.prc.FlagPicker.model;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="COUNTRY")
public class Country  implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="COUNTRY_ID", unique = true, nullable = false)
	int countryId;
	/*
	 * @Column(name="CONTINENT_FOREIGN_ID") int continentId;
	 */
    @Column(name="COUNTRY_NAME")
	public String countryName;
    @Column(name="FLAG")
	public String flag;
    
    @ManyToOne
    @JoinColumn(name="CONTINENT_ID", nullable=false)
    Continents continent;
	
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	/*
	 * public int getContinentId() { return continentId; } public void
	 * setContinentId(int continentId) { this.continentId = continentId; }
	 */
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}

}
