package com.examen.examen.dto;

import java.util.Date;


public class TransferResponseDto {

    private Long id;
    private long playerId;
    private long fromTeamId;
    private long toTeamId;
    private Double transferFee;
    private Date date;
    public TransferResponseDto() {
    }
    public TransferResponseDto(long playerId, long fromTeamId, long toTeamId, Double transferFee, Date date) {
        this.playerId = playerId;
        this.fromTeamId = fromTeamId;
        this.toTeamId = toTeamId;
        this.transferFee = transferFee;
        this.date = date;
    }
    public TransferResponseDto(Long id, long playerId, long fromTeamId, long toTeamId, Double transferFee, Date date) {
        this.id = id;
        this.playerId = playerId;
        this.fromTeamId = fromTeamId;
        this.toTeamId = toTeamId;
        this.transferFee = transferFee;
        this.date = date;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public long getPlayerId() {
        return playerId;
    }
    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }
    public long getFromTeamId() {
        return fromTeamId;
    }
    public void setFromTeamId(long fromTeamId) {
        this.fromTeamId = fromTeamId;
    }
    public long getToTeamId() {
        return toTeamId;
    }
    public void setToTeamId(long toTeamId) {
        this.toTeamId = toTeamId;
    }
    public Double getTransferFee() {
        return transferFee;
    }
    public void setTransferFee(Double transferFee) {
        this.transferFee = transferFee;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    
}
