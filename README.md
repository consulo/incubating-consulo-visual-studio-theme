# Visual Studio Theme Plugin (currently only icons, wip)

## 

How add new icons. First of all need download VS 2016 Image Library (https://www.microsoft.com/en-us/download/details.aspx?id=35825)

Then search correct **svg** icon for example \AbstractClass\AbstractClass_16x.svg

Due some limitation of svg icon support (for performance purpose) css styling not supported. But Microsoft always use it. Need resave icon.

Adobe Illustrator required(or other program which can inline css styles). Current example for Adobe Illustrator.

* Open SVG file
* File -> Save As choose save path, press OK
* SVG options dialog will show, and need set like in this dialog:

![](public/export.png)

Next need place new svg file to correct Consulo path here

https://github.com/consulo/incubating-consulo-visual-studio-theme/tree/master/src/main/resources/icon/_vs_light

First directory level is - icon group id. Own plugins can provide more than one icon groups

* consulo.platform.base.PlatformIconGroup - main IDE icon group. Here list of all icons of this group https://github.com/consulo/consulo/tree/master/modules/base/base-icon-library/src/main/resources/icon/_light/consulo.platform.base.PlatformIconGroup

* consulo.csharp.psi.CSharpPsiIconGroup - C# plugin icon group(https://github.com/consulo/consulo-csharp/tree/master/csharp-psi-api/src/main/resources/icon/_light/consulo.csharp.psi.CSharpPsiIconGroup). It's contains some C# specific icons. Base icons like Class,Struct,Interfaces are inside consulo.platform.base.PlatformIconGroup/nodes

## Running Consulo in sandbox with plugin

> ./mvnw package consulo:run-desktop
