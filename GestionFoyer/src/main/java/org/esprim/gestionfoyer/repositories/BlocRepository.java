// bloc repository
//sous forme de interfaces
//tout les blocs sont similaires sauf le nom dans la liste a changer
package org.esprim.gestionfoyer.repositories;

import org.esprim.gestionfoyer.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
