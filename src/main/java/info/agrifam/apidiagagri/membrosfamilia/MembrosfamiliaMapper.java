package info.agrifam.apidiagagri.membrosfamilia;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface MembrosfamiliaMapper {
    Membrosfamilia toEntity(MembrosfamiliaDto membrosfamiliaDto);

    MembrosfamiliaDto toDto(Membrosfamilia membrosfamilia);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Membrosfamilia partialUpdate(MembrosfamiliaDto membrosfamiliaDto, @MappingTarget Membrosfamilia membrosfamilia);
}