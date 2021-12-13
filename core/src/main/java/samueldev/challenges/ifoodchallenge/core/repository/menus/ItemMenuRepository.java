package samueldev.challenges.ifoodchallenge.core.repository.menus;

import org.springframework.data.jpa.repository.JpaRepository;
import samueldev.challenges.ifoodchallenge.core.domain.menus.ItemMenu;

public interface ItemMenuRepository extends JpaRepository<ItemMenu, Long> {
}
