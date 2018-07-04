/**
 * 
 */
package de.arpablo.vokabelbox.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import de.arpablo.vokabelbox.model.Box;

/**
 * @author arpablo
 *
 */
public interface BoxRepo extends JpaRepository<Box, Long>{

	public Optional<Box> findOneByName(String name);
}
