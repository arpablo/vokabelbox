/**
 * 
 */
package de.arpablo.vokabelbox.service;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import de.arpablo.vokabelbox.model.Box;
import de.arpablo.vokabelbox.model.Vokabel;
import de.arpablo.vokabelbox.repo.BoxRepo;
import de.arpablo.vokabelbox.repo.VokabelRepo;

/**
 * @author arpablo
 *
 */
@Service
@Transactional
public class VokabelService {

	
	private static final Logger log = LoggerFactory.getLogger(VokabelService.class);

	private final VokabelRepo vokabelRepo;
	private final BoxRepo boxRepo;
//	private final CacheManager cacheManager;
	
	public VokabelService(VokabelRepo vokabelRepo, BoxRepo boxRepo /*, CacheManager cacheManager */) {
		this.vokabelRepo = vokabelRepo;
		this.boxRepo = boxRepo;
//		this.cacheManager = cacheManager;
	}
	
	public Box saveBox(Box box) {
		log.debug("Saving box " + box);
		return boxRepo.save(box);
	}
	
	public Page<Box> listAllBoxes(int page, int size) {
		log.debug("listing boxes");
		Pageable pageable = PageRequest.of(page, size);
		return boxRepo.findAll(pageable);
	}
	
	public Page<Box> listAllBoxesByPageable(Pageable pageable) {
		log.debug("listing boxes");
		return boxRepo.findAll(pageable);
	}
	
	public Vokabel saveVokabel(Vokabel vokabel) {
		log.debug("Saving vokabel " + vokabel);
		return vokabelRepo.save(vokabel);
	}
	
	public void deleteVokabel(Vokabel vokabel) {
		vokabelRepo.delete(vokabel);
	}
	
//	private void clearVakabelCache(Vokabel vokabel) {
//		log.debug("Evicting " + vokabel + " from cache");
//		cacheManager.getCacheNames();
//	}
}
