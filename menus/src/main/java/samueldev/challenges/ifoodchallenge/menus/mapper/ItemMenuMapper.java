package samueldev.challenges.ifoodchallenge.menus.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import samueldev.challenges.ifoodchallenge.core.domain.menus.ItemMenu;
import samueldev.challenges.ifoodchallenge.menus.requests.ItemMenuPostRequestBody;

@Mapper(componentModel = "spring")
public abstract class ItemMenuMapper {
    public static final ItemMenuMapper INSTANCE = Mappers.getMapper(ItemMenuMapper.class);

    public abstract ItemMenu toDTO(ItemMenuPostRequestBody itemMenuPostRequestBody);
}
