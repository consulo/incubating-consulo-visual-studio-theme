/**
 * @author VISTALL
 * @since 13/01/2023
 */
module consulo.visual.studio.theme {
    requires consulo.ide.api;
    requires consulo.visual.studio.theme.api;

    // this is fix issue with reference to color scheme - need rework it without that
    opens consulo.visualStudio.theme.impl to consulo.component.store.impl;
    
    provides consulo.ui.image.IconLibraryDescriptor with
            consulo.visualStudio.theme.impl.VSLightIconLibraryDescriptor,
            consulo.visualStudio.theme.impl.VSDarkIconLibraryDescriptor;
}