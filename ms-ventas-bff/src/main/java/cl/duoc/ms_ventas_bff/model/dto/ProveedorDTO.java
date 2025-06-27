package cl.duoc.ms_ventas_bff.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class ProveedorDTO {

    private Integer idProveedor;
    private String nombre;
    private String email;
    private String telefono;
     

}