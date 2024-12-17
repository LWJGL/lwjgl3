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

    FloatConstant(
        "DISABLED_ALPHA"..0.5f
    )

    EnumConstant(
        "LEFT".enum("0"),
        "CENTER".enum
    )

    EnumConstant(
        "DEFAULT".enum("0"),
        "HOVER".enum,
        "ACTIVE".enum
    )

    EnumConstant(
        "CORNER_NONE".enum("0"),
        "CORNER_TOP_LEFT".enum,
        "CORNER_TOP_RIGHT".enum,
        "CORNER_DOWN_RIGHT".enum("4"),
        "CORNER_DOWN_LEFT".enum("8"),
        "CORNER_ALL".enum("0xF"),
        "CORNER_TOP".enum("3"),
        "CORNER_DOWN".enum("0xC"),
        "CORNER_LEFT".enum("9"),
        "CORNER_RIGHT".enum("6")
    )

    EnumConstant(
        "WIDGET_HEIGHT".enum("21"),
        "TOOL_WIDTH".enum("20"),
        "NODE_PORT_RADIUS".enum("5"),
        "NODE_MARGIN_TOP".enum("25"),
        "NODE_MARGIN_DOWN".enum("5"),
        "NODE_MARGIN_SIDE".enum("10"),
        "NODE_TITLE_HEIGHT".enum("20"),
        "NODE_ARROW_AREA_WIDTH".enum("20"),
        "SPLITTER_AREA_SIZE".enum("12"),
        "SCROLLBAR_WIDTH".enum,
        "SCROLLBAR_HEIGHT".enum,
        "VSPACING".enum("1"),
        "VSPACING_GROUP".enum("8"),
        "HSPACING".enum("8")
    )

    customMethod("""
    public static int BND_ICONID(int x, int y) {
        return x | (y << 8);
    }""")

    EnumConstant(
        "ICON_NONE".enum("BND_ICONID(0,29)"),
        "ICON_QUESTION".enum("BND_ICONID(1,29)"),
        "ICON_ERROR".enum("BND_ICONID(2,29)"),
        "ICON_CANCEL".enum("BND_ICONID(3,29)"),
        "ICON_TRIA_RIGHT".enum("BND_ICONID(4,29)"),
        "ICON_TRIA_DOWN".enum("BND_ICONID(5,29)"),
        "ICON_TRIA_LEFT".enum("BND_ICONID(6,29)"),
        "ICON_TRIA_UP".enum("BND_ICONID(7,29)"),
        "ICON_ARROW_LEFTRIGHT".enum("BND_ICONID(8,29)"),
        "ICON_PLUS".enum("BND_ICONID(9,29)"),
        "ICON_DISCLOSURE_TRI_DOWN".enum("BND_ICONID(10,29)"),
        "ICON_DISCLOSURE_TRI_RIGHT".enum("BND_ICONID(11,29)"),
        "ICON_RADIOBUT_OFF".enum("BND_ICONID(12,29)"),
        "ICON_RADIOBUT_ON".enum("BND_ICONID(13,29)"),
        "ICON_MENU_PANEL".enum("BND_ICONID(14,29)"),
        "ICON_BLENDER".enum("BND_ICONID(15,29)"),
        "ICON_GRIP".enum("BND_ICONID(16,29)"),
        "ICON_DOT".enum("BND_ICONID(17,29)"),
        "ICON_COLLAPSEMENU".enum("BND_ICONID(18,29)"),
        "ICON_X".enum("BND_ICONID(19,29)"),
        "ICON_GO_LEFT".enum("BND_ICONID(21,29)"),
        "ICON_PLUG".enum("BND_ICONID(22,29)"),
        "ICON_UI".enum("BND_ICONID(23,29)"),
        "ICON_NODE".enum("BND_ICONID(24,29)"),
        "ICON_NODE_SEL".enum("BND_ICONID(25,29)"),
        "ICON_FULLSCREEN".enum("BND_ICONID(0,28)"),
        "ICON_SPLITSCREEN".enum("BND_ICONID(1,28)"),
        "ICON_RIGHTARROW_THIN".enum("BND_ICONID(2,28)"),
        "ICON_BORDERMOVE".enum("BND_ICONID(3,28)"),
        "ICON_VIEWZOOM".enum("BND_ICONID(4,28)"),
        "ICON_ZOOMIN".enum("BND_ICONID(5,28)"),
        "ICON_ZOOMOUT".enum("BND_ICONID(6,28)"),
        "ICON_PANEL_CLOSE".enum("BND_ICONID(7,28)"),
        "ICON_COPY_ID".enum("BND_ICONID(8,28)"),
        "ICON_EYEDROPPER".enum("BND_ICONID(9,28)"),
        "ICON_LINK_AREA".enum("BND_ICONID(10,28)"),
        "ICON_AUTO".enum("BND_ICONID(11,28)"),
        "ICON_CHECKBOX_DEHLT".enum("BND_ICONID(12,28)"),
        "ICON_CHECKBOX_HLT".enum("BND_ICONID(13,28)"),
        "ICON_UNLOCKED".enum("BND_ICONID(14,28)"),
        "ICON_LOCKED".enum("BND_ICONID(15,28)"),
        "ICON_UNPINNED".enum("BND_ICONID(16,28)"),
        "ICON_PINNED".enum("BND_ICONID(17,28)"),
        "ICON_SCREEN_BACK".enum("BND_ICONID(18,28)"),
        "ICON_RIGHTARROW".enum("BND_ICONID(19,28)"),
        "ICON_DOWNARROW_HLT".enum("BND_ICONID(20,28)"),
        "ICON_DOTSUP".enum("BND_ICONID(21,28)"),
        "ICON_DOTSDOWN".enum("BND_ICONID(22,28)"),
        "ICON_LINK".enum("BND_ICONID(23,28)"),
        "ICON_INLINK".enum("BND_ICONID(24,28)"),
        "ICON_PLUGIN".enum("BND_ICONID(25,28)"),
        "ICON_HELP".enum("BND_ICONID(0,27)"),
        "ICON_GHOST_ENABLED".enum("BND_ICONID(1,27)"),
        "ICON_COLOR".enum("BND_ICONID(2,27)"),
        "ICON_LINKED".enum("BND_ICONID(3,27)"),
        "ICON_UNLINKED".enum("BND_ICONID(4,27)"),
        "ICON_HAND".enum("BND_ICONID(5,27)"),
        "ICON_ZOOM_ALL".enum("BND_ICONID(6,27)"),
        "ICON_ZOOM_SELECTED".enum("BND_ICONID(7,27)"),
        "ICON_ZOOM_PREVIOUS".enum("BND_ICONID(8,27)"),
        "ICON_ZOOM_IN".enum("BND_ICONID(9,27)"),
        "ICON_ZOOM_OUT".enum("BND_ICONID(10,27)"),
        "ICON_RENDER_REGION".enum("BND_ICONID(11,27)"),
        "ICON_BORDER_RECT".enum("BND_ICONID(12,27)"),
        "ICON_BORDER_LASSO".enum("BND_ICONID(13,27)"),
        "ICON_FREEZE".enum("BND_ICONID(14,27)"),
        "ICON_STYLUS_PRESSURE".enum("BND_ICONID(15,27)"),
        "ICON_GHOST_DISABLED".enum("BND_ICONID(16,27)"),
        "ICON_NEW".enum("BND_ICONID(17,27)"),
        "ICON_FILE_TICK".enum("BND_ICONID(18,27)"),
        "ICON_QUIT".enum("BND_ICONID(19,27)"),
        "ICON_URL".enum("BND_ICONID(20,27)"),
        "ICON_RECOVER_LAST".enum("BND_ICONID(21,27)"),
        "ICON_FULLSCREEN_ENTER".enum("BND_ICONID(23,27)"),
        "ICON_FULLSCREEN_EXIT".enum("BND_ICONID(24,27)"),
        "ICON_BLANK1".enum("BND_ICONID(25,27)"),
        "ICON_LAMP".enum("BND_ICONID(0,26)"),
        "ICON_MATERIAL".enum("BND_ICONID(1,26)"),
        "ICON_TEXTURE".enum("BND_ICONID(2,26)"),
        "ICON_ANIM".enum("BND_ICONID(3,26)"),
        "ICON_WORLD".enum("BND_ICONID(4,26)"),
        "ICON_SCENE".enum("BND_ICONID(5,26)"),
        "ICON_EDIT".enum("BND_ICONID(6,26)"),
        "ICON_GAME".enum("BND_ICONID(7,26)"),
        "ICON_RADIO".enum("BND_ICONID(8,26)"),
        "ICON_SCRIPT".enum("BND_ICONID(9,26)"),
        "ICON_PARTICLES".enum("BND_ICONID(10,26)"),
        "ICON_PHYSICS".enum("BND_ICONID(11,26)"),
        "ICON_SPEAKER".enum("BND_ICONID(12,26)"),
        "ICON_TEXTURE_SHADED".enum("BND_ICONID(13,26)"),
        "ICON_VIEW3D".enum("BND_ICONID(0,25)"),
        "ICON_IPO".enum("BND_ICONID(1,25)"),
        "ICON_OOPS".enum("BND_ICONID(2,25)"),
        "ICON_BUTS".enum("BND_ICONID(3,25)"),
        "ICON_FILESEL".enum("BND_ICONID(4,25)"),
        "ICON_IMAGE_COL".enum("BND_ICONID(5,25)"),
        "ICON_INFO".enum("BND_ICONID(6,25)"),
        "ICON_SEQUENCE".enum("BND_ICONID(7,25)"),
        "ICON_TEXT".enum("BND_ICONID(8,25)"),
        "ICON_IMASEL".enum("BND_ICONID(9,25)"),
        "ICON_SOUND".enum("BND_ICONID(10,25)"),
        "ICON_ACTION".enum("BND_ICONID(11,25)"),
        "ICON_NLA".enum("BND_ICONID(12,25)"),
        "ICON_SCRIPTWIN".enum("BND_ICONID(13,25)"),
        "ICON_TIME".enum("BND_ICONID(14,25)"),
        "ICON_NODETREE".enum("BND_ICONID(15,25)"),
        "ICON_LOGIC".enum("BND_ICONID(16,25)"),
        "ICON_CONSOLE".enum("BND_ICONID(17,25)"),
        "ICON_PREFERENCES".enum("BND_ICONID(18,25)"),
        "ICON_CLIP".enum("BND_ICONID(19,25)"),
        "ICON_ASSET_MANAGER".enum("BND_ICONID(20,25)"),
        "ICON_OBJECT_DATAMODE".enum("BND_ICONID(0,24)"),
        "ICON_EDITMODE_HLT".enum("BND_ICONID(1,24)"),
        "ICON_FACESEL_HLT".enum("BND_ICONID(2,24)"),
        "ICON_VPAINT_HLT".enum("BND_ICONID(3,24)"),
        "ICON_TPAINT_HLT".enum("BND_ICONID(4,24)"),
        "ICON_WPAINT_HLT".enum("BND_ICONID(5,24)"),
        "ICON_SCULPTMODE_HLT".enum("BND_ICONID(6,24)"),
        "ICON_POSE_HLT".enum("BND_ICONID(7,24)"),
        "ICON_PARTICLEMODE".enum("BND_ICONID(8,24)"),
        "ICON_LIGHTPAINT".enum("BND_ICONID(9,24)"),
        "ICON_SCENE_DATA".enum("BND_ICONID(0,23)"),
        "ICON_RENDERLAYERS".enum("BND_ICONID(1,23)"),
        "ICON_WORLD_DATA".enum("BND_ICONID(2,23)"),
        "ICON_OBJECT_DATA".enum("BND_ICONID(3,23)"),
        "ICON_MESH_DATA".enum("BND_ICONID(4,23)"),
        "ICON_CURVE_DATA".enum("BND_ICONID(5,23)"),
        "ICON_META_DATA".enum("BND_ICONID(6,23)"),
        "ICON_LATTICE_DATA".enum("BND_ICONID(7,23)"),
        "ICON_LAMP_DATA".enum("BND_ICONID(8,23)"),
        "ICON_MATERIAL_DATA".enum("BND_ICONID(9,23)"),
        "ICON_TEXTURE_DATA".enum("BND_ICONID(10,23)"),
        "ICON_ANIM_DATA".enum("BND_ICONID(11,23)"),
        "ICON_CAMERA_DATA".enum("BND_ICONID(12,23)"),
        "ICON_PARTICLE_DATA".enum("BND_ICONID(13,23)"),
        "ICON_LIBRARY_DATA_DIRECT".enum("BND_ICONID(14,23)"),
        "ICON_GROUP".enum("BND_ICONID(15,23)"),
        "ICON_ARMATURE_DATA".enum("BND_ICONID(16,23)"),
        "ICON_POSE_DATA".enum("BND_ICONID(17,23)"),
        "ICON_BONE_DATA".enum("BND_ICONID(18,23)"),
        "ICON_CONSTRAINT".enum("BND_ICONID(19,23)"),
        "ICON_SHAPEKEY_DATA".enum("BND_ICONID(20,23)"),
        "ICON_CONSTRAINT_BONE".enum("BND_ICONID(21,23)"),
        "ICON_CAMERA_STEREO".enum("BND_ICONID(22,23)"),
        "ICON_PACKAGE".enum("BND_ICONID(23,23)"),
        "ICON_UGLYPACKAGE".enum("BND_ICONID(24,23)"),
        "ICON_BRUSH_DATA".enum("BND_ICONID(0,22)"),
        "ICON_IMAGE_DATA".enum("BND_ICONID(1,22)"),
        "ICON_FILE".enum("BND_ICONID(2,22)"),
        "ICON_FCURVE".enum("BND_ICONID(3,22)"),
        "ICON_FONT_DATA".enum("BND_ICONID(4,22)"),
        "ICON_RENDER_RESULT".enum("BND_ICONID(5,22)"),
        "ICON_SURFACE_DATA".enum("BND_ICONID(6,22)"),
        "ICON_EMPTY_DATA".enum("BND_ICONID(7,22)"),
        "ICON_SETTINGS".enum("BND_ICONID(8,22)"),
        "ICON_RENDER_ANIMATION".enum("BND_ICONID(9,22)"),
        "ICON_RENDER_STILL".enum("BND_ICONID(10,22)"),
        "ICON_BOIDS".enum("BND_ICONID(12,22)"),
        "ICON_STRANDS".enum("BND_ICONID(13,22)"),
        "ICON_LIBRARY_DATA_INDIRECT".enum("BND_ICONID(14,22)"),
        "ICON_GREASEPENCIL".enum("BND_ICONID(15,22)"),
        "ICON_LINE_DATA".enum("BND_ICONID(16,22)"),
        "ICON_GROUP_BONE".enum("BND_ICONID(18,22)"),
        "ICON_GROUP_VERTEX".enum("BND_ICONID(19,22)"),
        "ICON_GROUP_VCOL".enum("BND_ICONID(20,22)"),
        "ICON_GROUP_UVS".enum("BND_ICONID(21,22)"),
        "ICON_RNA".enum("BND_ICONID(24,22)"),
        "ICON_RNA_ADD".enum("BND_ICONID(25,22)"),
        "ICON_OUTLINER_OB_EMPTY".enum("BND_ICONID(0,20)"),
        "ICON_OUTLINER_OB_MESH".enum("BND_ICONID(1,20)"),
        "ICON_OUTLINER_OB_CURVE".enum("BND_ICONID(2,20)"),
        "ICON_OUTLINER_OB_LATTICE".enum("BND_ICONID(3,20)"),
        "ICON_OUTLINER_OB_META".enum("BND_ICONID(4,20)"),
        "ICON_OUTLINER_OB_LAMP".enum("BND_ICONID(5,20)"),
        "ICON_OUTLINER_OB_CAMERA".enum("BND_ICONID(6,20)"),
        "ICON_OUTLINER_OB_ARMATURE".enum("BND_ICONID(7,20)"),
        "ICON_OUTLINER_OB_FONT".enum("BND_ICONID(8,20)"),
        "ICON_OUTLINER_OB_SURFACE".enum("BND_ICONID(9,20)"),
        "ICON_OUTLINER_OB_SPEAKER".enum("BND_ICONID(10,20)"),
        "ICON_RESTRICT_VIEW_OFF".enum("BND_ICONID(19,20)"),
        "ICON_RESTRICT_VIEW_ON".enum("BND_ICONID(20,20)"),
        "ICON_RESTRICT_SELECT_OFF".enum("BND_ICONID(21,20)"),
        "ICON_RESTRICT_SELECT_ON".enum("BND_ICONID(22,20)"),
        "ICON_RESTRICT_RENDER_OFF".enum("BND_ICONID(23,20)"),
        "ICON_RESTRICT_RENDER_ON".enum("BND_ICONID(24,20)"),
        "ICON_OUTLINER_DATA_EMPTY".enum("BND_ICONID(0,19)"),
        "ICON_OUTLINER_DATA_MESH".enum("BND_ICONID(1,19)"),
        "ICON_OUTLINER_DATA_CURVE".enum("BND_ICONID(2,19)"),
        "ICON_OUTLINER_DATA_LATTICE".enum("BND_ICONID(3,19)"),
        "ICON_OUTLINER_DATA_META".enum("BND_ICONID(4,19)"),
        "ICON_OUTLINER_DATA_LAMP".enum("BND_ICONID(5,19)"),
        "ICON_OUTLINER_DATA_CAMERA".enum("BND_ICONID(6,19)"),
        "ICON_OUTLINER_DATA_ARMATURE".enum("BND_ICONID(7,19)"),
        "ICON_OUTLINER_DATA_FONT".enum("BND_ICONID(8,19)"),
        "ICON_OUTLINER_DATA_SURFACE".enum("BND_ICONID(9,19)"),
        "ICON_OUTLINER_DATA_SPEAKER".enum("BND_ICONID(10,19)"),
        "ICON_OUTLINER_DATA_POSE".enum("BND_ICONID(11,19)"),
        "ICON_MESH_PLANE".enum("BND_ICONID(0,18)"),
        "ICON_MESH_CUBE".enum("BND_ICONID(1,18)"),
        "ICON_MESH_CIRCLE".enum("BND_ICONID(2,18)"),
        "ICON_MESH_UVSPHERE".enum("BND_ICONID(3,18)"),
        "ICON_MESH_ICOSPHERE".enum("BND_ICONID(4,18)"),
        "ICON_MESH_GRID".enum("BND_ICONID(5,18)"),
        "ICON_MESH_MONKEY".enum("BND_ICONID(6,18)"),
        "ICON_MESH_CYLINDER".enum("BND_ICONID(7,18)"),
        "ICON_MESH_TORUS".enum("BND_ICONID(8,18)"),
        "ICON_MESH_CONE".enum("BND_ICONID(9,18)"),
        "ICON_LAMP_POINT".enum("BND_ICONID(12,18)"),
        "ICON_LAMP_SUN".enum("BND_ICONID(13,18)"),
        "ICON_LAMP_SPOT".enum("BND_ICONID(14,18)"),
        "ICON_LAMP_HEMI".enum("BND_ICONID(15,18)"),
        "ICON_LAMP_AREA".enum("BND_ICONID(16,18)"),
        "ICON_META_EMPTY".enum("BND_ICONID(19,18)"),
        "ICON_META_PLANE".enum("BND_ICONID(20,18)"),
        "ICON_META_CUBE".enum("BND_ICONID(21,18)"),
        "ICON_META_BALL".enum("BND_ICONID(22,18)"),
        "ICON_META_ELLIPSOID".enum("BND_ICONID(23,18)"),
        "ICON_META_CAPSULE".enum("BND_ICONID(24,18)"),
        "ICON_SURFACE_NCURVE".enum("BND_ICONID(0,17)"),
        "ICON_SURFACE_NCIRCLE".enum("BND_ICONID(1,17)"),
        "ICON_SURFACE_NSURFACE".enum("BND_ICONID(2,17)"),
        "ICON_SURFACE_NCYLINDER".enum("BND_ICONID(3,17)"),
        "ICON_SURFACE_NSPHERE".enum("BND_ICONID(4,17)"),
        "ICON_SURFACE_NTORUS".enum("BND_ICONID(5,17)"),
        "ICON_CURVE_BEZCURVE".enum("BND_ICONID(9,17)"),
        "ICON_CURVE_BEZCIRCLE".enum("BND_ICONID(10,17)"),
        "ICON_CURVE_NCURVE".enum("BND_ICONID(11,17)"),
        "ICON_CURVE_NCIRCLE".enum("BND_ICONID(12,17)"),
        "ICON_CURVE_PATH".enum("BND_ICONID(13,17)"),
        "ICON_COLOR_RED".enum("BND_ICONID(19,17)"),
        "ICON_COLOR_GREEN".enum("BND_ICONID(20,17)"),
        "ICON_COLOR_BLUE".enum("BND_ICONID(21,17)"),
        "ICON_FORCE_FORCE".enum("BND_ICONID(0,16)"),
        "ICON_FORCE_WIND".enum("BND_ICONID(1,16)"),
        "ICON_FORCE_VORTEX".enum("BND_ICONID(2,16)"),
        "ICON_FORCE_MAGNETIC".enum("BND_ICONID(3,16)"),
        "ICON_FORCE_HARMONIC".enum("BND_ICONID(4,16)"),
        "ICON_FORCE_CHARGE".enum("BND_ICONID(5,16)"),
        "ICON_FORCE_LENNARDJONES".enum("BND_ICONID(6,16)"),
        "ICON_FORCE_TEXTURE".enum("BND_ICONID(7,16)"),
        "ICON_FORCE_CURVE".enum("BND_ICONID(8,16)"),
        "ICON_FORCE_BOID".enum("BND_ICONID(9,16)"),
        "ICON_FORCE_TURBULENCE".enum("BND_ICONID(10,16)"),
        "ICON_FORCE_DRAG".enum("BND_ICONID(11,16)"),
        "ICON_FORCE_SMOKEFLOW".enum("BND_ICONID(12,16)"),
        "ICON_MODIFIER".enum("BND_ICONID(0,12)"),
        "ICON_MOD_WAVE".enum("BND_ICONID(1,12)"),
        "ICON_MOD_BUILD".enum("BND_ICONID(2,12)"),
        "ICON_MOD_DECIM".enum("BND_ICONID(3,12)"),
        "ICON_MOD_MIRROR".enum("BND_ICONID(4,12)"),
        "ICON_MOD_SOFT".enum("BND_ICONID(5,12)"),
        "ICON_MOD_SUBSURF".enum("BND_ICONID(6,12)"),
        "ICON_HOOK".enum("BND_ICONID(7,12)"),
        "ICON_MOD_PHYSICS".enum("BND_ICONID(8,12)"),
        "ICON_MOD_PARTICLES".enum("BND_ICONID(9,12)"),
        "ICON_MOD_BOOLEAN".enum("BND_ICONID(10,12)"),
        "ICON_MOD_EDGESPLIT".enum("BND_ICONID(11,12)"),
        "ICON_MOD_ARRAY".enum("BND_ICONID(12,12)"),
        "ICON_MOD_UVPROJECT".enum("BND_ICONID(13,12)"),
        "ICON_MOD_DISPLACE".enum("BND_ICONID(14,12)"),
        "ICON_MOD_CURVE".enum("BND_ICONID(15,12)"),
        "ICON_MOD_LATTICE".enum("BND_ICONID(16,12)"),
        "ICON_CONSTRAINT_DATA".enum("BND_ICONID(17,12)"),
        "ICON_MOD_ARMATURE".enum("BND_ICONID(18,12)"),
        "ICON_MOD_SHRINKWRAP".enum("BND_ICONID(19,12)"),
        "ICON_MOD_CAST".enum("BND_ICONID(20,12)"),
        "ICON_MOD_MESHDEFORM".enum("BND_ICONID(21,12)"),
        "ICON_MOD_BEVEL".enum("BND_ICONID(22,12)"),
        "ICON_MOD_SMOOTH".enum("BND_ICONID(23,12)"),
        "ICON_MOD_SIMPLEDEFORM".enum("BND_ICONID(24,12)"),
        "ICON_MOD_MASK".enum("BND_ICONID(25,12)"),
        "ICON_MOD_CLOTH".enum("BND_ICONID(0,11)"),
        "ICON_MOD_EXPLODE".enum("BND_ICONID(1,11)"),
        "ICON_MOD_FLUIDSIM".enum("BND_ICONID(2,11)"),
        "ICON_MOD_MULTIRES".enum("BND_ICONID(3,11)"),
        "ICON_MOD_SMOKE".enum("BND_ICONID(4,11)"),
        "ICON_MOD_SOLIDIFY".enum("BND_ICONID(5,11)"),
        "ICON_MOD_SCREW".enum("BND_ICONID(6,11)"),
        "ICON_MOD_VERTEX_WEIGHT".enum("BND_ICONID(7,11)"),
        "ICON_MOD_DYNAMICPAINT".enum("BND_ICONID(8,11)"),
        "ICON_MOD_REMESH".enum("BND_ICONID(9,11)"),
        "ICON_MOD_OCEAN".enum("BND_ICONID(10,11)"),
        "ICON_MOD_WARP".enum("BND_ICONID(11,11)"),
        "ICON_MOD_SKIN".enum("BND_ICONID(12,11)"),
        "ICON_MOD_TRIANGULATE".enum("BND_ICONID(13,11)"),
        "ICON_MOD_WIREFRAME".enum("BND_ICONID(14,11)"),
        "ICON_REC".enum("BND_ICONID(0,10)"),
        "ICON_PLAY".enum("BND_ICONID(1,10)"),
        "ICON_FF".enum("BND_ICONID(2,10)"),
        "ICON_REW".enum("BND_ICONID(3,10)"),
        "ICON_PAUSE".enum("BND_ICONID(4,10)"),
        "ICON_PREV_KEYFRAME".enum("BND_ICONID(5,10)"),
        "ICON_NEXT_KEYFRAME".enum("BND_ICONID(6,10)"),
        "ICON_PLAY_AUDIO".enum("BND_ICONID(7,10)"),
        "ICON_PLAY_REVERSE".enum("BND_ICONID(8,10)"),
        "ICON_PREVIEW_RANGE".enum("BND_ICONID(9,10)"),
        "ICON_ACTION_TWEAK".enum("BND_ICONID(10,10)"),
        "ICON_PMARKER_ACT".enum("BND_ICONID(11,10)"),
        "ICON_PMARKER_SEL".enum("BND_ICONID(12,10)"),
        "ICON_PMARKER".enum("BND_ICONID(13,10)"),
        "ICON_MARKER_HLT".enum("BND_ICONID(14,10)"),
        "ICON_MARKER".enum("BND_ICONID(15,10)"),
        "ICON_SPACE2".enum("BND_ICONID(16,10)"),
        "ICON_SPACE3".enum("BND_ICONID(17,10)"),
        "ICON_KEYINGSET".enum("BND_ICONID(18,10)"),
        "ICON_KEY_DEHLT".enum("BND_ICONID(19,10)"),
        "ICON_KEY_HLT".enum("BND_ICONID(20,10)"),
        "ICON_MUTE_IPO_OFF".enum("BND_ICONID(21,10)"),
        "ICON_MUTE_IPO_ON".enum("BND_ICONID(22,10)"),
        "ICON_VISIBLE_IPO_OFF".enum("BND_ICONID(23,10)"),
        "ICON_VISIBLE_IPO_ON".enum("BND_ICONID(24,10)"),
        "ICON_DRIVER".enum("BND_ICONID(25,10)"),
        "ICON_SOLO_OFF".enum("BND_ICONID(0,9)"),
        "ICON_SOLO_ON".enum("BND_ICONID(1,9)"),
        "ICON_FRAME_PREV".enum("BND_ICONID(2,9)"),
        "ICON_FRAME_NEXT".enum("BND_ICONID(3,9)"),
        "ICON_NLA_PUSHDOWN".enum("BND_ICONID(4,9)"),
        "ICON_IPO_CONSTANT".enum("BND_ICONID(5,9)"),
        "ICON_IPO_LINEAR".enum("BND_ICONID(6,9)"),
        "ICON_IPO_BEZIER".enum("BND_ICONID(7,9)"),
        "ICON_IPO_SINE".enum("BND_ICONID(8,9)"),
        "ICON_IPO_QUAD".enum("BND_ICONID(9,9)"),
        "ICON_IPO_CUBIC".enum("BND_ICONID(10,9)"),
        "ICON_IPO_QUART".enum("BND_ICONID(11,9)"),
        "ICON_IPO_QUINT".enum("BND_ICONID(12,9)"),
        "ICON_IPO_EXPO".enum("BND_ICONID(13,9)"),
        "ICON_IPO_CIRC".enum("BND_ICONID(14,9)"),
        "ICON_IPO_BOUNCE".enum("BND_ICONID(15,9)"),
        "ICON_IPO_ELASTIC".enum("BND_ICONID(16,9)"),
        "ICON_IPO_BACK".enum("BND_ICONID(17,9)"),
        "ICON_IPO_EASE_IN".enum("BND_ICONID(18,9)"),
        "ICON_IPO_EASE_OUT".enum("BND_ICONID(19,9)"),
        "ICON_IPO_EASE_IN_OUT".enum("BND_ICONID(20,9)"),
        "ICON_VERTEXSEL".enum("BND_ICONID(0,8)"),
        "ICON_EDGESEL".enum("BND_ICONID(1,8)"),
        "ICON_FACESEL".enum("BND_ICONID(2,8)"),
        "ICON_LOOPSEL".enum("BND_ICONID(3,8)"),
        "ICON_ROTATE".enum("BND_ICONID(5,8)"),
        "ICON_CURSOR".enum("BND_ICONID(6,8)"),
        "ICON_ROTATECOLLECTION".enum("BND_ICONID(7,8)"),
        "ICON_ROTATECENTER".enum("BND_ICONID(8,8)"),
        "ICON_ROTACTIVE".enum("BND_ICONID(9,8)"),
        "ICON_ALIGN".enum("BND_ICONID(10,8)"),
        "ICON_SMOOTHCURVE".enum("BND_ICONID(12,8)"),
        "ICON_SPHERECURVE".enum("BND_ICONID(13,8)"),
        "ICON_ROOTCURVE".enum("BND_ICONID(14,8)"),
        "ICON_SHARPCURVE".enum("BND_ICONID(15,8)"),
        "ICON_LINCURVE".enum("BND_ICONID(16,8)"),
        "ICON_NOCURVE".enum("BND_ICONID(17,8)"),
        "ICON_RNDCURVE".enum("BND_ICONID(18,8)"),
        "ICON_PROP_OFF".enum("BND_ICONID(19,8)"),
        "ICON_PROP_ON".enum("BND_ICONID(20,8)"),
        "ICON_PROP_CON".enum("BND_ICONID(21,8)"),
        "ICON_SCULPT_DYNTOPO".enum("BND_ICONID(22,8)"),
        "ICON_PARTICLE_POINT".enum("BND_ICONID(23,8)"),
        "ICON_PARTICLE_TIP".enum("BND_ICONID(24,8)"),
        "ICON_PARTICLE_PATH".enum("BND_ICONID(25,8)"),
        "ICON_MAN_TRANS".enum("BND_ICONID(0,7)"),
        "ICON_MAN_ROT".enum("BND_ICONID(1,7)"),
        "ICON_MAN_SCALE".enum("BND_ICONID(2,7)"),
        "ICON_MANIPUL".enum("BND_ICONID(3,7)"),
        "ICON_SNAP_OFF".enum("BND_ICONID(4,7)"),
        "ICON_SNAP_ON".enum("BND_ICONID(5,7)"),
        "ICON_SNAP_NORMAL".enum("BND_ICONID(6,7)"),
        "ICON_SNAP_INCREMENT".enum("BND_ICONID(7,7)"),
        "ICON_SNAP_VERTEX".enum("BND_ICONID(8,7)"),
        "ICON_SNAP_EDGE".enum("BND_ICONID(9,7)"),
        "ICON_SNAP_FACE".enum("BND_ICONID(10,7)"),
        "ICON_SNAP_VOLUME".enum("BND_ICONID(11,7)"),
        "ICON_STICKY_UVS_LOC".enum("BND_ICONID(13,7)"),
        "ICON_STICKY_UVS_DISABLE".enum("BND_ICONID(14,7)"),
        "ICON_STICKY_UVS_VERT".enum("BND_ICONID(15,7)"),
        "ICON_CLIPUV_DEHLT".enum("BND_ICONID(16,7)"),
        "ICON_CLIPUV_HLT".enum("BND_ICONID(17,7)"),
        "ICON_SNAP_PEEL_OBJECT".enum("BND_ICONID(18,7)"),
        "ICON_GRID".enum("BND_ICONID(19,7)"),
        "ICON_PASTEDOWN".enum("BND_ICONID(0,6)"),
        "ICON_COPYDOWN".enum("BND_ICONID(1,6)"),
        "ICON_PASTEFLIPUP".enum("BND_ICONID(2,6)"),
        "ICON_PASTEFLIPDOWN".enum("BND_ICONID(3,6)"),
        "ICON_SNAP_SURFACE".enum("BND_ICONID(8,6)"),
        "ICON_AUTOMERGE_ON".enum("BND_ICONID(9,6)"),
        "ICON_AUTOMERGE_OFF".enum("BND_ICONID(10,6)"),
        "ICON_RETOPO".enum("BND_ICONID(11,6)"),
        "ICON_UV_VERTEXSEL".enum("BND_ICONID(12,6)"),
        "ICON_UV_EDGESEL".enum("BND_ICONID(13,6)"),
        "ICON_UV_FACESEL".enum("BND_ICONID(14,6)"),
        "ICON_UV_ISLANDSEL".enum("BND_ICONID(15,6)"),
        "ICON_UV_SYNC_SELECT".enum("BND_ICONID(16,6)"),
        "ICON_BBOX".enum("BND_ICONID(0,5)"),
        "ICON_WIRE".enum("BND_ICONID(1,5)"),
        "ICON_SOLID".enum("BND_ICONID(2,5)"),
        "ICON_SMOOTH".enum("BND_ICONID(3,5)"),
        "ICON_POTATO".enum("BND_ICONID(4,5)"),
        "ICON_ORTHO".enum("BND_ICONID(6,5)"),
        "ICON_LOCKVIEW_OFF".enum("BND_ICONID(9,5)"),
        "ICON_LOCKVIEW_ON".enum("BND_ICONID(10,5)"),
        "ICON_AXIS_SIDE".enum("BND_ICONID(12,5)"),
        "ICON_AXIS_FRONT".enum("BND_ICONID(13,5)"),
        "ICON_AXIS_TOP".enum("BND_ICONID(14,5)"),
        "ICON_NDOF_DOM".enum("BND_ICONID(15,5)"),
        "ICON_NDOF_TURN".enum("BND_ICONID(16,5)"),
        "ICON_NDOF_FLY".enum("BND_ICONID(17,5)"),
        "ICON_NDOF_TRANS".enum("BND_ICONID(18,5)"),
        "ICON_LAYER_USED".enum("BND_ICONID(19,5)"),
        "ICON_LAYER_ACTIVE".enum("BND_ICONID(20,5)"),
        "ICON_SORTALPHA".enum("BND_ICONID(0,3)"),
        "ICON_SORTBYEXT".enum("BND_ICONID(1,3)"),
        "ICON_SORTTIME".enum("BND_ICONID(2,3)"),
        "ICON_SORTSIZE".enum("BND_ICONID(3,3)"),
        "ICON_LONGDISPLAY".enum("BND_ICONID(4,3)"),
        "ICON_SHORTDISPLAY".enum("BND_ICONID(5,3)"),
        "ICON_GHOST".enum("BND_ICONID(6,3)"),
        "ICON_IMGDISPLAY".enum("BND_ICONID(7,3)"),
        "ICON_SAVE_AS".enum("BND_ICONID(8,3)"),
        "ICON_SAVE_COPY".enum("BND_ICONID(9,3)"),
        "ICON_BOOKMARKS".enum("BND_ICONID(10,3)"),
        "ICON_FONTPREVIEW".enum("BND_ICONID(11,3)"),
        "ICON_FILTER".enum("BND_ICONID(12,3)"),
        "ICON_NEWFOLDER".enum("BND_ICONID(13,3)"),
        "ICON_OPEN_RECENT".enum("BND_ICONID(14,3)"),
        "ICON_FILE_PARENT".enum("BND_ICONID(15,3)"),
        "ICON_FILE_REFRESH".enum("BND_ICONID(16,3)"),
        "ICON_FILE_FOLDER".enum("BND_ICONID(17,3)"),
        "ICON_FILE_BLANK".enum("BND_ICONID(18,3)"),
        "ICON_FILE_BLEND".enum("BND_ICONID(19,3)"),
        "ICON_FILE_IMAGE".enum("BND_ICONID(20,3)"),
        "ICON_FILE_MOVIE".enum("BND_ICONID(21,3)"),
        "ICON_FILE_SCRIPT".enum("BND_ICONID(22,3)"),
        "ICON_FILE_SOUND".enum("BND_ICONID(23,3)"),
        "ICON_FILE_FONT".enum("BND_ICONID(24,3)"),
        "ICON_FILE_TEXT".enum("BND_ICONID(25,3)"),
        "ICON_RECOVER_AUTO".enum("BND_ICONID(0,2)"),
        "ICON_SAVE_PREFS".enum("BND_ICONID(1,2)"),
        "ICON_LINK_BLEND".enum("BND_ICONID(2,2)"),
        "ICON_APPEND_BLEND".enum("BND_ICONID(3,2)"),
        "ICON_IMPORT".enum("BND_ICONID(4,2)"),
        "ICON_EXPORT".enum("BND_ICONID(5,2)"),
        "ICON_EXTERNAL_DATA".enum("BND_ICONID(6,2)"),
        "ICON_LOAD_FACTORY".enum("BND_ICONID(7,2)"),
        "ICON_LOOP_BACK".enum("BND_ICONID(13,2)"),
        "ICON_LOOP_FORWARDS".enum("BND_ICONID(14,2)"),
        "ICON_BACK".enum("BND_ICONID(15,2)"),
        "ICON_FORWARD".enum("BND_ICONID(16,2)"),
        "ICON_FILE_BACKUP".enum("BND_ICONID(24,2)"),
        "ICON_DISK_DRIVE".enum("BND_ICONID(25,2)"),
        "ICON_MATPLANE".enum("BND_ICONID(0,1)"),
        "ICON_MATSPHERE".enum("BND_ICONID(1,1)"),
        "ICON_MATCUBE".enum("BND_ICONID(2,1)"),
        "ICON_MONKEY".enum("BND_ICONID(3,1)"),
        "ICON_HAIR".enum("BND_ICONID(4,1)"),
        "ICON_ALIASED".enum("BND_ICONID(5,1)"),
        "ICON_ANTIALIASED".enum("BND_ICONID(6,1)"),
        "ICON_MAT_SPHERE_SKY".enum("BND_ICONID(7,1)"),
        "ICON_WORDWRAP_OFF".enum("BND_ICONID(12,1)"),
        "ICON_WORDWRAP_ON".enum("BND_ICONID(13,1)"),
        "ICON_SYNTAX_OFF".enum("BND_ICONID(14,1)"),
        "ICON_SYNTAX_ON".enum("BND_ICONID(15,1)"),
        "ICON_LINENUMBERS_OFF".enum("BND_ICONID(16,1)"),
        "ICON_LINENUMBERS_ON".enum("BND_ICONID(17,1)"),
        "ICON_SCRIPTPLUGINS".enum("BND_ICONID(18,1)"),
        "ICON_SEQ_SEQUENCER".enum("BND_ICONID(0,0)"),
        "ICON_SEQ_PREVIEW".enum("BND_ICONID(1,0)"),
        "ICON_SEQ_LUMA_WAVEFORM".enum("BND_ICONID(2,0)"),
        "ICON_SEQ_CHROMA_SCOPE".enum("BND_ICONID(3,0)"),
        "ICON_SEQ_HISTOGRAM".enum("BND_ICONID(4,0)"),
        "ICON_SEQ_SPLITVIEW".enum("BND_ICONID(5,0)"),
        "ICON_IMAGE_RGB".enum("BND_ICONID(9,0)"),
        "ICON_IMAGE_RGB_ALPHA".enum("BND_ICONID(10,0)"),
        "ICON_IMAGE_ALPHA".enum("BND_ICONID(11,0)"),
        "ICON_IMAGE_ZDEPTH".enum("BND_ICONID(12,0)"),
        "ICON_IMAGEFILE".enum("BND_ICONID(13,0)")
    )

    void(
        "SetTheme",

        BNDtheme("theme")
    )

    BNDtheme.const.p(
        "GetTheme",

        void()
    )

    void(
        "SetIconImage",

        int("image")
    )

    void(
        "SetFont",

        int("font")
    )
    
    val ctx = NVGcontext.p("ctx")

    void(
        "Label",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        int("iconid"),
        nullable..charUTF8.const.p("label")
    )

    void(
        "ToolButton",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        int("flags"),
        BNDwidgetState("state"),
        int("iconid"),
        nullable..charUTF8.const.p("label")
    )

    void(
        "RadioButton",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        int("flags"),
        BNDwidgetState("state"),
        int("iconid"),
        nullable..charUTF8.const.p("label")
    )

    int(
        "TextFieldTextPosition",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        int("iconid"),
        nullable..charUTF8.const.p("text"),
        int("px"),
        int("py")
    )

    void(
        "TextField",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        int("flags"),
        BNDwidgetState("state"),
        int("iconid"),
        nullable..charUTF8.const.p("text"),
        int("cbegin"),
        int("cend")
    )

    void(
        "OptionButton",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        BNDwidgetState("state"),
        nullable..charUTF8.const.p("label")
    )

    void(
        "ChoiceButton",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        int("flags"),
        BNDwidgetState("state"),
        int("iconid"),
        nullable..charUTF8.const.p("label")
    )

    void(
        "ColorButton",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        int("flags"),
        NVGcolor("color")
    )

    void(
        "NumberField",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        int("flags"),
        BNDwidgetState("state"),
        nullable..charUTF8.const.p("label"),
        nullable..charUTF8.const.p("value")
    )

    void(
        "Slider",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        int("flags"),
        BNDwidgetState("state"),
        float("progress"),
        nullable..charUTF8.const.p("label"),
        nullable..charUTF8.const.p("value")
    )

    void(
        "ScrollBar",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        BNDwidgetState("state"),
        float("offset"),
        float("size")
    )

    void(
        "MenuBackground",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        int("flags")
    )

    void(
        "MenuLabel",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        int("iconid"),
        nullable..charUTF8.const.p("label")
    )

    void(
        "MenuItem",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        BNDwidgetState("state"),
        int("iconid"),
        nullable..charUTF8.const.p("label")
    )

    void(
        "TooltipBackground",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h")
    )

    void(
        "NodePort",

        ctx,
        float("x"),
        float("y"),
        BNDwidgetState("state"),
        NVGcolor("color")
    )

    void(
        "NodeWire",

        ctx,
        float("x0"),
        float("y0"),
        float("x1"),
        float("y1"),
        BNDwidgetState("state0"),
        BNDwidgetState("state1")
    )

    void(
        "ColoredNodeWire",

        ctx,
        float("x0"),
        float("y0"),
        float("x1"),
        float("y1"),
        NVGcolor("color0"),
        NVGcolor("color1")
    )

    void(
        "NodeBackground",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        BNDwidgetState("state"),
        int("iconid"),
        nullable..charUTF8.const.p("label"),
        NVGcolor("titleColor")
    )

    void(
        "SplitterWidgets",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h")
    )

    void(
        "JoinAreaOverlay",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        intb("vertical"),
        intb("mirror")
    )

    float(
        "LabelWidth",

        ctx,
        int("iconid"),
        nullable..charUTF8.const.p("label")
    )

    float(
        "LabelHeight",

        ctx,
        int("iconid"),
        nullable..charUTF8.const.p("label"),
        float("width")
    )

    NVGcolor(
        "Transparent",

        NVGcolor("color")
    )

    NVGcolor(
        "OffsetColor",

        NVGcolor("color"),
        int("delta")
    )

    void(
        "SelectCorners",

        Check(4)..float.p("radiuses"),
        float("r"),
        int("flags")
    )

    void(
        "InnerColors",

        NVGcolor.p("shade_top"),
        NVGcolor.p("shade_down"),
        BNDwidgetTheme.const.p("theme"),
        BNDwidgetState("state"),
        intb("flipActive")
    )

    NVGcolor(
        "TextColor",

        BNDwidgetTheme.const.p("theme"),
        BNDwidgetState("state")
    )

    void(
        "ScrollHandleRect",

        Check(1)..float.p("x"),
        Check(1)..float.p("y"),
        Check(1)..float.p("w"),
        Check(1)..float.p("h"),
        float("offset"),
        float("size")
    )

    void(
        "RoundedBox",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        float("cr0"),
        float("cr1"),
        float("cr2"),
        float("cr3")
    )

    void(
        "Background",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h")
    )

    void(
        "Bevel",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h")
    )

    void(
        "BevelInset",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        float("cr2"),
        float("cr3")
    )

    void(
        "Icon",

        ctx,
        float("x"),
        float("y"),
        int("iconid")
    )

    void(
        "DropShadow",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        float("r"),
        float("feather"),
        float("alpha")
    )

    void(
        "InnerBox",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        float("cr0"),
        float("cr1"),
        float("cr2"),
        float("cr3"),
        NVGcolor("shade_top"),
        NVGcolor("shade_down")
    )

    void(
        "OutlineBox",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        float("cr0"),
        float("cr1"),
        float("cr2"),
        float("cr3"),
        NVGcolor("color")
    )

    void(
        "IconLabelValue",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        int("iconid"),
        NVGcolor("color"),
        int("align"),
        float("fontsize"),
        nullable..charUTF8.const.p("label"),
        nullable..charUTF8.const.p("value")
    )

    void(
        "NodeIconLabel",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        int("iconid"),
        NVGcolor("color"),
        NVGcolor("shadowColor"),
        int("align"),
        float("fontsize"),
        nullable..charUTF8.const.p("label")
    )

    int(
        "IconLabelTextPosition",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        int("iconid"),
        float("fontsize"),
        nullable..charUTF8.const.p("label"),
        int("px"),
        int("py")
    )

    void(
        "IconLabelCaret",

        ctx,
        float("x"),
        float("y"),
        float("w"),
        float("h"),
        int("iconid"),
        NVGcolor("color"),
        float("fontsize"),
        nullable..charUTF8.const.p("label"),
        NVGcolor("caretcolor"),
        int("cbegin"),
        int("cend")
    )

    void(
        "Check",

        ctx,
        float("ox"),
        float("oy"),
        NVGcolor("color")
    )

    void(
        "Arrow",

        ctx,
        float("x"),
        float("y"),
        float("s"),
        NVGcolor("color")
    )

    void(
        "UpDownArrow",

        ctx,
        float("x"),
        float("y"),
        float("s"),
        NVGcolor("color")
    )

    void(
        "NodeArrowDown",

        ctx,
        float("x"),
        float("y"),
        float("s"),
        NVGcolor("color")
    )

    NVGcolor(
        "NodeWireColor",

        BNDnodeTheme.const.p("theme"),
        BNDwidgetState("state")
    )
}
