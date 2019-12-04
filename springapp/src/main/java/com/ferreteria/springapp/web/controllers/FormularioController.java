package com.ferreteria.springapp.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ferreteria.springapp.business.entities.DetalleFactura;
import com.ferreteria.springapp.business.services.DetalleFacturaManager;
import com.ferreteria.springapp.business.services.JPADetalleFactura;

@Controller
public class FormularioController {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private DetalleFacturaManager detalleFacturaManager;
	@Autowired
	private JPADetalleFactura jpaDetalleFactura;

	@RequestMapping(value = "/formdetallefactura.htm")
	public ModelAndView handleRequest() {

		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("detalles", detalleFacturaManager.getDetallesFactura());

		return new ModelAndView("formdetallefactura", "model", myModel);
	}

	@RequestMapping("/insertardetallefactura.htm")
	public String newDetalleFacturaForm(Map<String, Object> model) {
		DetalleFactura detalle = new DetalleFactura();
		model.put("detalle", detalle);
		return "insertardetallefactura";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveDetalleFactura(@ModelAttribute("detalle") DetalleFactura detalle) {
//		detalleFacturaManager.save(detalleFactura);
		jpaDetalleFactura.save(detalle);
		return "redirect:/";
	}

}
