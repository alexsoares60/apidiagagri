package info.agrifam.apidiag.atividade;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AtividadeMapper {
    Atividade toEntity(AtividadeDto atividadeDto);

    AtividadeDto toDto(Atividade atividade);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Atividade partialUpdate(AtividadeDto atividadeDto, @MappingTarget Atividade atividade);
}