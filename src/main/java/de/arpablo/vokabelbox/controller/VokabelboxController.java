/**
 * 
 */
package de.arpablo.vokabelbox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author arpablo
 *
 */
@Controller
public class VokabelboxController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
}
