package consulo.visual.studio.theme;

import consulo.ui.image.IconLibraryManager;

/**
 * @author VISTALL
 * @since 2020-10-28
 */
public class VSIconTheme
{
	public static final String VS_LIGHT = "vs_light";

	public static boolean isEnabled()
	{
		return VS_LIGHT.equals(IconLibraryManager.get().getActiveLibraryId());
	}
}
