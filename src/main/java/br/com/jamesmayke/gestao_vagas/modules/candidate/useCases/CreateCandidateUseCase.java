package br.com.jamesmayke.gestao_vagas.modules.candidate.useCases;

import br.com.jamesmayke.gestao_vagas.exceptions.UserFoundException;
import br.com.jamesmayke.gestao_vagas.modules.candidate.entity.CandidateEntity;
import br.com.jamesmayke.gestao_vagas.modules.candidate.entity.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCandidateUseCase {

    @Autowired
    private CandidateRepository candidateRepository;

    public CandidateEntity execute(CandidateEntity candidateEntity) {
        this.candidateRepository
                .findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundException();
                });
        return this.candidateRepository.save(candidateEntity);
    }

}
