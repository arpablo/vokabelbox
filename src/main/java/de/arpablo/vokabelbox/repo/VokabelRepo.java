/**
 * 
 */
package de.arpablo.vokabelbox.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import de.arpablo.vokabelbox.model.Vokabel;

/**
 * @author arpablo
 *
 */
@RepositoryRestResource(collectionResourceRel = "vocabs", path = "vocabs")
public interface VokabelRepo extends JpaRepository<Vokabel, Long>{

}
