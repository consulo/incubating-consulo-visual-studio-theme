package consulo.visual.studio.theme;

import consulo.localize.LocalizeValue;
import consulo.ui.image.IconLibraryDescriptor;
import consulo.ui.image.IconLibraryManager;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * @author VISTALL
 * @since 2020-10-28
 */
public class VSLightIconLibraryDescriptor implements IconLibraryDescriptor
{
	@Nonnull
	@Override
	public String getLibraryId()
	{
		return "vs_light";
	}

	@Nullable
	@Override
	public String getBaseLibraryId()
	{
		return IconLibraryManager.LIGHT_LIBRARY_ID;
	}

	@Nonnull
	@Override
	public LocalizeValue getName()
	{
		return LocalizeValue.of("Visual Studio Light");
	}
}
