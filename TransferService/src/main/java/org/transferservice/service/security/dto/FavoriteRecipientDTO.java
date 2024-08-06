package org.transferservice.service.security.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FavoriteRecipientDTO {

    private String firstName;

    private String lastName;

    private String recipientAccountNumber;


}
