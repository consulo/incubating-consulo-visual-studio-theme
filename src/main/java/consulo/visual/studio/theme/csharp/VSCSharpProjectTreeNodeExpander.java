package consulo.visual.studio.theme.csharp;

import com.intellij.ide.projectView.ViewSettings;
import com.intellij.ide.util.treeView.AbstractTreeNode;
import com.intellij.openapi.project.Project;
import consulo.annotation.access.RequiredReadAction;
import consulo.csharp.ide.projectView.CSharpProjectTreeNodeExpander;
import consulo.visual.studio.theme.VSIconTheme;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * @author VISTALL
 * @since 2020-10-28
 */
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
