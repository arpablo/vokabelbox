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
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author arpablo
 *
 */
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "arp_vocab")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Vokabel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name="level")
    private int level = 1;
    @Column(name = "source_text")
	private String sourceText;
    @Column(name = "source_annotation")
    private String sourceAnnotation;
    @Column(name = "target_text")
    private String targetText;
    @Column(name = "target_annotation")
    private String targetAnnotation;
	
    @ManyToMany(mappedBy = "vocabs")
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Box> boxes = new HashSet<>();
	
    
}
