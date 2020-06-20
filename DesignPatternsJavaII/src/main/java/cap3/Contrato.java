package cap3;

import java.util.Calendar;

public class Contrato {

    private Calendar data;
    private String cliente;
    private TipoContrato tipoContrato;

    public Contrato(Calendar data, String cliente, TipoContrato tipoContrato) {
        this.data = data;
        this.cliente = cliente;
        this.tipoContrato = tipoContrato;
    }

    public Calendar getData() {
        return data;
    }

    public String getCliente() {
        return cliente;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void avanca() {
        if(TipoContrato.NOVO == this.tipoContrato) {
            this.tipoContrato = TipoContrato.EM_ANDAMENTO;
        } else if (TipoContrato.EM_ANDAMENTO == this.tipoContrato) {
            this.tipoContrato = TipoContrato.ACERTADO;
        } else if (TipoContrato.ACERTADO == this.tipoContrato) {
            this.tipoContrato = TipoContrato.CONCLUIDO;
        }
    }

    public Estado salvaEstado() {
        return new Estado(new Contrato(this.data, this.cliente, this.tipoContrato));
    }
}
