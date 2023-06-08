package info.agrifam.apidiagagri.secuser;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SecUserMapper {
    SecUser toEntity(SecUserDto secUserDto);

    SecUserDto toDto(SecUser secUser);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    SecUser partialUpdate(SecUserDto secUserDto, @MappingTarget SecUser secUser);
}