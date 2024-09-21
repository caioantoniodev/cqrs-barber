package tech.dev.msbarbercommand.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CustomerDto(
        Long id,
        @NotBlank String name,
        @NotBlank @Email String email,
        @NotBlank String phone) {
}
