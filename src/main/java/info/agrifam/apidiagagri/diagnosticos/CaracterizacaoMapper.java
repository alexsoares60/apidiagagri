package info.agrifam.apidiagagri.diagnosticos;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CaracterizacaoMapper {
    @Mapping(target = "dtalteracao", ignore = true)
    Caracterizacao toEntity(CaracterizacaoDto caracterizacaoDto);

    CaracterizacaoDto toDto(Caracterizacao caracterizacao);

    @Mapping(target = "dtalteracao", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Caracterizacao partialUpdate(CaracterizacaoDto caracterizacaoDto, @MappingTarget Caracterizacao caracterizacao);
}