package cl.duoc.ms_ventas_bff.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ClienteDTO {

    private Long id_cliente;
    private String nombre;
    private String contrasena;
    private String direccion;
    private String email;
    private String telefono;
}