/**
 * 
 */
package de.arpablo.vokabelbox.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import de.arpablo.vokabelbox.model.Box;
import de.arpablo.vokabelbox.service.VokabelService;

/**
 * @author arpablo
 *
 */
@Controller
public class VokabelboxController {

	
	private static final Logger log = LoggerFactory.getLogger(VokabelboxController.class);

	private static final int INITIAL_PAGE_SIZE = 2;
	private static final int INITIAL_PAGE = 0;
	
    private static final int[] PAGE_SIZES = {2, 5, 10, 20};
    private int pagesize = 2;
    
	@Autowired
	private VokabelService vokabelboxService;
	
	@GetMapping("/")
	public String index(@RequestParam("pageSize") Optional<Integer> pageSize,
            @RequestParam("page") Optional<Integer> page, Model model) {
		
		log.info("Using pageSize " + pageSize + " and page " + page);
		int evalPageSize = pageSize.orElse(INITIAL_PAGE_SIZE);
		int evalPage = (page.orElse(0) < 1) ? INITIAL_PAGE : page.get() - 1;
		
		Pageable pageable = PageRequest.of(evalPage, evalPageSize);
		Page<Box> boxes = vokabelboxService.listAllBoxesByPageable(pageable);
		model.addAttribute("boxes", boxes);
	    model.addAttribute("selectedPageSize", pagesize);
	    model.addAttribute("pageSizes", PAGE_SIZES);
	    Pager pager = new Pager(boxes.getTotalPages(), boxes.getNumber(), 5);
	    model.addAttribute("pager", pager);
		return "index";
	}
	
	@GetMapping("/boxes")
	String listBoxes(Pageable pageable) {
		Page<Box> ret = vokabelboxService.listAllBoxesByPageable(pageable);
		for(Box box : ret) {
			log.debug(box.toString());
		}
		return "index";
	}
}
