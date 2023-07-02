package info.agrifam.apidiagagri.produtos;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProdutosdestinacaoMapper {
    Produtosdestinacao toEntity(ProdutosdestinacaoDto produtosdestinacaoDto);

    ProdutosdestinacaoDto toDto(Produtosdestinacao produtosdestinacao);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Produtosdestinacao partialUpdate(ProdutosdestinacaoDto produtosdestinacaoDto, @MappingTarget Produtosdestinacao produtosdestinacao);
}