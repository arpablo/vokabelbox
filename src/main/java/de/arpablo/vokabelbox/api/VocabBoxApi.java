/**
 * 
 */
package de.arpablo.vokabelbox.api;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arp
 *
 */
@RestController
@RequestMapping("/api")
public class VocabBoxApi {

	
	private static final Logger log = LoggerFactory.getLogger(VocabBoxApi.class);

	@GetMapping({"/exercise","/exercise/{pUser}","/exercise/{pUser}/{pBox}"})
	public void exercise(@PathVariable Optional<String> pUser,
			@PathVariable Optional<String> pBox) {
		String user = pUser.isPresent()? pUser.get() : "all";
		String box = pBox.isPresent()? pBox.get() : "all";
		log.info("Called /exercise/{}/{}", user, box);
	}
}
