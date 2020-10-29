package consulo.visual.studio.theme.csharp;

import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import consulo.annotation.access.RequiredReadAction;
import consulo.csharp.assemblyInfo.CSharpAssemblyConstants;
import consulo.csharp.lang.psi.impl.source.CSharpFileImpl;
import consulo.ide.IconDescriptor;
import consulo.ide.IconDescriptorUpdater;
import consulo.visual.studio.theme.VSIconTheme;

import javax.annotation.Nonnull;
import java.util.Objects;

/**
 * @author VISTALL
 * @see consulo.csharp.lang.CSharpIconDescriptorUpdater
 * @since 2020-10-28
 */
public class VSCSharpIconDescriptorUpdater implements IconDescriptorUpdater
{
	@RequiredReadAction
	@Override
	public void updateIcon(@Nonnull IconDescriptor iconDescriptor, @Nonnull PsiElement element, int flags)
	{
		if(!VSIconTheme.isLightThemeEnabled())
			return;
		if(!VSIconTheme.isDarkThemeEnabled())
			return;

		VirtualFile virtualFile = null;
		if(element instanceof CSharpFileImpl)
		{
			virtualFile = ((CSharpFileImpl) element).getVirtualFile();
			if(virtualFile != null && Objects.equals(virtualFile.getNameSequence(), CSharpAssemblyConstants.FileName))
			{
				// nothing?
				return;
			}

			if(virtualFile != null)
			{
				iconDescriptor.setMainIcon(virtualFile.getFileType().getIcon());
				iconDescriptor.setRightIcon(null);
				iconDescriptor.clearLayerIcons();
			}
		}
	}
}
