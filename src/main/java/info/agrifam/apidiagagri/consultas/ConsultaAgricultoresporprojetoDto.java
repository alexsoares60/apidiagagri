package info.agrifam.apidiagagri.consultas;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link ConsultaAgricultoresporprojeto} entity
 */
@Data
public class ConsultaAgricultoresporprojetoDto implements Serializable {
    private final String id;
    @NotNull
    private final Integer idpessoa;
    @Size(max = 8)
    private final String pescep;
    @Size(max = 100)
    private final String peslogradouro;
    private final Integer idcomunidade;
    @NotNull
    private final Integer munid;
    @Size(max = 2)
    private final String sguf;
    @Size(max = 200)
    @NotNull
    private final String pesnm;
    @Size(max = 14)
    @NotNull
    private final String pesnrcpfcnpj;
    @Size(max = 50)
    private final String apelido;
    @Size(max = 16)
    private final String pestelefone;
    @Size(max = 16)
    private final String pescelular;
    @Size(max = 256)
    @NotNull
    private final String pesemail;
    private final Character pessexo;
    @Size(max = 2083)
    private final String pescaminhofoto;
    @NotNull
    private final Short stativo;
    private final LocalDate dtnascimento;
    private final Character fazdownload;
    @Size(max = 32)
    private final String loginDownload;
    @NotNull
    private final Integer idprojeto;
    @Size(max = 32)
    private final String login;
    @Size(max = 80)
    @NotNull
    private final String tituloprojeto;
    @Size(max = 80)
    @NotNull
    private final String munnm;
    @Size(max = 100)
    @NotNull
    private final String dscomunidade;
}