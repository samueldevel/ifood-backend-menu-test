package samueldev.challenges.ifoodchallenge.menus.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import samueldev.challenges.ifoodchallenge.core.domain.menus.Option;
import samueldev.challenges.ifoodchallenge.menus.requests.OptionPostRequestBody;

@Mapper(componentModel = "spring")
public abstract class OptionMapper {
    public static final OptionMapper INSTANCE = Mappers.getMapper(OptionMapper.class);

    public abstract Option toOption(OptionPostRequestBody optionPostRequestBody);
}
