package consulo.visualStudio.theme.impl;

import consulo.annotation.component.ExtensionImpl;
import consulo.colorScheme.BundledColorSchemeProvider;

import javax.annotation.Nonnull;

/**
 * @author VISTALL
 * @since 15/05/2023
 */
@ExtensionImpl
public class VSColorSchemeProvider implements BundledColorSchemeProvider
{
	@Nonnull
	@Override
	public String[] getColorSchemeFiles()
	{
		return new String[]{
				"Visual Studio Light.xml",
				"Visual Studio Dark.xml"
		};
	}
}
