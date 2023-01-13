package consulo.visualStudio.theme.csharp;

import consulo.annotation.access.RequiredReadAction;
import consulo.annotation.component.ExtensionImpl;
import consulo.csharp.lang.impl.CSharpAssemblyConstants;
import consulo.csharp.lang.impl.psi.source.CSharpFileImpl;
import consulo.language.icon.IconDescriptor;
import consulo.language.icon.IconDescriptorUpdater;
import consulo.language.psi.PsiElement;
import consulo.virtualFileSystem.VirtualFile;
import consulo.visualStudio.theme.VSIconTheme;

import javax.annotation.Nonnull;
import java.util.Objects;

/**
 * @author VISTALL
 * @see consulo.csharp.lang.CSharpIconDescriptorUpdater
 * @since 2020-10-28
 */
@ExtensionImpl
public class VSCSharpIconDescriptorUpdater implements IconDescriptorUpdater
{
	@RequiredReadAction
	@Override
	public void updateIcon(@Nonnull IconDescriptor iconDescriptor, @Nonnull PsiElement element, int flags)
	{
		if(!VSIconTheme.isEnabled())
		{
			return;
		}

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
