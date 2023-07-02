package info.agrifam.apidiagagri.diagnosticos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link Caracterizacao} entity
 */
@Data
public class CaracterizacaoDto implements Serializable {
    private final Integer id;
    private final Integer munid;
    @NotNull
    private final LocalDate dtcaracterizacaoupf;
    private final Integer idpessoatecnicoelaborador;
    private final String espectativaater;
    private final Integer tpcaracterizacao;
    private final Integer idempresaater;

    @Size(max = 2)
    private final String uf;
    private final Character tpcadastro;
    @NotNull
    private final Integer idpessoachefefamilia;
    private final Integer idmobile;
    private final Integer idpessoachefefamiliamobile;
    @NotNull
    private final Character stcancelado;
    @Size(max = 32)
    private final String login;
    private Character fazdownload;

    @Size(max = 32)
    private String loginDownload;
}