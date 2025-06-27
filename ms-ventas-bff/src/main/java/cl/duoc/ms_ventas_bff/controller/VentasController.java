package cl.duoc.ms_ventas_bff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.ms_ventas_bff.model.dto.PedidoDTO;
import cl.duoc.ms_ventas_bff.service.VentasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/bff/sales")
public class VentasController {
    @Autowired
    VentasService ventasService;

    @GetMapping("/{id}")
    public ResponseEntity<PedidoDTO> findSalesById(@PathVariable("id") Long id) {
        PedidoDTO pedidoDTO=ventasService.getVentasById(id);
        return (pedidoDTO!= null)?  new ResponseEntity<>(pedidoDTO, HttpStatus.OK) :
                                     new ResponseEntity<>(HttpStatus.NOT_FOUND); 
    }
    

}
