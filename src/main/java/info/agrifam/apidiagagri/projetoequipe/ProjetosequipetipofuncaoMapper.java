package info.agrifam.apidiagagri.projetoequipe;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProjetosequipetipofuncaoMapper {
    Projetosequipetipofuncao toEntity(ProjetosequipetipofuncaoDto projetosequipetipofuncaoDto);

    ProjetosequipetipofuncaoDto toDto(Projetosequipetipofuncao projetosequipetipofuncao);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Projetosequipetipofuncao partialUpdate(ProjetosequipetipofuncaoDto projetosequipetipofuncaoDto, @MappingTarget Projetosequipetipofuncao projetosequipetipofuncao);
}