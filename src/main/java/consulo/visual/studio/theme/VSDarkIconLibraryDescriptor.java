package consulo.visual.studio.theme;

import consulo.localize.LocalizeValue;
import consulo.ui.image.IconLibraryDescriptor;
import consulo.ui.image.IconLibraryManager;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * @author YT GAMEWORKS
 * @since 2020-10-29
 */

public class VSDarkIconLibraryDescriptor implements IconLibraryDescriptor
{
    @Nonnull
    @Override
    public String getLibraryId()
    {
        return "vs_dark";
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
