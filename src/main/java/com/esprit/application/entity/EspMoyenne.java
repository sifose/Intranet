package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="ESP_MOYENNE")
public class EspMoyenne implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    
    /** Primary key. */
    protected static final String PK = "id";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name="ID", unique=true, nullable=false, length=50)
    private Long id;
    @Column(name="ID_ET", nullable=false, length=20)
    private String idEt;
    @Column(name="CODE_CL", nullable=false, length=20)
    private String codeCl;
    @Column(name="ANNEE_DEB", nullable=false, length=20)
    private String anneeDeb;
    @Column(name="MOYENNE", precision=5, scale=2)
    private BigDecimal moyenne;
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdEt() {
		return idEt;
	}

	public void setIdEt(String idEt) {
		this.idEt = idEt;
	}

	public String getCodeCl() {
		return codeCl;
	}

	public void setCodeCl(String codeCl) {
		this.codeCl = codeCl;
	}

	public String getAnneeDeb() {
		return anneeDeb;
	}

	public void setAnneeDeb(String anneeDeb) {
		this.anneeDeb = anneeDeb;
	}

	public BigDecimal getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(BigDecimal moyenne) {
		this.moyenne = moyenne;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public static String getPk() {
		return PK;
	}

	@Column(name="OBSERVATION", length=20)
    private String observation;

	public EspMoyenne() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EspMoyenne [lockFlag=" + lockFlag + ", id=" + id + ", idEt=" + idEt + ", codeCl=" + codeCl
				+ ", anneeDeb=" + anneeDeb + ", moyenne=" + moyenne + ", observation=" + observation + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(anneeDeb, codeCl, id, idEt, lockFlag, moyenne, observation);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EspMoyenne other = (EspMoyenne) obj;
		return Objects.equals(anneeDeb, other.anneeDeb) && Objects.equals(codeCl, other.codeCl)
				&& Objects.equals(id, other.id) && Objects.equals(idEt, other.idEt)
				&& Objects.equals(lockFlag, other.lockFlag) && Objects.equals(moyenne, other.moyenne)
				&& Objects.equals(observation, other.observation);
	}

	
    



}
