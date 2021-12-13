package samueldev.challenges.ifoodchallenge.menus.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import samueldev.challenges.ifoodchallenge.core.domain.menus.OptionMenu;
import samueldev.challenges.ifoodchallenge.menus.requests.OptionMenuPostRequestBody;

@Mapper(componentModel = "spring")
public abstract class OptionMenuMapper {
    public static final OptionMenuMapper INSTANCE = Mappers.getMapper(OptionMenuMapper.class);

    public abstract OptionMenu toOptionMenu(OptionMenuPostRequestBody optionMenuPostRequestBody);
}
