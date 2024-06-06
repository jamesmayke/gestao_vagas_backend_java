package br.com.jamesmayke.gestao_vagas.modules.candidate.entity;

import java.util.UUID;

public record CandidateEntityRecord(
        UUID id,
        String name,
        String username,
        String email,
        String password,
        String description
) {
}
