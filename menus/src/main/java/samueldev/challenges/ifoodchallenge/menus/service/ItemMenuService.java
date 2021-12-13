package samueldev.challenges.ifoodchallenge.menus.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import samueldev.challenges.ifoodchallenge.core.domain.menus.ItemMenu;
import samueldev.challenges.ifoodchallenge.core.repository.menus.ItemMenuRepository;
import samueldev.challenges.ifoodchallenge.menus.mapper.ItemMenuMapper;
import samueldev.challenges.ifoodchallenge.menus.requests.ItemMenuPostRequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ItemMenuService {
    private final ItemMenuRepository itemMenuRepository;

    public List<ItemMenu> findAll() {

        return itemMenuRepository.findAll();
    }

    public ItemMenu save(ItemMenuPostRequestBody itemMenuPostRequestBody) {
        ItemMenu itemMenu = ItemMenuMapper.INSTANCE.toDTO(itemMenuPostRequestBody);
        
        return itemMenuRepository.save(itemMenu);
    }
}
