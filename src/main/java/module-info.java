/**
 * @author VISTALL
 * @since 13/01/2023
 */
module consulo.visual.studio.theme {
    requires consulo.ide.api;

    requires consulo.csharp;

    provides consulo.ui.image.IconLibraryDescriptor with
            consulo.visual.studio.theme.VSLightIconLibraryDescriptor,
            consulo.visual.studio.theme.VSDarkIconLibraryDescriptor;
}