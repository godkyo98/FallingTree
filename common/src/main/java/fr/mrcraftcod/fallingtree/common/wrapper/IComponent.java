package fr.mrcraftcod.fallingtree.common.wrapper;

import org.jetbrains.annotations.NotNull;

public interface IComponent extends IWrapper{
	@NotNull
	IComponent append(@NotNull IComponent component);
}
