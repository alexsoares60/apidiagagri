package info.agrifam.apidiagagri.userprojetos;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ConsultaProjetosUsuariosProjetoMapper {
    ConsultaProjetosUsuariosProjeto toEntity(ConsultaProjetosUsuariosProjetoDto consultaProjetosUsuariosProjetoDto);

    ConsultaProjetosUsuariosProjetoDto toDto(ConsultaProjetosUsuariosProjeto consultaProjetosUsuariosProjeto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ConsultaProjetosUsuariosProjeto partialUpdate(ConsultaProjetosUsuariosProjetoDto consultaProjetosUsuariosProjetoDto, @MappingTarget ConsultaProjetosUsuariosProjeto consultaProjetosUsuariosProjeto);
}