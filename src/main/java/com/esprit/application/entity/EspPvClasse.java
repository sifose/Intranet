// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Version;

@Entity(name="ESP_PV_CLASSE")
@IdClass(EspPvClasse.EspPvClasseId.class)
public class EspPvClasse implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspPvClasseId implements Serializable {
        java.lang.String codeCl;
        java.lang.String idEt;
        java.lang.String annee;
    }

    /** Primary key. */
    protected static final String PK = "EspPvClassePkEspPvClasse";

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
    @Column(name="CODE_CL", nullable=false, length=10)
    private String codeCl;
    @Id
    @Column(name="ID_ET", nullable=false, length=10)
    private String idEt;
    @Id
    @Column(name="ANNEE", nullable=false, length=6)
    private String annee;
    @Column(name="DATE_PV", nullable=false)
    private LocalDateTime datePv;
    @Column(name="TYPE_COL_1", length=1)
    private String typeCol1;
    @Column(name="ID_COL_1", length=10)
    private String idCol1;
    @Column(name="NOM_COL_1", length=100)
    private String nomCol1;
    @Column(name="MOY_COL_1", precision=10, scale=6)
    private BigDecimal moyCol1;
    @Column(name="ETAT_COL_1", length=1)
    private String etatCol1;
    @Column(name="TYPE_COL_2", length=1)
    private String typeCol2;
    @Column(name="ID_COL_2", length=10)
    private String idCol2;
    @Column(name="NOM_COL_2", length=100)
    private String nomCol2;
    @Column(name="MOY_COL_2", precision=10, scale=6)
    private BigDecimal moyCol2;
    @Column(name="ETAT_COL_2", length=1)
    private String etatCol2;
    @Column(name="TYPE_COL_3", length=1)
    private String typeCol3;
    @Column(name="ID_COL_3", length=10)
    private String idCol3;
    @Column(name="NOM_COL_3", length=100)
    private String nomCol3;
    @Column(name="MOY_COL_3", precision=10, scale=6)
    private BigDecimal moyCol3;
    @Column(name="ETAT_COL_3", length=1)
    private String etatCol3;
    @Column(name="TYPE_COL_4", length=1)
    private String typeCol4;
    @Column(name="ID_COL_4", length=10)
    private String idCol4;
    @Column(name="NOM_COL_4", length=100)
    private String nomCol4;
    @Column(name="MOY_COL_4", precision=10, scale=6)
    private BigDecimal moyCol4;
    @Column(name="ETAT_COL_4", length=1)
    private String etatCol4;
    @Column(name="TYPE_COL_5", length=1)
    private String typeCol5;
    @Column(name="ID_COL_5", length=10)
    private String idCol5;
    @Column(name="NOM_COL_5", length=100)
    private String nomCol5;
    @Column(name="MOY_COL_5", precision=10, scale=6)
    private BigDecimal moyCol5;
    @Column(name="ETAT_COL_5", length=1)
    private String etatCol5;
    @Column(name="TYPE_COL_6", length=1)
    private String typeCol6;
    @Column(name="ID_COL_6", length=10)
    private String idCol6;
    @Column(name="NOM_COL_6", length=100)
    private String nomCol6;
    @Column(name="MOY_COL_6", precision=10, scale=6)
    private BigDecimal moyCol6;
    @Column(name="ETAT_COL_6", length=1)
    private String etatCol6;
    @Column(name="TYPE_COL_7", length=1)
    private String typeCol7;
    @Column(name="ID_COL_7", length=10)
    private String idCol7;
    @Column(name="NOM_COL_7", length=100)
    private String nomCol7;
    @Column(name="MOY_COL_7", precision=10, scale=6)
    private BigDecimal moyCol7;
    @Column(name="ETAT_COL_7", length=1)
    private String etatCol7;
    @Column(name="TYPE_COL_8", length=1)
    private String typeCol8;
    @Column(name="ID_COL_8", length=10)
    private String idCol8;
    @Column(name="NOM_COL_8", length=100)
    private String nomCol8;
    @Column(name="MOY_COL_8", precision=10, scale=6)
    private BigDecimal moyCol8;
    @Column(name="ETAT_COL_8", length=1)
    private String etatCol8;
    @Column(name="TYPE_COL_9", length=1)
    private String typeCol9;
    @Column(name="ID_COL_9", length=10)
    private String idCol9;
    @Column(name="NOM_COL_9", length=100)
    private String nomCol9;
    @Column(name="MOY_COL_9", precision=10, scale=6)
    private BigDecimal moyCol9;
    @Column(name="ETAT_COL_9", length=1)
    private String etatCol9;
    @Column(name="TYPE_COL_10", length=1)
    private String typeCol10;
    @Column(name="ID_COL_10", length=10)
    private String idCol10;
    @Column(name="NOM_COL_10", length=100)
    private String nomCol10;
    @Column(name="MOY_COL_10", precision=10, scale=6)
    private BigDecimal moyCol10;
    @Column(name="ETAT_COL_10", length=1)
    private String etatCol10;
    @Column(name="TYPE_COL_11", length=1)
    private String typeCol11;
    @Column(name="ID_COL_11", length=10)
    private String idCol11;
    @Column(name="NOM_COL_11", length=100)
    private String nomCol11;
    @Column(name="MOY_COL_11", precision=10, scale=6)
    private BigDecimal moyCol11;
    @Column(name="ETAT_COL_11", length=1)
    private String etatCol11;
    @Column(name="TYPE_COL_12", length=1)
    private String typeCol12;
    @Column(name="ID_COL_12", length=10)
    private String idCol12;
    @Column(name="NOM_COL_12", length=100)
    private String nomCol12;
    @Column(name="MOY_COL_12", precision=10, scale=6)
    private BigDecimal moyCol12;
    @Column(name="ETAT_COL_12", length=1)
    private String etatCol12;
    @Column(name="TYPE_COL_13", length=1)
    private String typeCol13;
    @Column(name="ID_COL_13", length=10)
    private String idCol13;
    @Column(name="NOM_COL_13", length=100)
    private String nomCol13;
    @Column(name="MOY_COL_13", precision=10, scale=6)
    private BigDecimal moyCol13;
    @Column(name="ETAT_COL_13", length=1)
    private String etatCol13;
    @Column(name="TYPE_COL_14", length=1)
    private String typeCol14;
    @Column(name="ID_COL_14", length=10)
    private String idCol14;
    @Column(name="NOM_COL_14", length=100)
    private String nomCol14;
    @Column(name="MOY_COL_14", precision=10, scale=6)
    private BigDecimal moyCol14;
    @Column(name="ETAT_COL_14", length=1)
    private String etatCol14;
    @Column(name="TYPE_COL_15", length=1)
    private String typeCol15;
    @Column(name="ID_COL_15", length=10)
    private String idCol15;
    @Column(name="NOM_COL_15", length=100)
    private String nomCol15;
    @Column(name="MOY_COL_15", precision=10, scale=6)
    private BigDecimal moyCol15;
    @Column(name="ETAT_COL_15", length=1)
    private String etatCol15;
    @Column(name="TYPE_COL_16", length=1)
    private String typeCol16;
    @Column(name="ID_COL_16", length=10)
    private String idCol16;
    @Column(name="NOM_COL_16", length=100)
    private String nomCol16;
    @Column(name="MOY_COL_16", precision=10, scale=6)
    private BigDecimal moyCol16;
    @Column(name="ETAT_COL_16", length=1)
    private String etatCol16;
    @Column(name="TYPE_COL_17", length=1)
    private String typeCol17;
    @Column(name="ID_COL_17", length=10)
    private String idCol17;
    @Column(name="NOM_COL_17", length=100)
    private String nomCol17;
    @Column(name="MOY_COL_17", precision=10, scale=6)
    private BigDecimal moyCol17;
    @Column(name="ETAT_COL_17", length=1)
    private String etatCol17;
    @Column(name="TYPE_COL_18", length=1)
    private String typeCol18;
    @Column(name="ID_COL_18", length=10)
    private String idCol18;
    @Column(name="NOM_COL_18", length=100)
    private String nomCol18;
    @Column(name="MOY_COL_18", precision=10, scale=6)
    private BigDecimal moyCol18;
    @Column(name="ETAT_COL_18", length=1)
    private String etatCol18;
    @Column(name="TYPE_COL_19", length=1)
    private String typeCol19;
    @Column(name="ID_COL_19", length=10)
    private String idCol19;
    @Column(name="NOM_COL_19", length=100)
    private String nomCol19;
    @Column(name="MOY_COL_19", precision=10, scale=6)
    private BigDecimal moyCol19;
    @Column(name="ETAT_COL_19", length=1)
    private String etatCol19;
    @Column(name="TYPE_COL_20", length=1)
    private String typeCol20;
    @Column(name="ID_COL_20", length=10)
    private String idCol20;
    @Column(name="NOM_COL_20", length=100)
    private String nomCol20;
    @Column(name="MOY_COL_20", precision=10, scale=6)
    private BigDecimal moyCol20;
    @Column(name="ETAT_COL_20", length=1)
    private String etatCol20;
    @Column(name="TYPE_COL_21", length=1)
    private String typeCol21;
    @Column(name="ID_COL_21", length=10)
    private String idCol21;
    @Column(name="NOM_COL_21", length=100)
    private String nomCol21;
    @Column(name="MOY_COL_21", precision=10, scale=6)
    private BigDecimal moyCol21;
    @Column(name="ETAT_COL_21", length=1)
    private String etatCol21;
    @Column(name="TYPE_COL_22", length=1)
    private String typeCol22;
    @Column(name="ID_COL_22", length=10)
    private String idCol22;
    @Column(name="NOM_COL_22", length=100)
    private String nomCol22;
    @Column(name="MOY_COL_22", precision=10, scale=6)
    private BigDecimal moyCol22;
    @Column(name="ETAT_COL_22", length=1)
    private String etatCol22;
    @Column(name="TYPE_COL_23", length=1)
    private String typeCol23;
    @Column(name="ID_COL_23", length=10)
    private String idCol23;
    @Column(name="NOM_COL_23", length=100)
    private String nomCol23;
    @Column(name="MOY_COL_23", precision=10, scale=6)
    private BigDecimal moyCol23;
    @Column(name="ETAT_COL_23", length=1)
    private String etatCol23;
    @Column(name="TYPE_COL_24", length=1)
    private String typeCol24;
    @Column(name="ID_COL_24", length=10)
    private String idCol24;
    @Column(name="NOM_COL_24", length=100)
    private String nomCol24;
    @Column(name="MOY_COL_24", precision=10, scale=6)
    private BigDecimal moyCol24;
    @Column(name="ETAT_COL_24", length=1)
    private String etatCol24;
    @Column(name="TYPE_COL_25", length=1)
    private String typeCol25;
    @Column(name="ID_COL_25", length=10)
    private String idCol25;
    @Column(name="NOM_COL_25", length=100)
    private String nomCol25;
    @Column(name="MOY_COL_25", precision=10, scale=6)
    private BigDecimal moyCol25;
    @Column(name="ETAT_COL_25", length=1)
    private String etatCol25;
    @Column(name="TYPE_COL_26", length=1)
    private String typeCol26;
    @Column(name="ID_COL_26", length=10)
    private String idCol26;
    @Column(name="NOM_COL_26", length=100)
    private String nomCol26;
    @Column(name="MOY_COL_26", precision=10, scale=6)
    private BigDecimal moyCol26;
    @Column(name="ETAT_COL_26", length=1)
    private String etatCol26;
    @Column(name="TYPE_COL_27", length=1)
    private String typeCol27;
    @Column(name="ID_COL_27", length=10)
    private String idCol27;
    @Column(name="NOM_COL_27", length=100)
    private String nomCol27;
    @Column(name="MOY_COL_27", precision=10, scale=6)
    private BigDecimal moyCol27;
    @Column(name="ETAT_COL_27", length=1)
    private String etatCol27;
    @Column(name="TYPE_COL_28", length=1)
    private String typeCol28;
    @Column(name="ID_COL_28", length=10)
    private String idCol28;
    @Column(name="NOM_COL_28", length=100)
    private String nomCol28;
    @Column(name="MOY_COL_28", precision=10, scale=6)
    private BigDecimal moyCol28;
    @Column(name="ETAT_COL_28", length=1)
    private String etatCol28;
    @Column(name="TYPE_COL_29", length=1)
    private String typeCol29;
    @Column(name="ID_COL_29", length=10)
    private String idCol29;
    @Column(name="NOM_COL_29", length=40)
    private String nomCol29;
    @Column(name="MOY_COL_29", precision=10, scale=6)
    private BigDecimal moyCol29;
    @Column(name="ETAT_COL_29", length=1)
    private String etatCol29;
    @Column(name="TYPE_COL_30", length=1)
    private String typeCol30;
    @Column(name="ID_COL_30", length=10)
    private String idCol30;
    @Column(name="NOM_COL_30", length=100)
    private String nomCol30;
    @Column(name="MOY_COL_30", precision=10, scale=6)
    private BigDecimal moyCol30;
    @Column(name="ETAT_COL_30", length=1)
    private String etatCol30;
    @Column(name="TYPE_COL_31", length=1)
    private String typeCol31;
    @Column(name="ID_COL_31", length=10)
    private String idCol31;
    @Column(name="NOM_COL_31", length=100)
    private String nomCol31;
    @Column(name="MOY_COL_31", precision=10, scale=6)
    private BigDecimal moyCol31;
    @Column(name="ETAT_COL_31", length=1)
    private String etatCol31;
    @Column(name="TYPE_COL_32", length=1)
    private String typeCol32;
    @Column(name="ID_COL_32", length=10)
    private String idCol32;
    @Column(name="NOM_COL_32", length=100)
    private String nomCol32;
    @Column(name="MOY_COL_32", precision=10, scale=6)
    private BigDecimal moyCol32;
    @Column(name="ETAT_COL_32", length=1)
    private String etatCol32;
    @Column(name="TYPE_COL_33", length=1)
    private String typeCol33;
    @Column(name="ID_COL_33", length=10)
    private String idCol33;
    @Column(name="NOM_COL_33", length=100)
    private String nomCol33;
    @Column(name="MOY_COL_33", precision=10, scale=6)
    private BigDecimal moyCol33;
    @Column(name="ETAT_COL_33", length=1)
    private String etatCol33;
    @Column(name="TYPE_COL_34", length=1)
    private String typeCol34;
    @Column(name="ID_COL_34", length=10)
    private String idCol34;
    @Column(name="NOM_COL_34", length=100)
    private String nomCol34;
    @Column(name="MOY_COL_34", precision=10, scale=6)
    private BigDecimal moyCol34;
    @Column(name="ETAT_COL_34", length=1)
    private String etatCol34;
    @Column(name="TYPE_COL_35", length=1)
    private String typeCol35;
    @Column(name="ID_COL_35", length=10)
    private String idCol35;
    @Column(name="NOM_COL_35", length=100)
    private String nomCol35;
    @Column(name="MOY_COL_35", precision=10, scale=6)
    private BigDecimal moyCol35;
    @Column(name="ETAT_COL_35", length=1)
    private String etatCol35;
    @Column(name="TYPE_COL_36", length=1)
    private String typeCol36;
    @Column(name="ID_COL_36", length=10)
    private String idCol36;
    @Column(name="NOM_COL_36", length=100)
    private String nomCol36;
    @Column(name="MOY_COL_36", precision=10, scale=6)
    private BigDecimal moyCol36;
    @Column(name="ETAT_COL_36", length=1)
    private String etatCol36;
    @Column(name="TYPE_COL_37", length=1)
    private String typeCol37;
    @Column(name="ID_COL_37", length=10)
    private String idCol37;
    @Column(name="NOM_COL_37", length=100)
    private String nomCol37;
    @Column(name="MOY_COL_37", precision=10, scale=6)
    private BigDecimal moyCol37;
    @Column(name="ETAT_COL_37", length=1)
    private String etatCol37;
    @Column(name="TYPE_COL_38", length=1)
    private String typeCol38;
    @Column(name="ID_COL_38", length=10)
    private String idCol38;
    @Column(name="NOM_COL_38", length=100)
    private String nomCol38;
    @Column(name="MOY_COL_38", precision=10, scale=6)
    private BigDecimal moyCol38;
    @Column(name="ETAT_COL_38", length=1)
    private String etatCol38;
    @Column(name="TYPE_COL_39", length=1)
    private String typeCol39;
    @Column(name="ID_COL_39", length=10)
    private String idCol39;
    @Column(name="NOM_COL_39", length=100)
    private String nomCol39;
    @Column(name="MOY_COL_39", precision=10, scale=6)
    private BigDecimal moyCol39;
    @Column(name="ETAT_COL_39", length=1)
    private String etatCol39;
    @Column(name="TYPE_COL_40", length=1)
    private String typeCol40;
    @Column(name="ID_COL_40", length=10)
    private String idCol40;
    @Column(name="NOM_COL_40", length=100)
    private String nomCol40;
    @Column(name="MOY_COL_40", precision=10, scale=6)
    private BigDecimal moyCol40;
    @Column(name="NB_HEURE_COL_1", precision=3)
    private BigDecimal nbHeureCol1;
    @Column(name="NB_HEURE_COL_2", precision=3)
    private BigDecimal nbHeureCol2;
    @Column(name="NB_HEURE_COL_3", precision=3)
    private BigDecimal nbHeureCol3;
    @Column(name="NB_HEURE_COL_4", precision=3)
    private BigDecimal nbHeureCol4;
    @Column(name="NB_HEURE_COL_5", precision=3)
    private BigDecimal nbHeureCol5;
    @Column(name="NB_HEURE_COL_6", precision=3)
    private BigDecimal nbHeureCol6;
    @Column(name="NB_HEURE_COL_7", precision=3)
    private BigDecimal nbHeureCol7;
    @Column(name="NB_HEURE_COL_8", precision=3)
    private BigDecimal nbHeureCol8;
    @Column(name="NB_HEURE_COL_9", precision=3)
    private BigDecimal nbHeureCol9;
    @Column(name="NB_HEURE_COL_10", precision=3)
    private BigDecimal nbHeureCol10;
    @Column(name="NB_HEURE_COL_11", precision=3)
    private BigDecimal nbHeureCol11;
    @Column(name="NB_HEURE_COL_12", precision=3)
    private BigDecimal nbHeureCol12;
    @Column(name="NB_HEURE_COL_13", precision=3)
    private BigDecimal nbHeureCol13;
    @Column(name="NB_HEURE_COL_14", precision=3)
    private BigDecimal nbHeureCol14;
    @Column(name="NB_HEURE_COL_15", precision=3)
    private BigDecimal nbHeureCol15;
    @Column(name="NB_HEURE_COL_16", precision=3)
    private BigDecimal nbHeureCol16;
    @Column(name="NB_HEURE_COL_17", precision=3)
    private BigDecimal nbHeureCol17;
    @Column(name="NB_HEURE_COL_18", precision=3)
    private BigDecimal nbHeureCol18;
    @Column(name="NB_HEURE_COL_19", precision=3)
    private BigDecimal nbHeureCol19;
    @Column(name="NB_HEURE_COL_20", precision=3)
    private BigDecimal nbHeureCol20;
    @Column(name="NB_HEURE_COL_21", precision=3)
    private BigDecimal nbHeureCol21;
    @Column(name="NB_HEURE_COL_22", precision=3)
    private BigDecimal nbHeureCol22;
    @Column(name="NB_HEURE_COL_23", precision=3)
    private BigDecimal nbHeureCol23;
    @Column(name="NB_HEURE_COL_24", precision=3)
    private BigDecimal nbHeureCol24;
    @Column(name="NB_HEURE_COL_25", precision=3)
    private BigDecimal nbHeureCol25;
    @Column(name="NB_HEURE_COL_26", precision=3)
    private BigDecimal nbHeureCol26;
    @Column(name="NB_HEURE_COL_27", precision=3)
    private BigDecimal nbHeureCol27;
    @Column(name="NB_HEURE_COL_28", precision=3)
    private BigDecimal nbHeureCol28;
    @Column(name="NB_HEURE_COL_29", precision=3)
    private BigDecimal nbHeureCol29;
    @Column(name="NB_HEURE_COL_30", precision=3)
    private BigDecimal nbHeureCol30;
    @Column(name="NB_HEURE_COL_31", precision=3)
    private BigDecimal nbHeureCol31;
    @Column(name="NB_HEURE_COL_32", precision=3)
    private BigDecimal nbHeureCol32;
    @Column(name="NB_HEURE_COL_33", precision=3)
    private BigDecimal nbHeureCol33;
    @Column(name="NB_HEURE_COL_34", precision=3)
    private BigDecimal nbHeureCol34;
    @Column(name="NB_HEURE_COL_35", precision=3)
    private BigDecimal nbHeureCol35;
    @Column(name="NB_HEURE_COL_36", precision=3)
    private BigDecimal nbHeureCol36;
    @Column(name="NB_HEURE_COL_37", precision=3)
    private BigDecimal nbHeureCol37;
    @Column(name="NB_HEURE_COL_38", precision=3)
    private BigDecimal nbHeureCol38;
    @Column(name="NB_HEURE_COL_39", precision=3)
    private BigDecimal nbHeureCol39;
    @Column(name="NB_HEURE_COL_40", precision=3)
    private BigDecimal nbHeureCol40;
    @Column(name="COEF_COL_1", precision=4, scale=2)
    private BigDecimal coefCol1;
    @Column(name="COEF_COL_2", precision=4, scale=2)
    private BigDecimal coefCol2;
    @Column(name="COEF_COL_3", precision=4, scale=2)
    private BigDecimal coefCol3;
    @Column(name="COEF_COL_4", precision=4, scale=2)
    private BigDecimal coefCol4;
    @Column(name="COEF_COL_5", precision=4, scale=2)
    private BigDecimal coefCol5;
    @Column(name="COEF_COL_6", precision=4, scale=2)
    private BigDecimal coefCol6;
    @Column(name="COEF_COL_7", precision=4, scale=2)
    private BigDecimal coefCol7;
    @Column(name="COEF_COL_8", precision=4, scale=2)
    private BigDecimal coefCol8;
    @Column(name="COEF_COL_9", precision=4, scale=2)
    private BigDecimal coefCol9;
    @Column(name="COEF_COL_10", precision=4, scale=2)
    private BigDecimal coefCol10;
    @Column(name="COEF_COL_11", precision=4, scale=2)
    private BigDecimal coefCol11;
    @Column(name="COEF_COL_12", precision=4, scale=2)
    private BigDecimal coefCol12;
    @Column(name="COEF_COL_13", precision=4, scale=2)
    private BigDecimal coefCol13;
    @Column(name="COEF_COL_14", precision=4, scale=2)
    private BigDecimal coefCol14;
    @Column(name="COEF_COL_15", precision=4, scale=2)
    private BigDecimal coefCol15;
    @Column(name="COEF_COL_16", precision=4, scale=2)
    private BigDecimal coefCol16;
    @Column(name="COEF_COL_17", precision=4, scale=2)
    private BigDecimal coefCol17;
    @Column(name="COEF_COL_18", precision=4, scale=2)
    private BigDecimal coefCol18;
    @Column(name="COEF_COL_19", precision=4, scale=2)
    private BigDecimal coefCol19;
    @Column(name="COEF_COL_20", precision=4, scale=2)
    private BigDecimal coefCol20;
    @Column(name="COEF_COL_21", precision=4, scale=2)
    private BigDecimal coefCol21;
    @Column(name="COEF_COL_22", precision=4, scale=2)
    private BigDecimal coefCol22;
    @Column(name="COEF_COL_23", precision=4, scale=2)
    private BigDecimal coefCol23;
    @Column(name="COEF_COL_24", precision=4, scale=2)
    private BigDecimal coefCol24;
    @Column(name="COEF_COL_25", precision=4, scale=2)
    private BigDecimal coefCol25;
    @Column(name="COEF_COL_26", precision=4, scale=2)
    private BigDecimal coefCol26;
    @Column(name="COEF_COL_27", precision=4, scale=2)
    private BigDecimal coefCol27;
    @Column(name="COEF_COL_28", precision=4, scale=2)
    private BigDecimal coefCol28;
    @Column(name="COEF_COL_29", precision=4, scale=2)
    private BigDecimal coefCol29;
    @Column(name="COEF_COL_30", precision=4, scale=2)
    private BigDecimal coefCol30;
    @Column(name="COEF_COL_31", precision=4, scale=2)
    private BigDecimal coefCol31;
    @Column(name="COEF_COL_32", precision=4, scale=2)
    private BigDecimal coefCol32;
    @Column(name="COEF_COL_33", precision=4, scale=2)
    private BigDecimal coefCol33;
    @Column(name="COEF_COL_34", precision=4, scale=2)
    private BigDecimal coefCol34;
    @Column(name="COEF_COL_35", precision=4, scale=2)
    private BigDecimal coefCol35;
    @Column(name="COEF_COL_36", precision=4, scale=2)
    private BigDecimal coefCol36;
    @Column(name="COEF_COL_37", precision=4, scale=2)
    private BigDecimal coefCol37;
    @Column(name="COEF_COL_38", precision=4, scale=2)
    private BigDecimal coefCol38;
    @Column(name="COEF_COL_39", precision=4, scale=2)
    private BigDecimal coefCol39;
    @Column(name="COEF_COL_40", precision=4, scale=2)
    private BigDecimal coefCol40;
    @Column(name="NUMPROMOTIONCS", precision=4)
    private BigDecimal numpromotioncs;
    @Column(name="AP_CS", precision=1)
    private BigDecimal apCs;
    @Column(name="TYPE_COL_41", length=1)
    private String typeCol41;
    @Column(name="ID_COL_41", length=10)
    private String idCol41;
    @Column(name="NOM_COL_41", length=100)
    private String nomCol41;
    @Column(name="MOY_COL_41", precision=10, scale=6)
    private BigDecimal moyCol41;
    @Column(name="ETAT_COL_41", length=1)
    private String etatCol41;
    @Column(name="TYPE_COL_42", length=1)
    private String typeCol42;
    @Column(name="ID_COL_42", length=10)
    private String idCol42;
    @Column(name="NOM_COL_42", length=100)
    private String nomCol42;
    @Column(name="MOY_COL_42", precision=10, scale=6)
    private BigDecimal moyCol42;
    @Column(name="ETAT_COL_42", length=1)
    private String etatCol42;
    @Column(name="TYPE_COL_43", length=1)
    private String typeCol43;
    @Column(name="ID_COL_43", length=10)
    private String idCol43;
    @Column(name="NOM_COL_43", length=100)
    private String nomCol43;
    @Column(name="MOY_COL_43", precision=10, scale=6)
    private BigDecimal moyCol43;
    @Column(name="ETAT_COL_43", length=1)
    private String etatCol43;
    @Column(name="TYPE_COL_44", length=1)
    private String typeCol44;
    @Column(name="ID_COL_44", length=10)
    private String idCol44;
    @Column(name="NOM_COL_44", length=100)
    private String nomCol44;
    @Column(name="MOY_COL_44", precision=10, scale=6)
    private BigDecimal moyCol44;
    @Column(name="ETAT_COL_44", length=1)
    private String etatCol44;
    @Column(name="TYPE_COL_45", length=1)
    private String typeCol45;
    @Column(name="ID_COL_45", length=10)
    private String idCol45;
    @Column(name="NOM_COL_45", length=100)
    private String nomCol45;
    @Column(name="MOY_COL_45", precision=10, scale=6)
    private BigDecimal moyCol45;
    @Column(name="ETAT_COL_45", length=1)
    private String etatCol45;
    @Column(name="TYPE_COL_46", length=1)
    private String typeCol46;
    @Column(name="ID_COL_46", length=10)
    private String idCol46;
    @Column(name="NOM_COL_46", length=100)
    private String nomCol46;
    @Column(name="MOY_COL_46", precision=10, scale=6)
    private BigDecimal moyCol46;
    @Column(name="ETAT_COL_46", length=1)
    private String etatCol46;
    @Column(name="TYPE_COL_47", length=1)
    private String typeCol47;
    @Column(name="ID_COL_47", length=10)
    private String idCol47;
    @Column(name="NOM_COL_47", length=100)
    private String nomCol47;
    @Column(name="MOY_COL_47", precision=10, scale=6)
    private BigDecimal moyCol47;
    @Column(name="ETAT_COL_47", length=1)
    private String etatCol47;
    @Column(name="TYPE_COL_48", length=1)
    private String typeCol48;
    @Column(name="ID_COL_48", length=10)
    private String idCol48;
    @Column(name="NOM_COL_48", length=100)
    private String nomCol48;
    @Column(name="MOY_COL_48", precision=10, scale=6)
    private BigDecimal moyCol48;
    @Column(name="ETAT_COL_48", length=1)
    private String etatCol48;
    @Column(name="TYPE_COL_49", length=1)
    private String typeCol49;
    @Column(name="ID_COL_49", length=10)
    private String idCol49;
    @Column(name="NOM_COL_49", length=100)
    private String nomCol49;
    @Column(name="MOY_COL_49", precision=10, scale=6)
    private BigDecimal moyCol49;
    @Column(name="ETAT_COL_49", length=1)
    private String etatCol49;
    @Column(name="TYPE_COL_50", length=1)
    private String typeCol50;
    @Column(name="ID_COL_50", length=10)
    private String idCol50;
    @Column(name="NOM_COL_50", length=100)
    private String nomCol50;
    @Column(name="MOY_COL_50", precision=10, scale=6)
    private BigDecimal moyCol50;
    @Column(name="ETAT_COL_50", length=1)
    private String etatCol50;
    @Column(name="NB_HEURE_COL_41", precision=3)
    private BigDecimal nbHeureCol41;
    @Column(name="NB_HEURE_COL_42", precision=3)
    private BigDecimal nbHeureCol42;
    @Column(name="NB_HEURE_COL_43", precision=3)
    private BigDecimal nbHeureCol43;
    @Column(name="NB_HEURE_COL_44", precision=3)
    private BigDecimal nbHeureCol44;
    @Column(name="NB_HEURE_COL_45", precision=3)
    private BigDecimal nbHeureCol45;
    @Column(name="NB_HEURE_COL_46", precision=3)
    private BigDecimal nbHeureCol46;
    @Column(name="NB_HEURE_COL_47", precision=3)
    private BigDecimal nbHeureCol47;
    @Column(name="NB_HEURE_COL_48", precision=3)
    private BigDecimal nbHeureCol48;
    @Column(name="NB_HEURE_COL_49", precision=3)
    private BigDecimal nbHeureCol49;
    @Column(name="NB_HEURE_COL_50", precision=3)
    private BigDecimal nbHeureCol50;
    @Column(name="COEF_COL_41", precision=3, scale=1)
    private BigDecimal coefCol41;
    @Column(name="COEF_COL_42", precision=3, scale=1)
    private BigDecimal coefCol42;
    @Column(name="COEF_COL_43", precision=3, scale=1)
    private BigDecimal coefCol43;
    @Column(name="COEF_COL_44", precision=3, scale=1)
    private BigDecimal coefCol44;
    @Column(name="COEF_COL_45", precision=3, scale=1)
    private BigDecimal coefCol45;
    @Column(name="COEF_COL_46", precision=3, scale=1)
    private BigDecimal coefCol46;
    @Column(name="COEF_COL_47", precision=3, scale=1)
    private BigDecimal coefCol47;
    @Column(name="COEF_COL_48", precision=3, scale=1)
    private BigDecimal coefCol48;
    @Column(name="COEF_COL_49", precision=3, scale=1)
    private BigDecimal coefCol49;
    @Column(name="COEF_COL_50", precision=3, scale=1)
    private BigDecimal coefCol50;
    @Column(name="CODE_DECISION", length=2)
    private String codeDecision;
    @Column(name="LIB_DECISION", length=500)
    private String libDecision;
    @Column(name="MOYGEN", precision=5, scale=2)
    private BigDecimal moygen;
    @Column(name="ETAT_COL_40", length=1)
    private String etatCol40;
    @Column(name="CREDIT_1", length=50)
    private String credit1;
    @Column(name="CREDIT_2", length=50)
    private String credit2;
    @Column(name="TYPE_PV", length=1)
    private String typePv;
    @Column(name="CODE_DECISION_RAT2", length=2)
    private String codeDecisionRat2;
    @Column(name="LIB_DECISION_RAT2", length=200)
    private String libDecisionRat2;
    @Column(name="CODE_DECISION_RATT", length=2)
    private String codeDecisionRatt;
    @Column(name="LIB_DECISION_RATT", length=500)
    private String libDecisionRatt;
    @Column(name="CREDIT_ROUGE", length=50)
    private String creditRouge;
    @Column(name="CREDIT_VERT", length=50)
    private String creditVert;
    @Column(name="MOYRATT", precision=10, scale=6)
    private BigDecimal moyratt;
    @Column(name="NB_HEURE_COL_51", precision=3)
    private BigDecimal nbHeureCol51;
    @Column(name="NB_HEURE_COL_52", precision=3)
    private BigDecimal nbHeureCol52;
    @Column(name="NB_HEURE_COL_53", precision=3)
    private BigDecimal nbHeureCol53;
    @Column(name="NB_HEURE_COL_54", precision=3)
    private BigDecimal nbHeureCol54;
    @Column(name="NB_HEURE_COL_55", precision=3)
    private BigDecimal nbHeureCol55;
    @Column(name="NB_HEURE_COL_56", precision=3)
    private BigDecimal nbHeureCol56;
    @Column(name="NB_HEURE_COL_57", precision=3)
    private BigDecimal nbHeureCol57;
    @Column(name="NB_HEURE_COL_58", precision=3)
    private BigDecimal nbHeureCol58;
    @Column(name="NB_HEURE_COL_59", precision=3)
    private BigDecimal nbHeureCol59;
    @Column(name="NB_HEURE_COL_60", precision=3)
    private BigDecimal nbHeureCol60;
    @Column(name="COEF_COL_51", precision=3, scale=1)
    private BigDecimal coefCol51;
    @Column(name="COEF_COL_52", precision=3, scale=1)
    private BigDecimal coefCol52;
    @Column(name="COEF_COL_53", precision=3, scale=1)
    private BigDecimal coefCol53;
    @Column(name="COEF_COL_54", precision=3, scale=1)
    private BigDecimal coefCol54;
    @Column(name="COEF_COL_55", precision=3, scale=1)
    private BigDecimal coefCol55;
    @Column(name="COEF_COL_56", precision=3, scale=1)
    private BigDecimal coefCol56;
    @Column(name="COEF_COL_57", precision=3, scale=1)
    private BigDecimal coefCol57;
    @Column(name="COEF_COL_58", precision=3, scale=1)
    private BigDecimal coefCol58;
    @Column(name="COEF_COL_59", precision=3, scale=1)
    private BigDecimal coefCol59;
    @Column(name="COEF_COL_60", precision=3, scale=1)
    private BigDecimal coefCol60;
    @Column(name="TYPE_COL_51", length=1)
    private String typeCol51;
    @Column(name="ID_COL_51", length=10)
    private String idCol51;
    @Column(name="NOM_COL_51", length=100)
    private String nomCol51;
    @Column(name="MOY_COL_51", precision=10, scale=6)
    private BigDecimal moyCol51;
    @Column(name="ETAT_COL_51", length=1)
    private String etatCol51;
    @Column(name="TYPE_COL_52", length=1)
    private String typeCol52;
    @Column(name="ID_COL_52", length=10)
    private String idCol52;
    @Column(name="NOM_COL_52", length=100)
    private String nomCol52;
    @Column(name="MOY_COL_52", precision=10, scale=6)
    private BigDecimal moyCol52;
    @Column(name="ETAT_COL_52", length=1)
    private String etatCol52;
    @Column(name="TYPE_COL_53", length=1)
    private String typeCol53;
    @Column(name="ID_COL_53", length=10)
    private String idCol53;
    @Column(name="NOM_COL_53", length=100)
    private String nomCol53;
    @Column(name="MOY_COL_53", precision=10, scale=6)
    private BigDecimal moyCol53;
    @Column(name="ETAT_COL_53", length=1)
    private String etatCol53;
    @Column(name="TYPE_COL_54", length=1)
    private String typeCol54;
    @Column(name="ID_COL_54", length=10)
    private String idCol54;
    @Column(name="NOM_COL_54", length=100)
    private String nomCol54;
    @Column(name="MOY_COL_54", precision=10, scale=6)
    private BigDecimal moyCol54;
    @Column(name="ETAT_COL_54", length=1)
    private String etatCol54;
    @Column(name="TYPE_COL_55", length=1)
    private String typeCol55;
    @Column(name="ID_COL_55", length=10)
    private String idCol55;
    @Column(name="NOM_COL_55", length=100)
    private String nomCol55;
    @Column(name="MOY_COL_55", precision=10, scale=6)
    private BigDecimal moyCol55;
    @Column(name="ETAT_COL_55", length=1)
    private String etatCol55;
    @Column(name="TYPE_COL_56", length=1)
    private String typeCol56;
    @Column(name="ID_COL_56", length=10)
    private String idCol56;
    @Column(name="NOM_COL_56", length=100)
    private String nomCol56;
    @Column(name="MOY_COL_56", precision=10, scale=6)
    private BigDecimal moyCol56;
    @Column(name="ETAT_COL_56", length=1)
    private String etatCol56;
    @Column(name="TYPE_COL_57", length=1)
    private String typeCol57;
    @Column(name="ID_COL_57", length=10)
    private String idCol57;
    @Column(name="NOM_COL_57", length=100)
    private String nomCol57;
    @Column(name="MOY_COL_57", precision=10, scale=6)
    private BigDecimal moyCol57;
    @Column(name="ETAT_COL_57", length=1)
    private String etatCol57;
    @Column(name="TYPE_COL_58", length=1)
    private String typeCol58;
    @Column(name="ID_COL_58", length=10)
    private String idCol58;
    @Column(name="NOM_COL_58", length=100)
    private String nomCol58;
    @Column(name="MOY_COL_58", precision=10, scale=6)
    private BigDecimal moyCol58;
    @Column(name="ETAT_COL_58", length=1)
    private String etatCol58;
    @Column(name="TYPE_COL_59", length=1)
    private String typeCol59;
    @Column(name="ID_COL_59", length=10)
    private String idCol59;
    @Column(name="NOM_COL_59", length=100)
    private String nomCol59;
    @Column(name="MOY_COL_59", precision=10, scale=6)
    private BigDecimal moyCol59;
    @Column(name="ETAT_COL_59", length=1)
    private String etatCol59;
    @Column(name="TYPE_COL_60", length=1)
    private String typeCol60;
    @Column(name="ID_COL_60", length=10)
    private String idCol60;
    @Column(name="NOM_COL_60", length=100)
    private String nomCol60;
    @Column(name="MOY_COL_60", precision=10, scale=6)
    private BigDecimal moyCol60;
    @Column(name="ETAT_COL_60", length=1)
    private String etatCol60;
    @Column(name="NATURE_UE_1", length=1)
    private String natureUe1;
    @Column(name="NATURE_UE_2", length=1)
    private String natureUe2;
    @Column(name="NATURE_UE_3", length=1)
    private String natureUe3;
    @Column(name="NATURE_UE_4", length=1)
    private String natureUe4;
    @Column(name="NATURE_UE_5", length=1)
    private String natureUe5;
    @Column(name="NATURE_UE_6", length=1)
    private String natureUe6;
    @Column(name="NATURE_UE_7", length=1)
    private String natureUe7;
    @Column(name="NATURE_UE_8", length=1)
    private String natureUe8;
    @Column(name="NATURE_UE_9", length=1)
    private String natureUe9;
    @Column(name="NATURE_UE_10", length=1)
    private String natureUe10;
    @Column(name="NATURE_UE_11", length=1)
    private String natureUe11;
    @Column(name="NATURE_UE_12", length=1)
    private String natureUe12;
    @Column(name="NATURE_UE_13", length=1)
    private String natureUe13;
    @Column(name="NATURE_UE_14", length=1)
    private String natureUe14;
    @Column(name="NATURE_UE_15", length=1)
    private String natureUe15;
    @Column(name="NATURE_UE_16", length=1)
    private String natureUe16;
    @Column(name="NATURE_UE_17", length=1)
    private String natureUe17;
    @Column(name="NATURE_UE_18", length=1)
    private String natureUe18;
    @Column(name="NATURE_UE_19", length=1)
    private String natureUe19;
    @Column(name="NATURE_UE_20", length=1)
    private String natureUe20;
    @Column(name="NATURE_UE_21", length=1)
    private String natureUe21;
    @Column(name="NATURE_UE_22", length=1)
    private String natureUe22;
    @Column(name="NATURE_UE_23", length=1)
    private String natureUe23;
    @Column(name="NATURE_UE_24", length=1)
    private String natureUe24;
    @Column(name="NATURE_UE_25", length=1)
    private String natureUe25;
    @Column(name="NATURE_UE_26", length=1)
    private String natureUe26;
    @Column(name="NATURE_UE_27", length=1)
    private String natureUe27;
    @Column(name="NATURE_UE_28", length=1)
    private String natureUe28;
    @Column(name="NATURE_UE_29", length=1)
    private String natureUe29;
    @Column(name="NATURE_UE_30", length=1)
    private String natureUe30;
    @Column(name="NATURE_UE_31", length=1)
    private String natureUe31;
    @Column(name="NATURE_UE_32", length=1)
    private String natureUe32;
    @Column(name="NATURE_UE_33", length=1)
    private String natureUe33;
    @Column(name="NATURE_UE_34", length=1)
    private String natureUe34;
    @Column(name="NATURE_UE_35", length=1)
    private String natureUe35;
    @Column(name="NATURE_UE_36", length=1)
    private String natureUe36;
    @Column(name="NATURE_UE_37", length=1)
    private String natureUe37;
    @Column(name="NATURE_UE_38", length=1)
    private String natureUe38;
    @Column(name="NATURE_UE_39", length=1)
    private String natureUe39;
    @Column(name="NATURE_UE_40", length=1)
    private String natureUe40;
    @Column(name="NATURE_UE_41", length=1)
    private String natureUe41;
    @Column(name="NATURE_UE_42", length=1)
    private String natureUe42;
    @Column(name="NATURE_UE_43", length=1)
    private String natureUe43;
    @Column(name="NATURE_UE_44", length=1)
    private String natureUe44;
    @Column(name="NATURE_UE_45", length=1)
    private String natureUe45;
    @Column(name="NATURE_UE_46", length=1)
    private String natureUe46;
    @Column(name="NATURE_UE_47", length=1)
    private String natureUe47;
    @Column(name="NATURE_UE_48", length=1)
    private String natureUe48;
    @Column(name="NATURE_UE_49", length=1)
    private String natureUe49;
    @Column(name="NATURE_UE_50", length=1)
    private String natureUe50;
    @Column(name="NATURE_UE_51", length=1)
    private String natureUe51;
    @Column(name="NATURE_UE_52", length=1)
    private String natureUe52;
    @Column(name="NATURE_UE_53", length=1)
    private String natureUe53;
    @Column(name="NATURE_UE_54", length=1)
    private String natureUe54;
    @Column(name="NATURE_UE_55", length=1)
    private String natureUe55;
    @Column(name="NATURE_UE_56", length=1)
    private String natureUe56;
    @Column(name="NATURE_UE_57", length=1)
    private String natureUe57;
    @Column(name="NATURE_UE_58", length=1)
    private String natureUe58;
    @Column(name="NATURE_UE_59", length=1)
    private String natureUe59;
    @Column(name="NATURE_UE_60", length=1)
    private String natureUe60;

    /** Default constructor. */
    public EspPvClasse() {
        super();
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
     * Access method for idEt.
     *
     * @return the current value of idEt
     */
    public String getIdEt() {
        return idEt;
    }

    /**
     * Setter method for idEt.
     *
     * @param aIdEt the new value for idEt
     */
    public void setIdEt(String aIdEt) {
        idEt = aIdEt;
    }

    /**
     * Access method for annee.
     *
     * @return the current value of annee
     */
    public String getAnnee() {
        return annee;
    }

    /**
     * Setter method for annee.
     *
     * @param aAnnee the new value for annee
     */
    public void setAnnee(String aAnnee) {
        annee = aAnnee;
    }

    /**
     * Access method for datePv.
     *
     * @return the current value of datePv
     */
    public LocalDateTime getDatePv() {
        return datePv;
    }

    /**
     * Setter method for datePv.
     *
     * @param aDatePv the new value for datePv
     */
    public void setDatePv(LocalDateTime aDatePv) {
        datePv = aDatePv;
    }

    /**
     * Access method for typeCol1.
     *
     * @return the current value of typeCol1
     */
    public String getTypeCol1() {
        return typeCol1;
    }

    /**
     * Setter method for typeCol1.
     *
     * @param aTypeCol1 the new value for typeCol1
     */
    public void setTypeCol1(String aTypeCol1) {
        typeCol1 = aTypeCol1;
    }

    /**
     * Access method for idCol1.
     *
     * @return the current value of idCol1
     */
    public String getIdCol1() {
        return idCol1;
    }

    /**
     * Setter method for idCol1.
     *
     * @param aIdCol1 the new value for idCol1
     */
    public void setIdCol1(String aIdCol1) {
        idCol1 = aIdCol1;
    }

    /**
     * Access method for nomCol1.
     *
     * @return the current value of nomCol1
     */
    public String getNomCol1() {
        return nomCol1;
    }

    /**
     * Setter method for nomCol1.
     *
     * @param aNomCol1 the new value for nomCol1
     */
    public void setNomCol1(String aNomCol1) {
        nomCol1 = aNomCol1;
    }

    /**
     * Access method for moyCol1.
     *
     * @return the current value of moyCol1
     */
    public BigDecimal getMoyCol1() {
        return moyCol1;
    }

    /**
     * Setter method for moyCol1.
     *
     * @param aMoyCol1 the new value for moyCol1
     */
    public void setMoyCol1(BigDecimal aMoyCol1) {
        moyCol1 = aMoyCol1;
    }

    /**
     * Access method for etatCol1.
     *
     * @return the current value of etatCol1
     */
    public String getEtatCol1() {
        return etatCol1;
    }

    /**
     * Setter method for etatCol1.
     *
     * @param aEtatCol1 the new value for etatCol1
     */
    public void setEtatCol1(String aEtatCol1) {
        etatCol1 = aEtatCol1;
    }

    /**
     * Access method for typeCol2.
     *
     * @return the current value of typeCol2
     */
    public String getTypeCol2() {
        return typeCol2;
    }

    /**
     * Setter method for typeCol2.
     *
     * @param aTypeCol2 the new value for typeCol2
     */
    public void setTypeCol2(String aTypeCol2) {
        typeCol2 = aTypeCol2;
    }

    /**
     * Access method for idCol2.
     *
     * @return the current value of idCol2
     */
    public String getIdCol2() {
        return idCol2;
    }

    /**
     * Setter method for idCol2.
     *
     * @param aIdCol2 the new value for idCol2
     */
    public void setIdCol2(String aIdCol2) {
        idCol2 = aIdCol2;
    }

    /**
     * Access method for nomCol2.
     *
     * @return the current value of nomCol2
     */
    public String getNomCol2() {
        return nomCol2;
    }

    /**
     * Setter method for nomCol2.
     *
     * @param aNomCol2 the new value for nomCol2
     */
    public void setNomCol2(String aNomCol2) {
        nomCol2 = aNomCol2;
    }

    /**
     * Access method for moyCol2.
     *
     * @return the current value of moyCol2
     */
    public BigDecimal getMoyCol2() {
        return moyCol2;
    }

    /**
     * Setter method for moyCol2.
     *
     * @param aMoyCol2 the new value for moyCol2
     */
    public void setMoyCol2(BigDecimal aMoyCol2) {
        moyCol2 = aMoyCol2;
    }

    /**
     * Access method for etatCol2.
     *
     * @return the current value of etatCol2
     */
    public String getEtatCol2() {
        return etatCol2;
    }

    /**
     * Setter method for etatCol2.
     *
     * @param aEtatCol2 the new value for etatCol2
     */
    public void setEtatCol2(String aEtatCol2) {
        etatCol2 = aEtatCol2;
    }

    /**
     * Access method for typeCol3.
     *
     * @return the current value of typeCol3
     */
    public String getTypeCol3() {
        return typeCol3;
    }

    /**
     * Setter method for typeCol3.
     *
     * @param aTypeCol3 the new value for typeCol3
     */
    public void setTypeCol3(String aTypeCol3) {
        typeCol3 = aTypeCol3;
    }

    /**
     * Access method for idCol3.
     *
     * @return the current value of idCol3
     */
    public String getIdCol3() {
        return idCol3;
    }

    /**
     * Setter method for idCol3.
     *
     * @param aIdCol3 the new value for idCol3
     */
    public void setIdCol3(String aIdCol3) {
        idCol3 = aIdCol3;
    }

    /**
     * Access method for nomCol3.
     *
     * @return the current value of nomCol3
     */
    public String getNomCol3() {
        return nomCol3;
    }

    /**
     * Setter method for nomCol3.
     *
     * @param aNomCol3 the new value for nomCol3
     */
    public void setNomCol3(String aNomCol3) {
        nomCol3 = aNomCol3;
    }

    /**
     * Access method for moyCol3.
     *
     * @return the current value of moyCol3
     */
    public BigDecimal getMoyCol3() {
        return moyCol3;
    }

    /**
     * Setter method for moyCol3.
     *
     * @param aMoyCol3 the new value for moyCol3
     */
    public void setMoyCol3(BigDecimal aMoyCol3) {
        moyCol3 = aMoyCol3;
    }

    /**
     * Access method for etatCol3.
     *
     * @return the current value of etatCol3
     */
    public String getEtatCol3() {
        return etatCol3;
    }

    /**
     * Setter method for etatCol3.
     *
     * @param aEtatCol3 the new value for etatCol3
     */
    public void setEtatCol3(String aEtatCol3) {
        etatCol3 = aEtatCol3;
    }

    /**
     * Access method for typeCol4.
     *
     * @return the current value of typeCol4
     */
    public String getTypeCol4() {
        return typeCol4;
    }

    /**
     * Setter method for typeCol4.
     *
     * @param aTypeCol4 the new value for typeCol4
     */
    public void setTypeCol4(String aTypeCol4) {
        typeCol4 = aTypeCol4;
    }

    /**
     * Access method for idCol4.
     *
     * @return the current value of idCol4
     */
    public String getIdCol4() {
        return idCol4;
    }

    /**
     * Setter method for idCol4.
     *
     * @param aIdCol4 the new value for idCol4
     */
    public void setIdCol4(String aIdCol4) {
        idCol4 = aIdCol4;
    }

    /**
     * Access method for nomCol4.
     *
     * @return the current value of nomCol4
     */
    public String getNomCol4() {
        return nomCol4;
    }

    /**
     * Setter method for nomCol4.
     *
     * @param aNomCol4 the new value for nomCol4
     */
    public void setNomCol4(String aNomCol4) {
        nomCol4 = aNomCol4;
    }

    /**
     * Access method for moyCol4.
     *
     * @return the current value of moyCol4
     */
    public BigDecimal getMoyCol4() {
        return moyCol4;
    }

    /**
     * Setter method for moyCol4.
     *
     * @param aMoyCol4 the new value for moyCol4
     */
    public void setMoyCol4(BigDecimal aMoyCol4) {
        moyCol4 = aMoyCol4;
    }

    /**
     * Access method for etatCol4.
     *
     * @return the current value of etatCol4
     */
    public String getEtatCol4() {
        return etatCol4;
    }

    /**
     * Setter method for etatCol4.
     *
     * @param aEtatCol4 the new value for etatCol4
     */
    public void setEtatCol4(String aEtatCol4) {
        etatCol4 = aEtatCol4;
    }

    /**
     * Access method for typeCol5.
     *
     * @return the current value of typeCol5
     */
    public String getTypeCol5() {
        return typeCol5;
    }

    /**
     * Setter method for typeCol5.
     *
     * @param aTypeCol5 the new value for typeCol5
     */
    public void setTypeCol5(String aTypeCol5) {
        typeCol5 = aTypeCol5;
    }

    /**
     * Access method for idCol5.
     *
     * @return the current value of idCol5
     */
    public String getIdCol5() {
        return idCol5;
    }

    /**
     * Setter method for idCol5.
     *
     * @param aIdCol5 the new value for idCol5
     */
    public void setIdCol5(String aIdCol5) {
        idCol5 = aIdCol5;
    }

    /**
     * Access method for nomCol5.
     *
     * @return the current value of nomCol5
     */
    public String getNomCol5() {
        return nomCol5;
    }

    /**
     * Setter method for nomCol5.
     *
     * @param aNomCol5 the new value for nomCol5
     */
    public void setNomCol5(String aNomCol5) {
        nomCol5 = aNomCol5;
    }

    /**
     * Access method for moyCol5.
     *
     * @return the current value of moyCol5
     */
    public BigDecimal getMoyCol5() {
        return moyCol5;
    }

    /**
     * Setter method for moyCol5.
     *
     * @param aMoyCol5 the new value for moyCol5
     */
    public void setMoyCol5(BigDecimal aMoyCol5) {
        moyCol5 = aMoyCol5;
    }

    /**
     * Access method for etatCol5.
     *
     * @return the current value of etatCol5
     */
    public String getEtatCol5() {
        return etatCol5;
    }

    /**
     * Setter method for etatCol5.
     *
     * @param aEtatCol5 the new value for etatCol5
     */
    public void setEtatCol5(String aEtatCol5) {
        etatCol5 = aEtatCol5;
    }

    /**
     * Access method for typeCol6.
     *
     * @return the current value of typeCol6
     */
    public String getTypeCol6() {
        return typeCol6;
    }

    /**
     * Setter method for typeCol6.
     *
     * @param aTypeCol6 the new value for typeCol6
     */
    public void setTypeCol6(String aTypeCol6) {
        typeCol6 = aTypeCol6;
    }

    /**
     * Access method for idCol6.
     *
     * @return the current value of idCol6
     */
    public String getIdCol6() {
        return idCol6;
    }

    /**
     * Setter method for idCol6.
     *
     * @param aIdCol6 the new value for idCol6
     */
    public void setIdCol6(String aIdCol6) {
        idCol6 = aIdCol6;
    }

    /**
     * Access method for nomCol6.
     *
     * @return the current value of nomCol6
     */
    public String getNomCol6() {
        return nomCol6;
    }

    /**
     * Setter method for nomCol6.
     *
     * @param aNomCol6 the new value for nomCol6
     */
    public void setNomCol6(String aNomCol6) {
        nomCol6 = aNomCol6;
    }

    /**
     * Access method for moyCol6.
     *
     * @return the current value of moyCol6
     */
    public BigDecimal getMoyCol6() {
        return moyCol6;
    }

    /**
     * Setter method for moyCol6.
     *
     * @param aMoyCol6 the new value for moyCol6
     */
    public void setMoyCol6(BigDecimal aMoyCol6) {
        moyCol6 = aMoyCol6;
    }

    /**
     * Access method for etatCol6.
     *
     * @return the current value of etatCol6
     */
    public String getEtatCol6() {
        return etatCol6;
    }

    /**
     * Setter method for etatCol6.
     *
     * @param aEtatCol6 the new value for etatCol6
     */
    public void setEtatCol6(String aEtatCol6) {
        etatCol6 = aEtatCol6;
    }

    /**
     * Access method for typeCol7.
     *
     * @return the current value of typeCol7
     */
    public String getTypeCol7() {
        return typeCol7;
    }

    /**
     * Setter method for typeCol7.
     *
     * @param aTypeCol7 the new value for typeCol7
     */
    public void setTypeCol7(String aTypeCol7) {
        typeCol7 = aTypeCol7;
    }

    /**
     * Access method for idCol7.
     *
     * @return the current value of idCol7
     */
    public String getIdCol7() {
        return idCol7;
    }

    /**
     * Setter method for idCol7.
     *
     * @param aIdCol7 the new value for idCol7
     */
    public void setIdCol7(String aIdCol7) {
        idCol7 = aIdCol7;
    }

    /**
     * Access method for nomCol7.
     *
     * @return the current value of nomCol7
     */
    public String getNomCol7() {
        return nomCol7;
    }

    /**
     * Setter method for nomCol7.
     *
     * @param aNomCol7 the new value for nomCol7
     */
    public void setNomCol7(String aNomCol7) {
        nomCol7 = aNomCol7;
    }

    /**
     * Access method for moyCol7.
     *
     * @return the current value of moyCol7
     */
    public BigDecimal getMoyCol7() {
        return moyCol7;
    }

    /**
     * Setter method for moyCol7.
     *
     * @param aMoyCol7 the new value for moyCol7
     */
    public void setMoyCol7(BigDecimal aMoyCol7) {
        moyCol7 = aMoyCol7;
    }

    /**
     * Access method for etatCol7.
     *
     * @return the current value of etatCol7
     */
    public String getEtatCol7() {
        return etatCol7;
    }

    /**
     * Setter method for etatCol7.
     *
     * @param aEtatCol7 the new value for etatCol7
     */
    public void setEtatCol7(String aEtatCol7) {
        etatCol7 = aEtatCol7;
    }

    /**
     * Access method for typeCol8.
     *
     * @return the current value of typeCol8
     */
    public String getTypeCol8() {
        return typeCol8;
    }

    /**
     * Setter method for typeCol8.
     *
     * @param aTypeCol8 the new value for typeCol8
     */
    public void setTypeCol8(String aTypeCol8) {
        typeCol8 = aTypeCol8;
    }

    /**
     * Access method for idCol8.
     *
     * @return the current value of idCol8
     */
    public String getIdCol8() {
        return idCol8;
    }

    /**
     * Setter method for idCol8.
     *
     * @param aIdCol8 the new value for idCol8
     */
    public void setIdCol8(String aIdCol8) {
        idCol8 = aIdCol8;
    }

    /**
     * Access method for nomCol8.
     *
     * @return the current value of nomCol8
     */
    public String getNomCol8() {
        return nomCol8;
    }

    /**
     * Setter method for nomCol8.
     *
     * @param aNomCol8 the new value for nomCol8
     */
    public void setNomCol8(String aNomCol8) {
        nomCol8 = aNomCol8;
    }

    /**
     * Access method for moyCol8.
     *
     * @return the current value of moyCol8
     */
    public BigDecimal getMoyCol8() {
        return moyCol8;
    }

    /**
     * Setter method for moyCol8.
     *
     * @param aMoyCol8 the new value for moyCol8
     */
    public void setMoyCol8(BigDecimal aMoyCol8) {
        moyCol8 = aMoyCol8;
    }

    /**
     * Access method for etatCol8.
     *
     * @return the current value of etatCol8
     */
    public String getEtatCol8() {
        return etatCol8;
    }

    /**
     * Setter method for etatCol8.
     *
     * @param aEtatCol8 the new value for etatCol8
     */
    public void setEtatCol8(String aEtatCol8) {
        etatCol8 = aEtatCol8;
    }

    /**
     * Access method for typeCol9.
     *
     * @return the current value of typeCol9
     */
    public String getTypeCol9() {
        return typeCol9;
    }

    /**
     * Setter method for typeCol9.
     *
     * @param aTypeCol9 the new value for typeCol9
     */
    public void setTypeCol9(String aTypeCol9) {
        typeCol9 = aTypeCol9;
    }

    /**
     * Access method for idCol9.
     *
     * @return the current value of idCol9
     */
    public String getIdCol9() {
        return idCol9;
    }

    /**
     * Setter method for idCol9.
     *
     * @param aIdCol9 the new value for idCol9
     */
    public void setIdCol9(String aIdCol9) {
        idCol9 = aIdCol9;
    }

    /**
     * Access method for nomCol9.
     *
     * @return the current value of nomCol9
     */
    public String getNomCol9() {
        return nomCol9;
    }

    /**
     * Setter method for nomCol9.
     *
     * @param aNomCol9 the new value for nomCol9
     */
    public void setNomCol9(String aNomCol9) {
        nomCol9 = aNomCol9;
    }

    /**
     * Access method for moyCol9.
     *
     * @return the current value of moyCol9
     */
    public BigDecimal getMoyCol9() {
        return moyCol9;
    }

    /**
     * Setter method for moyCol9.
     *
     * @param aMoyCol9 the new value for moyCol9
     */
    public void setMoyCol9(BigDecimal aMoyCol9) {
        moyCol9 = aMoyCol9;
    }

    /**
     * Access method for etatCol9.
     *
     * @return the current value of etatCol9
     */
    public String getEtatCol9() {
        return etatCol9;
    }

    /**
     * Setter method for etatCol9.
     *
     * @param aEtatCol9 the new value for etatCol9
     */
    public void setEtatCol9(String aEtatCol9) {
        etatCol9 = aEtatCol9;
    }

    /**
     * Access method for typeCol10.
     *
     * @return the current value of typeCol10
     */
    public String getTypeCol10() {
        return typeCol10;
    }

    /**
     * Setter method for typeCol10.
     *
     * @param aTypeCol10 the new value for typeCol10
     */
    public void setTypeCol10(String aTypeCol10) {
        typeCol10 = aTypeCol10;
    }

    /**
     * Access method for idCol10.
     *
     * @return the current value of idCol10
     */
    public String getIdCol10() {
        return idCol10;
    }

    /**
     * Setter method for idCol10.
     *
     * @param aIdCol10 the new value for idCol10
     */
    public void setIdCol10(String aIdCol10) {
        idCol10 = aIdCol10;
    }

    /**
     * Access method for nomCol10.
     *
     * @return the current value of nomCol10
     */
    public String getNomCol10() {
        return nomCol10;
    }

    /**
     * Setter method for nomCol10.
     *
     * @param aNomCol10 the new value for nomCol10
     */
    public void setNomCol10(String aNomCol10) {
        nomCol10 = aNomCol10;
    }

    /**
     * Access method for moyCol10.
     *
     * @return the current value of moyCol10
     */
    public BigDecimal getMoyCol10() {
        return moyCol10;
    }

    /**
     * Setter method for moyCol10.
     *
     * @param aMoyCol10 the new value for moyCol10
     */
    public void setMoyCol10(BigDecimal aMoyCol10) {
        moyCol10 = aMoyCol10;
    }

    /**
     * Access method for etatCol10.
     *
     * @return the current value of etatCol10
     */
    public String getEtatCol10() {
        return etatCol10;
    }

    /**
     * Setter method for etatCol10.
     *
     * @param aEtatCol10 the new value for etatCol10
     */
    public void setEtatCol10(String aEtatCol10) {
        etatCol10 = aEtatCol10;
    }

    /**
     * Access method for typeCol11.
     *
     * @return the current value of typeCol11
     */
    public String getTypeCol11() {
        return typeCol11;
    }

    /**
     * Setter method for typeCol11.
     *
     * @param aTypeCol11 the new value for typeCol11
     */
    public void setTypeCol11(String aTypeCol11) {
        typeCol11 = aTypeCol11;
    }

    /**
     * Access method for idCol11.
     *
     * @return the current value of idCol11
     */
    public String getIdCol11() {
        return idCol11;
    }

    /**
     * Setter method for idCol11.
     *
     * @param aIdCol11 the new value for idCol11
     */
    public void setIdCol11(String aIdCol11) {
        idCol11 = aIdCol11;
    }

    /**
     * Access method for nomCol11.
     *
     * @return the current value of nomCol11
     */
    public String getNomCol11() {
        return nomCol11;
    }

    /**
     * Setter method for nomCol11.
     *
     * @param aNomCol11 the new value for nomCol11
     */
    public void setNomCol11(String aNomCol11) {
        nomCol11 = aNomCol11;
    }

    /**
     * Access method for moyCol11.
     *
     * @return the current value of moyCol11
     */
    public BigDecimal getMoyCol11() {
        return moyCol11;
    }

    /**
     * Setter method for moyCol11.
     *
     * @param aMoyCol11 the new value for moyCol11
     */
    public void setMoyCol11(BigDecimal aMoyCol11) {
        moyCol11 = aMoyCol11;
    }

    /**
     * Access method for etatCol11.
     *
     * @return the current value of etatCol11
     */
    public String getEtatCol11() {
        return etatCol11;
    }

    /**
     * Setter method for etatCol11.
     *
     * @param aEtatCol11 the new value for etatCol11
     */
    public void setEtatCol11(String aEtatCol11) {
        etatCol11 = aEtatCol11;
    }

    /**
     * Access method for typeCol12.
     *
     * @return the current value of typeCol12
     */
    public String getTypeCol12() {
        return typeCol12;
    }

    /**
     * Setter method for typeCol12.
     *
     * @param aTypeCol12 the new value for typeCol12
     */
    public void setTypeCol12(String aTypeCol12) {
        typeCol12 = aTypeCol12;
    }

    /**
     * Access method for idCol12.
     *
     * @return the current value of idCol12
     */
    public String getIdCol12() {
        return idCol12;
    }

    /**
     * Setter method for idCol12.
     *
     * @param aIdCol12 the new value for idCol12
     */
    public void setIdCol12(String aIdCol12) {
        idCol12 = aIdCol12;
    }

    /**
     * Access method for nomCol12.
     *
     * @return the current value of nomCol12
     */
    public String getNomCol12() {
        return nomCol12;
    }

    /**
     * Setter method for nomCol12.
     *
     * @param aNomCol12 the new value for nomCol12
     */
    public void setNomCol12(String aNomCol12) {
        nomCol12 = aNomCol12;
    }

    /**
     * Access method for moyCol12.
     *
     * @return the current value of moyCol12
     */
    public BigDecimal getMoyCol12() {
        return moyCol12;
    }

    /**
     * Setter method for moyCol12.
     *
     * @param aMoyCol12 the new value for moyCol12
     */
    public void setMoyCol12(BigDecimal aMoyCol12) {
        moyCol12 = aMoyCol12;
    }

    /**
     * Access method for etatCol12.
     *
     * @return the current value of etatCol12
     */
    public String getEtatCol12() {
        return etatCol12;
    }

    /**
     * Setter method for etatCol12.
     *
     * @param aEtatCol12 the new value for etatCol12
     */
    public void setEtatCol12(String aEtatCol12) {
        etatCol12 = aEtatCol12;
    }

    /**
     * Access method for typeCol13.
     *
     * @return the current value of typeCol13
     */
    public String getTypeCol13() {
        return typeCol13;
    }

    /**
     * Setter method for typeCol13.
     *
     * @param aTypeCol13 the new value for typeCol13
     */
    public void setTypeCol13(String aTypeCol13) {
        typeCol13 = aTypeCol13;
    }

    /**
     * Access method for idCol13.
     *
     * @return the current value of idCol13
     */
    public String getIdCol13() {
        return idCol13;
    }

    /**
     * Setter method for idCol13.
     *
     * @param aIdCol13 the new value for idCol13
     */
    public void setIdCol13(String aIdCol13) {
        idCol13 = aIdCol13;
    }

    /**
     * Access method for nomCol13.
     *
     * @return the current value of nomCol13
     */
    public String getNomCol13() {
        return nomCol13;
    }

    /**
     * Setter method for nomCol13.
     *
     * @param aNomCol13 the new value for nomCol13
     */
    public void setNomCol13(String aNomCol13) {
        nomCol13 = aNomCol13;
    }

    /**
     * Access method for moyCol13.
     *
     * @return the current value of moyCol13
     */
    public BigDecimal getMoyCol13() {
        return moyCol13;
    }

    /**
     * Setter method for moyCol13.
     *
     * @param aMoyCol13 the new value for moyCol13
     */
    public void setMoyCol13(BigDecimal aMoyCol13) {
        moyCol13 = aMoyCol13;
    }

    /**
     * Access method for etatCol13.
     *
     * @return the current value of etatCol13
     */
    public String getEtatCol13() {
        return etatCol13;
    }

    /**
     * Setter method for etatCol13.
     *
     * @param aEtatCol13 the new value for etatCol13
     */
    public void setEtatCol13(String aEtatCol13) {
        etatCol13 = aEtatCol13;
    }

    /**
     * Access method for typeCol14.
     *
     * @return the current value of typeCol14
     */
    public String getTypeCol14() {
        return typeCol14;
    }

    /**
     * Setter method for typeCol14.
     *
     * @param aTypeCol14 the new value for typeCol14
     */
    public void setTypeCol14(String aTypeCol14) {
        typeCol14 = aTypeCol14;
    }

    /**
     * Access method for idCol14.
     *
     * @return the current value of idCol14
     */
    public String getIdCol14() {
        return idCol14;
    }

    /**
     * Setter method for idCol14.
     *
     * @param aIdCol14 the new value for idCol14
     */
    public void setIdCol14(String aIdCol14) {
        idCol14 = aIdCol14;
    }

    /**
     * Access method for nomCol14.
     *
     * @return the current value of nomCol14
     */
    public String getNomCol14() {
        return nomCol14;
    }

    /**
     * Setter method for nomCol14.
     *
     * @param aNomCol14 the new value for nomCol14
     */
    public void setNomCol14(String aNomCol14) {
        nomCol14 = aNomCol14;
    }

    /**
     * Access method for moyCol14.
     *
     * @return the current value of moyCol14
     */
    public BigDecimal getMoyCol14() {
        return moyCol14;
    }

    /**
     * Setter method for moyCol14.
     *
     * @param aMoyCol14 the new value for moyCol14
     */
    public void setMoyCol14(BigDecimal aMoyCol14) {
        moyCol14 = aMoyCol14;
    }

    /**
     * Access method for etatCol14.
     *
     * @return the current value of etatCol14
     */
    public String getEtatCol14() {
        return etatCol14;
    }

    /**
     * Setter method for etatCol14.
     *
     * @param aEtatCol14 the new value for etatCol14
     */
    public void setEtatCol14(String aEtatCol14) {
        etatCol14 = aEtatCol14;
    }

    /**
     * Access method for typeCol15.
     *
     * @return the current value of typeCol15
     */
    public String getTypeCol15() {
        return typeCol15;
    }

    /**
     * Setter method for typeCol15.
     *
     * @param aTypeCol15 the new value for typeCol15
     */
    public void setTypeCol15(String aTypeCol15) {
        typeCol15 = aTypeCol15;
    }

    /**
     * Access method for idCol15.
     *
     * @return the current value of idCol15
     */
    public String getIdCol15() {
        return idCol15;
    }

    /**
     * Setter method for idCol15.
     *
     * @param aIdCol15 the new value for idCol15
     */
    public void setIdCol15(String aIdCol15) {
        idCol15 = aIdCol15;
    }

    /**
     * Access method for nomCol15.
     *
     * @return the current value of nomCol15
     */
    public String getNomCol15() {
        return nomCol15;
    }

    /**
     * Setter method for nomCol15.
     *
     * @param aNomCol15 the new value for nomCol15
     */
    public void setNomCol15(String aNomCol15) {
        nomCol15 = aNomCol15;
    }

    /**
     * Access method for moyCol15.
     *
     * @return the current value of moyCol15
     */
    public BigDecimal getMoyCol15() {
        return moyCol15;
    }

    /**
     * Setter method for moyCol15.
     *
     * @param aMoyCol15 the new value for moyCol15
     */
    public void setMoyCol15(BigDecimal aMoyCol15) {
        moyCol15 = aMoyCol15;
    }

    /**
     * Access method for etatCol15.
     *
     * @return the current value of etatCol15
     */
    public String getEtatCol15() {
        return etatCol15;
    }

    /**
     * Setter method for etatCol15.
     *
     * @param aEtatCol15 the new value for etatCol15
     */
    public void setEtatCol15(String aEtatCol15) {
        etatCol15 = aEtatCol15;
    }

    /**
     * Access method for typeCol16.
     *
     * @return the current value of typeCol16
     */
    public String getTypeCol16() {
        return typeCol16;
    }

    /**
     * Setter method for typeCol16.
     *
     * @param aTypeCol16 the new value for typeCol16
     */
    public void setTypeCol16(String aTypeCol16) {
        typeCol16 = aTypeCol16;
    }

    /**
     * Access method for idCol16.
     *
     * @return the current value of idCol16
     */
    public String getIdCol16() {
        return idCol16;
    }

    /**
     * Setter method for idCol16.
     *
     * @param aIdCol16 the new value for idCol16
     */
    public void setIdCol16(String aIdCol16) {
        idCol16 = aIdCol16;
    }

    /**
     * Access method for nomCol16.
     *
     * @return the current value of nomCol16
     */
    public String getNomCol16() {
        return nomCol16;
    }

    /**
     * Setter method for nomCol16.
     *
     * @param aNomCol16 the new value for nomCol16
     */
    public void setNomCol16(String aNomCol16) {
        nomCol16 = aNomCol16;
    }

    /**
     * Access method for moyCol16.
     *
     * @return the current value of moyCol16
     */
    public BigDecimal getMoyCol16() {
        return moyCol16;
    }

    /**
     * Setter method for moyCol16.
     *
     * @param aMoyCol16 the new value for moyCol16
     */
    public void setMoyCol16(BigDecimal aMoyCol16) {
        moyCol16 = aMoyCol16;
    }

    /**
     * Access method for etatCol16.
     *
     * @return the current value of etatCol16
     */
    public String getEtatCol16() {
        return etatCol16;
    }

    /**
     * Setter method for etatCol16.
     *
     * @param aEtatCol16 the new value for etatCol16
     */
    public void setEtatCol16(String aEtatCol16) {
        etatCol16 = aEtatCol16;
    }

    /**
     * Access method for typeCol17.
     *
     * @return the current value of typeCol17
     */
    public String getTypeCol17() {
        return typeCol17;
    }

    /**
     * Setter method for typeCol17.
     *
     * @param aTypeCol17 the new value for typeCol17
     */
    public void setTypeCol17(String aTypeCol17) {
        typeCol17 = aTypeCol17;
    }

    /**
     * Access method for idCol17.
     *
     * @return the current value of idCol17
     */
    public String getIdCol17() {
        return idCol17;
    }

    /**
     * Setter method for idCol17.
     *
     * @param aIdCol17 the new value for idCol17
     */
    public void setIdCol17(String aIdCol17) {
        idCol17 = aIdCol17;
    }

    /**
     * Access method for nomCol17.
     *
     * @return the current value of nomCol17
     */
    public String getNomCol17() {
        return nomCol17;
    }

    /**
     * Setter method for nomCol17.
     *
     * @param aNomCol17 the new value for nomCol17
     */
    public void setNomCol17(String aNomCol17) {
        nomCol17 = aNomCol17;
    }

    /**
     * Access method for moyCol17.
     *
     * @return the current value of moyCol17
     */
    public BigDecimal getMoyCol17() {
        return moyCol17;
    }

    /**
     * Setter method for moyCol17.
     *
     * @param aMoyCol17 the new value for moyCol17
     */
    public void setMoyCol17(BigDecimal aMoyCol17) {
        moyCol17 = aMoyCol17;
    }

    /**
     * Access method for etatCol17.
     *
     * @return the current value of etatCol17
     */
    public String getEtatCol17() {
        return etatCol17;
    }

    /**
     * Setter method for etatCol17.
     *
     * @param aEtatCol17 the new value for etatCol17
     */
    public void setEtatCol17(String aEtatCol17) {
        etatCol17 = aEtatCol17;
    }

    /**
     * Access method for typeCol18.
     *
     * @return the current value of typeCol18
     */
    public String getTypeCol18() {
        return typeCol18;
    }

    /**
     * Setter method for typeCol18.
     *
     * @param aTypeCol18 the new value for typeCol18
     */
    public void setTypeCol18(String aTypeCol18) {
        typeCol18 = aTypeCol18;
    }

    /**
     * Access method for idCol18.
     *
     * @return the current value of idCol18
     */
    public String getIdCol18() {
        return idCol18;
    }

    /**
     * Setter method for idCol18.
     *
     * @param aIdCol18 the new value for idCol18
     */
    public void setIdCol18(String aIdCol18) {
        idCol18 = aIdCol18;
    }

    /**
     * Access method for nomCol18.
     *
     * @return the current value of nomCol18
     */
    public String getNomCol18() {
        return nomCol18;
    }

    /**
     * Setter method for nomCol18.
     *
     * @param aNomCol18 the new value for nomCol18
     */
    public void setNomCol18(String aNomCol18) {
        nomCol18 = aNomCol18;
    }

    /**
     * Access method for moyCol18.
     *
     * @return the current value of moyCol18
     */
    public BigDecimal getMoyCol18() {
        return moyCol18;
    }

    /**
     * Setter method for moyCol18.
     *
     * @param aMoyCol18 the new value for moyCol18
     */
    public void setMoyCol18(BigDecimal aMoyCol18) {
        moyCol18 = aMoyCol18;
    }

    /**
     * Access method for etatCol18.
     *
     * @return the current value of etatCol18
     */
    public String getEtatCol18() {
        return etatCol18;
    }

    /**
     * Setter method for etatCol18.
     *
     * @param aEtatCol18 the new value for etatCol18
     */
    public void setEtatCol18(String aEtatCol18) {
        etatCol18 = aEtatCol18;
    }

    /**
     * Access method for typeCol19.
     *
     * @return the current value of typeCol19
     */
    public String getTypeCol19() {
        return typeCol19;
    }

    /**
     * Setter method for typeCol19.
     *
     * @param aTypeCol19 the new value for typeCol19
     */
    public void setTypeCol19(String aTypeCol19) {
        typeCol19 = aTypeCol19;
    }

    /**
     * Access method for idCol19.
     *
     * @return the current value of idCol19
     */
    public String getIdCol19() {
        return idCol19;
    }

    /**
     * Setter method for idCol19.
     *
     * @param aIdCol19 the new value for idCol19
     */
    public void setIdCol19(String aIdCol19) {
        idCol19 = aIdCol19;
    }

    /**
     * Access method for nomCol19.
     *
     * @return the current value of nomCol19
     */
    public String getNomCol19() {
        return nomCol19;
    }

    /**
     * Setter method for nomCol19.
     *
     * @param aNomCol19 the new value for nomCol19
     */
    public void setNomCol19(String aNomCol19) {
        nomCol19 = aNomCol19;
    }

    /**
     * Access method for moyCol19.
     *
     * @return the current value of moyCol19
     */
    public BigDecimal getMoyCol19() {
        return moyCol19;
    }

    /**
     * Setter method for moyCol19.
     *
     * @param aMoyCol19 the new value for moyCol19
     */
    public void setMoyCol19(BigDecimal aMoyCol19) {
        moyCol19 = aMoyCol19;
    }

    /**
     * Access method for etatCol19.
     *
     * @return the current value of etatCol19
     */
    public String getEtatCol19() {
        return etatCol19;
    }

    /**
     * Setter method for etatCol19.
     *
     * @param aEtatCol19 the new value for etatCol19
     */
    public void setEtatCol19(String aEtatCol19) {
        etatCol19 = aEtatCol19;
    }

    /**
     * Access method for typeCol20.
     *
     * @return the current value of typeCol20
     */
    public String getTypeCol20() {
        return typeCol20;
    }

    /**
     * Setter method for typeCol20.
     *
     * @param aTypeCol20 the new value for typeCol20
     */
    public void setTypeCol20(String aTypeCol20) {
        typeCol20 = aTypeCol20;
    }

    /**
     * Access method for idCol20.
     *
     * @return the current value of idCol20
     */
    public String getIdCol20() {
        return idCol20;
    }

    /**
     * Setter method for idCol20.
     *
     * @param aIdCol20 the new value for idCol20
     */
    public void setIdCol20(String aIdCol20) {
        idCol20 = aIdCol20;
    }

    /**
     * Access method for nomCol20.
     *
     * @return the current value of nomCol20
     */
    public String getNomCol20() {
        return nomCol20;
    }

    /**
     * Setter method for nomCol20.
     *
     * @param aNomCol20 the new value for nomCol20
     */
    public void setNomCol20(String aNomCol20) {
        nomCol20 = aNomCol20;
    }

    /**
     * Access method for moyCol20.
     *
     * @return the current value of moyCol20
     */
    public BigDecimal getMoyCol20() {
        return moyCol20;
    }

    /**
     * Setter method for moyCol20.
     *
     * @param aMoyCol20 the new value for moyCol20
     */
    public void setMoyCol20(BigDecimal aMoyCol20) {
        moyCol20 = aMoyCol20;
    }

    /**
     * Access method for etatCol20.
     *
     * @return the current value of etatCol20
     */
    public String getEtatCol20() {
        return etatCol20;
    }

    /**
     * Setter method for etatCol20.
     *
     * @param aEtatCol20 the new value for etatCol20
     */
    public void setEtatCol20(String aEtatCol20) {
        etatCol20 = aEtatCol20;
    }

    /**
     * Access method for typeCol21.
     *
     * @return the current value of typeCol21
     */
    public String getTypeCol21() {
        return typeCol21;
    }

    /**
     * Setter method for typeCol21.
     *
     * @param aTypeCol21 the new value for typeCol21
     */
    public void setTypeCol21(String aTypeCol21) {
        typeCol21 = aTypeCol21;
    }

    /**
     * Access method for idCol21.
     *
     * @return the current value of idCol21
     */
    public String getIdCol21() {
        return idCol21;
    }

    /**
     * Setter method for idCol21.
     *
     * @param aIdCol21 the new value for idCol21
     */
    public void setIdCol21(String aIdCol21) {
        idCol21 = aIdCol21;
    }

    /**
     * Access method for nomCol21.
     *
     * @return the current value of nomCol21
     */
    public String getNomCol21() {
        return nomCol21;
    }

    /**
     * Setter method for nomCol21.
     *
     * @param aNomCol21 the new value for nomCol21
     */
    public void setNomCol21(String aNomCol21) {
        nomCol21 = aNomCol21;
    }

    /**
     * Access method for moyCol21.
     *
     * @return the current value of moyCol21
     */
    public BigDecimal getMoyCol21() {
        return moyCol21;
    }

    /**
     * Setter method for moyCol21.
     *
     * @param aMoyCol21 the new value for moyCol21
     */
    public void setMoyCol21(BigDecimal aMoyCol21) {
        moyCol21 = aMoyCol21;
    }

    /**
     * Access method for etatCol21.
     *
     * @return the current value of etatCol21
     */
    public String getEtatCol21() {
        return etatCol21;
    }

    /**
     * Setter method for etatCol21.
     *
     * @param aEtatCol21 the new value for etatCol21
     */
    public void setEtatCol21(String aEtatCol21) {
        etatCol21 = aEtatCol21;
    }

    /**
     * Access method for typeCol22.
     *
     * @return the current value of typeCol22
     */
    public String getTypeCol22() {
        return typeCol22;
    }

    /**
     * Setter method for typeCol22.
     *
     * @param aTypeCol22 the new value for typeCol22
     */
    public void setTypeCol22(String aTypeCol22) {
        typeCol22 = aTypeCol22;
    }

    /**
     * Access method for idCol22.
     *
     * @return the current value of idCol22
     */
    public String getIdCol22() {
        return idCol22;
    }

    /**
     * Setter method for idCol22.
     *
     * @param aIdCol22 the new value for idCol22
     */
    public void setIdCol22(String aIdCol22) {
        idCol22 = aIdCol22;
    }

    /**
     * Access method for nomCol22.
     *
     * @return the current value of nomCol22
     */
    public String getNomCol22() {
        return nomCol22;
    }

    /**
     * Setter method for nomCol22.
     *
     * @param aNomCol22 the new value for nomCol22
     */
    public void setNomCol22(String aNomCol22) {
        nomCol22 = aNomCol22;
    }

    /**
     * Access method for moyCol22.
     *
     * @return the current value of moyCol22
     */
    public BigDecimal getMoyCol22() {
        return moyCol22;
    }

    /**
     * Setter method for moyCol22.
     *
     * @param aMoyCol22 the new value for moyCol22
     */
    public void setMoyCol22(BigDecimal aMoyCol22) {
        moyCol22 = aMoyCol22;
    }

    /**
     * Access method for etatCol22.
     *
     * @return the current value of etatCol22
     */
    public String getEtatCol22() {
        return etatCol22;
    }

    /**
     * Setter method for etatCol22.
     *
     * @param aEtatCol22 the new value for etatCol22
     */
    public void setEtatCol22(String aEtatCol22) {
        etatCol22 = aEtatCol22;
    }

    /**
     * Access method for typeCol23.
     *
     * @return the current value of typeCol23
     */
    public String getTypeCol23() {
        return typeCol23;
    }

    /**
     * Setter method for typeCol23.
     *
     * @param aTypeCol23 the new value for typeCol23
     */
    public void setTypeCol23(String aTypeCol23) {
        typeCol23 = aTypeCol23;
    }

    /**
     * Access method for idCol23.
     *
     * @return the current value of idCol23
     */
    public String getIdCol23() {
        return idCol23;
    }

    /**
     * Setter method for idCol23.
     *
     * @param aIdCol23 the new value for idCol23
     */
    public void setIdCol23(String aIdCol23) {
        idCol23 = aIdCol23;
    }

    /**
     * Access method for nomCol23.
     *
     * @return the current value of nomCol23
     */
    public String getNomCol23() {
        return nomCol23;
    }

    /**
     * Setter method for nomCol23.
     *
     * @param aNomCol23 the new value for nomCol23
     */
    public void setNomCol23(String aNomCol23) {
        nomCol23 = aNomCol23;
    }

    /**
     * Access method for moyCol23.
     *
     * @return the current value of moyCol23
     */
    public BigDecimal getMoyCol23() {
        return moyCol23;
    }

    /**
     * Setter method for moyCol23.
     *
     * @param aMoyCol23 the new value for moyCol23
     */
    public void setMoyCol23(BigDecimal aMoyCol23) {
        moyCol23 = aMoyCol23;
    }

    /**
     * Access method for etatCol23.
     *
     * @return the current value of etatCol23
     */
    public String getEtatCol23() {
        return etatCol23;
    }

    /**
     * Setter method for etatCol23.
     *
     * @param aEtatCol23 the new value for etatCol23
     */
    public void setEtatCol23(String aEtatCol23) {
        etatCol23 = aEtatCol23;
    }

    /**
     * Access method for typeCol24.
     *
     * @return the current value of typeCol24
     */
    public String getTypeCol24() {
        return typeCol24;
    }

    /**
     * Setter method for typeCol24.
     *
     * @param aTypeCol24 the new value for typeCol24
     */
    public void setTypeCol24(String aTypeCol24) {
        typeCol24 = aTypeCol24;
    }

    /**
     * Access method for idCol24.
     *
     * @return the current value of idCol24
     */
    public String getIdCol24() {
        return idCol24;
    }

    /**
     * Setter method for idCol24.
     *
     * @param aIdCol24 the new value for idCol24
     */
    public void setIdCol24(String aIdCol24) {
        idCol24 = aIdCol24;
    }

    /**
     * Access method for nomCol24.
     *
     * @return the current value of nomCol24
     */
    public String getNomCol24() {
        return nomCol24;
    }

    /**
     * Setter method for nomCol24.
     *
     * @param aNomCol24 the new value for nomCol24
     */
    public void setNomCol24(String aNomCol24) {
        nomCol24 = aNomCol24;
    }

    /**
     * Access method for moyCol24.
     *
     * @return the current value of moyCol24
     */
    public BigDecimal getMoyCol24() {
        return moyCol24;
    }

    /**
     * Setter method for moyCol24.
     *
     * @param aMoyCol24 the new value for moyCol24
     */
    public void setMoyCol24(BigDecimal aMoyCol24) {
        moyCol24 = aMoyCol24;
    }

    /**
     * Access method for etatCol24.
     *
     * @return the current value of etatCol24
     */
    public String getEtatCol24() {
        return etatCol24;
    }

    /**
     * Setter method for etatCol24.
     *
     * @param aEtatCol24 the new value for etatCol24
     */
    public void setEtatCol24(String aEtatCol24) {
        etatCol24 = aEtatCol24;
    }

    /**
     * Access method for typeCol25.
     *
     * @return the current value of typeCol25
     */
    public String getTypeCol25() {
        return typeCol25;
    }

    /**
     * Setter method for typeCol25.
     *
     * @param aTypeCol25 the new value for typeCol25
     */
    public void setTypeCol25(String aTypeCol25) {
        typeCol25 = aTypeCol25;
    }

    /**
     * Access method for idCol25.
     *
     * @return the current value of idCol25
     */
    public String getIdCol25() {
        return idCol25;
    }

    /**
     * Setter method for idCol25.
     *
     * @param aIdCol25 the new value for idCol25
     */
    public void setIdCol25(String aIdCol25) {
        idCol25 = aIdCol25;
    }

    /**
     * Access method for nomCol25.
     *
     * @return the current value of nomCol25
     */
    public String getNomCol25() {
        return nomCol25;
    }

    /**
     * Setter method for nomCol25.
     *
     * @param aNomCol25 the new value for nomCol25
     */
    public void setNomCol25(String aNomCol25) {
        nomCol25 = aNomCol25;
    }

    /**
     * Access method for moyCol25.
     *
     * @return the current value of moyCol25
     */
    public BigDecimal getMoyCol25() {
        return moyCol25;
    }

    /**
     * Setter method for moyCol25.
     *
     * @param aMoyCol25 the new value for moyCol25
     */
    public void setMoyCol25(BigDecimal aMoyCol25) {
        moyCol25 = aMoyCol25;
    }

    /**
     * Access method for etatCol25.
     *
     * @return the current value of etatCol25
     */
    public String getEtatCol25() {
        return etatCol25;
    }

    /**
     * Setter method for etatCol25.
     *
     * @param aEtatCol25 the new value for etatCol25
     */
    public void setEtatCol25(String aEtatCol25) {
        etatCol25 = aEtatCol25;
    }

    /**
     * Access method for typeCol26.
     *
     * @return the current value of typeCol26
     */
    public String getTypeCol26() {
        return typeCol26;
    }

    /**
     * Setter method for typeCol26.
     *
     * @param aTypeCol26 the new value for typeCol26
     */
    public void setTypeCol26(String aTypeCol26) {
        typeCol26 = aTypeCol26;
    }

    /**
     * Access method for idCol26.
     *
     * @return the current value of idCol26
     */
    public String getIdCol26() {
        return idCol26;
    }

    /**
     * Setter method for idCol26.
     *
     * @param aIdCol26 the new value for idCol26
     */
    public void setIdCol26(String aIdCol26) {
        idCol26 = aIdCol26;
    }

    /**
     * Access method for nomCol26.
     *
     * @return the current value of nomCol26
     */
    public String getNomCol26() {
        return nomCol26;
    }

    /**
     * Setter method for nomCol26.
     *
     * @param aNomCol26 the new value for nomCol26
     */
    public void setNomCol26(String aNomCol26) {
        nomCol26 = aNomCol26;
    }

    /**
     * Access method for moyCol26.
     *
     * @return the current value of moyCol26
     */
    public BigDecimal getMoyCol26() {
        return moyCol26;
    }

    /**
     * Setter method for moyCol26.
     *
     * @param aMoyCol26 the new value for moyCol26
     */
    public void setMoyCol26(BigDecimal aMoyCol26) {
        moyCol26 = aMoyCol26;
    }

    /**
     * Access method for etatCol26.
     *
     * @return the current value of etatCol26
     */
    public String getEtatCol26() {
        return etatCol26;
    }

    /**
     * Setter method for etatCol26.
     *
     * @param aEtatCol26 the new value for etatCol26
     */
    public void setEtatCol26(String aEtatCol26) {
        etatCol26 = aEtatCol26;
    }

    /**
     * Access method for typeCol27.
     *
     * @return the current value of typeCol27
     */
    public String getTypeCol27() {
        return typeCol27;
    }

    /**
     * Setter method for typeCol27.
     *
     * @param aTypeCol27 the new value for typeCol27
     */
    public void setTypeCol27(String aTypeCol27) {
        typeCol27 = aTypeCol27;
    }

    /**
     * Access method for idCol27.
     *
     * @return the current value of idCol27
     */
    public String getIdCol27() {
        return idCol27;
    }

    /**
     * Setter method for idCol27.
     *
     * @param aIdCol27 the new value for idCol27
     */
    public void setIdCol27(String aIdCol27) {
        idCol27 = aIdCol27;
    }

    /**
     * Access method for nomCol27.
     *
     * @return the current value of nomCol27
     */
    public String getNomCol27() {
        return nomCol27;
    }

    /**
     * Setter method for nomCol27.
     *
     * @param aNomCol27 the new value for nomCol27
     */
    public void setNomCol27(String aNomCol27) {
        nomCol27 = aNomCol27;
    }

    /**
     * Access method for moyCol27.
     *
     * @return the current value of moyCol27
     */
    public BigDecimal getMoyCol27() {
        return moyCol27;
    }

    /**
     * Setter method for moyCol27.
     *
     * @param aMoyCol27 the new value for moyCol27
     */
    public void setMoyCol27(BigDecimal aMoyCol27) {
        moyCol27 = aMoyCol27;
    }

    /**
     * Access method for etatCol27.
     *
     * @return the current value of etatCol27
     */
    public String getEtatCol27() {
        return etatCol27;
    }

    /**
     * Setter method for etatCol27.
     *
     * @param aEtatCol27 the new value for etatCol27
     */
    public void setEtatCol27(String aEtatCol27) {
        etatCol27 = aEtatCol27;
    }

    /**
     * Access method for typeCol28.
     *
     * @return the current value of typeCol28
     */
    public String getTypeCol28() {
        return typeCol28;
    }

    /**
     * Setter method for typeCol28.
     *
     * @param aTypeCol28 the new value for typeCol28
     */
    public void setTypeCol28(String aTypeCol28) {
        typeCol28 = aTypeCol28;
    }

    /**
     * Access method for idCol28.
     *
     * @return the current value of idCol28
     */
    public String getIdCol28() {
        return idCol28;
    }

    /**
     * Setter method for idCol28.
     *
     * @param aIdCol28 the new value for idCol28
     */
    public void setIdCol28(String aIdCol28) {
        idCol28 = aIdCol28;
    }

    /**
     * Access method for nomCol28.
     *
     * @return the current value of nomCol28
     */
    public String getNomCol28() {
        return nomCol28;
    }

    /**
     * Setter method for nomCol28.
     *
     * @param aNomCol28 the new value for nomCol28
     */
    public void setNomCol28(String aNomCol28) {
        nomCol28 = aNomCol28;
    }

    /**
     * Access method for moyCol28.
     *
     * @return the current value of moyCol28
     */
    public BigDecimal getMoyCol28() {
        return moyCol28;
    }

    /**
     * Setter method for moyCol28.
     *
     * @param aMoyCol28 the new value for moyCol28
     */
    public void setMoyCol28(BigDecimal aMoyCol28) {
        moyCol28 = aMoyCol28;
    }

    /**
     * Access method for etatCol28.
     *
     * @return the current value of etatCol28
     */
    public String getEtatCol28() {
        return etatCol28;
    }

    /**
     * Setter method for etatCol28.
     *
     * @param aEtatCol28 the new value for etatCol28
     */
    public void setEtatCol28(String aEtatCol28) {
        etatCol28 = aEtatCol28;
    }

    /**
     * Access method for typeCol29.
     *
     * @return the current value of typeCol29
     */
    public String getTypeCol29() {
        return typeCol29;
    }

    /**
     * Setter method for typeCol29.
     *
     * @param aTypeCol29 the new value for typeCol29
     */
    public void setTypeCol29(String aTypeCol29) {
        typeCol29 = aTypeCol29;
    }

    /**
     * Access method for idCol29.
     *
     * @return the current value of idCol29
     */
    public String getIdCol29() {
        return idCol29;
    }

    /**
     * Setter method for idCol29.
     *
     * @param aIdCol29 the new value for idCol29
     */
    public void setIdCol29(String aIdCol29) {
        idCol29 = aIdCol29;
    }

    /**
     * Access method for nomCol29.
     *
     * @return the current value of nomCol29
     */
    public String getNomCol29() {
        return nomCol29;
    }

    /**
     * Setter method for nomCol29.
     *
     * @param aNomCol29 the new value for nomCol29
     */
    public void setNomCol29(String aNomCol29) {
        nomCol29 = aNomCol29;
    }

    /**
     * Access method for moyCol29.
     *
     * @return the current value of moyCol29
     */
    public BigDecimal getMoyCol29() {
        return moyCol29;
    }

    /**
     * Setter method for moyCol29.
     *
     * @param aMoyCol29 the new value for moyCol29
     */
    public void setMoyCol29(BigDecimal aMoyCol29) {
        moyCol29 = aMoyCol29;
    }

    /**
     * Access method for etatCol29.
     *
     * @return the current value of etatCol29
     */
    public String getEtatCol29() {
        return etatCol29;
    }

    /**
     * Setter method for etatCol29.
     *
     * @param aEtatCol29 the new value for etatCol29
     */
    public void setEtatCol29(String aEtatCol29) {
        etatCol29 = aEtatCol29;
    }

    /**
     * Access method for typeCol30.
     *
     * @return the current value of typeCol30
     */
    public String getTypeCol30() {
        return typeCol30;
    }

    /**
     * Setter method for typeCol30.
     *
     * @param aTypeCol30 the new value for typeCol30
     */
    public void setTypeCol30(String aTypeCol30) {
        typeCol30 = aTypeCol30;
    }

    /**
     * Access method for idCol30.
     *
     * @return the current value of idCol30
     */
    public String getIdCol30() {
        return idCol30;
    }

    /**
     * Setter method for idCol30.
     *
     * @param aIdCol30 the new value for idCol30
     */
    public void setIdCol30(String aIdCol30) {
        idCol30 = aIdCol30;
    }

    /**
     * Access method for nomCol30.
     *
     * @return the current value of nomCol30
     */
    public String getNomCol30() {
        return nomCol30;
    }

    /**
     * Setter method for nomCol30.
     *
     * @param aNomCol30 the new value for nomCol30
     */
    public void setNomCol30(String aNomCol30) {
        nomCol30 = aNomCol30;
    }

    /**
     * Access method for moyCol30.
     *
     * @return the current value of moyCol30
     */
    public BigDecimal getMoyCol30() {
        return moyCol30;
    }

    /**
     * Setter method for moyCol30.
     *
     * @param aMoyCol30 the new value for moyCol30
     */
    public void setMoyCol30(BigDecimal aMoyCol30) {
        moyCol30 = aMoyCol30;
    }

    /**
     * Access method for etatCol30.
     *
     * @return the current value of etatCol30
     */
    public String getEtatCol30() {
        return etatCol30;
    }

    /**
     * Setter method for etatCol30.
     *
     * @param aEtatCol30 the new value for etatCol30
     */
    public void setEtatCol30(String aEtatCol30) {
        etatCol30 = aEtatCol30;
    }

    /**
     * Access method for typeCol31.
     *
     * @return the current value of typeCol31
     */
    public String getTypeCol31() {
        return typeCol31;
    }

    /**
     * Setter method for typeCol31.
     *
     * @param aTypeCol31 the new value for typeCol31
     */
    public void setTypeCol31(String aTypeCol31) {
        typeCol31 = aTypeCol31;
    }

    /**
     * Access method for idCol31.
     *
     * @return the current value of idCol31
     */
    public String getIdCol31() {
        return idCol31;
    }

    /**
     * Setter method for idCol31.
     *
     * @param aIdCol31 the new value for idCol31
     */
    public void setIdCol31(String aIdCol31) {
        idCol31 = aIdCol31;
    }

    /**
     * Access method for nomCol31.
     *
     * @return the current value of nomCol31
     */
    public String getNomCol31() {
        return nomCol31;
    }

    /**
     * Setter method for nomCol31.
     *
     * @param aNomCol31 the new value for nomCol31
     */
    public void setNomCol31(String aNomCol31) {
        nomCol31 = aNomCol31;
    }

    /**
     * Access method for moyCol31.
     *
     * @return the current value of moyCol31
     */
    public BigDecimal getMoyCol31() {
        return moyCol31;
    }

    /**
     * Setter method for moyCol31.
     *
     * @param aMoyCol31 the new value for moyCol31
     */
    public void setMoyCol31(BigDecimal aMoyCol31) {
        moyCol31 = aMoyCol31;
    }

    /**
     * Access method for etatCol31.
     *
     * @return the current value of etatCol31
     */
    public String getEtatCol31() {
        return etatCol31;
    }

    /**
     * Setter method for etatCol31.
     *
     * @param aEtatCol31 the new value for etatCol31
     */
    public void setEtatCol31(String aEtatCol31) {
        etatCol31 = aEtatCol31;
    }

    /**
     * Access method for typeCol32.
     *
     * @return the current value of typeCol32
     */
    public String getTypeCol32() {
        return typeCol32;
    }

    /**
     * Setter method for typeCol32.
     *
     * @param aTypeCol32 the new value for typeCol32
     */
    public void setTypeCol32(String aTypeCol32) {
        typeCol32 = aTypeCol32;
    }

    /**
     * Access method for idCol32.
     *
     * @return the current value of idCol32
     */
    public String getIdCol32() {
        return idCol32;
    }

    /**
     * Setter method for idCol32.
     *
     * @param aIdCol32 the new value for idCol32
     */
    public void setIdCol32(String aIdCol32) {
        idCol32 = aIdCol32;
    }

    /**
     * Access method for nomCol32.
     *
     * @return the current value of nomCol32
     */
    public String getNomCol32() {
        return nomCol32;
    }

    /**
     * Setter method for nomCol32.
     *
     * @param aNomCol32 the new value for nomCol32
     */
    public void setNomCol32(String aNomCol32) {
        nomCol32 = aNomCol32;
    }

    /**
     * Access method for moyCol32.
     *
     * @return the current value of moyCol32
     */
    public BigDecimal getMoyCol32() {
        return moyCol32;
    }

    /**
     * Setter method for moyCol32.
     *
     * @param aMoyCol32 the new value for moyCol32
     */
    public void setMoyCol32(BigDecimal aMoyCol32) {
        moyCol32 = aMoyCol32;
    }

    /**
     * Access method for etatCol32.
     *
     * @return the current value of etatCol32
     */
    public String getEtatCol32() {
        return etatCol32;
    }

    /**
     * Setter method for etatCol32.
     *
     * @param aEtatCol32 the new value for etatCol32
     */
    public void setEtatCol32(String aEtatCol32) {
        etatCol32 = aEtatCol32;
    }

    /**
     * Access method for typeCol33.
     *
     * @return the current value of typeCol33
     */
    public String getTypeCol33() {
        return typeCol33;
    }

    /**
     * Setter method for typeCol33.
     *
     * @param aTypeCol33 the new value for typeCol33
     */
    public void setTypeCol33(String aTypeCol33) {
        typeCol33 = aTypeCol33;
    }

    /**
     * Access method for idCol33.
     *
     * @return the current value of idCol33
     */
    public String getIdCol33() {
        return idCol33;
    }

    /**
     * Setter method for idCol33.
     *
     * @param aIdCol33 the new value for idCol33
     */
    public void setIdCol33(String aIdCol33) {
        idCol33 = aIdCol33;
    }

    /**
     * Access method for nomCol33.
     *
     * @return the current value of nomCol33
     */
    public String getNomCol33() {
        return nomCol33;
    }

    /**
     * Setter method for nomCol33.
     *
     * @param aNomCol33 the new value for nomCol33
     */
    public void setNomCol33(String aNomCol33) {
        nomCol33 = aNomCol33;
    }

    /**
     * Access method for moyCol33.
     *
     * @return the current value of moyCol33
     */
    public BigDecimal getMoyCol33() {
        return moyCol33;
    }

    /**
     * Setter method for moyCol33.
     *
     * @param aMoyCol33 the new value for moyCol33
     */
    public void setMoyCol33(BigDecimal aMoyCol33) {
        moyCol33 = aMoyCol33;
    }

    /**
     * Access method for etatCol33.
     *
     * @return the current value of etatCol33
     */
    public String getEtatCol33() {
        return etatCol33;
    }

    /**
     * Setter method for etatCol33.
     *
     * @param aEtatCol33 the new value for etatCol33
     */
    public void setEtatCol33(String aEtatCol33) {
        etatCol33 = aEtatCol33;
    }

    /**
     * Access method for typeCol34.
     *
     * @return the current value of typeCol34
     */
    public String getTypeCol34() {
        return typeCol34;
    }

    /**
     * Setter method for typeCol34.
     *
     * @param aTypeCol34 the new value for typeCol34
     */
    public void setTypeCol34(String aTypeCol34) {
        typeCol34 = aTypeCol34;
    }

    /**
     * Access method for idCol34.
     *
     * @return the current value of idCol34
     */
    public String getIdCol34() {
        return idCol34;
    }

    /**
     * Setter method for idCol34.
     *
     * @param aIdCol34 the new value for idCol34
     */
    public void setIdCol34(String aIdCol34) {
        idCol34 = aIdCol34;
    }

    /**
     * Access method for nomCol34.
     *
     * @return the current value of nomCol34
     */
    public String getNomCol34() {
        return nomCol34;
    }

    /**
     * Setter method for nomCol34.
     *
     * @param aNomCol34 the new value for nomCol34
     */
    public void setNomCol34(String aNomCol34) {
        nomCol34 = aNomCol34;
    }

    /**
     * Access method for moyCol34.
     *
     * @return the current value of moyCol34
     */
    public BigDecimal getMoyCol34() {
        return moyCol34;
    }

    /**
     * Setter method for moyCol34.
     *
     * @param aMoyCol34 the new value for moyCol34
     */
    public void setMoyCol34(BigDecimal aMoyCol34) {
        moyCol34 = aMoyCol34;
    }

    /**
     * Access method for etatCol34.
     *
     * @return the current value of etatCol34
     */
    public String getEtatCol34() {
        return etatCol34;
    }

    /**
     * Setter method for etatCol34.
     *
     * @param aEtatCol34 the new value for etatCol34
     */
    public void setEtatCol34(String aEtatCol34) {
        etatCol34 = aEtatCol34;
    }

    /**
     * Access method for typeCol35.
     *
     * @return the current value of typeCol35
     */
    public String getTypeCol35() {
        return typeCol35;
    }

    /**
     * Setter method for typeCol35.
     *
     * @param aTypeCol35 the new value for typeCol35
     */
    public void setTypeCol35(String aTypeCol35) {
        typeCol35 = aTypeCol35;
    }

    /**
     * Access method for idCol35.
     *
     * @return the current value of idCol35
     */
    public String getIdCol35() {
        return idCol35;
    }

    /**
     * Setter method for idCol35.
     *
     * @param aIdCol35 the new value for idCol35
     */
    public void setIdCol35(String aIdCol35) {
        idCol35 = aIdCol35;
    }

    /**
     * Access method for nomCol35.
     *
     * @return the current value of nomCol35
     */
    public String getNomCol35() {
        return nomCol35;
    }

    /**
     * Setter method for nomCol35.
     *
     * @param aNomCol35 the new value for nomCol35
     */
    public void setNomCol35(String aNomCol35) {
        nomCol35 = aNomCol35;
    }

    /**
     * Access method for moyCol35.
     *
     * @return the current value of moyCol35
     */
    public BigDecimal getMoyCol35() {
        return moyCol35;
    }

    /**
     * Setter method for moyCol35.
     *
     * @param aMoyCol35 the new value for moyCol35
     */
    public void setMoyCol35(BigDecimal aMoyCol35) {
        moyCol35 = aMoyCol35;
    }

    /**
     * Access method for etatCol35.
     *
     * @return the current value of etatCol35
     */
    public String getEtatCol35() {
        return etatCol35;
    }

    /**
     * Setter method for etatCol35.
     *
     * @param aEtatCol35 the new value for etatCol35
     */
    public void setEtatCol35(String aEtatCol35) {
        etatCol35 = aEtatCol35;
    }

    /**
     * Access method for typeCol36.
     *
     * @return the current value of typeCol36
     */
    public String getTypeCol36() {
        return typeCol36;
    }

    /**
     * Setter method for typeCol36.
     *
     * @param aTypeCol36 the new value for typeCol36
     */
    public void setTypeCol36(String aTypeCol36) {
        typeCol36 = aTypeCol36;
    }

    /**
     * Access method for idCol36.
     *
     * @return the current value of idCol36
     */
    public String getIdCol36() {
        return idCol36;
    }

    /**
     * Setter method for idCol36.
     *
     * @param aIdCol36 the new value for idCol36
     */
    public void setIdCol36(String aIdCol36) {
        idCol36 = aIdCol36;
    }

    /**
     * Access method for nomCol36.
     *
     * @return the current value of nomCol36
     */
    public String getNomCol36() {
        return nomCol36;
    }

    /**
     * Setter method for nomCol36.
     *
     * @param aNomCol36 the new value for nomCol36
     */
    public void setNomCol36(String aNomCol36) {
        nomCol36 = aNomCol36;
    }

    /**
     * Access method for moyCol36.
     *
     * @return the current value of moyCol36
     */
    public BigDecimal getMoyCol36() {
        return moyCol36;
    }

    /**
     * Setter method for moyCol36.
     *
     * @param aMoyCol36 the new value for moyCol36
     */
    public void setMoyCol36(BigDecimal aMoyCol36) {
        moyCol36 = aMoyCol36;
    }

    /**
     * Access method for etatCol36.
     *
     * @return the current value of etatCol36
     */
    public String getEtatCol36() {
        return etatCol36;
    }

    /**
     * Setter method for etatCol36.
     *
     * @param aEtatCol36 the new value for etatCol36
     */
    public void setEtatCol36(String aEtatCol36) {
        etatCol36 = aEtatCol36;
    }

    /**
     * Access method for typeCol37.
     *
     * @return the current value of typeCol37
     */
    public String getTypeCol37() {
        return typeCol37;
    }

    /**
     * Setter method for typeCol37.
     *
     * @param aTypeCol37 the new value for typeCol37
     */
    public void setTypeCol37(String aTypeCol37) {
        typeCol37 = aTypeCol37;
    }

    /**
     * Access method for idCol37.
     *
     * @return the current value of idCol37
     */
    public String getIdCol37() {
        return idCol37;
    }

    /**
     * Setter method for idCol37.
     *
     * @param aIdCol37 the new value for idCol37
     */
    public void setIdCol37(String aIdCol37) {
        idCol37 = aIdCol37;
    }

    /**
     * Access method for nomCol37.
     *
     * @return the current value of nomCol37
     */
    public String getNomCol37() {
        return nomCol37;
    }

    /**
     * Setter method for nomCol37.
     *
     * @param aNomCol37 the new value for nomCol37
     */
    public void setNomCol37(String aNomCol37) {
        nomCol37 = aNomCol37;
    }

    /**
     * Access method for moyCol37.
     *
     * @return the current value of moyCol37
     */
    public BigDecimal getMoyCol37() {
        return moyCol37;
    }

    /**
     * Setter method for moyCol37.
     *
     * @param aMoyCol37 the new value for moyCol37
     */
    public void setMoyCol37(BigDecimal aMoyCol37) {
        moyCol37 = aMoyCol37;
    }

    /**
     * Access method for etatCol37.
     *
     * @return the current value of etatCol37
     */
    public String getEtatCol37() {
        return etatCol37;
    }

    /**
     * Setter method for etatCol37.
     *
     * @param aEtatCol37 the new value for etatCol37
     */
    public void setEtatCol37(String aEtatCol37) {
        etatCol37 = aEtatCol37;
    }

    /**
     * Access method for typeCol38.
     *
     * @return the current value of typeCol38
     */
    public String getTypeCol38() {
        return typeCol38;
    }

    /**
     * Setter method for typeCol38.
     *
     * @param aTypeCol38 the new value for typeCol38
     */
    public void setTypeCol38(String aTypeCol38) {
        typeCol38 = aTypeCol38;
    }

    /**
     * Access method for idCol38.
     *
     * @return the current value of idCol38
     */
    public String getIdCol38() {
        return idCol38;
    }

    /**
     * Setter method for idCol38.
     *
     * @param aIdCol38 the new value for idCol38
     */
    public void setIdCol38(String aIdCol38) {
        idCol38 = aIdCol38;
    }

    /**
     * Access method for nomCol38.
     *
     * @return the current value of nomCol38
     */
    public String getNomCol38() {
        return nomCol38;
    }

    /**
     * Setter method for nomCol38.
     *
     * @param aNomCol38 the new value for nomCol38
     */
    public void setNomCol38(String aNomCol38) {
        nomCol38 = aNomCol38;
    }

    /**
     * Access method for moyCol38.
     *
     * @return the current value of moyCol38
     */
    public BigDecimal getMoyCol38() {
        return moyCol38;
    }

    /**
     * Setter method for moyCol38.
     *
     * @param aMoyCol38 the new value for moyCol38
     */
    public void setMoyCol38(BigDecimal aMoyCol38) {
        moyCol38 = aMoyCol38;
    }

    /**
     * Access method for etatCol38.
     *
     * @return the current value of etatCol38
     */
    public String getEtatCol38() {
        return etatCol38;
    }

    /**
     * Setter method for etatCol38.
     *
     * @param aEtatCol38 the new value for etatCol38
     */
    public void setEtatCol38(String aEtatCol38) {
        etatCol38 = aEtatCol38;
    }

    /**
     * Access method for typeCol39.
     *
     * @return the current value of typeCol39
     */
    public String getTypeCol39() {
        return typeCol39;
    }

    /**
     * Setter method for typeCol39.
     *
     * @param aTypeCol39 the new value for typeCol39
     */
    public void setTypeCol39(String aTypeCol39) {
        typeCol39 = aTypeCol39;
    }

    /**
     * Access method for idCol39.
     *
     * @return the current value of idCol39
     */
    public String getIdCol39() {
        return idCol39;
    }

    /**
     * Setter method for idCol39.
     *
     * @param aIdCol39 the new value for idCol39
     */
    public void setIdCol39(String aIdCol39) {
        idCol39 = aIdCol39;
    }

    /**
     * Access method for nomCol39.
     *
     * @return the current value of nomCol39
     */
    public String getNomCol39() {
        return nomCol39;
    }

    /**
     * Setter method for nomCol39.
     *
     * @param aNomCol39 the new value for nomCol39
     */
    public void setNomCol39(String aNomCol39) {
        nomCol39 = aNomCol39;
    }

    /**
     * Access method for moyCol39.
     *
     * @return the current value of moyCol39
     */
    public BigDecimal getMoyCol39() {
        return moyCol39;
    }

    /**
     * Setter method for moyCol39.
     *
     * @param aMoyCol39 the new value for moyCol39
     */
    public void setMoyCol39(BigDecimal aMoyCol39) {
        moyCol39 = aMoyCol39;
    }

    /**
     * Access method for etatCol39.
     *
     * @return the current value of etatCol39
     */
    public String getEtatCol39() {
        return etatCol39;
    }

    /**
     * Setter method for etatCol39.
     *
     * @param aEtatCol39 the new value for etatCol39
     */
    public void setEtatCol39(String aEtatCol39) {
        etatCol39 = aEtatCol39;
    }

    /**
     * Access method for typeCol40.
     *
     * @return the current value of typeCol40
     */
    public String getTypeCol40() {
        return typeCol40;
    }

    /**
     * Setter method for typeCol40.
     *
     * @param aTypeCol40 the new value for typeCol40
     */
    public void setTypeCol40(String aTypeCol40) {
        typeCol40 = aTypeCol40;
    }

    /**
     * Access method for idCol40.
     *
     * @return the current value of idCol40
     */
    public String getIdCol40() {
        return idCol40;
    }

    /**
     * Setter method for idCol40.
     *
     * @param aIdCol40 the new value for idCol40
     */
    public void setIdCol40(String aIdCol40) {
        idCol40 = aIdCol40;
    }

    /**
     * Access method for nomCol40.
     *
     * @return the current value of nomCol40
     */
    public String getNomCol40() {
        return nomCol40;
    }

    /**
     * Setter method for nomCol40.
     *
     * @param aNomCol40 the new value for nomCol40
     */
    public void setNomCol40(String aNomCol40) {
        nomCol40 = aNomCol40;
    }

    /**
     * Access method for moyCol40.
     *
     * @return the current value of moyCol40
     */
    public BigDecimal getMoyCol40() {
        return moyCol40;
    }

    /**
     * Setter method for moyCol40.
     *
     * @param aMoyCol40 the new value for moyCol40
     */
    public void setMoyCol40(BigDecimal aMoyCol40) {
        moyCol40 = aMoyCol40;
    }

    /**
     * Access method for nbHeureCol1.
     *
     * @return the current value of nbHeureCol1
     */
    public BigDecimal getNbHeureCol1() {
        return nbHeureCol1;
    }

    /**
     * Setter method for nbHeureCol1.
     *
     * @param aNbHeureCol1 the new value for nbHeureCol1
     */
    public void setNbHeureCol1(BigDecimal aNbHeureCol1) {
        nbHeureCol1 = aNbHeureCol1;
    }

    /**
     * Access method for nbHeureCol2.
     *
     * @return the current value of nbHeureCol2
     */
    public BigDecimal getNbHeureCol2() {
        return nbHeureCol2;
    }

    /**
     * Setter method for nbHeureCol2.
     *
     * @param aNbHeureCol2 the new value for nbHeureCol2
     */
    public void setNbHeureCol2(BigDecimal aNbHeureCol2) {
        nbHeureCol2 = aNbHeureCol2;
    }

    /**
     * Access method for nbHeureCol3.
     *
     * @return the current value of nbHeureCol3
     */
    public BigDecimal getNbHeureCol3() {
        return nbHeureCol3;
    }

    /**
     * Setter method for nbHeureCol3.
     *
     * @param aNbHeureCol3 the new value for nbHeureCol3
     */
    public void setNbHeureCol3(BigDecimal aNbHeureCol3) {
        nbHeureCol3 = aNbHeureCol3;
    }

    /**
     * Access method for nbHeureCol4.
     *
     * @return the current value of nbHeureCol4
     */
    public BigDecimal getNbHeureCol4() {
        return nbHeureCol4;
    }

    /**
     * Setter method for nbHeureCol4.
     *
     * @param aNbHeureCol4 the new value for nbHeureCol4
     */
    public void setNbHeureCol4(BigDecimal aNbHeureCol4) {
        nbHeureCol4 = aNbHeureCol4;
    }

    /**
     * Access method for nbHeureCol5.
     *
     * @return the current value of nbHeureCol5
     */
    public BigDecimal getNbHeureCol5() {
        return nbHeureCol5;
    }

    /**
     * Setter method for nbHeureCol5.
     *
     * @param aNbHeureCol5 the new value for nbHeureCol5
     */
    public void setNbHeureCol5(BigDecimal aNbHeureCol5) {
        nbHeureCol5 = aNbHeureCol5;
    }

    /**
     * Access method for nbHeureCol6.
     *
     * @return the current value of nbHeureCol6
     */
    public BigDecimal getNbHeureCol6() {
        return nbHeureCol6;
    }

    /**
     * Setter method for nbHeureCol6.
     *
     * @param aNbHeureCol6 the new value for nbHeureCol6
     */
    public void setNbHeureCol6(BigDecimal aNbHeureCol6) {
        nbHeureCol6 = aNbHeureCol6;
    }

    /**
     * Access method for nbHeureCol7.
     *
     * @return the current value of nbHeureCol7
     */
    public BigDecimal getNbHeureCol7() {
        return nbHeureCol7;
    }

    /**
     * Setter method for nbHeureCol7.
     *
     * @param aNbHeureCol7 the new value for nbHeureCol7
     */
    public void setNbHeureCol7(BigDecimal aNbHeureCol7) {
        nbHeureCol7 = aNbHeureCol7;
    }

    /**
     * Access method for nbHeureCol8.
     *
     * @return the current value of nbHeureCol8
     */
    public BigDecimal getNbHeureCol8() {
        return nbHeureCol8;
    }

    /**
     * Setter method for nbHeureCol8.
     *
     * @param aNbHeureCol8 the new value for nbHeureCol8
     */
    public void setNbHeureCol8(BigDecimal aNbHeureCol8) {
        nbHeureCol8 = aNbHeureCol8;
    }

    /**
     * Access method for nbHeureCol9.
     *
     * @return the current value of nbHeureCol9
     */
    public BigDecimal getNbHeureCol9() {
        return nbHeureCol9;
    }

    /**
     * Setter method for nbHeureCol9.
     *
     * @param aNbHeureCol9 the new value for nbHeureCol9
     */
    public void setNbHeureCol9(BigDecimal aNbHeureCol9) {
        nbHeureCol9 = aNbHeureCol9;
    }

    /**
     * Access method for nbHeureCol10.
     *
     * @return the current value of nbHeureCol10
     */
    public BigDecimal getNbHeureCol10() {
        return nbHeureCol10;
    }

    /**
     * Setter method for nbHeureCol10.
     *
     * @param aNbHeureCol10 the new value for nbHeureCol10
     */
    public void setNbHeureCol10(BigDecimal aNbHeureCol10) {
        nbHeureCol10 = aNbHeureCol10;
    }

    /**
     * Access method for nbHeureCol11.
     *
     * @return the current value of nbHeureCol11
     */
    public BigDecimal getNbHeureCol11() {
        return nbHeureCol11;
    }

    /**
     * Setter method for nbHeureCol11.
     *
     * @param aNbHeureCol11 the new value for nbHeureCol11
     */
    public void setNbHeureCol11(BigDecimal aNbHeureCol11) {
        nbHeureCol11 = aNbHeureCol11;
    }

    /**
     * Access method for nbHeureCol12.
     *
     * @return the current value of nbHeureCol12
     */
    public BigDecimal getNbHeureCol12() {
        return nbHeureCol12;
    }

    /**
     * Setter method for nbHeureCol12.
     *
     * @param aNbHeureCol12 the new value for nbHeureCol12
     */
    public void setNbHeureCol12(BigDecimal aNbHeureCol12) {
        nbHeureCol12 = aNbHeureCol12;
    }

    /**
     * Access method for nbHeureCol13.
     *
     * @return the current value of nbHeureCol13
     */
    public BigDecimal getNbHeureCol13() {
        return nbHeureCol13;
    }

    /**
     * Setter method for nbHeureCol13.
     *
     * @param aNbHeureCol13 the new value for nbHeureCol13
     */
    public void setNbHeureCol13(BigDecimal aNbHeureCol13) {
        nbHeureCol13 = aNbHeureCol13;
    }

    /**
     * Access method for nbHeureCol14.
     *
     * @return the current value of nbHeureCol14
     */
    public BigDecimal getNbHeureCol14() {
        return nbHeureCol14;
    }

    /**
     * Setter method for nbHeureCol14.
     *
     * @param aNbHeureCol14 the new value for nbHeureCol14
     */
    public void setNbHeureCol14(BigDecimal aNbHeureCol14) {
        nbHeureCol14 = aNbHeureCol14;
    }

    /**
     * Access method for nbHeureCol15.
     *
     * @return the current value of nbHeureCol15
     */
    public BigDecimal getNbHeureCol15() {
        return nbHeureCol15;
    }

    /**
     * Setter method for nbHeureCol15.
     *
     * @param aNbHeureCol15 the new value for nbHeureCol15
     */
    public void setNbHeureCol15(BigDecimal aNbHeureCol15) {
        nbHeureCol15 = aNbHeureCol15;
    }

    /**
     * Access method for nbHeureCol16.
     *
     * @return the current value of nbHeureCol16
     */
    public BigDecimal getNbHeureCol16() {
        return nbHeureCol16;
    }

    /**
     * Setter method for nbHeureCol16.
     *
     * @param aNbHeureCol16 the new value for nbHeureCol16
     */
    public void setNbHeureCol16(BigDecimal aNbHeureCol16) {
        nbHeureCol16 = aNbHeureCol16;
    }

    /**
     * Access method for nbHeureCol17.
     *
     * @return the current value of nbHeureCol17
     */
    public BigDecimal getNbHeureCol17() {
        return nbHeureCol17;
    }

    /**
     * Setter method for nbHeureCol17.
     *
     * @param aNbHeureCol17 the new value for nbHeureCol17
     */
    public void setNbHeureCol17(BigDecimal aNbHeureCol17) {
        nbHeureCol17 = aNbHeureCol17;
    }

    /**
     * Access method for nbHeureCol18.
     *
     * @return the current value of nbHeureCol18
     */
    public BigDecimal getNbHeureCol18() {
        return nbHeureCol18;
    }

    /**
     * Setter method for nbHeureCol18.
     *
     * @param aNbHeureCol18 the new value for nbHeureCol18
     */
    public void setNbHeureCol18(BigDecimal aNbHeureCol18) {
        nbHeureCol18 = aNbHeureCol18;
    }

    /**
     * Access method for nbHeureCol19.
     *
     * @return the current value of nbHeureCol19
     */
    public BigDecimal getNbHeureCol19() {
        return nbHeureCol19;
    }

    /**
     * Setter method for nbHeureCol19.
     *
     * @param aNbHeureCol19 the new value for nbHeureCol19
     */
    public void setNbHeureCol19(BigDecimal aNbHeureCol19) {
        nbHeureCol19 = aNbHeureCol19;
    }

    /**
     * Access method for nbHeureCol20.
     *
     * @return the current value of nbHeureCol20
     */
    public BigDecimal getNbHeureCol20() {
        return nbHeureCol20;
    }

    /**
     * Setter method for nbHeureCol20.
     *
     * @param aNbHeureCol20 the new value for nbHeureCol20
     */
    public void setNbHeureCol20(BigDecimal aNbHeureCol20) {
        nbHeureCol20 = aNbHeureCol20;
    }

    /**
     * Access method for nbHeureCol21.
     *
     * @return the current value of nbHeureCol21
     */
    public BigDecimal getNbHeureCol21() {
        return nbHeureCol21;
    }

    /**
     * Setter method for nbHeureCol21.
     *
     * @param aNbHeureCol21 the new value for nbHeureCol21
     */
    public void setNbHeureCol21(BigDecimal aNbHeureCol21) {
        nbHeureCol21 = aNbHeureCol21;
    }

    /**
     * Access method for nbHeureCol22.
     *
     * @return the current value of nbHeureCol22
     */
    public BigDecimal getNbHeureCol22() {
        return nbHeureCol22;
    }

    /**
     * Setter method for nbHeureCol22.
     *
     * @param aNbHeureCol22 the new value for nbHeureCol22
     */
    public void setNbHeureCol22(BigDecimal aNbHeureCol22) {
        nbHeureCol22 = aNbHeureCol22;
    }

    /**
     * Access method for nbHeureCol23.
     *
     * @return the current value of nbHeureCol23
     */
    public BigDecimal getNbHeureCol23() {
        return nbHeureCol23;
    }

    /**
     * Setter method for nbHeureCol23.
     *
     * @param aNbHeureCol23 the new value for nbHeureCol23
     */
    public void setNbHeureCol23(BigDecimal aNbHeureCol23) {
        nbHeureCol23 = aNbHeureCol23;
    }

    /**
     * Access method for nbHeureCol24.
     *
     * @return the current value of nbHeureCol24
     */
    public BigDecimal getNbHeureCol24() {
        return nbHeureCol24;
    }

    /**
     * Setter method for nbHeureCol24.
     *
     * @param aNbHeureCol24 the new value for nbHeureCol24
     */
    public void setNbHeureCol24(BigDecimal aNbHeureCol24) {
        nbHeureCol24 = aNbHeureCol24;
    }

    /**
     * Access method for nbHeureCol25.
     *
     * @return the current value of nbHeureCol25
     */
    public BigDecimal getNbHeureCol25() {
        return nbHeureCol25;
    }

    /**
     * Setter method for nbHeureCol25.
     *
     * @param aNbHeureCol25 the new value for nbHeureCol25
     */
    public void setNbHeureCol25(BigDecimal aNbHeureCol25) {
        nbHeureCol25 = aNbHeureCol25;
    }

    /**
     * Access method for nbHeureCol26.
     *
     * @return the current value of nbHeureCol26
     */
    public BigDecimal getNbHeureCol26() {
        return nbHeureCol26;
    }

    /**
     * Setter method for nbHeureCol26.
     *
     * @param aNbHeureCol26 the new value for nbHeureCol26
     */
    public void setNbHeureCol26(BigDecimal aNbHeureCol26) {
        nbHeureCol26 = aNbHeureCol26;
    }

    /**
     * Access method for nbHeureCol27.
     *
     * @return the current value of nbHeureCol27
     */
    public BigDecimal getNbHeureCol27() {
        return nbHeureCol27;
    }

    /**
     * Setter method for nbHeureCol27.
     *
     * @param aNbHeureCol27 the new value for nbHeureCol27
     */
    public void setNbHeureCol27(BigDecimal aNbHeureCol27) {
        nbHeureCol27 = aNbHeureCol27;
    }

    /**
     * Access method for nbHeureCol28.
     *
     * @return the current value of nbHeureCol28
     */
    public BigDecimal getNbHeureCol28() {
        return nbHeureCol28;
    }

    /**
     * Setter method for nbHeureCol28.
     *
     * @param aNbHeureCol28 the new value for nbHeureCol28
     */
    public void setNbHeureCol28(BigDecimal aNbHeureCol28) {
        nbHeureCol28 = aNbHeureCol28;
    }

    /**
     * Access method for nbHeureCol29.
     *
     * @return the current value of nbHeureCol29
     */
    public BigDecimal getNbHeureCol29() {
        return nbHeureCol29;
    }

    /**
     * Setter method for nbHeureCol29.
     *
     * @param aNbHeureCol29 the new value for nbHeureCol29
     */
    public void setNbHeureCol29(BigDecimal aNbHeureCol29) {
        nbHeureCol29 = aNbHeureCol29;
    }

    /**
     * Access method for nbHeureCol30.
     *
     * @return the current value of nbHeureCol30
     */
    public BigDecimal getNbHeureCol30() {
        return nbHeureCol30;
    }

    /**
     * Setter method for nbHeureCol30.
     *
     * @param aNbHeureCol30 the new value for nbHeureCol30
     */
    public void setNbHeureCol30(BigDecimal aNbHeureCol30) {
        nbHeureCol30 = aNbHeureCol30;
    }

    /**
     * Access method for nbHeureCol31.
     *
     * @return the current value of nbHeureCol31
     */
    public BigDecimal getNbHeureCol31() {
        return nbHeureCol31;
    }

    /**
     * Setter method for nbHeureCol31.
     *
     * @param aNbHeureCol31 the new value for nbHeureCol31
     */
    public void setNbHeureCol31(BigDecimal aNbHeureCol31) {
        nbHeureCol31 = aNbHeureCol31;
    }

    /**
     * Access method for nbHeureCol32.
     *
     * @return the current value of nbHeureCol32
     */
    public BigDecimal getNbHeureCol32() {
        return nbHeureCol32;
    }

    /**
     * Setter method for nbHeureCol32.
     *
     * @param aNbHeureCol32 the new value for nbHeureCol32
     */
    public void setNbHeureCol32(BigDecimal aNbHeureCol32) {
        nbHeureCol32 = aNbHeureCol32;
    }

    /**
     * Access method for nbHeureCol33.
     *
     * @return the current value of nbHeureCol33
     */
    public BigDecimal getNbHeureCol33() {
        return nbHeureCol33;
    }

    /**
     * Setter method for nbHeureCol33.
     *
     * @param aNbHeureCol33 the new value for nbHeureCol33
     */
    public void setNbHeureCol33(BigDecimal aNbHeureCol33) {
        nbHeureCol33 = aNbHeureCol33;
    }

    /**
     * Access method for nbHeureCol34.
     *
     * @return the current value of nbHeureCol34
     */
    public BigDecimal getNbHeureCol34() {
        return nbHeureCol34;
    }

    /**
     * Setter method for nbHeureCol34.
     *
     * @param aNbHeureCol34 the new value for nbHeureCol34
     */
    public void setNbHeureCol34(BigDecimal aNbHeureCol34) {
        nbHeureCol34 = aNbHeureCol34;
    }

    /**
     * Access method for nbHeureCol35.
     *
     * @return the current value of nbHeureCol35
     */
    public BigDecimal getNbHeureCol35() {
        return nbHeureCol35;
    }

    /**
     * Setter method for nbHeureCol35.
     *
     * @param aNbHeureCol35 the new value for nbHeureCol35
     */
    public void setNbHeureCol35(BigDecimal aNbHeureCol35) {
        nbHeureCol35 = aNbHeureCol35;
    }

    /**
     * Access method for nbHeureCol36.
     *
     * @return the current value of nbHeureCol36
     */
    public BigDecimal getNbHeureCol36() {
        return nbHeureCol36;
    }

    /**
     * Setter method for nbHeureCol36.
     *
     * @param aNbHeureCol36 the new value for nbHeureCol36
     */
    public void setNbHeureCol36(BigDecimal aNbHeureCol36) {
        nbHeureCol36 = aNbHeureCol36;
    }

    /**
     * Access method for nbHeureCol37.
     *
     * @return the current value of nbHeureCol37
     */
    public BigDecimal getNbHeureCol37() {
        return nbHeureCol37;
    }

    /**
     * Setter method for nbHeureCol37.
     *
     * @param aNbHeureCol37 the new value for nbHeureCol37
     */
    public void setNbHeureCol37(BigDecimal aNbHeureCol37) {
        nbHeureCol37 = aNbHeureCol37;
    }

    /**
     * Access method for nbHeureCol38.
     *
     * @return the current value of nbHeureCol38
     */
    public BigDecimal getNbHeureCol38() {
        return nbHeureCol38;
    }

    /**
     * Setter method for nbHeureCol38.
     *
     * @param aNbHeureCol38 the new value for nbHeureCol38
     */
    public void setNbHeureCol38(BigDecimal aNbHeureCol38) {
        nbHeureCol38 = aNbHeureCol38;
    }

    /**
     * Access method for nbHeureCol39.
     *
     * @return the current value of nbHeureCol39
     */
    public BigDecimal getNbHeureCol39() {
        return nbHeureCol39;
    }

    /**
     * Setter method for nbHeureCol39.
     *
     * @param aNbHeureCol39 the new value for nbHeureCol39
     */
    public void setNbHeureCol39(BigDecimal aNbHeureCol39) {
        nbHeureCol39 = aNbHeureCol39;
    }

    /**
     * Access method for nbHeureCol40.
     *
     * @return the current value of nbHeureCol40
     */
    public BigDecimal getNbHeureCol40() {
        return nbHeureCol40;
    }

    /**
     * Setter method for nbHeureCol40.
     *
     * @param aNbHeureCol40 the new value for nbHeureCol40
     */
    public void setNbHeureCol40(BigDecimal aNbHeureCol40) {
        nbHeureCol40 = aNbHeureCol40;
    }

    /**
     * Access method for coefCol1.
     *
     * @return the current value of coefCol1
     */
    public BigDecimal getCoefCol1() {
        return coefCol1;
    }

    /**
     * Setter method for coefCol1.
     *
     * @param aCoefCol1 the new value for coefCol1
     */
    public void setCoefCol1(BigDecimal aCoefCol1) {
        coefCol1 = aCoefCol1;
    }

    /**
     * Access method for coefCol2.
     *
     * @return the current value of coefCol2
     */
    public BigDecimal getCoefCol2() {
        return coefCol2;
    }

    /**
     * Setter method for coefCol2.
     *
     * @param aCoefCol2 the new value for coefCol2
     */
    public void setCoefCol2(BigDecimal aCoefCol2) {
        coefCol2 = aCoefCol2;
    }

    /**
     * Access method for coefCol3.
     *
     * @return the current value of coefCol3
     */
    public BigDecimal getCoefCol3() {
        return coefCol3;
    }

    /**
     * Setter method for coefCol3.
     *
     * @param aCoefCol3 the new value for coefCol3
     */
    public void setCoefCol3(BigDecimal aCoefCol3) {
        coefCol3 = aCoefCol3;
    }

    /**
     * Access method for coefCol4.
     *
     * @return the current value of coefCol4
     */
    public BigDecimal getCoefCol4() {
        return coefCol4;
    }

    /**
     * Setter method for coefCol4.
     *
     * @param aCoefCol4 the new value for coefCol4
     */
    public void setCoefCol4(BigDecimal aCoefCol4) {
        coefCol4 = aCoefCol4;
    }

    /**
     * Access method for coefCol5.
     *
     * @return the current value of coefCol5
     */
    public BigDecimal getCoefCol5() {
        return coefCol5;
    }

    /**
     * Setter method for coefCol5.
     *
     * @param aCoefCol5 the new value for coefCol5
     */
    public void setCoefCol5(BigDecimal aCoefCol5) {
        coefCol5 = aCoefCol5;
    }

    /**
     * Access method for coefCol6.
     *
     * @return the current value of coefCol6
     */
    public BigDecimal getCoefCol6() {
        return coefCol6;
    }

    /**
     * Setter method for coefCol6.
     *
     * @param aCoefCol6 the new value for coefCol6
     */
    public void setCoefCol6(BigDecimal aCoefCol6) {
        coefCol6 = aCoefCol6;
    }

    /**
     * Access method for coefCol7.
     *
     * @return the current value of coefCol7
     */
    public BigDecimal getCoefCol7() {
        return coefCol7;
    }

    /**
     * Setter method for coefCol7.
     *
     * @param aCoefCol7 the new value for coefCol7
     */
    public void setCoefCol7(BigDecimal aCoefCol7) {
        coefCol7 = aCoefCol7;
    }

    /**
     * Access method for coefCol8.
     *
     * @return the current value of coefCol8
     */
    public BigDecimal getCoefCol8() {
        return coefCol8;
    }

    /**
     * Setter method for coefCol8.
     *
     * @param aCoefCol8 the new value for coefCol8
     */
    public void setCoefCol8(BigDecimal aCoefCol8) {
        coefCol8 = aCoefCol8;
    }

    /**
     * Access method for coefCol9.
     *
     * @return the current value of coefCol9
     */
    public BigDecimal getCoefCol9() {
        return coefCol9;
    }

    /**
     * Setter method for coefCol9.
     *
     * @param aCoefCol9 the new value for coefCol9
     */
    public void setCoefCol9(BigDecimal aCoefCol9) {
        coefCol9 = aCoefCol9;
    }

    /**
     * Access method for coefCol10.
     *
     * @return the current value of coefCol10
     */
    public BigDecimal getCoefCol10() {
        return coefCol10;
    }

    /**
     * Setter method for coefCol10.
     *
     * @param aCoefCol10 the new value for coefCol10
     */
    public void setCoefCol10(BigDecimal aCoefCol10) {
        coefCol10 = aCoefCol10;
    }

    /**
     * Access method for coefCol11.
     *
     * @return the current value of coefCol11
     */
    public BigDecimal getCoefCol11() {
        return coefCol11;
    }

    /**
     * Setter method for coefCol11.
     *
     * @param aCoefCol11 the new value for coefCol11
     */
    public void setCoefCol11(BigDecimal aCoefCol11) {
        coefCol11 = aCoefCol11;
    }

    /**
     * Access method for coefCol12.
     *
     * @return the current value of coefCol12
     */
    public BigDecimal getCoefCol12() {
        return coefCol12;
    }

    /**
     * Setter method for coefCol12.
     *
     * @param aCoefCol12 the new value for coefCol12
     */
    public void setCoefCol12(BigDecimal aCoefCol12) {
        coefCol12 = aCoefCol12;
    }

    /**
     * Access method for coefCol13.
     *
     * @return the current value of coefCol13
     */
    public BigDecimal getCoefCol13() {
        return coefCol13;
    }

    /**
     * Setter method for coefCol13.
     *
     * @param aCoefCol13 the new value for coefCol13
     */
    public void setCoefCol13(BigDecimal aCoefCol13) {
        coefCol13 = aCoefCol13;
    }

    /**
     * Access method for coefCol14.
     *
     * @return the current value of coefCol14
     */
    public BigDecimal getCoefCol14() {
        return coefCol14;
    }

    /**
     * Setter method for coefCol14.
     *
     * @param aCoefCol14 the new value for coefCol14
     */
    public void setCoefCol14(BigDecimal aCoefCol14) {
        coefCol14 = aCoefCol14;
    }

    /**
     * Access method for coefCol15.
     *
     * @return the current value of coefCol15
     */
    public BigDecimal getCoefCol15() {
        return coefCol15;
    }

    /**
     * Setter method for coefCol15.
     *
     * @param aCoefCol15 the new value for coefCol15
     */
    public void setCoefCol15(BigDecimal aCoefCol15) {
        coefCol15 = aCoefCol15;
    }

    /**
     * Access method for coefCol16.
     *
     * @return the current value of coefCol16
     */
    public BigDecimal getCoefCol16() {
        return coefCol16;
    }

    /**
     * Setter method for coefCol16.
     *
     * @param aCoefCol16 the new value for coefCol16
     */
    public void setCoefCol16(BigDecimal aCoefCol16) {
        coefCol16 = aCoefCol16;
    }

    /**
     * Access method for coefCol17.
     *
     * @return the current value of coefCol17
     */
    public BigDecimal getCoefCol17() {
        return coefCol17;
    }

    /**
     * Setter method for coefCol17.
     *
     * @param aCoefCol17 the new value for coefCol17
     */
    public void setCoefCol17(BigDecimal aCoefCol17) {
        coefCol17 = aCoefCol17;
    }

    /**
     * Access method for coefCol18.
     *
     * @return the current value of coefCol18
     */
    public BigDecimal getCoefCol18() {
        return coefCol18;
    }

    /**
     * Setter method for coefCol18.
     *
     * @param aCoefCol18 the new value for coefCol18
     */
    public void setCoefCol18(BigDecimal aCoefCol18) {
        coefCol18 = aCoefCol18;
    }

    /**
     * Access method for coefCol19.
     *
     * @return the current value of coefCol19
     */
    public BigDecimal getCoefCol19() {
        return coefCol19;
    }

    /**
     * Setter method for coefCol19.
     *
     * @param aCoefCol19 the new value for coefCol19
     */
    public void setCoefCol19(BigDecimal aCoefCol19) {
        coefCol19 = aCoefCol19;
    }

    /**
     * Access method for coefCol20.
     *
     * @return the current value of coefCol20
     */
    public BigDecimal getCoefCol20() {
        return coefCol20;
    }

    /**
     * Setter method for coefCol20.
     *
     * @param aCoefCol20 the new value for coefCol20
     */
    public void setCoefCol20(BigDecimal aCoefCol20) {
        coefCol20 = aCoefCol20;
    }

    /**
     * Access method for coefCol21.
     *
     * @return the current value of coefCol21
     */
    public BigDecimal getCoefCol21() {
        return coefCol21;
    }

    /**
     * Setter method for coefCol21.
     *
     * @param aCoefCol21 the new value for coefCol21
     */
    public void setCoefCol21(BigDecimal aCoefCol21) {
        coefCol21 = aCoefCol21;
    }

    /**
     * Access method for coefCol22.
     *
     * @return the current value of coefCol22
     */
    public BigDecimal getCoefCol22() {
        return coefCol22;
    }

    /**
     * Setter method for coefCol22.
     *
     * @param aCoefCol22 the new value for coefCol22
     */
    public void setCoefCol22(BigDecimal aCoefCol22) {
        coefCol22 = aCoefCol22;
    }

    /**
     * Access method for coefCol23.
     *
     * @return the current value of coefCol23
     */
    public BigDecimal getCoefCol23() {
        return coefCol23;
    }

    /**
     * Setter method for coefCol23.
     *
     * @param aCoefCol23 the new value for coefCol23
     */
    public void setCoefCol23(BigDecimal aCoefCol23) {
        coefCol23 = aCoefCol23;
    }

    /**
     * Access method for coefCol24.
     *
     * @return the current value of coefCol24
     */
    public BigDecimal getCoefCol24() {
        return coefCol24;
    }

    /**
     * Setter method for coefCol24.
     *
     * @param aCoefCol24 the new value for coefCol24
     */
    public void setCoefCol24(BigDecimal aCoefCol24) {
        coefCol24 = aCoefCol24;
    }

    /**
     * Access method for coefCol25.
     *
     * @return the current value of coefCol25
     */
    public BigDecimal getCoefCol25() {
        return coefCol25;
    }

    /**
     * Setter method for coefCol25.
     *
     * @param aCoefCol25 the new value for coefCol25
     */
    public void setCoefCol25(BigDecimal aCoefCol25) {
        coefCol25 = aCoefCol25;
    }

    /**
     * Access method for coefCol26.
     *
     * @return the current value of coefCol26
     */
    public BigDecimal getCoefCol26() {
        return coefCol26;
    }

    /**
     * Setter method for coefCol26.
     *
     * @param aCoefCol26 the new value for coefCol26
     */
    public void setCoefCol26(BigDecimal aCoefCol26) {
        coefCol26 = aCoefCol26;
    }

    /**
     * Access method for coefCol27.
     *
     * @return the current value of coefCol27
     */
    public BigDecimal getCoefCol27() {
        return coefCol27;
    }

    /**
     * Setter method for coefCol27.
     *
     * @param aCoefCol27 the new value for coefCol27
     */
    public void setCoefCol27(BigDecimal aCoefCol27) {
        coefCol27 = aCoefCol27;
    }

    /**
     * Access method for coefCol28.
     *
     * @return the current value of coefCol28
     */
    public BigDecimal getCoefCol28() {
        return coefCol28;
    }

    /**
     * Setter method for coefCol28.
     *
     * @param aCoefCol28 the new value for coefCol28
     */
    public void setCoefCol28(BigDecimal aCoefCol28) {
        coefCol28 = aCoefCol28;
    }

    /**
     * Access method for coefCol29.
     *
     * @return the current value of coefCol29
     */
    public BigDecimal getCoefCol29() {
        return coefCol29;
    }

    /**
     * Setter method for coefCol29.
     *
     * @param aCoefCol29 the new value for coefCol29
     */
    public void setCoefCol29(BigDecimal aCoefCol29) {
        coefCol29 = aCoefCol29;
    }

    /**
     * Access method for coefCol30.
     *
     * @return the current value of coefCol30
     */
    public BigDecimal getCoefCol30() {
        return coefCol30;
    }

    /**
     * Setter method for coefCol30.
     *
     * @param aCoefCol30 the new value for coefCol30
     */
    public void setCoefCol30(BigDecimal aCoefCol30) {
        coefCol30 = aCoefCol30;
    }

    /**
     * Access method for coefCol31.
     *
     * @return the current value of coefCol31
     */
    public BigDecimal getCoefCol31() {
        return coefCol31;
    }

    /**
     * Setter method for coefCol31.
     *
     * @param aCoefCol31 the new value for coefCol31
     */
    public void setCoefCol31(BigDecimal aCoefCol31) {
        coefCol31 = aCoefCol31;
    }

    /**
     * Access method for coefCol32.
     *
     * @return the current value of coefCol32
     */
    public BigDecimal getCoefCol32() {
        return coefCol32;
    }

    /**
     * Setter method for coefCol32.
     *
     * @param aCoefCol32 the new value for coefCol32
     */
    public void setCoefCol32(BigDecimal aCoefCol32) {
        coefCol32 = aCoefCol32;
    }

    /**
     * Access method for coefCol33.
     *
     * @return the current value of coefCol33
     */
    public BigDecimal getCoefCol33() {
        return coefCol33;
    }

    /**
     * Setter method for coefCol33.
     *
     * @param aCoefCol33 the new value for coefCol33
     */
    public void setCoefCol33(BigDecimal aCoefCol33) {
        coefCol33 = aCoefCol33;
    }

    /**
     * Access method for coefCol34.
     *
     * @return the current value of coefCol34
     */
    public BigDecimal getCoefCol34() {
        return coefCol34;
    }

    /**
     * Setter method for coefCol34.
     *
     * @param aCoefCol34 the new value for coefCol34
     */
    public void setCoefCol34(BigDecimal aCoefCol34) {
        coefCol34 = aCoefCol34;
    }

    /**
     * Access method for coefCol35.
     *
     * @return the current value of coefCol35
     */
    public BigDecimal getCoefCol35() {
        return coefCol35;
    }

    /**
     * Setter method for coefCol35.
     *
     * @param aCoefCol35 the new value for coefCol35
     */
    public void setCoefCol35(BigDecimal aCoefCol35) {
        coefCol35 = aCoefCol35;
    }

    /**
     * Access method for coefCol36.
     *
     * @return the current value of coefCol36
     */
    public BigDecimal getCoefCol36() {
        return coefCol36;
    }

    /**
     * Setter method for coefCol36.
     *
     * @param aCoefCol36 the new value for coefCol36
     */
    public void setCoefCol36(BigDecimal aCoefCol36) {
        coefCol36 = aCoefCol36;
    }

    /**
     * Access method for coefCol37.
     *
     * @return the current value of coefCol37
     */
    public BigDecimal getCoefCol37() {
        return coefCol37;
    }

    /**
     * Setter method for coefCol37.
     *
     * @param aCoefCol37 the new value for coefCol37
     */
    public void setCoefCol37(BigDecimal aCoefCol37) {
        coefCol37 = aCoefCol37;
    }

    /**
     * Access method for coefCol38.
     *
     * @return the current value of coefCol38
     */
    public BigDecimal getCoefCol38() {
        return coefCol38;
    }

    /**
     * Setter method for coefCol38.
     *
     * @param aCoefCol38 the new value for coefCol38
     */
    public void setCoefCol38(BigDecimal aCoefCol38) {
        coefCol38 = aCoefCol38;
    }

    /**
     * Access method for coefCol39.
     *
     * @return the current value of coefCol39
     */
    public BigDecimal getCoefCol39() {
        return coefCol39;
    }

    /**
     * Setter method for coefCol39.
     *
     * @param aCoefCol39 the new value for coefCol39
     */
    public void setCoefCol39(BigDecimal aCoefCol39) {
        coefCol39 = aCoefCol39;
    }

    /**
     * Access method for coefCol40.
     *
     * @return the current value of coefCol40
     */
    public BigDecimal getCoefCol40() {
        return coefCol40;
    }

    /**
     * Setter method for coefCol40.
     *
     * @param aCoefCol40 the new value for coefCol40
     */
    public void setCoefCol40(BigDecimal aCoefCol40) {
        coefCol40 = aCoefCol40;
    }

    /**
     * Access method for numpromotioncs.
     *
     * @return the current value of numpromotioncs
     */
    public BigDecimal getNumpromotioncs() {
        return numpromotioncs;
    }

    /**
     * Setter method for numpromotioncs.
     *
     * @param aNumpromotioncs the new value for numpromotioncs
     */
    public void setNumpromotioncs(BigDecimal aNumpromotioncs) {
        numpromotioncs = aNumpromotioncs;
    }

    /**
     * Access method for apCs.
     *
     * @return the current value of apCs
     */
    public BigDecimal getApCs() {
        return apCs;
    }

    /**
     * Setter method for apCs.
     *
     * @param aApCs the new value for apCs
     */
    public void setApCs(BigDecimal aApCs) {
        apCs = aApCs;
    }

    /**
     * Access method for typeCol41.
     *
     * @return the current value of typeCol41
     */
    public String getTypeCol41() {
        return typeCol41;
    }

    /**
     * Setter method for typeCol41.
     *
     * @param aTypeCol41 the new value for typeCol41
     */
    public void setTypeCol41(String aTypeCol41) {
        typeCol41 = aTypeCol41;
    }

    /**
     * Access method for idCol41.
     *
     * @return the current value of idCol41
     */
    public String getIdCol41() {
        return idCol41;
    }

    /**
     * Setter method for idCol41.
     *
     * @param aIdCol41 the new value for idCol41
     */
    public void setIdCol41(String aIdCol41) {
        idCol41 = aIdCol41;
    }

    /**
     * Access method for nomCol41.
     *
     * @return the current value of nomCol41
     */
    public String getNomCol41() {
        return nomCol41;
    }

    /**
     * Setter method for nomCol41.
     *
     * @param aNomCol41 the new value for nomCol41
     */
    public void setNomCol41(String aNomCol41) {
        nomCol41 = aNomCol41;
    }

    /**
     * Access method for moyCol41.
     *
     * @return the current value of moyCol41
     */
    public BigDecimal getMoyCol41() {
        return moyCol41;
    }

    /**
     * Setter method for moyCol41.
     *
     * @param aMoyCol41 the new value for moyCol41
     */
    public void setMoyCol41(BigDecimal aMoyCol41) {
        moyCol41 = aMoyCol41;
    }

    /**
     * Access method for etatCol41.
     *
     * @return the current value of etatCol41
     */
    public String getEtatCol41() {
        return etatCol41;
    }

    /**
     * Setter method for etatCol41.
     *
     * @param aEtatCol41 the new value for etatCol41
     */
    public void setEtatCol41(String aEtatCol41) {
        etatCol41 = aEtatCol41;
    }

    /**
     * Access method for typeCol42.
     *
     * @return the current value of typeCol42
     */
    public String getTypeCol42() {
        return typeCol42;
    }

    /**
     * Setter method for typeCol42.
     *
     * @param aTypeCol42 the new value for typeCol42
     */
    public void setTypeCol42(String aTypeCol42) {
        typeCol42 = aTypeCol42;
    }

    /**
     * Access method for idCol42.
     *
     * @return the current value of idCol42
     */
    public String getIdCol42() {
        return idCol42;
    }

    /**
     * Setter method for idCol42.
     *
     * @param aIdCol42 the new value for idCol42
     */
    public void setIdCol42(String aIdCol42) {
        idCol42 = aIdCol42;
    }

    /**
     * Access method for nomCol42.
     *
     * @return the current value of nomCol42
     */
    public String getNomCol42() {
        return nomCol42;
    }

    /**
     * Setter method for nomCol42.
     *
     * @param aNomCol42 the new value for nomCol42
     */
    public void setNomCol42(String aNomCol42) {
        nomCol42 = aNomCol42;
    }

    /**
     * Access method for moyCol42.
     *
     * @return the current value of moyCol42
     */
    public BigDecimal getMoyCol42() {
        return moyCol42;
    }

    /**
     * Setter method for moyCol42.
     *
     * @param aMoyCol42 the new value for moyCol42
     */
    public void setMoyCol42(BigDecimal aMoyCol42) {
        moyCol42 = aMoyCol42;
    }

    /**
     * Access method for etatCol42.
     *
     * @return the current value of etatCol42
     */
    public String getEtatCol42() {
        return etatCol42;
    }

    /**
     * Setter method for etatCol42.
     *
     * @param aEtatCol42 the new value for etatCol42
     */
    public void setEtatCol42(String aEtatCol42) {
        etatCol42 = aEtatCol42;
    }

    /**
     * Access method for typeCol43.
     *
     * @return the current value of typeCol43
     */
    public String getTypeCol43() {
        return typeCol43;
    }

    /**
     * Setter method for typeCol43.
     *
     * @param aTypeCol43 the new value for typeCol43
     */
    public void setTypeCol43(String aTypeCol43) {
        typeCol43 = aTypeCol43;
    }

    /**
     * Access method for idCol43.
     *
     * @return the current value of idCol43
     */
    public String getIdCol43() {
        return idCol43;
    }

    /**
     * Setter method for idCol43.
     *
     * @param aIdCol43 the new value for idCol43
     */
    public void setIdCol43(String aIdCol43) {
        idCol43 = aIdCol43;
    }

    /**
     * Access method for nomCol43.
     *
     * @return the current value of nomCol43
     */
    public String getNomCol43() {
        return nomCol43;
    }

    /**
     * Setter method for nomCol43.
     *
     * @param aNomCol43 the new value for nomCol43
     */
    public void setNomCol43(String aNomCol43) {
        nomCol43 = aNomCol43;
    }

    /**
     * Access method for moyCol43.
     *
     * @return the current value of moyCol43
     */
    public BigDecimal getMoyCol43() {
        return moyCol43;
    }

    /**
     * Setter method for moyCol43.
     *
     * @param aMoyCol43 the new value for moyCol43
     */
    public void setMoyCol43(BigDecimal aMoyCol43) {
        moyCol43 = aMoyCol43;
    }

    /**
     * Access method for etatCol43.
     *
     * @return the current value of etatCol43
     */
    public String getEtatCol43() {
        return etatCol43;
    }

    /**
     * Setter method for etatCol43.
     *
     * @param aEtatCol43 the new value for etatCol43
     */
    public void setEtatCol43(String aEtatCol43) {
        etatCol43 = aEtatCol43;
    }

    /**
     * Access method for typeCol44.
     *
     * @return the current value of typeCol44
     */
    public String getTypeCol44() {
        return typeCol44;
    }

    /**
     * Setter method for typeCol44.
     *
     * @param aTypeCol44 the new value for typeCol44
     */
    public void setTypeCol44(String aTypeCol44) {
        typeCol44 = aTypeCol44;
    }

    /**
     * Access method for idCol44.
     *
     * @return the current value of idCol44
     */
    public String getIdCol44() {
        return idCol44;
    }

    /**
     * Setter method for idCol44.
     *
     * @param aIdCol44 the new value for idCol44
     */
    public void setIdCol44(String aIdCol44) {
        idCol44 = aIdCol44;
    }

    /**
     * Access method for nomCol44.
     *
     * @return the current value of nomCol44
     */
    public String getNomCol44() {
        return nomCol44;
    }

    /**
     * Setter method for nomCol44.
     *
     * @param aNomCol44 the new value for nomCol44
     */
    public void setNomCol44(String aNomCol44) {
        nomCol44 = aNomCol44;
    }

    /**
     * Access method for moyCol44.
     *
     * @return the current value of moyCol44
     */
    public BigDecimal getMoyCol44() {
        return moyCol44;
    }

    /**
     * Setter method for moyCol44.
     *
     * @param aMoyCol44 the new value for moyCol44
     */
    public void setMoyCol44(BigDecimal aMoyCol44) {
        moyCol44 = aMoyCol44;
    }

    /**
     * Access method for etatCol44.
     *
     * @return the current value of etatCol44
     */
    public String getEtatCol44() {
        return etatCol44;
    }

    /**
     * Setter method for etatCol44.
     *
     * @param aEtatCol44 the new value for etatCol44
     */
    public void setEtatCol44(String aEtatCol44) {
        etatCol44 = aEtatCol44;
    }

    /**
     * Access method for typeCol45.
     *
     * @return the current value of typeCol45
     */
    public String getTypeCol45() {
        return typeCol45;
    }

    /**
     * Setter method for typeCol45.
     *
     * @param aTypeCol45 the new value for typeCol45
     */
    public void setTypeCol45(String aTypeCol45) {
        typeCol45 = aTypeCol45;
    }

    /**
     * Access method for idCol45.
     *
     * @return the current value of idCol45
     */
    public String getIdCol45() {
        return idCol45;
    }

    /**
     * Setter method for idCol45.
     *
     * @param aIdCol45 the new value for idCol45
     */
    public void setIdCol45(String aIdCol45) {
        idCol45 = aIdCol45;
    }

    /**
     * Access method for nomCol45.
     *
     * @return the current value of nomCol45
     */
    public String getNomCol45() {
        return nomCol45;
    }

    /**
     * Setter method for nomCol45.
     *
     * @param aNomCol45 the new value for nomCol45
     */
    public void setNomCol45(String aNomCol45) {
        nomCol45 = aNomCol45;
    }

    /**
     * Access method for moyCol45.
     *
     * @return the current value of moyCol45
     */
    public BigDecimal getMoyCol45() {
        return moyCol45;
    }

    /**
     * Setter method for moyCol45.
     *
     * @param aMoyCol45 the new value for moyCol45
     */
    public void setMoyCol45(BigDecimal aMoyCol45) {
        moyCol45 = aMoyCol45;
    }

    /**
     * Access method for etatCol45.
     *
     * @return the current value of etatCol45
     */
    public String getEtatCol45() {
        return etatCol45;
    }

    /**
     * Setter method for etatCol45.
     *
     * @param aEtatCol45 the new value for etatCol45
     */
    public void setEtatCol45(String aEtatCol45) {
        etatCol45 = aEtatCol45;
    }

    /**
     * Access method for typeCol46.
     *
     * @return the current value of typeCol46
     */
    public String getTypeCol46() {
        return typeCol46;
    }

    /**
     * Setter method for typeCol46.
     *
     * @param aTypeCol46 the new value for typeCol46
     */
    public void setTypeCol46(String aTypeCol46) {
        typeCol46 = aTypeCol46;
    }

    /**
     * Access method for idCol46.
     *
     * @return the current value of idCol46
     */
    public String getIdCol46() {
        return idCol46;
    }

    /**
     * Setter method for idCol46.
     *
     * @param aIdCol46 the new value for idCol46
     */
    public void setIdCol46(String aIdCol46) {
        idCol46 = aIdCol46;
    }

    /**
     * Access method for nomCol46.
     *
     * @return the current value of nomCol46
     */
    public String getNomCol46() {
        return nomCol46;
    }

    /**
     * Setter method for nomCol46.
     *
     * @param aNomCol46 the new value for nomCol46
     */
    public void setNomCol46(String aNomCol46) {
        nomCol46 = aNomCol46;
    }

    /**
     * Access method for moyCol46.
     *
     * @return the current value of moyCol46
     */
    public BigDecimal getMoyCol46() {
        return moyCol46;
    }

    /**
     * Setter method for moyCol46.
     *
     * @param aMoyCol46 the new value for moyCol46
     */
    public void setMoyCol46(BigDecimal aMoyCol46) {
        moyCol46 = aMoyCol46;
    }

    /**
     * Access method for etatCol46.
     *
     * @return the current value of etatCol46
     */
    public String getEtatCol46() {
        return etatCol46;
    }

    /**
     * Setter method for etatCol46.
     *
     * @param aEtatCol46 the new value for etatCol46
     */
    public void setEtatCol46(String aEtatCol46) {
        etatCol46 = aEtatCol46;
    }

    /**
     * Access method for typeCol47.
     *
     * @return the current value of typeCol47
     */
    public String getTypeCol47() {
        return typeCol47;
    }

    /**
     * Setter method for typeCol47.
     *
     * @param aTypeCol47 the new value for typeCol47
     */
    public void setTypeCol47(String aTypeCol47) {
        typeCol47 = aTypeCol47;
    }

    /**
     * Access method for idCol47.
     *
     * @return the current value of idCol47
     */
    public String getIdCol47() {
        return idCol47;
    }

    /**
     * Setter method for idCol47.
     *
     * @param aIdCol47 the new value for idCol47
     */
    public void setIdCol47(String aIdCol47) {
        idCol47 = aIdCol47;
    }

    /**
     * Access method for nomCol47.
     *
     * @return the current value of nomCol47
     */
    public String getNomCol47() {
        return nomCol47;
    }

    /**
     * Setter method for nomCol47.
     *
     * @param aNomCol47 the new value for nomCol47
     */
    public void setNomCol47(String aNomCol47) {
        nomCol47 = aNomCol47;
    }

    /**
     * Access method for moyCol47.
     *
     * @return the current value of moyCol47
     */
    public BigDecimal getMoyCol47() {
        return moyCol47;
    }

    /**
     * Setter method for moyCol47.
     *
     * @param aMoyCol47 the new value for moyCol47
     */
    public void setMoyCol47(BigDecimal aMoyCol47) {
        moyCol47 = aMoyCol47;
    }

    /**
     * Access method for etatCol47.
     *
     * @return the current value of etatCol47
     */
    public String getEtatCol47() {
        return etatCol47;
    }

    /**
     * Setter method for etatCol47.
     *
     * @param aEtatCol47 the new value for etatCol47
     */
    public void setEtatCol47(String aEtatCol47) {
        etatCol47 = aEtatCol47;
    }

    /**
     * Access method for typeCol48.
     *
     * @return the current value of typeCol48
     */
    public String getTypeCol48() {
        return typeCol48;
    }

    /**
     * Setter method for typeCol48.
     *
     * @param aTypeCol48 the new value for typeCol48
     */
    public void setTypeCol48(String aTypeCol48) {
        typeCol48 = aTypeCol48;
    }

    /**
     * Access method for idCol48.
     *
     * @return the current value of idCol48
     */
    public String getIdCol48() {
        return idCol48;
    }

    /**
     * Setter method for idCol48.
     *
     * @param aIdCol48 the new value for idCol48
     */
    public void setIdCol48(String aIdCol48) {
        idCol48 = aIdCol48;
    }

    /**
     * Access method for nomCol48.
     *
     * @return the current value of nomCol48
     */
    public String getNomCol48() {
        return nomCol48;
    }

    /**
     * Setter method for nomCol48.
     *
     * @param aNomCol48 the new value for nomCol48
     */
    public void setNomCol48(String aNomCol48) {
        nomCol48 = aNomCol48;
    }

    /**
     * Access method for moyCol48.
     *
     * @return the current value of moyCol48
     */
    public BigDecimal getMoyCol48() {
        return moyCol48;
    }

    /**
     * Setter method for moyCol48.
     *
     * @param aMoyCol48 the new value for moyCol48
     */
    public void setMoyCol48(BigDecimal aMoyCol48) {
        moyCol48 = aMoyCol48;
    }

    /**
     * Access method for etatCol48.
     *
     * @return the current value of etatCol48
     */
    public String getEtatCol48() {
        return etatCol48;
    }

    /**
     * Setter method for etatCol48.
     *
     * @param aEtatCol48 the new value for etatCol48
     */
    public void setEtatCol48(String aEtatCol48) {
        etatCol48 = aEtatCol48;
    }

    /**
     * Access method for typeCol49.
     *
     * @return the current value of typeCol49
     */
    public String getTypeCol49() {
        return typeCol49;
    }

    /**
     * Setter method for typeCol49.
     *
     * @param aTypeCol49 the new value for typeCol49
     */
    public void setTypeCol49(String aTypeCol49) {
        typeCol49 = aTypeCol49;
    }

    /**
     * Access method for idCol49.
     *
     * @return the current value of idCol49
     */
    public String getIdCol49() {
        return idCol49;
    }

    /**
     * Setter method for idCol49.
     *
     * @param aIdCol49 the new value for idCol49
     */
    public void setIdCol49(String aIdCol49) {
        idCol49 = aIdCol49;
    }

    /**
     * Access method for nomCol49.
     *
     * @return the current value of nomCol49
     */
    public String getNomCol49() {
        return nomCol49;
    }

    /**
     * Setter method for nomCol49.
     *
     * @param aNomCol49 the new value for nomCol49
     */
    public void setNomCol49(String aNomCol49) {
        nomCol49 = aNomCol49;
    }

    /**
     * Access method for moyCol49.
     *
     * @return the current value of moyCol49
     */
    public BigDecimal getMoyCol49() {
        return moyCol49;
    }

    /**
     * Setter method for moyCol49.
     *
     * @param aMoyCol49 the new value for moyCol49
     */
    public void setMoyCol49(BigDecimal aMoyCol49) {
        moyCol49 = aMoyCol49;
    }

    /**
     * Access method for etatCol49.
     *
     * @return the current value of etatCol49
     */
    public String getEtatCol49() {
        return etatCol49;
    }

    /**
     * Setter method for etatCol49.
     *
     * @param aEtatCol49 the new value for etatCol49
     */
    public void setEtatCol49(String aEtatCol49) {
        etatCol49 = aEtatCol49;
    }

    /**
     * Access method for typeCol50.
     *
     * @return the current value of typeCol50
     */
    public String getTypeCol50() {
        return typeCol50;
    }

    /**
     * Setter method for typeCol50.
     *
     * @param aTypeCol50 the new value for typeCol50
     */
    public void setTypeCol50(String aTypeCol50) {
        typeCol50 = aTypeCol50;
    }

    /**
     * Access method for idCol50.
     *
     * @return the current value of idCol50
     */
    public String getIdCol50() {
        return idCol50;
    }

    /**
     * Setter method for idCol50.
     *
     * @param aIdCol50 the new value for idCol50
     */
    public void setIdCol50(String aIdCol50) {
        idCol50 = aIdCol50;
    }

    /**
     * Access method for nomCol50.
     *
     * @return the current value of nomCol50
     */
    public String getNomCol50() {
        return nomCol50;
    }

    /**
     * Setter method for nomCol50.
     *
     * @param aNomCol50 the new value for nomCol50
     */
    public void setNomCol50(String aNomCol50) {
        nomCol50 = aNomCol50;
    }

    /**
     * Access method for moyCol50.
     *
     * @return the current value of moyCol50
     */
    public BigDecimal getMoyCol50() {
        return moyCol50;
    }

    /**
     * Setter method for moyCol50.
     *
     * @param aMoyCol50 the new value for moyCol50
     */
    public void setMoyCol50(BigDecimal aMoyCol50) {
        moyCol50 = aMoyCol50;
    }

    /**
     * Access method for etatCol50.
     *
     * @return the current value of etatCol50
     */
    public String getEtatCol50() {
        return etatCol50;
    }

    /**
     * Setter method for etatCol50.
     *
     * @param aEtatCol50 the new value for etatCol50
     */
    public void setEtatCol50(String aEtatCol50) {
        etatCol50 = aEtatCol50;
    }

    /**
     * Access method for nbHeureCol41.
     *
     * @return the current value of nbHeureCol41
     */
    public BigDecimal getNbHeureCol41() {
        return nbHeureCol41;
    }

    /**
     * Setter method for nbHeureCol41.
     *
     * @param aNbHeureCol41 the new value for nbHeureCol41
     */
    public void setNbHeureCol41(BigDecimal aNbHeureCol41) {
        nbHeureCol41 = aNbHeureCol41;
    }

    /**
     * Access method for nbHeureCol42.
     *
     * @return the current value of nbHeureCol42
     */
    public BigDecimal getNbHeureCol42() {
        return nbHeureCol42;
    }

    /**
     * Setter method for nbHeureCol42.
     *
     * @param aNbHeureCol42 the new value for nbHeureCol42
     */
    public void setNbHeureCol42(BigDecimal aNbHeureCol42) {
        nbHeureCol42 = aNbHeureCol42;
    }

    /**
     * Access method for nbHeureCol43.
     *
     * @return the current value of nbHeureCol43
     */
    public BigDecimal getNbHeureCol43() {
        return nbHeureCol43;
    }

    /**
     * Setter method for nbHeureCol43.
     *
     * @param aNbHeureCol43 the new value for nbHeureCol43
     */
    public void setNbHeureCol43(BigDecimal aNbHeureCol43) {
        nbHeureCol43 = aNbHeureCol43;
    }

    /**
     * Access method for nbHeureCol44.
     *
     * @return the current value of nbHeureCol44
     */
    public BigDecimal getNbHeureCol44() {
        return nbHeureCol44;
    }

    /**
     * Setter method for nbHeureCol44.
     *
     * @param aNbHeureCol44 the new value for nbHeureCol44
     */
    public void setNbHeureCol44(BigDecimal aNbHeureCol44) {
        nbHeureCol44 = aNbHeureCol44;
    }

    /**
     * Access method for nbHeureCol45.
     *
     * @return the current value of nbHeureCol45
     */
    public BigDecimal getNbHeureCol45() {
        return nbHeureCol45;
    }

    /**
     * Setter method for nbHeureCol45.
     *
     * @param aNbHeureCol45 the new value for nbHeureCol45
     */
    public void setNbHeureCol45(BigDecimal aNbHeureCol45) {
        nbHeureCol45 = aNbHeureCol45;
    }

    /**
     * Access method for nbHeureCol46.
     *
     * @return the current value of nbHeureCol46
     */
    public BigDecimal getNbHeureCol46() {
        return nbHeureCol46;
    }

    /**
     * Setter method for nbHeureCol46.
     *
     * @param aNbHeureCol46 the new value for nbHeureCol46
     */
    public void setNbHeureCol46(BigDecimal aNbHeureCol46) {
        nbHeureCol46 = aNbHeureCol46;
    }

    /**
     * Access method for nbHeureCol47.
     *
     * @return the current value of nbHeureCol47
     */
    public BigDecimal getNbHeureCol47() {
        return nbHeureCol47;
    }

    /**
     * Setter method for nbHeureCol47.
     *
     * @param aNbHeureCol47 the new value for nbHeureCol47
     */
    public void setNbHeureCol47(BigDecimal aNbHeureCol47) {
        nbHeureCol47 = aNbHeureCol47;
    }

    /**
     * Access method for nbHeureCol48.
     *
     * @return the current value of nbHeureCol48
     */
    public BigDecimal getNbHeureCol48() {
        return nbHeureCol48;
    }

    /**
     * Setter method for nbHeureCol48.
     *
     * @param aNbHeureCol48 the new value for nbHeureCol48
     */
    public void setNbHeureCol48(BigDecimal aNbHeureCol48) {
        nbHeureCol48 = aNbHeureCol48;
    }

    /**
     * Access method for nbHeureCol49.
     *
     * @return the current value of nbHeureCol49
     */
    public BigDecimal getNbHeureCol49() {
        return nbHeureCol49;
    }

    /**
     * Setter method for nbHeureCol49.
     *
     * @param aNbHeureCol49 the new value for nbHeureCol49
     */
    public void setNbHeureCol49(BigDecimal aNbHeureCol49) {
        nbHeureCol49 = aNbHeureCol49;
    }

    /**
     * Access method for nbHeureCol50.
     *
     * @return the current value of nbHeureCol50
     */
    public BigDecimal getNbHeureCol50() {
        return nbHeureCol50;
    }

    /**
     * Setter method for nbHeureCol50.
     *
     * @param aNbHeureCol50 the new value for nbHeureCol50
     */
    public void setNbHeureCol50(BigDecimal aNbHeureCol50) {
        nbHeureCol50 = aNbHeureCol50;
    }

    /**
     * Access method for coefCol41.
     *
     * @return the current value of coefCol41
     */
    public BigDecimal getCoefCol41() {
        return coefCol41;
    }

    /**
     * Setter method for coefCol41.
     *
     * @param aCoefCol41 the new value for coefCol41
     */
    public void setCoefCol41(BigDecimal aCoefCol41) {
        coefCol41 = aCoefCol41;
    }

    /**
     * Access method for coefCol42.
     *
     * @return the current value of coefCol42
     */
    public BigDecimal getCoefCol42() {
        return coefCol42;
    }

    /**
     * Setter method for coefCol42.
     *
     * @param aCoefCol42 the new value for coefCol42
     */
    public void setCoefCol42(BigDecimal aCoefCol42) {
        coefCol42 = aCoefCol42;
    }

    /**
     * Access method for coefCol43.
     *
     * @return the current value of coefCol43
     */
    public BigDecimal getCoefCol43() {
        return coefCol43;
    }

    /**
     * Setter method for coefCol43.
     *
     * @param aCoefCol43 the new value for coefCol43
     */
    public void setCoefCol43(BigDecimal aCoefCol43) {
        coefCol43 = aCoefCol43;
    }

    /**
     * Access method for coefCol44.
     *
     * @return the current value of coefCol44
     */
    public BigDecimal getCoefCol44() {
        return coefCol44;
    }

    /**
     * Setter method for coefCol44.
     *
     * @param aCoefCol44 the new value for coefCol44
     */
    public void setCoefCol44(BigDecimal aCoefCol44) {
        coefCol44 = aCoefCol44;
    }

    /**
     * Access method for coefCol45.
     *
     * @return the current value of coefCol45
     */
    public BigDecimal getCoefCol45() {
        return coefCol45;
    }

    /**
     * Setter method for coefCol45.
     *
     * @param aCoefCol45 the new value for coefCol45
     */
    public void setCoefCol45(BigDecimal aCoefCol45) {
        coefCol45 = aCoefCol45;
    }

    /**
     * Access method for coefCol46.
     *
     * @return the current value of coefCol46
     */
    public BigDecimal getCoefCol46() {
        return coefCol46;
    }

    /**
     * Setter method for coefCol46.
     *
     * @param aCoefCol46 the new value for coefCol46
     */
    public void setCoefCol46(BigDecimal aCoefCol46) {
        coefCol46 = aCoefCol46;
    }

    /**
     * Access method for coefCol47.
     *
     * @return the current value of coefCol47
     */
    public BigDecimal getCoefCol47() {
        return coefCol47;
    }

    /**
     * Setter method for coefCol47.
     *
     * @param aCoefCol47 the new value for coefCol47
     */
    public void setCoefCol47(BigDecimal aCoefCol47) {
        coefCol47 = aCoefCol47;
    }

    /**
     * Access method for coefCol48.
     *
     * @return the current value of coefCol48
     */
    public BigDecimal getCoefCol48() {
        return coefCol48;
    }

    /**
     * Setter method for coefCol48.
     *
     * @param aCoefCol48 the new value for coefCol48
     */
    public void setCoefCol48(BigDecimal aCoefCol48) {
        coefCol48 = aCoefCol48;
    }

    /**
     * Access method for coefCol49.
     *
     * @return the current value of coefCol49
     */
    public BigDecimal getCoefCol49() {
        return coefCol49;
    }

    /**
     * Setter method for coefCol49.
     *
     * @param aCoefCol49 the new value for coefCol49
     */
    public void setCoefCol49(BigDecimal aCoefCol49) {
        coefCol49 = aCoefCol49;
    }

    /**
     * Access method for coefCol50.
     *
     * @return the current value of coefCol50
     */
    public BigDecimal getCoefCol50() {
        return coefCol50;
    }

    /**
     * Setter method for coefCol50.
     *
     * @param aCoefCol50 the new value for coefCol50
     */
    public void setCoefCol50(BigDecimal aCoefCol50) {
        coefCol50 = aCoefCol50;
    }

    /**
     * Access method for codeDecision.
     *
     * @return the current value of codeDecision
     */
    public String getCodeDecision() {
        return codeDecision;
    }

    /**
     * Setter method for codeDecision.
     *
     * @param aCodeDecision the new value for codeDecision
     */
    public void setCodeDecision(String aCodeDecision) {
        codeDecision = aCodeDecision;
    }

    /**
     * Access method for libDecision.
     *
     * @return the current value of libDecision
     */
    public String getLibDecision() {
        return libDecision;
    }

    /**
     * Setter method for libDecision.
     *
     * @param aLibDecision the new value for libDecision
     */
    public void setLibDecision(String aLibDecision) {
        libDecision = aLibDecision;
    }

    /**
     * Access method for moygen.
     *
     * @return the current value of moygen
     */
    public BigDecimal getMoygen() {
        return moygen;
    }

    /**
     * Setter method for moygen.
     *
     * @param aMoygen the new value for moygen
     */
    public void setMoygen(BigDecimal aMoygen) {
        moygen = aMoygen;
    }

    /**
     * Access method for etatCol40.
     *
     * @return the current value of etatCol40
     */
    public String getEtatCol40() {
        return etatCol40;
    }

    /**
     * Setter method for etatCol40.
     *
     * @param aEtatCol40 the new value for etatCol40
     */
    public void setEtatCol40(String aEtatCol40) {
        etatCol40 = aEtatCol40;
    }

    /**
     * Access method for credit1.
     *
     * @return the current value of credit1
     */
    public String getCredit1() {
        return credit1;
    }

    /**
     * Setter method for credit1.
     *
     * @param aCredit1 the new value for credit1
     */
    public void setCredit1(String aCredit1) {
        credit1 = aCredit1;
    }

    /**
     * Access method for credit2.
     *
     * @return the current value of credit2
     */
    public String getCredit2() {
        return credit2;
    }

    /**
     * Setter method for credit2.
     *
     * @param aCredit2 the new value for credit2
     */
    public void setCredit2(String aCredit2) {
        credit2 = aCredit2;
    }

    /**
     * Access method for typePv.
     *
     * @return the current value of typePv
     */
    public String getTypePv() {
        return typePv;
    }

    /**
     * Setter method for typePv.
     *
     * @param aTypePv the new value for typePv
     */
    public void setTypePv(String aTypePv) {
        typePv = aTypePv;
    }

    /**
     * Access method for codeDecisionRat2.
     *
     * @return the current value of codeDecisionRat2
     */
    public String getCodeDecisionRat2() {
        return codeDecisionRat2;
    }

    /**
     * Setter method for codeDecisionRat2.
     *
     * @param aCodeDecisionRat2 the new value for codeDecisionRat2
     */
    public void setCodeDecisionRat2(String aCodeDecisionRat2) {
        codeDecisionRat2 = aCodeDecisionRat2;
    }

    /**
     * Access method for libDecisionRat2.
     *
     * @return the current value of libDecisionRat2
     */
    public String getLibDecisionRat2() {
        return libDecisionRat2;
    }

    /**
     * Setter method for libDecisionRat2.
     *
     * @param aLibDecisionRat2 the new value for libDecisionRat2
     */
    public void setLibDecisionRat2(String aLibDecisionRat2) {
        libDecisionRat2 = aLibDecisionRat2;
    }

    /**
     * Access method for codeDecisionRatt.
     *
     * @return the current value of codeDecisionRatt
     */
    public String getCodeDecisionRatt() {
        return codeDecisionRatt;
    }

    /**
     * Setter method for codeDecisionRatt.
     *
     * @param aCodeDecisionRatt the new value for codeDecisionRatt
     */
    public void setCodeDecisionRatt(String aCodeDecisionRatt) {
        codeDecisionRatt = aCodeDecisionRatt;
    }

    /**
     * Access method for libDecisionRatt.
     *
     * @return the current value of libDecisionRatt
     */
    public String getLibDecisionRatt() {
        return libDecisionRatt;
    }

    /**
     * Setter method for libDecisionRatt.
     *
     * @param aLibDecisionRatt the new value for libDecisionRatt
     */
    public void setLibDecisionRatt(String aLibDecisionRatt) {
        libDecisionRatt = aLibDecisionRatt;
    }

    /**
     * Access method for creditRouge.
     *
     * @return the current value of creditRouge
     */
    public String getCreditRouge() {
        return creditRouge;
    }

    /**
     * Setter method for creditRouge.
     *
     * @param aCreditRouge the new value for creditRouge
     */
    public void setCreditRouge(String aCreditRouge) {
        creditRouge = aCreditRouge;
    }

    /**
     * Access method for creditVert.
     *
     * @return the current value of creditVert
     */
    public String getCreditVert() {
        return creditVert;
    }

    /**
     * Setter method for creditVert.
     *
     * @param aCreditVert the new value for creditVert
     */
    public void setCreditVert(String aCreditVert) {
        creditVert = aCreditVert;
    }

    /**
     * Access method for moyratt.
     *
     * @return the current value of moyratt
     */
    public BigDecimal getMoyratt() {
        return moyratt;
    }

    /**
     * Setter method for moyratt.
     *
     * @param aMoyratt the new value for moyratt
     */
    public void setMoyratt(BigDecimal aMoyratt) {
        moyratt = aMoyratt;
    }

    /**
     * Access method for nbHeureCol51.
     *
     * @return the current value of nbHeureCol51
     */
    public BigDecimal getNbHeureCol51() {
        return nbHeureCol51;
    }

    /**
     * Setter method for nbHeureCol51.
     *
     * @param aNbHeureCol51 the new value for nbHeureCol51
     */
    public void setNbHeureCol51(BigDecimal aNbHeureCol51) {
        nbHeureCol51 = aNbHeureCol51;
    }

    /**
     * Access method for nbHeureCol52.
     *
     * @return the current value of nbHeureCol52
     */
    public BigDecimal getNbHeureCol52() {
        return nbHeureCol52;
    }

    /**
     * Setter method for nbHeureCol52.
     *
     * @param aNbHeureCol52 the new value for nbHeureCol52
     */
    public void setNbHeureCol52(BigDecimal aNbHeureCol52) {
        nbHeureCol52 = aNbHeureCol52;
    }

    /**
     * Access method for nbHeureCol53.
     *
     * @return the current value of nbHeureCol53
     */
    public BigDecimal getNbHeureCol53() {
        return nbHeureCol53;
    }

    /**
     * Setter method for nbHeureCol53.
     *
     * @param aNbHeureCol53 the new value for nbHeureCol53
     */
    public void setNbHeureCol53(BigDecimal aNbHeureCol53) {
        nbHeureCol53 = aNbHeureCol53;
    }

    /**
     * Access method for nbHeureCol54.
     *
     * @return the current value of nbHeureCol54
     */
    public BigDecimal getNbHeureCol54() {
        return nbHeureCol54;
    }

    /**
     * Setter method for nbHeureCol54.
     *
     * @param aNbHeureCol54 the new value for nbHeureCol54
     */
    public void setNbHeureCol54(BigDecimal aNbHeureCol54) {
        nbHeureCol54 = aNbHeureCol54;
    }

    /**
     * Access method for nbHeureCol55.
     *
     * @return the current value of nbHeureCol55
     */
    public BigDecimal getNbHeureCol55() {
        return nbHeureCol55;
    }

    /**
     * Setter method for nbHeureCol55.
     *
     * @param aNbHeureCol55 the new value for nbHeureCol55
     */
    public void setNbHeureCol55(BigDecimal aNbHeureCol55) {
        nbHeureCol55 = aNbHeureCol55;
    }

    /**
     * Access method for nbHeureCol56.
     *
     * @return the current value of nbHeureCol56
     */
    public BigDecimal getNbHeureCol56() {
        return nbHeureCol56;
    }

    /**
     * Setter method for nbHeureCol56.
     *
     * @param aNbHeureCol56 the new value for nbHeureCol56
     */
    public void setNbHeureCol56(BigDecimal aNbHeureCol56) {
        nbHeureCol56 = aNbHeureCol56;
    }

    /**
     * Access method for nbHeureCol57.
     *
     * @return the current value of nbHeureCol57
     */
    public BigDecimal getNbHeureCol57() {
        return nbHeureCol57;
    }

    /**
     * Setter method for nbHeureCol57.
     *
     * @param aNbHeureCol57 the new value for nbHeureCol57
     */
    public void setNbHeureCol57(BigDecimal aNbHeureCol57) {
        nbHeureCol57 = aNbHeureCol57;
    }

    /**
     * Access method for nbHeureCol58.
     *
     * @return the current value of nbHeureCol58
     */
    public BigDecimal getNbHeureCol58() {
        return nbHeureCol58;
    }

    /**
     * Setter method for nbHeureCol58.
     *
     * @param aNbHeureCol58 the new value for nbHeureCol58
     */
    public void setNbHeureCol58(BigDecimal aNbHeureCol58) {
        nbHeureCol58 = aNbHeureCol58;
    }

    /**
     * Access method for nbHeureCol59.
     *
     * @return the current value of nbHeureCol59
     */
    public BigDecimal getNbHeureCol59() {
        return nbHeureCol59;
    }

    /**
     * Setter method for nbHeureCol59.
     *
     * @param aNbHeureCol59 the new value for nbHeureCol59
     */
    public void setNbHeureCol59(BigDecimal aNbHeureCol59) {
        nbHeureCol59 = aNbHeureCol59;
    }

    /**
     * Access method for nbHeureCol60.
     *
     * @return the current value of nbHeureCol60
     */
    public BigDecimal getNbHeureCol60() {
        return nbHeureCol60;
    }

    /**
     * Setter method for nbHeureCol60.
     *
     * @param aNbHeureCol60 the new value for nbHeureCol60
     */
    public void setNbHeureCol60(BigDecimal aNbHeureCol60) {
        nbHeureCol60 = aNbHeureCol60;
    }

    /**
     * Access method for coefCol51.
     *
     * @return the current value of coefCol51
     */
    public BigDecimal getCoefCol51() {
        return coefCol51;
    }

    /**
     * Setter method for coefCol51.
     *
     * @param aCoefCol51 the new value for coefCol51
     */
    public void setCoefCol51(BigDecimal aCoefCol51) {
        coefCol51 = aCoefCol51;
    }

    /**
     * Access method for coefCol52.
     *
     * @return the current value of coefCol52
     */
    public BigDecimal getCoefCol52() {
        return coefCol52;
    }

    /**
     * Setter method for coefCol52.
     *
     * @param aCoefCol52 the new value for coefCol52
     */
    public void setCoefCol52(BigDecimal aCoefCol52) {
        coefCol52 = aCoefCol52;
    }

    /**
     * Access method for coefCol53.
     *
     * @return the current value of coefCol53
     */
    public BigDecimal getCoefCol53() {
        return coefCol53;
    }

    /**
     * Setter method for coefCol53.
     *
     * @param aCoefCol53 the new value for coefCol53
     */
    public void setCoefCol53(BigDecimal aCoefCol53) {
        coefCol53 = aCoefCol53;
    }

    /**
     * Access method for coefCol54.
     *
     * @return the current value of coefCol54
     */
    public BigDecimal getCoefCol54() {
        return coefCol54;
    }

    /**
     * Setter method for coefCol54.
     *
     * @param aCoefCol54 the new value for coefCol54
     */
    public void setCoefCol54(BigDecimal aCoefCol54) {
        coefCol54 = aCoefCol54;
    }

    /**
     * Access method for coefCol55.
     *
     * @return the current value of coefCol55
     */
    public BigDecimal getCoefCol55() {
        return coefCol55;
    }

    /**
     * Setter method for coefCol55.
     *
     * @param aCoefCol55 the new value for coefCol55
     */
    public void setCoefCol55(BigDecimal aCoefCol55) {
        coefCol55 = aCoefCol55;
    }

    /**
     * Access method for coefCol56.
     *
     * @return the current value of coefCol56
     */
    public BigDecimal getCoefCol56() {
        return coefCol56;
    }

    /**
     * Setter method for coefCol56.
     *
     * @param aCoefCol56 the new value for coefCol56
     */
    public void setCoefCol56(BigDecimal aCoefCol56) {
        coefCol56 = aCoefCol56;
    }

    /**
     * Access method for coefCol57.
     *
     * @return the current value of coefCol57
     */
    public BigDecimal getCoefCol57() {
        return coefCol57;
    }

    /**
     * Setter method for coefCol57.
     *
     * @param aCoefCol57 the new value for coefCol57
     */
    public void setCoefCol57(BigDecimal aCoefCol57) {
        coefCol57 = aCoefCol57;
    }

    /**
     * Access method for coefCol58.
     *
     * @return the current value of coefCol58
     */
    public BigDecimal getCoefCol58() {
        return coefCol58;
    }

    /**
     * Setter method for coefCol58.
     *
     * @param aCoefCol58 the new value for coefCol58
     */
    public void setCoefCol58(BigDecimal aCoefCol58) {
        coefCol58 = aCoefCol58;
    }

    /**
     * Access method for coefCol59.
     *
     * @return the current value of coefCol59
     */
    public BigDecimal getCoefCol59() {
        return coefCol59;
    }

    /**
     * Setter method for coefCol59.
     *
     * @param aCoefCol59 the new value for coefCol59
     */
    public void setCoefCol59(BigDecimal aCoefCol59) {
        coefCol59 = aCoefCol59;
    }

    /**
     * Access method for coefCol60.
     *
     * @return the current value of coefCol60
     */
    public BigDecimal getCoefCol60() {
        return coefCol60;
    }

    /**
     * Setter method for coefCol60.
     *
     * @param aCoefCol60 the new value for coefCol60
     */
    public void setCoefCol60(BigDecimal aCoefCol60) {
        coefCol60 = aCoefCol60;
    }

    /**
     * Access method for typeCol51.
     *
     * @return the current value of typeCol51
     */
    public String getTypeCol51() {
        return typeCol51;
    }

    /**
     * Setter method for typeCol51.
     *
     * @param aTypeCol51 the new value for typeCol51
     */
    public void setTypeCol51(String aTypeCol51) {
        typeCol51 = aTypeCol51;
    }

    /**
     * Access method for idCol51.
     *
     * @return the current value of idCol51
     */
    public String getIdCol51() {
        return idCol51;
    }

    /**
     * Setter method for idCol51.
     *
     * @param aIdCol51 the new value for idCol51
     */
    public void setIdCol51(String aIdCol51) {
        idCol51 = aIdCol51;
    }

    /**
     * Access method for nomCol51.
     *
     * @return the current value of nomCol51
     */
    public String getNomCol51() {
        return nomCol51;
    }

    /**
     * Setter method for nomCol51.
     *
     * @param aNomCol51 the new value for nomCol51
     */
    public void setNomCol51(String aNomCol51) {
        nomCol51 = aNomCol51;
    }

    /**
     * Access method for moyCol51.
     *
     * @return the current value of moyCol51
     */
    public BigDecimal getMoyCol51() {
        return moyCol51;
    }

    /**
     * Setter method for moyCol51.
     *
     * @param aMoyCol51 the new value for moyCol51
     */
    public void setMoyCol51(BigDecimal aMoyCol51) {
        moyCol51 = aMoyCol51;
    }

    /**
     * Access method for etatCol51.
     *
     * @return the current value of etatCol51
     */
    public String getEtatCol51() {
        return etatCol51;
    }

    /**
     * Setter method for etatCol51.
     *
     * @param aEtatCol51 the new value for etatCol51
     */
    public void setEtatCol51(String aEtatCol51) {
        etatCol51 = aEtatCol51;
    }

    /**
     * Access method for typeCol52.
     *
     * @return the current value of typeCol52
     */
    public String getTypeCol52() {
        return typeCol52;
    }

    /**
     * Setter method for typeCol52.
     *
     * @param aTypeCol52 the new value for typeCol52
     */
    public void setTypeCol52(String aTypeCol52) {
        typeCol52 = aTypeCol52;
    }

    /**
     * Access method for idCol52.
     *
     * @return the current value of idCol52
     */
    public String getIdCol52() {
        return idCol52;
    }

    /**
     * Setter method for idCol52.
     *
     * @param aIdCol52 the new value for idCol52
     */
    public void setIdCol52(String aIdCol52) {
        idCol52 = aIdCol52;
    }

    /**
     * Access method for nomCol52.
     *
     * @return the current value of nomCol52
     */
    public String getNomCol52() {
        return nomCol52;
    }

    /**
     * Setter method for nomCol52.
     *
     * @param aNomCol52 the new value for nomCol52
     */
    public void setNomCol52(String aNomCol52) {
        nomCol52 = aNomCol52;
    }

    /**
     * Access method for moyCol52.
     *
     * @return the current value of moyCol52
     */
    public BigDecimal getMoyCol52() {
        return moyCol52;
    }

    /**
     * Setter method for moyCol52.
     *
     * @param aMoyCol52 the new value for moyCol52
     */
    public void setMoyCol52(BigDecimal aMoyCol52) {
        moyCol52 = aMoyCol52;
    }

    /**
     * Access method for etatCol52.
     *
     * @return the current value of etatCol52
     */
    public String getEtatCol52() {
        return etatCol52;
    }

    /**
     * Setter method for etatCol52.
     *
     * @param aEtatCol52 the new value for etatCol52
     */
    public void setEtatCol52(String aEtatCol52) {
        etatCol52 = aEtatCol52;
    }

    /**
     * Access method for typeCol53.
     *
     * @return the current value of typeCol53
     */
    public String getTypeCol53() {
        return typeCol53;
    }

    /**
     * Setter method for typeCol53.
     *
     * @param aTypeCol53 the new value for typeCol53
     */
    public void setTypeCol53(String aTypeCol53) {
        typeCol53 = aTypeCol53;
    }

    /**
     * Access method for idCol53.
     *
     * @return the current value of idCol53
     */
    public String getIdCol53() {
        return idCol53;
    }

    /**
     * Setter method for idCol53.
     *
     * @param aIdCol53 the new value for idCol53
     */
    public void setIdCol53(String aIdCol53) {
        idCol53 = aIdCol53;
    }

    /**
     * Access method for nomCol53.
     *
     * @return the current value of nomCol53
     */
    public String getNomCol53() {
        return nomCol53;
    }

    /**
     * Setter method for nomCol53.
     *
     * @param aNomCol53 the new value for nomCol53
     */
    public void setNomCol53(String aNomCol53) {
        nomCol53 = aNomCol53;
    }

    /**
     * Access method for moyCol53.
     *
     * @return the current value of moyCol53
     */
    public BigDecimal getMoyCol53() {
        return moyCol53;
    }

    /**
     * Setter method for moyCol53.
     *
     * @param aMoyCol53 the new value for moyCol53
     */
    public void setMoyCol53(BigDecimal aMoyCol53) {
        moyCol53 = aMoyCol53;
    }

    /**
     * Access method for etatCol53.
     *
     * @return the current value of etatCol53
     */
    public String getEtatCol53() {
        return etatCol53;
    }

    /**
     * Setter method for etatCol53.
     *
     * @param aEtatCol53 the new value for etatCol53
     */
    public void setEtatCol53(String aEtatCol53) {
        etatCol53 = aEtatCol53;
    }

    /**
     * Access method for typeCol54.
     *
     * @return the current value of typeCol54
     */
    public String getTypeCol54() {
        return typeCol54;
    }

    /**
     * Setter method for typeCol54.
     *
     * @param aTypeCol54 the new value for typeCol54
     */
    public void setTypeCol54(String aTypeCol54) {
        typeCol54 = aTypeCol54;
    }

    /**
     * Access method for idCol54.
     *
     * @return the current value of idCol54
     */
    public String getIdCol54() {
        return idCol54;
    }

    /**
     * Setter method for idCol54.
     *
     * @param aIdCol54 the new value for idCol54
     */
    public void setIdCol54(String aIdCol54) {
        idCol54 = aIdCol54;
    }

    /**
     * Access method for nomCol54.
     *
     * @return the current value of nomCol54
     */
    public String getNomCol54() {
        return nomCol54;
    }

    /**
     * Setter method for nomCol54.
     *
     * @param aNomCol54 the new value for nomCol54
     */
    public void setNomCol54(String aNomCol54) {
        nomCol54 = aNomCol54;
    }

    /**
     * Access method for moyCol54.
     *
     * @return the current value of moyCol54
     */
    public BigDecimal getMoyCol54() {
        return moyCol54;
    }

    /**
     * Setter method for moyCol54.
     *
     * @param aMoyCol54 the new value for moyCol54
     */
    public void setMoyCol54(BigDecimal aMoyCol54) {
        moyCol54 = aMoyCol54;
    }

    /**
     * Access method for etatCol54.
     *
     * @return the current value of etatCol54
     */
    public String getEtatCol54() {
        return etatCol54;
    }

    /**
     * Setter method for etatCol54.
     *
     * @param aEtatCol54 the new value for etatCol54
     */
    public void setEtatCol54(String aEtatCol54) {
        etatCol54 = aEtatCol54;
    }

    /**
     * Access method for typeCol55.
     *
     * @return the current value of typeCol55
     */
    public String getTypeCol55() {
        return typeCol55;
    }

    /**
     * Setter method for typeCol55.
     *
     * @param aTypeCol55 the new value for typeCol55
     */
    public void setTypeCol55(String aTypeCol55) {
        typeCol55 = aTypeCol55;
    }

    /**
     * Access method for idCol55.
     *
     * @return the current value of idCol55
     */
    public String getIdCol55() {
        return idCol55;
    }

    /**
     * Setter method for idCol55.
     *
     * @param aIdCol55 the new value for idCol55
     */
    public void setIdCol55(String aIdCol55) {
        idCol55 = aIdCol55;
    }

    /**
     * Access method for nomCol55.
     *
     * @return the current value of nomCol55
     */
    public String getNomCol55() {
        return nomCol55;
    }

    /**
     * Setter method for nomCol55.
     *
     * @param aNomCol55 the new value for nomCol55
     */
    public void setNomCol55(String aNomCol55) {
        nomCol55 = aNomCol55;
    }

    /**
     * Access method for moyCol55.
     *
     * @return the current value of moyCol55
     */
    public BigDecimal getMoyCol55() {
        return moyCol55;
    }

    /**
     * Setter method for moyCol55.
     *
     * @param aMoyCol55 the new value for moyCol55
     */
    public void setMoyCol55(BigDecimal aMoyCol55) {
        moyCol55 = aMoyCol55;
    }

    /**
     * Access method for etatCol55.
     *
     * @return the current value of etatCol55
     */
    public String getEtatCol55() {
        return etatCol55;
    }

    /**
     * Setter method for etatCol55.
     *
     * @param aEtatCol55 the new value for etatCol55
     */
    public void setEtatCol55(String aEtatCol55) {
        etatCol55 = aEtatCol55;
    }

    /**
     * Access method for typeCol56.
     *
     * @return the current value of typeCol56
     */
    public String getTypeCol56() {
        return typeCol56;
    }

    /**
     * Setter method for typeCol56.
     *
     * @param aTypeCol56 the new value for typeCol56
     */
    public void setTypeCol56(String aTypeCol56) {
        typeCol56 = aTypeCol56;
    }

    /**
     * Access method for idCol56.
     *
     * @return the current value of idCol56
     */
    public String getIdCol56() {
        return idCol56;
    }

    /**
     * Setter method for idCol56.
     *
     * @param aIdCol56 the new value for idCol56
     */
    public void setIdCol56(String aIdCol56) {
        idCol56 = aIdCol56;
    }

    /**
     * Access method for nomCol56.
     *
     * @return the current value of nomCol56
     */
    public String getNomCol56() {
        return nomCol56;
    }

    /**
     * Setter method for nomCol56.
     *
     * @param aNomCol56 the new value for nomCol56
     */
    public void setNomCol56(String aNomCol56) {
        nomCol56 = aNomCol56;
    }

    /**
     * Access method for moyCol56.
     *
     * @return the current value of moyCol56
     */
    public BigDecimal getMoyCol56() {
        return moyCol56;
    }

    /**
     * Setter method for moyCol56.
     *
     * @param aMoyCol56 the new value for moyCol56
     */
    public void setMoyCol56(BigDecimal aMoyCol56) {
        moyCol56 = aMoyCol56;
    }

    /**
     * Access method for etatCol56.
     *
     * @return the current value of etatCol56
     */
    public String getEtatCol56() {
        return etatCol56;
    }

    /**
     * Setter method for etatCol56.
     *
     * @param aEtatCol56 the new value for etatCol56
     */
    public void setEtatCol56(String aEtatCol56) {
        etatCol56 = aEtatCol56;
    }

    /**
     * Access method for typeCol57.
     *
     * @return the current value of typeCol57
     */
    public String getTypeCol57() {
        return typeCol57;
    }

    /**
     * Setter method for typeCol57.
     *
     * @param aTypeCol57 the new value for typeCol57
     */
    public void setTypeCol57(String aTypeCol57) {
        typeCol57 = aTypeCol57;
    }

    /**
     * Access method for idCol57.
     *
     * @return the current value of idCol57
     */
    public String getIdCol57() {
        return idCol57;
    }

    /**
     * Setter method for idCol57.
     *
     * @param aIdCol57 the new value for idCol57
     */
    public void setIdCol57(String aIdCol57) {
        idCol57 = aIdCol57;
    }

    /**
     * Access method for nomCol57.
     *
     * @return the current value of nomCol57
     */
    public String getNomCol57() {
        return nomCol57;
    }

    /**
     * Setter method for nomCol57.
     *
     * @param aNomCol57 the new value for nomCol57
     */
    public void setNomCol57(String aNomCol57) {
        nomCol57 = aNomCol57;
    }

    /**
     * Access method for moyCol57.
     *
     * @return the current value of moyCol57
     */
    public BigDecimal getMoyCol57() {
        return moyCol57;
    }

    /**
     * Setter method for moyCol57.
     *
     * @param aMoyCol57 the new value for moyCol57
     */
    public void setMoyCol57(BigDecimal aMoyCol57) {
        moyCol57 = aMoyCol57;
    }

    /**
     * Access method for etatCol57.
     *
     * @return the current value of etatCol57
     */
    public String getEtatCol57() {
        return etatCol57;
    }

    /**
     * Setter method for etatCol57.
     *
     * @param aEtatCol57 the new value for etatCol57
     */
    public void setEtatCol57(String aEtatCol57) {
        etatCol57 = aEtatCol57;
    }

    /**
     * Access method for typeCol58.
     *
     * @return the current value of typeCol58
     */
    public String getTypeCol58() {
        return typeCol58;
    }

    /**
     * Setter method for typeCol58.
     *
     * @param aTypeCol58 the new value for typeCol58
     */
    public void setTypeCol58(String aTypeCol58) {
        typeCol58 = aTypeCol58;
    }

    /**
     * Access method for idCol58.
     *
     * @return the current value of idCol58
     */
    public String getIdCol58() {
        return idCol58;
    }

    /**
     * Setter method for idCol58.
     *
     * @param aIdCol58 the new value for idCol58
     */
    public void setIdCol58(String aIdCol58) {
        idCol58 = aIdCol58;
    }

    /**
     * Access method for nomCol58.
     *
     * @return the current value of nomCol58
     */
    public String getNomCol58() {
        return nomCol58;
    }

    /**
     * Setter method for nomCol58.
     *
     * @param aNomCol58 the new value for nomCol58
     */
    public void setNomCol58(String aNomCol58) {
        nomCol58 = aNomCol58;
    }

    /**
     * Access method for moyCol58.
     *
     * @return the current value of moyCol58
     */
    public BigDecimal getMoyCol58() {
        return moyCol58;
    }

    /**
     * Setter method for moyCol58.
     *
     * @param aMoyCol58 the new value for moyCol58
     */
    public void setMoyCol58(BigDecimal aMoyCol58) {
        moyCol58 = aMoyCol58;
    }

    /**
     * Access method for etatCol58.
     *
     * @return the current value of etatCol58
     */
    public String getEtatCol58() {
        return etatCol58;
    }

    /**
     * Setter method for etatCol58.
     *
     * @param aEtatCol58 the new value for etatCol58
     */
    public void setEtatCol58(String aEtatCol58) {
        etatCol58 = aEtatCol58;
    }

    /**
     * Access method for typeCol59.
     *
     * @return the current value of typeCol59
     */
    public String getTypeCol59() {
        return typeCol59;
    }

    /**
     * Setter method for typeCol59.
     *
     * @param aTypeCol59 the new value for typeCol59
     */
    public void setTypeCol59(String aTypeCol59) {
        typeCol59 = aTypeCol59;
    }

    /**
     * Access method for idCol59.
     *
     * @return the current value of idCol59
     */
    public String getIdCol59() {
        return idCol59;
    }

    /**
     * Setter method for idCol59.
     *
     * @param aIdCol59 the new value for idCol59
     */
    public void setIdCol59(String aIdCol59) {
        idCol59 = aIdCol59;
    }

    /**
     * Access method for nomCol59.
     *
     * @return the current value of nomCol59
     */
    public String getNomCol59() {
        return nomCol59;
    }

    /**
     * Setter method for nomCol59.
     *
     * @param aNomCol59 the new value for nomCol59
     */
    public void setNomCol59(String aNomCol59) {
        nomCol59 = aNomCol59;
    }

    /**
     * Access method for moyCol59.
     *
     * @return the current value of moyCol59
     */
    public BigDecimal getMoyCol59() {
        return moyCol59;
    }

    /**
     * Setter method for moyCol59.
     *
     * @param aMoyCol59 the new value for moyCol59
     */
    public void setMoyCol59(BigDecimal aMoyCol59) {
        moyCol59 = aMoyCol59;
    }

    /**
     * Access method for etatCol59.
     *
     * @return the current value of etatCol59
     */
    public String getEtatCol59() {
        return etatCol59;
    }

    /**
     * Setter method for etatCol59.
     *
     * @param aEtatCol59 the new value for etatCol59
     */
    public void setEtatCol59(String aEtatCol59) {
        etatCol59 = aEtatCol59;
    }

    /**
     * Access method for typeCol60.
     *
     * @return the current value of typeCol60
     */
    public String getTypeCol60() {
        return typeCol60;
    }

    /**
     * Setter method for typeCol60.
     *
     * @param aTypeCol60 the new value for typeCol60
     */
    public void setTypeCol60(String aTypeCol60) {
        typeCol60 = aTypeCol60;
    }

    /**
     * Access method for idCol60.
     *
     * @return the current value of idCol60
     */
    public String getIdCol60() {
        return idCol60;
    }

    /**
     * Setter method for idCol60.
     *
     * @param aIdCol60 the new value for idCol60
     */
    public void setIdCol60(String aIdCol60) {
        idCol60 = aIdCol60;
    }

    /**
     * Access method for nomCol60.
     *
     * @return the current value of nomCol60
     */
    public String getNomCol60() {
        return nomCol60;
    }

    /**
     * Setter method for nomCol60.
     *
     * @param aNomCol60 the new value for nomCol60
     */
    public void setNomCol60(String aNomCol60) {
        nomCol60 = aNomCol60;
    }

    /**
     * Access method for moyCol60.
     *
     * @return the current value of moyCol60
     */
    public BigDecimal getMoyCol60() {
        return moyCol60;
    }

    /**
     * Setter method for moyCol60.
     *
     * @param aMoyCol60 the new value for moyCol60
     */
    public void setMoyCol60(BigDecimal aMoyCol60) {
        moyCol60 = aMoyCol60;
    }

    /**
     * Access method for etatCol60.
     *
     * @return the current value of etatCol60
     */
    public String getEtatCol60() {
        return etatCol60;
    }

    /**
     * Setter method for etatCol60.
     *
     * @param aEtatCol60 the new value for etatCol60
     */
    public void setEtatCol60(String aEtatCol60) {
        etatCol60 = aEtatCol60;
    }

    /**
     * Access method for natureUe1.
     *
     * @return the current value of natureUe1
     */
    public String getNatureUe1() {
        return natureUe1;
    }

    /**
     * Setter method for natureUe1.
     *
     * @param aNatureUe1 the new value for natureUe1
     */
    public void setNatureUe1(String aNatureUe1) {
        natureUe1 = aNatureUe1;
    }

    /**
     * Access method for natureUe2.
     *
     * @return the current value of natureUe2
     */
    public String getNatureUe2() {
        return natureUe2;
    }

    /**
     * Setter method for natureUe2.
     *
     * @param aNatureUe2 the new value for natureUe2
     */
    public void setNatureUe2(String aNatureUe2) {
        natureUe2 = aNatureUe2;
    }

    /**
     * Access method for natureUe3.
     *
     * @return the current value of natureUe3
     */
    public String getNatureUe3() {
        return natureUe3;
    }

    /**
     * Setter method for natureUe3.
     *
     * @param aNatureUe3 the new value for natureUe3
     */
    public void setNatureUe3(String aNatureUe3) {
        natureUe3 = aNatureUe3;
    }

    /**
     * Access method for natureUe4.
     *
     * @return the current value of natureUe4
     */
    public String getNatureUe4() {
        return natureUe4;
    }

    /**
     * Setter method for natureUe4.
     *
     * @param aNatureUe4 the new value for natureUe4
     */
    public void setNatureUe4(String aNatureUe4) {
        natureUe4 = aNatureUe4;
    }

    /**
     * Access method for natureUe5.
     *
     * @return the current value of natureUe5
     */
    public String getNatureUe5() {
        return natureUe5;
    }

    /**
     * Setter method for natureUe5.
     *
     * @param aNatureUe5 the new value for natureUe5
     */
    public void setNatureUe5(String aNatureUe5) {
        natureUe5 = aNatureUe5;
    }

    /**
     * Access method for natureUe6.
     *
     * @return the current value of natureUe6
     */
    public String getNatureUe6() {
        return natureUe6;
    }

    /**
     * Setter method for natureUe6.
     *
     * @param aNatureUe6 the new value for natureUe6
     */
    public void setNatureUe6(String aNatureUe6) {
        natureUe6 = aNatureUe6;
    }

    /**
     * Access method for natureUe7.
     *
     * @return the current value of natureUe7
     */
    public String getNatureUe7() {
        return natureUe7;
    }

    /**
     * Setter method for natureUe7.
     *
     * @param aNatureUe7 the new value for natureUe7
     */
    public void setNatureUe7(String aNatureUe7) {
        natureUe7 = aNatureUe7;
    }

    /**
     * Access method for natureUe8.
     *
     * @return the current value of natureUe8
     */
    public String getNatureUe8() {
        return natureUe8;
    }

    /**
     * Setter method for natureUe8.
     *
     * @param aNatureUe8 the new value for natureUe8
     */
    public void setNatureUe8(String aNatureUe8) {
        natureUe8 = aNatureUe8;
    }

    /**
     * Access method for natureUe9.
     *
     * @return the current value of natureUe9
     */
    public String getNatureUe9() {
        return natureUe9;
    }

    /**
     * Setter method for natureUe9.
     *
     * @param aNatureUe9 the new value for natureUe9
     */
    public void setNatureUe9(String aNatureUe9) {
        natureUe9 = aNatureUe9;
    }

    /**
     * Access method for natureUe10.
     *
     * @return the current value of natureUe10
     */
    public String getNatureUe10() {
        return natureUe10;
    }

    /**
     * Setter method for natureUe10.
     *
     * @param aNatureUe10 the new value for natureUe10
     */
    public void setNatureUe10(String aNatureUe10) {
        natureUe10 = aNatureUe10;
    }

    /**
     * Access method for natureUe11.
     *
     * @return the current value of natureUe11
     */
    public String getNatureUe11() {
        return natureUe11;
    }

    /**
     * Setter method for natureUe11.
     *
     * @param aNatureUe11 the new value for natureUe11
     */
    public void setNatureUe11(String aNatureUe11) {
        natureUe11 = aNatureUe11;
    }

    /**
     * Access method for natureUe12.
     *
     * @return the current value of natureUe12
     */
    public String getNatureUe12() {
        return natureUe12;
    }

    /**
     * Setter method for natureUe12.
     *
     * @param aNatureUe12 the new value for natureUe12
     */
    public void setNatureUe12(String aNatureUe12) {
        natureUe12 = aNatureUe12;
    }

    /**
     * Access method for natureUe13.
     *
     * @return the current value of natureUe13
     */
    public String getNatureUe13() {
        return natureUe13;
    }

    /**
     * Setter method for natureUe13.
     *
     * @param aNatureUe13 the new value for natureUe13
     */
    public void setNatureUe13(String aNatureUe13) {
        natureUe13 = aNatureUe13;
    }

    /**
     * Access method for natureUe14.
     *
     * @return the current value of natureUe14
     */
    public String getNatureUe14() {
        return natureUe14;
    }

    /**
     * Setter method for natureUe14.
     *
     * @param aNatureUe14 the new value for natureUe14
     */
    public void setNatureUe14(String aNatureUe14) {
        natureUe14 = aNatureUe14;
    }

    /**
     * Access method for natureUe15.
     *
     * @return the current value of natureUe15
     */
    public String getNatureUe15() {
        return natureUe15;
    }

    /**
     * Setter method for natureUe15.
     *
     * @param aNatureUe15 the new value for natureUe15
     */
    public void setNatureUe15(String aNatureUe15) {
        natureUe15 = aNatureUe15;
    }

    /**
     * Access method for natureUe16.
     *
     * @return the current value of natureUe16
     */
    public String getNatureUe16() {
        return natureUe16;
    }

    /**
     * Setter method for natureUe16.
     *
     * @param aNatureUe16 the new value for natureUe16
     */
    public void setNatureUe16(String aNatureUe16) {
        natureUe16 = aNatureUe16;
    }

    /**
     * Access method for natureUe17.
     *
     * @return the current value of natureUe17
     */
    public String getNatureUe17() {
        return natureUe17;
    }

    /**
     * Setter method for natureUe17.
     *
     * @param aNatureUe17 the new value for natureUe17
     */
    public void setNatureUe17(String aNatureUe17) {
        natureUe17 = aNatureUe17;
    }

    /**
     * Access method for natureUe18.
     *
     * @return the current value of natureUe18
     */
    public String getNatureUe18() {
        return natureUe18;
    }

    /**
     * Setter method for natureUe18.
     *
     * @param aNatureUe18 the new value for natureUe18
     */
    public void setNatureUe18(String aNatureUe18) {
        natureUe18 = aNatureUe18;
    }

    /**
     * Access method for natureUe19.
     *
     * @return the current value of natureUe19
     */
    public String getNatureUe19() {
        return natureUe19;
    }

    /**
     * Setter method for natureUe19.
     *
     * @param aNatureUe19 the new value for natureUe19
     */
    public void setNatureUe19(String aNatureUe19) {
        natureUe19 = aNatureUe19;
    }

    /**
     * Access method for natureUe20.
     *
     * @return the current value of natureUe20
     */
    public String getNatureUe20() {
        return natureUe20;
    }

    /**
     * Setter method for natureUe20.
     *
     * @param aNatureUe20 the new value for natureUe20
     */
    public void setNatureUe20(String aNatureUe20) {
        natureUe20 = aNatureUe20;
    }

    /**
     * Access method for natureUe21.
     *
     * @return the current value of natureUe21
     */
    public String getNatureUe21() {
        return natureUe21;
    }

    /**
     * Setter method for natureUe21.
     *
     * @param aNatureUe21 the new value for natureUe21
     */
    public void setNatureUe21(String aNatureUe21) {
        natureUe21 = aNatureUe21;
    }

    /**
     * Access method for natureUe22.
     *
     * @return the current value of natureUe22
     */
    public String getNatureUe22() {
        return natureUe22;
    }

    /**
     * Setter method for natureUe22.
     *
     * @param aNatureUe22 the new value for natureUe22
     */
    public void setNatureUe22(String aNatureUe22) {
        natureUe22 = aNatureUe22;
    }

    /**
     * Access method for natureUe23.
     *
     * @return the current value of natureUe23
     */
    public String getNatureUe23() {
        return natureUe23;
    }

    /**
     * Setter method for natureUe23.
     *
     * @param aNatureUe23 the new value for natureUe23
     */
    public void setNatureUe23(String aNatureUe23) {
        natureUe23 = aNatureUe23;
    }

    /**
     * Access method for natureUe24.
     *
     * @return the current value of natureUe24
     */
    public String getNatureUe24() {
        return natureUe24;
    }

    /**
     * Setter method for natureUe24.
     *
     * @param aNatureUe24 the new value for natureUe24
     */
    public void setNatureUe24(String aNatureUe24) {
        natureUe24 = aNatureUe24;
    }

    /**
     * Access method for natureUe25.
     *
     * @return the current value of natureUe25
     */
    public String getNatureUe25() {
        return natureUe25;
    }

    /**
     * Setter method for natureUe25.
     *
     * @param aNatureUe25 the new value for natureUe25
     */
    public void setNatureUe25(String aNatureUe25) {
        natureUe25 = aNatureUe25;
    }

    /**
     * Access method for natureUe26.
     *
     * @return the current value of natureUe26
     */
    public String getNatureUe26() {
        return natureUe26;
    }

    /**
     * Setter method for natureUe26.
     *
     * @param aNatureUe26 the new value for natureUe26
     */
    public void setNatureUe26(String aNatureUe26) {
        natureUe26 = aNatureUe26;
    }

    /**
     * Access method for natureUe27.
     *
     * @return the current value of natureUe27
     */
    public String getNatureUe27() {
        return natureUe27;
    }

    /**
     * Setter method for natureUe27.
     *
     * @param aNatureUe27 the new value for natureUe27
     */
    public void setNatureUe27(String aNatureUe27) {
        natureUe27 = aNatureUe27;
    }

    /**
     * Access method for natureUe28.
     *
     * @return the current value of natureUe28
     */
    public String getNatureUe28() {
        return natureUe28;
    }

    /**
     * Setter method for natureUe28.
     *
     * @param aNatureUe28 the new value for natureUe28
     */
    public void setNatureUe28(String aNatureUe28) {
        natureUe28 = aNatureUe28;
    }

    /**
     * Access method for natureUe29.
     *
     * @return the current value of natureUe29
     */
    public String getNatureUe29() {
        return natureUe29;
    }

    /**
     * Setter method for natureUe29.
     *
     * @param aNatureUe29 the new value for natureUe29
     */
    public void setNatureUe29(String aNatureUe29) {
        natureUe29 = aNatureUe29;
    }

    /**
     * Access method for natureUe30.
     *
     * @return the current value of natureUe30
     */
    public String getNatureUe30() {
        return natureUe30;
    }

    /**
     * Setter method for natureUe30.
     *
     * @param aNatureUe30 the new value for natureUe30
     */
    public void setNatureUe30(String aNatureUe30) {
        natureUe30 = aNatureUe30;
    }

    /**
     * Access method for natureUe31.
     *
     * @return the current value of natureUe31
     */
    public String getNatureUe31() {
        return natureUe31;
    }

    /**
     * Setter method for natureUe31.
     *
     * @param aNatureUe31 the new value for natureUe31
     */
    public void setNatureUe31(String aNatureUe31) {
        natureUe31 = aNatureUe31;
    }

    /**
     * Access method for natureUe32.
     *
     * @return the current value of natureUe32
     */
    public String getNatureUe32() {
        return natureUe32;
    }

    /**
     * Setter method for natureUe32.
     *
     * @param aNatureUe32 the new value for natureUe32
     */
    public void setNatureUe32(String aNatureUe32) {
        natureUe32 = aNatureUe32;
    }

    /**
     * Access method for natureUe33.
     *
     * @return the current value of natureUe33
     */
    public String getNatureUe33() {
        return natureUe33;
    }

    /**
     * Setter method for natureUe33.
     *
     * @param aNatureUe33 the new value for natureUe33
     */
    public void setNatureUe33(String aNatureUe33) {
        natureUe33 = aNatureUe33;
    }

    /**
     * Access method for natureUe34.
     *
     * @return the current value of natureUe34
     */
    public String getNatureUe34() {
        return natureUe34;
    }

    /**
     * Setter method for natureUe34.
     *
     * @param aNatureUe34 the new value for natureUe34
     */
    public void setNatureUe34(String aNatureUe34) {
        natureUe34 = aNatureUe34;
    }

    /**
     * Access method for natureUe35.
     *
     * @return the current value of natureUe35
     */
    public String getNatureUe35() {
        return natureUe35;
    }

    /**
     * Setter method for natureUe35.
     *
     * @param aNatureUe35 the new value for natureUe35
     */
    public void setNatureUe35(String aNatureUe35) {
        natureUe35 = aNatureUe35;
    }

    /**
     * Access method for natureUe36.
     *
     * @return the current value of natureUe36
     */
    public String getNatureUe36() {
        return natureUe36;
    }

    /**
     * Setter method for natureUe36.
     *
     * @param aNatureUe36 the new value for natureUe36
     */
    public void setNatureUe36(String aNatureUe36) {
        natureUe36 = aNatureUe36;
    }

    /**
     * Access method for natureUe37.
     *
     * @return the current value of natureUe37
     */
    public String getNatureUe37() {
        return natureUe37;
    }

    /**
     * Setter method for natureUe37.
     *
     * @param aNatureUe37 the new value for natureUe37
     */
    public void setNatureUe37(String aNatureUe37) {
        natureUe37 = aNatureUe37;
    }

    /**
     * Access method for natureUe38.
     *
     * @return the current value of natureUe38
     */
    public String getNatureUe38() {
        return natureUe38;
    }

    /**
     * Setter method for natureUe38.
     *
     * @param aNatureUe38 the new value for natureUe38
     */
    public void setNatureUe38(String aNatureUe38) {
        natureUe38 = aNatureUe38;
    }

    /**
     * Access method for natureUe39.
     *
     * @return the current value of natureUe39
     */
    public String getNatureUe39() {
        return natureUe39;
    }

    /**
     * Setter method for natureUe39.
     *
     * @param aNatureUe39 the new value for natureUe39
     */
    public void setNatureUe39(String aNatureUe39) {
        natureUe39 = aNatureUe39;
    }

    /**
     * Access method for natureUe40.
     *
     * @return the current value of natureUe40
     */
    public String getNatureUe40() {
        return natureUe40;
    }

    /**
     * Setter method for natureUe40.
     *
     * @param aNatureUe40 the new value for natureUe40
     */
    public void setNatureUe40(String aNatureUe40) {
        natureUe40 = aNatureUe40;
    }

    /**
     * Access method for natureUe41.
     *
     * @return the current value of natureUe41
     */
    public String getNatureUe41() {
        return natureUe41;
    }

    /**
     * Setter method for natureUe41.
     *
     * @param aNatureUe41 the new value for natureUe41
     */
    public void setNatureUe41(String aNatureUe41) {
        natureUe41 = aNatureUe41;
    }

    /**
     * Access method for natureUe42.
     *
     * @return the current value of natureUe42
     */
    public String getNatureUe42() {
        return natureUe42;
    }

    /**
     * Setter method for natureUe42.
     *
     * @param aNatureUe42 the new value for natureUe42
     */
    public void setNatureUe42(String aNatureUe42) {
        natureUe42 = aNatureUe42;
    }

    /**
     * Access method for natureUe43.
     *
     * @return the current value of natureUe43
     */
    public String getNatureUe43() {
        return natureUe43;
    }

    /**
     * Setter method for natureUe43.
     *
     * @param aNatureUe43 the new value for natureUe43
     */
    public void setNatureUe43(String aNatureUe43) {
        natureUe43 = aNatureUe43;
    }

    /**
     * Access method for natureUe44.
     *
     * @return the current value of natureUe44
     */
    public String getNatureUe44() {
        return natureUe44;
    }

    /**
     * Setter method for natureUe44.
     *
     * @param aNatureUe44 the new value for natureUe44
     */
    public void setNatureUe44(String aNatureUe44) {
        natureUe44 = aNatureUe44;
    }

    /**
     * Access method for natureUe45.
     *
     * @return the current value of natureUe45
     */
    public String getNatureUe45() {
        return natureUe45;
    }

    /**
     * Setter method for natureUe45.
     *
     * @param aNatureUe45 the new value for natureUe45
     */
    public void setNatureUe45(String aNatureUe45) {
        natureUe45 = aNatureUe45;
    }

    /**
     * Access method for natureUe46.
     *
     * @return the current value of natureUe46
     */
    public String getNatureUe46() {
        return natureUe46;
    }

    /**
     * Setter method for natureUe46.
     *
     * @param aNatureUe46 the new value for natureUe46
     */
    public void setNatureUe46(String aNatureUe46) {
        natureUe46 = aNatureUe46;
    }

    /**
     * Access method for natureUe47.
     *
     * @return the current value of natureUe47
     */
    public String getNatureUe47() {
        return natureUe47;
    }

    /**
     * Setter method for natureUe47.
     *
     * @param aNatureUe47 the new value for natureUe47
     */
    public void setNatureUe47(String aNatureUe47) {
        natureUe47 = aNatureUe47;
    }

    /**
     * Access method for natureUe48.
     *
     * @return the current value of natureUe48
     */
    public String getNatureUe48() {
        return natureUe48;
    }

    /**
     * Setter method for natureUe48.
     *
     * @param aNatureUe48 the new value for natureUe48
     */
    public void setNatureUe48(String aNatureUe48) {
        natureUe48 = aNatureUe48;
    }

    /**
     * Access method for natureUe49.
     *
     * @return the current value of natureUe49
     */
    public String getNatureUe49() {
        return natureUe49;
    }

    /**
     * Setter method for natureUe49.
     *
     * @param aNatureUe49 the new value for natureUe49
     */
    public void setNatureUe49(String aNatureUe49) {
        natureUe49 = aNatureUe49;
    }

    /**
     * Access method for natureUe50.
     *
     * @return the current value of natureUe50
     */
    public String getNatureUe50() {
        return natureUe50;
    }

    /**
     * Setter method for natureUe50.
     *
     * @param aNatureUe50 the new value for natureUe50
     */
    public void setNatureUe50(String aNatureUe50) {
        natureUe50 = aNatureUe50;
    }

    /**
     * Access method for natureUe51.
     *
     * @return the current value of natureUe51
     */
    public String getNatureUe51() {
        return natureUe51;
    }

    /**
     * Setter method for natureUe51.
     *
     * @param aNatureUe51 the new value for natureUe51
     */
    public void setNatureUe51(String aNatureUe51) {
        natureUe51 = aNatureUe51;
    }

    /**
     * Access method for natureUe52.
     *
     * @return the current value of natureUe52
     */
    public String getNatureUe52() {
        return natureUe52;
    }

    /**
     * Setter method for natureUe52.
     *
     * @param aNatureUe52 the new value for natureUe52
     */
    public void setNatureUe52(String aNatureUe52) {
        natureUe52 = aNatureUe52;
    }

    /**
     * Access method for natureUe53.
     *
     * @return the current value of natureUe53
     */
    public String getNatureUe53() {
        return natureUe53;
    }

    /**
     * Setter method for natureUe53.
     *
     * @param aNatureUe53 the new value for natureUe53
     */
    public void setNatureUe53(String aNatureUe53) {
        natureUe53 = aNatureUe53;
    }

    /**
     * Access method for natureUe54.
     *
     * @return the current value of natureUe54
     */
    public String getNatureUe54() {
        return natureUe54;
    }

    /**
     * Setter method for natureUe54.
     *
     * @param aNatureUe54 the new value for natureUe54
     */
    public void setNatureUe54(String aNatureUe54) {
        natureUe54 = aNatureUe54;
    }

    /**
     * Access method for natureUe55.
     *
     * @return the current value of natureUe55
     */
    public String getNatureUe55() {
        return natureUe55;
    }

    /**
     * Setter method for natureUe55.
     *
     * @param aNatureUe55 the new value for natureUe55
     */
    public void setNatureUe55(String aNatureUe55) {
        natureUe55 = aNatureUe55;
    }

    /**
     * Access method for natureUe56.
     *
     * @return the current value of natureUe56
     */
    public String getNatureUe56() {
        return natureUe56;
    }

    /**
     * Setter method for natureUe56.
     *
     * @param aNatureUe56 the new value for natureUe56
     */
    public void setNatureUe56(String aNatureUe56) {
        natureUe56 = aNatureUe56;
    }

    /**
     * Access method for natureUe57.
     *
     * @return the current value of natureUe57
     */
    public String getNatureUe57() {
        return natureUe57;
    }

    /**
     * Setter method for natureUe57.
     *
     * @param aNatureUe57 the new value for natureUe57
     */
    public void setNatureUe57(String aNatureUe57) {
        natureUe57 = aNatureUe57;
    }

    /**
     * Access method for natureUe58.
     *
     * @return the current value of natureUe58
     */
    public String getNatureUe58() {
        return natureUe58;
    }

    /**
     * Setter method for natureUe58.
     *
     * @param aNatureUe58 the new value for natureUe58
     */
    public void setNatureUe58(String aNatureUe58) {
        natureUe58 = aNatureUe58;
    }

    /**
     * Access method for natureUe59.
     *
     * @return the current value of natureUe59
     */
    public String getNatureUe59() {
        return natureUe59;
    }

    /**
     * Setter method for natureUe59.
     *
     * @param aNatureUe59 the new value for natureUe59
     */
    public void setNatureUe59(String aNatureUe59) {
        natureUe59 = aNatureUe59;
    }

    /**
     * Access method for natureUe60.
     *
     * @return the current value of natureUe60
     */
    public String getNatureUe60() {
        return natureUe60;
    }

    /**
     * Setter method for natureUe60.
     *
     * @param aNatureUe60 the new value for natureUe60
     */
    public void setNatureUe60(String aNatureUe60) {
        natureUe60 = aNatureUe60;
    }

    /**
     * Compares the key for this instance with another EspPvClasse.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspPvClasse and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspPvClasse)) {
            return false;
        }
        EspPvClasse that = (EspPvClasse) other;
        Object myCodeCl = this.getCodeCl();
        Object yourCodeCl = that.getCodeCl();
        if (myCodeCl==null ? yourCodeCl!=null : !myCodeCl.equals(yourCodeCl)) {
            return false;
        }
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        Object myAnnee = this.getAnnee();
        Object yourAnnee = that.getAnnee();
        if (myAnnee==null ? yourAnnee!=null : !myAnnee.equals(yourAnnee)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspPvClasse.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspPvClasse)) return false;
        return this.equalKeys(other) && ((EspPvClasse)other).equalKeys(this);
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
        if (getCodeCl() == null) {
            i = 0;
        } else {
            i = getCodeCl().hashCode();
        }
        result = 37*result + i;
        if (getIdEt() == null) {
            i = 0;
        } else {
            i = getIdEt().hashCode();
        }
        result = 37*result + i;
        if (getAnnee() == null) {
            i = 0;
        } else {
            i = getAnnee().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspPvClasse |");
        sb.append(" codeCl=").append(getCodeCl());
        sb.append(" idEt=").append(getIdEt());
        sb.append(" annee=").append(getAnnee());
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
        ret.put("codeCl", getCodeCl());
        ret.put("idEt", getIdEt());
        ret.put("annee", getAnnee());
        return ret;
    }

}
