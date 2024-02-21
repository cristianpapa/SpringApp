package com.examen.examen.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import java.util.Date;

@Entity
@Table(name = "transfers")
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    @ManyToOne
    @JoinColumn(name = "from_team_id", nullable = false)
    private Team fromTeam;

    @ManyToOne
    @JoinColumn(name = "to_team_id", nullable = false)
    private Team toTeam;

    @NotNull
    @Positive
    private Double transferFee;

    @NotNull
    @PastOrPresent
    private Date date;

    public Transfer() {
    }

    public Transfer(Player player, Team fromTeam, Team toTeam, @NotNull @Positive Double transferFee,
            @NotNull @PastOrPresent Date date) {
        this.player = player;
        this.fromTeam = fromTeam;
        this.toTeam = toTeam;
        this.transferFee = transferFee;
        this.date = date;
    }

    public Transfer(Long id, Player player, Team fromTeam, Team toTeam, @NotNull @Positive Double transferFee,
            @NotNull @PastOrPresent Date date) {
        this.id = id;
        this.player = player;
        this.fromTeam = fromTeam;
        this.toTeam = toTeam;
        this.transferFee = transferFee;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Team getFromTeam() {
        return fromTeam;
    }

    public void setFromTeam(Team fromTeam) {
        this.fromTeam = fromTeam;
    }

    public Team getToTeam() {
        return toTeam;
    }

    public void setToTeam(Team toTeam) {
        this.toTeam = toTeam;
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
