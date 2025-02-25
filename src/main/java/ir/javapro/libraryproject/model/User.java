package ir.javapro.libraryproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Setter
@Getter
@Table(schema = SchemaName.schemaName)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity{

    private String username;
    private String password;


}
