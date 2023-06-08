package info.agrifam.apidiag.usoagua;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AterpecusudaaguaMapper {
    Aterpecusudaagua toEntity(AterpecusudaaguaDto aterpecusudaaguaDto);

    AterpecusudaaguaDto toDto(Aterpecusudaagua aterpecusudaagua);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Aterpecusudaagua partialUpdate(AterpecusudaaguaDto aterpecusudaaguaDto, @MappingTarget Aterpecusudaagua aterpecusudaagua);
}