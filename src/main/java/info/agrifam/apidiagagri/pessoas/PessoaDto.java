package info.agrifam.apidiag.pessoas;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;

/**
 * A DTO for the {@link Pessoa} entity
 */
@Data
public class PessoaDto implements Serializable {
    private final Long id;
    @NotNull
    private final Integer pestppessoa;
    @Size(max = 8)
    private final String pescep;
    @Size(max = 100)
    private final String peslogradouro;
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
    private final Object idempresaater;
    private final Integer idpessoascadastradormunicipal;
    @NotNull
    private final Short stativo;
    @Size(max = 100)
    private final String motivodesativar;
    private final Integer idmobile;
    private final LocalDate dtnascimento;
    @Size(max = 45)
    private final String logincreate;
    private final Long idPessoasCadastradorMunicipal;
    private final Long idempresaAter;
    private final Instant createTime;
    private final Instant updateTime;
    private final Integer idcomunidade;
    private final Character fazdownload;
    @Size(max = 32)
    private final String loginDownload;
}