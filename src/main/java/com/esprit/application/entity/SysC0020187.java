// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public final class SysC0020187 implements Serializable {

    @Column(name="CODE_CL", nullable=false, length=50)
    private final String codeCl;
    @Column(name="CODE_MODULE", nullable=false, length=50)
    private final String codeModule;
    @Column(name="DATE_SAISIE", nullable=false)
    private final LocalDateTime dateSaisie;
    @Column(name="ID", nullable=false, precision=10)
    private final BigDecimal id;
    @Column(name="ID_ENS", nullable=false, length=50)
    private final String idEns;

    /** Initializing constructor. */
    public SysC0020187(String codeCl, String codeModule, LocalDateTime dateSaisie, BigDecimal id, String idEns) {
        this.codeCl = codeCl;
        this.codeModule = codeModule;
        this.dateSaisie = dateSaisie;
        this.id = id;
        this.idEns = idEns;
    }

    /** Private default constructor (for ORM frameworks). */
    @SuppressWarnings("unused")
    private SysC0020187() {
        this(null, null, null, null, null);
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
     * Access method for codeModule.
     *
     * @return the current value of codeModule
     */
    public String getCodeModule() {
        return codeModule;
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
     * Access method for id.
     *
     * @return the current value of id
     */
    public BigDecimal getId() {
        return id;
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
     * Compares this instance with another SysC0020187.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (getClass() != other.getClass()) {
            return false;
        }
        SysC0020187 that = (SysC0020187) other;
        Object myCodeCl = this.getCodeCl();
        Object yourCodeCl = that.getCodeCl();
        if (myCodeCl==null ? yourCodeCl!=null : !myCodeCl.equals(yourCodeCl)) {
            return false;
        }
        Object myCodeModule = this.getCodeModule();
        Object yourCodeModule = that.getCodeModule();
        if (myCodeModule==null ? yourCodeModule!=null : !myCodeModule.equals(yourCodeModule)) {
            return false;
        }
        Object myDateSaisie = this.getDateSaisie();
        Object yourDateSaisie = that.getDateSaisie();
        if (myDateSaisie==null ? yourDateSaisie!=null : !myDateSaisie.equals(yourDateSaisie)) {
            return false;
        }
        Object myId = this.getId();
        Object yourId = that.getId();
        if (myId==null ? yourId!=null : !myId.equals(yourId)) {
            return false;
        }
        Object myIdEns = this.getIdEns();
        Object yourIdEns = that.getIdEns();
        if (myIdEns==null ? yourIdEns!=null : !myIdEns.equals(yourIdEns)) {
            return false;
        }
        return true;
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i = 1;
        int result = 17;
        if (getCodeCl() == null) {
            i = 0;
        } else {
            i = getCodeCl().hashCode();
        }
        result = 37*result + i;
        if (getCodeModule() == null) {
            i = 0;
        } else {
            i = getCodeModule().hashCode();
        }
        result = 37*result + i;
        if (getDateSaisie() == null) {
            i = 0;
        } else {
            i = getDateSaisie().hashCode();
        }
        result = 37*result + i;
        if (getId() == null) {
            i = 0;
        } else {
            i = getId().hashCode();
        }
        result = 37*result + i;
        if (getIdEns() == null) {
            i = 0;
        } else {
            i = getIdEns().hashCode();
        }
        result = 37*result + i;
        return result;
    }

}
