package br.com.jamesmayke.gestao_vagas.modules.company.repository;

import br.com.jamesmayke.gestao_vagas.modules.company.entities.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobRepository extends JpaRepository<JobEntity, UUID> {
}
