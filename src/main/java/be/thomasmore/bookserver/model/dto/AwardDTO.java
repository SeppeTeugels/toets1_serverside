package be.thomasmore.bookserver.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AwardDTO {
    private int id;
    private String title;
    private String info;
    private String country;
}
