/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Blendish {

    static { LibNanoVG.initialize(); }

    public static final float BND_DISABLED_ALPHA = 0.5f;

    public static final int
        BND_LEFT   = 0,
        BND_CENTER = 1;

    public static final int
        BND_DEFAULT = 0,
        BND_HOVER   = 1,
        BND_ACTIVE  = 2;

    public static final int
        BND_CORNER_NONE       = 0,
        BND_CORNER_TOP_LEFT   = 1,
        BND_CORNER_TOP_RIGHT  = 2,
        BND_CORNER_DOWN_RIGHT = 4,
        BND_CORNER_DOWN_LEFT  = 8,
        BND_CORNER_ALL        = 0xF,
        BND_CORNER_TOP        = 3,
        BND_CORNER_DOWN       = 0xC,
        BND_CORNER_LEFT       = 9,
        BND_CORNER_RIGHT      = 6;

    public static final int
        BND_WIDGET_HEIGHT         = 21,
        BND_TOOL_WIDTH            = 20,
        BND_NODE_PORT_RADIUS      = 5,
        BND_NODE_MARGIN_TOP       = 25,
        BND_NODE_MARGIN_DOWN      = 5,
        BND_NODE_MARGIN_SIDE      = 10,
        BND_NODE_TITLE_HEIGHT     = 20,
        BND_NODE_ARROW_AREA_WIDTH = 20,
        BND_SPLITTER_AREA_SIZE    = 12,
        BND_SCROLLBAR_WIDTH       = 13,
        BND_SCROLLBAR_HEIGHT      = 14,
        BND_VSPACING              = 1,
        BND_VSPACING_GROUP        = 8,
        BND_HSPACING              = 8;

    public static final int
        BND_ICON_NONE                   = BND_ICONID(0,29),
        BND_ICON_QUESTION               = BND_ICONID(1,29),
        BND_ICON_ERROR                  = BND_ICONID(2,29),
        BND_ICON_CANCEL                 = BND_ICONID(3,29),
        BND_ICON_TRIA_RIGHT             = BND_ICONID(4,29),
        BND_ICON_TRIA_DOWN              = BND_ICONID(5,29),
        BND_ICON_TRIA_LEFT              = BND_ICONID(6,29),
        BND_ICON_TRIA_UP                = BND_ICONID(7,29),
        BND_ICON_ARROW_LEFTRIGHT        = BND_ICONID(8,29),
        BND_ICON_PLUS                   = BND_ICONID(9,29),
        BND_ICON_DISCLOSURE_TRI_DOWN    = BND_ICONID(10,29),
        BND_ICON_DISCLOSURE_TRI_RIGHT   = BND_ICONID(11,29),
        BND_ICON_RADIOBUT_OFF           = BND_ICONID(12,29),
        BND_ICON_RADIOBUT_ON            = BND_ICONID(13,29),
        BND_ICON_MENU_PANEL             = BND_ICONID(14,29),
        BND_ICON_BLENDER                = BND_ICONID(15,29),
        BND_ICON_GRIP                   = BND_ICONID(16,29),
        BND_ICON_DOT                    = BND_ICONID(17,29),
        BND_ICON_COLLAPSEMENU           = BND_ICONID(18,29),
        BND_ICON_X                      = BND_ICONID(19,29),
        BND_ICON_GO_LEFT                = BND_ICONID(21,29),
        BND_ICON_PLUG                   = BND_ICONID(22,29),
        BND_ICON_UI                     = BND_ICONID(23,29),
        BND_ICON_NODE                   = BND_ICONID(24,29),
        BND_ICON_NODE_SEL               = BND_ICONID(25,29),
        BND_ICON_FULLSCREEN             = BND_ICONID(0,28),
        BND_ICON_SPLITSCREEN            = BND_ICONID(1,28),
        BND_ICON_RIGHTARROW_THIN        = BND_ICONID(2,28),
        BND_ICON_BORDERMOVE             = BND_ICONID(3,28),
        BND_ICON_VIEWZOOM               = BND_ICONID(4,28),
        BND_ICON_ZOOMIN                 = BND_ICONID(5,28),
        BND_ICON_ZOOMOUT                = BND_ICONID(6,28),
        BND_ICON_PANEL_CLOSE            = BND_ICONID(7,28),
        BND_ICON_COPY_ID                = BND_ICONID(8,28),
        BND_ICON_EYEDROPPER             = BND_ICONID(9,28),
        BND_ICON_LINK_AREA              = BND_ICONID(10,28),
        BND_ICON_AUTO                   = BND_ICONID(11,28),
        BND_ICON_CHECKBOX_DEHLT         = BND_ICONID(12,28),
        BND_ICON_CHECKBOX_HLT           = BND_ICONID(13,28),
        BND_ICON_UNLOCKED               = BND_ICONID(14,28),
        BND_ICON_LOCKED                 = BND_ICONID(15,28),
        BND_ICON_UNPINNED               = BND_ICONID(16,28),
        BND_ICON_PINNED                 = BND_ICONID(17,28),
        BND_ICON_SCREEN_BACK            = BND_ICONID(18,28),
        BND_ICON_RIGHTARROW             = BND_ICONID(19,28),
        BND_ICON_DOWNARROW_HLT          = BND_ICONID(20,28),
        BND_ICON_DOTSUP                 = BND_ICONID(21,28),
        BND_ICON_DOTSDOWN               = BND_ICONID(22,28),
        BND_ICON_LINK                   = BND_ICONID(23,28),
        BND_ICON_INLINK                 = BND_ICONID(24,28),
        BND_ICON_PLUGIN                 = BND_ICONID(25,28),
        BND_ICON_HELP                   = BND_ICONID(0,27),
        BND_ICON_GHOST_ENABLED          = BND_ICONID(1,27),
        BND_ICON_COLOR                  = BND_ICONID(2,27),
        BND_ICON_LINKED                 = BND_ICONID(3,27),
        BND_ICON_UNLINKED               = BND_ICONID(4,27),
        BND_ICON_HAND                   = BND_ICONID(5,27),
        BND_ICON_ZOOM_ALL               = BND_ICONID(6,27),
        BND_ICON_ZOOM_SELECTED          = BND_ICONID(7,27),
        BND_ICON_ZOOM_PREVIOUS          = BND_ICONID(8,27),
        BND_ICON_ZOOM_IN                = BND_ICONID(9,27),
        BND_ICON_ZOOM_OUT               = BND_ICONID(10,27),
        BND_ICON_RENDER_REGION          = BND_ICONID(11,27),
        BND_ICON_BORDER_RECT            = BND_ICONID(12,27),
        BND_ICON_BORDER_LASSO           = BND_ICONID(13,27),
        BND_ICON_FREEZE                 = BND_ICONID(14,27),
        BND_ICON_STYLUS_PRESSURE        = BND_ICONID(15,27),
        BND_ICON_GHOST_DISABLED         = BND_ICONID(16,27),
        BND_ICON_NEW                    = BND_ICONID(17,27),
        BND_ICON_FILE_TICK              = BND_ICONID(18,27),
        BND_ICON_QUIT                   = BND_ICONID(19,27),
        BND_ICON_URL                    = BND_ICONID(20,27),
        BND_ICON_RECOVER_LAST           = BND_ICONID(21,27),
        BND_ICON_FULLSCREEN_ENTER       = BND_ICONID(23,27),
        BND_ICON_FULLSCREEN_EXIT        = BND_ICONID(24,27),
        BND_ICON_BLANK1                 = BND_ICONID(25,27),
        BND_ICON_LAMP                   = BND_ICONID(0,26),
        BND_ICON_MATERIAL               = BND_ICONID(1,26),
        BND_ICON_TEXTURE                = BND_ICONID(2,26),
        BND_ICON_ANIM                   = BND_ICONID(3,26),
        BND_ICON_WORLD                  = BND_ICONID(4,26),
        BND_ICON_SCENE                  = BND_ICONID(5,26),
        BND_ICON_EDIT                   = BND_ICONID(6,26),
        BND_ICON_GAME                   = BND_ICONID(7,26),
        BND_ICON_RADIO                  = BND_ICONID(8,26),
        BND_ICON_SCRIPT                 = BND_ICONID(9,26),
        BND_ICON_PARTICLES              = BND_ICONID(10,26),
        BND_ICON_PHYSICS                = BND_ICONID(11,26),
        BND_ICON_SPEAKER                = BND_ICONID(12,26),
        BND_ICON_TEXTURE_SHADED         = BND_ICONID(13,26),
        BND_ICON_VIEW3D                 = BND_ICONID(0,25),
        BND_ICON_IPO                    = BND_ICONID(1,25),
        BND_ICON_OOPS                   = BND_ICONID(2,25),
        BND_ICON_BUTS                   = BND_ICONID(3,25),
        BND_ICON_FILESEL                = BND_ICONID(4,25),
        BND_ICON_IMAGE_COL              = BND_ICONID(5,25),
        BND_ICON_INFO                   = BND_ICONID(6,25),
        BND_ICON_SEQUENCE               = BND_ICONID(7,25),
        BND_ICON_TEXT                   = BND_ICONID(8,25),
        BND_ICON_IMASEL                 = BND_ICONID(9,25),
        BND_ICON_SOUND                  = BND_ICONID(10,25),
        BND_ICON_ACTION                 = BND_ICONID(11,25),
        BND_ICON_NLA                    = BND_ICONID(12,25),
        BND_ICON_SCRIPTWIN              = BND_ICONID(13,25),
        BND_ICON_TIME                   = BND_ICONID(14,25),
        BND_ICON_NODETREE               = BND_ICONID(15,25),
        BND_ICON_LOGIC                  = BND_ICONID(16,25),
        BND_ICON_CONSOLE                = BND_ICONID(17,25),
        BND_ICON_PREFERENCES            = BND_ICONID(18,25),
        BND_ICON_CLIP                   = BND_ICONID(19,25),
        BND_ICON_ASSET_MANAGER          = BND_ICONID(20,25),
        BND_ICON_OBJECT_DATAMODE        = BND_ICONID(0,24),
        BND_ICON_EDITMODE_HLT           = BND_ICONID(1,24),
        BND_ICON_FACESEL_HLT            = BND_ICONID(2,24),
        BND_ICON_VPAINT_HLT             = BND_ICONID(3,24),
        BND_ICON_TPAINT_HLT             = BND_ICONID(4,24),
        BND_ICON_WPAINT_HLT             = BND_ICONID(5,24),
        BND_ICON_SCULPTMODE_HLT         = BND_ICONID(6,24),
        BND_ICON_POSE_HLT               = BND_ICONID(7,24),
        BND_ICON_PARTICLEMODE           = BND_ICONID(8,24),
        BND_ICON_LIGHTPAINT             = BND_ICONID(9,24),
        BND_ICON_SCENE_DATA             = BND_ICONID(0,23),
        BND_ICON_RENDERLAYERS           = BND_ICONID(1,23),
        BND_ICON_WORLD_DATA             = BND_ICONID(2,23),
        BND_ICON_OBJECT_DATA            = BND_ICONID(3,23),
        BND_ICON_MESH_DATA              = BND_ICONID(4,23),
        BND_ICON_CURVE_DATA             = BND_ICONID(5,23),
        BND_ICON_META_DATA              = BND_ICONID(6,23),
        BND_ICON_LATTICE_DATA           = BND_ICONID(7,23),
        BND_ICON_LAMP_DATA              = BND_ICONID(8,23),
        BND_ICON_MATERIAL_DATA          = BND_ICONID(9,23),
        BND_ICON_TEXTURE_DATA           = BND_ICONID(10,23),
        BND_ICON_ANIM_DATA              = BND_ICONID(11,23),
        BND_ICON_CAMERA_DATA            = BND_ICONID(12,23),
        BND_ICON_PARTICLE_DATA          = BND_ICONID(13,23),
        BND_ICON_LIBRARY_DATA_DIRECT    = BND_ICONID(14,23),
        BND_ICON_GROUP                  = BND_ICONID(15,23),
        BND_ICON_ARMATURE_DATA          = BND_ICONID(16,23),
        BND_ICON_POSE_DATA              = BND_ICONID(17,23),
        BND_ICON_BONE_DATA              = BND_ICONID(18,23),
        BND_ICON_CONSTRAINT             = BND_ICONID(19,23),
        BND_ICON_SHAPEKEY_DATA          = BND_ICONID(20,23),
        BND_ICON_CONSTRAINT_BONE        = BND_ICONID(21,23),
        BND_ICON_CAMERA_STEREO          = BND_ICONID(22,23),
        BND_ICON_PACKAGE                = BND_ICONID(23,23),
        BND_ICON_UGLYPACKAGE            = BND_ICONID(24,23),
        BND_ICON_BRUSH_DATA             = BND_ICONID(0,22),
        BND_ICON_IMAGE_DATA             = BND_ICONID(1,22),
        BND_ICON_FILE                   = BND_ICONID(2,22),
        BND_ICON_FCURVE                 = BND_ICONID(3,22),
        BND_ICON_FONT_DATA              = BND_ICONID(4,22),
        BND_ICON_RENDER_RESULT          = BND_ICONID(5,22),
        BND_ICON_SURFACE_DATA           = BND_ICONID(6,22),
        BND_ICON_EMPTY_DATA             = BND_ICONID(7,22),
        BND_ICON_SETTINGS               = BND_ICONID(8,22),
        BND_ICON_RENDER_ANIMATION       = BND_ICONID(9,22),
        BND_ICON_RENDER_STILL           = BND_ICONID(10,22),
        BND_ICON_BOIDS                  = BND_ICONID(12,22),
        BND_ICON_STRANDS                = BND_ICONID(13,22),
        BND_ICON_LIBRARY_DATA_INDIRECT  = BND_ICONID(14,22),
        BND_ICON_GREASEPENCIL           = BND_ICONID(15,22),
        BND_ICON_LINE_DATA              = BND_ICONID(16,22),
        BND_ICON_GROUP_BONE             = BND_ICONID(18,22),
        BND_ICON_GROUP_VERTEX           = BND_ICONID(19,22),
        BND_ICON_GROUP_VCOL             = BND_ICONID(20,22),
        BND_ICON_GROUP_UVS              = BND_ICONID(21,22),
        BND_ICON_RNA                    = BND_ICONID(24,22),
        BND_ICON_RNA_ADD                = BND_ICONID(25,22),
        BND_ICON_OUTLINER_OB_EMPTY      = BND_ICONID(0,20),
        BND_ICON_OUTLINER_OB_MESH       = BND_ICONID(1,20),
        BND_ICON_OUTLINER_OB_CURVE      = BND_ICONID(2,20),
        BND_ICON_OUTLINER_OB_LATTICE    = BND_ICONID(3,20),
        BND_ICON_OUTLINER_OB_META       = BND_ICONID(4,20),
        BND_ICON_OUTLINER_OB_LAMP       = BND_ICONID(5,20),
        BND_ICON_OUTLINER_OB_CAMERA     = BND_ICONID(6,20),
        BND_ICON_OUTLINER_OB_ARMATURE   = BND_ICONID(7,20),
        BND_ICON_OUTLINER_OB_FONT       = BND_ICONID(8,20),
        BND_ICON_OUTLINER_OB_SURFACE    = BND_ICONID(9,20),
        BND_ICON_OUTLINER_OB_SPEAKER    = BND_ICONID(10,20),
        BND_ICON_RESTRICT_VIEW_OFF      = BND_ICONID(19,20),
        BND_ICON_RESTRICT_VIEW_ON       = BND_ICONID(20,20),
        BND_ICON_RESTRICT_SELECT_OFF    = BND_ICONID(21,20),
        BND_ICON_RESTRICT_SELECT_ON     = BND_ICONID(22,20),
        BND_ICON_RESTRICT_RENDER_OFF    = BND_ICONID(23,20),
        BND_ICON_RESTRICT_RENDER_ON     = BND_ICONID(24,20),
        BND_ICON_OUTLINER_DATA_EMPTY    = BND_ICONID(0,19),
        BND_ICON_OUTLINER_DATA_MESH     = BND_ICONID(1,19),
        BND_ICON_OUTLINER_DATA_CURVE    = BND_ICONID(2,19),
        BND_ICON_OUTLINER_DATA_LATTICE  = BND_ICONID(3,19),
        BND_ICON_OUTLINER_DATA_META     = BND_ICONID(4,19),
        BND_ICON_OUTLINER_DATA_LAMP     = BND_ICONID(5,19),
        BND_ICON_OUTLINER_DATA_CAMERA   = BND_ICONID(6,19),
        BND_ICON_OUTLINER_DATA_ARMATURE = BND_ICONID(7,19),
        BND_ICON_OUTLINER_DATA_FONT     = BND_ICONID(8,19),
        BND_ICON_OUTLINER_DATA_SURFACE  = BND_ICONID(9,19),
        BND_ICON_OUTLINER_DATA_SPEAKER  = BND_ICONID(10,19),
        BND_ICON_OUTLINER_DATA_POSE     = BND_ICONID(11,19),
        BND_ICON_MESH_PLANE             = BND_ICONID(0,18),
        BND_ICON_MESH_CUBE              = BND_ICONID(1,18),
        BND_ICON_MESH_CIRCLE            = BND_ICONID(2,18),
        BND_ICON_MESH_UVSPHERE          = BND_ICONID(3,18),
        BND_ICON_MESH_ICOSPHERE         = BND_ICONID(4,18),
        BND_ICON_MESH_GRID              = BND_ICONID(5,18),
        BND_ICON_MESH_MONKEY            = BND_ICONID(6,18),
        BND_ICON_MESH_CYLINDER          = BND_ICONID(7,18),
        BND_ICON_MESH_TORUS             = BND_ICONID(8,18),
        BND_ICON_MESH_CONE              = BND_ICONID(9,18),
        BND_ICON_LAMP_POINT             = BND_ICONID(12,18),
        BND_ICON_LAMP_SUN               = BND_ICONID(13,18),
        BND_ICON_LAMP_SPOT              = BND_ICONID(14,18),
        BND_ICON_LAMP_HEMI              = BND_ICONID(15,18),
        BND_ICON_LAMP_AREA              = BND_ICONID(16,18),
        BND_ICON_META_EMPTY             = BND_ICONID(19,18),
        BND_ICON_META_PLANE             = BND_ICONID(20,18),
        BND_ICON_META_CUBE              = BND_ICONID(21,18),
        BND_ICON_META_BALL              = BND_ICONID(22,18),
        BND_ICON_META_ELLIPSOID         = BND_ICONID(23,18),
        BND_ICON_META_CAPSULE           = BND_ICONID(24,18),
        BND_ICON_SURFACE_NCURVE         = BND_ICONID(0,17),
        BND_ICON_SURFACE_NCIRCLE        = BND_ICONID(1,17),
        BND_ICON_SURFACE_NSURFACE       = BND_ICONID(2,17),
        BND_ICON_SURFACE_NCYLINDER      = BND_ICONID(3,17),
        BND_ICON_SURFACE_NSPHERE        = BND_ICONID(4,17),
        BND_ICON_SURFACE_NTORUS         = BND_ICONID(5,17),
        BND_ICON_CURVE_BEZCURVE         = BND_ICONID(9,17),
        BND_ICON_CURVE_BEZCIRCLE        = BND_ICONID(10,17),
        BND_ICON_CURVE_NCURVE           = BND_ICONID(11,17),
        BND_ICON_CURVE_NCIRCLE          = BND_ICONID(12,17),
        BND_ICON_CURVE_PATH             = BND_ICONID(13,17),
        BND_ICON_COLOR_RED              = BND_ICONID(19,17),
        BND_ICON_COLOR_GREEN            = BND_ICONID(20,17),
        BND_ICON_COLOR_BLUE             = BND_ICONID(21,17),
        BND_ICON_FORCE_FORCE            = BND_ICONID(0,16),
        BND_ICON_FORCE_WIND             = BND_ICONID(1,16),
        BND_ICON_FORCE_VORTEX           = BND_ICONID(2,16),
        BND_ICON_FORCE_MAGNETIC         = BND_ICONID(3,16),
        BND_ICON_FORCE_HARMONIC         = BND_ICONID(4,16),
        BND_ICON_FORCE_CHARGE           = BND_ICONID(5,16),
        BND_ICON_FORCE_LENNARDJONES     = BND_ICONID(6,16),
        BND_ICON_FORCE_TEXTURE          = BND_ICONID(7,16),
        BND_ICON_FORCE_CURVE            = BND_ICONID(8,16),
        BND_ICON_FORCE_BOID             = BND_ICONID(9,16),
        BND_ICON_FORCE_TURBULENCE       = BND_ICONID(10,16),
        BND_ICON_FORCE_DRAG             = BND_ICONID(11,16),
        BND_ICON_FORCE_SMOKEFLOW        = BND_ICONID(12,16),
        BND_ICON_MODIFIER               = BND_ICONID(0,12),
        BND_ICON_MOD_WAVE               = BND_ICONID(1,12),
        BND_ICON_MOD_BUILD              = BND_ICONID(2,12),
        BND_ICON_MOD_DECIM              = BND_ICONID(3,12),
        BND_ICON_MOD_MIRROR             = BND_ICONID(4,12),
        BND_ICON_MOD_SOFT               = BND_ICONID(5,12),
        BND_ICON_MOD_SUBSURF            = BND_ICONID(6,12),
        BND_ICON_HOOK                   = BND_ICONID(7,12),
        BND_ICON_MOD_PHYSICS            = BND_ICONID(8,12),
        BND_ICON_MOD_PARTICLES          = BND_ICONID(9,12),
        BND_ICON_MOD_BOOLEAN            = BND_ICONID(10,12),
        BND_ICON_MOD_EDGESPLIT          = BND_ICONID(11,12),
        BND_ICON_MOD_ARRAY              = BND_ICONID(12,12),
        BND_ICON_MOD_UVPROJECT          = BND_ICONID(13,12),
        BND_ICON_MOD_DISPLACE           = BND_ICONID(14,12),
        BND_ICON_MOD_CURVE              = BND_ICONID(15,12),
        BND_ICON_MOD_LATTICE            = BND_ICONID(16,12),
        BND_ICON_CONSTRAINT_DATA        = BND_ICONID(17,12),
        BND_ICON_MOD_ARMATURE           = BND_ICONID(18,12),
        BND_ICON_MOD_SHRINKWRAP         = BND_ICONID(19,12),
        BND_ICON_MOD_CAST               = BND_ICONID(20,12),
        BND_ICON_MOD_MESHDEFORM         = BND_ICONID(21,12),
        BND_ICON_MOD_BEVEL              = BND_ICONID(22,12),
        BND_ICON_MOD_SMOOTH             = BND_ICONID(23,12),
        BND_ICON_MOD_SIMPLEDEFORM       = BND_ICONID(24,12),
        BND_ICON_MOD_MASK               = BND_ICONID(25,12),
        BND_ICON_MOD_CLOTH              = BND_ICONID(0,11),
        BND_ICON_MOD_EXPLODE            = BND_ICONID(1,11),
        BND_ICON_MOD_FLUIDSIM           = BND_ICONID(2,11),
        BND_ICON_MOD_MULTIRES           = BND_ICONID(3,11),
        BND_ICON_MOD_SMOKE              = BND_ICONID(4,11),
        BND_ICON_MOD_SOLIDIFY           = BND_ICONID(5,11),
        BND_ICON_MOD_SCREW              = BND_ICONID(6,11),
        BND_ICON_MOD_VERTEX_WEIGHT      = BND_ICONID(7,11),
        BND_ICON_MOD_DYNAMICPAINT       = BND_ICONID(8,11),
        BND_ICON_MOD_REMESH             = BND_ICONID(9,11),
        BND_ICON_MOD_OCEAN              = BND_ICONID(10,11),
        BND_ICON_MOD_WARP               = BND_ICONID(11,11),
        BND_ICON_MOD_SKIN               = BND_ICONID(12,11),
        BND_ICON_MOD_TRIANGULATE        = BND_ICONID(13,11),
        BND_ICON_MOD_WIREFRAME          = BND_ICONID(14,11),
        BND_ICON_REC                    = BND_ICONID(0,10),
        BND_ICON_PLAY                   = BND_ICONID(1,10),
        BND_ICON_FF                     = BND_ICONID(2,10),
        BND_ICON_REW                    = BND_ICONID(3,10),
        BND_ICON_PAUSE                  = BND_ICONID(4,10),
        BND_ICON_PREV_KEYFRAME          = BND_ICONID(5,10),
        BND_ICON_NEXT_KEYFRAME          = BND_ICONID(6,10),
        BND_ICON_PLAY_AUDIO             = BND_ICONID(7,10),
        BND_ICON_PLAY_REVERSE           = BND_ICONID(8,10),
        BND_ICON_PREVIEW_RANGE          = BND_ICONID(9,10),
        BND_ICON_ACTION_TWEAK           = BND_ICONID(10,10),
        BND_ICON_PMARKER_ACT            = BND_ICONID(11,10),
        BND_ICON_PMARKER_SEL            = BND_ICONID(12,10),
        BND_ICON_PMARKER                = BND_ICONID(13,10),
        BND_ICON_MARKER_HLT             = BND_ICONID(14,10),
        BND_ICON_MARKER                 = BND_ICONID(15,10),
        BND_ICON_SPACE2                 = BND_ICONID(16,10),
        BND_ICON_SPACE3                 = BND_ICONID(17,10),
        BND_ICON_KEYINGSET              = BND_ICONID(18,10),
        BND_ICON_KEY_DEHLT              = BND_ICONID(19,10),
        BND_ICON_KEY_HLT                = BND_ICONID(20,10),
        BND_ICON_MUTE_IPO_OFF           = BND_ICONID(21,10),
        BND_ICON_MUTE_IPO_ON            = BND_ICONID(22,10),
        BND_ICON_VISIBLE_IPO_OFF        = BND_ICONID(23,10),
        BND_ICON_VISIBLE_IPO_ON         = BND_ICONID(24,10),
        BND_ICON_DRIVER                 = BND_ICONID(25,10),
        BND_ICON_SOLO_OFF               = BND_ICONID(0,9),
        BND_ICON_SOLO_ON                = BND_ICONID(1,9),
        BND_ICON_FRAME_PREV             = BND_ICONID(2,9),
        BND_ICON_FRAME_NEXT             = BND_ICONID(3,9),
        BND_ICON_NLA_PUSHDOWN           = BND_ICONID(4,9),
        BND_ICON_IPO_CONSTANT           = BND_ICONID(5,9),
        BND_ICON_IPO_LINEAR             = BND_ICONID(6,9),
        BND_ICON_IPO_BEZIER             = BND_ICONID(7,9),
        BND_ICON_IPO_SINE               = BND_ICONID(8,9),
        BND_ICON_IPO_QUAD               = BND_ICONID(9,9),
        BND_ICON_IPO_CUBIC              = BND_ICONID(10,9),
        BND_ICON_IPO_QUART              = BND_ICONID(11,9),
        BND_ICON_IPO_QUINT              = BND_ICONID(12,9),
        BND_ICON_IPO_EXPO               = BND_ICONID(13,9),
        BND_ICON_IPO_CIRC               = BND_ICONID(14,9),
        BND_ICON_IPO_BOUNCE             = BND_ICONID(15,9),
        BND_ICON_IPO_ELASTIC            = BND_ICONID(16,9),
        BND_ICON_IPO_BACK               = BND_ICONID(17,9),
        BND_ICON_IPO_EASE_IN            = BND_ICONID(18,9),
        BND_ICON_IPO_EASE_OUT           = BND_ICONID(19,9),
        BND_ICON_IPO_EASE_IN_OUT        = BND_ICONID(20,9),
        BND_ICON_VERTEXSEL              = BND_ICONID(0,8),
        BND_ICON_EDGESEL                = BND_ICONID(1,8),
        BND_ICON_FACESEL                = BND_ICONID(2,8),
        BND_ICON_LOOPSEL                = BND_ICONID(3,8),
        BND_ICON_ROTATE                 = BND_ICONID(5,8),
        BND_ICON_CURSOR                 = BND_ICONID(6,8),
        BND_ICON_ROTATECOLLECTION       = BND_ICONID(7,8),
        BND_ICON_ROTATECENTER           = BND_ICONID(8,8),
        BND_ICON_ROTACTIVE              = BND_ICONID(9,8),
        BND_ICON_ALIGN                  = BND_ICONID(10,8),
        BND_ICON_SMOOTHCURVE            = BND_ICONID(12,8),
        BND_ICON_SPHERECURVE            = BND_ICONID(13,8),
        BND_ICON_ROOTCURVE              = BND_ICONID(14,8),
        BND_ICON_SHARPCURVE             = BND_ICONID(15,8),
        BND_ICON_LINCURVE               = BND_ICONID(16,8),
        BND_ICON_NOCURVE                = BND_ICONID(17,8),
        BND_ICON_RNDCURVE               = BND_ICONID(18,8),
        BND_ICON_PROP_OFF               = BND_ICONID(19,8),
        BND_ICON_PROP_ON                = BND_ICONID(20,8),
        BND_ICON_PROP_CON               = BND_ICONID(21,8),
        BND_ICON_SCULPT_DYNTOPO         = BND_ICONID(22,8),
        BND_ICON_PARTICLE_POINT         = BND_ICONID(23,8),
        BND_ICON_PARTICLE_TIP           = BND_ICONID(24,8),
        BND_ICON_PARTICLE_PATH          = BND_ICONID(25,8),
        BND_ICON_MAN_TRANS              = BND_ICONID(0,7),
        BND_ICON_MAN_ROT                = BND_ICONID(1,7),
        BND_ICON_MAN_SCALE              = BND_ICONID(2,7),
        BND_ICON_MANIPUL                = BND_ICONID(3,7),
        BND_ICON_SNAP_OFF               = BND_ICONID(4,7),
        BND_ICON_SNAP_ON                = BND_ICONID(5,7),
        BND_ICON_SNAP_NORMAL            = BND_ICONID(6,7),
        BND_ICON_SNAP_INCREMENT         = BND_ICONID(7,7),
        BND_ICON_SNAP_VERTEX            = BND_ICONID(8,7),
        BND_ICON_SNAP_EDGE              = BND_ICONID(9,7),
        BND_ICON_SNAP_FACE              = BND_ICONID(10,7),
        BND_ICON_SNAP_VOLUME            = BND_ICONID(11,7),
        BND_ICON_STICKY_UVS_LOC         = BND_ICONID(13,7),
        BND_ICON_STICKY_UVS_DISABLE     = BND_ICONID(14,7),
        BND_ICON_STICKY_UVS_VERT        = BND_ICONID(15,7),
        BND_ICON_CLIPUV_DEHLT           = BND_ICONID(16,7),
        BND_ICON_CLIPUV_HLT             = BND_ICONID(17,7),
        BND_ICON_SNAP_PEEL_OBJECT       = BND_ICONID(18,7),
        BND_ICON_GRID                   = BND_ICONID(19,7),
        BND_ICON_PASTEDOWN              = BND_ICONID(0,6),
        BND_ICON_COPYDOWN               = BND_ICONID(1,6),
        BND_ICON_PASTEFLIPUP            = BND_ICONID(2,6),
        BND_ICON_PASTEFLIPDOWN          = BND_ICONID(3,6),
        BND_ICON_SNAP_SURFACE           = BND_ICONID(8,6),
        BND_ICON_AUTOMERGE_ON           = BND_ICONID(9,6),
        BND_ICON_AUTOMERGE_OFF          = BND_ICONID(10,6),
        BND_ICON_RETOPO                 = BND_ICONID(11,6),
        BND_ICON_UV_VERTEXSEL           = BND_ICONID(12,6),
        BND_ICON_UV_EDGESEL             = BND_ICONID(13,6),
        BND_ICON_UV_FACESEL             = BND_ICONID(14,6),
        BND_ICON_UV_ISLANDSEL           = BND_ICONID(15,6),
        BND_ICON_UV_SYNC_SELECT         = BND_ICONID(16,6),
        BND_ICON_BBOX                   = BND_ICONID(0,5),
        BND_ICON_WIRE                   = BND_ICONID(1,5),
        BND_ICON_SOLID                  = BND_ICONID(2,5),
        BND_ICON_SMOOTH                 = BND_ICONID(3,5),
        BND_ICON_POTATO                 = BND_ICONID(4,5),
        BND_ICON_ORTHO                  = BND_ICONID(6,5),
        BND_ICON_LOCKVIEW_OFF           = BND_ICONID(9,5),
        BND_ICON_LOCKVIEW_ON            = BND_ICONID(10,5),
        BND_ICON_AXIS_SIDE              = BND_ICONID(12,5),
        BND_ICON_AXIS_FRONT             = BND_ICONID(13,5),
        BND_ICON_AXIS_TOP               = BND_ICONID(14,5),
        BND_ICON_NDOF_DOM               = BND_ICONID(15,5),
        BND_ICON_NDOF_TURN              = BND_ICONID(16,5),
        BND_ICON_NDOF_FLY               = BND_ICONID(17,5),
        BND_ICON_NDOF_TRANS             = BND_ICONID(18,5),
        BND_ICON_LAYER_USED             = BND_ICONID(19,5),
        BND_ICON_LAYER_ACTIVE           = BND_ICONID(20,5),
        BND_ICON_SORTALPHA              = BND_ICONID(0,3),
        BND_ICON_SORTBYEXT              = BND_ICONID(1,3),
        BND_ICON_SORTTIME               = BND_ICONID(2,3),
        BND_ICON_SORTSIZE               = BND_ICONID(3,3),
        BND_ICON_LONGDISPLAY            = BND_ICONID(4,3),
        BND_ICON_SHORTDISPLAY           = BND_ICONID(5,3),
        BND_ICON_GHOST                  = BND_ICONID(6,3),
        BND_ICON_IMGDISPLAY             = BND_ICONID(7,3),
        BND_ICON_SAVE_AS                = BND_ICONID(8,3),
        BND_ICON_SAVE_COPY              = BND_ICONID(9,3),
        BND_ICON_BOOKMARKS              = BND_ICONID(10,3),
        BND_ICON_FONTPREVIEW            = BND_ICONID(11,3),
        BND_ICON_FILTER                 = BND_ICONID(12,3),
        BND_ICON_NEWFOLDER              = BND_ICONID(13,3),
        BND_ICON_OPEN_RECENT            = BND_ICONID(14,3),
        BND_ICON_FILE_PARENT            = BND_ICONID(15,3),
        BND_ICON_FILE_REFRESH           = BND_ICONID(16,3),
        BND_ICON_FILE_FOLDER            = BND_ICONID(17,3),
        BND_ICON_FILE_BLANK             = BND_ICONID(18,3),
        BND_ICON_FILE_BLEND             = BND_ICONID(19,3),
        BND_ICON_FILE_IMAGE             = BND_ICONID(20,3),
        BND_ICON_FILE_MOVIE             = BND_ICONID(21,3),
        BND_ICON_FILE_SCRIPT            = BND_ICONID(22,3),
        BND_ICON_FILE_SOUND             = BND_ICONID(23,3),
        BND_ICON_FILE_FONT              = BND_ICONID(24,3),
        BND_ICON_FILE_TEXT              = BND_ICONID(25,3),
        BND_ICON_RECOVER_AUTO           = BND_ICONID(0,2),
        BND_ICON_SAVE_PREFS             = BND_ICONID(1,2),
        BND_ICON_LINK_BLEND             = BND_ICONID(2,2),
        BND_ICON_APPEND_BLEND           = BND_ICONID(3,2),
        BND_ICON_IMPORT                 = BND_ICONID(4,2),
        BND_ICON_EXPORT                 = BND_ICONID(5,2),
        BND_ICON_EXTERNAL_DATA          = BND_ICONID(6,2),
        BND_ICON_LOAD_FACTORY           = BND_ICONID(7,2),
        BND_ICON_LOOP_BACK              = BND_ICONID(13,2),
        BND_ICON_LOOP_FORWARDS          = BND_ICONID(14,2),
        BND_ICON_BACK                   = BND_ICONID(15,2),
        BND_ICON_FORWARD                = BND_ICONID(16,2),
        BND_ICON_FILE_BACKUP            = BND_ICONID(24,2),
        BND_ICON_DISK_DRIVE             = BND_ICONID(25,2),
        BND_ICON_MATPLANE               = BND_ICONID(0,1),
        BND_ICON_MATSPHERE              = BND_ICONID(1,1),
        BND_ICON_MATCUBE                = BND_ICONID(2,1),
        BND_ICON_MONKEY                 = BND_ICONID(3,1),
        BND_ICON_HAIR                   = BND_ICONID(4,1),
        BND_ICON_ALIASED                = BND_ICONID(5,1),
        BND_ICON_ANTIALIASED            = BND_ICONID(6,1),
        BND_ICON_MAT_SPHERE_SKY         = BND_ICONID(7,1),
        BND_ICON_WORDWRAP_OFF           = BND_ICONID(12,1),
        BND_ICON_WORDWRAP_ON            = BND_ICONID(13,1),
        BND_ICON_SYNTAX_OFF             = BND_ICONID(14,1),
        BND_ICON_SYNTAX_ON              = BND_ICONID(15,1),
        BND_ICON_LINENUMBERS_OFF        = BND_ICONID(16,1),
        BND_ICON_LINENUMBERS_ON         = BND_ICONID(17,1),
        BND_ICON_SCRIPTPLUGINS          = BND_ICONID(18,1),
        BND_ICON_SEQ_SEQUENCER          = BND_ICONID(0,0),
        BND_ICON_SEQ_PREVIEW            = BND_ICONID(1,0),
        BND_ICON_SEQ_LUMA_WAVEFORM      = BND_ICONID(2,0),
        BND_ICON_SEQ_CHROMA_SCOPE       = BND_ICONID(3,0),
        BND_ICON_SEQ_HISTOGRAM          = BND_ICONID(4,0),
        BND_ICON_SEQ_SPLITVIEW          = BND_ICONID(5,0),
        BND_ICON_IMAGE_RGB              = BND_ICONID(9,0),
        BND_ICON_IMAGE_RGB_ALPHA        = BND_ICONID(10,0),
        BND_ICON_IMAGE_ALPHA            = BND_ICONID(11,0),
        BND_ICON_IMAGE_ZDEPTH           = BND_ICONID(12,0),
        BND_ICON_IMAGEFILE              = BND_ICONID(13,0);

    protected Blendish() {
        throw new UnsupportedOperationException();
    }

    // --- [ bndSetTheme ] ---

    /** {@code void bndSetTheme(BNDtheme theme)} */
    public static native void nbndSetTheme(long theme);

    /** {@code void bndSetTheme(BNDtheme theme)} */
    public static void bndSetTheme(BNDtheme theme) {
        nbndSetTheme(theme.address());
    }

    // --- [ bndGetTheme ] ---

    /** {@code BNDtheme const * bndGetTheme(void)} */
    public static native long nbndGetTheme();

    /** {@code BNDtheme const * bndGetTheme(void)} */
    @NativeType("BNDtheme const *")
    public static @Nullable BNDtheme bndGetTheme() {
        long __result = nbndGetTheme();
        return BNDtheme.createSafe(__result);
    }

    // --- [ bndSetIconImage ] ---

    /** {@code void bndSetIconImage(int image)} */
    public static native void bndSetIconImage(int image);

    // --- [ bndSetFont ] ---

    /** {@code void bndSetFont(int font)} */
    public static native void bndSetFont(int font);

    // --- [ bndLabel ] ---

    /** {@code void bndLabel(NVGcontext * ctx, float x, float y, float w, float h, int iconid, char const * label)} */
    public static native void nbndLabel(long ctx, float x, float y, float w, float h, int iconid, long label);

    /** {@code void bndLabel(NVGcontext * ctx, float x, float y, float w, float h, int iconid, char const * label)} */
    public static void bndLabel(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType("char const *") @Nullable ByteBuffer label) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        nbndLabel(ctx, x, y, w, h, iconid, memAddressSafe(label));
    }

    /** {@code void bndLabel(NVGcontext * ctx, float x, float y, float w, float h, int iconid, char const * label)} */
    public static void bndLabel(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType("char const *") @Nullable CharSequence label) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? NULL : stack.getPointerAddress();
            nbndLabel(ctx, x, y, w, h, iconid, labelEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bndToolButton ] ---

    /** {@code void bndToolButton(NVGcontext * ctx, float x, float y, float w, float h, int flags, BNDwidgetState state, int iconid, char const * label)} */
    public static native void nbndToolButton(long ctx, float x, float y, float w, float h, int flags, int state, int iconid, long label);

    /** {@code void bndToolButton(NVGcontext * ctx, float x, float y, float w, float h, int flags, BNDwidgetState state, int iconid, char const * label)} */
    public static void bndToolButton(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, int iconid, @NativeType("char const *") @Nullable ByteBuffer label) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        nbndToolButton(ctx, x, y, w, h, flags, state, iconid, memAddressSafe(label));
    }

    /** {@code void bndToolButton(NVGcontext * ctx, float x, float y, float w, float h, int flags, BNDwidgetState state, int iconid, char const * label)} */
    public static void bndToolButton(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, int iconid, @NativeType("char const *") @Nullable CharSequence label) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? NULL : stack.getPointerAddress();
            nbndToolButton(ctx, x, y, w, h, flags, state, iconid, labelEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bndRadioButton ] ---

    /** {@code void bndRadioButton(NVGcontext * ctx, float x, float y, float w, float h, int flags, BNDwidgetState state, int iconid, char const * label)} */
    public static native void nbndRadioButton(long ctx, float x, float y, float w, float h, int flags, int state, int iconid, long label);

    /** {@code void bndRadioButton(NVGcontext * ctx, float x, float y, float w, float h, int flags, BNDwidgetState state, int iconid, char const * label)} */
    public static void bndRadioButton(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, int iconid, @NativeType("char const *") @Nullable ByteBuffer label) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        nbndRadioButton(ctx, x, y, w, h, flags, state, iconid, memAddressSafe(label));
    }

    /** {@code void bndRadioButton(NVGcontext * ctx, float x, float y, float w, float h, int flags, BNDwidgetState state, int iconid, char const * label)} */
    public static void bndRadioButton(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, int iconid, @NativeType("char const *") @Nullable CharSequence label) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? NULL : stack.getPointerAddress();
            nbndRadioButton(ctx, x, y, w, h, flags, state, iconid, labelEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bndTextFieldTextPosition ] ---

    /** {@code int bndTextFieldTextPosition(NVGcontext * ctx, float x, float y, float w, float h, int iconid, char const * text, int px, int py)} */
    public static native int nbndTextFieldTextPosition(long ctx, float x, float y, float w, float h, int iconid, long text, int px, int py);

    /** {@code int bndTextFieldTextPosition(NVGcontext * ctx, float x, float y, float w, float h, int iconid, char const * text, int px, int py)} */
    public static int bndTextFieldTextPosition(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType("char const *") @Nullable ByteBuffer text, int px, int py) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(text);
        }
        return nbndTextFieldTextPosition(ctx, x, y, w, h, iconid, memAddressSafe(text), px, py);
    }

    /** {@code int bndTextFieldTextPosition(NVGcontext * ctx, float x, float y, float w, float h, int iconid, char const * text, int px, int py)} */
    public static int bndTextFieldTextPosition(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType("char const *") @Nullable CharSequence text, int px, int py) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(text, true);
            long textEncoded = text == null ? NULL : stack.getPointerAddress();
            return nbndTextFieldTextPosition(ctx, x, y, w, h, iconid, textEncoded, px, py);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bndTextField ] ---

    /** {@code void bndTextField(NVGcontext * ctx, float x, float y, float w, float h, int flags, BNDwidgetState state, int iconid, char const * text, int cbegin, int cend)} */
    public static native void nbndTextField(long ctx, float x, float y, float w, float h, int flags, int state, int iconid, long text, int cbegin, int cend);

    /** {@code void bndTextField(NVGcontext * ctx, float x, float y, float w, float h, int flags, BNDwidgetState state, int iconid, char const * text, int cbegin, int cend)} */
    public static void bndTextField(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, int iconid, @NativeType("char const *") @Nullable ByteBuffer text, int cbegin, int cend) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(text);
        }
        nbndTextField(ctx, x, y, w, h, flags, state, iconid, memAddressSafe(text), cbegin, cend);
    }

    /** {@code void bndTextField(NVGcontext * ctx, float x, float y, float w, float h, int flags, BNDwidgetState state, int iconid, char const * text, int cbegin, int cend)} */
    public static void bndTextField(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, int iconid, @NativeType("char const *") @Nullable CharSequence text, int cbegin, int cend) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(text, true);
            long textEncoded = text == null ? NULL : stack.getPointerAddress();
            nbndTextField(ctx, x, y, w, h, flags, state, iconid, textEncoded, cbegin, cend);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bndOptionButton ] ---

    /** {@code void bndOptionButton(NVGcontext * ctx, float x, float y, float w, float h, BNDwidgetState state, char const * label)} */
    public static native void nbndOptionButton(long ctx, float x, float y, float w, float h, int state, long label);

    /** {@code void bndOptionButton(NVGcontext * ctx, float x, float y, float w, float h, BNDwidgetState state, char const * label)} */
    public static void bndOptionButton(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType("BNDwidgetState") int state, @NativeType("char const *") @Nullable ByteBuffer label) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        nbndOptionButton(ctx, x, y, w, h, state, memAddressSafe(label));
    }

    /** {@code void bndOptionButton(NVGcontext * ctx, float x, float y, float w, float h, BNDwidgetState state, char const * label)} */
    public static void bndOptionButton(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType("BNDwidgetState") int state, @NativeType("char const *") @Nullable CharSequence label) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? NULL : stack.getPointerAddress();
            nbndOptionButton(ctx, x, y, w, h, state, labelEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bndChoiceButton ] ---

    /** {@code void bndChoiceButton(NVGcontext * ctx, float x, float y, float w, float h, int flags, BNDwidgetState state, int iconid, char const * label)} */
    public static native void nbndChoiceButton(long ctx, float x, float y, float w, float h, int flags, int state, int iconid, long label);

    /** {@code void bndChoiceButton(NVGcontext * ctx, float x, float y, float w, float h, int flags, BNDwidgetState state, int iconid, char const * label)} */
    public static void bndChoiceButton(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, int iconid, @NativeType("char const *") @Nullable ByteBuffer label) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        nbndChoiceButton(ctx, x, y, w, h, flags, state, iconid, memAddressSafe(label));
    }

    /** {@code void bndChoiceButton(NVGcontext * ctx, float x, float y, float w, float h, int flags, BNDwidgetState state, int iconid, char const * label)} */
    public static void bndChoiceButton(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, int iconid, @NativeType("char const *") @Nullable CharSequence label) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? NULL : stack.getPointerAddress();
            nbndChoiceButton(ctx, x, y, w, h, flags, state, iconid, labelEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bndColorButton ] ---

    /** {@code void bndColorButton(NVGcontext * ctx, float x, float y, float w, float h, int flags, NVGcolor color)} */
    public static native void nbndColorButton(long ctx, float x, float y, float w, float h, int flags, long color);

    /** {@code void bndColorButton(NVGcontext * ctx, float x, float y, float w, float h, int flags, NVGcolor color)} */
    public static void bndColorButton(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("NVGcolor") NVGColor color) {
        if (CHECKS) {
            check(ctx);
        }
        nbndColorButton(ctx, x, y, w, h, flags, color.address());
    }

    // --- [ bndNumberField ] ---

    /** {@code void bndNumberField(NVGcontext * ctx, float x, float y, float w, float h, int flags, BNDwidgetState state, char const * label, char const * value)} */
    public static native void nbndNumberField(long ctx, float x, float y, float w, float h, int flags, int state, long label, long value);

    /** {@code void bndNumberField(NVGcontext * ctx, float x, float y, float w, float h, int flags, BNDwidgetState state, char const * label, char const * value)} */
    public static void bndNumberField(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, @NativeType("char const *") @Nullable ByteBuffer label, @NativeType("char const *") @Nullable ByteBuffer value) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
            checkNT1Safe(value);
        }
        nbndNumberField(ctx, x, y, w, h, flags, state, memAddressSafe(label), memAddressSafe(value));
    }

    /** {@code void bndNumberField(NVGcontext * ctx, float x, float y, float w, float h, int flags, BNDwidgetState state, char const * label, char const * value)} */
    public static void bndNumberField(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, @NativeType("char const *") @Nullable CharSequence label, @NativeType("char const *") @Nullable CharSequence value) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(value, true);
            long valueEncoded = value == null ? NULL : stack.getPointerAddress();
            nbndNumberField(ctx, x, y, w, h, flags, state, labelEncoded, valueEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bndSlider ] ---

    /** {@code void bndSlider(NVGcontext * ctx, float x, float y, float w, float h, int flags, BNDwidgetState state, float progress, char const * label, char const * value)} */
    public static native void nbndSlider(long ctx, float x, float y, float w, float h, int flags, int state, float progress, long label, long value);

    /** {@code void bndSlider(NVGcontext * ctx, float x, float y, float w, float h, int flags, BNDwidgetState state, float progress, char const * label, char const * value)} */
    public static void bndSlider(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, float progress, @NativeType("char const *") @Nullable ByteBuffer label, @NativeType("char const *") @Nullable ByteBuffer value) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
            checkNT1Safe(value);
        }
        nbndSlider(ctx, x, y, w, h, flags, state, progress, memAddressSafe(label), memAddressSafe(value));
    }

    /** {@code void bndSlider(NVGcontext * ctx, float x, float y, float w, float h, int flags, BNDwidgetState state, float progress, char const * label, char const * value)} */
    public static void bndSlider(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, float progress, @NativeType("char const *") @Nullable CharSequence label, @NativeType("char const *") @Nullable CharSequence value) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(value, true);
            long valueEncoded = value == null ? NULL : stack.getPointerAddress();
            nbndSlider(ctx, x, y, w, h, flags, state, progress, labelEncoded, valueEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bndScrollBar ] ---

    /** {@code void bndScrollBar(NVGcontext * ctx, float x, float y, float w, float h, BNDwidgetState state, float offset, float size)} */
    public static native void nbndScrollBar(long ctx, float x, float y, float w, float h, int state, float offset, float size);

    /** {@code void bndScrollBar(NVGcontext * ctx, float x, float y, float w, float h, BNDwidgetState state, float offset, float size)} */
    public static void bndScrollBar(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType("BNDwidgetState") int state, float offset, float size) {
        if (CHECKS) {
            check(ctx);
        }
        nbndScrollBar(ctx, x, y, w, h, state, offset, size);
    }

    // --- [ bndMenuBackground ] ---

    /** {@code void bndMenuBackground(NVGcontext * ctx, float x, float y, float w, float h, int flags)} */
    public static native void nbndMenuBackground(long ctx, float x, float y, float w, float h, int flags);

    /** {@code void bndMenuBackground(NVGcontext * ctx, float x, float y, float w, float h, int flags)} */
    public static void bndMenuBackground(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags) {
        if (CHECKS) {
            check(ctx);
        }
        nbndMenuBackground(ctx, x, y, w, h, flags);
    }

    // --- [ bndMenuLabel ] ---

    /** {@code void bndMenuLabel(NVGcontext * ctx, float x, float y, float w, float h, int iconid, char const * label)} */
    public static native void nbndMenuLabel(long ctx, float x, float y, float w, float h, int iconid, long label);

    /** {@code void bndMenuLabel(NVGcontext * ctx, float x, float y, float w, float h, int iconid, char const * label)} */
    public static void bndMenuLabel(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType("char const *") @Nullable ByteBuffer label) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        nbndMenuLabel(ctx, x, y, w, h, iconid, memAddressSafe(label));
    }

    /** {@code void bndMenuLabel(NVGcontext * ctx, float x, float y, float w, float h, int iconid, char const * label)} */
    public static void bndMenuLabel(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType("char const *") @Nullable CharSequence label) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? NULL : stack.getPointerAddress();
            nbndMenuLabel(ctx, x, y, w, h, iconid, labelEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bndMenuItem ] ---

    /** {@code void bndMenuItem(NVGcontext * ctx, float x, float y, float w, float h, BNDwidgetState state, int iconid, char const * label)} */
    public static native void nbndMenuItem(long ctx, float x, float y, float w, float h, int state, int iconid, long label);

    /** {@code void bndMenuItem(NVGcontext * ctx, float x, float y, float w, float h, BNDwidgetState state, int iconid, char const * label)} */
    public static void bndMenuItem(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType("BNDwidgetState") int state, int iconid, @NativeType("char const *") @Nullable ByteBuffer label) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        nbndMenuItem(ctx, x, y, w, h, state, iconid, memAddressSafe(label));
    }

    /** {@code void bndMenuItem(NVGcontext * ctx, float x, float y, float w, float h, BNDwidgetState state, int iconid, char const * label)} */
    public static void bndMenuItem(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType("BNDwidgetState") int state, int iconid, @NativeType("char const *") @Nullable CharSequence label) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? NULL : stack.getPointerAddress();
            nbndMenuItem(ctx, x, y, w, h, state, iconid, labelEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bndTooltipBackground ] ---

    /** {@code void bndTooltipBackground(NVGcontext * ctx, float x, float y, float w, float h)} */
    public static native void nbndTooltipBackground(long ctx, float x, float y, float w, float h);

    /** {@code void bndTooltipBackground(NVGcontext * ctx, float x, float y, float w, float h)} */
    public static void bndTooltipBackground(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (CHECKS) {
            check(ctx);
        }
        nbndTooltipBackground(ctx, x, y, w, h);
    }

    // --- [ bndNodePort ] ---

    /** {@code void bndNodePort(NVGcontext * ctx, float x, float y, BNDwidgetState state, NVGcolor color)} */
    public static native void nbndNodePort(long ctx, float x, float y, int state, long color);

    /** {@code void bndNodePort(NVGcontext * ctx, float x, float y, BNDwidgetState state, NVGcolor color)} */
    public static void bndNodePort(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("BNDwidgetState") int state, @NativeType("NVGcolor") NVGColor color) {
        if (CHECKS) {
            check(ctx);
        }
        nbndNodePort(ctx, x, y, state, color.address());
    }

    // --- [ bndNodeWire ] ---

    /** {@code void bndNodeWire(NVGcontext * ctx, float x0, float y0, float x1, float y1, BNDwidgetState state0, BNDwidgetState state1)} */
    public static native void nbndNodeWire(long ctx, float x0, float y0, float x1, float y1, int state0, int state1);

    /** {@code void bndNodeWire(NVGcontext * ctx, float x0, float y0, float x1, float y1, BNDwidgetState state0, BNDwidgetState state1)} */
    public static void bndNodeWire(@NativeType("NVGcontext *") long ctx, float x0, float y0, float x1, float y1, @NativeType("BNDwidgetState") int state0, @NativeType("BNDwidgetState") int state1) {
        if (CHECKS) {
            check(ctx);
        }
        nbndNodeWire(ctx, x0, y0, x1, y1, state0, state1);
    }

    // --- [ bndColoredNodeWire ] ---

    /** {@code void bndColoredNodeWire(NVGcontext * ctx, float x0, float y0, float x1, float y1, NVGcolor color0, NVGcolor color1)} */
    public static native void nbndColoredNodeWire(long ctx, float x0, float y0, float x1, float y1, long color0, long color1);

    /** {@code void bndColoredNodeWire(NVGcontext * ctx, float x0, float y0, float x1, float y1, NVGcolor color0, NVGcolor color1)} */
    public static void bndColoredNodeWire(@NativeType("NVGcontext *") long ctx, float x0, float y0, float x1, float y1, @NativeType("NVGcolor") NVGColor color0, @NativeType("NVGcolor") NVGColor color1) {
        if (CHECKS) {
            check(ctx);
        }
        nbndColoredNodeWire(ctx, x0, y0, x1, y1, color0.address(), color1.address());
    }

    // --- [ bndNodeBackground ] ---

    /** {@code void bndNodeBackground(NVGcontext * ctx, float x, float y, float w, float h, BNDwidgetState state, int iconid, char const * label, NVGcolor titleColor)} */
    public static native void nbndNodeBackground(long ctx, float x, float y, float w, float h, int state, int iconid, long label, long titleColor);

    /** {@code void bndNodeBackground(NVGcontext * ctx, float x, float y, float w, float h, BNDwidgetState state, int iconid, char const * label, NVGcolor titleColor)} */
    public static void bndNodeBackground(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType("BNDwidgetState") int state, int iconid, @NativeType("char const *") @Nullable ByteBuffer label, @NativeType("NVGcolor") NVGColor titleColor) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        nbndNodeBackground(ctx, x, y, w, h, state, iconid, memAddressSafe(label), titleColor.address());
    }

    /** {@code void bndNodeBackground(NVGcontext * ctx, float x, float y, float w, float h, BNDwidgetState state, int iconid, char const * label, NVGcolor titleColor)} */
    public static void bndNodeBackground(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType("BNDwidgetState") int state, int iconid, @NativeType("char const *") @Nullable CharSequence label, @NativeType("NVGcolor") NVGColor titleColor) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? NULL : stack.getPointerAddress();
            nbndNodeBackground(ctx, x, y, w, h, state, iconid, labelEncoded, titleColor.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bndSplitterWidgets ] ---

    /** {@code void bndSplitterWidgets(NVGcontext * ctx, float x, float y, float w, float h)} */
    public static native void nbndSplitterWidgets(long ctx, float x, float y, float w, float h);

    /** {@code void bndSplitterWidgets(NVGcontext * ctx, float x, float y, float w, float h)} */
    public static void bndSplitterWidgets(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (CHECKS) {
            check(ctx);
        }
        nbndSplitterWidgets(ctx, x, y, w, h);
    }

    // --- [ bndJoinAreaOverlay ] ---

    /** {@code void bndJoinAreaOverlay(NVGcontext * ctx, float x, float y, float w, float h, int vertical, int mirror)} */
    public static native void nbndJoinAreaOverlay(long ctx, float x, float y, float w, float h, int vertical, int mirror);

    /** {@code void bndJoinAreaOverlay(NVGcontext * ctx, float x, float y, float w, float h, int vertical, int mirror)} */
    public static void bndJoinAreaOverlay(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType("int") boolean vertical, @NativeType("int") boolean mirror) {
        if (CHECKS) {
            check(ctx);
        }
        nbndJoinAreaOverlay(ctx, x, y, w, h, vertical ? 1 : 0, mirror ? 1 : 0);
    }

    // --- [ bndLabelWidth ] ---

    /** {@code float bndLabelWidth(NVGcontext * ctx, int iconid, char const * label)} */
    public static native float nbndLabelWidth(long ctx, int iconid, long label);

    /** {@code float bndLabelWidth(NVGcontext * ctx, int iconid, char const * label)} */
    public static float bndLabelWidth(@NativeType("NVGcontext *") long ctx, int iconid, @NativeType("char const *") @Nullable ByteBuffer label) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        return nbndLabelWidth(ctx, iconid, memAddressSafe(label));
    }

    /** {@code float bndLabelWidth(NVGcontext * ctx, int iconid, char const * label)} */
    public static float bndLabelWidth(@NativeType("NVGcontext *") long ctx, int iconid, @NativeType("char const *") @Nullable CharSequence label) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? NULL : stack.getPointerAddress();
            return nbndLabelWidth(ctx, iconid, labelEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bndLabelHeight ] ---

    /** {@code float bndLabelHeight(NVGcontext * ctx, int iconid, char const * label, float width)} */
    public static native float nbndLabelHeight(long ctx, int iconid, long label, float width);

    /** {@code float bndLabelHeight(NVGcontext * ctx, int iconid, char const * label, float width)} */
    public static float bndLabelHeight(@NativeType("NVGcontext *") long ctx, int iconid, @NativeType("char const *") @Nullable ByteBuffer label, float width) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        return nbndLabelHeight(ctx, iconid, memAddressSafe(label), width);
    }

    /** {@code float bndLabelHeight(NVGcontext * ctx, int iconid, char const * label, float width)} */
    public static float bndLabelHeight(@NativeType("NVGcontext *") long ctx, int iconid, @NativeType("char const *") @Nullable CharSequence label, float width) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? NULL : stack.getPointerAddress();
            return nbndLabelHeight(ctx, iconid, labelEncoded, width);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bndTransparent ] ---

    /** {@code NVGcolor bndTransparent(NVGcolor color)} */
    public static native void nbndTransparent(long color, long __result);

    /** {@code NVGcolor bndTransparent(NVGcolor color)} */
    @NativeType("NVGcolor")
    public static NVGColor bndTransparent(@NativeType("NVGcolor") NVGColor color, @NativeType("NVGcolor") NVGColor __result) {
        nbndTransparent(color.address(), __result.address());
        return __result;
    }

    // --- [ bndOffsetColor ] ---

    /** {@code NVGcolor bndOffsetColor(NVGcolor color, int delta)} */
    public static native void nbndOffsetColor(long color, int delta, long __result);

    /** {@code NVGcolor bndOffsetColor(NVGcolor color, int delta)} */
    @NativeType("NVGcolor")
    public static NVGColor bndOffsetColor(@NativeType("NVGcolor") NVGColor color, int delta, @NativeType("NVGcolor") NVGColor __result) {
        nbndOffsetColor(color.address(), delta, __result.address());
        return __result;
    }

    // --- [ bndSelectCorners ] ---

    /** {@code void bndSelectCorners(float * radiuses, float r, int flags)} */
    public static native void nbndSelectCorners(long radiuses, float r, int flags);

    /** {@code void bndSelectCorners(float * radiuses, float r, int flags)} */
    public static void bndSelectCorners(@NativeType("float *") FloatBuffer radiuses, float r, int flags) {
        if (CHECKS) {
            check(radiuses, 4);
        }
        nbndSelectCorners(memAddress(radiuses), r, flags);
    }

    // --- [ bndInnerColors ] ---

    /** {@code void bndInnerColors(NVGcolor * shade_top, NVGcolor * shade_down, BNDwidgetTheme const * theme, BNDwidgetState state, int flipActive)} */
    public static native void nbndInnerColors(long shade_top, long shade_down, long theme, int state, int flipActive);

    /** {@code void bndInnerColors(NVGcolor * shade_top, NVGcolor * shade_down, BNDwidgetTheme const * theme, BNDwidgetState state, int flipActive)} */
    public static void bndInnerColors(@NativeType("NVGcolor *") NVGColor shade_top, @NativeType("NVGcolor *") NVGColor shade_down, @NativeType("BNDwidgetTheme const *") BNDwidgetTheme theme, @NativeType("BNDwidgetState") int state, @NativeType("int") boolean flipActive) {
        nbndInnerColors(shade_top.address(), shade_down.address(), theme.address(), state, flipActive ? 1 : 0);
    }

    // --- [ bndTextColor ] ---

    /** {@code NVGcolor bndTextColor(BNDwidgetTheme const * theme, BNDwidgetState state)} */
    public static native void nbndTextColor(long theme, int state, long __result);

    /** {@code NVGcolor bndTextColor(BNDwidgetTheme const * theme, BNDwidgetState state)} */
    @NativeType("NVGcolor")
    public static NVGColor bndTextColor(@NativeType("BNDwidgetTheme const *") BNDwidgetTheme theme, @NativeType("BNDwidgetState") int state, @NativeType("NVGcolor") NVGColor __result) {
        nbndTextColor(theme.address(), state, __result.address());
        return __result;
    }

    // --- [ bndScrollHandleRect ] ---

    /** {@code void bndScrollHandleRect(float * x, float * y, float * w, float * h, float offset, float size)} */
    public static native void nbndScrollHandleRect(long x, long y, long w, long h, float offset, float size);

    /** {@code void bndScrollHandleRect(float * x, float * y, float * w, float * h, float offset, float size)} */
    public static void bndScrollHandleRect(@NativeType("float *") FloatBuffer x, @NativeType("float *") FloatBuffer y, @NativeType("float *") FloatBuffer w, @NativeType("float *") FloatBuffer h, float offset, float size) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(w, 1);
            check(h, 1);
        }
        nbndScrollHandleRect(memAddress(x), memAddress(y), memAddress(w), memAddress(h), offset, size);
    }

    // --- [ bndRoundedBox ] ---

    /** {@code void bndRoundedBox(NVGcontext * ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3)} */
    public static native void nbndRoundedBox(long ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3);

    /** {@code void bndRoundedBox(NVGcontext * ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3)} */
    public static void bndRoundedBox(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3) {
        if (CHECKS) {
            check(ctx);
        }
        nbndRoundedBox(ctx, x, y, w, h, cr0, cr1, cr2, cr3);
    }

    // --- [ bndBackground ] ---

    /** {@code void bndBackground(NVGcontext * ctx, float x, float y, float w, float h)} */
    public static native void nbndBackground(long ctx, float x, float y, float w, float h);

    /** {@code void bndBackground(NVGcontext * ctx, float x, float y, float w, float h)} */
    public static void bndBackground(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (CHECKS) {
            check(ctx);
        }
        nbndBackground(ctx, x, y, w, h);
    }

    // --- [ bndBevel ] ---

    /** {@code void bndBevel(NVGcontext * ctx, float x, float y, float w, float h)} */
    public static native void nbndBevel(long ctx, float x, float y, float w, float h);

    /** {@code void bndBevel(NVGcontext * ctx, float x, float y, float w, float h)} */
    public static void bndBevel(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (CHECKS) {
            check(ctx);
        }
        nbndBevel(ctx, x, y, w, h);
    }

    // --- [ bndBevelInset ] ---

    /** {@code void bndBevelInset(NVGcontext * ctx, float x, float y, float w, float h, float cr2, float cr3)} */
    public static native void nbndBevelInset(long ctx, float x, float y, float w, float h, float cr2, float cr3);

    /** {@code void bndBevelInset(NVGcontext * ctx, float x, float y, float w, float h, float cr2, float cr3)} */
    public static void bndBevelInset(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, float cr2, float cr3) {
        if (CHECKS) {
            check(ctx);
        }
        nbndBevelInset(ctx, x, y, w, h, cr2, cr3);
    }

    // --- [ bndIcon ] ---

    /** {@code void bndIcon(NVGcontext * ctx, float x, float y, int iconid)} */
    public static native void nbndIcon(long ctx, float x, float y, int iconid);

    /** {@code void bndIcon(NVGcontext * ctx, float x, float y, int iconid)} */
    public static void bndIcon(@NativeType("NVGcontext *") long ctx, float x, float y, int iconid) {
        if (CHECKS) {
            check(ctx);
        }
        nbndIcon(ctx, x, y, iconid);
    }

    // --- [ bndDropShadow ] ---

    /** {@code void bndDropShadow(NVGcontext * ctx, float x, float y, float w, float h, float r, float feather, float alpha)} */
    public static native void nbndDropShadow(long ctx, float x, float y, float w, float h, float r, float feather, float alpha);

    /** {@code void bndDropShadow(NVGcontext * ctx, float x, float y, float w, float h, float r, float feather, float alpha)} */
    public static void bndDropShadow(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, float r, float feather, float alpha) {
        if (CHECKS) {
            check(ctx);
        }
        nbndDropShadow(ctx, x, y, w, h, r, feather, alpha);
    }

    // --- [ bndInnerBox ] ---

    /** {@code void bndInnerBox(NVGcontext * ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3, NVGcolor shade_top, NVGcolor shade_down)} */
    public static native void nbndInnerBox(long ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3, long shade_top, long shade_down);

    /** {@code void bndInnerBox(NVGcontext * ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3, NVGcolor shade_top, NVGcolor shade_down)} */
    public static void bndInnerBox(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3, @NativeType("NVGcolor") NVGColor shade_top, @NativeType("NVGcolor") NVGColor shade_down) {
        if (CHECKS) {
            check(ctx);
        }
        nbndInnerBox(ctx, x, y, w, h, cr0, cr1, cr2, cr3, shade_top.address(), shade_down.address());
    }

    // --- [ bndOutlineBox ] ---

    /** {@code void bndOutlineBox(NVGcontext * ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3, NVGcolor color)} */
    public static native void nbndOutlineBox(long ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3, long color);

    /** {@code void bndOutlineBox(NVGcontext * ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3, NVGcolor color)} */
    public static void bndOutlineBox(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3, @NativeType("NVGcolor") NVGColor color) {
        if (CHECKS) {
            check(ctx);
        }
        nbndOutlineBox(ctx, x, y, w, h, cr0, cr1, cr2, cr3, color.address());
    }

    // --- [ bndIconLabelValue ] ---

    /** {@code void bndIconLabelValue(NVGcontext * ctx, float x, float y, float w, float h, int iconid, NVGcolor color, int align, float fontsize, char const * label, char const * value)} */
    public static native void nbndIconLabelValue(long ctx, float x, float y, float w, float h, int iconid, long color, int align, float fontsize, long label, long value);

    /** {@code void bndIconLabelValue(NVGcontext * ctx, float x, float y, float w, float h, int iconid, NVGcolor color, int align, float fontsize, char const * label, char const * value)} */
    public static void bndIconLabelValue(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType("NVGcolor") NVGColor color, int align, float fontsize, @NativeType("char const *") @Nullable ByteBuffer label, @NativeType("char const *") @Nullable ByteBuffer value) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
            checkNT1Safe(value);
        }
        nbndIconLabelValue(ctx, x, y, w, h, iconid, color.address(), align, fontsize, memAddressSafe(label), memAddressSafe(value));
    }

    /** {@code void bndIconLabelValue(NVGcontext * ctx, float x, float y, float w, float h, int iconid, NVGcolor color, int align, float fontsize, char const * label, char const * value)} */
    public static void bndIconLabelValue(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType("NVGcolor") NVGColor color, int align, float fontsize, @NativeType("char const *") @Nullable CharSequence label, @NativeType("char const *") @Nullable CharSequence value) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? NULL : stack.getPointerAddress();
            stack.nUTF8Safe(value, true);
            long valueEncoded = value == null ? NULL : stack.getPointerAddress();
            nbndIconLabelValue(ctx, x, y, w, h, iconid, color.address(), align, fontsize, labelEncoded, valueEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bndNodeIconLabel ] ---

    /** {@code void bndNodeIconLabel(NVGcontext * ctx, float x, float y, float w, float h, int iconid, NVGcolor color, NVGcolor shadowColor, int align, float fontsize, char const * label)} */
    public static native void nbndNodeIconLabel(long ctx, float x, float y, float w, float h, int iconid, long color, long shadowColor, int align, float fontsize, long label);

    /** {@code void bndNodeIconLabel(NVGcontext * ctx, float x, float y, float w, float h, int iconid, NVGcolor color, NVGcolor shadowColor, int align, float fontsize, char const * label)} */
    public static void bndNodeIconLabel(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType("NVGcolor") NVGColor color, @NativeType("NVGcolor") NVGColor shadowColor, int align, float fontsize, @NativeType("char const *") @Nullable ByteBuffer label) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        nbndNodeIconLabel(ctx, x, y, w, h, iconid, color.address(), shadowColor.address(), align, fontsize, memAddressSafe(label));
    }

    /** {@code void bndNodeIconLabel(NVGcontext * ctx, float x, float y, float w, float h, int iconid, NVGcolor color, NVGcolor shadowColor, int align, float fontsize, char const * label)} */
    public static void bndNodeIconLabel(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType("NVGcolor") NVGColor color, @NativeType("NVGcolor") NVGColor shadowColor, int align, float fontsize, @NativeType("char const *") @Nullable CharSequence label) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? NULL : stack.getPointerAddress();
            nbndNodeIconLabel(ctx, x, y, w, h, iconid, color.address(), shadowColor.address(), align, fontsize, labelEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bndIconLabelTextPosition ] ---

    /** {@code int bndIconLabelTextPosition(NVGcontext * ctx, float x, float y, float w, float h, int iconid, float fontsize, char const * label, int px, int py)} */
    public static native int nbndIconLabelTextPosition(long ctx, float x, float y, float w, float h, int iconid, float fontsize, long label, int px, int py);

    /** {@code int bndIconLabelTextPosition(NVGcontext * ctx, float x, float y, float w, float h, int iconid, float fontsize, char const * label, int px, int py)} */
    public static int bndIconLabelTextPosition(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, float fontsize, @NativeType("char const *") @Nullable ByteBuffer label, int px, int py) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        return nbndIconLabelTextPosition(ctx, x, y, w, h, iconid, fontsize, memAddressSafe(label), px, py);
    }

    /** {@code int bndIconLabelTextPosition(NVGcontext * ctx, float x, float y, float w, float h, int iconid, float fontsize, char const * label, int px, int py)} */
    public static int bndIconLabelTextPosition(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, float fontsize, @NativeType("char const *") @Nullable CharSequence label, int px, int py) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? NULL : stack.getPointerAddress();
            return nbndIconLabelTextPosition(ctx, x, y, w, h, iconid, fontsize, labelEncoded, px, py);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bndIconLabelCaret ] ---

    /** {@code void bndIconLabelCaret(NVGcontext * ctx, float x, float y, float w, float h, int iconid, NVGcolor color, float fontsize, char const * label, NVGcolor caretcolor, int cbegin, int cend)} */
    public static native void nbndIconLabelCaret(long ctx, float x, float y, float w, float h, int iconid, long color, float fontsize, long label, long caretcolor, int cbegin, int cend);

    /** {@code void bndIconLabelCaret(NVGcontext * ctx, float x, float y, float w, float h, int iconid, NVGcolor color, float fontsize, char const * label, NVGcolor caretcolor, int cbegin, int cend)} */
    public static void bndIconLabelCaret(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType("NVGcolor") NVGColor color, float fontsize, @NativeType("char const *") @Nullable ByteBuffer label, @NativeType("NVGcolor") NVGColor caretcolor, int cbegin, int cend) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        nbndIconLabelCaret(ctx, x, y, w, h, iconid, color.address(), fontsize, memAddressSafe(label), caretcolor.address(), cbegin, cend);
    }

    /** {@code void bndIconLabelCaret(NVGcontext * ctx, float x, float y, float w, float h, int iconid, NVGcolor color, float fontsize, char const * label, NVGcolor caretcolor, int cbegin, int cend)} */
    public static void bndIconLabelCaret(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType("NVGcolor") NVGColor color, float fontsize, @NativeType("char const *") @Nullable CharSequence label, @NativeType("NVGcolor") NVGColor caretcolor, int cbegin, int cend) {
        if (CHECKS) {
            check(ctx);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? NULL : stack.getPointerAddress();
            nbndIconLabelCaret(ctx, x, y, w, h, iconid, color.address(), fontsize, labelEncoded, caretcolor.address(), cbegin, cend);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bndCheck ] ---

    /** {@code void bndCheck(NVGcontext * ctx, float ox, float oy, NVGcolor color)} */
    public static native void nbndCheck(long ctx, float ox, float oy, long color);

    /** {@code void bndCheck(NVGcontext * ctx, float ox, float oy, NVGcolor color)} */
    public static void bndCheck(@NativeType("NVGcontext *") long ctx, float ox, float oy, @NativeType("NVGcolor") NVGColor color) {
        if (CHECKS) {
            check(ctx);
        }
        nbndCheck(ctx, ox, oy, color.address());
    }

    // --- [ bndArrow ] ---

    /** {@code void bndArrow(NVGcontext * ctx, float x, float y, float s, NVGcolor color)} */
    public static native void nbndArrow(long ctx, float x, float y, float s, long color);

    /** {@code void bndArrow(NVGcontext * ctx, float x, float y, float s, NVGcolor color)} */
    public static void bndArrow(@NativeType("NVGcontext *") long ctx, float x, float y, float s, @NativeType("NVGcolor") NVGColor color) {
        if (CHECKS) {
            check(ctx);
        }
        nbndArrow(ctx, x, y, s, color.address());
    }

    // --- [ bndUpDownArrow ] ---

    /** {@code void bndUpDownArrow(NVGcontext * ctx, float x, float y, float s, NVGcolor color)} */
    public static native void nbndUpDownArrow(long ctx, float x, float y, float s, long color);

    /** {@code void bndUpDownArrow(NVGcontext * ctx, float x, float y, float s, NVGcolor color)} */
    public static void bndUpDownArrow(@NativeType("NVGcontext *") long ctx, float x, float y, float s, @NativeType("NVGcolor") NVGColor color) {
        if (CHECKS) {
            check(ctx);
        }
        nbndUpDownArrow(ctx, x, y, s, color.address());
    }

    // --- [ bndNodeArrowDown ] ---

    /** {@code void bndNodeArrowDown(NVGcontext * ctx, float x, float y, float s, NVGcolor color)} */
    public static native void nbndNodeArrowDown(long ctx, float x, float y, float s, long color);

    /** {@code void bndNodeArrowDown(NVGcontext * ctx, float x, float y, float s, NVGcolor color)} */
    public static void bndNodeArrowDown(@NativeType("NVGcontext *") long ctx, float x, float y, float s, @NativeType("NVGcolor") NVGColor color) {
        if (CHECKS) {
            check(ctx);
        }
        nbndNodeArrowDown(ctx, x, y, s, color.address());
    }

    // --- [ bndNodeWireColor ] ---

    /** {@code NVGcolor bndNodeWireColor(BNDnodeTheme const * theme, BNDwidgetState state)} */
    public static native void nbndNodeWireColor(long theme, int state, long __result);

    /** {@code NVGcolor bndNodeWireColor(BNDnodeTheme const * theme, BNDwidgetState state)} */
    @NativeType("NVGcolor")
    public static NVGColor bndNodeWireColor(@NativeType("BNDnodeTheme const *") BNDnodeTheme theme, @NativeType("BNDwidgetState") int state, @NativeType("NVGcolor") NVGColor __result) {
        nbndNodeWireColor(theme.address(), state, __result.address());
        return __result;
    }

    /** {@code void bndSelectCorners(float * radiuses, float r, int flags)} */
    public static native void nbndSelectCorners(float[] radiuses, float r, int flags);

    /** {@code void bndSelectCorners(float * radiuses, float r, int flags)} */
    public static void bndSelectCorners(@NativeType("float *") float[] radiuses, float r, int flags) {
        if (CHECKS) {
            check(radiuses, 4);
        }
        nbndSelectCorners(radiuses, r, flags);
    }

    /** {@code void bndScrollHandleRect(float * x, float * y, float * w, float * h, float offset, float size)} */
    public static native void nbndScrollHandleRect(float[] x, float[] y, float[] w, float[] h, float offset, float size);

    /** {@code void bndScrollHandleRect(float * x, float * y, float * w, float * h, float offset, float size)} */
    public static void bndScrollHandleRect(@NativeType("float *") float[] x, @NativeType("float *") float[] y, @NativeType("float *") float[] w, @NativeType("float *") float[] h, float offset, float size) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
            check(w, 1);
            check(h, 1);
        }
        nbndScrollHandleRect(x, y, w, h, offset, size);
    }

    public static int BND_ICONID(int x, int y) {
        return x | (y << 8);
    }

}