package info.agrifam.apidiagagri.noticia;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface NoticiaMapper {
    Noticia toEntity(NoticiaDto noticiaDto);

    NoticiaDto toDto(Noticia noticia);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Noticia partialUpdate(NoticiaDto noticiaDto, @MappingTarget Noticia noticia);
}