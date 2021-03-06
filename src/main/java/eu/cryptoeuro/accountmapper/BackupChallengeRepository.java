package eu.cryptoeuro.accountmapper;

import eu.cryptoeuro.accountmapper.domain.BackupChallenge;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BackupChallengeRepository extends CrudRepository<BackupChallenge,Long> {

    List<BackupChallenge> findByIdCode(Long idCode);
    List<BackupChallenge> findByIdCodeAndActive(Long idCode, boolean active);
    List<BackupChallenge> findByPlaintextAndActive(String plaintext, boolean active);
    List<BackupChallenge> findByPlaintextAndEncryptedAndActive(String plaintext, String encrypted, boolean active);

    void delete(Long id);
}
