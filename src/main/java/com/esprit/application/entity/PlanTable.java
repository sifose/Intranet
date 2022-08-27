// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="PLAN_TABLE")
public class PlanTable implements Serializable {

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
    @Column(name="STATEMENT_ID", length=30)
    private String statementId;
    @Column(name="TIMESTAMP")
    private LocalDateTime timestamp;
    @Column(name="REMARKS", length=80)
    private String remarks;
    @Column(name="OPERATION", length=30)
    private String operation;
    @Column(name="OPTIONS", length=255)
    private String options;
    @Column(name="OBJECT_NODE", length=128)
    private String objectNode;
    @Column(name="OBJECT_OWNER", length=30)
    private String objectOwner;
    @Column(name="OBJECT_NAME", length=30)
    private String objectName;
    @Column(name="OBJECT_INSTANCE", precision=38)
    private BigDecimal objectInstance;
    @Column(name="OBJECT_TYPE", length=30)
    private String objectType;
    @Column(name="OPTIMIZER", length=255)
    private String optimizer;
    @Column(name="SEARCH_COLUMNS")
    private BigDecimal searchColumns;
    @Column(name="ID", precision=38)
    private BigDecimal id;
    @Column(name="PARENT_ID", precision=38)
    private BigDecimal parentId;
    @Column(name="POSITION", precision=38)
    private BigDecimal position;
    @Column(name="COST", precision=38)
    private BigDecimal cost;
    @Column(name="CARDINALITY", precision=38)
    private BigDecimal cardinality;
    @Column(name="BYTES", precision=38)
    private BigDecimal bytes;
    @Column(name="OTHER_TAG", length=255)
    private String otherTag;
    @Column(name="PARTITION_START", length=255)
    private String partitionStart;
    @Column(name="PARTITION_STOP", length=255)
    private String partitionStop;
    @Column(name="PARTITION_ID", precision=38)
    private BigDecimal partitionId;
    @Column(name="OTHER")
    private String other;
    @Column(name="DISTRIBUTION", length=30)
    private String distribution;
    @Column(name="CPU_COST", precision=38)
    private BigDecimal cpuCost;
    @Column(name="IO_COST", precision=38)
    private BigDecimal ioCost;
    @Column(name="TEMP_SPACE", precision=38)
    private BigDecimal tempSpace;

    /** Default constructor. */
    public PlanTable() {
        super();
    }

    /**
     * Access method for statementId.
     *
     * @return the current value of statementId
     */
    public String getStatementId() {
        return statementId;
    }

    /**
     * Setter method for statementId.
     *
     * @param aStatementId the new value for statementId
     */
    public void setStatementId(String aStatementId) {
        statementId = aStatementId;
    }

    /**
     * Access method for timestamp.
     *
     * @return the current value of timestamp
     */
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * Setter method for timestamp.
     *
     * @param aTimestamp the new value for timestamp
     */
    public void setTimestamp(LocalDateTime aTimestamp) {
        timestamp = aTimestamp;
    }

    /**
     * Access method for remarks.
     *
     * @return the current value of remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Setter method for remarks.
     *
     * @param aRemarks the new value for remarks
     */
    public void setRemarks(String aRemarks) {
        remarks = aRemarks;
    }

    /**
     * Access method for operation.
     *
     * @return the current value of operation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Setter method for operation.
     *
     * @param aOperation the new value for operation
     */
    public void setOperation(String aOperation) {
        operation = aOperation;
    }

    /**
     * Access method for options.
     *
     * @return the current value of options
     */
    public String getOptions() {
        return options;
    }

    /**
     * Setter method for options.
     *
     * @param aOptions the new value for options
     */
    public void setOptions(String aOptions) {
        options = aOptions;
    }

    /**
     * Access method for objectNode.
     *
     * @return the current value of objectNode
     */
    public String getObjectNode() {
        return objectNode;
    }

    /**
     * Setter method for objectNode.
     *
     * @param aObjectNode the new value for objectNode
     */
    public void setObjectNode(String aObjectNode) {
        objectNode = aObjectNode;
    }

    /**
     * Access method for objectOwner.
     *
     * @return the current value of objectOwner
     */
    public String getObjectOwner() {
        return objectOwner;
    }

    /**
     * Setter method for objectOwner.
     *
     * @param aObjectOwner the new value for objectOwner
     */
    public void setObjectOwner(String aObjectOwner) {
        objectOwner = aObjectOwner;
    }

    /**
     * Access method for objectName.
     *
     * @return the current value of objectName
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * Setter method for objectName.
     *
     * @param aObjectName the new value for objectName
     */
    public void setObjectName(String aObjectName) {
        objectName = aObjectName;
    }

    /**
     * Access method for objectInstance.
     *
     * @return the current value of objectInstance
     */
    public BigDecimal getObjectInstance() {
        return objectInstance;
    }

    /**
     * Setter method for objectInstance.
     *
     * @param aObjectInstance the new value for objectInstance
     */
    public void setObjectInstance(BigDecimal aObjectInstance) {
        objectInstance = aObjectInstance;
    }

    /**
     * Access method for objectType.
     *
     * @return the current value of objectType
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Setter method for objectType.
     *
     * @param aObjectType the new value for objectType
     */
    public void setObjectType(String aObjectType) {
        objectType = aObjectType;
    }

    /**
     * Access method for optimizer.
     *
     * @return the current value of optimizer
     */
    public String getOptimizer() {
        return optimizer;
    }

    /**
     * Setter method for optimizer.
     *
     * @param aOptimizer the new value for optimizer
     */
    public void setOptimizer(String aOptimizer) {
        optimizer = aOptimizer;
    }

    /**
     * Access method for searchColumns.
     *
     * @return the current value of searchColumns
     */
    public BigDecimal getSearchColumns() {
        return searchColumns;
    }

    /**
     * Setter method for searchColumns.
     *
     * @param aSearchColumns the new value for searchColumns
     */
    public void setSearchColumns(BigDecimal aSearchColumns) {
        searchColumns = aSearchColumns;
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
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(BigDecimal aId) {
        id = aId;
    }

    /**
     * Access method for parentId.
     *
     * @return the current value of parentId
     */
    public BigDecimal getParentId() {
        return parentId;
    }

    /**
     * Setter method for parentId.
     *
     * @param aParentId the new value for parentId
     */
    public void setParentId(BigDecimal aParentId) {
        parentId = aParentId;
    }

    /**
     * Access method for position.
     *
     * @return the current value of position
     */
    public BigDecimal getPosition() {
        return position;
    }

    /**
     * Setter method for position.
     *
     * @param aPosition the new value for position
     */
    public void setPosition(BigDecimal aPosition) {
        position = aPosition;
    }

    /**
     * Access method for cost.
     *
     * @return the current value of cost
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * Setter method for cost.
     *
     * @param aCost the new value for cost
     */
    public void setCost(BigDecimal aCost) {
        cost = aCost;
    }

    /**
     * Access method for cardinality.
     *
     * @return the current value of cardinality
     */
    public BigDecimal getCardinality() {
        return cardinality;
    }

    /**
     * Setter method for cardinality.
     *
     * @param aCardinality the new value for cardinality
     */
    public void setCardinality(BigDecimal aCardinality) {
        cardinality = aCardinality;
    }

    /**
     * Access method for bytes.
     *
     * @return the current value of bytes
     */
    public BigDecimal getBytes() {
        return bytes;
    }

    /**
     * Setter method for bytes.
     *
     * @param aBytes the new value for bytes
     */
    public void setBytes(BigDecimal aBytes) {
        bytes = aBytes;
    }

    /**
     * Access method for otherTag.
     *
     * @return the current value of otherTag
     */
    public String getOtherTag() {
        return otherTag;
    }

    /**
     * Setter method for otherTag.
     *
     * @param aOtherTag the new value for otherTag
     */
    public void setOtherTag(String aOtherTag) {
        otherTag = aOtherTag;
    }

    /**
     * Access method for partitionStart.
     *
     * @return the current value of partitionStart
     */
    public String getPartitionStart() {
        return partitionStart;
    }

    /**
     * Setter method for partitionStart.
     *
     * @param aPartitionStart the new value for partitionStart
     */
    public void setPartitionStart(String aPartitionStart) {
        partitionStart = aPartitionStart;
    }

    /**
     * Access method for partitionStop.
     *
     * @return the current value of partitionStop
     */
    public String getPartitionStop() {
        return partitionStop;
    }

    /**
     * Setter method for partitionStop.
     *
     * @param aPartitionStop the new value for partitionStop
     */
    public void setPartitionStop(String aPartitionStop) {
        partitionStop = aPartitionStop;
    }

    /**
     * Access method for partitionId.
     *
     * @return the current value of partitionId
     */
    public BigDecimal getPartitionId() {
        return partitionId;
    }

    /**
     * Setter method for partitionId.
     *
     * @param aPartitionId the new value for partitionId
     */
    public void setPartitionId(BigDecimal aPartitionId) {
        partitionId = aPartitionId;
    }

    /**
     * Access method for other.
     *
     * @return the current value of other
     */
    public String getOther() {
        return other;
    }

    /**
     * Setter method for other.
     *
     * @param aOther the new value for other
     */
    public void setOther(String aOther) {
        other = aOther;
    }

    /**
     * Access method for distribution.
     *
     * @return the current value of distribution
     */
    public String getDistribution() {
        return distribution;
    }

    /**
     * Setter method for distribution.
     *
     * @param aDistribution the new value for distribution
     */
    public void setDistribution(String aDistribution) {
        distribution = aDistribution;
    }

    /**
     * Access method for cpuCost.
     *
     * @return the current value of cpuCost
     */
    public BigDecimal getCpuCost() {
        return cpuCost;
    }

    /**
     * Setter method for cpuCost.
     *
     * @param aCpuCost the new value for cpuCost
     */
    public void setCpuCost(BigDecimal aCpuCost) {
        cpuCost = aCpuCost;
    }

    /**
     * Access method for ioCost.
     *
     * @return the current value of ioCost
     */
    public BigDecimal getIoCost() {
        return ioCost;
    }

    /**
     * Setter method for ioCost.
     *
     * @param aIoCost the new value for ioCost
     */
    public void setIoCost(BigDecimal aIoCost) {
        ioCost = aIoCost;
    }

    /**
     * Access method for tempSpace.
     *
     * @return the current value of tempSpace
     */
    public BigDecimal getTempSpace() {
        return tempSpace;
    }

    /**
     * Setter method for tempSpace.
     *
     * @param aTempSpace the new value for tempSpace
     */
    public void setTempSpace(BigDecimal aTempSpace) {
        tempSpace = aTempSpace;
    }

}
