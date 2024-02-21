package com.examen.examen.dto;

import java.util.Date;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.PositiveOrZero;


public class TransferRequestDto {

    private long playerId;

    private long fromTeamId;

    private long toTeamId;

    @PositiveOrZero
    private Double transferFee;

    @NotNull
    @PastOrPresent
    private Date date;

    public TransferRequestDto() {
    }

    public TransferRequestDto(long playerId, long fromTeamId, long toTeamId, @PositiveOrZero Double transferFee,
            @NotNull @PastOrPresent Date date) {
        this.playerId = playerId;
        this.fromTeamId = fromTeamId;
        this.toTeamId = toTeamId;
        this.transferFee = transferFee;
        this.date = date;
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
