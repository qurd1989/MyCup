package org.myCompany.mycup.dto;
/**
 * The FakeStoreProductResponseDto class is used to map the response from an
 * external service, like the Fake Store API. It serves as an intermediary
 * between the external service's response and the application's internal models.
 * - In the service layer, this DTO is used to map the response from external APIs.
 * - After mapping, the data is converted into the internal Product model or ProductResponseDto.
 * - This allows your application to abstract away the specifics of the external API, maintaining consistency.
 */
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductResponseDto {
    private Long id;
    private String title ;
    private String description ;
    private Double price;
    private String image;
    private String category;
}
