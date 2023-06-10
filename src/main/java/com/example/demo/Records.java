package com.example.demo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Table(name="records1")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Records {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long claim_id;

    public Long getClaim_id() {
        return claim_id;
    }

    public void setClaim_id(Long claim_id) {
        claim_id = claim_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        ailment = ailment;
    }

    public String getSLA() {
        return SLA;
    }

    public void setSLA(String SLA) {
        this.SLA = SLA;
    }

    public String getP_TAT() {
        return P_TAT;
    }

    public void setP_TAT(String p_TAT) {
        P_TAT = p_TAT;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        stage = stage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        status = status;
    }

    public String getApproved_Amount() {
        return approved_Amount;
    }

    public void setApproved_Amount(String approved_Amount) {
        approved_Amount = approved_Amount;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        hospital = hospital;
    }

    @Column
    private String name;
    @Column
    private String ailment;
    @Column
    private String SLA;
    @Column
    private String P_TAT;
    @Column
    private String stage;
    @Column
    private String status;
    @Column
    private String approved_Amount;
    @Column
    private String hospital;

}
