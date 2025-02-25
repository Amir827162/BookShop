package ir.javapro.libraryproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(schema = SchemaName.schemaName)
public class ShoppingCard extends BaseEntity{


    private int count;
    @ManyToOne
    private Factor factor;
    @ManyToOne
    private Book book;
}
