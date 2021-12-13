package samueldev.challenges.ifoodchallenge.core.repository.menus;

import org.springframework.data.jpa.repository.JpaRepository;
import samueldev.challenges.ifoodchallenge.core.domain.menus.OptionMenu;

public interface OptionMenuRepository extends JpaRepository<OptionMenu, Long> {

}
