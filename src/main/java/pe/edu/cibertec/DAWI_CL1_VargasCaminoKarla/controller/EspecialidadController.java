package pe.edu.cibertec.DAWI_CL1_VargasCaminoKarla.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.cibertec.DAWI_CL1_VargasCaminoKarla.service.EspecialidadService;

@Controller
@RequestMapping("/Especialidad")
public class EspecialidadController {

	@Autowired
	private EspecialidadService especialidadService;
	
	@GetMapping("/frmMantEspecialidad")
	public String frmMantEspecialidad(Model model) {
		model.addAttribute("listaEstado",
				especialidadService.listarEspecialidad());
		return "Especialidad/frmMantEspecialidad";
	}
}
