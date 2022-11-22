// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="ESP_CAHIER_TEXT")
public class EspCahierText implements Serializable {

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

    @Column(name="ID_ENS", nullable=false, length=50)
    private String idEns;
    @Column(name="CODE_CL", nullable=false, length=50)
    private String codeCl;
    @Column(name="CODE_MODULE", nullable=false, length=50)
    private String codeModule;
    @Column(name="TITRE", length=500)
    private String titre;
    @Column(name="SUJET", length=2000)
    private String sujet;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Column(name="DATE_CT", length=20)
    private String dateCt;
    @Column(name="NUM_SEANCE", length=50)
    private String numSeance;
    @Column(name="TRACE", length=50)
    private String trace;
    @Column(name="CONFIRM", length=50)
    private Boolean confirm;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name="ID", unique=true, nullable=false, length=50)
    private String id;
    @Column(name="fileDownloadUri", length=1000)
    private String fileDownloadUri;

    /** Default constructor. */
    public EspCahierText() {
        super();
    }

    /**
     * Access method for idEns.
     *
     * @return the current value of idEns
     */
    public String getIdEns() {
        return idEns;
    }

    /**
     * Setter method for idEns.
     *
     * @param aIdEns the new value for idEns
     */
    public void setIdEns(String aIdEns) {
        idEns = aIdEns;
    }

    /**
     * Access method for codeCl.
     *
     * @return the current value of codeCl
     */
    public String getCodeCl() {
        return codeCl;
    }

    /**
     * Setter method for codeCl.
     *
     * @param aCodeCl the new value for codeCl
     */
    public void setCodeCl(String aCodeCl) {
        codeCl = aCodeCl;
    }

    /**
     * Access method for codeModule.
     *
     * @return the current value of codeModule
     */
    public String getCodeModule() {
        return codeModule;
    }

    /**
     * Setter method for codeModule.
     *
     * @param aCodeModule the new value for codeModule
     */
    public void setCodeModule(String aCodeModule) {
        codeModule = aCodeModule;
    }

    /**
     * Access method for titre.
     *
     * @return the current value of titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Setter method for titre.
     *
     * @param aTitre the new value for titre
     */
    public void setTitre(String aTitre) {
        titre = aTitre;
    }

    /**
     * Access method for sujet.
     *
     * @return the current value of sujet
     */
    public String getSujet() {
        return sujet;
    }

    /**
     * Setter method for sujet.
     *
     * @param aSujet the new value for sujet
     */
    public void setSujet(String aSujet) {
        sujet = aSujet;
    }

    /**
     * Access method for dateSaisie.
     *
     * @return the current value of dateSaisie
     */
    public LocalDateTime getDateSaisie() {
        return dateSaisie;
    }

    /**
     * Setter method for dateSaisie.
     *
     * @param aDateSaisie the new value for dateSaisie
     */
    public void setDateSaisie(LocalDateTime aDateSaisie) {
        dateSaisie = aDateSaisie;
    }

    /**
     * Access method for anneeDeb.
     *
     * @return the current value of anneeDeb
     */
    public String getAnneeDeb() {
        return anneeDeb;
    }

    /**
     * Setter method for anneeDeb.
     *
     * @param aAnneeDeb the new value for anneeDeb
     */
    public void setAnneeDeb(String aAnneeDeb) {
        anneeDeb = aAnneeDeb;
    }

    /**
     * Access method for dateCt.
     *
     * @return the current value of dateCt
     */
    public String getDateCt() {
        return dateCt;
    }

    /**
     * Setter method for dateCt.
     *
     * @param aDateCt the new value for dateCt
     */
    public void setDateCt(String aDateCt) {
        dateCt = aDateCt;
    }

    /**
     * Access method for numSeance.
     *
     * @return the current value of numSeance
     */
    public String getNumSeance() {
        return numSeance;
    }

    /**
     * Setter method for numSeance.
     *
     * @param aNumSeance the new value for numSeance
     */
    public void setNumSeance(String aNumSeance) {
        numSeance = aNumSeance;
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(String aId) {
        id = aId;
    }
    
    

    public String getTrace() {
		return trace;
	}

	public void setTrace(String trace) {
		this.trace = trace;
	}
	
	

	public Boolean getConfirm() {
		return confirm;
	}

	public void setConfirm(Boolean confirm) {
		this.confirm = confirm;
	}

	
	public String getFileDownloadUri() {
		return fileDownloadUri;
	}

	public void setFileDownloadUri(String fileDownloadUri) {
		this.fileDownloadUri = fileDownloadUri;
	}

	/**
     * Compares the key for this instance with another EspCahierText.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspCahierText and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspCahierText)) {
            return false;
        }
        EspCahierText that = (EspCahierText) other;
        Object myId = this.getId();
        Object yourId = that.getId();
        if (myId==null ? yourId!=null : !myId.equals(yourId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspCahierText.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspCahierText)) return false;
        return this.equalKeys(other) && ((EspCahierText)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        if (getId() == null) {
            i = 0;
        } else {
            i = getId().hashCode();
        }
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[EspCahierText |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", getId());
        return ret;
    }

}