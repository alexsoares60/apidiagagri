package info.agrifam.apidiag.areaconhecimento;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CaracareaconhecMapper {
    Caracareaconhec toEntity(CaracareaconhecDto caracareaconhecDto);

    CaracareaconhecDto toDto(Caracareaconhec caracareaconhec);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Caracareaconhec partialUpdate(CaracareaconhecDto caracareaconhecDto, @MappingTarget Caracareaconhec caracareaconhec);
}