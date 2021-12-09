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

	public static boolean isEnabled()
	{
		String libraryId = IconLibraryManager.get().getActiveLibraryId();
		return VS_LIGHT.equals(libraryId) || VS_DARK.equals(libraryId);
	}
}
