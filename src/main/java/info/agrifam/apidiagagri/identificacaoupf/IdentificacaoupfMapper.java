package info.agrifam.apidiag.identificacaoupf;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface IdentificacaoupfMapper {
    Identificacaoupf toEntity(IdentificacaoupfDto identificacaoupfDto);

    IdentificacaoupfDto toDto(Identificacaoupf identificacaoupf);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Identificacaoupf partialUpdate(IdentificacaoupfDto identificacaoupfDto, @MappingTarget Identificacaoupf identificacaoupf);
}