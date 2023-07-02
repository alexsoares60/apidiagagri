package info.agrifam.apidiagagri.areasprodutivas;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CaracterizacaoAreasProdutivasMapper {
    CaracterizacaoAreasProdutivas toEntity(CaracterizacaoAreasProdutivasDto caracterizacaoAreasProdutivasDto);

    CaracterizacaoAreasProdutivasDto toDto(CaracterizacaoAreasProdutivas caracterizacaoAreasProdutivas);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    CaracterizacaoAreasProdutivas partialUpdate(CaracterizacaoAreasProdutivasDto caracterizacaoAreasProdutivasDto, @MappingTarget CaracterizacaoAreasProdutivas caracterizacaoAreasProdutivas);
}