/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Blendish is a small collection of drawing functions for NanoVG, designed to replicate the look of the Blender 2.5+ User Interface. You can use these
 * functions to theme your UI library. Several metric constants for faithful reproduction are also included.
 * 
 * <p>Blendish supports the original Blender icon sheet; As the licensing of Blender's icons is unclear, they are not included in Blendish'es repository, but
 * an SVG template, "icons_template.svg" is provided, which you can use to build your own icon sheet.</p>
 * 
 * <p>To use icons, you must first load the icon sheet using one of the {@code nvgCreateImage*()} functions and then pass the image handle to
 * {@link #bndSetIconImage SetIconImage}; otherwise, no icons will be drawn. See {@code bndSetIconImage()} for more information.</p>
 * 
 * <p>Blendish will not render text until a suitable UI font has been passed to {@link #bndSetFont SetFont} has been called. See {@code bndSetFont()} for more information.</p>
 * 
 * <h3>Drawbacks</h3>
 * 
 * <p>There is no support for varying dpi resolutions yet. The library is hardcoded to the equivalent of 72 dpi in the Blender system settings.</p>
 * 
 * <p>Support for label truncation is missing. Text rendering breaks when widgets are too short to contain their labels.</p>
 */
public class Blendish {

    static { LibNanoVG.initialize(); }

    /** Alpha of disabled widget groups. Can be used in conjunction with {@link NanoVG#nvgGlobalAlpha GlobalAlpha}. */
    public static final float BND_DISABLED_ALPHA = 0.5f;

    /**
     * How text on a control is aligned. ({@code BNDtextAlignment})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #BND_LEFT LEFT}</li>
     * <li>{@link #BND_CENTER CENTER}</li>
     * </ul>
     */
    public static final int
        BND_LEFT   = 0,
        BND_CENTER = 1;

    /**
     * States altering the styling of a widget. ({@code BNDwidgetState})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #BND_DEFAULT DEFAULT} - not interacting</li>
     * <li>{@link #BND_HOVER HOVER} - the mouse is hovering over the control</li>
     * <li>{@link #BND_ACTIVE ACTIVE} - the widget is activated (pressed) or in an active state (toggled)</li>
     * </ul>
     */
    public static final int
        BND_DEFAULT = 0,
        BND_HOVER   = 1,
        BND_ACTIVE  = 2;

    /**
     * Flags indicating which corners are sharp (for grouping widgets). ({@code BNDcornerFlags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #BND_CORNER_NONE CORNER_NONE} - all corners are round</li>
     * <li>{@link #BND_CORNER_TOP_LEFT CORNER_TOP_LEFT} - sharp top left corner</li>
     * <li>{@link #BND_CORNER_TOP_RIGHT CORNER_TOP_RIGHT} - sharp top right corner</li>
     * <li>{@link #BND_CORNER_DOWN_RIGHT CORNER_DOWN_RIGHT} - sharp bottom right corner</li>
     * <li>{@link #BND_CORNER_DOWN_LEFT CORNER_DOWN_LEFT} - sharp bottom left corner</li>
     * <li>{@link #BND_CORNER_ALL CORNER_ALL} - all corners are sharp; you can invert a set of flags using ^= BND_CORNER_ALL</li>
     * <li>{@link #BND_CORNER_TOP CORNER_TOP} - top border is sharp</li>
     * <li>{@link #BND_CORNER_DOWN CORNER_DOWN} - bottom border is sharp</li>
     * <li>{@link #BND_CORNER_LEFT CORNER_LEFT} - left border is sharp</li>
     * <li>{@link #BND_CORNER_RIGHT CORNER_RIGHT} - right border is sharp</li>
     * </ul>
     */
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

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT} - default widget height</li>
     * <li>{@link #BND_TOOL_WIDTH TOOL_WIDTH} - default toolbutton width (if icon only)</li>
     * <li>{@link #BND_NODE_PORT_RADIUS NODE_PORT_RADIUS} - default radius of node ports</li>
     * <li>{@link #BND_NODE_MARGIN_TOP NODE_MARGIN_TOP} - top margin of node content</li>
     * <li>{@link #BND_NODE_MARGIN_DOWN NODE_MARGIN_DOWN} - bottom margin of node content</li>
     * <li>{@link #BND_NODE_MARGIN_SIDE NODE_MARGIN_SIDE} - left and right margin of node content</li>
     * <li>{@link #BND_NODE_TITLE_HEIGHT NODE_TITLE_HEIGHT} - height of node title bar</li>
     * <li>{@link #BND_NODE_ARROW_AREA_WIDTH NODE_ARROW_AREA_WIDTH} - width of node title arrow click area</li>
     * <li>{@link #BND_SPLITTER_AREA_SIZE SPLITTER_AREA_SIZE} - size of splitter corner click area</li>
     * <li>{@link #BND_SCROLLBAR_WIDTH SCROLLBAR_WIDTH} - width of vertical scrollbar</li>
     * <li>{@link #BND_SCROLLBAR_HEIGHT SCROLLBAR_HEIGHT} - height of horizontal scrollbar</li>
     * <li>{@link #BND_VSPACING VSPACING} - default vertical spacing</li>
     * <li>{@link #BND_VSPACING_GROUP VSPACING_GROUP} - default vertical spacing between groups</li>
     * <li>{@link #BND_HSPACING HSPACING} - default horizontal spacing</li>
     * </ul>
     */
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

    /**
     * {@code BNDicon}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #BND_ICON_NONE ICON_NONE}</li>
     * <li>{@link #BND_ICON_QUESTION ICON_QUESTION}</li>
     * <li>{@link #BND_ICON_ERROR ICON_ERROR}</li>
     * <li>{@link #BND_ICON_CANCEL ICON_CANCEL}</li>
     * <li>{@link #BND_ICON_TRIA_RIGHT ICON_TRIA_RIGHT}</li>
     * <li>{@link #BND_ICON_TRIA_DOWN ICON_TRIA_DOWN}</li>
     * <li>{@link #BND_ICON_TRIA_LEFT ICON_TRIA_LEFT}</li>
     * <li>{@link #BND_ICON_TRIA_UP ICON_TRIA_UP}</li>
     * <li>{@link #BND_ICON_ARROW_LEFTRIGHT ICON_ARROW_LEFTRIGHT}</li>
     * <li>{@link #BND_ICON_PLUS ICON_PLUS}</li>
     * <li>{@link #BND_ICON_DISCLOSURE_TRI_DOWN ICON_DISCLOSURE_TRI_DOWN}</li>
     * <li>{@link #BND_ICON_DISCLOSURE_TRI_RIGHT ICON_DISCLOSURE_TRI_RIGHT}</li>
     * <li>{@link #BND_ICON_RADIOBUT_OFF ICON_RADIOBUT_OFF}</li>
     * <li>{@link #BND_ICON_RADIOBUT_ON ICON_RADIOBUT_ON}</li>
     * <li>{@link #BND_ICON_MENU_PANEL ICON_MENU_PANEL}</li>
     * <li>{@link #BND_ICON_BLENDER ICON_BLENDER}</li>
     * <li>{@link #BND_ICON_GRIP ICON_GRIP}</li>
     * <li>{@link #BND_ICON_DOT ICON_DOT}</li>
     * <li>{@link #BND_ICON_COLLAPSEMENU ICON_COLLAPSEMENU}</li>
     * <li>{@link #BND_ICON_X ICON_X}</li>
     * <li>{@link #BND_ICON_GO_LEFT ICON_GO_LEFT}</li>
     * <li>{@link #BND_ICON_PLUG ICON_PLUG}</li>
     * <li>{@link #BND_ICON_UI ICON_UI}</li>
     * <li>{@link #BND_ICON_NODE ICON_NODE}</li>
     * <li>{@link #BND_ICON_NODE_SEL ICON_NODE_SEL}</li>
     * <li>{@link #BND_ICON_FULLSCREEN ICON_FULLSCREEN}</li>
     * <li>{@link #BND_ICON_SPLITSCREEN ICON_SPLITSCREEN}</li>
     * <li>{@link #BND_ICON_RIGHTARROW_THIN ICON_RIGHTARROW_THIN}</li>
     * <li>{@link #BND_ICON_BORDERMOVE ICON_BORDERMOVE}</li>
     * <li>{@link #BND_ICON_VIEWZOOM ICON_VIEWZOOM}</li>
     * <li>{@link #BND_ICON_ZOOMIN ICON_ZOOMIN}</li>
     * <li>{@link #BND_ICON_ZOOMOUT ICON_ZOOMOUT}</li>
     * <li>{@link #BND_ICON_PANEL_CLOSE ICON_PANEL_CLOSE}</li>
     * <li>{@link #BND_ICON_COPY_ID ICON_COPY_ID}</li>
     * <li>{@link #BND_ICON_EYEDROPPER ICON_EYEDROPPER}</li>
     * <li>{@link #BND_ICON_LINK_AREA ICON_LINK_AREA}</li>
     * <li>{@link #BND_ICON_AUTO ICON_AUTO}</li>
     * <li>{@link #BND_ICON_CHECKBOX_DEHLT ICON_CHECKBOX_DEHLT}</li>
     * <li>{@link #BND_ICON_CHECKBOX_HLT ICON_CHECKBOX_HLT}</li>
     * <li>{@link #BND_ICON_UNLOCKED ICON_UNLOCKED}</li>
     * <li>{@link #BND_ICON_LOCKED ICON_LOCKED}</li>
     * <li>{@link #BND_ICON_UNPINNED ICON_UNPINNED}</li>
     * <li>{@link #BND_ICON_PINNED ICON_PINNED}</li>
     * <li>{@link #BND_ICON_SCREEN_BACK ICON_SCREEN_BACK}</li>
     * <li>{@link #BND_ICON_RIGHTARROW ICON_RIGHTARROW}</li>
     * <li>{@link #BND_ICON_DOWNARROW_HLT ICON_DOWNARROW_HLT}</li>
     * <li>{@link #BND_ICON_DOTSUP ICON_DOTSUP}</li>
     * <li>{@link #BND_ICON_DOTSDOWN ICON_DOTSDOWN}</li>
     * <li>{@link #BND_ICON_LINK ICON_LINK}</li>
     * <li>{@link #BND_ICON_INLINK ICON_INLINK}</li>
     * <li>{@link #BND_ICON_PLUGIN ICON_PLUGIN}</li>
     * <li>{@link #BND_ICON_HELP ICON_HELP}</li>
     * <li>{@link #BND_ICON_GHOST_ENABLED ICON_GHOST_ENABLED}</li>
     * <li>{@link #BND_ICON_COLOR ICON_COLOR}</li>
     * <li>{@link #BND_ICON_LINKED ICON_LINKED}</li>
     * <li>{@link #BND_ICON_UNLINKED ICON_UNLINKED}</li>
     * <li>{@link #BND_ICON_HAND ICON_HAND}</li>
     * <li>{@link #BND_ICON_ZOOM_ALL ICON_ZOOM_ALL}</li>
     * <li>{@link #BND_ICON_ZOOM_SELECTED ICON_ZOOM_SELECTED}</li>
     * <li>{@link #BND_ICON_ZOOM_PREVIOUS ICON_ZOOM_PREVIOUS}</li>
     * <li>{@link #BND_ICON_ZOOM_IN ICON_ZOOM_IN}</li>
     * <li>{@link #BND_ICON_ZOOM_OUT ICON_ZOOM_OUT}</li>
     * <li>{@link #BND_ICON_RENDER_REGION ICON_RENDER_REGION}</li>
     * <li>{@link #BND_ICON_BORDER_RECT ICON_BORDER_RECT}</li>
     * <li>{@link #BND_ICON_BORDER_LASSO ICON_BORDER_LASSO}</li>
     * <li>{@link #BND_ICON_FREEZE ICON_FREEZE}</li>
     * <li>{@link #BND_ICON_STYLUS_PRESSURE ICON_STYLUS_PRESSURE}</li>
     * <li>{@link #BND_ICON_GHOST_DISABLED ICON_GHOST_DISABLED}</li>
     * <li>{@link #BND_ICON_NEW ICON_NEW}</li>
     * <li>{@link #BND_ICON_FILE_TICK ICON_FILE_TICK}</li>
     * <li>{@link #BND_ICON_QUIT ICON_QUIT}</li>
     * <li>{@link #BND_ICON_URL ICON_URL}</li>
     * <li>{@link #BND_ICON_RECOVER_LAST ICON_RECOVER_LAST}</li>
     * <li>{@link #BND_ICON_FULLSCREEN_ENTER ICON_FULLSCREEN_ENTER}</li>
     * <li>{@link #BND_ICON_FULLSCREEN_EXIT ICON_FULLSCREEN_EXIT}</li>
     * <li>{@link #BND_ICON_BLANK1 ICON_BLANK1}</li>
     * <li>{@link #BND_ICON_LAMP ICON_LAMP}</li>
     * <li>{@link #BND_ICON_MATERIAL ICON_MATERIAL}</li>
     * <li>{@link #BND_ICON_TEXTURE ICON_TEXTURE}</li>
     * <li>{@link #BND_ICON_ANIM ICON_ANIM}</li>
     * <li>{@link #BND_ICON_WORLD ICON_WORLD}</li>
     * <li>{@link #BND_ICON_SCENE ICON_SCENE}</li>
     * <li>{@link #BND_ICON_EDIT ICON_EDIT}</li>
     * <li>{@link #BND_ICON_GAME ICON_GAME}</li>
     * <li>{@link #BND_ICON_RADIO ICON_RADIO}</li>
     * <li>{@link #BND_ICON_SCRIPT ICON_SCRIPT}</li>
     * <li>{@link #BND_ICON_PARTICLES ICON_PARTICLES}</li>
     * <li>{@link #BND_ICON_PHYSICS ICON_PHYSICS}</li>
     * <li>{@link #BND_ICON_SPEAKER ICON_SPEAKER}</li>
     * <li>{@link #BND_ICON_TEXTURE_SHADED ICON_TEXTURE_SHADED}</li>
     * <li>{@link #BND_ICON_VIEW3D ICON_VIEW3D}</li>
     * <li>{@link #BND_ICON_IPO ICON_IPO}</li>
     * <li>{@link #BND_ICON_OOPS ICON_OOPS}</li>
     * <li>{@link #BND_ICON_BUTS ICON_BUTS}</li>
     * <li>{@link #BND_ICON_FILESEL ICON_FILESEL}</li>
     * <li>{@link #BND_ICON_IMAGE_COL ICON_IMAGE_COL}</li>
     * <li>{@link #BND_ICON_INFO ICON_INFO}</li>
     * <li>{@link #BND_ICON_SEQUENCE ICON_SEQUENCE}</li>
     * <li>{@link #BND_ICON_TEXT ICON_TEXT}</li>
     * <li>{@link #BND_ICON_IMASEL ICON_IMASEL}</li>
     * <li>{@link #BND_ICON_SOUND ICON_SOUND}</li>
     * <li>{@link #BND_ICON_ACTION ICON_ACTION}</li>
     * <li>{@link #BND_ICON_NLA ICON_NLA}</li>
     * <li>{@link #BND_ICON_SCRIPTWIN ICON_SCRIPTWIN}</li>
     * <li>{@link #BND_ICON_TIME ICON_TIME}</li>
     * <li>{@link #BND_ICON_NODETREE ICON_NODETREE}</li>
     * <li>{@link #BND_ICON_LOGIC ICON_LOGIC}</li>
     * <li>{@link #BND_ICON_CONSOLE ICON_CONSOLE}</li>
     * <li>{@link #BND_ICON_PREFERENCES ICON_PREFERENCES}</li>
     * <li>{@link #BND_ICON_CLIP ICON_CLIP}</li>
     * <li>{@link #BND_ICON_ASSET_MANAGER ICON_ASSET_MANAGER}</li>
     * <li>{@link #BND_ICON_OBJECT_DATAMODE ICON_OBJECT_DATAMODE}</li>
     * <li>{@link #BND_ICON_EDITMODE_HLT ICON_EDITMODE_HLT}</li>
     * <li>{@link #BND_ICON_FACESEL_HLT ICON_FACESEL_HLT}</li>
     * <li>{@link #BND_ICON_VPAINT_HLT ICON_VPAINT_HLT}</li>
     * <li>{@link #BND_ICON_TPAINT_HLT ICON_TPAINT_HLT}</li>
     * <li>{@link #BND_ICON_WPAINT_HLT ICON_WPAINT_HLT}</li>
     * <li>{@link #BND_ICON_SCULPTMODE_HLT ICON_SCULPTMODE_HLT}</li>
     * <li>{@link #BND_ICON_POSE_HLT ICON_POSE_HLT}</li>
     * <li>{@link #BND_ICON_PARTICLEMODE ICON_PARTICLEMODE}</li>
     * <li>{@link #BND_ICON_LIGHTPAINT ICON_LIGHTPAINT}</li>
     * <li>{@link #BND_ICON_SCENE_DATA ICON_SCENE_DATA}</li>
     * <li>{@link #BND_ICON_RENDERLAYERS ICON_RENDERLAYERS}</li>
     * <li>{@link #BND_ICON_WORLD_DATA ICON_WORLD_DATA}</li>
     * <li>{@link #BND_ICON_OBJECT_DATA ICON_OBJECT_DATA}</li>
     * <li>{@link #BND_ICON_MESH_DATA ICON_MESH_DATA}</li>
     * <li>{@link #BND_ICON_CURVE_DATA ICON_CURVE_DATA}</li>
     * <li>{@link #BND_ICON_META_DATA ICON_META_DATA}</li>
     * <li>{@link #BND_ICON_LATTICE_DATA ICON_LATTICE_DATA}</li>
     * <li>{@link #BND_ICON_LAMP_DATA ICON_LAMP_DATA}</li>
     * <li>{@link #BND_ICON_MATERIAL_DATA ICON_MATERIAL_DATA}</li>
     * <li>{@link #BND_ICON_TEXTURE_DATA ICON_TEXTURE_DATA}</li>
     * <li>{@link #BND_ICON_ANIM_DATA ICON_ANIM_DATA}</li>
     * <li>{@link #BND_ICON_CAMERA_DATA ICON_CAMERA_DATA}</li>
     * <li>{@link #BND_ICON_PARTICLE_DATA ICON_PARTICLE_DATA}</li>
     * <li>{@link #BND_ICON_LIBRARY_DATA_DIRECT ICON_LIBRARY_DATA_DIRECT}</li>
     * <li>{@link #BND_ICON_GROUP ICON_GROUP}</li>
     * <li>{@link #BND_ICON_ARMATURE_DATA ICON_ARMATURE_DATA}</li>
     * <li>{@link #BND_ICON_POSE_DATA ICON_POSE_DATA}</li>
     * <li>{@link #BND_ICON_BONE_DATA ICON_BONE_DATA}</li>
     * <li>{@link #BND_ICON_CONSTRAINT ICON_CONSTRAINT}</li>
     * <li>{@link #BND_ICON_SHAPEKEY_DATA ICON_SHAPEKEY_DATA}</li>
     * <li>{@link #BND_ICON_CONSTRAINT_BONE ICON_CONSTRAINT_BONE}</li>
     * <li>{@link #BND_ICON_CAMERA_STEREO ICON_CAMERA_STEREO}</li>
     * <li>{@link #BND_ICON_PACKAGE ICON_PACKAGE}</li>
     * <li>{@link #BND_ICON_UGLYPACKAGE ICON_UGLYPACKAGE}</li>
     * <li>{@link #BND_ICON_BRUSH_DATA ICON_BRUSH_DATA}</li>
     * <li>{@link #BND_ICON_IMAGE_DATA ICON_IMAGE_DATA}</li>
     * <li>{@link #BND_ICON_FILE ICON_FILE}</li>
     * <li>{@link #BND_ICON_FCURVE ICON_FCURVE}</li>
     * <li>{@link #BND_ICON_FONT_DATA ICON_FONT_DATA}</li>
     * <li>{@link #BND_ICON_RENDER_RESULT ICON_RENDER_RESULT}</li>
     * <li>{@link #BND_ICON_SURFACE_DATA ICON_SURFACE_DATA}</li>
     * <li>{@link #BND_ICON_EMPTY_DATA ICON_EMPTY_DATA}</li>
     * <li>{@link #BND_ICON_SETTINGS ICON_SETTINGS}</li>
     * <li>{@link #BND_ICON_RENDER_ANIMATION ICON_RENDER_ANIMATION}</li>
     * <li>{@link #BND_ICON_RENDER_STILL ICON_RENDER_STILL}</li>
     * <li>{@link #BND_ICON_BOIDS ICON_BOIDS}</li>
     * <li>{@link #BND_ICON_STRANDS ICON_STRANDS}</li>
     * <li>{@link #BND_ICON_LIBRARY_DATA_INDIRECT ICON_LIBRARY_DATA_INDIRECT}</li>
     * <li>{@link #BND_ICON_GREASEPENCIL ICON_GREASEPENCIL}</li>
     * <li>{@link #BND_ICON_LINE_DATA ICON_LINE_DATA}</li>
     * <li>{@link #BND_ICON_GROUP_BONE ICON_GROUP_BONE}</li>
     * <li>{@link #BND_ICON_GROUP_VERTEX ICON_GROUP_VERTEX}</li>
     * <li>{@link #BND_ICON_GROUP_VCOL ICON_GROUP_VCOL}</li>
     * <li>{@link #BND_ICON_GROUP_UVS ICON_GROUP_UVS}</li>
     * <li>{@link #BND_ICON_RNA ICON_RNA}</li>
     * <li>{@link #BND_ICON_RNA_ADD ICON_RNA_ADD}</li>
     * <li>{@link #BND_ICON_OUTLINER_OB_EMPTY ICON_OUTLINER_OB_EMPTY}</li>
     * <li>{@link #BND_ICON_OUTLINER_OB_MESH ICON_OUTLINER_OB_MESH}</li>
     * <li>{@link #BND_ICON_OUTLINER_OB_CURVE ICON_OUTLINER_OB_CURVE}</li>
     * <li>{@link #BND_ICON_OUTLINER_OB_LATTICE ICON_OUTLINER_OB_LATTICE}</li>
     * <li>{@link #BND_ICON_OUTLINER_OB_META ICON_OUTLINER_OB_META}</li>
     * <li>{@link #BND_ICON_OUTLINER_OB_LAMP ICON_OUTLINER_OB_LAMP}</li>
     * <li>{@link #BND_ICON_OUTLINER_OB_CAMERA ICON_OUTLINER_OB_CAMERA}</li>
     * <li>{@link #BND_ICON_OUTLINER_OB_ARMATURE ICON_OUTLINER_OB_ARMATURE}</li>
     * <li>{@link #BND_ICON_OUTLINER_OB_FONT ICON_OUTLINER_OB_FONT}</li>
     * <li>{@link #BND_ICON_OUTLINER_OB_SURFACE ICON_OUTLINER_OB_SURFACE}</li>
     * <li>{@link #BND_ICON_OUTLINER_OB_SPEAKER ICON_OUTLINER_OB_SPEAKER}</li>
     * <li>{@link #BND_ICON_RESTRICT_VIEW_OFF ICON_RESTRICT_VIEW_OFF}</li>
     * <li>{@link #BND_ICON_RESTRICT_VIEW_ON ICON_RESTRICT_VIEW_ON}</li>
     * <li>{@link #BND_ICON_RESTRICT_SELECT_OFF ICON_RESTRICT_SELECT_OFF}</li>
     * <li>{@link #BND_ICON_RESTRICT_SELECT_ON ICON_RESTRICT_SELECT_ON}</li>
     * <li>{@link #BND_ICON_RESTRICT_RENDER_OFF ICON_RESTRICT_RENDER_OFF}</li>
     * <li>{@link #BND_ICON_RESTRICT_RENDER_ON ICON_RESTRICT_RENDER_ON}</li>
     * <li>{@link #BND_ICON_OUTLINER_DATA_EMPTY ICON_OUTLINER_DATA_EMPTY}</li>
     * <li>{@link #BND_ICON_OUTLINER_DATA_MESH ICON_OUTLINER_DATA_MESH}</li>
     * <li>{@link #BND_ICON_OUTLINER_DATA_CURVE ICON_OUTLINER_DATA_CURVE}</li>
     * <li>{@link #BND_ICON_OUTLINER_DATA_LATTICE ICON_OUTLINER_DATA_LATTICE}</li>
     * <li>{@link #BND_ICON_OUTLINER_DATA_META ICON_OUTLINER_DATA_META}</li>
     * <li>{@link #BND_ICON_OUTLINER_DATA_LAMP ICON_OUTLINER_DATA_LAMP}</li>
     * <li>{@link #BND_ICON_OUTLINER_DATA_CAMERA ICON_OUTLINER_DATA_CAMERA}</li>
     * <li>{@link #BND_ICON_OUTLINER_DATA_ARMATURE ICON_OUTLINER_DATA_ARMATURE}</li>
     * <li>{@link #BND_ICON_OUTLINER_DATA_FONT ICON_OUTLINER_DATA_FONT}</li>
     * <li>{@link #BND_ICON_OUTLINER_DATA_SURFACE ICON_OUTLINER_DATA_SURFACE}</li>
     * <li>{@link #BND_ICON_OUTLINER_DATA_SPEAKER ICON_OUTLINER_DATA_SPEAKER}</li>
     * <li>{@link #BND_ICON_OUTLINER_DATA_POSE ICON_OUTLINER_DATA_POSE}</li>
     * <li>{@link #BND_ICON_MESH_PLANE ICON_MESH_PLANE}</li>
     * <li>{@link #BND_ICON_MESH_CUBE ICON_MESH_CUBE}</li>
     * <li>{@link #BND_ICON_MESH_CIRCLE ICON_MESH_CIRCLE}</li>
     * <li>{@link #BND_ICON_MESH_UVSPHERE ICON_MESH_UVSPHERE}</li>
     * <li>{@link #BND_ICON_MESH_ICOSPHERE ICON_MESH_ICOSPHERE}</li>
     * <li>{@link #BND_ICON_MESH_GRID ICON_MESH_GRID}</li>
     * <li>{@link #BND_ICON_MESH_MONKEY ICON_MESH_MONKEY}</li>
     * <li>{@link #BND_ICON_MESH_CYLINDER ICON_MESH_CYLINDER}</li>
     * <li>{@link #BND_ICON_MESH_TORUS ICON_MESH_TORUS}</li>
     * <li>{@link #BND_ICON_MESH_CONE ICON_MESH_CONE}</li>
     * <li>{@link #BND_ICON_LAMP_POINT ICON_LAMP_POINT}</li>
     * <li>{@link #BND_ICON_LAMP_SUN ICON_LAMP_SUN}</li>
     * <li>{@link #BND_ICON_LAMP_SPOT ICON_LAMP_SPOT}</li>
     * <li>{@link #BND_ICON_LAMP_HEMI ICON_LAMP_HEMI}</li>
     * <li>{@link #BND_ICON_LAMP_AREA ICON_LAMP_AREA}</li>
     * <li>{@link #BND_ICON_META_EMPTY ICON_META_EMPTY}</li>
     * <li>{@link #BND_ICON_META_PLANE ICON_META_PLANE}</li>
     * <li>{@link #BND_ICON_META_CUBE ICON_META_CUBE}</li>
     * <li>{@link #BND_ICON_META_BALL ICON_META_BALL}</li>
     * <li>{@link #BND_ICON_META_ELLIPSOID ICON_META_ELLIPSOID}</li>
     * <li>{@link #BND_ICON_META_CAPSULE ICON_META_CAPSULE}</li>
     * <li>{@link #BND_ICON_SURFACE_NCURVE ICON_SURFACE_NCURVE}</li>
     * <li>{@link #BND_ICON_SURFACE_NCIRCLE ICON_SURFACE_NCIRCLE}</li>
     * <li>{@link #BND_ICON_SURFACE_NSURFACE ICON_SURFACE_NSURFACE}</li>
     * <li>{@link #BND_ICON_SURFACE_NCYLINDER ICON_SURFACE_NCYLINDER}</li>
     * <li>{@link #BND_ICON_SURFACE_NSPHERE ICON_SURFACE_NSPHERE}</li>
     * <li>{@link #BND_ICON_SURFACE_NTORUS ICON_SURFACE_NTORUS}</li>
     * <li>{@link #BND_ICON_CURVE_BEZCURVE ICON_CURVE_BEZCURVE}</li>
     * <li>{@link #BND_ICON_CURVE_BEZCIRCLE ICON_CURVE_BEZCIRCLE}</li>
     * <li>{@link #BND_ICON_CURVE_NCURVE ICON_CURVE_NCURVE}</li>
     * <li>{@link #BND_ICON_CURVE_NCIRCLE ICON_CURVE_NCIRCLE}</li>
     * <li>{@link #BND_ICON_CURVE_PATH ICON_CURVE_PATH}</li>
     * <li>{@link #BND_ICON_COLOR_RED ICON_COLOR_RED}</li>
     * <li>{@link #BND_ICON_COLOR_GREEN ICON_COLOR_GREEN}</li>
     * <li>{@link #BND_ICON_COLOR_BLUE ICON_COLOR_BLUE}</li>
     * <li>{@link #BND_ICON_FORCE_FORCE ICON_FORCE_FORCE}</li>
     * <li>{@link #BND_ICON_FORCE_WIND ICON_FORCE_WIND}</li>
     * <li>{@link #BND_ICON_FORCE_VORTEX ICON_FORCE_VORTEX}</li>
     * <li>{@link #BND_ICON_FORCE_MAGNETIC ICON_FORCE_MAGNETIC}</li>
     * <li>{@link #BND_ICON_FORCE_HARMONIC ICON_FORCE_HARMONIC}</li>
     * <li>{@link #BND_ICON_FORCE_CHARGE ICON_FORCE_CHARGE}</li>
     * <li>{@link #BND_ICON_FORCE_LENNARDJONES ICON_FORCE_LENNARDJONES}</li>
     * <li>{@link #BND_ICON_FORCE_TEXTURE ICON_FORCE_TEXTURE}</li>
     * <li>{@link #BND_ICON_FORCE_CURVE ICON_FORCE_CURVE}</li>
     * <li>{@link #BND_ICON_FORCE_BOID ICON_FORCE_BOID}</li>
     * <li>{@link #BND_ICON_FORCE_TURBULENCE ICON_FORCE_TURBULENCE}</li>
     * <li>{@link #BND_ICON_FORCE_DRAG ICON_FORCE_DRAG}</li>
     * <li>{@link #BND_ICON_FORCE_SMOKEFLOW ICON_FORCE_SMOKEFLOW}</li>
     * <li>{@link #BND_ICON_MODIFIER ICON_MODIFIER}</li>
     * <li>{@link #BND_ICON_MOD_WAVE ICON_MOD_WAVE}</li>
     * <li>{@link #BND_ICON_MOD_BUILD ICON_MOD_BUILD}</li>
     * <li>{@link #BND_ICON_MOD_DECIM ICON_MOD_DECIM}</li>
     * <li>{@link #BND_ICON_MOD_MIRROR ICON_MOD_MIRROR}</li>
     * <li>{@link #BND_ICON_MOD_SOFT ICON_MOD_SOFT}</li>
     * <li>{@link #BND_ICON_MOD_SUBSURF ICON_MOD_SUBSURF}</li>
     * <li>{@link #BND_ICON_HOOK ICON_HOOK}</li>
     * <li>{@link #BND_ICON_MOD_PHYSICS ICON_MOD_PHYSICS}</li>
     * <li>{@link #BND_ICON_MOD_PARTICLES ICON_MOD_PARTICLES}</li>
     * <li>{@link #BND_ICON_MOD_BOOLEAN ICON_MOD_BOOLEAN}</li>
     * <li>{@link #BND_ICON_MOD_EDGESPLIT ICON_MOD_EDGESPLIT}</li>
     * <li>{@link #BND_ICON_MOD_ARRAY ICON_MOD_ARRAY}</li>
     * <li>{@link #BND_ICON_MOD_UVPROJECT ICON_MOD_UVPROJECT}</li>
     * <li>{@link #BND_ICON_MOD_DISPLACE ICON_MOD_DISPLACE}</li>
     * <li>{@link #BND_ICON_MOD_CURVE ICON_MOD_CURVE}</li>
     * <li>{@link #BND_ICON_MOD_LATTICE ICON_MOD_LATTICE}</li>
     * <li>{@link #BND_ICON_CONSTRAINT_DATA ICON_CONSTRAINT_DATA}</li>
     * <li>{@link #BND_ICON_MOD_ARMATURE ICON_MOD_ARMATURE}</li>
     * <li>{@link #BND_ICON_MOD_SHRINKWRAP ICON_MOD_SHRINKWRAP}</li>
     * <li>{@link #BND_ICON_MOD_CAST ICON_MOD_CAST}</li>
     * <li>{@link #BND_ICON_MOD_MESHDEFORM ICON_MOD_MESHDEFORM}</li>
     * <li>{@link #BND_ICON_MOD_BEVEL ICON_MOD_BEVEL}</li>
     * <li>{@link #BND_ICON_MOD_SMOOTH ICON_MOD_SMOOTH}</li>
     * <li>{@link #BND_ICON_MOD_SIMPLEDEFORM ICON_MOD_SIMPLEDEFORM}</li>
     * <li>{@link #BND_ICON_MOD_MASK ICON_MOD_MASK}</li>
     * <li>{@link #BND_ICON_MOD_CLOTH ICON_MOD_CLOTH}</li>
     * <li>{@link #BND_ICON_MOD_EXPLODE ICON_MOD_EXPLODE}</li>
     * <li>{@link #BND_ICON_MOD_FLUIDSIM ICON_MOD_FLUIDSIM}</li>
     * <li>{@link #BND_ICON_MOD_MULTIRES ICON_MOD_MULTIRES}</li>
     * <li>{@link #BND_ICON_MOD_SMOKE ICON_MOD_SMOKE}</li>
     * <li>{@link #BND_ICON_MOD_SOLIDIFY ICON_MOD_SOLIDIFY}</li>
     * <li>{@link #BND_ICON_MOD_SCREW ICON_MOD_SCREW}</li>
     * <li>{@link #BND_ICON_MOD_VERTEX_WEIGHT ICON_MOD_VERTEX_WEIGHT}</li>
     * <li>{@link #BND_ICON_MOD_DYNAMICPAINT ICON_MOD_DYNAMICPAINT}</li>
     * <li>{@link #BND_ICON_MOD_REMESH ICON_MOD_REMESH}</li>
     * <li>{@link #BND_ICON_MOD_OCEAN ICON_MOD_OCEAN}</li>
     * <li>{@link #BND_ICON_MOD_WARP ICON_MOD_WARP}</li>
     * <li>{@link #BND_ICON_MOD_SKIN ICON_MOD_SKIN}</li>
     * <li>{@link #BND_ICON_MOD_TRIANGULATE ICON_MOD_TRIANGULATE}</li>
     * <li>{@link #BND_ICON_MOD_WIREFRAME ICON_MOD_WIREFRAME}</li>
     * <li>{@link #BND_ICON_REC ICON_REC}</li>
     * <li>{@link #BND_ICON_PLAY ICON_PLAY}</li>
     * <li>{@link #BND_ICON_FF ICON_FF}</li>
     * <li>{@link #BND_ICON_REW ICON_REW}</li>
     * <li>{@link #BND_ICON_PAUSE ICON_PAUSE}</li>
     * <li>{@link #BND_ICON_PREV_KEYFRAME ICON_PREV_KEYFRAME}</li>
     * <li>{@link #BND_ICON_NEXT_KEYFRAME ICON_NEXT_KEYFRAME}</li>
     * <li>{@link #BND_ICON_PLAY_AUDIO ICON_PLAY_AUDIO}</li>
     * <li>{@link #BND_ICON_PLAY_REVERSE ICON_PLAY_REVERSE}</li>
     * <li>{@link #BND_ICON_PREVIEW_RANGE ICON_PREVIEW_RANGE}</li>
     * <li>{@link #BND_ICON_ACTION_TWEAK ICON_ACTION_TWEAK}</li>
     * <li>{@link #BND_ICON_PMARKER_ACT ICON_PMARKER_ACT}</li>
     * <li>{@link #BND_ICON_PMARKER_SEL ICON_PMARKER_SEL}</li>
     * <li>{@link #BND_ICON_PMARKER ICON_PMARKER}</li>
     * <li>{@link #BND_ICON_MARKER_HLT ICON_MARKER_HLT}</li>
     * <li>{@link #BND_ICON_MARKER ICON_MARKER}</li>
     * <li>{@link #BND_ICON_SPACE2 ICON_SPACE2}</li>
     * <li>{@link #BND_ICON_SPACE3 ICON_SPACE3}</li>
     * <li>{@link #BND_ICON_KEYINGSET ICON_KEYINGSET}</li>
     * <li>{@link #BND_ICON_KEY_DEHLT ICON_KEY_DEHLT}</li>
     * <li>{@link #BND_ICON_KEY_HLT ICON_KEY_HLT}</li>
     * <li>{@link #BND_ICON_MUTE_IPO_OFF ICON_MUTE_IPO_OFF}</li>
     * <li>{@link #BND_ICON_MUTE_IPO_ON ICON_MUTE_IPO_ON}</li>
     * <li>{@link #BND_ICON_VISIBLE_IPO_OFF ICON_VISIBLE_IPO_OFF}</li>
     * <li>{@link #BND_ICON_VISIBLE_IPO_ON ICON_VISIBLE_IPO_ON}</li>
     * <li>{@link #BND_ICON_DRIVER ICON_DRIVER}</li>
     * <li>{@link #BND_ICON_SOLO_OFF ICON_SOLO_OFF}</li>
     * <li>{@link #BND_ICON_SOLO_ON ICON_SOLO_ON}</li>
     * <li>{@link #BND_ICON_FRAME_PREV ICON_FRAME_PREV}</li>
     * <li>{@link #BND_ICON_FRAME_NEXT ICON_FRAME_NEXT}</li>
     * <li>{@link #BND_ICON_NLA_PUSHDOWN ICON_NLA_PUSHDOWN}</li>
     * <li>{@link #BND_ICON_IPO_CONSTANT ICON_IPO_CONSTANT}</li>
     * <li>{@link #BND_ICON_IPO_LINEAR ICON_IPO_LINEAR}</li>
     * <li>{@link #BND_ICON_IPO_BEZIER ICON_IPO_BEZIER}</li>
     * <li>{@link #BND_ICON_IPO_SINE ICON_IPO_SINE}</li>
     * <li>{@link #BND_ICON_IPO_QUAD ICON_IPO_QUAD}</li>
     * <li>{@link #BND_ICON_IPO_CUBIC ICON_IPO_CUBIC}</li>
     * <li>{@link #BND_ICON_IPO_QUART ICON_IPO_QUART}</li>
     * <li>{@link #BND_ICON_IPO_QUINT ICON_IPO_QUINT}</li>
     * <li>{@link #BND_ICON_IPO_EXPO ICON_IPO_EXPO}</li>
     * <li>{@link #BND_ICON_IPO_CIRC ICON_IPO_CIRC}</li>
     * <li>{@link #BND_ICON_IPO_BOUNCE ICON_IPO_BOUNCE}</li>
     * <li>{@link #BND_ICON_IPO_ELASTIC ICON_IPO_ELASTIC}</li>
     * <li>{@link #BND_ICON_IPO_BACK ICON_IPO_BACK}</li>
     * <li>{@link #BND_ICON_IPO_EASE_IN ICON_IPO_EASE_IN}</li>
     * <li>{@link #BND_ICON_IPO_EASE_OUT ICON_IPO_EASE_OUT}</li>
     * <li>{@link #BND_ICON_IPO_EASE_IN_OUT ICON_IPO_EASE_IN_OUT}</li>
     * <li>{@link #BND_ICON_VERTEXSEL ICON_VERTEXSEL}</li>
     * <li>{@link #BND_ICON_EDGESEL ICON_EDGESEL}</li>
     * <li>{@link #BND_ICON_FACESEL ICON_FACESEL}</li>
     * <li>{@link #BND_ICON_LOOPSEL ICON_LOOPSEL}</li>
     * <li>{@link #BND_ICON_ROTATE ICON_ROTATE}</li>
     * <li>{@link #BND_ICON_CURSOR ICON_CURSOR}</li>
     * <li>{@link #BND_ICON_ROTATECOLLECTION ICON_ROTATECOLLECTION}</li>
     * <li>{@link #BND_ICON_ROTATECENTER ICON_ROTATECENTER}</li>
     * <li>{@link #BND_ICON_ROTACTIVE ICON_ROTACTIVE}</li>
     * <li>{@link #BND_ICON_ALIGN ICON_ALIGN}</li>
     * <li>{@link #BND_ICON_SMOOTHCURVE ICON_SMOOTHCURVE}</li>
     * <li>{@link #BND_ICON_SPHERECURVE ICON_SPHERECURVE}</li>
     * <li>{@link #BND_ICON_ROOTCURVE ICON_ROOTCURVE}</li>
     * <li>{@link #BND_ICON_SHARPCURVE ICON_SHARPCURVE}</li>
     * <li>{@link #BND_ICON_LINCURVE ICON_LINCURVE}</li>
     * <li>{@link #BND_ICON_NOCURVE ICON_NOCURVE}</li>
     * <li>{@link #BND_ICON_RNDCURVE ICON_RNDCURVE}</li>
     * <li>{@link #BND_ICON_PROP_OFF ICON_PROP_OFF}</li>
     * <li>{@link #BND_ICON_PROP_ON ICON_PROP_ON}</li>
     * <li>{@link #BND_ICON_PROP_CON ICON_PROP_CON}</li>
     * <li>{@link #BND_ICON_SCULPT_DYNTOPO ICON_SCULPT_DYNTOPO}</li>
     * <li>{@link #BND_ICON_PARTICLE_POINT ICON_PARTICLE_POINT}</li>
     * <li>{@link #BND_ICON_PARTICLE_TIP ICON_PARTICLE_TIP}</li>
     * <li>{@link #BND_ICON_PARTICLE_PATH ICON_PARTICLE_PATH}</li>
     * <li>{@link #BND_ICON_MAN_TRANS ICON_MAN_TRANS}</li>
     * <li>{@link #BND_ICON_MAN_ROT ICON_MAN_ROT}</li>
     * <li>{@link #BND_ICON_MAN_SCALE ICON_MAN_SCALE}</li>
     * <li>{@link #BND_ICON_MANIPUL ICON_MANIPUL}</li>
     * <li>{@link #BND_ICON_SNAP_OFF ICON_SNAP_OFF}</li>
     * <li>{@link #BND_ICON_SNAP_ON ICON_SNAP_ON}</li>
     * <li>{@link #BND_ICON_SNAP_NORMAL ICON_SNAP_NORMAL}</li>
     * <li>{@link #BND_ICON_SNAP_INCREMENT ICON_SNAP_INCREMENT}</li>
     * <li>{@link #BND_ICON_SNAP_VERTEX ICON_SNAP_VERTEX}</li>
     * <li>{@link #BND_ICON_SNAP_EDGE ICON_SNAP_EDGE}</li>
     * <li>{@link #BND_ICON_SNAP_FACE ICON_SNAP_FACE}</li>
     * <li>{@link #BND_ICON_SNAP_VOLUME ICON_SNAP_VOLUME}</li>
     * <li>{@link #BND_ICON_STICKY_UVS_LOC ICON_STICKY_UVS_LOC}</li>
     * <li>{@link #BND_ICON_STICKY_UVS_DISABLE ICON_STICKY_UVS_DISABLE}</li>
     * <li>{@link #BND_ICON_STICKY_UVS_VERT ICON_STICKY_UVS_VERT}</li>
     * <li>{@link #BND_ICON_CLIPUV_DEHLT ICON_CLIPUV_DEHLT}</li>
     * <li>{@link #BND_ICON_CLIPUV_HLT ICON_CLIPUV_HLT}</li>
     * <li>{@link #BND_ICON_SNAP_PEEL_OBJECT ICON_SNAP_PEEL_OBJECT}</li>
     * <li>{@link #BND_ICON_GRID ICON_GRID}</li>
     * <li>{@link #BND_ICON_PASTEDOWN ICON_PASTEDOWN}</li>
     * <li>{@link #BND_ICON_COPYDOWN ICON_COPYDOWN}</li>
     * <li>{@link #BND_ICON_PASTEFLIPUP ICON_PASTEFLIPUP}</li>
     * <li>{@link #BND_ICON_PASTEFLIPDOWN ICON_PASTEFLIPDOWN}</li>
     * <li>{@link #BND_ICON_SNAP_SURFACE ICON_SNAP_SURFACE}</li>
     * <li>{@link #BND_ICON_AUTOMERGE_ON ICON_AUTOMERGE_ON}</li>
     * <li>{@link #BND_ICON_AUTOMERGE_OFF ICON_AUTOMERGE_OFF}</li>
     * <li>{@link #BND_ICON_RETOPO ICON_RETOPO}</li>
     * <li>{@link #BND_ICON_UV_VERTEXSEL ICON_UV_VERTEXSEL}</li>
     * <li>{@link #BND_ICON_UV_EDGESEL ICON_UV_EDGESEL}</li>
     * <li>{@link #BND_ICON_UV_FACESEL ICON_UV_FACESEL}</li>
     * <li>{@link #BND_ICON_UV_ISLANDSEL ICON_UV_ISLANDSEL}</li>
     * <li>{@link #BND_ICON_UV_SYNC_SELECT ICON_UV_SYNC_SELECT}</li>
     * <li>{@link #BND_ICON_BBOX ICON_BBOX}</li>
     * <li>{@link #BND_ICON_WIRE ICON_WIRE}</li>
     * <li>{@link #BND_ICON_SOLID ICON_SOLID}</li>
     * <li>{@link #BND_ICON_SMOOTH ICON_SMOOTH}</li>
     * <li>{@link #BND_ICON_POTATO ICON_POTATO}</li>
     * <li>{@link #BND_ICON_ORTHO ICON_ORTHO}</li>
     * <li>{@link #BND_ICON_LOCKVIEW_OFF ICON_LOCKVIEW_OFF}</li>
     * <li>{@link #BND_ICON_LOCKVIEW_ON ICON_LOCKVIEW_ON}</li>
     * <li>{@link #BND_ICON_AXIS_SIDE ICON_AXIS_SIDE}</li>
     * <li>{@link #BND_ICON_AXIS_FRONT ICON_AXIS_FRONT}</li>
     * <li>{@link #BND_ICON_AXIS_TOP ICON_AXIS_TOP}</li>
     * <li>{@link #BND_ICON_NDOF_DOM ICON_NDOF_DOM}</li>
     * <li>{@link #BND_ICON_NDOF_TURN ICON_NDOF_TURN}</li>
     * <li>{@link #BND_ICON_NDOF_FLY ICON_NDOF_FLY}</li>
     * <li>{@link #BND_ICON_NDOF_TRANS ICON_NDOF_TRANS}</li>
     * <li>{@link #BND_ICON_LAYER_USED ICON_LAYER_USED}</li>
     * <li>{@link #BND_ICON_LAYER_ACTIVE ICON_LAYER_ACTIVE}</li>
     * <li>{@link #BND_ICON_SORTALPHA ICON_SORTALPHA}</li>
     * <li>{@link #BND_ICON_SORTBYEXT ICON_SORTBYEXT}</li>
     * <li>{@link #BND_ICON_SORTTIME ICON_SORTTIME}</li>
     * <li>{@link #BND_ICON_SORTSIZE ICON_SORTSIZE}</li>
     * <li>{@link #BND_ICON_LONGDISPLAY ICON_LONGDISPLAY}</li>
     * <li>{@link #BND_ICON_SHORTDISPLAY ICON_SHORTDISPLAY}</li>
     * <li>{@link #BND_ICON_GHOST ICON_GHOST}</li>
     * <li>{@link #BND_ICON_IMGDISPLAY ICON_IMGDISPLAY}</li>
     * <li>{@link #BND_ICON_SAVE_AS ICON_SAVE_AS}</li>
     * <li>{@link #BND_ICON_SAVE_COPY ICON_SAVE_COPY}</li>
     * <li>{@link #BND_ICON_BOOKMARKS ICON_BOOKMARKS}</li>
     * <li>{@link #BND_ICON_FONTPREVIEW ICON_FONTPREVIEW}</li>
     * <li>{@link #BND_ICON_FILTER ICON_FILTER}</li>
     * <li>{@link #BND_ICON_NEWFOLDER ICON_NEWFOLDER}</li>
     * <li>{@link #BND_ICON_OPEN_RECENT ICON_OPEN_RECENT}</li>
     * <li>{@link #BND_ICON_FILE_PARENT ICON_FILE_PARENT}</li>
     * <li>{@link #BND_ICON_FILE_REFRESH ICON_FILE_REFRESH}</li>
     * <li>{@link #BND_ICON_FILE_FOLDER ICON_FILE_FOLDER}</li>
     * <li>{@link #BND_ICON_FILE_BLANK ICON_FILE_BLANK}</li>
     * <li>{@link #BND_ICON_FILE_BLEND ICON_FILE_BLEND}</li>
     * <li>{@link #BND_ICON_FILE_IMAGE ICON_FILE_IMAGE}</li>
     * <li>{@link #BND_ICON_FILE_MOVIE ICON_FILE_MOVIE}</li>
     * <li>{@link #BND_ICON_FILE_SCRIPT ICON_FILE_SCRIPT}</li>
     * <li>{@link #BND_ICON_FILE_SOUND ICON_FILE_SOUND}</li>
     * <li>{@link #BND_ICON_FILE_FONT ICON_FILE_FONT}</li>
     * <li>{@link #BND_ICON_FILE_TEXT ICON_FILE_TEXT}</li>
     * <li>{@link #BND_ICON_RECOVER_AUTO ICON_RECOVER_AUTO}</li>
     * <li>{@link #BND_ICON_SAVE_PREFS ICON_SAVE_PREFS}</li>
     * <li>{@link #BND_ICON_LINK_BLEND ICON_LINK_BLEND}</li>
     * <li>{@link #BND_ICON_APPEND_BLEND ICON_APPEND_BLEND}</li>
     * <li>{@link #BND_ICON_IMPORT ICON_IMPORT}</li>
     * <li>{@link #BND_ICON_EXPORT ICON_EXPORT}</li>
     * <li>{@link #BND_ICON_EXTERNAL_DATA ICON_EXTERNAL_DATA}</li>
     * <li>{@link #BND_ICON_LOAD_FACTORY ICON_LOAD_FACTORY}</li>
     * <li>{@link #BND_ICON_LOOP_BACK ICON_LOOP_BACK}</li>
     * <li>{@link #BND_ICON_LOOP_FORWARDS ICON_LOOP_FORWARDS}</li>
     * <li>{@link #BND_ICON_BACK ICON_BACK}</li>
     * <li>{@link #BND_ICON_FORWARD ICON_FORWARD}</li>
     * <li>{@link #BND_ICON_FILE_BACKUP ICON_FILE_BACKUP}</li>
     * <li>{@link #BND_ICON_DISK_DRIVE ICON_DISK_DRIVE}</li>
     * <li>{@link #BND_ICON_MATPLANE ICON_MATPLANE}</li>
     * <li>{@link #BND_ICON_MATSPHERE ICON_MATSPHERE}</li>
     * <li>{@link #BND_ICON_MATCUBE ICON_MATCUBE}</li>
     * <li>{@link #BND_ICON_MONKEY ICON_MONKEY}</li>
     * <li>{@link #BND_ICON_HAIR ICON_HAIR}</li>
     * <li>{@link #BND_ICON_ALIASED ICON_ALIASED}</li>
     * <li>{@link #BND_ICON_ANTIALIASED ICON_ANTIALIASED}</li>
     * <li>{@link #BND_ICON_MAT_SPHERE_SKY ICON_MAT_SPHERE_SKY}</li>
     * <li>{@link #BND_ICON_WORDWRAP_OFF ICON_WORDWRAP_OFF}</li>
     * <li>{@link #BND_ICON_WORDWRAP_ON ICON_WORDWRAP_ON}</li>
     * <li>{@link #BND_ICON_SYNTAX_OFF ICON_SYNTAX_OFF}</li>
     * <li>{@link #BND_ICON_SYNTAX_ON ICON_SYNTAX_ON}</li>
     * <li>{@link #BND_ICON_LINENUMBERS_OFF ICON_LINENUMBERS_OFF}</li>
     * <li>{@link #BND_ICON_LINENUMBERS_ON ICON_LINENUMBERS_ON}</li>
     * <li>{@link #BND_ICON_SCRIPTPLUGINS ICON_SCRIPTPLUGINS}</li>
     * <li>{@link #BND_ICON_SEQ_SEQUENCER ICON_SEQ_SEQUENCER}</li>
     * <li>{@link #BND_ICON_SEQ_PREVIEW ICON_SEQ_PREVIEW}</li>
     * <li>{@link #BND_ICON_SEQ_LUMA_WAVEFORM ICON_SEQ_LUMA_WAVEFORM}</li>
     * <li>{@link #BND_ICON_SEQ_CHROMA_SCOPE ICON_SEQ_CHROMA_SCOPE}</li>
     * <li>{@link #BND_ICON_SEQ_HISTOGRAM ICON_SEQ_HISTOGRAM}</li>
     * <li>{@link #BND_ICON_SEQ_SPLITVIEW ICON_SEQ_SPLITVIEW}</li>
     * <li>{@link #BND_ICON_IMAGE_RGB ICON_IMAGE_RGB}</li>
     * <li>{@link #BND_ICON_IMAGE_RGB_ALPHA ICON_IMAGE_RGB_ALPHA}</li>
     * <li>{@link #BND_ICON_IMAGE_ALPHA ICON_IMAGE_ALPHA}</li>
     * <li>{@link #BND_ICON_IMAGE_ZDEPTH ICON_IMAGE_ZDEPTH}</li>
     * <li>{@link #BND_ICON_IMAGEFILE ICON_IMAGEFILE}</li>
     * </ul>
     */
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

    /** Unsafe version of: {@link #bndSetTheme SetTheme} */
    public static native void nbndSetTheme(long theme);

    /** Sets the current theme all widgets will be drawn with. The default Blender 2.6 theme is set by default. */
    public static void bndSetTheme(BNDtheme theme) {
        nbndSetTheme(theme.address());
    }

    // --- [ bndGetTheme ] ---

    /** Unsafe version of: {@link #bndGetTheme GetTheme} */
    public static native long nbndGetTheme();

    /** Returns the currently set theme. */
    @Nullable
    @NativeType("BNDtheme const *")
    public static BNDtheme bndGetTheme() {
        long __result = nbndGetTheme();
        return BNDtheme.createSafe(__result);
    }

    // --- [ bndSetIconImage ] ---

    /**
     * Designates an image handle as returned by {@code nvgCreateImage*()} as the themes' icon sheet.
     * 
     * <p>The icon sheet format must be compatible to Blender 2.6's icon sheet; the order of icons does not matter. A valid icon sheet is e.g. shown at <a href="http://wiki.blender.org/index.php/Dev:2.5/Doc/How_to/Add_an_icon">how to add an icon</a>.</p>
     */
    public static native void bndSetIconImage(int image);

    // --- [ bndSetFont ] ---

    /**
     * Designates an image handle as returned by {@code nvgCreateFont*()} as the themes' UI font.
     * 
     * <p>Blender's original UI font Droid Sans is perfectly suited and available <a href="https://svn.blender.org/svnroot/bf-blender/trunk/blender/release/datafiles/fonts/">here</a>.</p>
     */
    public static native void bndSetFont(int font);

    // --- [ bndLabel ] ---

    /** Unsafe version of: {@link #bndLabel Label} */
    public static native void nbndLabel(long ctx, float x, float y, float w, float h, int iconid, long label);

    /**
     * Draws a label with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx    the NanoVG context
     * @param h      widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param iconid if &ge; 0, an icon will be added to the widget
     * @param label  if not {@code NULL}, a label will be added to the widget
     */
    public static void bndLabel(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @Nullable @NativeType("char const *") ByteBuffer label) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        nbndLabel(ctx, x, y, w, h, iconid, memAddressSafe(label));
    }

    /**
     * Draws a label with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx    the NanoVG context
     * @param h      widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param iconid if &ge; 0, an icon will be added to the widget
     * @param label  if not {@code NULL}, a label will be added to the widget
     */
    public static void bndLabel(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @Nullable @NativeType("char const *") CharSequence label) {
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

    /** Unsafe version of: {@link #bndToolButton ToolButton} */
    public static native void nbndToolButton(long ctx, float x, float y, float w, float h, int flags, int state, int iconid, long label);

    /**
     * Draws a tool button with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx    the NanoVG context
     * @param h      widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param flags  the corner flags. One of:<br><table><tr><td>{@link #BND_CORNER_NONE CORNER_NONE}</td><td>{@link #BND_CORNER_TOP_LEFT CORNER_TOP_LEFT}</td><td>{@link #BND_CORNER_TOP_RIGHT CORNER_TOP_RIGHT}</td><td>{@link #BND_CORNER_DOWN_RIGHT CORNER_DOWN_RIGHT}</td><td>{@link #BND_CORNER_DOWN_LEFT CORNER_DOWN_LEFT}</td><td>{@link #BND_CORNER_ALL CORNER_ALL}</td></tr><tr><td>{@link #BND_CORNER_TOP CORNER_TOP}</td><td>{@link #BND_CORNER_DOWN CORNER_DOWN}</td><td>{@link #BND_CORNER_LEFT CORNER_LEFT}</td><td>{@link #BND_CORNER_RIGHT CORNER_RIGHT}</td></tr></table>
     * @param state  the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param iconid if &ge; 0, an icon will be added to the widget
     * @param label  if not {@code NULL}, a label will be added to the widget
     */
    public static void bndToolButton(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, int iconid, @Nullable @NativeType("char const *") ByteBuffer label) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        nbndToolButton(ctx, x, y, w, h, flags, state, iconid, memAddressSafe(label));
    }

    /**
     * Draws a tool button with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx    the NanoVG context
     * @param h      widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param flags  the corner flags. One of:<br><table><tr><td>{@link #BND_CORNER_NONE CORNER_NONE}</td><td>{@link #BND_CORNER_TOP_LEFT CORNER_TOP_LEFT}</td><td>{@link #BND_CORNER_TOP_RIGHT CORNER_TOP_RIGHT}</td><td>{@link #BND_CORNER_DOWN_RIGHT CORNER_DOWN_RIGHT}</td><td>{@link #BND_CORNER_DOWN_LEFT CORNER_DOWN_LEFT}</td><td>{@link #BND_CORNER_ALL CORNER_ALL}</td></tr><tr><td>{@link #BND_CORNER_TOP CORNER_TOP}</td><td>{@link #BND_CORNER_DOWN CORNER_DOWN}</td><td>{@link #BND_CORNER_LEFT CORNER_LEFT}</td><td>{@link #BND_CORNER_RIGHT CORNER_RIGHT}</td></tr></table>
     * @param state  the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param iconid if &ge; 0, an icon will be added to the widget
     * @param label  if not {@code NULL}, a label will be added to the widget
     */
    public static void bndToolButton(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, int iconid, @Nullable @NativeType("char const *") CharSequence label) {
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

    /** Unsafe version of: {@link #bndRadioButton RadioButton} */
    public static native void nbndRadioButton(long ctx, float x, float y, float w, float h, int flags, int state, int iconid, long label);

    /**
     * Draws a radio button with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx    the NanoVG context
     * @param h      widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param flags  the corner flags. One of:<br><table><tr><td>{@link #BND_CORNER_NONE CORNER_NONE}</td><td>{@link #BND_CORNER_TOP_LEFT CORNER_TOP_LEFT}</td><td>{@link #BND_CORNER_TOP_RIGHT CORNER_TOP_RIGHT}</td><td>{@link #BND_CORNER_DOWN_RIGHT CORNER_DOWN_RIGHT}</td><td>{@link #BND_CORNER_DOWN_LEFT CORNER_DOWN_LEFT}</td><td>{@link #BND_CORNER_ALL CORNER_ALL}</td></tr><tr><td>{@link #BND_CORNER_TOP CORNER_TOP}</td><td>{@link #BND_CORNER_DOWN CORNER_DOWN}</td><td>{@link #BND_CORNER_LEFT CORNER_LEFT}</td><td>{@link #BND_CORNER_RIGHT CORNER_RIGHT}</td></tr></table>
     * @param state  the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param iconid if &ge; 0, an icon will be added to the widget
     * @param label  if not {@code NULL}, a label will be added to the widget
     */
    public static void bndRadioButton(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, int iconid, @Nullable @NativeType("char const *") ByteBuffer label) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        nbndRadioButton(ctx, x, y, w, h, flags, state, iconid, memAddressSafe(label));
    }

    /**
     * Draws a radio button with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx    the NanoVG context
     * @param h      widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param flags  the corner flags. One of:<br><table><tr><td>{@link #BND_CORNER_NONE CORNER_NONE}</td><td>{@link #BND_CORNER_TOP_LEFT CORNER_TOP_LEFT}</td><td>{@link #BND_CORNER_TOP_RIGHT CORNER_TOP_RIGHT}</td><td>{@link #BND_CORNER_DOWN_RIGHT CORNER_DOWN_RIGHT}</td><td>{@link #BND_CORNER_DOWN_LEFT CORNER_DOWN_LEFT}</td><td>{@link #BND_CORNER_ALL CORNER_ALL}</td></tr><tr><td>{@link #BND_CORNER_TOP CORNER_TOP}</td><td>{@link #BND_CORNER_DOWN CORNER_DOWN}</td><td>{@link #BND_CORNER_LEFT CORNER_LEFT}</td><td>{@link #BND_CORNER_RIGHT CORNER_RIGHT}</td></tr></table>
     * @param state  the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param iconid if &ge; 0, an icon will be added to the widget
     * @param label  if not {@code NULL}, a label will be added to the widget
     */
    public static void bndRadioButton(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, int iconid, @Nullable @NativeType("char const *") CharSequence label) {
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

    /** Unsafe version of: {@link #bndTextFieldTextPosition TextFieldTextPosition} */
    public static native int nbndTextFieldTextPosition(long ctx, float x, float y, float w, float h, int iconid, long text, int px, int py);

    /**
     * Calculates the corresponding text position for given coordinates {@code px/py} in a text field. See {@link #bndTextField TextField} for more info.
     *
     * @param ctx    the NanoVG context
     * @param iconid if &ge; 0, an icon will be added to the widget
     * @param text   if not {@code NULL}, text will be printed to the widget
     */
    public static int bndTextFieldTextPosition(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @Nullable @NativeType("char const *") ByteBuffer text, int px, int py) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(text);
        }
        return nbndTextFieldTextPosition(ctx, x, y, w, h, iconid, memAddressSafe(text), px, py);
    }

    /**
     * Calculates the corresponding text position for given coordinates {@code px/py} in a text field. See {@link #bndTextField TextField} for more info.
     *
     * @param ctx    the NanoVG context
     * @param iconid if &ge; 0, an icon will be added to the widget
     * @param text   if not {@code NULL}, text will be printed to the widget
     */
    public static int bndTextFieldTextPosition(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @Nullable @NativeType("char const *") CharSequence text, int px, int py) {
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

    /** Unsafe version of: {@link #bndTextField TextField} */
    public static native void nbndTextField(long ctx, float x, float y, float w, float h, int flags, int state, int iconid, long text, int cbegin, int cend);

    /**
     * Draws a text field with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx    the NanoVG context
     * @param h      widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param flags  the corner flags. One of:<br><table><tr><td>{@link #BND_CORNER_NONE CORNER_NONE}</td><td>{@link #BND_CORNER_TOP_LEFT CORNER_TOP_LEFT}</td><td>{@link #BND_CORNER_TOP_RIGHT CORNER_TOP_RIGHT}</td><td>{@link #BND_CORNER_DOWN_RIGHT CORNER_DOWN_RIGHT}</td><td>{@link #BND_CORNER_DOWN_LEFT CORNER_DOWN_LEFT}</td><td>{@link #BND_CORNER_ALL CORNER_ALL}</td></tr><tr><td>{@link #BND_CORNER_TOP CORNER_TOP}</td><td>{@link #BND_CORNER_DOWN CORNER_DOWN}</td><td>{@link #BND_CORNER_LEFT CORNER_LEFT}</td><td>{@link #BND_CORNER_RIGHT CORNER_RIGHT}</td></tr></table>
     * @param state  the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param iconid if &ge; 0, an icon will be added to the widget
     * @param text   if not {@code NULL}, text will be printed to the widget
     * @param cbegin must be &ge; 0 and &le; {@code strlen(text)} and denotes the beginning of the caret
     * @param cend   must be &ge; {@code cbegin} and &le; {@code strlen(text)} and denotes the end of the caret. If {@code cend} &lt; {@code cbegin}, then no caret will
     *               be drawn.
     */
    public static void bndTextField(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, int iconid, @Nullable @NativeType("char const *") ByteBuffer text, int cbegin, int cend) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(text);
        }
        nbndTextField(ctx, x, y, w, h, flags, state, iconid, memAddressSafe(text), cbegin, cend);
    }

    /**
     * Draws a text field with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx    the NanoVG context
     * @param h      widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param flags  the corner flags. One of:<br><table><tr><td>{@link #BND_CORNER_NONE CORNER_NONE}</td><td>{@link #BND_CORNER_TOP_LEFT CORNER_TOP_LEFT}</td><td>{@link #BND_CORNER_TOP_RIGHT CORNER_TOP_RIGHT}</td><td>{@link #BND_CORNER_DOWN_RIGHT CORNER_DOWN_RIGHT}</td><td>{@link #BND_CORNER_DOWN_LEFT CORNER_DOWN_LEFT}</td><td>{@link #BND_CORNER_ALL CORNER_ALL}</td></tr><tr><td>{@link #BND_CORNER_TOP CORNER_TOP}</td><td>{@link #BND_CORNER_DOWN CORNER_DOWN}</td><td>{@link #BND_CORNER_LEFT CORNER_LEFT}</td><td>{@link #BND_CORNER_RIGHT CORNER_RIGHT}</td></tr></table>
     * @param state  the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param iconid if &ge; 0, an icon will be added to the widget
     * @param text   if not {@code NULL}, text will be printed to the widget
     * @param cbegin must be &ge; 0 and &le; {@code strlen(text)} and denotes the beginning of the caret
     * @param cend   must be &ge; {@code cbegin} and &le; {@code strlen(text)} and denotes the end of the caret. If {@code cend} &lt; {@code cbegin}, then no caret will
     *               be drawn.
     */
    public static void bndTextField(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, int iconid, @Nullable @NativeType("char const *") CharSequence text, int cbegin, int cend) {
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

    /** Unsafe version of: {@link #bndOptionButton OptionButton} */
    public static native void nbndOptionButton(long ctx, float x, float y, float w, float h, int state, long label);

    /**
     * Draws an option button with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx   the NanoVG context
     * @param h     widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param state the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param label if not {@code NULL}, a label will be added to the widget
     */
    public static void bndOptionButton(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType("BNDwidgetState") int state, @Nullable @NativeType("char const *") ByteBuffer label) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        nbndOptionButton(ctx, x, y, w, h, state, memAddressSafe(label));
    }

    /**
     * Draws an option button with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx   the NanoVG context
     * @param h     widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param state the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param label if not {@code NULL}, a label will be added to the widget
     */
    public static void bndOptionButton(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType("BNDwidgetState") int state, @Nullable @NativeType("char const *") CharSequence label) {
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

    /** Unsafe version of: {@link #bndChoiceButton ChoiceButton} */
    public static native void nbndChoiceButton(long ctx, float x, float y, float w, float h, int flags, int state, int iconid, long label);

    /**
     * Draws a choice button with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx    the NanoVG context
     * @param h      widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param flags  the corner flags. One of:<br><table><tr><td>{@link #BND_CORNER_NONE CORNER_NONE}</td><td>{@link #BND_CORNER_TOP_LEFT CORNER_TOP_LEFT}</td><td>{@link #BND_CORNER_TOP_RIGHT CORNER_TOP_RIGHT}</td><td>{@link #BND_CORNER_DOWN_RIGHT CORNER_DOWN_RIGHT}</td><td>{@link #BND_CORNER_DOWN_LEFT CORNER_DOWN_LEFT}</td><td>{@link #BND_CORNER_ALL CORNER_ALL}</td></tr><tr><td>{@link #BND_CORNER_TOP CORNER_TOP}</td><td>{@link #BND_CORNER_DOWN CORNER_DOWN}</td><td>{@link #BND_CORNER_LEFT CORNER_LEFT}</td><td>{@link #BND_CORNER_RIGHT CORNER_RIGHT}</td></tr></table>
     * @param state  the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param iconid if &ge; 0, an icon will be added to the widget
     * @param label  if not {@code NULL}, a label will be added to the widget
     */
    public static void bndChoiceButton(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, int iconid, @Nullable @NativeType("char const *") ByteBuffer label) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        nbndChoiceButton(ctx, x, y, w, h, flags, state, iconid, memAddressSafe(label));
    }

    /**
     * Draws a choice button with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx    the NanoVG context
     * @param h      widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param flags  the corner flags. One of:<br><table><tr><td>{@link #BND_CORNER_NONE CORNER_NONE}</td><td>{@link #BND_CORNER_TOP_LEFT CORNER_TOP_LEFT}</td><td>{@link #BND_CORNER_TOP_RIGHT CORNER_TOP_RIGHT}</td><td>{@link #BND_CORNER_DOWN_RIGHT CORNER_DOWN_RIGHT}</td><td>{@link #BND_CORNER_DOWN_LEFT CORNER_DOWN_LEFT}</td><td>{@link #BND_CORNER_ALL CORNER_ALL}</td></tr><tr><td>{@link #BND_CORNER_TOP CORNER_TOP}</td><td>{@link #BND_CORNER_DOWN CORNER_DOWN}</td><td>{@link #BND_CORNER_LEFT CORNER_LEFT}</td><td>{@link #BND_CORNER_RIGHT CORNER_RIGHT}</td></tr></table>
     * @param state  the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param iconid if &ge; 0, an icon will be added to the widget
     * @param label  if not {@code NULL}, a label will be added to the widget
     */
    public static void bndChoiceButton(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, int iconid, @Nullable @NativeType("char const *") CharSequence label) {
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

    /** Unsafe version of: {@link #bndColorButton ColorButton} */
    public static native void nbndColorButton(long ctx, float x, float y, float w, float h, int flags, long color);

    /**
     * Draws a color button with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx   the NanoVG context
     * @param h     widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param flags the corner flags. One of:<br><table><tr><td>{@link #BND_CORNER_NONE CORNER_NONE}</td><td>{@link #BND_CORNER_TOP_LEFT CORNER_TOP_LEFT}</td><td>{@link #BND_CORNER_TOP_RIGHT CORNER_TOP_RIGHT}</td><td>{@link #BND_CORNER_DOWN_RIGHT CORNER_DOWN_RIGHT}</td><td>{@link #BND_CORNER_DOWN_LEFT CORNER_DOWN_LEFT}</td><td>{@link #BND_CORNER_ALL CORNER_ALL}</td></tr><tr><td>{@link #BND_CORNER_TOP CORNER_TOP}</td><td>{@link #BND_CORNER_DOWN CORNER_DOWN}</td><td>{@link #BND_CORNER_LEFT CORNER_LEFT}</td><td>{@link #BND_CORNER_RIGHT CORNER_RIGHT}</td></tr></table>
     */
    public static void bndColorButton(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("NVGcolor") NVGColor color) {
        if (CHECKS) {
            check(ctx);
        }
        nbndColorButton(ctx, x, y, w, h, flags, color.address());
    }

    // --- [ bndNumberField ] ---

    /** Unsafe version of: {@link #bndNumberField NumberField} */
    public static native void nbndNumberField(long ctx, float x, float y, float w, float h, int flags, int state, long label, long value);

    /**
     * Draws a number field with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx   the NanoVG context
     * @param h     widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param flags the corner flags. One of:<br><table><tr><td>{@link #BND_CORNER_NONE CORNER_NONE}</td><td>{@link #BND_CORNER_TOP_LEFT CORNER_TOP_LEFT}</td><td>{@link #BND_CORNER_TOP_RIGHT CORNER_TOP_RIGHT}</td><td>{@link #BND_CORNER_DOWN_RIGHT CORNER_DOWN_RIGHT}</td><td>{@link #BND_CORNER_DOWN_LEFT CORNER_DOWN_LEFT}</td><td>{@link #BND_CORNER_ALL CORNER_ALL}</td></tr><tr><td>{@link #BND_CORNER_TOP CORNER_TOP}</td><td>{@link #BND_CORNER_DOWN CORNER_DOWN}</td><td>{@link #BND_CORNER_LEFT CORNER_LEFT}</td><td>{@link #BND_CORNER_RIGHT CORNER_RIGHT}</td></tr></table>
     * @param state the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param label if not {@code NULL}, a label will be added to the widget
     * @param value if not {@code NULL}, a value will be added to the widget along with a ":" separator
     */
    public static void bndNumberField(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, @Nullable @NativeType("char const *") ByteBuffer label, @Nullable @NativeType("char const *") ByteBuffer value) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
            checkNT1Safe(value);
        }
        nbndNumberField(ctx, x, y, w, h, flags, state, memAddressSafe(label), memAddressSafe(value));
    }

    /**
     * Draws a number field with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx   the NanoVG context
     * @param h     widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param flags the corner flags. One of:<br><table><tr><td>{@link #BND_CORNER_NONE CORNER_NONE}</td><td>{@link #BND_CORNER_TOP_LEFT CORNER_TOP_LEFT}</td><td>{@link #BND_CORNER_TOP_RIGHT CORNER_TOP_RIGHT}</td><td>{@link #BND_CORNER_DOWN_RIGHT CORNER_DOWN_RIGHT}</td><td>{@link #BND_CORNER_DOWN_LEFT CORNER_DOWN_LEFT}</td><td>{@link #BND_CORNER_ALL CORNER_ALL}</td></tr><tr><td>{@link #BND_CORNER_TOP CORNER_TOP}</td><td>{@link #BND_CORNER_DOWN CORNER_DOWN}</td><td>{@link #BND_CORNER_LEFT CORNER_LEFT}</td><td>{@link #BND_CORNER_RIGHT CORNER_RIGHT}</td></tr></table>
     * @param state the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param label if not {@code NULL}, a label will be added to the widget
     * @param value if not {@code NULL}, a value will be added to the widget along with a ":" separator
     */
    public static void bndNumberField(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, @Nullable @NativeType("char const *") CharSequence label, @Nullable @NativeType("char const *") CharSequence value) {
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

    /** Unsafe version of: {@link #bndSlider Slider} */
    public static native void nbndSlider(long ctx, float x, float y, float w, float h, int flags, int state, float progress, long label, long value);

    /**
     * Draws slider control with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx      the NanoVG context
     * @param h        widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param flags    the corner flags. One of:<br><table><tr><td>{@link #BND_CORNER_NONE CORNER_NONE}</td><td>{@link #BND_CORNER_TOP_LEFT CORNER_TOP_LEFT}</td><td>{@link #BND_CORNER_TOP_RIGHT CORNER_TOP_RIGHT}</td><td>{@link #BND_CORNER_DOWN_RIGHT CORNER_DOWN_RIGHT}</td><td>{@link #BND_CORNER_DOWN_LEFT CORNER_DOWN_LEFT}</td><td>{@link #BND_CORNER_ALL CORNER_ALL}</td></tr><tr><td>{@link #BND_CORNER_TOP CORNER_TOP}</td><td>{@link #BND_CORNER_DOWN CORNER_DOWN}</td><td>{@link #BND_CORNER_LEFT CORNER_LEFT}</td><td>{@link #BND_CORNER_RIGHT CORNER_RIGHT}</td></tr></table>
     * @param state    the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param progress must be in the range {@code 0..1} and controls the size of the slider bar
     * @param label    if not {@code NULL}, a label will be added to the widget
     * @param value    if not {@code NULL}, a value will be added to the widget along with a ":" separator
     */
    public static void bndSlider(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, float progress, @Nullable @NativeType("char const *") ByteBuffer label, @Nullable @NativeType("char const *") ByteBuffer value) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
            checkNT1Safe(value);
        }
        nbndSlider(ctx, x, y, w, h, flags, state, progress, memAddressSafe(label), memAddressSafe(value));
    }

    /**
     * Draws slider control with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx      the NanoVG context
     * @param h        widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param flags    the corner flags. One of:<br><table><tr><td>{@link #BND_CORNER_NONE CORNER_NONE}</td><td>{@link #BND_CORNER_TOP_LEFT CORNER_TOP_LEFT}</td><td>{@link #BND_CORNER_TOP_RIGHT CORNER_TOP_RIGHT}</td><td>{@link #BND_CORNER_DOWN_RIGHT CORNER_DOWN_RIGHT}</td><td>{@link #BND_CORNER_DOWN_LEFT CORNER_DOWN_LEFT}</td><td>{@link #BND_CORNER_ALL CORNER_ALL}</td></tr><tr><td>{@link #BND_CORNER_TOP CORNER_TOP}</td><td>{@link #BND_CORNER_DOWN CORNER_DOWN}</td><td>{@link #BND_CORNER_LEFT CORNER_LEFT}</td><td>{@link #BND_CORNER_RIGHT CORNER_RIGHT}</td></tr></table>
     * @param state    the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param progress must be in the range {@code 0..1} and controls the size of the slider bar
     * @param label    if not {@code NULL}, a label will be added to the widget
     * @param value    if not {@code NULL}, a value will be added to the widget along with a ":" separator
     */
    public static void bndSlider(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags, @NativeType("BNDwidgetState") int state, float progress, @Nullable @NativeType("char const *") CharSequence label, @Nullable @NativeType("char const *") CharSequence value) {
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

    /** Unsafe version of: {@link #bndScrollBar ScrollBar} */
    public static native void nbndScrollBar(long ctx, float x, float y, float w, float h, int state, float offset, float size);

    /**
     * Draws scrollbar with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx    the NanoVG context
     * @param w      vertical widget looks best when width is {@link #BND_SCROLLBAR_WIDTH SCROLLBAR_WIDTH}
     * @param h      horizontal widget looks best when height is {@link #BND_SCROLLBAR_HEIGHT SCROLLBAR_HEIGHT}
     * @param state  the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param offset is in the range {@code 0..1} and controls the position of the scroll handle
     * @param size   is in the range {@code 0..1} and controls the size of the scroll handle
     */
    public static void bndScrollBar(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType("BNDwidgetState") int state, float offset, float size) {
        if (CHECKS) {
            check(ctx);
        }
        nbndScrollBar(ctx, x, y, w, h, state, offset, size);
    }

    // --- [ bndMenuBackground ] ---

    /** Unsafe version of: {@link #bndMenuBackground MenuBackground} */
    public static native void nbndMenuBackground(long ctx, float x, float y, float w, float h, int flags);

    /**
     * Draws a menu background with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx   the NanoVG context
     * @param flags the corner flags. One of:<br><table><tr><td>{@link #BND_CORNER_NONE CORNER_NONE}</td><td>{@link #BND_CORNER_TOP_LEFT CORNER_TOP_LEFT}</td><td>{@link #BND_CORNER_TOP_RIGHT CORNER_TOP_RIGHT}</td><td>{@link #BND_CORNER_DOWN_RIGHT CORNER_DOWN_RIGHT}</td><td>{@link #BND_CORNER_DOWN_LEFT CORNER_DOWN_LEFT}</td><td>{@link #BND_CORNER_ALL CORNER_ALL}</td></tr><tr><td>{@link #BND_CORNER_TOP CORNER_TOP}</td><td>{@link #BND_CORNER_DOWN CORNER_DOWN}</td><td>{@link #BND_CORNER_LEFT CORNER_LEFT}</td><td>{@link #BND_CORNER_RIGHT CORNER_RIGHT}</td></tr></table>
     */
    public static void bndMenuBackground(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int flags) {
        if (CHECKS) {
            check(ctx);
        }
        nbndMenuBackground(ctx, x, y, w, h, flags);
    }

    // --- [ bndMenuLabel ] ---

    /** Unsafe version of: {@link #bndMenuLabel MenuLabel} */
    public static native void nbndMenuLabel(long ctx, float x, float y, float w, float h, int iconid, long label);

    /**
     * Draws a menu label with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx    the NanoVG context
     * @param h      widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param iconid if &ge; 0, an icon will be added to the widget
     * @param label  if not {@code NULL}, a label will be added to the widget
     */
    public static void bndMenuLabel(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @Nullable @NativeType("char const *") ByteBuffer label) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        nbndMenuLabel(ctx, x, y, w, h, iconid, memAddressSafe(label));
    }

    /**
     * Draws a menu label with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx    the NanoVG context
     * @param h      widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param iconid if &ge; 0, an icon will be added to the widget
     * @param label  if not {@code NULL}, a label will be added to the widget
     */
    public static void bndMenuLabel(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @Nullable @NativeType("char const *") CharSequence label) {
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

    /** Unsafe version of: {@link #bndMenuItem MenuItem} */
    public static native void nbndMenuItem(long ctx, float x, float y, float w, float h, int state, int iconid, long label);

    /**
     * Draws a menu item with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx    the NanoVG context
     * @param h      widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param state  the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param iconid if &ge; 0, an icon will be added to the widget
     * @param label  if not {@code NULL}, a label will be added to the widget
     */
    public static void bndMenuItem(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType("BNDwidgetState") int state, int iconid, @Nullable @NativeType("char const *") ByteBuffer label) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        nbndMenuItem(ctx, x, y, w, h, state, iconid, memAddressSafe(label));
    }

    /**
     * Draws a menu item with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx    the NanoVG context
     * @param h      widget looks best when height is {@link #BND_WIDGET_HEIGHT WIDGET_HEIGHT}
     * @param state  the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param iconid if &ge; 0, an icon will be added to the widget
     * @param label  if not {@code NULL}, a label will be added to the widget
     */
    public static void bndMenuItem(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType("BNDwidgetState") int state, int iconid, @Nullable @NativeType("char const *") CharSequence label) {
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

    /** Unsafe version of: {@link #bndTooltipBackground TooltipBackground} */
    public static native void nbndTooltipBackground(long ctx, float x, float y, float w, float h);

    /**
     * Draws a tooltip background with its lower left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx the NanoVG context
     */
    public static void bndTooltipBackground(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (CHECKS) {
            check(ctx);
        }
        nbndTooltipBackground(ctx, x, y, w, h);
    }

    // --- [ bndNodePort ] ---

    /** Unsafe version of: {@link #bndNodePort NodePort} */
    public static native void nbndNodePort(long ctx, float x, float y, int state, long color);

    /**
     * Draws a node port at the given position filled with the given color.
     *
     * @param ctx   the NanoVG context
     * @param state the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     */
    public static void bndNodePort(@NativeType("NVGcontext *") long ctx, float x, float y, @NativeType("BNDwidgetState") int state, @NativeType("NVGcolor") NVGColor color) {
        if (CHECKS) {
            check(ctx);
        }
        nbndNodePort(ctx, x, y, state, color.address());
    }

    // --- [ bndNodeWire ] ---

    /** Unsafe version of: {@link #bndNodeWire NodeWire} */
    public static native void nbndNodeWire(long ctx, float x0, float y0, float x1, float y1, int state0, int state1);

    /**
     * Draws a node wire originating at {@code (x0,y0)} and floating to {@code (x1,y1)}, with a colored gradient based on the states {@code state0} and
     * {@code state1}:
     * 
     * <ul>
     * <li>{@link #BND_DEFAULT DEFAULT}: default wire color</li>
     * <li>{@link #BND_HOVER HOVER}: selected wire color</li>
     * <li>{@link #BND_ACTIVE ACTIVE}: dragged wire color</li>
     * </ul>
     *
     * @param ctx    the NanoVG context
     * @param state0 origin wire color. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param state1 ending wire color. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     */
    public static void bndNodeWire(@NativeType("NVGcontext *") long ctx, float x0, float y0, float x1, float y1, @NativeType("BNDwidgetState") int state0, @NativeType("BNDwidgetState") int state1) {
        if (CHECKS) {
            check(ctx);
        }
        nbndNodeWire(ctx, x0, y0, x1, y1, state0, state1);
    }

    // --- [ bndColoredNodeWire ] ---

    /** Unsafe version of: {@link #bndColoredNodeWire ColoredNodeWire} */
    public static native void nbndColoredNodeWire(long ctx, float x0, float y0, float x1, float y1, long color0, long color1);

    /**
     * Draws a node wire originating at {@code (x0,y0)} and floating to {@code (x1,y1)}, with a colored gradient based on the two colors {@code color0} and
     * {@code color1}.
     *
     * @param ctx the NanoVG context
     */
    public static void bndColoredNodeWire(@NativeType("NVGcontext *") long ctx, float x0, float y0, float x1, float y1, @NativeType("NVGcolor") NVGColor color0, @NativeType("NVGcolor") NVGColor color1) {
        if (CHECKS) {
            check(ctx);
        }
        nbndColoredNodeWire(ctx, x0, y0, x1, y1, color0.address(), color1.address());
    }

    // --- [ bndNodeBackground ] ---

    /** Unsafe version of: {@link #bndNodeBackground NodeBackground} */
    public static native void nbndNodeBackground(long ctx, float x, float y, float w, float h, int state, int iconid, long label, long titleColor);

    /**
     * Draws a node background with its upper left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx        the NanoVG context
     * @param state      the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param iconid     if &ge; 0, an icon will be added to the widget
     * @param label      if not {@code NULL}, a label will be added to the widget
     * @param titleColor provides the base color for the title bar
     */
    public static void bndNodeBackground(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType("BNDwidgetState") int state, int iconid, @Nullable @NativeType("char const *") ByteBuffer label, @NativeType("NVGcolor") NVGColor titleColor) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        nbndNodeBackground(ctx, x, y, w, h, state, iconid, memAddressSafe(label), titleColor.address());
    }

    /**
     * Draws a node background with its upper left origin at {@code (x,y)} and size of {@code (w,h)}.
     *
     * @param ctx        the NanoVG context
     * @param state      the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param iconid     if &ge; 0, an icon will be added to the widget
     * @param label      if not {@code NULL}, a label will be added to the widget
     * @param titleColor provides the base color for the title bar
     */
    public static void bndNodeBackground(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType("BNDwidgetState") int state, int iconid, @Nullable @NativeType("char const *") CharSequence label, @NativeType("NVGcolor") NVGColor titleColor) {
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

    /** Unsafe version of: {@link #bndSplitterWidgets SplitterWidgets} */
    public static native void nbndSplitterWidgets(long ctx, float x, float y, float w, float h);

    /**
     * Draws a window with the upper right and lower left splitter widgets into the rectangle at origin {@code (x,y)} and size {@code (w, h)}.
     *
     * @param ctx the NanoVG context
     */
    public static void bndSplitterWidgets(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (CHECKS) {
            check(ctx);
        }
        nbndSplitterWidgets(ctx, x, y, w, h);
    }

    // --- [ bndJoinAreaOverlay ] ---

    /** Unsafe version of: {@link #bndJoinAreaOverlay JoinAreaOverlay} */
    public static native void nbndJoinAreaOverlay(long ctx, float x, float y, float w, float h, int vertical, int mirror);

    /**
     * Draws the join area overlay stencil into the rectangle at origin {@code (x,y)} and size {@code (w,h)}.
     *
     * @param ctx      the NanoVG context
     * @param vertical is 0 or 1 and designates the arrow orientation
     * @param mirror   is 0 or 1 and flips the arrow side
     */
    public static void bndJoinAreaOverlay(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, @NativeType("int") boolean vertical, @NativeType("int") boolean mirror) {
        if (CHECKS) {
            check(ctx);
        }
        nbndJoinAreaOverlay(ctx, x, y, w, h, vertical ? 1 : 0, mirror ? 1 : 0);
    }

    // --- [ bndLabelWidth ] ---

    /** Unsafe version of: {@link #bndLabelWidth LabelWidth} */
    public static native float nbndLabelWidth(long ctx, int iconid, long label);

    /**
     * Returns the ideal width for a label with given icon and text
     *
     * @param ctx the NanoVG context
     */
    public static float bndLabelWidth(@NativeType("NVGcontext *") long ctx, int iconid, @Nullable @NativeType("char const *") ByteBuffer label) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        return nbndLabelWidth(ctx, iconid, memAddressSafe(label));
    }

    /**
     * Returns the ideal width for a label with given icon and text
     *
     * @param ctx the NanoVG context
     */
    public static float bndLabelWidth(@NativeType("NVGcontext *") long ctx, int iconid, @Nullable @NativeType("char const *") CharSequence label) {
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

    /** Unsafe version of: {@link #bndLabelHeight LabelHeight} */
    public static native float nbndLabelHeight(long ctx, int iconid, long label, float width);

    /**
     * Returns the height for a label with given icon, text and width; this function is primarily useful in conjunction with multiline labels and textboxes.
     *
     * @param ctx the NanoVG context
     */
    public static float bndLabelHeight(@NativeType("NVGcontext *") long ctx, int iconid, @Nullable @NativeType("char const *") ByteBuffer label, float width) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        return nbndLabelHeight(ctx, iconid, memAddressSafe(label), width);
    }

    /**
     * Returns the height for a label with given icon, text and width; this function is primarily useful in conjunction with multiline labels and textboxes.
     *
     * @param ctx the NanoVG context
     */
    public static float bndLabelHeight(@NativeType("NVGcontext *") long ctx, int iconid, @Nullable @NativeType("char const *") CharSequence label, float width) {
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

    /** Unsafe version of: {@link #bndTransparent Transparent} */
    public static native void nbndTransparent(long color, long __result);

    /** Makes color transparent using the default alpha value. */
    @NativeType("NVGcolor")
    public static NVGColor bndTransparent(@NativeType("NVGcolor") NVGColor color, @NativeType("NVGcolor") NVGColor __result) {
        nbndTransparent(color.address(), __result.address());
        return __result;
    }

    // --- [ bndOffsetColor ] ---

    /** Unsafe version of: {@link #bndOffsetColor OffsetColor} */
    public static native void nbndOffsetColor(long color, int delta, long __result);

    /**
     * Offsets a color by a given integer delta.
     *
     * @param delta in the range -100 to 100
     */
    @NativeType("NVGcolor")
    public static NVGColor bndOffsetColor(@NativeType("NVGcolor") NVGColor color, int delta, @NativeType("NVGcolor") NVGColor __result) {
        nbndOffsetColor(color.address(), delta, __result.address());
        return __result;
    }

    // --- [ bndSelectCorners ] ---

    /** Unsafe version of: {@link #bndSelectCorners SelectCorners} */
    public static native void nbndSelectCorners(long radiuses, float r, int flags);

    /**
     * Assigns radius {@code r} to the four entries of array {@code radiuses} depending on whether the corner is marked as sharp or not.
     *
     * @param flags the corner flags. One of:<br><table><tr><td>{@link #BND_CORNER_NONE CORNER_NONE}</td><td>{@link #BND_CORNER_TOP_LEFT CORNER_TOP_LEFT}</td><td>{@link #BND_CORNER_TOP_RIGHT CORNER_TOP_RIGHT}</td><td>{@link #BND_CORNER_DOWN_RIGHT CORNER_DOWN_RIGHT}</td><td>{@link #BND_CORNER_DOWN_LEFT CORNER_DOWN_LEFT}</td><td>{@link #BND_CORNER_ALL CORNER_ALL}</td></tr><tr><td>{@link #BND_CORNER_TOP CORNER_TOP}</td><td>{@link #BND_CORNER_DOWN CORNER_DOWN}</td><td>{@link #BND_CORNER_LEFT CORNER_LEFT}</td><td>{@link #BND_CORNER_RIGHT CORNER_RIGHT}</td></tr></table>
     */
    public static void bndSelectCorners(@NativeType("float *") FloatBuffer radiuses, float r, int flags) {
        if (CHECKS) {
            check(radiuses, 4);
        }
        nbndSelectCorners(memAddress(radiuses), r, flags);
    }

    // --- [ bndInnerColors ] ---

    /** Unsafe version of: {@link #bndInnerColors InnerColors} */
    public static native void nbndInnerColors(long shade_top, long shade_down, long theme, int state, int flipActive);

    /**
     * Computes the upper and lower gradient colors for the inner box from a widget theme and the widgets state.
     *
     * @param state      the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     * @param flipActive if set and the {@code state} is {@link #BND_ACTIVE ACTIVE}, the upper and lower colors will be swapped
     */
    public static void bndInnerColors(@NativeType("NVGcolor *") NVGColor shade_top, @NativeType("NVGcolor *") NVGColor shade_down, @NativeType("BNDwidgetTheme const *") BNDwidgetTheme theme, @NativeType("BNDwidgetState") int state, @NativeType("int") boolean flipActive) {
        nbndInnerColors(shade_top.address(), shade_down.address(), theme.address(), state, flipActive ? 1 : 0);
    }

    // --- [ bndTextColor ] ---

    /** Unsafe version of: {@link #bndTextColor TextColor} */
    public static native void nbndTextColor(long theme, int state, long __result);

    /**
     * Computes the text color for a widget label from a widget theme and the widgets state.
     *
     * @param state the current UI state. One of:<br><table><tr><td>{@link #BND_DEFAULT DEFAULT}</td><td>{@link #BND_HOVER HOVER}</td><td>{@link #BND_ACTIVE ACTIVE}</td></tr></table>
     */
    @NativeType("NVGcolor")
    public static NVGColor bndTextColor(@NativeType("BNDwidgetTheme const *") BNDwidgetTheme theme, @NativeType("BNDwidgetState") int state, @NativeType("NVGcolor") NVGColor __result) {
        nbndTextColor(theme.address(), state, __result.address());
        return __result;
    }

    // --- [ bndScrollHandleRect ] ---

    /** Unsafe version of: {@link #bndScrollHandleRect ScrollHandleRect} */
    public static native void nbndScrollHandleRect(long x, long y, long w, long h, float offset, float size);

    /**
     * Computes the bounds of the scrollbar handle from the scrollbar size and the handle's offset and size.
     *
     * @param offset is in the range {@code 0..1} and defines the position of the scroll handle
     * @param size   is in the range {@code 0..1} and defines the size of the scroll handle
     */
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

    /** Unsafe version of: {@link #bndRoundedBox RoundedBox} */
    public static native void nbndRoundedBox(long ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3);

    /**
     * Adds a rounded box path at position {@code (x,y)} with size {@code (w,h)} and a separate radius for each corner listed in clockwise order, so that
     * {@code cr0} = top left, {@code cr1} = top right, {@code cr2} = bottom right, {@code cr3} = bottom left; this is a low level drawing function: the path
     * must be stroked or filled to become visible.
     *
     * @param ctx the NanoVG context
     */
    public static void bndRoundedBox(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3) {
        if (CHECKS) {
            check(ctx);
        }
        nbndRoundedBox(ctx, x, y, w, h, cr0, cr1, cr2, cr3);
    }

    // --- [ bndBackground ] ---

    /** Unsafe version of: {@link #bndBackground Background} */
    public static native void nbndBackground(long ctx, float x, float y, float w, float h);

    /**
     * Draws a flat panel without any decorations at position {@code (x,y)} with size {@code (w,h)} and fills it with {@code backgroundColor}.
     *
     * @param ctx the NanoVG context
     */
    public static void bndBackground(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (CHECKS) {
            check(ctx);
        }
        nbndBackground(ctx, x, y, w, h);
    }

    // --- [ bndBevel ] ---

    /** Unsafe version of: {@link #bndBevel Bevel} */
    public static native void nbndBevel(long ctx, float x, float y, float w, float h);

    /**
     * Draws a beveled border at position {@code (x,y)} with size {@code (w,h)} shaded with lighter and darker versions of {@code backgroundColor}.
     *
     * @param ctx the NanoVG context
     */
    public static void bndBevel(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (CHECKS) {
            check(ctx);
        }
        nbndBevel(ctx, x, y, w, h);
    }

    // --- [ bndBevelInset ] ---

    /** Unsafe version of: {@link #bndBevelInset BevelInset} */
    public static native void nbndBevelInset(long ctx, float x, float y, float w, float h, float cr2, float cr3);

    /**
     * Draws a lower inset for a rounded box at position {@code (x,y)} with size {@code (w,h)} that gives the impression the surface has been pushed in.
     * {@code cr2} and {@code cr3} contain the radiuses of the bottom right and bottom left corners of the rounded box.
     *
     * @param ctx the NanoVG context
     */
    public static void bndBevelInset(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, float cr2, float cr3) {
        if (CHECKS) {
            check(ctx);
        }
        nbndBevelInset(ctx, x, y, w, h, cr2, cr3);
    }

    // --- [ bndIcon ] ---

    /** Unsafe version of: {@link #bndIcon Icon} */
    public static native void nbndIcon(long ctx, float x, float y, int iconid);

    /**
     * Draws an icon with {@code (x,y)} as its upper left coordinate.
     *
     * @param ctx    the NanoVG context
     * @param iconid selects the icon from the sheet. One of:<br><table><tr><td>{@link #BND_ICON_NONE ICON_NONE}</td><td>{@link #BND_ICON_QUESTION ICON_QUESTION}</td><td>{@link #BND_ICON_ERROR ICON_ERROR}</td><td>{@link #BND_ICON_CANCEL ICON_CANCEL}</td><td>{@link #BND_ICON_TRIA_RIGHT ICON_TRIA_RIGHT}</td></tr><tr><td>{@link #BND_ICON_TRIA_DOWN ICON_TRIA_DOWN}</td><td>{@link #BND_ICON_TRIA_LEFT ICON_TRIA_LEFT}</td><td>{@link #BND_ICON_TRIA_UP ICON_TRIA_UP}</td><td>{@link #BND_ICON_ARROW_LEFTRIGHT ICON_ARROW_LEFTRIGHT}</td><td>{@link #BND_ICON_PLUS ICON_PLUS}</td></tr><tr><td>{@link #BND_ICON_DISCLOSURE_TRI_DOWN ICON_DISCLOSURE_TRI_DOWN}</td><td>{@link #BND_ICON_DISCLOSURE_TRI_RIGHT ICON_DISCLOSURE_TRI_RIGHT}</td><td>{@link #BND_ICON_RADIOBUT_OFF ICON_RADIOBUT_OFF}</td><td>{@link #BND_ICON_RADIOBUT_ON ICON_RADIOBUT_ON}</td><td>{@link #BND_ICON_MENU_PANEL ICON_MENU_PANEL}</td></tr><tr><td>{@link #BND_ICON_BLENDER ICON_BLENDER}</td><td>{@link #BND_ICON_GRIP ICON_GRIP}</td><td>{@link #BND_ICON_DOT ICON_DOT}</td><td>{@link #BND_ICON_COLLAPSEMENU ICON_COLLAPSEMENU}</td><td>{@link #BND_ICON_X ICON_X}</td></tr><tr><td>{@link #BND_ICON_GO_LEFT ICON_GO_LEFT}</td><td>{@link #BND_ICON_PLUG ICON_PLUG}</td><td>{@link #BND_ICON_UI ICON_UI}</td><td>{@link #BND_ICON_NODE ICON_NODE}</td><td>{@link #BND_ICON_NODE_SEL ICON_NODE_SEL}</td></tr><tr><td>{@link #BND_ICON_FULLSCREEN ICON_FULLSCREEN}</td><td>{@link #BND_ICON_SPLITSCREEN ICON_SPLITSCREEN}</td><td>{@link #BND_ICON_RIGHTARROW_THIN ICON_RIGHTARROW_THIN}</td><td>{@link #BND_ICON_BORDERMOVE ICON_BORDERMOVE}</td><td>{@link #BND_ICON_VIEWZOOM ICON_VIEWZOOM}</td></tr><tr><td>{@link #BND_ICON_ZOOMIN ICON_ZOOMIN}</td><td>{@link #BND_ICON_ZOOMOUT ICON_ZOOMOUT}</td><td>{@link #BND_ICON_PANEL_CLOSE ICON_PANEL_CLOSE}</td><td>{@link #BND_ICON_COPY_ID ICON_COPY_ID}</td><td>{@link #BND_ICON_EYEDROPPER ICON_EYEDROPPER}</td></tr><tr><td>{@link #BND_ICON_LINK_AREA ICON_LINK_AREA}</td><td>{@link #BND_ICON_AUTO ICON_AUTO}</td><td>{@link #BND_ICON_CHECKBOX_DEHLT ICON_CHECKBOX_DEHLT}</td><td>{@link #BND_ICON_CHECKBOX_HLT ICON_CHECKBOX_HLT}</td><td>{@link #BND_ICON_UNLOCKED ICON_UNLOCKED}</td></tr><tr><td>{@link #BND_ICON_LOCKED ICON_LOCKED}</td><td>{@link #BND_ICON_UNPINNED ICON_UNPINNED}</td><td>{@link #BND_ICON_PINNED ICON_PINNED}</td><td>{@link #BND_ICON_SCREEN_BACK ICON_SCREEN_BACK}</td><td>{@link #BND_ICON_RIGHTARROW ICON_RIGHTARROW}</td></tr><tr><td>{@link #BND_ICON_DOWNARROW_HLT ICON_DOWNARROW_HLT}</td><td>{@link #BND_ICON_DOTSUP ICON_DOTSUP}</td><td>{@link #BND_ICON_DOTSDOWN ICON_DOTSDOWN}</td><td>{@link #BND_ICON_LINK ICON_LINK}</td><td>{@link #BND_ICON_INLINK ICON_INLINK}</td></tr><tr><td>{@link #BND_ICON_PLUGIN ICON_PLUGIN}</td><td>{@link #BND_ICON_HELP ICON_HELP}</td><td>{@link #BND_ICON_GHOST_ENABLED ICON_GHOST_ENABLED}</td><td>{@link #BND_ICON_COLOR ICON_COLOR}</td><td>{@link #BND_ICON_LINKED ICON_LINKED}</td></tr><tr><td>{@link #BND_ICON_UNLINKED ICON_UNLINKED}</td><td>{@link #BND_ICON_HAND ICON_HAND}</td><td>{@link #BND_ICON_ZOOM_ALL ICON_ZOOM_ALL}</td><td>{@link #BND_ICON_ZOOM_SELECTED ICON_ZOOM_SELECTED}</td><td>{@link #BND_ICON_ZOOM_PREVIOUS ICON_ZOOM_PREVIOUS}</td></tr><tr><td>{@link #BND_ICON_ZOOM_IN ICON_ZOOM_IN}</td><td>{@link #BND_ICON_ZOOM_OUT ICON_ZOOM_OUT}</td><td>{@link #BND_ICON_RENDER_REGION ICON_RENDER_REGION}</td><td>{@link #BND_ICON_BORDER_RECT ICON_BORDER_RECT}</td><td>{@link #BND_ICON_BORDER_LASSO ICON_BORDER_LASSO}</td></tr><tr><td>{@link #BND_ICON_FREEZE ICON_FREEZE}</td><td>{@link #BND_ICON_STYLUS_PRESSURE ICON_STYLUS_PRESSURE}</td><td>{@link #BND_ICON_GHOST_DISABLED ICON_GHOST_DISABLED}</td><td>{@link #BND_ICON_NEW ICON_NEW}</td><td>{@link #BND_ICON_FILE_TICK ICON_FILE_TICK}</td></tr><tr><td>{@link #BND_ICON_QUIT ICON_QUIT}</td><td>{@link #BND_ICON_URL ICON_URL}</td><td>{@link #BND_ICON_RECOVER_LAST ICON_RECOVER_LAST}</td><td>{@link #BND_ICON_FULLSCREEN_ENTER ICON_FULLSCREEN_ENTER}</td><td>{@link #BND_ICON_FULLSCREEN_EXIT ICON_FULLSCREEN_EXIT}</td></tr><tr><td>{@link #BND_ICON_BLANK1 ICON_BLANK1}</td><td>{@link #BND_ICON_LAMP ICON_LAMP}</td><td>{@link #BND_ICON_MATERIAL ICON_MATERIAL}</td><td>{@link #BND_ICON_TEXTURE ICON_TEXTURE}</td><td>{@link #BND_ICON_ANIM ICON_ANIM}</td></tr><tr><td>{@link #BND_ICON_WORLD ICON_WORLD}</td><td>{@link #BND_ICON_SCENE ICON_SCENE}</td><td>{@link #BND_ICON_EDIT ICON_EDIT}</td><td>{@link #BND_ICON_GAME ICON_GAME}</td><td>{@link #BND_ICON_RADIO ICON_RADIO}</td></tr><tr><td>{@link #BND_ICON_SCRIPT ICON_SCRIPT}</td><td>{@link #BND_ICON_PARTICLES ICON_PARTICLES}</td><td>{@link #BND_ICON_PHYSICS ICON_PHYSICS}</td><td>{@link #BND_ICON_SPEAKER ICON_SPEAKER}</td><td>{@link #BND_ICON_TEXTURE_SHADED ICON_TEXTURE_SHADED}</td></tr><tr><td>{@link #BND_ICON_VIEW3D ICON_VIEW3D}</td><td>{@link #BND_ICON_IPO ICON_IPO}</td><td>{@link #BND_ICON_OOPS ICON_OOPS}</td><td>{@link #BND_ICON_BUTS ICON_BUTS}</td><td>{@link #BND_ICON_FILESEL ICON_FILESEL}</td></tr><tr><td>{@link #BND_ICON_IMAGE_COL ICON_IMAGE_COL}</td><td>{@link #BND_ICON_INFO ICON_INFO}</td><td>{@link #BND_ICON_SEQUENCE ICON_SEQUENCE}</td><td>{@link #BND_ICON_TEXT ICON_TEXT}</td><td>{@link #BND_ICON_IMASEL ICON_IMASEL}</td></tr><tr><td>{@link #BND_ICON_SOUND ICON_SOUND}</td><td>{@link #BND_ICON_ACTION ICON_ACTION}</td><td>{@link #BND_ICON_NLA ICON_NLA}</td><td>{@link #BND_ICON_SCRIPTWIN ICON_SCRIPTWIN}</td><td>{@link #BND_ICON_TIME ICON_TIME}</td></tr><tr><td>{@link #BND_ICON_NODETREE ICON_NODETREE}</td><td>{@link #BND_ICON_LOGIC ICON_LOGIC}</td><td>{@link #BND_ICON_CONSOLE ICON_CONSOLE}</td><td>{@link #BND_ICON_PREFERENCES ICON_PREFERENCES}</td><td>{@link #BND_ICON_CLIP ICON_CLIP}</td></tr><tr><td>{@link #BND_ICON_ASSET_MANAGER ICON_ASSET_MANAGER}</td><td>{@link #BND_ICON_OBJECT_DATAMODE ICON_OBJECT_DATAMODE}</td><td>{@link #BND_ICON_EDITMODE_HLT ICON_EDITMODE_HLT}</td><td>{@link #BND_ICON_FACESEL_HLT ICON_FACESEL_HLT}</td><td>{@link #BND_ICON_VPAINT_HLT ICON_VPAINT_HLT}</td></tr><tr><td>{@link #BND_ICON_TPAINT_HLT ICON_TPAINT_HLT}</td><td>{@link #BND_ICON_WPAINT_HLT ICON_WPAINT_HLT}</td><td>{@link #BND_ICON_SCULPTMODE_HLT ICON_SCULPTMODE_HLT}</td><td>{@link #BND_ICON_POSE_HLT ICON_POSE_HLT}</td><td>{@link #BND_ICON_PARTICLEMODE ICON_PARTICLEMODE}</td></tr><tr><td>{@link #BND_ICON_LIGHTPAINT ICON_LIGHTPAINT}</td><td>{@link #BND_ICON_SCENE_DATA ICON_SCENE_DATA}</td><td>{@link #BND_ICON_RENDERLAYERS ICON_RENDERLAYERS}</td><td>{@link #BND_ICON_WORLD_DATA ICON_WORLD_DATA}</td><td>{@link #BND_ICON_OBJECT_DATA ICON_OBJECT_DATA}</td></tr><tr><td>{@link #BND_ICON_MESH_DATA ICON_MESH_DATA}</td><td>{@link #BND_ICON_CURVE_DATA ICON_CURVE_DATA}</td><td>{@link #BND_ICON_META_DATA ICON_META_DATA}</td><td>{@link #BND_ICON_LATTICE_DATA ICON_LATTICE_DATA}</td><td>{@link #BND_ICON_LAMP_DATA ICON_LAMP_DATA}</td></tr><tr><td>{@link #BND_ICON_MATERIAL_DATA ICON_MATERIAL_DATA}</td><td>{@link #BND_ICON_TEXTURE_DATA ICON_TEXTURE_DATA}</td><td>{@link #BND_ICON_ANIM_DATA ICON_ANIM_DATA}</td><td>{@link #BND_ICON_CAMERA_DATA ICON_CAMERA_DATA}</td><td>{@link #BND_ICON_PARTICLE_DATA ICON_PARTICLE_DATA}</td></tr><tr><td>{@link #BND_ICON_LIBRARY_DATA_DIRECT ICON_LIBRARY_DATA_DIRECT}</td><td>{@link #BND_ICON_GROUP ICON_GROUP}</td><td>{@link #BND_ICON_ARMATURE_DATA ICON_ARMATURE_DATA}</td><td>{@link #BND_ICON_POSE_DATA ICON_POSE_DATA}</td><td>{@link #BND_ICON_BONE_DATA ICON_BONE_DATA}</td></tr><tr><td>{@link #BND_ICON_CONSTRAINT ICON_CONSTRAINT}</td><td>{@link #BND_ICON_SHAPEKEY_DATA ICON_SHAPEKEY_DATA}</td><td>{@link #BND_ICON_CONSTRAINT_BONE ICON_CONSTRAINT_BONE}</td><td>{@link #BND_ICON_CAMERA_STEREO ICON_CAMERA_STEREO}</td><td>{@link #BND_ICON_PACKAGE ICON_PACKAGE}</td></tr><tr><td>{@link #BND_ICON_UGLYPACKAGE ICON_UGLYPACKAGE}</td><td>{@link #BND_ICON_BRUSH_DATA ICON_BRUSH_DATA}</td><td>{@link #BND_ICON_IMAGE_DATA ICON_IMAGE_DATA}</td><td>{@link #BND_ICON_FILE ICON_FILE}</td><td>{@link #BND_ICON_FCURVE ICON_FCURVE}</td></tr><tr><td>{@link #BND_ICON_FONT_DATA ICON_FONT_DATA}</td><td>{@link #BND_ICON_RENDER_RESULT ICON_RENDER_RESULT}</td><td>{@link #BND_ICON_SURFACE_DATA ICON_SURFACE_DATA}</td><td>{@link #BND_ICON_EMPTY_DATA ICON_EMPTY_DATA}</td><td>{@link #BND_ICON_SETTINGS ICON_SETTINGS}</td></tr><tr><td>{@link #BND_ICON_RENDER_ANIMATION ICON_RENDER_ANIMATION}</td><td>{@link #BND_ICON_RENDER_STILL ICON_RENDER_STILL}</td><td>{@link #BND_ICON_BOIDS ICON_BOIDS}</td><td>{@link #BND_ICON_STRANDS ICON_STRANDS}</td><td>{@link #BND_ICON_LIBRARY_DATA_INDIRECT ICON_LIBRARY_DATA_INDIRECT}</td></tr><tr><td>{@link #BND_ICON_GREASEPENCIL ICON_GREASEPENCIL}</td><td>{@link #BND_ICON_LINE_DATA ICON_LINE_DATA}</td><td>{@link #BND_ICON_GROUP_BONE ICON_GROUP_BONE}</td><td>{@link #BND_ICON_GROUP_VERTEX ICON_GROUP_VERTEX}</td><td>{@link #BND_ICON_GROUP_VCOL ICON_GROUP_VCOL}</td></tr><tr><td>{@link #BND_ICON_GROUP_UVS ICON_GROUP_UVS}</td><td>{@link #BND_ICON_RNA ICON_RNA}</td><td>{@link #BND_ICON_RNA_ADD ICON_RNA_ADD}</td><td>{@link #BND_ICON_OUTLINER_OB_EMPTY ICON_OUTLINER_OB_EMPTY}</td><td>{@link #BND_ICON_OUTLINER_OB_MESH ICON_OUTLINER_OB_MESH}</td></tr><tr><td>{@link #BND_ICON_OUTLINER_OB_CURVE ICON_OUTLINER_OB_CURVE}</td><td>{@link #BND_ICON_OUTLINER_OB_LATTICE ICON_OUTLINER_OB_LATTICE}</td><td>{@link #BND_ICON_OUTLINER_OB_META ICON_OUTLINER_OB_META}</td><td>{@link #BND_ICON_OUTLINER_OB_LAMP ICON_OUTLINER_OB_LAMP}</td><td>{@link #BND_ICON_OUTLINER_OB_CAMERA ICON_OUTLINER_OB_CAMERA}</td></tr><tr><td>{@link #BND_ICON_OUTLINER_OB_ARMATURE ICON_OUTLINER_OB_ARMATURE}</td><td>{@link #BND_ICON_OUTLINER_OB_FONT ICON_OUTLINER_OB_FONT}</td><td>{@link #BND_ICON_OUTLINER_OB_SURFACE ICON_OUTLINER_OB_SURFACE}</td><td>{@link #BND_ICON_OUTLINER_OB_SPEAKER ICON_OUTLINER_OB_SPEAKER}</td><td>{@link #BND_ICON_RESTRICT_VIEW_OFF ICON_RESTRICT_VIEW_OFF}</td></tr><tr><td>{@link #BND_ICON_RESTRICT_VIEW_ON ICON_RESTRICT_VIEW_ON}</td><td>{@link #BND_ICON_RESTRICT_SELECT_OFF ICON_RESTRICT_SELECT_OFF}</td><td>{@link #BND_ICON_RESTRICT_SELECT_ON ICON_RESTRICT_SELECT_ON}</td><td>{@link #BND_ICON_RESTRICT_RENDER_OFF ICON_RESTRICT_RENDER_OFF}</td><td>{@link #BND_ICON_RESTRICT_RENDER_ON ICON_RESTRICT_RENDER_ON}</td></tr><tr><td>{@link #BND_ICON_OUTLINER_DATA_EMPTY ICON_OUTLINER_DATA_EMPTY}</td><td>{@link #BND_ICON_OUTLINER_DATA_MESH ICON_OUTLINER_DATA_MESH}</td><td>{@link #BND_ICON_OUTLINER_DATA_CURVE ICON_OUTLINER_DATA_CURVE}</td><td>{@link #BND_ICON_OUTLINER_DATA_LATTICE ICON_OUTLINER_DATA_LATTICE}</td><td>{@link #BND_ICON_OUTLINER_DATA_META ICON_OUTLINER_DATA_META}</td></tr><tr><td>{@link #BND_ICON_OUTLINER_DATA_LAMP ICON_OUTLINER_DATA_LAMP}</td><td>{@link #BND_ICON_OUTLINER_DATA_CAMERA ICON_OUTLINER_DATA_CAMERA}</td><td>{@link #BND_ICON_OUTLINER_DATA_ARMATURE ICON_OUTLINER_DATA_ARMATURE}</td><td>{@link #BND_ICON_OUTLINER_DATA_FONT ICON_OUTLINER_DATA_FONT}</td><td>{@link #BND_ICON_OUTLINER_DATA_SURFACE ICON_OUTLINER_DATA_SURFACE}</td></tr><tr><td>{@link #BND_ICON_OUTLINER_DATA_SPEAKER ICON_OUTLINER_DATA_SPEAKER}</td><td>{@link #BND_ICON_OUTLINER_DATA_POSE ICON_OUTLINER_DATA_POSE}</td><td>{@link #BND_ICON_MESH_PLANE ICON_MESH_PLANE}</td><td>{@link #BND_ICON_MESH_CUBE ICON_MESH_CUBE}</td><td>{@link #BND_ICON_MESH_CIRCLE ICON_MESH_CIRCLE}</td></tr><tr><td>{@link #BND_ICON_MESH_UVSPHERE ICON_MESH_UVSPHERE}</td><td>{@link #BND_ICON_MESH_ICOSPHERE ICON_MESH_ICOSPHERE}</td><td>{@link #BND_ICON_MESH_GRID ICON_MESH_GRID}</td><td>{@link #BND_ICON_MESH_MONKEY ICON_MESH_MONKEY}</td><td>{@link #BND_ICON_MESH_CYLINDER ICON_MESH_CYLINDER}</td></tr><tr><td>{@link #BND_ICON_MESH_TORUS ICON_MESH_TORUS}</td><td>{@link #BND_ICON_MESH_CONE ICON_MESH_CONE}</td><td>{@link #BND_ICON_LAMP_POINT ICON_LAMP_POINT}</td><td>{@link #BND_ICON_LAMP_SUN ICON_LAMP_SUN}</td><td>{@link #BND_ICON_LAMP_SPOT ICON_LAMP_SPOT}</td></tr><tr><td>{@link #BND_ICON_LAMP_HEMI ICON_LAMP_HEMI}</td><td>{@link #BND_ICON_LAMP_AREA ICON_LAMP_AREA}</td><td>{@link #BND_ICON_META_EMPTY ICON_META_EMPTY}</td><td>{@link #BND_ICON_META_PLANE ICON_META_PLANE}</td><td>{@link #BND_ICON_META_CUBE ICON_META_CUBE}</td></tr><tr><td>{@link #BND_ICON_META_BALL ICON_META_BALL}</td><td>{@link #BND_ICON_META_ELLIPSOID ICON_META_ELLIPSOID}</td><td>{@link #BND_ICON_META_CAPSULE ICON_META_CAPSULE}</td><td>{@link #BND_ICON_SURFACE_NCURVE ICON_SURFACE_NCURVE}</td><td>{@link #BND_ICON_SURFACE_NCIRCLE ICON_SURFACE_NCIRCLE}</td></tr><tr><td>{@link #BND_ICON_SURFACE_NSURFACE ICON_SURFACE_NSURFACE}</td><td>{@link #BND_ICON_SURFACE_NCYLINDER ICON_SURFACE_NCYLINDER}</td><td>{@link #BND_ICON_SURFACE_NSPHERE ICON_SURFACE_NSPHERE}</td><td>{@link #BND_ICON_SURFACE_NTORUS ICON_SURFACE_NTORUS}</td><td>{@link #BND_ICON_CURVE_BEZCURVE ICON_CURVE_BEZCURVE}</td></tr><tr><td>{@link #BND_ICON_CURVE_BEZCIRCLE ICON_CURVE_BEZCIRCLE}</td><td>{@link #BND_ICON_CURVE_NCURVE ICON_CURVE_NCURVE}</td><td>{@link #BND_ICON_CURVE_NCIRCLE ICON_CURVE_NCIRCLE}</td><td>{@link #BND_ICON_CURVE_PATH ICON_CURVE_PATH}</td><td>{@link #BND_ICON_COLOR_RED ICON_COLOR_RED}</td></tr><tr><td>{@link #BND_ICON_COLOR_GREEN ICON_COLOR_GREEN}</td><td>{@link #BND_ICON_COLOR_BLUE ICON_COLOR_BLUE}</td><td>{@link #BND_ICON_FORCE_FORCE ICON_FORCE_FORCE}</td><td>{@link #BND_ICON_FORCE_WIND ICON_FORCE_WIND}</td><td>{@link #BND_ICON_FORCE_VORTEX ICON_FORCE_VORTEX}</td></tr><tr><td>{@link #BND_ICON_FORCE_MAGNETIC ICON_FORCE_MAGNETIC}</td><td>{@link #BND_ICON_FORCE_HARMONIC ICON_FORCE_HARMONIC}</td><td>{@link #BND_ICON_FORCE_CHARGE ICON_FORCE_CHARGE}</td><td>{@link #BND_ICON_FORCE_LENNARDJONES ICON_FORCE_LENNARDJONES}</td><td>{@link #BND_ICON_FORCE_TEXTURE ICON_FORCE_TEXTURE}</td></tr><tr><td>{@link #BND_ICON_FORCE_CURVE ICON_FORCE_CURVE}</td><td>{@link #BND_ICON_FORCE_BOID ICON_FORCE_BOID}</td><td>{@link #BND_ICON_FORCE_TURBULENCE ICON_FORCE_TURBULENCE}</td><td>{@link #BND_ICON_FORCE_DRAG ICON_FORCE_DRAG}</td><td>{@link #BND_ICON_FORCE_SMOKEFLOW ICON_FORCE_SMOKEFLOW}</td></tr><tr><td>{@link #BND_ICON_MODIFIER ICON_MODIFIER}</td><td>{@link #BND_ICON_MOD_WAVE ICON_MOD_WAVE}</td><td>{@link #BND_ICON_MOD_BUILD ICON_MOD_BUILD}</td><td>{@link #BND_ICON_MOD_DECIM ICON_MOD_DECIM}</td><td>{@link #BND_ICON_MOD_MIRROR ICON_MOD_MIRROR}</td></tr><tr><td>{@link #BND_ICON_MOD_SOFT ICON_MOD_SOFT}</td><td>{@link #BND_ICON_MOD_SUBSURF ICON_MOD_SUBSURF}</td><td>{@link #BND_ICON_HOOK ICON_HOOK}</td><td>{@link #BND_ICON_MOD_PHYSICS ICON_MOD_PHYSICS}</td><td>{@link #BND_ICON_MOD_PARTICLES ICON_MOD_PARTICLES}</td></tr><tr><td>{@link #BND_ICON_MOD_BOOLEAN ICON_MOD_BOOLEAN}</td><td>{@link #BND_ICON_MOD_EDGESPLIT ICON_MOD_EDGESPLIT}</td><td>{@link #BND_ICON_MOD_ARRAY ICON_MOD_ARRAY}</td><td>{@link #BND_ICON_MOD_UVPROJECT ICON_MOD_UVPROJECT}</td><td>{@link #BND_ICON_MOD_DISPLACE ICON_MOD_DISPLACE}</td></tr><tr><td>{@link #BND_ICON_MOD_CURVE ICON_MOD_CURVE}</td><td>{@link #BND_ICON_MOD_LATTICE ICON_MOD_LATTICE}</td><td>{@link #BND_ICON_CONSTRAINT_DATA ICON_CONSTRAINT_DATA}</td><td>{@link #BND_ICON_MOD_ARMATURE ICON_MOD_ARMATURE}</td><td>{@link #BND_ICON_MOD_SHRINKWRAP ICON_MOD_SHRINKWRAP}</td></tr><tr><td>{@link #BND_ICON_MOD_CAST ICON_MOD_CAST}</td><td>{@link #BND_ICON_MOD_MESHDEFORM ICON_MOD_MESHDEFORM}</td><td>{@link #BND_ICON_MOD_BEVEL ICON_MOD_BEVEL}</td><td>{@link #BND_ICON_MOD_SMOOTH ICON_MOD_SMOOTH}</td><td>{@link #BND_ICON_MOD_SIMPLEDEFORM ICON_MOD_SIMPLEDEFORM}</td></tr><tr><td>{@link #BND_ICON_MOD_MASK ICON_MOD_MASK}</td><td>{@link #BND_ICON_MOD_CLOTH ICON_MOD_CLOTH}</td><td>{@link #BND_ICON_MOD_EXPLODE ICON_MOD_EXPLODE}</td><td>{@link #BND_ICON_MOD_FLUIDSIM ICON_MOD_FLUIDSIM}</td><td>{@link #BND_ICON_MOD_MULTIRES ICON_MOD_MULTIRES}</td></tr><tr><td>{@link #BND_ICON_MOD_SMOKE ICON_MOD_SMOKE}</td><td>{@link #BND_ICON_MOD_SOLIDIFY ICON_MOD_SOLIDIFY}</td><td>{@link #BND_ICON_MOD_SCREW ICON_MOD_SCREW}</td><td>{@link #BND_ICON_MOD_VERTEX_WEIGHT ICON_MOD_VERTEX_WEIGHT}</td><td>{@link #BND_ICON_MOD_DYNAMICPAINT ICON_MOD_DYNAMICPAINT}</td></tr><tr><td>{@link #BND_ICON_MOD_REMESH ICON_MOD_REMESH}</td><td>{@link #BND_ICON_MOD_OCEAN ICON_MOD_OCEAN}</td><td>{@link #BND_ICON_MOD_WARP ICON_MOD_WARP}</td><td>{@link #BND_ICON_MOD_SKIN ICON_MOD_SKIN}</td><td>{@link #BND_ICON_MOD_TRIANGULATE ICON_MOD_TRIANGULATE}</td></tr><tr><td>{@link #BND_ICON_MOD_WIREFRAME ICON_MOD_WIREFRAME}</td><td>{@link #BND_ICON_REC ICON_REC}</td><td>{@link #BND_ICON_PLAY ICON_PLAY}</td><td>{@link #BND_ICON_FF ICON_FF}</td><td>{@link #BND_ICON_REW ICON_REW}</td></tr><tr><td>{@link #BND_ICON_PAUSE ICON_PAUSE}</td><td>{@link #BND_ICON_PREV_KEYFRAME ICON_PREV_KEYFRAME}</td><td>{@link #BND_ICON_NEXT_KEYFRAME ICON_NEXT_KEYFRAME}</td><td>{@link #BND_ICON_PLAY_AUDIO ICON_PLAY_AUDIO}</td><td>{@link #BND_ICON_PLAY_REVERSE ICON_PLAY_REVERSE}</td></tr><tr><td>{@link #BND_ICON_PREVIEW_RANGE ICON_PREVIEW_RANGE}</td><td>{@link #BND_ICON_ACTION_TWEAK ICON_ACTION_TWEAK}</td><td>{@link #BND_ICON_PMARKER_ACT ICON_PMARKER_ACT}</td><td>{@link #BND_ICON_PMARKER_SEL ICON_PMARKER_SEL}</td><td>{@link #BND_ICON_PMARKER ICON_PMARKER}</td></tr><tr><td>{@link #BND_ICON_MARKER_HLT ICON_MARKER_HLT}</td><td>{@link #BND_ICON_MARKER ICON_MARKER}</td><td>{@link #BND_ICON_SPACE2 ICON_SPACE2}</td><td>{@link #BND_ICON_SPACE3 ICON_SPACE3}</td><td>{@link #BND_ICON_KEYINGSET ICON_KEYINGSET}</td></tr><tr><td>{@link #BND_ICON_KEY_DEHLT ICON_KEY_DEHLT}</td><td>{@link #BND_ICON_KEY_HLT ICON_KEY_HLT}</td><td>{@link #BND_ICON_MUTE_IPO_OFF ICON_MUTE_IPO_OFF}</td><td>{@link #BND_ICON_MUTE_IPO_ON ICON_MUTE_IPO_ON}</td><td>{@link #BND_ICON_VISIBLE_IPO_OFF ICON_VISIBLE_IPO_OFF}</td></tr><tr><td>{@link #BND_ICON_VISIBLE_IPO_ON ICON_VISIBLE_IPO_ON}</td><td>{@link #BND_ICON_DRIVER ICON_DRIVER}</td><td>{@link #BND_ICON_SOLO_OFF ICON_SOLO_OFF}</td><td>{@link #BND_ICON_SOLO_ON ICON_SOLO_ON}</td><td>{@link #BND_ICON_FRAME_PREV ICON_FRAME_PREV}</td></tr><tr><td>{@link #BND_ICON_FRAME_NEXT ICON_FRAME_NEXT}</td><td>{@link #BND_ICON_NLA_PUSHDOWN ICON_NLA_PUSHDOWN}</td><td>{@link #BND_ICON_IPO_CONSTANT ICON_IPO_CONSTANT}</td><td>{@link #BND_ICON_IPO_LINEAR ICON_IPO_LINEAR}</td><td>{@link #BND_ICON_IPO_BEZIER ICON_IPO_BEZIER}</td></tr><tr><td>{@link #BND_ICON_IPO_SINE ICON_IPO_SINE}</td><td>{@link #BND_ICON_IPO_QUAD ICON_IPO_QUAD}</td><td>{@link #BND_ICON_IPO_CUBIC ICON_IPO_CUBIC}</td><td>{@link #BND_ICON_IPO_QUART ICON_IPO_QUART}</td><td>{@link #BND_ICON_IPO_QUINT ICON_IPO_QUINT}</td></tr><tr><td>{@link #BND_ICON_IPO_EXPO ICON_IPO_EXPO}</td><td>{@link #BND_ICON_IPO_CIRC ICON_IPO_CIRC}</td><td>{@link #BND_ICON_IPO_BOUNCE ICON_IPO_BOUNCE}</td><td>{@link #BND_ICON_IPO_ELASTIC ICON_IPO_ELASTIC}</td><td>{@link #BND_ICON_IPO_BACK ICON_IPO_BACK}</td></tr><tr><td>{@link #BND_ICON_IPO_EASE_IN ICON_IPO_EASE_IN}</td><td>{@link #BND_ICON_IPO_EASE_OUT ICON_IPO_EASE_OUT}</td><td>{@link #BND_ICON_IPO_EASE_IN_OUT ICON_IPO_EASE_IN_OUT}</td><td>{@link #BND_ICON_VERTEXSEL ICON_VERTEXSEL}</td><td>{@link #BND_ICON_EDGESEL ICON_EDGESEL}</td></tr><tr><td>{@link #BND_ICON_FACESEL ICON_FACESEL}</td><td>{@link #BND_ICON_LOOPSEL ICON_LOOPSEL}</td><td>{@link #BND_ICON_ROTATE ICON_ROTATE}</td><td>{@link #BND_ICON_CURSOR ICON_CURSOR}</td><td>{@link #BND_ICON_ROTATECOLLECTION ICON_ROTATECOLLECTION}</td></tr><tr><td>{@link #BND_ICON_ROTATECENTER ICON_ROTATECENTER}</td><td>{@link #BND_ICON_ROTACTIVE ICON_ROTACTIVE}</td><td>{@link #BND_ICON_ALIGN ICON_ALIGN}</td><td>{@link #BND_ICON_SMOOTHCURVE ICON_SMOOTHCURVE}</td><td>{@link #BND_ICON_SPHERECURVE ICON_SPHERECURVE}</td></tr><tr><td>{@link #BND_ICON_ROOTCURVE ICON_ROOTCURVE}</td><td>{@link #BND_ICON_SHARPCURVE ICON_SHARPCURVE}</td><td>{@link #BND_ICON_LINCURVE ICON_LINCURVE}</td><td>{@link #BND_ICON_NOCURVE ICON_NOCURVE}</td><td>{@link #BND_ICON_RNDCURVE ICON_RNDCURVE}</td></tr><tr><td>{@link #BND_ICON_PROP_OFF ICON_PROP_OFF}</td><td>{@link #BND_ICON_PROP_ON ICON_PROP_ON}</td><td>{@link #BND_ICON_PROP_CON ICON_PROP_CON}</td><td>{@link #BND_ICON_SCULPT_DYNTOPO ICON_SCULPT_DYNTOPO}</td><td>{@link #BND_ICON_PARTICLE_POINT ICON_PARTICLE_POINT}</td></tr><tr><td>{@link #BND_ICON_PARTICLE_TIP ICON_PARTICLE_TIP}</td><td>{@link #BND_ICON_PARTICLE_PATH ICON_PARTICLE_PATH}</td><td>{@link #BND_ICON_MAN_TRANS ICON_MAN_TRANS}</td><td>{@link #BND_ICON_MAN_ROT ICON_MAN_ROT}</td><td>{@link #BND_ICON_MAN_SCALE ICON_MAN_SCALE}</td></tr><tr><td>{@link #BND_ICON_MANIPUL ICON_MANIPUL}</td><td>{@link #BND_ICON_SNAP_OFF ICON_SNAP_OFF}</td><td>{@link #BND_ICON_SNAP_ON ICON_SNAP_ON}</td><td>{@link #BND_ICON_SNAP_NORMAL ICON_SNAP_NORMAL}</td><td>{@link #BND_ICON_SNAP_INCREMENT ICON_SNAP_INCREMENT}</td></tr><tr><td>{@link #BND_ICON_SNAP_VERTEX ICON_SNAP_VERTEX}</td><td>{@link #BND_ICON_SNAP_EDGE ICON_SNAP_EDGE}</td><td>{@link #BND_ICON_SNAP_FACE ICON_SNAP_FACE}</td><td>{@link #BND_ICON_SNAP_VOLUME ICON_SNAP_VOLUME}</td><td>{@link #BND_ICON_STICKY_UVS_LOC ICON_STICKY_UVS_LOC}</td></tr><tr><td>{@link #BND_ICON_STICKY_UVS_DISABLE ICON_STICKY_UVS_DISABLE}</td><td>{@link #BND_ICON_STICKY_UVS_VERT ICON_STICKY_UVS_VERT}</td><td>{@link #BND_ICON_CLIPUV_DEHLT ICON_CLIPUV_DEHLT}</td><td>{@link #BND_ICON_CLIPUV_HLT ICON_CLIPUV_HLT}</td><td>{@link #BND_ICON_SNAP_PEEL_OBJECT ICON_SNAP_PEEL_OBJECT}</td></tr><tr><td>{@link #BND_ICON_GRID ICON_GRID}</td><td>{@link #BND_ICON_PASTEDOWN ICON_PASTEDOWN}</td><td>{@link #BND_ICON_COPYDOWN ICON_COPYDOWN}</td><td>{@link #BND_ICON_PASTEFLIPUP ICON_PASTEFLIPUP}</td><td>{@link #BND_ICON_PASTEFLIPDOWN ICON_PASTEFLIPDOWN}</td></tr><tr><td>{@link #BND_ICON_SNAP_SURFACE ICON_SNAP_SURFACE}</td><td>{@link #BND_ICON_AUTOMERGE_ON ICON_AUTOMERGE_ON}</td><td>{@link #BND_ICON_AUTOMERGE_OFF ICON_AUTOMERGE_OFF}</td><td>{@link #BND_ICON_RETOPO ICON_RETOPO}</td><td>{@link #BND_ICON_UV_VERTEXSEL ICON_UV_VERTEXSEL}</td></tr><tr><td>{@link #BND_ICON_UV_EDGESEL ICON_UV_EDGESEL}</td><td>{@link #BND_ICON_UV_FACESEL ICON_UV_FACESEL}</td><td>{@link #BND_ICON_UV_ISLANDSEL ICON_UV_ISLANDSEL}</td><td>{@link #BND_ICON_UV_SYNC_SELECT ICON_UV_SYNC_SELECT}</td><td>{@link #BND_ICON_BBOX ICON_BBOX}</td></tr><tr><td>{@link #BND_ICON_WIRE ICON_WIRE}</td><td>{@link #BND_ICON_SOLID ICON_SOLID}</td><td>{@link #BND_ICON_SMOOTH ICON_SMOOTH}</td><td>{@link #BND_ICON_POTATO ICON_POTATO}</td><td>{@link #BND_ICON_ORTHO ICON_ORTHO}</td></tr><tr><td>{@link #BND_ICON_LOCKVIEW_OFF ICON_LOCKVIEW_OFF}</td><td>{@link #BND_ICON_LOCKVIEW_ON ICON_LOCKVIEW_ON}</td><td>{@link #BND_ICON_AXIS_SIDE ICON_AXIS_SIDE}</td><td>{@link #BND_ICON_AXIS_FRONT ICON_AXIS_FRONT}</td><td>{@link #BND_ICON_AXIS_TOP ICON_AXIS_TOP}</td></tr><tr><td>{@link #BND_ICON_NDOF_DOM ICON_NDOF_DOM}</td><td>{@link #BND_ICON_NDOF_TURN ICON_NDOF_TURN}</td><td>{@link #BND_ICON_NDOF_FLY ICON_NDOF_FLY}</td><td>{@link #BND_ICON_NDOF_TRANS ICON_NDOF_TRANS}</td><td>{@link #BND_ICON_LAYER_USED ICON_LAYER_USED}</td></tr><tr><td>{@link #BND_ICON_LAYER_ACTIVE ICON_LAYER_ACTIVE}</td><td>{@link #BND_ICON_SORTALPHA ICON_SORTALPHA}</td><td>{@link #BND_ICON_SORTBYEXT ICON_SORTBYEXT}</td><td>{@link #BND_ICON_SORTTIME ICON_SORTTIME}</td><td>{@link #BND_ICON_SORTSIZE ICON_SORTSIZE}</td></tr><tr><td>{@link #BND_ICON_LONGDISPLAY ICON_LONGDISPLAY}</td><td>{@link #BND_ICON_SHORTDISPLAY ICON_SHORTDISPLAY}</td><td>{@link #BND_ICON_GHOST ICON_GHOST}</td><td>{@link #BND_ICON_IMGDISPLAY ICON_IMGDISPLAY}</td><td>{@link #BND_ICON_SAVE_AS ICON_SAVE_AS}</td></tr><tr><td>{@link #BND_ICON_SAVE_COPY ICON_SAVE_COPY}</td><td>{@link #BND_ICON_BOOKMARKS ICON_BOOKMARKS}</td><td>{@link #BND_ICON_FONTPREVIEW ICON_FONTPREVIEW}</td><td>{@link #BND_ICON_FILTER ICON_FILTER}</td><td>{@link #BND_ICON_NEWFOLDER ICON_NEWFOLDER}</td></tr><tr><td>{@link #BND_ICON_OPEN_RECENT ICON_OPEN_RECENT}</td><td>{@link #BND_ICON_FILE_PARENT ICON_FILE_PARENT}</td><td>{@link #BND_ICON_FILE_REFRESH ICON_FILE_REFRESH}</td><td>{@link #BND_ICON_FILE_FOLDER ICON_FILE_FOLDER}</td><td>{@link #BND_ICON_FILE_BLANK ICON_FILE_BLANK}</td></tr><tr><td>{@link #BND_ICON_FILE_BLEND ICON_FILE_BLEND}</td><td>{@link #BND_ICON_FILE_IMAGE ICON_FILE_IMAGE}</td><td>{@link #BND_ICON_FILE_MOVIE ICON_FILE_MOVIE}</td><td>{@link #BND_ICON_FILE_SCRIPT ICON_FILE_SCRIPT}</td><td>{@link #BND_ICON_FILE_SOUND ICON_FILE_SOUND}</td></tr><tr><td>{@link #BND_ICON_FILE_FONT ICON_FILE_FONT}</td><td>{@link #BND_ICON_FILE_TEXT ICON_FILE_TEXT}</td><td>{@link #BND_ICON_RECOVER_AUTO ICON_RECOVER_AUTO}</td><td>{@link #BND_ICON_SAVE_PREFS ICON_SAVE_PREFS}</td><td>{@link #BND_ICON_LINK_BLEND ICON_LINK_BLEND}</td></tr><tr><td>{@link #BND_ICON_APPEND_BLEND ICON_APPEND_BLEND}</td><td>{@link #BND_ICON_IMPORT ICON_IMPORT}</td><td>{@link #BND_ICON_EXPORT ICON_EXPORT}</td><td>{@link #BND_ICON_EXTERNAL_DATA ICON_EXTERNAL_DATA}</td><td>{@link #BND_ICON_LOAD_FACTORY ICON_LOAD_FACTORY}</td></tr><tr><td>{@link #BND_ICON_LOOP_BACK ICON_LOOP_BACK}</td><td>{@link #BND_ICON_LOOP_FORWARDS ICON_LOOP_FORWARDS}</td><td>{@link #BND_ICON_BACK ICON_BACK}</td><td>{@link #BND_ICON_FORWARD ICON_FORWARD}</td><td>{@link #BND_ICON_FILE_BACKUP ICON_FILE_BACKUP}</td></tr><tr><td>{@link #BND_ICON_DISK_DRIVE ICON_DISK_DRIVE}</td><td>{@link #BND_ICON_MATPLANE ICON_MATPLANE}</td><td>{@link #BND_ICON_MATSPHERE ICON_MATSPHERE}</td><td>{@link #BND_ICON_MATCUBE ICON_MATCUBE}</td><td>{@link #BND_ICON_MONKEY ICON_MONKEY}</td></tr><tr><td>{@link #BND_ICON_HAIR ICON_HAIR}</td><td>{@link #BND_ICON_ALIASED ICON_ALIASED}</td><td>{@link #BND_ICON_ANTIALIASED ICON_ANTIALIASED}</td><td>{@link #BND_ICON_MAT_SPHERE_SKY ICON_MAT_SPHERE_SKY}</td><td>{@link #BND_ICON_WORDWRAP_OFF ICON_WORDWRAP_OFF}</td></tr><tr><td>{@link #BND_ICON_WORDWRAP_ON ICON_WORDWRAP_ON}</td><td>{@link #BND_ICON_SYNTAX_OFF ICON_SYNTAX_OFF}</td><td>{@link #BND_ICON_SYNTAX_ON ICON_SYNTAX_ON}</td><td>{@link #BND_ICON_LINENUMBERS_OFF ICON_LINENUMBERS_OFF}</td><td>{@link #BND_ICON_LINENUMBERS_ON ICON_LINENUMBERS_ON}</td></tr><tr><td>{@link #BND_ICON_SCRIPTPLUGINS ICON_SCRIPTPLUGINS}</td><td>{@link #BND_ICON_SEQ_SEQUENCER ICON_SEQ_SEQUENCER}</td><td>{@link #BND_ICON_SEQ_PREVIEW ICON_SEQ_PREVIEW}</td><td>{@link #BND_ICON_SEQ_LUMA_WAVEFORM ICON_SEQ_LUMA_WAVEFORM}</td><td>{@link #BND_ICON_SEQ_CHROMA_SCOPE ICON_SEQ_CHROMA_SCOPE}</td></tr><tr><td>{@link #BND_ICON_SEQ_HISTOGRAM ICON_SEQ_HISTOGRAM}</td><td>{@link #BND_ICON_SEQ_SPLITVIEW ICON_SEQ_SPLITVIEW}</td><td>{@link #BND_ICON_IMAGE_RGB ICON_IMAGE_RGB}</td><td>{@link #BND_ICON_IMAGE_RGB_ALPHA ICON_IMAGE_RGB_ALPHA}</td><td>{@link #BND_ICON_IMAGE_ALPHA ICON_IMAGE_ALPHA}</td></tr><tr><td>{@link #BND_ICON_IMAGE_ZDEPTH ICON_IMAGE_ZDEPTH}</td><td>{@link #BND_ICON_IMAGEFILE ICON_IMAGEFILE}</td></tr></table>
     */
    public static void bndIcon(@NativeType("NVGcontext *") long ctx, float x, float y, int iconid) {
        if (CHECKS) {
            check(ctx);
        }
        nbndIcon(ctx, x, y, iconid);
    }

    // --- [ bndDropShadow ] ---

    /** Unsafe version of: {@link #bndDropShadow DropShadow} */
    public static native void nbndDropShadow(long ctx, float x, float y, float w, float h, float r, float feather, float alpha);

    /**
     * Draws a drop shadow around the rounded box at {@code (x,y)} with size {@code (w,h)} and radius {@code r}, with {@code feather} as its maximum range in
     * pixels. No shadow will be painted inside the rounded box.
     *
     * @param ctx the NanoVG context
     */
    public static void bndDropShadow(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, float r, float feather, float alpha) {
        if (CHECKS) {
            check(ctx);
        }
        nbndDropShadow(ctx, x, y, w, h, r, feather, alpha);
    }

    // --- [ bndInnerBox ] ---

    /** Unsafe version of: {@link #bndInnerBox InnerBox} */
    public static native void nbndInnerBox(long ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3, long shade_top, long shade_down);

    /**
     * Draws the inner part of a widget box, with a gradient from {@code shade_top} to {@code shade_down}. If {@code h>w}, the gradient will be horizontal
     * instead of vertical.
     *
     * @param ctx the NanoVG context
     */
    public static void bndInnerBox(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3, @NativeType("NVGcolor") NVGColor shade_top, @NativeType("NVGcolor") NVGColor shade_down) {
        if (CHECKS) {
            check(ctx);
        }
        nbndInnerBox(ctx, x, y, w, h, cr0, cr1, cr2, cr3, shade_top.address(), shade_down.address());
    }

    // --- [ bndOutlineBox ] ---

    /** Unsafe version of: {@link #bndOutlineBox OutlineBox} */
    public static native void nbndOutlineBox(long ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3, long color);

    /**
     * Draws the outline part of a widget box with the given color.
     *
     * @param ctx the NanoVG context
     */
    public static void bndOutlineBox(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, float cr0, float cr1, float cr2, float cr3, @NativeType("NVGcolor") NVGColor color) {
        if (CHECKS) {
            check(ctx);
        }
        nbndOutlineBox(ctx, x, y, w, h, cr0, cr1, cr2, cr3, color.address());
    }

    // --- [ bndIconLabelValue ] ---

    /** Unsafe version of: {@link #bndIconLabelValue IconLabelValue} */
    public static native void nbndIconLabelValue(long ctx, float x, float y, float w, float h, int iconid, long color, int align, float fontsize, long label, long value);

    /**
     * Draws an optional icon specified by {@code iconid} and an optional label with given {@code alignment}, {@code fontsize} and {@code color} within a
     * widget box.
     *
     * @param ctx    the NanoVG context
     * @param iconid if &ge; 0, an icon will be drawn and the labels remaining space will be adjusted
     * @param align  one of:<br><table><tr><td>{@link #BND_LEFT LEFT}</td><td>{@link #BND_CENTER CENTER}</td></tr></table>
     * @param label  if not {@code NULL}, it will be drawn with the specified {@code alignment}, {@code fontsize} and {@code color}
     * @param value  if not {@code NULL}, {@code label} and {@code value} will be drawn with a ":" separator inbetween
     */
    public static void bndIconLabelValue(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType("NVGcolor") NVGColor color, int align, float fontsize, @Nullable @NativeType("char const *") ByteBuffer label, @Nullable @NativeType("char const *") ByteBuffer value) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
            checkNT1Safe(value);
        }
        nbndIconLabelValue(ctx, x, y, w, h, iconid, color.address(), align, fontsize, memAddressSafe(label), memAddressSafe(value));
    }

    /**
     * Draws an optional icon specified by {@code iconid} and an optional label with given {@code alignment}, {@code fontsize} and {@code color} within a
     * widget box.
     *
     * @param ctx    the NanoVG context
     * @param iconid if &ge; 0, an icon will be drawn and the labels remaining space will be adjusted
     * @param align  one of:<br><table><tr><td>{@link #BND_LEFT LEFT}</td><td>{@link #BND_CENTER CENTER}</td></tr></table>
     * @param label  if not {@code NULL}, it will be drawn with the specified {@code alignment}, {@code fontsize} and {@code color}
     * @param value  if not {@code NULL}, {@code label} and {@code value} will be drawn with a ":" separator inbetween
     */
    public static void bndIconLabelValue(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType("NVGcolor") NVGColor color, int align, float fontsize, @Nullable @NativeType("char const *") CharSequence label, @Nullable @NativeType("char const *") CharSequence value) {
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

    /** Unsafe version of: {@link #bndNodeIconLabel NodeIconLabel} */
    public static native void nbndNodeIconLabel(long ctx, float x, float y, float w, float h, int iconid, long color, long shadowColor, int align, float fontsize, long label);

    /**
     * Draws an optional icon specified by {@code iconid} and an optional label with given {@code alignment}, {@code fontsize} and {@code color} within a node
     * title bar.
     *
     * @param ctx    the NanoVG context
     * @param iconid if &ge; 0, an icon will be drawn
     * @param label  if not {@code NULL}, it will be drawn with the specified {@code alignment}, {@code fontsize} and {@code color}
     */
    public static void bndNodeIconLabel(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType("NVGcolor") NVGColor color, @NativeType("NVGcolor") NVGColor shadowColor, int align, float fontsize, @Nullable @NativeType("char const *") ByteBuffer label) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        nbndNodeIconLabel(ctx, x, y, w, h, iconid, color.address(), shadowColor.address(), align, fontsize, memAddressSafe(label));
    }

    /**
     * Draws an optional icon specified by {@code iconid} and an optional label with given {@code alignment}, {@code fontsize} and {@code color} within a node
     * title bar.
     *
     * @param ctx    the NanoVG context
     * @param iconid if &ge; 0, an icon will be drawn
     * @param label  if not {@code NULL}, it will be drawn with the specified {@code alignment}, {@code fontsize} and {@code color}
     */
    public static void bndNodeIconLabel(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType("NVGcolor") NVGColor color, @NativeType("NVGcolor") NVGColor shadowColor, int align, float fontsize, @Nullable @NativeType("char const *") CharSequence label) {
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

    /** Unsafe version of: {@link #bndIconLabelTextPosition IconLabelTextPosition} */
    public static native int nbndIconLabelTextPosition(long ctx, float x, float y, float w, float h, int iconid, float fontsize, long label, int px, int py);

    /**
     * Calculates the corresponding text position for given coordinates {@code px/py} in an {@code iconLabel}. See {@link #bndIconLabelCaret IconLabelCaret} for more info.
     *
     * @param ctx the NanoVG context
     */
    public static int bndIconLabelTextPosition(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, float fontsize, @Nullable @NativeType("char const *") ByteBuffer label, int px, int py) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        return nbndIconLabelTextPosition(ctx, x, y, w, h, iconid, fontsize, memAddressSafe(label), px, py);
    }

    /**
     * Calculates the corresponding text position for given coordinates {@code px/py} in an {@code iconLabel}. See {@link #bndIconLabelCaret IconLabelCaret} for more info.
     *
     * @param ctx the NanoVG context
     */
    public static int bndIconLabelTextPosition(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, float fontsize, @Nullable @NativeType("char const *") CharSequence label, int px, int py) {
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

    /** Unsafe version of: {@link #bndIconLabelCaret IconLabelCaret} */
    public static native void nbndIconLabelCaret(long ctx, float x, float y, float w, float h, int iconid, long color, float fontsize, long label, long caretcolor, int cbegin, int cend);

    /**
     * Draws an optional icon specified by {@code iconid}, an optional label and a caret with given {@code fontsize} and {@code color} within a widget box.
     *
     * @param ctx    the NanoVG context
     * @param iconid if &ge; 0, an icon will be drawn and the labels remaining space will be adjusted
     * @param label  if not {@code NULL}, it will be drawn with the specified {@code alignment}, {@code fontsize} and {@code color}
     * @param cbegin must be &ge; 0 and &le; {@code strlen(text)} and denotes the beginning of the caret
     * @param cend   must be &ge; {@code cbegin} and &le; {@code strlen(text)} and denotes the end of the caret. If {@code cend} &lt; {@code cbegin}, then no caret will
     *               be drawn.
     */
    public static void bndIconLabelCaret(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType("NVGcolor") NVGColor color, float fontsize, @Nullable @NativeType("char const *") ByteBuffer label, @NativeType("NVGcolor") NVGColor caretcolor, int cbegin, int cend) {
        if (CHECKS) {
            check(ctx);
            checkNT1Safe(label);
        }
        nbndIconLabelCaret(ctx, x, y, w, h, iconid, color.address(), fontsize, memAddressSafe(label), caretcolor.address(), cbegin, cend);
    }

    /**
     * Draws an optional icon specified by {@code iconid}, an optional label and a caret with given {@code fontsize} and {@code color} within a widget box.
     *
     * @param ctx    the NanoVG context
     * @param iconid if &ge; 0, an icon will be drawn and the labels remaining space will be adjusted
     * @param label  if not {@code NULL}, it will be drawn with the specified {@code alignment}, {@code fontsize} and {@code color}
     * @param cbegin must be &ge; 0 and &le; {@code strlen(text)} and denotes the beginning of the caret
     * @param cend   must be &ge; {@code cbegin} and &le; {@code strlen(text)} and denotes the end of the caret. If {@code cend} &lt; {@code cbegin}, then no caret will
     *               be drawn.
     */
    public static void bndIconLabelCaret(@NativeType("NVGcontext *") long ctx, float x, float y, float w, float h, int iconid, @NativeType("NVGcolor") NVGColor color, float fontsize, @Nullable @NativeType("char const *") CharSequence label, @NativeType("NVGcolor") NVGColor caretcolor, int cbegin, int cend) {
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

    /** Unsafe version of: {@link #bndCheck Check} */
    public static native void nbndCheck(long ctx, float ox, float oy, long color);

    /**
     * Draws a checkmark for an option box with the given upper left coordinates {@code (ox,oy)} with the specified {@code color}.
     *
     * @param ctx the NanoVG context
     */
    public static void bndCheck(@NativeType("NVGcontext *") long ctx, float ox, float oy, @NativeType("NVGcolor") NVGColor color) {
        if (CHECKS) {
            check(ctx);
        }
        nbndCheck(ctx, ox, oy, color.address());
    }

    // --- [ bndArrow ] ---

    /** Unsafe version of: {@link #bndArrow Arrow} */
    public static native void nbndArrow(long ctx, float x, float y, float s, long color);

    /**
     * Draws a horizontal arrow for a number field with its center at {@code (x,y)} and size {@code s}.
     *
     * @param ctx the NanoVG context
     * @param s   if negative, the arrow points to the left
     */
    public static void bndArrow(@NativeType("NVGcontext *") long ctx, float x, float y, float s, @NativeType("NVGcolor") NVGColor color) {
        if (CHECKS) {
            check(ctx);
        }
        nbndArrow(ctx, x, y, s, color.address());
    }

    // --- [ bndUpDownArrow ] ---

    /** Unsafe version of: {@link #bndUpDownArrow UpDownArrow} */
    public static native void nbndUpDownArrow(long ctx, float x, float y, float s, long color);

    /**
     * Draws an up/down arrow for a choice box with its center at {@code (x,y)} and size {@code s}.
     *
     * @param ctx the NanoVG context
     */
    public static void bndUpDownArrow(@NativeType("NVGcontext *") long ctx, float x, float y, float s, @NativeType("NVGcolor") NVGColor color) {
        if (CHECKS) {
            check(ctx);
        }
        nbndUpDownArrow(ctx, x, y, s, color.address());
    }

    // --- [ bndNodeArrowDown ] ---

    /** Unsafe version of: {@link #bndNodeArrowDown NodeArrowDown} */
    public static native void nbndNodeArrowDown(long ctx, float x, float y, float s, long color);

    /**
     * Draws a node down-arrow with its tip at {@code (x,y)} and size {@code s}
     *
     * @param ctx the NanoVG context
     */
    public static void bndNodeArrowDown(@NativeType("NVGcontext *") long ctx, float x, float y, float s, @NativeType("NVGcolor") NVGColor color) {
        if (CHECKS) {
            check(ctx);
        }
        nbndNodeArrowDown(ctx, x, y, s, color.address());
    }

    // --- [ bndNodeWireColor ] ---

    /** Unsafe version of: {@link #bndNodeWireColor NodeWireColor} */
    public static native void nbndNodeWireColor(long theme, int state, long __result);

    /**
     * Returns the color of a node wire based on state.
     *
     * @param state {@link #BND_HOVER HOVER} indicates selected state, {@link #BND_ACTIVE ACTIVE} indicates dragged state
     */
    @NativeType("NVGcolor")
    public static NVGColor bndNodeWireColor(@NativeType("BNDnodeTheme const *") BNDnodeTheme theme, @NativeType("BNDwidgetState") int state, @NativeType("NVGcolor") NVGColor __result) {
        nbndNodeWireColor(theme.address(), state, __result.address());
        return __result;
    }

    /** Array version of: {@link #nbndSelectCorners} */
    public static native void nbndSelectCorners(float[] radiuses, float r, int flags);

    /** Array version of: {@link #bndSelectCorners SelectCorners} */
    public static void bndSelectCorners(@NativeType("float *") float[] radiuses, float r, int flags) {
        if (CHECKS) {
            check(radiuses, 4);
        }
        nbndSelectCorners(radiuses, r, flags);
    }

    /** Array version of: {@link #nbndScrollHandleRect} */
    public static native void nbndScrollHandleRect(float[] x, float[] y, float[] w, float[] h, float offset, float size);

    /** Array version of: {@link #bndScrollHandleRect ScrollHandleRect} */
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