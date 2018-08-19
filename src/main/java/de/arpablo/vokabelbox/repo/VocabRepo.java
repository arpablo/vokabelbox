/**
 * 
 */
package de.arpablo.vokabelbox.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import de.arpablo.vokabelbox.model.Vocab;

/**
 * @author arpablo
 *
 */
@RepositoryRestResource(collectionResourceRel = "vocabs", path = "vocabs")
public interface VocabRepo extends JpaRepository<Vocab, Long>{

}
