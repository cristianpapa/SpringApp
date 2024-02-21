package com.examen.examen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import com.examen.examen.model.Transfer;
import com.examen.examen.repository.TransferRepository;
import java.util.Date;
import java.util.List;

@Service
public class TransferService {

    private final TransferRepository transferRepository;

    @Autowired
    public TransferService(TransferRepository transferRepository) {
        this.transferRepository = transferRepository;
    }

    public Transfer createTransfer(Transfer transfer) {
        if (transfer.getFromTeam() == null && transfer.getToTeam() == null) {
            throw new IllegalArgumentException("At least one team must be specified");
        }
        return transferRepository.save(transfer);
    }

    public Transfer findTransferById(Long transferId) {
        return transferRepository.findById(transferId).orElse(null);
    }

    public List<Transfer> findTransfersByPlayerId(Long playerId) {
        return transferRepository.findByPlayerId(playerId);
    }

    public List<Transfer> findTransfersByFromTeamId(Long teamId) {
        return transferRepository.findByFromTeamId(teamId);
    }

    public List<Transfer> findTransfersByToTeamId(Long teamId) {
        return transferRepository.findByToTeamId(teamId);
    }

    public List<Transfer> findTransfersByDateRange(Date startDate, Date endDate) {
        return transferRepository.findByDateBetween(startDate, endDate);
    }

    public List<Transfer> getAllTransfers() {
        return transferRepository.findAll();
    }

   public boolean deleteTransfer(Long transferId) {
    try {
        transferRepository.deleteById(transferId);
        return true; // Successfully deleted
    } catch (EmptyResultDataAccessException e) {
        return false; // Transfer with the given ID not found
    }
}

}
