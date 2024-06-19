/*package com.less.qliwarma.controlador;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.less.qliwarma.modelo.Colegio;
import com.less.qliwarma.modelo.Encargado;
import com.less.qliwarma.service.ColegioService;
import com.less.qliwarma.service.EncargadoService;


@Controller
@RequestMapping("/colegios")
public class ControladorCE {
	
	@Autowired
	private ColegioService colegioService;
	
	@Autowired
	private EncargadoService encargadoservice;
	
	@GetMapping("/ListaColegios")
	public String ListaColegios(Model model) {
        List<Colegio> colegios = colegioService.getAllColegios();
        model.addAttribute("colegios",colegios);
        return "colegios/ListaColegios";
	}
	
	@GetMapping("/agregarColegio")
	public String agregarColegio(Model model) {
		model.addAttribute("nuevoColegio", new Colegio());
		return "colegios/agregarColegio";
	}
	
	@PostMapping("/guardarColegio")
	public String guardarColegio(Colegio nuevoColegio) {
		colegioService.guardarColegio(nuevoColegio);
		return "redirect:./ListaColegios";
	}
    @GetMapping("/editarColegio/{id_Colegio}")
    public String editarColegio(@PathVariable Integer id_Colegio, Model model) {
        Colegio colegio = colegioService.getColegio(id_Colegio)
                            .orElseThrow(() -> new RuntimeException("Colegio no encontrado"));
        model.addAttribute("colegio", colegio);
        return "colegios/editarColegio";
    }

    @GetMapping("/verInformacion/{id_Colegio}")
    public String verInformacion(@PathVariable Integer id_Colegio, Model model){
    	Colegio colegio = colegioService.getColegio(id_Colegio)
                            .orElseThrow(() -> new RuntimeException("Colegio no encontrado"));
    	model.addAttribute("colegio", colegio);
        return "colegios/InformacionColegio";
    }
    @GetMapping("verEncargados/{id_Colegio}")
    public String verEncargados(@PathVariable Integer id_Colegio, Model model){
    	Colegio colegio = colegioService.getColegio(id_Colegio)
                            .orElseThrow(() -> new RuntimeException("Colegio no encontrado"));
    	List<Encargado> encargados = colegio.getEncargados();
    	model.addAttribute("encargados", encargados);
    	model.addAttribute("colegio", colegio);

        return "encargados/verEncargados";
    }
    
    @GetMapping("/agregarEncargado/{idColegio}")
    public String agregarEncargado(@PathVariable Integer idColegio, Model model) {
        Colegio colegio = colegioService.getColegio(idColegio)
                .orElseThrow(() -> new RuntimeException("Colegio no encontrado"));
        Encargado nuevoEncargado = new Encargado();
        nuevoEncargado.setColegio(colegio);
        nuevoEncargado.setImagen_perfil("https://visiosensefronteres.org/wp-content/uploads/2018/06/perfil-hombre.png");


        model.addAttribute("idColegio", idColegio);
        model.addAttribute("colegio", colegio);
        model.addAttribute("nuevoEncargado", nuevoEncargado);

        return "encargados/agregarEncargado";
    }
    
    @GetMapping("/verDetallesEncargado/{id_encargado}")
    public String verDetallesEncargado(@PathVariable Integer id_encargado, Model model) {
    	Encargado encargado = encargadoservice.get(id_encargado)
                .orElseThrow(() -> new RuntimeException("Encargado no encontrado"));
        Colegio colegio = encargado.getColegio(); 
    	model.addAttribute("encargado",encargado);
        model.addAttribute("colegio", colegio);
    	return "encargados/Detalles";
    }
    
    @GetMapping("/editarEncargado/{id_encargado}")
    public String editarEncargado(@PathVariable Integer id_encargado, Model model) {
        Encargado encargado = encargadoservice.get(id_encargado)
                .orElseThrow(() -> new RuntimeException("Encargado no encontrado"));
        Colegio colegio = encargado.getColegio(); 
        
        model.addAttribute("encargado", encargado);
        model.addAttribute("colegio", colegio);

        return "encargados/editarEncargado";
    }
    @PostMapping("/actualizarEncargado/{id_encargado}")
    public String actualizarEncargado(@PathVariable Integer id_encargado, @ModelAttribute Encargado encargado) {
        Encargado encargadoExistente = encargadoservice.get(id_encargado)
                .orElseThrow(() -> new RuntimeException("Encargado no encontrado"));

        encargado.setId_encargado(id_encargado);
        encargado.setColegio(encargadoExistente.getColegio());

        encargadoservice.save(encargado);

        return "redirect:/colegios/verDetallesEncargado/" + id_encargado;
    }

}
    	





*/