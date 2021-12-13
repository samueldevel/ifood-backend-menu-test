package samueldev.challenges.ifoodchallenge.menus.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import samueldev.challenges.ifoodchallenge.core.domain.menus.OptionMenu;
import samueldev.challenges.ifoodchallenge.core.exceptions.BadRequestException;
import samueldev.challenges.ifoodchallenge.core.repository.menus.OptionMenuRepository;
import samueldev.challenges.ifoodchallenge.menus.mapper.OptionMenuMapper;
import samueldev.challenges.ifoodchallenge.menus.requests.OptionMenuPostRequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OptionMenuService {
    private final OptionMenuRepository optionMenuRepository;

    public List<OptionMenu> findAll() {

        return optionMenuRepository.findAll();
    }

    public OptionMenu findById(Long id) {

        return optionMenuRepository.findById(id).orElseThrow(() -> new BadRequestException("OptionMenu not found"));
    }

    public OptionMenu save(OptionMenuPostRequestBody optionMenuPostRequestBody) {
        OptionMenu optionMenu = OptionMenuMapper.INSTANCE.toOptionMenu(optionMenuPostRequestBody);


        return optionMenuRepository.save(optionMenu);
    }
}
