/**
 * 
 */
package de.arpablo.vokabelbox.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import de.arpablo.vokabelbox.model.Box;

/**
 * @author arpablo
 *
 */
@RepositoryRestResource(collectionResourceRel = "boxes", path = "boxes")
@CrossOrigin
public interface BoxRepo extends JpaRepository<Box, Long>{

	public Optional<Box> findOneByName(String name);
}
