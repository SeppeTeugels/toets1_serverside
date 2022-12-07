package be.thomasmore.bookserver.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Award {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @NotBlank(message = "Award Title should not be blank")
    @NotNull
    private String title;

    private String info;
    private String country;

    @ManyToMany(mappedBy = "awards", fetch = FetchType.LAZY)
    private Set<Book> books;
}
