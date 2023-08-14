package info.agrifam.apidiagagri.projetoequipe;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProjetosequipepessoaMapper {
    Projetosequipepessoa toEntity(ProjetosequipepessoaDto projetosequipepessoaDto);

    ProjetosequipepessoaDto toDto(Projetosequipepessoa projetosequipepessoa);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Projetosequipepessoa partialUpdate(ProjetosequipepessoaDto projetosequipepessoaDto, @MappingTarget Projetosequipepessoa projetosequipepessoa);
}