package info.agrifam.apidiag.sanitarismo;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SanitarismoMapper {
    Sanitarismo toEntity(SanitarismoDto sanitarismoDto);

    SanitarismoDto toDto(Sanitarismo sanitarismo);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Sanitarismo partialUpdate(SanitarismoDto sanitarismoDto, @MappingTarget Sanitarismo sanitarismo);
}