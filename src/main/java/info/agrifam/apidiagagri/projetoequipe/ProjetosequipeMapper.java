package info.agrifam.apidiagagri.projetoequipe;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProjetosequipeMapper {
    Projetosequipe toEntity(ProjetosequipeDto projetosequipeDto);

    ProjetosequipeDto toDto(Projetosequipe projetosequipe);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Projetosequipe partialUpdate(ProjetosequipeDto projetosequipeDto, @MappingTarget Projetosequipe projetosequipe);
}