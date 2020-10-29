package consulo.visual.studio.theme;

import consulo.ui.image.IconLibraryManager;

/**
 * @author VISTALL
 * @since 2020-10-28
 */
public class VSIconTheme
{
	public static final String VS_LIGHT = "vs_light";
	public static final String VS_DARK = "vs_dark";

	public static boolean isLightThemeEnabled()
	{
		return VS_LIGHT.equals(IconLibraryManager.get().getActiveLibraryId());
	}

	public static boolean isDarkThemeEnabled()
	{
		return VS_DARK.equals(IconLibraryManager.get().getActiveLibraryId());
	}
}
