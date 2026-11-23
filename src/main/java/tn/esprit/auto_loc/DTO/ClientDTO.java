package tn.esprit.auto_loc.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String dateInscription; // "19/07/2025" au lieu de LocalDate
}
