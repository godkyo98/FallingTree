package fr.rakambda.fallingtree.neoforge.common.wrapper;

import fr.rakambda.fallingtree.common.wrapper.IComponent;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import org.jetbrains.annotations.NotNull;

@RequiredArgsConstructor
@ToString
public class ComponentWrapper implements IComponent{
	@NotNull
	@Getter
	private final MutableComponent raw;
	
	@Override
	@NotNull
	public IComponent append(@NotNull IComponent component){
		raw.append((Component) component.getRaw());
		return this;
	}
}
