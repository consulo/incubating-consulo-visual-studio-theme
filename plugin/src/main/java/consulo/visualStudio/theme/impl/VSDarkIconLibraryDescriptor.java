package consulo.visualStudio.theme.impl;

import consulo.localize.LocalizeValue;
import consulo.ui.image.IconLibraryDescriptor;
import consulo.ui.image.IconLibraryManager;
import consulo.visualStudio.theme.VSIconTheme;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

/**
 * @author VISTALL
 * @since 09/12/2021
 */
public class VSDarkIconLibraryDescriptor implements IconLibraryDescriptor
{
	@Nonnull
	@Override
	public String getLibraryId()
	{
		return VSIconTheme.VS_DARK;
	}

	@Nullable
	@Override
	public String getBaseLibraryId()
	{
		return IconLibraryManager.DARK_LIBRARY_ID;
	}

	@Nonnull
	@Override
	public LocalizeValue getName()
	{
		return LocalizeValue.of("Visual Studio Dark");
	}
}
