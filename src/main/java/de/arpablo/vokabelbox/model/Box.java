/**
 * 
 */
package de.arpablo.vokabelbox.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author arpablo
 *
 */
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "arp_box")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Box {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @EqualsAndHashCode.Include
    private Long id;
	
	@Column(name="box_name")
	private String name;
	
    @ManyToMany
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    @JoinTable(name = "arp_box2vocab",
               joinColumns = @JoinColumn(name = "box_id", referencedColumnName = "id"),
               inverseJoinColumns = @JoinColumn(name = "vocab_id", referencedColumnName = "id"))
	private Set<Vokabel> vocabs = new HashSet<>();
	
	public Box() {
		
	}
	
	public Box(String name) {
		this.name = name;
	}
	
	public Box addVocab(Vokabel vocab) {
		this.vocabs.add(vocab);
		vocab.getBoxes().add(this);
		return this;
	}
	
}
