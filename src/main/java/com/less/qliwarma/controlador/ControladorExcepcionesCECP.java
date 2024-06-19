/*package com.less.qliwarma.controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.less.qliwarma.modelo.Colegio;
import com.less.qliwarma.modelo.Encargado;
import com.less.qliwarma.service.ColegioService;
import com.less.qliwarma.service.EncargadoService;


@Controller
public class ControladorExcepcionesCECP {
	@Autowired
	private ColegioService colegioService;
	@Autowired
	private EncargadoService encargadoservice;
	
	@PostMapping("/actualizarColegio")
	public String actualizarColegio(Colegio nuevoColegio) {
		colegioService.guardarColegio(nuevoColegio);
		return "redirect:colegios/ListaColegios";
	}
	@PostMapping("/eliminarColegio/{id_colegio}")
	public String eliminarColegio(@PathVariable Integer id_colegio) {
	    colegioService.delete(id_colegio);
	    return "redirect:/colegios/ListaColegios";
	}
	@GetMapping("/agregarEncargado/{idColegio}")
    public String agregarEncargado(@PathVariable Integer idColegio, Model model) {
        Colegio colegio = colegioService.getColegio(idColegio)
                .orElseThrow(() -> new RuntimeException("Colegio no encontrado"));
        Encargado nuevoEncargado = new Encargado();
        nuevoEncargado.setColegio(colegio);

        model.addAttribute("idColegio", idColegio);
        model.addAttribute("colegio", colegio);
        model.addAttribute("nuevoEncargado", nuevoEncargado);

        return "encargados/agregarEncargado";
    }
    @PostMapping("/guardarEncargado/{id_Colegio}")
    public String guardarEncargado(@PathVariable Integer id_Colegio, @ModelAttribute("nuevoEncargado") Encargado nuevoEncargado) {
        Colegio colegio = colegioService.getColegio(id_Colegio)
                                .orElseThrow(() -> new RuntimeException("Colegio no encontrado"));

        nuevoEncargado.setColegio(colegio);
        encargadoservice.save(nuevoEncargado);

        return "redirect:/colegios/verEncargados/" + id_Colegio;
    }
    @PostMapping("/eliminarEncargado/{id_encargado}")
    public String eliminarEncargado(@PathVariable Integer id_encargado) {
    	encargadoservice.delete(id_encargado);
	    return "redirect:/colegios/ListaColegios";
    }

}
*/