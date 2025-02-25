package ir.javapro.libraryproject.repositories;

import ir.javapro.libraryproject.model.ShoppingCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCardRepository extends JpaRepository<ShoppingCard, Long> {
}
