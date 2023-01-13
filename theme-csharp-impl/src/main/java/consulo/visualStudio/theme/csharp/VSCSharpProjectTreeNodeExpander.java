package consulo.visualStudio.theme.csharp;

import consulo.annotation.access.RequiredReadAction;
import consulo.annotation.component.ExtensionImpl;
import consulo.csharp.impl.ide.projectView.CSharpProjectTreeNodeExpander;
import consulo.project.Project;
import consulo.project.ui.view.tree.AbstractTreeNode;
import consulo.project.ui.view.tree.ViewSettings;
import consulo.visualStudio.theme.VSIconTheme;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * @author VISTALL
 * @since 2020-10-28
 */
@ExtensionImpl
public class VSCSharpProjectTreeNodeExpander implements CSharpProjectTreeNodeExpander
{
	@RequiredReadAction
	@Nullable
	@Override
	public AbstractTreeNode<?> expandFile(@Nonnull Project project, @Nonnull ViewSettings viewSettings, @Nonnull AbstractTreeNode<?> node)
	{
		if(!VSIconTheme.isEnabled())
		{
			return null;
		}

		// return always file node
		return node;
	}
}
