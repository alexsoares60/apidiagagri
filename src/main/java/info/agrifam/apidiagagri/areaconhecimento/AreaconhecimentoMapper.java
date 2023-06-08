package info.agrifam.apidiag.areaconhecimento;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AreaconhecimentoMapper {
    Areaconhecimento toEntity(AreaconhecimentoDto areaconhecimentoDto);

    AreaconhecimentoDto toDto(Areaconhecimento areaconhecimento);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Areaconhecimento partialUpdate(AreaconhecimentoDto areaconhecimentoDto, @MappingTarget Areaconhecimento areaconhecimento);
}