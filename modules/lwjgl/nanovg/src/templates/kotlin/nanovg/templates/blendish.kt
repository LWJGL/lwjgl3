/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg.templates

import org.lwjgl.generator.*
import nanovg.*

val blendish = "Blendish".nativeClass(Module.NANOVG, prefix = "BND") {
    nativeDirective("""
#include "nanovg.h"
#define BLENDISH_IMPLEMENTATION
#define BLENDISH_NO_NVG_TYPEDEFS
#include "blendish.h"""")

    documentation =
        """
        Blendish is a small collection of drawing functions for NanoVG, designed to replicate the look of the Blender 2.5+ User Interface. You can use these
        functions to theme your UI library. Several metric constants for faithful reproduction are also included.

        Blendish supports the original Blender icon sheet; As the licensing of Blender's icons is unclear, they are not included in Blendish'es repository, but
        an SVG template, "icons_template.svg" is provided, which you can use to build your own icon sheet.

        To use icons, you must first load the icon sheet using one of the {@code nvgCreateImage*()} functions and then pass the image handle to
        #SetIconImage(); otherwise, no icons will be drawn. See {@code bndSetIconImage()} for more information.

        Blendish will not render text until a suitable UI font has been passed to #SetFont() has been called. See {@code bndSetFont()} for more information.

        <h3>Drawbacks</h3>

        There is no support for varying dpi resolutions yet. The library is hardcoded to the equivalent of 72 dpi in the Blender system settings.

        Support for label truncation is missing. Text rendering breaks when widgets are too short to contain their labels.
        """

    FloatConstant(
        "Alpha of disabled widget groups. Can be used in conjunction with #GlobalAlpha().",

        "DISABLED_ALPHA"..0.5f
    )

    EnumConstant(
        "How text on a control is aligned. ({@code BNDtextAlignment})",

        "LEFT".enum("", "0"),
        "CENTER".enum
    )

    EnumConstant(
        "States altering the styling of a widget. ({@code BNDwidgetState})",

        "DEFAULT".enum("not interacting", "0"),
        "HOVER".enum("the mouse is hovering over the control"),
        "ACTIVE".enum("the widget is activated (pressed) or in an active state (toggled)")
    )

    EnumConstant(
        "Flags indicating which corners are sharp (for grouping widgets). ({@code BNDcornerFlags})",

        "CORNER_NONE".enum("all corners are round", "0"),
        "CORNER_TOP_LEFT".enum("sharp top left corner"),
        "CORNER_TOP_RIGHT".enum("sharp top right corner"),
        "CORNER_DOWN_RIGHT".enum("sharp bottom right corner", "4"),
        "CORNER_DOWN_LEFT".enum("sharp bottom left corner", "8"),
        "CORNER_ALL".enum("all corners are sharp; you can invert a set of flags using ^= BND_CORNER_ALL", "0xF"),
        "CORNER_TOP".enum("top border is sharp", "3"),
        "CORNER_DOWN".enum("bottom border is sharp", "0xC"),
        "CORNER_LEFT".enum("left border is sharp", "9"),
        "CORNER_RIGHT".enum("right border is sharp", "6")
    )

    EnumConstant(
        "",

        "WIDGET_HEIGHT".enum("default widget height", "21"),
        "TOOL_WIDTH".enum("default toolbutton width (if icon only)", "20"),
        "NODE_PORT_RADIUS".enum("default radius of node ports", "5"),
        "NODE_MARGIN_TOP".enum("top margin of node content", "25"),
        "NODE_MARGIN_DOWN".enum("bottom margin of node content", "5"),
        "NODE_MARGIN_SIDE".enum("left and right margin of node content", "10"),
        "NODE_TITLE_HEIGHT".enum("height of node title bar", "20"),
        "NODE_ARROW_AREA_WIDTH".enum("width of node title arrow click area", "20"),
        "SPLITTER_AREA_SIZE".enum("size of splitter corner click area", "12"),
        "SCROLLBAR_WIDTH".enum("width of vertical scrollbar"),
        "SCROLLBAR_HEIGHT".enum("height of horizontal scrollbar"),
        "VSPACING".enum("default vertical spacing", "1"),
        "VSPACING_GROUP".enum("default vertical spacing between groups", "8"),
        "HSPACING".enum("default horizontal spacing", "8")
    )

    customMethod("""
    public static int BND_ICONID(int x, int y) {
        return x | (y << 8);
    }""")

    EnumConstant(
        "{@code BNDicon}",

        "ICON_NONE".enum("", "BND_ICONID(0,29)"),
        "ICON_QUESTION".enum("", "BND_ICONID(1,29)"),
        "ICON_ERROR".enum("", "BND_ICONID(2,29)"),
        "ICON_CANCEL".enum("", "BND_ICONID(3,29)"),
        "ICON_TRIA_RIGHT".enum("", "BND_ICONID(4,29)"),
        "ICON_TRIA_DOWN".enum("", "BND_ICONID(5,29)"),
        "ICON_TRIA_LEFT".enum("", "BND_ICONID(6,29)"),
        "ICON_TRIA_UP".enum("", "BND_ICONID(7,29)"),
        "ICON_ARROW_LEFTRIGHT".enum("", "BND_ICONID(8,29)"),
        "ICON_PLUS".enum("", "BND_ICONID(9,29)"),
        "ICON_DISCLOSURE_TRI_DOWN".enum("", "BND_ICONID(10,29)"),
        "ICON_DISCLOSURE_TRI_RIGHT".enum("", "BND_ICONID(11,29)"),
        "ICON_RADIOBUT_OFF".enum("", "BND_ICONID(12,29)"),
        "ICON_RADIOBUT_ON".enum("", "BND_ICONID(13,29)"),
        "ICON_MENU_PANEL".enum("", "BND_ICONID(14,29)"),
        "ICON_BLENDER".enum("", "BND_ICONID(15,29)"),
        "ICON_GRIP".enum("", "BND_ICONID(16,29)"),
        "ICON_DOT".enum("", "BND_ICONID(17,29)"),
        "ICON_COLLAPSEMENU".enum("", "BND_ICONID(18,29)"),
        "ICON_X".enum("", "BND_ICONID(19,29)"),
        "ICON_GO_LEFT".enum("", "BND_ICONID(21,29)"),
        "ICON_PLUG".enum("", "BND_ICONID(22,29)"),
        "ICON_UI".enum("", "BND_ICONID(23,29)"),
        "ICON_NODE".enum("", "BND_ICONID(24,29)"),
        "ICON_NODE_SEL".enum("", "BND_ICONID(25,29)"),
        "ICON_FULLSCREEN".enum("", "BND_ICONID(0,28)"),
        "ICON_SPLITSCREEN".enum("", "BND_ICONID(1,28)"),
        "ICON_RIGHTARROW_THIN".enum("", "BND_ICONID(2,28)"),
        "ICON_BORDERMOVE".enum("", "BND_ICONID(3,28)"),
        "ICON_VIEWZOOM".enum("", "BND_ICONID(4,28)"),
        "ICON_ZOOMIN".enum("", "BND_ICONID(5,28)"),
        "ICON_ZOOMOUT".enum("", "BND_ICONID(6,28)"),
        "ICON_PANEL_CLOSE".enum("", "BND_ICONID(7,28)"),
        "ICON_COPY_ID".enum("", "BND_ICONID(8,28)"),
        "ICON_EYEDROPPER".enum("", "BND_ICONID(9,28)"),
        "ICON_LINK_AREA".enum("", "BND_ICONID(10,28)"),
        "ICON_AUTO".enum("", "BND_ICONID(11,28)"),
        "ICON_CHECKBOX_DEHLT".enum("", "BND_ICONID(12,28)"),
        "ICON_CHECKBOX_HLT".enum("", "BND_ICONID(13,28)"),
        "ICON_UNLOCKED".enum("", "BND_ICONID(14,28)"),
        "ICON_LOCKED".enum("", "BND_ICONID(15,28)"),
        "ICON_UNPINNED".enum("", "BND_ICONID(16,28)"),
        "ICON_PINNED".enum("", "BND_ICONID(17,28)"),
        "ICON_SCREEN_BACK".enum("", "BND_ICONID(18,28)"),
        "ICON_RIGHTARROW".enum("", "BND_ICONID(19,28)"),
        "ICON_DOWNARROW_HLT".enum("", "BND_ICONID(20,28)"),
        "ICON_DOTSUP".enum("", "BND_ICONID(21,28)"),
        "ICON_DOTSDOWN".enum("", "BND_ICONID(22,28)"),
        "ICON_LINK".enum("", "BND_ICONID(23,28)"),
        "ICON_INLINK".enum("", "BND_ICONID(24,28)"),
        "ICON_PLUGIN".enum("", "BND_ICONID(25,28)"),
        "ICON_HELP".enum("", "BND_ICONID(0,27)"),
        "ICON_GHOST_ENABLED".enum("", "BND_ICONID(1,27)"),
        "ICON_COLOR".enum("", "BND_ICONID(2,27)"),
        "ICON_LINKED".enum("", "BND_ICONID(3,27)"),
        "ICON_UNLINKED".enum("", "BND_ICONID(4,27)"),
        "ICON_HAND".enum("", "BND_ICONID(5,27)"),
        "ICON_ZOOM_ALL".enum("", "BND_ICONID(6,27)"),
        "ICON_ZOOM_SELECTED".enum("", "BND_ICONID(7,27)"),
        "ICON_ZOOM_PREVIOUS".enum("", "BND_ICONID(8,27)"),
        "ICON_ZOOM_IN".enum("", "BND_ICONID(9,27)"),
        "ICON_ZOOM_OUT".enum("", "BND_ICONID(10,27)"),
        "ICON_RENDER_REGION".enum("", "BND_ICONID(11,27)"),
        "ICON_BORDER_RECT".enum("", "BND_ICONID(12,27)"),
        "ICON_BORDER_LASSO".enum("", "BND_ICONID(13,27)"),
        "ICON_FREEZE".enum("", "BND_ICONID(14,27)"),
        "ICON_STYLUS_PRESSURE".enum("", "BND_ICONID(15,27)"),
        "ICON_GHOST_DISABLED".enum("", "BND_ICONID(16,27)"),
        "ICON_NEW".enum("", "BND_ICONID(17,27)"),
        "ICON_FILE_TICK".enum("", "BND_ICONID(18,27)"),
        "ICON_QUIT".enum("", "BND_ICONID(19,27)"),
        "ICON_URL".enum("", "BND_ICONID(20,27)"),
        "ICON_RECOVER_LAST".enum("", "BND_ICONID(21,27)"),
        "ICON_FULLSCREEN_ENTER".enum("", "BND_ICONID(23,27)"),
        "ICON_FULLSCREEN_EXIT".enum("", "BND_ICONID(24,27)"),
        "ICON_BLANK1".enum("", "BND_ICONID(25,27)"),
        "ICON_LAMP".enum("", "BND_ICONID(0,26)"),
        "ICON_MATERIAL".enum("", "BND_ICONID(1,26)"),
        "ICON_TEXTURE".enum("", "BND_ICONID(2,26)"),
        "ICON_ANIM".enum("", "BND_ICONID(3,26)"),
        "ICON_WORLD".enum("", "BND_ICONID(4,26)"),
        "ICON_SCENE".enum("", "BND_ICONID(5,26)"),
        "ICON_EDIT".enum("", "BND_ICONID(6,26)"),
        "ICON_GAME".enum("", "BND_ICONID(7,26)"),
        "ICON_RADIO".enum("", "BND_ICONID(8,26)"),
        "ICON_SCRIPT".enum("", "BND_ICONID(9,26)"),
        "ICON_PARTICLES".enum("", "BND_ICONID(10,26)"),
        "ICON_PHYSICS".enum("", "BND_ICONID(11,26)"),
        "ICON_SPEAKER".enum("", "BND_ICONID(12,26)"),
        "ICON_TEXTURE_SHADED".enum("", "BND_ICONID(13,26)"),
        "ICON_VIEW3D".enum("", "BND_ICONID(0,25)"),
        "ICON_IPO".enum("", "BND_ICONID(1,25)"),
        "ICON_OOPS".enum("", "BND_ICONID(2,25)"),
        "ICON_BUTS".enum("", "BND_ICONID(3,25)"),
        "ICON_FILESEL".enum("", "BND_ICONID(4,25)"),
        "ICON_IMAGE_COL".enum("", "BND_ICONID(5,25)"),
        "ICON_INFO".enum("", "BND_ICONID(6,25)"),
        "ICON_SEQUENCE".enum("", "BND_ICONID(7,25)"),
        "ICON_TEXT".enum("", "BND_ICONID(8,25)"),
        "ICON_IMASEL".enum("", "BND_ICONID(9,25)"),
        "ICON_SOUND".enum("", "BND_ICONID(10,25)"),
        "ICON_ACTION".enum("", "BND_ICONID(11,25)"),
        "ICON_NLA".enum("", "BND_ICONID(12,25)"),
        "ICON_SCRIPTWIN".enum("", "BND_ICONID(13,25)"),
        "ICON_TIME".enum("", "BND_ICONID(14,25)"),
        "ICON_NODETREE".enum("", "BND_ICONID(15,25)"),
        "ICON_LOGIC".enum("", "BND_ICONID(16,25)"),
        "ICON_CONSOLE".enum("", "BND_ICONID(17,25)"),
        "ICON_PREFERENCES".enum("", "BND_ICONID(18,25)"),
        "ICON_CLIP".enum("", "BND_ICONID(19,25)"),
        "ICON_ASSET_MANAGER".enum("", "BND_ICONID(20,25)"),
        "ICON_OBJECT_DATAMODE".enum("", "BND_ICONID(0,24)"),
        "ICON_EDITMODE_HLT".enum("", "BND_ICONID(1,24)"),
        "ICON_FACESEL_HLT".enum("", "BND_ICONID(2,24)"),
        "ICON_VPAINT_HLT".enum("", "BND_ICONID(3,24)"),
        "ICON_TPAINT_HLT".enum("", "BND_ICONID(4,24)"),
        "ICON_WPAINT_HLT".enum("", "BND_ICONID(5,24)"),
        "ICON_SCULPTMODE_HLT".enum("", "BND_ICONID(6,24)"),
        "ICON_POSE_HLT".enum("", "BND_ICONID(7,24)"),
        "ICON_PARTICLEMODE".enum("", "BND_ICONID(8,24)"),
        "ICON_LIGHTPAINT".enum("", "BND_ICONID(9,24)"),
        "ICON_SCENE_DATA".enum("", "BND_ICONID(0,23)"),
        "ICON_RENDERLAYERS".enum("", "BND_ICONID(1,23)"),
        "ICON_WORLD_DATA".enum("", "BND_ICONID(2,23)"),
        "ICON_OBJECT_DATA".enum("", "BND_ICONID(3,23)"),
        "ICON_MESH_DATA".enum("", "BND_ICONID(4,23)"),
        "ICON_CURVE_DATA".enum("", "BND_ICONID(5,23)"),
        "ICON_META_DATA".enum("", "BND_ICONID(6,23)"),
        "ICON_LATTICE_DATA".enum("", "BND_ICONID(7,23)"),
        "ICON_LAMP_DATA".enum("", "BND_ICONID(8,23)"),
        "ICON_MATERIAL_DATA".enum("", "BND_ICONID(9,23)"),
        "ICON_TEXTURE_DATA".enum("", "BND_ICONID(10,23)"),
        "ICON_ANIM_DATA".enum("", "BND_ICONID(11,23)"),
        "ICON_CAMERA_DATA".enum("", "BND_ICONID(12,23)"),
        "ICON_PARTICLE_DATA".enum("", "BND_ICONID(13,23)"),
        "ICON_LIBRARY_DATA_DIRECT".enum("", "BND_ICONID(14,23)"),
        "ICON_GROUP".enum("", "BND_ICONID(15,23)"),
        "ICON_ARMATURE_DATA".enum("", "BND_ICONID(16,23)"),
        "ICON_POSE_DATA".enum("", "BND_ICONID(17,23)"),
        "ICON_BONE_DATA".enum("", "BND_ICONID(18,23)"),
        "ICON_CONSTRAINT".enum("", "BND_ICONID(19,23)"),
        "ICON_SHAPEKEY_DATA".enum("", "BND_ICONID(20,23)"),
        "ICON_CONSTRAINT_BONE".enum("", "BND_ICONID(21,23)"),
        "ICON_CAMERA_STEREO".enum("", "BND_ICONID(22,23)"),
        "ICON_PACKAGE".enum("", "BND_ICONID(23,23)"),
        "ICON_UGLYPACKAGE".enum("", "BND_ICONID(24,23)"),
        "ICON_BRUSH_DATA".enum("", "BND_ICONID(0,22)"),
        "ICON_IMAGE_DATA".enum("", "BND_ICONID(1,22)"),
        "ICON_FILE".enum("", "BND_ICONID(2,22)"),
        "ICON_FCURVE".enum("", "BND_ICONID(3,22)"),
        "ICON_FONT_DATA".enum("", "BND_ICONID(4,22)"),
        "ICON_RENDER_RESULT".enum("", "BND_ICONID(5,22)"),
        "ICON_SURFACE_DATA".enum("", "BND_ICONID(6,22)"),
        "ICON_EMPTY_DATA".enum("", "BND_ICONID(7,22)"),
        "ICON_SETTINGS".enum("", "BND_ICONID(8,22)"),
        "ICON_RENDER_ANIMATION".enum("", "BND_ICONID(9,22)"),
        "ICON_RENDER_STILL".enum("", "BND_ICONID(10,22)"),
        "ICON_BOIDS".enum("", "BND_ICONID(12,22)"),
        "ICON_STRANDS".enum("", "BND_ICONID(13,22)"),
        "ICON_LIBRARY_DATA_INDIRECT".enum("", "BND_ICONID(14,22)"),
        "ICON_GREASEPENCIL".enum("", "BND_ICONID(15,22)"),
        "ICON_LINE_DATA".enum("", "BND_ICONID(16,22)"),
        "ICON_GROUP_BONE".enum("", "BND_ICONID(18,22)"),
        "ICON_GROUP_VERTEX".enum("", "BND_ICONID(19,22)"),
        "ICON_GROUP_VCOL".enum("", "BND_ICONID(20,22)"),
        "ICON_GROUP_UVS".enum("", "BND_ICONID(21,22)"),
        "ICON_RNA".enum("", "BND_ICONID(24,22)"),
        "ICON_RNA_ADD".enum("", "BND_ICONID(25,22)"),
        "ICON_OUTLINER_OB_EMPTY".enum("", "BND_ICONID(0,20)"),
        "ICON_OUTLINER_OB_MESH".enum("", "BND_ICONID(1,20)"),
        "ICON_OUTLINER_OB_CURVE".enum("", "BND_ICONID(2,20)"),
        "ICON_OUTLINER_OB_LATTICE".enum("", "BND_ICONID(3,20)"),
        "ICON_OUTLINER_OB_META".enum("", "BND_ICONID(4,20)"),
        "ICON_OUTLINER_OB_LAMP".enum("", "BND_ICONID(5,20)"),
        "ICON_OUTLINER_OB_CAMERA".enum("", "BND_ICONID(6,20)"),
        "ICON_OUTLINER_OB_ARMATURE".enum("", "BND_ICONID(7,20)"),
        "ICON_OUTLINER_OB_FONT".enum("", "BND_ICONID(8,20)"),
        "ICON_OUTLINER_OB_SURFACE".enum("", "BND_ICONID(9,20)"),
        "ICON_OUTLINER_OB_SPEAKER".enum("", "BND_ICONID(10,20)"),
        "ICON_RESTRICT_VIEW_OFF".enum("", "BND_ICONID(19,20)"),
        "ICON_RESTRICT_VIEW_ON".enum("", "BND_ICONID(20,20)"),
        "ICON_RESTRICT_SELECT_OFF".enum("", "BND_ICONID(21,20)"),
        "ICON_RESTRICT_SELECT_ON".enum("", "BND_ICONID(22,20)"),
        "ICON_RESTRICT_RENDER_OFF".enum("", "BND_ICONID(23,20)"),
        "ICON_RESTRICT_RENDER_ON".enum("", "BND_ICONID(24,20)"),
        "ICON_OUTLINER_DATA_EMPTY".enum("", "BND_ICONID(0,19)"),
        "ICON_OUTLINER_DATA_MESH".enum("", "BND_ICONID(1,19)"),
        "ICON_OUTLINER_DATA_CURVE".enum("", "BND_ICONID(2,19)"),
        "ICON_OUTLINER_DATA_LATTICE".enum("", "BND_ICONID(3,19)"),
        "ICON_OUTLINER_DATA_META".enum("", "BND_ICONID(4,19)"),
        "ICON_OUTLINER_DATA_LAMP".enum("", "BND_ICONID(5,19)"),
        "ICON_OUTLINER_DATA_CAMERA".enum("", "BND_ICONID(6,19)"),
        "ICON_OUTLINER_DATA_ARMATURE".enum("", "BND_ICONID(7,19)"),
        "ICON_OUTLINER_DATA_FONT".enum("", "BND_ICONID(8,19)"),
        "ICON_OUTLINER_DATA_SURFACE".enum("", "BND_ICONID(9,19)"),
        "ICON_OUTLINER_DATA_SPEAKER".enum("", "BND_ICONID(10,19)"),
        "ICON_OUTLINER_DATA_POSE".enum("", "BND_ICONID(11,19)"),
        "ICON_MESH_PLANE".enum("", "BND_ICONID(0,18)"),
        "ICON_MESH_CUBE".enum("", "BND_ICONID(1,18)"),
        "ICON_MESH_CIRCLE".enum("", "BND_ICONID(2,18)"),
        "ICON_MESH_UVSPHERE".enum("", "BND_ICONID(3,18)"),
        "ICON_MESH_ICOSPHERE".enum("", "BND_ICONID(4,18)"),
        "ICON_MESH_GRID".enum("", "BND_ICONID(5,18)"),
        "ICON_MESH_MONKEY".enum("", "BND_ICONID(6,18)"),
        "ICON_MESH_CYLINDER".enum("", "BND_ICONID(7,18)"),
        "ICON_MESH_TORUS".enum("", "BND_ICONID(8,18)"),
        "ICON_MESH_CONE".enum("", "BND_ICONID(9,18)"),
        "ICON_LAMP_POINT".enum("", "BND_ICONID(12,18)"),
        "ICON_LAMP_SUN".enum("", "BND_ICONID(13,18)"),
        "ICON_LAMP_SPOT".enum("", "BND_ICONID(14,18)"),
        "ICON_LAMP_HEMI".enum("", "BND_ICONID(15,18)"),
        "ICON_LAMP_AREA".enum("", "BND_ICONID(16,18)"),
        "ICON_META_EMPTY".enum("", "BND_ICONID(19,18)"),
        "ICON_META_PLANE".enum("", "BND_ICONID(20,18)"),
        "ICON_META_CUBE".enum("", "BND_ICONID(21,18)"),
        "ICON_META_BALL".enum("", "BND_ICONID(22,18)"),
        "ICON_META_ELLIPSOID".enum("", "BND_ICONID(23,18)"),
        "ICON_META_CAPSULE".enum("", "BND_ICONID(24,18)"),
        "ICON_SURFACE_NCURVE".enum("", "BND_ICONID(0,17)"),
        "ICON_SURFACE_NCIRCLE".enum("", "BND_ICONID(1,17)"),
        "ICON_SURFACE_NSURFACE".enum("", "BND_ICONID(2,17)"),
        "ICON_SURFACE_NCYLINDER".enum("", "BND_ICONID(3,17)"),
        "ICON_SURFACE_NSPHERE".enum("", "BND_ICONID(4,17)"),
        "ICON_SURFACE_NTORUS".enum("", "BND_ICONID(5,17)"),
        "ICON_CURVE_BEZCURVE".enum("", "BND_ICONID(9,17)"),
        "ICON_CURVE_BEZCIRCLE".enum("", "BND_ICONID(10,17)"),
        "ICON_CURVE_NCURVE".enum("", "BND_ICONID(11,17)"),
        "ICON_CURVE_NCIRCLE".enum("", "BND_ICONID(12,17)"),
        "ICON_CURVE_PATH".enum("", "BND_ICONID(13,17)"),
        "ICON_COLOR_RED".enum("", "BND_ICONID(19,17)"),
        "ICON_COLOR_GREEN".enum("", "BND_ICONID(20,17)"),
        "ICON_COLOR_BLUE".enum("", "BND_ICONID(21,17)"),
        "ICON_FORCE_FORCE".enum("", "BND_ICONID(0,16)"),
        "ICON_FORCE_WIND".enum("", "BND_ICONID(1,16)"),
        "ICON_FORCE_VORTEX".enum("", "BND_ICONID(2,16)"),
        "ICON_FORCE_MAGNETIC".enum("", "BND_ICONID(3,16)"),
        "ICON_FORCE_HARMONIC".enum("", "BND_ICONID(4,16)"),
        "ICON_FORCE_CHARGE".enum("", "BND_ICONID(5,16)"),
        "ICON_FORCE_LENNARDJONES".enum("", "BND_ICONID(6,16)"),
        "ICON_FORCE_TEXTURE".enum("", "BND_ICONID(7,16)"),
        "ICON_FORCE_CURVE".enum("", "BND_ICONID(8,16)"),
        "ICON_FORCE_BOID".enum("", "BND_ICONID(9,16)"),
        "ICON_FORCE_TURBULENCE".enum("", "BND_ICONID(10,16)"),
        "ICON_FORCE_DRAG".enum("", "BND_ICONID(11,16)"),
        "ICON_FORCE_SMOKEFLOW".enum("", "BND_ICONID(12,16)"),
        "ICON_MODIFIER".enum("", "BND_ICONID(0,12)"),
        "ICON_MOD_WAVE".enum("", "BND_ICONID(1,12)"),
        "ICON_MOD_BUILD".enum("", "BND_ICONID(2,12)"),
        "ICON_MOD_DECIM".enum("", "BND_ICONID(3,12)"),
        "ICON_MOD_MIRROR".enum("", "BND_ICONID(4,12)"),
        "ICON_MOD_SOFT".enum("", "BND_ICONID(5,12)"),
        "ICON_MOD_SUBSURF".enum("", "BND_ICONID(6,12)"),
        "ICON_HOOK".enum("", "BND_ICONID(7,12)"),
        "ICON_MOD_PHYSICS".enum("", "BND_ICONID(8,12)"),
        "ICON_MOD_PARTICLES".enum("", "BND_ICONID(9,12)"),
        "ICON_MOD_BOOLEAN".enum("", "BND_ICONID(10,12)"),
        "ICON_MOD_EDGESPLIT".enum("", "BND_ICONID(11,12)"),
        "ICON_MOD_ARRAY".enum("", "BND_ICONID(12,12)"),
        "ICON_MOD_UVPROJECT".enum("", "BND_ICONID(13,12)"),
        "ICON_MOD_DISPLACE".enum("", "BND_ICONID(14,12)"),
        "ICON_MOD_CURVE".enum("", "BND_ICONID(15,12)"),
        "ICON_MOD_LATTICE".enum("", "BND_ICONID(16,12)"),
        "ICON_CONSTRAINT_DATA".enum("", "BND_ICONID(17,12)"),
        "ICON_MOD_ARMATURE".enum("", "BND_ICONID(18,12)"),
        "ICON_MOD_SHRINKWRAP".enum("", "BND_ICONID(19,12)"),
        "ICON_MOD_CAST".enum("", "BND_ICONID(20,12)"),
        "ICON_MOD_MESHDEFORM".enum("", "BND_ICONID(21,12)"),
        "ICON_MOD_BEVEL".enum("", "BND_ICONID(22,12)"),
        "ICON_MOD_SMOOTH".enum("", "BND_ICONID(23,12)"),
        "ICON_MOD_SIMPLEDEFORM".enum("", "BND_ICONID(24,12)"),
        "ICON_MOD_MASK".enum("", "BND_ICONID(25,12)"),
        "ICON_MOD_CLOTH".enum("", "BND_ICONID(0,11)"),
        "ICON_MOD_EXPLODE".enum("", "BND_ICONID(1,11)"),
        "ICON_MOD_FLUIDSIM".enum("", "BND_ICONID(2,11)"),
        "ICON_MOD_MULTIRES".enum("", "BND_ICONID(3,11)"),
        "ICON_MOD_SMOKE".enum("", "BND_ICONID(4,11)"),
        "ICON_MOD_SOLIDIFY".enum("", "BND_ICONID(5,11)"),
        "ICON_MOD_SCREW".enum("", "BND_ICONID(6,11)"),
        "ICON_MOD_VERTEX_WEIGHT".enum("", "BND_ICONID(7,11)"),
        "ICON_MOD_DYNAMICPAINT".enum("", "BND_ICONID(8,11)"),
        "ICON_MOD_REMESH".enum("", "BND_ICONID(9,11)"),
        "ICON_MOD_OCEAN".enum("", "BND_ICONID(10,11)"),
        "ICON_MOD_WARP".enum("", "BND_ICONID(11,11)"),
        "ICON_MOD_SKIN".enum("", "BND_ICONID(12,11)"),
        "ICON_MOD_TRIANGULATE".enum("", "BND_ICONID(13,11)"),
        "ICON_MOD_WIREFRAME".enum("", "BND_ICONID(14,11)"),
        "ICON_REC".enum("", "BND_ICONID(0,10)"),
        "ICON_PLAY".enum("", "BND_ICONID(1,10)"),
        "ICON_FF".enum("", "BND_ICONID(2,10)"),
        "ICON_REW".enum("", "BND_ICONID(3,10)"),
        "ICON_PAUSE".enum("", "BND_ICONID(4,10)"),
        "ICON_PREV_KEYFRAME".enum("", "BND_ICONID(5,10)"),
        "ICON_NEXT_KEYFRAME".enum("", "BND_ICONID(6,10)"),
        "ICON_PLAY_AUDIO".enum("", "BND_ICONID(7,10)"),
        "ICON_PLAY_REVERSE".enum("", "BND_ICONID(8,10)"),
        "ICON_PREVIEW_RANGE".enum("", "BND_ICONID(9,10)"),
        "ICON_ACTION_TWEAK".enum("", "BND_ICONID(10,10)"),
        "ICON_PMARKER_ACT".enum("", "BND_ICONID(11,10)"),
        "ICON_PMARKER_SEL".enum("", "BND_ICONID(12,10)"),
        "ICON_PMARKER".enum("", "BND_ICONID(13,10)"),
        "ICON_MARKER_HLT".enum("", "BND_ICONID(14,10)"),
        "ICON_MARKER".enum("", "BND_ICONID(15,10)"),
        "ICON_SPACE2".enum("", "BND_ICONID(16,10)"),
        "ICON_SPACE3".enum("", "BND_ICONID(17,10)"),
        "ICON_KEYINGSET".enum("", "BND_ICONID(18,10)"),
        "ICON_KEY_DEHLT".enum("", "BND_ICONID(19,10)"),
        "ICON_KEY_HLT".enum("", "BND_ICONID(20,10)"),
        "ICON_MUTE_IPO_OFF".enum("", "BND_ICONID(21,10)"),
        "ICON_MUTE_IPO_ON".enum("", "BND_ICONID(22,10)"),
        "ICON_VISIBLE_IPO_OFF".enum("", "BND_ICONID(23,10)"),
        "ICON_VISIBLE_IPO_ON".enum("", "BND_ICONID(24,10)"),
        "ICON_DRIVER".enum("", "BND_ICONID(25,10)"),
        "ICON_SOLO_OFF".enum("", "BND_ICONID(0,9)"),
        "ICON_SOLO_ON".enum("", "BND_ICONID(1,9)"),
        "ICON_FRAME_PREV".enum("", "BND_ICONID(2,9)"),
        "ICON_FRAME_NEXT".enum("", "BND_ICONID(3,9)"),
        "ICON_NLA_PUSHDOWN".enum("", "BND_ICONID(4,9)"),
        "ICON_IPO_CONSTANT".enum("", "BND_ICONID(5,9)"),
        "ICON_IPO_LINEAR".enum("", "BND_ICONID(6,9)"),
        "ICON_IPO_BEZIER".enum("", "BND_ICONID(7,9)"),
        "ICON_IPO_SINE".enum("", "BND_ICONID(8,9)"),
        "ICON_IPO_QUAD".enum("", "BND_ICONID(9,9)"),
        "ICON_IPO_CUBIC".enum("", "BND_ICONID(10,9)"),
        "ICON_IPO_QUART".enum("", "BND_ICONID(11,9)"),
        "ICON_IPO_QUINT".enum("", "BND_ICONID(12,9)"),
        "ICON_IPO_EXPO".enum("", "BND_ICONID(13,9)"),
        "ICON_IPO_CIRC".enum("", "BND_ICONID(14,9)"),
        "ICON_IPO_BOUNCE".enum("", "BND_ICONID(15,9)"),
        "ICON_IPO_ELASTIC".enum("", "BND_ICONID(16,9)"),
        "ICON_IPO_BACK".enum("", "BND_ICONID(17,9)"),
        "ICON_IPO_EASE_IN".enum("", "BND_ICONID(18,9)"),
        "ICON_IPO_EASE_OUT".enum("", "BND_ICONID(19,9)"),
        "ICON_IPO_EASE_IN_OUT".enum("", "BND_ICONID(20,9)"),
        "ICON_VERTEXSEL".enum("", "BND_ICONID(0,8)"),
        "ICON_EDGESEL".enum("", "BND_ICONID(1,8)"),
        "ICON_FACESEL".enum("", "BND_ICONID(2,8)"),
        "ICON_LOOPSEL".enum("", "BND_ICONID(3,8)"),
        "ICON_ROTATE".enum("", "BND_ICONID(5,8)"),
        "ICON_CURSOR".enum("", "BND_ICONID(6,8)"),
        "ICON_ROTATECOLLECTION".enum("", "BND_ICONID(7,8)"),
        "ICON_ROTATECENTER".enum("", "BND_ICONID(8,8)"),
        "ICON_ROTACTIVE".enum("", "BND_ICONID(9,8)"),
        "ICON_ALIGN".enum("", "BND_ICONID(10,8)"),
        "ICON_SMOOTHCURVE".enum("", "BND_ICONID(12,8)"),
        "ICON_SPHERECURVE".enum("", "BND_ICONID(13,8)"),
        "ICON_ROOTCURVE".enum("", "BND_ICONID(14,8)"),
        "ICON_SHARPCURVE".enum("", "BND_ICONID(15,8)"),
        "ICON_LINCURVE".enum("", "BND_ICONID(16,8)"),
        "ICON_NOCURVE".enum("", "BND_ICONID(17,8)"),
        "ICON_RNDCURVE".enum("", "BND_ICONID(18,8)"),
        "ICON_PROP_OFF".enum("", "BND_ICONID(19,8)"),
        "ICON_PROP_ON".enum("", "BND_ICONID(20,8)"),
        "ICON_PROP_CON".enum("", "BND_ICONID(21,8)"),
        "ICON_SCULPT_DYNTOPO".enum("", "BND_ICONID(22,8)"),
        "ICON_PARTICLE_POINT".enum("", "BND_ICONID(23,8)"),
        "ICON_PARTICLE_TIP".enum("", "BND_ICONID(24,8)"),
        "ICON_PARTICLE_PATH".enum("", "BND_ICONID(25,8)"),
        "ICON_MAN_TRANS".enum("", "BND_ICONID(0,7)"),
        "ICON_MAN_ROT".enum("", "BND_ICONID(1,7)"),
        "ICON_MAN_SCALE".enum("", "BND_ICONID(2,7)"),
        "ICON_MANIPUL".enum("", "BND_ICONID(3,7)"),
        "ICON_SNAP_OFF".enum("", "BND_ICONID(4,7)"),
        "ICON_SNAP_ON".enum("", "BND_ICONID(5,7)"),
        "ICON_SNAP_NORMAL".enum("", "BND_ICONID(6,7)"),
        "ICON_SNAP_INCREMENT".enum("", "BND_ICONID(7,7)"),
        "ICON_SNAP_VERTEX".enum("", "BND_ICONID(8,7)"),
        "ICON_SNAP_EDGE".enum("", "BND_ICONID(9,7)"),
        "ICON_SNAP_FACE".enum("", "BND_ICONID(10,7)"),
        "ICON_SNAP_VOLUME".enum("", "BND_ICONID(11,7)"),
        "ICON_STICKY_UVS_LOC".enum("", "BND_ICONID(13,7)"),
        "ICON_STICKY_UVS_DISABLE".enum("", "BND_ICONID(14,7)"),
        "ICON_STICKY_UVS_VERT".enum("", "BND_ICONID(15,7)"),
        "ICON_CLIPUV_DEHLT".enum("", "BND_ICONID(16,7)"),
        "ICON_CLIPUV_HLT".enum("", "BND_ICONID(17,7)"),
        "ICON_SNAP_PEEL_OBJECT".enum("", "BND_ICONID(18,7)"),
        "ICON_GRID".enum("", "BND_ICONID(19,7)"),
        "ICON_PASTEDOWN".enum("", "BND_ICONID(0,6)"),
        "ICON_COPYDOWN".enum("", "BND_ICONID(1,6)"),
        "ICON_PASTEFLIPUP".enum("", "BND_ICONID(2,6)"),
        "ICON_PASTEFLIPDOWN".enum("", "BND_ICONID(3,6)"),
        "ICON_SNAP_SURFACE".enum("", "BND_ICONID(8,6)"),
        "ICON_AUTOMERGE_ON".enum("", "BND_ICONID(9,6)"),
        "ICON_AUTOMERGE_OFF".enum("", "BND_ICONID(10,6)"),
        "ICON_RETOPO".enum("", "BND_ICONID(11,6)"),
        "ICON_UV_VERTEXSEL".enum("", "BND_ICONID(12,6)"),
        "ICON_UV_EDGESEL".enum("", "BND_ICONID(13,6)"),
        "ICON_UV_FACESEL".enum("", "BND_ICONID(14,6)"),
        "ICON_UV_ISLANDSEL".enum("", "BND_ICONID(15,6)"),
        "ICON_UV_SYNC_SELECT".enum("", "BND_ICONID(16,6)"),
        "ICON_BBOX".enum("", "BND_ICONID(0,5)"),
        "ICON_WIRE".enum("", "BND_ICONID(1,5)"),
        "ICON_SOLID".enum("", "BND_ICONID(2,5)"),
        "ICON_SMOOTH".enum("", "BND_ICONID(3,5)"),
        "ICON_POTATO".enum("", "BND_ICONID(4,5)"),
        "ICON_ORTHO".enum("", "BND_ICONID(6,5)"),
        "ICON_LOCKVIEW_OFF".enum("", "BND_ICONID(9,5)"),
        "ICON_LOCKVIEW_ON".enum("", "BND_ICONID(10,5)"),
        "ICON_AXIS_SIDE".enum("", "BND_ICONID(12,5)"),
        "ICON_AXIS_FRONT".enum("", "BND_ICONID(13,5)"),
        "ICON_AXIS_TOP".enum("", "BND_ICONID(14,5)"),
        "ICON_NDOF_DOM".enum("", "BND_ICONID(15,5)"),
        "ICON_NDOF_TURN".enum("", "BND_ICONID(16,5)"),
        "ICON_NDOF_FLY".enum("", "BND_ICONID(17,5)"),
        "ICON_NDOF_TRANS".enum("", "BND_ICONID(18,5)"),
        "ICON_LAYER_USED".enum("", "BND_ICONID(19,5)"),
        "ICON_LAYER_ACTIVE".enum("", "BND_ICONID(20,5)"),
        "ICON_SORTALPHA".enum("", "BND_ICONID(0,3)"),
        "ICON_SORTBYEXT".enum("", "BND_ICONID(1,3)"),
        "ICON_SORTTIME".enum("", "BND_ICONID(2,3)"),
        "ICON_SORTSIZE".enum("", "BND_ICONID(3,3)"),
        "ICON_LONGDISPLAY".enum("", "BND_ICONID(4,3)"),
        "ICON_SHORTDISPLAY".enum("", "BND_ICONID(5,3)"),
        "ICON_GHOST".enum("", "BND_ICONID(6,3)"),
        "ICON_IMGDISPLAY".enum("", "BND_ICONID(7,3)"),
        "ICON_SAVE_AS".enum("", "BND_ICONID(8,3)"),
        "ICON_SAVE_COPY".enum("", "BND_ICONID(9,3)"),
        "ICON_BOOKMARKS".enum("", "BND_ICONID(10,3)"),
        "ICON_FONTPREVIEW".enum("", "BND_ICONID(11,3)"),
        "ICON_FILTER".enum("", "BND_ICONID(12,3)"),
        "ICON_NEWFOLDER".enum("", "BND_ICONID(13,3)"),
        "ICON_OPEN_RECENT".enum("", "BND_ICONID(14,3)"),
        "ICON_FILE_PARENT".enum("", "BND_ICONID(15,3)"),
        "ICON_FILE_REFRESH".enum("", "BND_ICONID(16,3)"),
        "ICON_FILE_FOLDER".enum("", "BND_ICONID(17,3)"),
        "ICON_FILE_BLANK".enum("", "BND_ICONID(18,3)"),
        "ICON_FILE_BLEND".enum("", "BND_ICONID(19,3)"),
        "ICON_FILE_IMAGE".enum("", "BND_ICONID(20,3)"),
        "ICON_FILE_MOVIE".enum("", "BND_ICONID(21,3)"),
        "ICON_FILE_SCRIPT".enum("", "BND_ICONID(22,3)"),
        "ICON_FILE_SOUND".enum("", "BND_ICONID(23,3)"),
        "ICON_FILE_FONT".enum("", "BND_ICONID(24,3)"),
        "ICON_FILE_TEXT".enum("", "BND_ICONID(25,3)"),
        "ICON_RECOVER_AUTO".enum("", "BND_ICONID(0,2)"),
        "ICON_SAVE_PREFS".enum("", "BND_ICONID(1,2)"),
        "ICON_LINK_BLEND".enum("", "BND_ICONID(2,2)"),
        "ICON_APPEND_BLEND".enum("", "BND_ICONID(3,2)"),
        "ICON_IMPORT".enum("", "BND_ICONID(4,2)"),
        "ICON_EXPORT".enum("", "BND_ICONID(5,2)"),
        "ICON_EXTERNAL_DATA".enum("", "BND_ICONID(6,2)"),
        "ICON_LOAD_FACTORY".enum("", "BND_ICONID(7,2)"),
        "ICON_LOOP_BACK".enum("", "BND_ICONID(13,2)"),
        "ICON_LOOP_FORWARDS".enum("", "BND_ICONID(14,2)"),
        "ICON_BACK".enum("", "BND_ICONID(15,2)"),
        "ICON_FORWARD".enum("", "BND_ICONID(16,2)"),
        "ICON_FILE_BACKUP".enum("", "BND_ICONID(24,2)"),
        "ICON_DISK_DRIVE".enum("", "BND_ICONID(25,2)"),
        "ICON_MATPLANE".enum("", "BND_ICONID(0,1)"),
        "ICON_MATSPHERE".enum("", "BND_ICONID(1,1)"),
        "ICON_MATCUBE".enum("", "BND_ICONID(2,1)"),
        "ICON_MONKEY".enum("", "BND_ICONID(3,1)"),
        "ICON_HAIR".enum("", "BND_ICONID(4,1)"),
        "ICON_ALIASED".enum("", "BND_ICONID(5,1)"),
        "ICON_ANTIALIASED".enum("", "BND_ICONID(6,1)"),
        "ICON_MAT_SPHERE_SKY".enum("", "BND_ICONID(7,1)"),
        "ICON_WORDWRAP_OFF".enum("", "BND_ICONID(12,1)"),
        "ICON_WORDWRAP_ON".enum("", "BND_ICONID(13,1)"),
        "ICON_SYNTAX_OFF".enum("", "BND_ICONID(14,1)"),
        "ICON_SYNTAX_ON".enum("", "BND_ICONID(15,1)"),
        "ICON_LINENUMBERS_OFF".enum("", "BND_ICONID(16,1)"),
        "ICON_LINENUMBERS_ON".enum("", "BND_ICONID(17,1)"),
        "ICON_SCRIPTPLUGINS".enum("", "BND_ICONID(18,1)"),
        "ICON_SEQ_SEQUENCER".enum("", "BND_ICONID(0,0)"),
        "ICON_SEQ_PREVIEW".enum("", "BND_ICONID(1,0)"),
        "ICON_SEQ_LUMA_WAVEFORM".enum("", "BND_ICONID(2,0)"),
        "ICON_SEQ_CHROMA_SCOPE".enum("", "BND_ICONID(3,0)"),
        "ICON_SEQ_HISTOGRAM".enum("", "BND_ICONID(4,0)"),
        "ICON_SEQ_SPLITVIEW".enum("", "BND_ICONID(5,0)"),
        "ICON_IMAGE_RGB".enum("", "BND_ICONID(9,0)"),
        "ICON_IMAGE_RGB_ALPHA".enum("", "BND_ICONID(10,0)"),
        "ICON_IMAGE_ALPHA".enum("", "BND_ICONID(11,0)"),
        "ICON_IMAGE_ZDEPTH".enum("", "BND_ICONID(12,0)"),
        "ICON_IMAGEFILE".enum("", "BND_ICONID(13,0)")
    )

    void(
        "SetTheme",
        "Sets the current theme all widgets will be drawn with. The default Blender 2.6 theme is set by default.",

        BNDtheme("theme", "")
    )

    BNDtheme.const.p(
        "GetTheme",
        "Returns the currently set theme.",

        void()
    )

    void(
        "SetIconImage",
        """
        Designates an image handle as returned by {@code nvgCreateImage*()} as the themes' icon sheet.

        The icon sheet format must be compatible to Blender 2.6's icon sheet; the order of icons does not matter. A valid icon sheet is e.g. shown at ${url(
            "http://wiki.blender.org/index.php/Dev:2.5/Doc/How_to/Add_an_icon",
            "how to add an icon"
        )}.
        """,

        int("image", "")
    )

    void(
        "SetFont",
        """
        Designates an image handle as returned by {@code nvgCreateFont*()} as the themes' UI font.

        Blender's original UI font Droid Sans is perfectly suited and available ${url(
            "https://svn.blender.org/svnroot/bf-blender/trunk/blender/release/datafiles/fonts/",
            "here"
        )}.
        """,

        int("font", "")
    )
    
    val ctx = NVGcontext.p("ctx", "the NanoVG context")

    void(
        "Label",
        "Draws a label with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", "widget looks best when height is #WIDGET_HEIGHT"),
        int("iconid", "if &ge; 0, an icon will be added to the widget"),
        nullable..charUTF8.const.p("label", "if not #NULL, a label will be added to the widget")
    )

    void(
        "ToolButton",
        "Draws a tool button with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", "widget looks best when height is #WIDGET_HEIGHT"),
        int("flags", "the corner flags", "CORNER_\\w+"),
        BNDwidgetState("state", "the current UI state", "#DEFAULT #HOVER #ACTIVE"),
        int("iconid", "if &ge; 0, an icon will be added to the widget"),
        nullable..charUTF8.const.p("label", "if not #NULL, a label will be added to the widget")
    )

    void(
        "RadioButton",
        "Draws a radio button with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", "widget looks best when height is #WIDGET_HEIGHT"),
        int("flags", "the corner flags", "CORNER_\\w+"),
        BNDwidgetState("state", "the current UI state", "#DEFAULT #HOVER #ACTIVE"),
        int("iconid", "if &ge; 0, an icon will be added to the widget"),
        nullable..charUTF8.const.p("label", "if not #NULL, a label will be added to the widget")
    )

    int(
        "TextFieldTextPosition",
        "Calculates the corresponding text position for given coordinates {@code px/py} in a text field. See #TextField() for more info.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", ""),
        int("iconid", "if &ge; 0, an icon will be added to the widget"),
        nullable..charUTF8.const.p("text", "if not #NULL, text will be printed to the widget"),
        int("px", ""),
        int("py", "")
    )

    void(
        "TextField",
        "Draws a text field with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", "widget looks best when height is #WIDGET_HEIGHT"),
        int("flags", "the corner flags", "CORNER_\\w+"),
        BNDwidgetState("state", "the current UI state", "#DEFAULT #HOVER #ACTIVE"),
        int("iconid", "if &ge; 0, an icon will be added to the widget"),
        nullable..charUTF8.const.p("text", "if not #NULL, text will be printed to the widget"),
        int("cbegin", "must be &ge; 0 and &le; {@code strlen(text)} and denotes the beginning of the caret"),
        int(
            "cend",
            """
            must be &ge; {@code cbegin} and &le; {@code strlen(text)} and denotes the end of the caret. If {@code cend} &lt; {@code cbegin}, then no caret will
            be drawn.
            """
        )
    )

    void(
        "OptionButton",
        """
        Draws an option button with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
        """,

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", "widget looks best when height is #WIDGET_HEIGHT"),
        BNDwidgetState("state", "the current UI state", "#DEFAULT #HOVER #ACTIVE"),
        nullable..charUTF8.const.p("label", "if not #NULL, a label will be added to the widget")
    )

    void(
        "ChoiceButton",
        "Draws a choice button with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", "widget looks best when height is #WIDGET_HEIGHT"),
        int("flags", "the corner flags", "CORNER_\\w+"),
        BNDwidgetState("state", "the current UI state", "#DEFAULT #HOVER #ACTIVE"),
        int("iconid", "if &ge; 0, an icon will be added to the widget"),
        nullable..charUTF8.const.p("label", "if not #NULL, a label will be added to the widget")
    )

    void(
        "ColorButton",
        """
        Draws a color button with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
        """,

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", "widget looks best when height is #WIDGET_HEIGHT"),
        int("flags", "the corner flags", "CORNER_\\w+"),
        NVGcolor("color", "")
    )

    void(
        "NumberField",
        "Draws a number field with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", "widget looks best when height is #WIDGET_HEIGHT"),
        int("flags", "the corner flags", "CORNER_\\w+"),
        BNDwidgetState("state", "the current UI state", "#DEFAULT #HOVER #ACTIVE"),
        nullable..charUTF8.const.p("label", "if not #NULL, a label will be added to the widget"),
        nullable..charUTF8.const.p("value", "if not #NULL, a value will be added to the widget along with a \":\" separator")
    )

    void(
        "Slider",
        "Draws slider control with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", "widget looks best when height is #WIDGET_HEIGHT"),
        int("flags", "the corner flags", "CORNER_\\w+"),
        BNDwidgetState("state", "the current UI state", "#DEFAULT #HOVER #ACTIVE"),
        float("progress", "must be in the range {@code 0..1} and controls the size of the slider bar"),
        nullable..charUTF8.const.p("label", "if not #NULL, a label will be added to the widget"),
        nullable..charUTF8.const.p("value", "if not #NULL, a value will be added to the widget along with a \":\" separator")
    )

    void(
        "ScrollBar",
        "Draws scrollbar with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", "vertical widget looks best when width is #SCROLLBAR_WIDTH"),
        float("h", "horizontal widget looks best when height is #SCROLLBAR_HEIGHT"),
        BNDwidgetState("state", "the current UI state", "#DEFAULT #HOVER #ACTIVE"),
        float("offset", "is in the range {@code 0..1} and controls the position of the scroll handle"),
        float("size", "is in the range {@code 0..1} and controls the size of the scroll handle")
    )

    void(
        "MenuBackground",
        "Draws a menu background with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", ""),
        int("flags", "the corner flags", "CORNER_\\w+")
    )

    void(
        "MenuLabel",
        "Draws a menu label with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", "widget looks best when height is #WIDGET_HEIGHT"),
        int("iconid", "if &ge; 0, an icon will be added to the widget"),
        nullable..charUTF8.const.p("label", "if not #NULL, a label will be added to the widget")
    )

    void(
        "MenuItem",
        "Draws a menu item with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", "widget looks best when height is #WIDGET_HEIGHT"),
        BNDwidgetState("state", "the current UI state", "#DEFAULT #HOVER #ACTIVE"),
        int("iconid", "if &ge; 0, an icon will be added to the widget"),
        nullable..charUTF8.const.p("label", "if not #NULL, a label will be added to the widget")
    )

    void(
        "TooltipBackground",
        "Draws a tooltip background with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", "")
    )

    void(
        "NodePort",
        "Draws a node port at the given position filled with the given color.",

        ctx,
        float("x", ""),
        float("y", ""),
        BNDwidgetState("state", "the current UI state", "#DEFAULT #HOVER #ACTIVE"),
        NVGcolor("color", "")
    )

    void(
        "NodeWire",
        """
        Draws a node wire originating at {@code (x0,y0)} and floating to {@code (x1,y1)}, with a colored gradient based on the states {@code state0} and
        {@code state1}:

        ${ul(
            "#DEFAULT: default wire color",
            "#HOVER: selected wire color",
            "#ACTIVE: dragged wire color"
        )}
        """,

        ctx,
        float("x0", ""),
        float("y0", ""),
        float("x1", ""),
        float("y1", ""),
        BNDwidgetState("state0", "origin wire color", "#DEFAULT #HOVER #ACTIVE"),
        BNDwidgetState("state1", "ending wire color", "#DEFAULT #HOVER #ACTIVE")
    )

    void(
        "ColoredNodeWire",
        """
        Draws a node wire originating at {@code (x0,y0)} and floating to {@code (x1,y1)}, with a colored gradient based on the two colors {@code color0} and
        {@code color1}.
        """,

        ctx,
        float("x0", ""),
        float("y0", ""),
        float("x1", ""),
        float("y1", ""),
        NVGcolor("color0", ""),
        NVGcolor("color1", "")
    )

    void(
        "NodeBackground",
        "Draws a node background with its upper left origin at {@code (x,y)} and size of {@code (w,h)}.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", ""),
        BNDwidgetState("state", "the current UI state", "#DEFAULT #HOVER #ACTIVE"),
        int("iconid", "if &ge; 0, an icon will be added to the widget"),
        nullable..charUTF8.const.p("label", "if not #NULL, a label will be added to the widget"),
        NVGcolor("titleColor", "provides the base color for the title bar")
    )

    void(
        "SplitterWidgets",
        "Draws a window with the upper right and lower left splitter widgets into the rectangle at origin {@code (x,y)} and size {@code (w, h)}.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", "")
    )

    void(
        "JoinAreaOverlay",
        "Draws the join area overlay stencil into the rectangle at origin {@code (x,y)} and size {@code (w,h)}.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", ""),
        intb("vertical", "is 0 or 1 and designates the arrow orientation"),
        intb("mirror", "is 0 or 1 and flips the arrow side")
    )

    float(
        "LabelWidth",
        "Returns the ideal width for a label with given icon and text",

        ctx,
        int("iconid", ""),
        nullable..charUTF8.const.p("label", "")
    )

    float(
        "LabelHeight",
        "Returns the height for a label with given icon, text and width; this function is primarily useful in conjunction with multiline labels and textboxes.",

        ctx,
        int("iconid", ""),
        nullable..charUTF8.const.p("label", ""),
        float("width", "")
    )

    NVGcolor(
        "Transparent",
        "Makes color transparent using the default alpha value.",

        NVGcolor("color", "")
    )

    NVGcolor(
        "OffsetColor",
        "Offsets a color by a given integer delta.",

        NVGcolor("color", ""),
        int("delta", "in the range -100 to 100")
    )

    void(
        "SelectCorners",
        "Assigns radius {@code r} to the four entries of array {@code radiuses} depending on whether the corner is marked as sharp or not.",

        Check(4)..float.p("radiuses", ""),
        float("r", ""),
        int("flags", "the corner flags", "CORNER_\\w+")
    )

    void(
        "InnerColors",
        "Computes the upper and lower gradient colors for the inner box from a widget theme and the widgets state.",

        NVGcolor.p("shade_top", ""),
        NVGcolor.p("shade_down", ""),
        BNDwidgetTheme.const.p("theme", ""),
        BNDwidgetState("state", "the current UI state", "#DEFAULT #HOVER #ACTIVE"),
        intb("flipActive", "if set and the {@code state} is #ACTIVE, the upper and lower colors will be swapped")
    )

    NVGcolor(
        "TextColor",
        "Computes the text color for a widget label from a widget theme and the widgets state.",

        BNDwidgetTheme.const.p("theme", ""),
        BNDwidgetState("state", "the current UI state", "#DEFAULT #HOVER #ACTIVE")
    )

    void(
        "ScrollHandleRect",
        "Computes the bounds of the scrollbar handle from the scrollbar size and the handle's offset and size.",

        Check(1)..float.p("x", ""),
        Check(1)..float.p("y", ""),
        Check(1)..float.p("w", ""),
        Check(1)..float.p("h", ""),
        float("offset", "is in the range {@code 0..1} and defines the position of the scroll handle"),
        float("size", "is in the range {@code 0..1} and defines the size of the scroll handle")
    )

    void(
        "RoundedBox",
        """
        Adds a rounded box path at position {@code (x,y)} with size {@code (w,h)} and a separate radius for each corner listed in clockwise order, so that
        {@code cr0} = top left, {@code cr1} = top right, {@code cr2} = bottom right, {@code cr3} = bottom left; this is a low level drawing function: the path
        must be stroked or filled to become visible.
        """,

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", ""),
        float("cr0", ""),
        float("cr1", ""),
        float("cr2", ""),
        float("cr3", "")
    )

    void(
        "Background",
        "Draws a flat panel without any decorations at position {@code (x,y)} with size {@code (w,h)} and fills it with {@code backgroundColor}.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", "")
    )

    void(
        "Bevel",
        "Draws a beveled border at position {@code (x,y)} with size {@code (w,h)} shaded with lighter and darker versions of {@code backgroundColor}.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", "")
    )

    void(
        "BevelInset",
        """
        Draws a lower inset for a rounded box at position {@code (x,y)} with size {@code (w,h)} that gives the impression the surface has been pushed in.
        {@code cr2} and {@code cr3} contain the radiuses of the bottom right and bottom left corners of the rounded box.
        """,

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", ""),
        float("cr2", ""),
        float("cr3", "")
    )

    void(
        "Icon",
        "Draws an icon with {@code (x,y)} as its upper left coordinate.",

        ctx,
        float("x", ""),
        float("y", ""),
        int("iconid", "selects the icon from the sheet", "ICON_\\w+")
    )

    void(
        "DropShadow",
        """
        Draws a drop shadow around the rounded box at {@code (x,y)} with size {@code (w,h)} and radius {@code r}, with {@code feather} as its maximum range in
        pixels. No shadow will be painted inside the rounded box.
        """,

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", ""),
        float("r", ""),
        float("feather", ""),
        float("alpha", "")
    )

    void(
        "InnerBox",
        """
        Draws the inner part of a widget box, with a gradient from {@code shade_top} to {@code shade_down}. If {@code h>w}, the gradient will be horizontal
        instead of vertical.
        """,

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", ""),
        float("cr0", ""),
        float("cr1", ""),
        float("cr2", ""),
        float("cr3", ""),
        NVGcolor("shade_top", ""),
        NVGcolor("shade_down", "")
    )

    void(
        "OutlineBox",
        "Draws the outline part of a widget box with the given color.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", ""),
        float("cr0", ""),
        float("cr1", ""),
        float("cr2", ""),
        float("cr3", ""),
        NVGcolor("color", "")
    )

    void(
        "IconLabelValue",
        """
        Draws an optional icon specified by {@code iconid} and an optional label with given {@code alignment}, {@code fontsize} and {@code color} within a
        widget box.
        """,

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", ""),
        int("iconid", "if &ge; 0, an icon will be drawn and the labels remaining space will be adjusted"),
        NVGcolor("color", ""),
        int("align", "", "#LEFT #CENTER"),
        float("fontsize", ""),
        nullable..charUTF8.const.p("label", "if not #NULL, it will be drawn with the specified {@code alignment}, {@code fontsize} and {@code color}"),
        nullable..charUTF8.const.p("value", "if not #NULL, {@code label} and {@code value} will be drawn with a \":\" separator inbetween")
    )

    void(
        "NodeIconLabel",
        """
        Draws an optional icon specified by {@code iconid} and an optional label with given {@code alignment}, {@code fontsize} and {@code color} within a node
        title bar.
        """,

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", ""),
        int("iconid", "if &ge; 0, an icon will be drawn"),
        NVGcolor("color", ""),
        NVGcolor("shadowColor", ""),
        int("align", ""),
        float("fontsize", ""),
        nullable..charUTF8.const.p("label", "if not #NULL, it will be drawn with the specified {@code alignment}, {@code fontsize} and {@code color}")
    )

    int(
        "IconLabelTextPosition",
        "Calculates the corresponding text position for given coordinates {@code px/py} in an {@code iconLabel}. See #IconLabelCaret() for more info.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", ""),
        int("iconid", ""),
        float("fontsize", ""),
        nullable..charUTF8.const.p("label", ""),
        int("px", ""),
        int("py", "")
    )

    void(
        "IconLabelCaret",
        """
        Draws an optional icon specified by {@code iconid}, an optional label and a caret with given {@code fontsize} and {@code color} within a widget box.
""",

        ctx,
        float("x", ""),
        float("y", ""),
        float("w", ""),
        float("h", ""),
        int("iconid", "if &ge; 0, an icon will be drawn and the labels remaining space will be adjusted"),
        NVGcolor("color", ""),
        float("fontsize", ""),
        nullable..charUTF8.const.p("label", "if not #NULL, it will be drawn with the specified {@code alignment}, {@code fontsize} and {@code color}"),
        NVGcolor("caretcolor", ""),
        int("cbegin", "must be &ge; 0 and &le; {@code strlen(text)} and denotes the beginning of the caret"),
        int(
            "cend",
            """
            must be &ge; {@code cbegin} and &le; {@code strlen(text)} and denotes the end of the caret. If {@code cend} &lt; {@code cbegin}, then no caret will
            be drawn.
            """
        )
    )

    void(
        "Check",
        "Draws a checkmark for an option box with the given upper left coordinates {@code (ox,oy)} with the specified {@code color}.",

        ctx,
        float("ox", ""),
        float("oy", ""),
        NVGcolor("color", "")
    )

    void(
        "Arrow",
        "Draws a horizontal arrow for a number field with its center at {@code (x,y)} and size {@code s}.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("s", "if negative, the arrow points to the left"),
        NVGcolor("color", "")
    )

    void(
        "UpDownArrow",
        "Draws an up/down arrow for a choice box with its center at {@code (x,y)} and size {@code s}.",

        ctx,
        float("x", ""),
        float("y", ""),
        float("s", ""),
        NVGcolor("color", "")
    )

    void(
        "NodeArrowDown",
        "Draws a node down-arrow with its tip at {@code (x,y)} and size {@code s}",

        ctx,
        float("x", ""),
        float("y", ""),
        float("s", ""),
        NVGcolor("color", "")
    )

    NVGcolor(
        "NodeWireColor",
        "Returns the color of a node wire based on state.",

        BNDnodeTheme.const.p("theme", ""),
        BNDwidgetState("state", "#HOVER indicates selected state, #ACTIVE indicates dragged state")
    )
}
