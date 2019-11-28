package com.ferreteria.springapp.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ferreteria.springapp.business.services.DetalleFacturaManager;

@Controller
public class FormularioController {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private DetalleFacturaManager detalleFacturaManager;

	@RequestMapping(value = "/formdetallefactura.htm")
	public ModelAndView handleRequest() {

		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("detalles", detalleFacturaManager.getDetallesFactura());

		return new ModelAndView("formdetallefactura", "model", myModel);
	}

}
