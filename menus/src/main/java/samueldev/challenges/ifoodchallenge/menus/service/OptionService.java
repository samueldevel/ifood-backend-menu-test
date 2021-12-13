package samueldev.challenges.ifoodchallenge.menus.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import samueldev.challenges.ifoodchallenge.core.domain.menus.Option;
import samueldev.challenges.ifoodchallenge.core.domain.menus.OptionMenu;
import samueldev.challenges.ifoodchallenge.core.exceptions.BadRequestException;
import samueldev.challenges.ifoodchallenge.core.repository.menus.OptionMenuRepository;
import samueldev.challenges.ifoodchallenge.core.repository.menus.OptionRepository;
import samueldev.challenges.ifoodchallenge.menus.mapper.OptionMapper;
import samueldev.challenges.ifoodchallenge.menus.requests.OptionPostRequestBody;

@Service
@RequiredArgsConstructor
public class OptionService {
    private final OptionRepository optionRepository;
    private final OptionMenuRepository optionMenuRepository;

    public Option save(Long optionMenuId, OptionPostRequestBody optionPostRequestBody) {
        Option option = OptionMapper.INSTANCE.toOption(optionPostRequestBody);

        OptionMenu optionMenuSaved = optionMenuRepository.findById(optionMenuId)
                .orElseThrow(() -> new BadRequestException("optionMenuId not found, verify if this optionMenu exists"));
        optionMenuSaved.getOptions().add(option);

        optionMenuRepository.save(optionMenuSaved);

        return optionRepository.save(option);
    }
}
