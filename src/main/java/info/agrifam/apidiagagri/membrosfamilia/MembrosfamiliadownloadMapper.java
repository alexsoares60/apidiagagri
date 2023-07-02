package info.agrifam.apidiagagri.membrosfamilia;


import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface MembrosfamiliadownloadMapper {
    Membrosfamiliadownload toEntity(MembrosfamiliadownloadDto membrosfamiliadownloadDto);

    @Mapping(target = "tPcaracterizacao", ignore = true)
    MembrosfamiliadownloadDto toDto(Membrosfamiliadownload membrosfamiliadownload);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Membrosfamiliadownload partialUpdate(MembrosfamiliadownloadDto membrosfamiliadownloadDto, @MappingTarget Membrosfamiliadownload membrosfamiliadownload);
}