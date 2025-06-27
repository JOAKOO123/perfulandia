package cl.duoc.ms_ventas_bff.model.dto;

import java.math.BigDecimal;
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

public class DetallePedidoDTO {

    private Long id;
    private Long pedido_id;
    private Long producto_id;
    private ProductoDTO producto;
    private Integer cantidad;
    private BigDecimal precio_unitario;
}
