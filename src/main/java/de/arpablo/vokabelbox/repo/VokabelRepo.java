/**
 * 
 */
package de.arpablo.vokabelbox.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import de.arpablo.vokabelbox.model.Vokabel;

/**
 * @author arpablo
 *
 */
public interface VokabelRepo extends JpaRepository<Vokabel, Long>{

}
