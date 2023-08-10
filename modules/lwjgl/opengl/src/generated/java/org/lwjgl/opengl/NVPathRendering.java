/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.opengl.GL11.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_path_rendering.txt">NV_path_rendering</a> extension.
 * 
 * <p>Conventional OpenGL supports rendering images (pixel rectangles and bitmaps) and simple geometric primitives (points, lines, polygons).</p>
 * 
 * <p>This extension adds a new rendering paradigm, known as path rendering, for rendering filled and stroked paths. Path rendering is not novel but rather a
 * standard part of most resolution-independent 2D rendering systems such as Flash, PDF, Silverlight, SVG, Java 2D, Office drawings, TrueType fonts,
 * PostScript and its fonts, Quartz 2D, XML Paper Specification (XPS), and OpenVG. What is novel is the ability to mix path rendering with arbitrary
 * OpenGL 3D rendering and imaging.</p>
 * 
 * <p>With this extension, path rendering becomes a first-class rendering mode within the OpenGL graphics system that can be arbitrarily mixed with existing
 * OpenGL rendering and can take advantage of OpenGL's existing mechanisms for texturing, programmability, and per-fragment operations.</p>
 * 
 * <p>Unlike geometric primitive rendering, paths are specified on a 2D (non-projective) plane rather than in 3D (projective) space. Even though the path is
 * defined in a 2D plane, every path can be transformed into 3D clip space allowing for 3D view frustum &amp; user-defined clipping, depth offset, and
 * depth testing in the same manner as geometric primitive rendering.</p>
 * 
 * <p>Both geometric primitive rendering and path rendering support rasterization of edges defined by line segments; however, path rendering also allows path
 * segments to be specified by Bezier (cubic or quadratic) curves or partial elliptical arcs. This allows path rendering to define truly curved primitive
 * boundaries unlike the straight edges of line and polygon primitives. Whereas geometric primitive rendering requires convex polygons for well-defined
 * rendering results, path rendering allows (and encourages!) concave and curved outlines to be specified. These paths are even allowed to self-intersect.</p>
 * 
 * <p>When filling closed paths, the winding of paths (counterclockwise or clockwise) determines whether pixels are inside or outside of the path.</p>
 * 
 * <p>Paths can also be stroked whereby, conceptually, a fixed-width "brush" is pulled along the path such that the brush remains orthogonal to the gradient
 * of each path segment. Samples within the sweep of this brush are considered inside the stroke of the path.</p>
 * 
 * <p>This extension supports path rendering through a sequence of three operations:</p>
 * 
 * <ol>
 * <li>Path specification is the process of creating and updating a path object consisting of a set of path commands and a corresponding set of 2D
 * vertices.
 * 
 * <p>Path commands can be specified explicitly from path command and coordinate data, parsed from a string based on standard grammars for representing
 * paths, or specified by a particular glyph of standard font representations. Also new paths can be specified by weighting one or more existing paths
 * so long as all the weighted paths have consistent command sequences.</p>
 * 
 * <p>Each path object contains zero or more subpaths specified by a sequence of line segments, partial elliptical arcs, and (cubic or quadratic) Bezier
 * curve segments. Each path may contain multiple subpaths that can be closed (forming a contour) or open.</p></li>
 * <li>Path stenciling is the process of updating the stencil buffer based on a path's coverage transformed into window space.
 * 
 * <p>Path stenciling can determine either the filled or stroked coverage of a path.</p>
 * 
 * <p>The details of path stenciling are explained within the core of the specification.</p>
 * 
 * <p>Stenciling a stroked path supports all the standard embellishments for path stroking such as end caps, join styles, miter limits, dashing, and dash
 * caps. These stroking properties specified are parameters of path objects.</p></li>
 * <li>Path covering is the process of emitting simple (convex &amp; planar) geometry that (conservatively) "covers" the path's sample coverage in the
 * stencil buffer. During path covering, stencil testing can be configured to discard fragments not within the actual coverage of the path as
 * determined by prior path stenciling.
 * 
 * <p>Path covering can cover either the filled or stroked coverage of a path.</p>
 * 
 * <p>The details of path covering are explained within the core of the specification.</p></li>
 * </ol>
 * 
 * <p>To render a path object into the color buffer, an application specifies a path object and then uses a two-step rendering process. First, the path
 * object is stenciled whereby the path object's stroked or filled coverage is rasterized into the stencil buffer. Second, the path object is covered
 * whereby conservative bounding geometry for the path is transformed and rasterized with stencil testing configured to test against the coverage
 * information written to the stencil buffer in the first step so that only fragments covered by the path are written during this second step. Also during
 * this second step written pixels typically have their stencil value reset (so there's no need for clearing the stencil buffer between rendering each
 * path).</p>
 */
public class NVPathRendering {

    static { GL.initialize(); }

    /** Accepted in elements of the {@code commands} array parameter of PathCommandsNV and PathSubCommandsNV. */
    public static final byte
        GL_CLOSE_PATH_NV                         = 0x0,
        GL_MOVE_TO_NV                            = 0x2,
        GL_RELATIVE_MOVE_TO_NV                   = 0x3,
        GL_LINE_TO_NV                            = 0x4,
        GL_RELATIVE_LINE_TO_NV                   = 0x5,
        GL_HORIZONTAL_LINE_TO_NV                 = 0x6,
        GL_RELATIVE_HORIZONTAL_LINE_TO_NV        = 0x7,
        GL_VERTICAL_LINE_TO_NV                   = 0x8,
        GL_RELATIVE_VERTICAL_LINE_TO_NV          = 0x9,
        GL_QUADRATIC_CURVE_TO_NV                 = 0xA,
        GL_RELATIVE_QUADRATIC_CURVE_TO_NV        = 0xB,
        GL_CUBIC_CURVE_TO_NV                     = 0xC,
        GL_RELATIVE_CUBIC_CURVE_TO_NV            = 0xD,
        GL_SMOOTH_QUADRATIC_CURVE_TO_NV          = 0xE,
        GL_RELATIVE_SMOOTH_QUADRATIC_CURVE_TO_NV = 0xF,
        GL_SMOOTH_CUBIC_CURVE_TO_NV              = 0x10,
        GL_RELATIVE_SMOOTH_CUBIC_CURVE_TO_NV     = 0x11,
        GL_SMALL_CCW_ARC_TO_NV                   = 0x12,
        GL_RELATIVE_SMALL_CCW_ARC_TO_NV          = 0x13,
        GL_SMALL_CW_ARC_TO_NV                    = 0x14,
        GL_RELATIVE_SMALL_CW_ARC_TO_NV           = 0x15,
        GL_LARGE_CCW_ARC_TO_NV                   = 0x16,
        GL_RELATIVE_LARGE_CCW_ARC_TO_NV          = 0x17,
        GL_LARGE_CW_ARC_TO_NV                    = 0x18,
        GL_RELATIVE_LARGE_CW_ARC_TO_NV           = 0x19,
        GL_CONIC_CURVE_TO_NV                     = 0x1A,
        GL_RELATIVE_CONIC_CURVE_TO_NV            = 0x1B,
        GL_ROUNDED_RECT_NV                       = (byte)0xE8,
        GL_RELATIVE_ROUNDED_RECT_NV              = (byte)0xE9,
        GL_ROUNDED_RECT2_NV                      = (byte)0xEA,
        GL_RELATIVE_ROUNDED_RECT2_NV             = (byte)0xEB,
        GL_ROUNDED_RECT4_NV                      = (byte)0xEC,
        GL_RELATIVE_ROUNDED_RECT4_NV             = (byte)0xED,
        GL_ROUNDED_RECT8_NV                      = (byte)0xEE,
        GL_RELATIVE_ROUNDED_RECT8_NV             = (byte)0xEF,
        GL_RESTART_PATH_NV                       = (byte)0xF0,
        GL_DUP_FIRST_CUBIC_CURVE_TO_NV           = (byte)0xF2,
        GL_DUP_LAST_CUBIC_CURVE_TO_NV            = (byte)0xF4,
        GL_RECT_NV                               = (byte)0xF6,
        GL_RELATIVE_RECT_NV                      = (byte)0xF7,
        GL_CIRCULAR_CCW_ARC_TO_NV                = (byte)0xF8,
        GL_CIRCULAR_CW_ARC_TO_NV                 = (byte)0xFA,
        GL_CIRCULAR_TANGENT_ARC_TO_NV            = (byte)0xFC,
        GL_ARC_TO_NV                             = (byte)0xFE,
        GL_RELATIVE_ARC_TO_NV                    = (byte)0xFF;

    /** Accepted by the {@code format} parameter of PathStringNV. */
    public static final int
        GL_PATH_FORMAT_SVG_NV = 0x9070,
        GL_PATH_FORMAT_PS_NV  = 0x9071;

    /** Accepted by the {@code fontTarget} parameter of PathGlyphsNV, PathGlyphRangeNV, and PathGlyphIndexRangeNV. */
    public static final int
        GL_STANDARD_FONT_NAME_NV = 0x9072,
        GL_SYSTEM_FONT_NAME_NV   = 0x9073,
        GL_FILE_NAME_NV          = 0x9074;

    /** Accepted by the {@code fontTarget} parameter of PathMemoryGlyphIndexArrayNV. */
    public static final int GL_STANDARD_FONT_FORMAT_NV = 0x936C;

    /** Accepted by the {@code handleMissingGlyph} parameter of PathGlyphsNV and PathGlyphRangeNV. */
    public static final int
        GL_SKIP_MISSING_GLYPH_NV = 0x90A9,
        GL_USE_MISSING_GLYPH_NV  = 0x90AA;

    /** Returned by PathGlyphIndexRangeNV. */
    public static final int
        GL_FONT_GLYPHS_AVAILABLE_NV   = 0x9368,
        GL_FONT_TARGET_UNAVAILABLE_NV = 0x9369,
        GL_FONT_UNAVAILABLE_NV        = 0x936A,
        GL_FONT_UNINTELLIGIBLE_NV     = 0x936B;

    /**
     * Accepted by the {@code pname} parameter of PathParameterfNV, PathParameterfvNV, GetPathParameterfvNV, PathParameteriNV, PathParameterivNV, and
     * GetPathParameterivNV.
     */
    public static final int
        GL_PATH_STROKE_WIDTH_NV      = 0x9075,
        GL_PATH_INITIAL_END_CAP_NV   = 0x9077,
        GL_PATH_TERMINAL_END_CAP_NV  = 0x9078,
        GL_PATH_JOIN_STYLE_NV        = 0x9079,
        GL_PATH_MITER_LIMIT_NV       = 0x907A,
        GL_PATH_INITIAL_DASH_CAP_NV  = 0x907C,
        GL_PATH_TERMINAL_DASH_CAP_NV = 0x907D,
        GL_PATH_DASH_OFFSET_NV       = 0x907E,
        GL_PATH_CLIENT_LENGTH_NV     = 0x907F,
        GL_PATH_DASH_OFFSET_RESET_NV = 0x90B4,
        GL_PATH_FILL_MODE_NV         = 0x9080,
        GL_PATH_FILL_MASK_NV         = 0x9081,
        GL_PATH_FILL_COVER_MODE_NV   = 0x9082,
        GL_PATH_STROKE_COVER_MODE_NV = 0x9083,
        GL_PATH_STROKE_MASK_NV       = 0x9084,
        GL_PATH_STROKE_BOUND_NV      = 0x9086;

    /** Accepted by the {@code pname} parameter of PathParameterfNV and PathParameterfvNV. */
    public static final int
        GL_PATH_END_CAPS_NV  = 0x9076,
        GL_PATH_DASH_CAPS_NV = 0x907B;

    /** Accepted by the {@code fillMode} parameter of StencilFillPathNV and StencilFillPathInstancedNV. */
    public static final int
        GL_COUNT_UP_NV   = 0x9088,
        GL_COUNT_DOWN_NV = 0x9089;

    /** Accepted by the {@code color} parameter of PathColorGenNV, GetPathColorGenivNV, and GetPathColorGenfvNV. */
    public static final int
        GL_PRIMARY_COLOR_NV   = 0x852C,
        GL_SECONDARY_COLOR_NV = 0x852D;

    /** Accepted by the {@code genMode} parameter of PathColorGenNV, PathTexGenNV, ProgramPathFragmentInputGenNV. */
    public static final int GL_PATH_OBJECT_BOUNDING_BOX_NV = 0x908A;

    /** Accepted by the {@code coverMode} parameter of CoverFillPathNV and CoverFillPathInstancedNV. */
    public static final int
        GL_CONVEX_HULL_NV  = 0x908B,
        GL_BOUNDING_BOX_NV = 0x908D;

    /**
     * Accepted by the {@code transformType} parameter of StencilFillPathInstancedNV, StencilStrokePathInstancedNV, CoverFillPathInstancedNV, and
     * CoverStrokePathInstancedNV.
     */
    public static final int
        GL_TRANSLATE_X_NV         = 0x908E,
        GL_TRANSLATE_Y_NV         = 0x908F,
        GL_TRANSLATE_2D_NV        = 0x9090,
        GL_TRANSLATE_3D_NV        = 0x9091,
        GL_AFFINE_2D_NV           = 0x9092,
        GL_AFFINE_3D_NV           = 0x9094,
        GL_TRANSPOSE_AFFINE_2D_NV = 0x9096,
        GL_TRANSPOSE_AFFINE_3D_NV = 0x9098;

    /**
     * Accepted by the {@code type} or {@code pathNameType} parameter of StencilFillPathInstancedNV, StencilStrokePathInstancedNV, CoverFillPathInstancedNV,
     * CoverStrokePathInstancedNV, GetPathMetricsNV, and GetPathSpacingNV.
     */
    public static final int
        GL_UTF8_NV  = 0x909A,
        GL_UTF16_NV = 0x909B;

    /** Accepted by the {@code coverMode} parameter of CoverFillPathInstancedNV. */
    public static final int GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV = 0x909C;

    /** Accepted by the {@code pname} parameter of GetPathParameterfvNV and GetPathParameterivNV. */
    public static final int
        GL_PATH_COMMAND_COUNT_NV       = 0x909D,
        GL_PATH_COORD_COUNT_NV         = 0x909E,
        GL_PATH_DASH_ARRAY_COUNT_NV    = 0x909F,
        GL_PATH_COMPUTED_LENGTH_NV     = 0x90A0,
        GL_PATH_FILL_BOUNDING_BOX_NV   = 0x90A1,
        GL_PATH_STROKE_BOUNDING_BOX_NV = 0x90A2;

    /**
     * Accepted by the {@code value} parameter of PathParameterfNV, PathParameterfvNV, PathParameteriNV, and PathParameterivNV when {@code pname} is one of
     * PATH_END_CAPS_NV, PATH_INTIAL_END_CAP_NV, PATH_TERMINAL_END_CAP_NV, PATH_DASH_CAPS_NV, PATH_INITIAL_DASH_CAP_NV, and PATH_TERMINAL_DASH_CAP_NV.
     */
    public static final int
        GL_SQUARE_NV     = 0x90A3,
        GL_ROUND_NV      = 0x90A4,
        GL_TRIANGULAR_NV = 0x90A5;

    /**
     * Accepted by the {@code value} parameter of PathParameterfNV, PathParameterfvNV, PathParameteriNV, and PathParameterivNV when {@code pname} is
     * PATH_JOIN_STYLE_NV.
     */
    public static final int
        GL_BEVEL_NV          = 0x90A6,
        GL_MITER_REVERT_NV   = 0x90A7,
        GL_MITER_TRUNCATE_NV = 0x90A8;

    /**
     * Accepted by the {@code value} parameter of PathParameterfNV, PathParameterfvNV, PathParameteriNV, and PathParameterivNV when {@code pname} is
     * PATH_DASH_OFFSET_RESET_NV.
     */
    public static final int
        GL_MOVE_TO_RESETS_NV    = 0x90B5,
        GL_MOVE_TO_CONTINUES_NV = 0x90B6;

    /** Accepted by the {@code fontStyle} parameter of PathGlyphsNV, PathGlyphRangeNV, and PathGlyphIndexRangeNV. */
    public static final int
        GL_BOLD_BIT_NV   = 0x1,
        GL_ITALIC_BIT_NV = 0x2;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int
        GL_PATH_ERROR_POSITION_NV              = 0x90AB,
        GL_PATH_FOG_GEN_MODE_NV                = 0x90AC,
        GL_PATH_STENCIL_FUNC_NV                = 0x90B7,
        GL_PATH_STENCIL_REF_NV                 = 0x90B8,
        GL_PATH_STENCIL_VALUE_MASK_NV          = 0x90B9,
        GL_PATH_STENCIL_DEPTH_OFFSET_FACTOR_NV = 0x90BD,
        GL_PATH_STENCIL_DEPTH_OFFSET_UNITS_NV  = 0x90BE,
        GL_PATH_COVER_DEPTH_FUNC_NV            = 0x90BF;

    /** Accepted as a bit within the {@code metricQueryMask} parameter of GetPathMetricRangeNV or GetPathMetricsNV. */
    public static final int
        GL_GLYPH_WIDTH_BIT_NV                      = 0x1,
        GL_GLYPH_HEIGHT_BIT_NV                     = 0x2,
        GL_GLYPH_HORIZONTAL_BEARING_X_BIT_NV       = 0x4,
        GL_GLYPH_HORIZONTAL_BEARING_Y_BIT_NV       = 0x8,
        GL_GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV = 0x10,
        GL_GLYPH_VERTICAL_BEARING_X_BIT_NV         = 0x20,
        GL_GLYPH_VERTICAL_BEARING_Y_BIT_NV         = 0x40,
        GL_GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV   = 0x80,
        GL_GLYPH_HAS_KERNING_BIT_NV                = 0x100,
        GL_FONT_X_MIN_BOUNDS_BIT_NV                = 0x10000,
        GL_FONT_Y_MIN_BOUNDS_BIT_NV                = 0x20000,
        GL_FONT_X_MAX_BOUNDS_BIT_NV                = 0x40000,
        GL_FONT_Y_MAX_BOUNDS_BIT_NV                = 0x80000,
        GL_FONT_UNITS_PER_EM_BIT_NV                = 0x100000,
        GL_FONT_ASCENDER_BIT_NV                    = 0x200000,
        GL_FONT_DESCENDER_BIT_NV                   = 0x400000,
        GL_FONT_HEIGHT_BIT_NV                      = 0x800000,
        GL_FONT_MAX_ADVANCE_WIDTH_BIT_NV           = 0x1000000,
        GL_FONT_MAX_ADVANCE_HEIGHT_BIT_NV          = 0x2000000,
        GL_FONT_UNDERLINE_POSITION_BIT_NV          = 0x4000000,
        GL_FONT_UNDERLINE_THICKNESS_BIT_NV         = 0x8000000,
        GL_FONT_HAS_KERNING_BIT_NV                 = 0x10000000,
        GL_FONT_NUM_GLYPH_INDICES_BIT_NV           = 0x20000000;

    /** Accepted by the {@code pathListMode} parameter of GetPathSpacingNV. */
    public static final int
        GL_ACCUM_ADJACENT_PAIRS_NV = 0x90AD,
        GL_ADJACENT_PAIRS_NV       = 0x90AE,
        GL_FIRST_TO_REST_NV        = 0x90AF;

    /** Accepted by the {@code pname} parameter of GetPathColorGenivNV, GetPathColorGenfvNV, GetPathTexGenivNV and GetPathTexGenfvNV. */
    public static final int
        GL_PATH_GEN_MODE_NV  = 0x90B0,
        GL_PATH_GEN_COEFF_NV = 0x90B1;

    /** Accepted by the {@code pname} parameter of GetPathColorGenivNV and GetPathColorGenfvNV. */
    public static final int GL_PATH_GEN_COLOR_FORMAT_NV = 0x90B2;

    /** Accepted by the {@code pname} parameter of GetPathTexGenivNV and GetPathTexGenfvNV. */
    public static final int GL_PATH_GEN_COMPONENTS_NV = 0x90B3;

    /**
     * Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv,
     * GetProgramResourcefvNV, and GetProgramResourceLocation.
     */
    public static final int GL_FRAGMENT_INPUT_NV = 0x936D;

    /** Token values for matrices. */
    public static final int
        GL_PATH_PROJECTION_NV                  = 0x1701,
        GL_PATH_MODELVIEW_NV                   = 0x1700,
        GL_PATH_MODELVIEW_STACK_DEPTH_NV       = 0xBA3,
        GL_PATH_MODELVIEW_MATRIX_NV            = 0xBA6,
        GL_PATH_MAX_MODELVIEW_STACK_DEPTH_NV   = 0xD36,
        GL_PATH_TRANSPOSE_MODELVIEW_MATRIX_NV  = 0x84E3,
        GL_PATH_PROJECTION_STACK_DEPTH_NV      = 0xBA4,
        GL_PATH_PROJECTION_MATRIX_NV           = 0xBA7,
        GL_PATH_MAX_PROJECTION_STACK_DEPTH_NV  = 0xD38,
        GL_PATH_TRANSPOSE_PROJECTION_MATRIX_NV = 0x84E4;

    /** The following types are defined as alias to the GL tokens. */
    public static final int
        GL_2_BYTES_NV       = 0x1407,
        GL_3_BYTES_NV       = 0x1408,
        GL_4_BYTES_NV       = 0x1409,
        GL_EYE_LINEAR_NV    = 0x2400,
        GL_OBJECT_LINEAR_NV = 0x2401,
        GL_CONSTANT_NV      = 0x8576;

    protected NVPathRendering() {
        throw new UnsupportedOperationException();
    }

    // --- [ glPathCommandsNV ] ---

    /** Unsafe version of: {@link #glPathCommandsNV PathCommandsNV} */
    public static native void nglPathCommandsNV(int path, int numCommands, long commands, int numCoords, int coordType, long coords);

    /** @param coordType one of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr></table> */
    public static void glPathCommandsNV(@NativeType("GLuint") int path, @NativeType("GLubyte const *") ByteBuffer commands, @NativeType("GLenum") int coordType, @NativeType("void const *") ByteBuffer coords) {
        nglPathCommandsNV(path, commands.remaining(), memAddress(commands), coords.remaining() >> GLChecks.typeToByteShift(coordType), coordType, memAddress(coords));
    }

    /** @param coordType one of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr></table> */
    public static void glPathCommandsNV(@NativeType("GLuint") int path, @NativeType("GLubyte const *") ByteBuffer commands, @NativeType("GLenum") int coordType, @NativeType("void const *") ShortBuffer coords) {
        nglPathCommandsNV(path, commands.remaining(), memAddress(commands), (int)(((long)coords.remaining() << 1) >> GLChecks.typeToByteShift(coordType)), coordType, memAddress(coords));
    }

    /** @param coordType one of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr></table> */
    public static void glPathCommandsNV(@NativeType("GLuint") int path, @NativeType("GLubyte const *") ByteBuffer commands, @NativeType("GLenum") int coordType, @NativeType("void const *") FloatBuffer coords) {
        nglPathCommandsNV(path, commands.remaining(), memAddress(commands), (int)(((long)coords.remaining() << 2) >> GLChecks.typeToByteShift(coordType)), coordType, memAddress(coords));
    }

    // --- [ glPathCoordsNV ] ---

    /** Unsafe version of: {@link #glPathCoordsNV PathCoordsNV} */
    public static native void nglPathCoordsNV(int path, int numCoords, int coordType, long coords);

    /** @param coordType one of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr></table> */
    public static void glPathCoordsNV(@NativeType("GLuint") int path, @NativeType("GLenum") int coordType, @NativeType("void const *") ByteBuffer coords) {
        nglPathCoordsNV(path, coords.remaining() >> GLChecks.typeToByteShift(coordType), coordType, memAddress(coords));
    }

    /** @param coordType one of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr></table> */
    public static void glPathCoordsNV(@NativeType("GLuint") int path, @NativeType("GLenum") int coordType, @NativeType("void const *") ShortBuffer coords) {
        nglPathCoordsNV(path, (int)(((long)coords.remaining() << 1) >> GLChecks.typeToByteShift(coordType)), coordType, memAddress(coords));
    }

    /** @param coordType one of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr></table> */
    public static void glPathCoordsNV(@NativeType("GLuint") int path, @NativeType("GLenum") int coordType, @NativeType("void const *") FloatBuffer coords) {
        nglPathCoordsNV(path, (int)(((long)coords.remaining() << 2) >> GLChecks.typeToByteShift(coordType)), coordType, memAddress(coords));
    }

    // --- [ glPathSubCommandsNV ] ---

    /** Unsafe version of: {@link #glPathSubCommandsNV PathSubCommandsNV} */
    public static native void nglPathSubCommandsNV(int path, int commandStart, int commandsToDelete, int numCommands, long commands, int numCoords, int coordType, long coords);

    /** @param coordType one of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr></table> */
    public static void glPathSubCommandsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int commandStart, @NativeType("GLsizei") int commandsToDelete, @NativeType("GLubyte const *") ByteBuffer commands, @NativeType("GLenum") int coordType, @NativeType("void const *") ByteBuffer coords) {
        nglPathSubCommandsNV(path, commandStart, commandsToDelete, commands.remaining(), memAddress(commands), coords.remaining() >> GLChecks.typeToByteShift(coordType), coordType, memAddress(coords));
    }

    /** @param coordType one of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr></table> */
    public static void glPathSubCommandsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int commandStart, @NativeType("GLsizei") int commandsToDelete, @NativeType("GLubyte const *") ByteBuffer commands, @NativeType("GLenum") int coordType, @NativeType("void const *") ShortBuffer coords) {
        nglPathSubCommandsNV(path, commandStart, commandsToDelete, commands.remaining(), memAddress(commands), (int)(((long)coords.remaining() << 1) >> GLChecks.typeToByteShift(coordType)), coordType, memAddress(coords));
    }

    /** @param coordType one of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr></table> */
    public static void glPathSubCommandsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int commandStart, @NativeType("GLsizei") int commandsToDelete, @NativeType("GLubyte const *") ByteBuffer commands, @NativeType("GLenum") int coordType, @NativeType("void const *") FloatBuffer coords) {
        nglPathSubCommandsNV(path, commandStart, commandsToDelete, commands.remaining(), memAddress(commands), (int)(((long)coords.remaining() << 2) >> GLChecks.typeToByteShift(coordType)), coordType, memAddress(coords));
    }

    // --- [ glPathSubCoordsNV ] ---

    /** Unsafe version of: {@link #glPathSubCoordsNV PathSubCoordsNV} */
    public static native void nglPathSubCoordsNV(int path, int coordStart, int numCoords, int coordType, long coords);

    /** @param coordType one of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr></table> */
    public static void glPathSubCoordsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int coordStart, @NativeType("GLenum") int coordType, @NativeType("void const *") ByteBuffer coords) {
        nglPathSubCoordsNV(path, coordStart, coords.remaining() >> GLChecks.typeToByteShift(coordType), coordType, memAddress(coords));
    }

    /** @param coordType one of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr></table> */
    public static void glPathSubCoordsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int coordStart, @NativeType("GLenum") int coordType, @NativeType("void const *") ShortBuffer coords) {
        nglPathSubCoordsNV(path, coordStart, (int)(((long)coords.remaining() << 1) >> GLChecks.typeToByteShift(coordType)), coordType, memAddress(coords));
    }

    /** @param coordType one of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr></table> */
    public static void glPathSubCoordsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int coordStart, @NativeType("GLenum") int coordType, @NativeType("void const *") FloatBuffer coords) {
        nglPathSubCoordsNV(path, coordStart, (int)(((long)coords.remaining() << 2) >> GLChecks.typeToByteShift(coordType)), coordType, memAddress(coords));
    }

    // --- [ glPathStringNV ] ---

    /** Unsafe version of: {@link #glPathStringNV PathStringNV} */
    public static native void nglPathStringNV(int path, int format, int length, long pathString);

    /** @param format one of:<br><table><tr><td>{@link #GL_PATH_FORMAT_SVG_NV PATH_FORMAT_SVG_NV}</td><td>{@link #GL_PATH_FORMAT_PS_NV PATH_FORMAT_PS_NV}</td></tr></table> */
    public static void glPathStringNV(@NativeType("GLuint") int path, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer pathString) {
        nglPathStringNV(path, format, pathString.remaining(), memAddress(pathString));
    }

    // --- [ glPathGlyphsNV ] ---

    /** Unsafe version of: {@link #glPathGlyphsNV PathGlyphsNV} */
    public static native void nglPathGlyphsNV(int firstPathName, int fontTarget, long fontName, int fontStyle, int numGlyphs, int type, long charcodes, int handleMissingGlyphs, int pathParameterTemplate, float emScale);

    /**
     * @param fontTarget          one of:<br><table><tr><td>{@link #GL_STANDARD_FONT_NAME_NV STANDARD_FONT_NAME_NV}</td><td>{@link #GL_SYSTEM_FONT_NAME_NV SYSTEM_FONT_NAME_NV}</td><td>{@link #GL_FILE_NAME_NV FILE_NAME_NV}</td></tr></table>
     * @param fontStyle           one or more of:<br><table><tr><td>{@link #GL_BOLD_BIT_NV BOLD_BIT_NV}</td><td>{@link #GL_ITALIC_BIT_NV ITALIC_BIT_NV}</td></tr></table>
     * @param type                one of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td></tr><tr><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
     * @param handleMissingGlyphs one of:<br><table><tr><td>{@link #GL_SKIP_MISSING_GLYPH_NV SKIP_MISSING_GLYPH_NV}</td><td>{@link #GL_USE_MISSING_GLYPH_NV USE_MISSING_GLYPH_NV}</td></tr></table>
     */
    public static void glPathGlyphsNV(@NativeType("GLuint") int firstPathName, @NativeType("GLenum") int fontTarget, @NativeType("void const *") ByteBuffer fontName, @NativeType("GLbitfield") int fontStyle, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer charcodes, @NativeType("GLenum") int handleMissingGlyphs, @NativeType("GLuint") int pathParameterTemplate, @NativeType("GLfloat") float emScale) {
        if (CHECKS) {
            checkNT1(fontName);
        }
        nglPathGlyphsNV(firstPathName, fontTarget, memAddress(fontName), fontStyle, charcodes.remaining() / charcodeTypeToBytes(type), type, memAddress(charcodes), handleMissingGlyphs, pathParameterTemplate, emScale);
    }

    // --- [ glPathGlyphRangeNV ] ---

    /** Unsafe version of: {@link #glPathGlyphRangeNV PathGlyphRangeNV} */
    public static native void nglPathGlyphRangeNV(int firstPathName, int fontTarget, long fontName, int fontStyle, int firstGlyph, int numGlyphs, int handleMissingGlyphs, int pathParameterTemplate, float emScale);

    /**
     * @param fontTarget          one of:<br><table><tr><td>{@link #GL_STANDARD_FONT_NAME_NV STANDARD_FONT_NAME_NV}</td><td>{@link #GL_SYSTEM_FONT_NAME_NV SYSTEM_FONT_NAME_NV}</td><td>{@link #GL_FILE_NAME_NV FILE_NAME_NV}</td></tr></table>
     * @param fontStyle           one or more of:<br><table><tr><td>{@link #GL_BOLD_BIT_NV BOLD_BIT_NV}</td><td>{@link #GL_ITALIC_BIT_NV ITALIC_BIT_NV}</td></tr></table>
     * @param handleMissingGlyphs one of:<br><table><tr><td>{@link #GL_SKIP_MISSING_GLYPH_NV SKIP_MISSING_GLYPH_NV}</td><td>{@link #GL_USE_MISSING_GLYPH_NV USE_MISSING_GLYPH_NV}</td></tr></table>
     */
    public static void glPathGlyphRangeNV(@NativeType("GLuint") int firstPathName, @NativeType("GLenum") int fontTarget, @NativeType("void const *") ByteBuffer fontName, @NativeType("GLbitfield") int fontStyle, @NativeType("GLuint") int firstGlyph, @NativeType("GLsizei") int numGlyphs, @NativeType("GLenum") int handleMissingGlyphs, @NativeType("GLuint") int pathParameterTemplate, @NativeType("GLfloat") float emScale) {
        if (CHECKS) {
            checkNT1(fontName);
        }
        nglPathGlyphRangeNV(firstPathName, fontTarget, memAddress(fontName), fontStyle, firstGlyph, numGlyphs, handleMissingGlyphs, pathParameterTemplate, emScale);
    }

    // --- [ glPathGlyphIndexArrayNV ] ---

    /** Unsafe version of: {@link #glPathGlyphIndexArrayNV PathGlyphIndexArrayNV} */
    public static native int nglPathGlyphIndexArrayNV(int firstPathName, int fontTarget, long fontName, int fontStyle, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale);

    /**
     * @param fontTarget one of:<br><table><tr><td>{@link #GL_STANDARD_FONT_NAME_NV STANDARD_FONT_NAME_NV}</td><td>{@link #GL_SYSTEM_FONT_NAME_NV SYSTEM_FONT_NAME_NV}</td><td>{@link #GL_FILE_NAME_NV FILE_NAME_NV}</td></tr></table>
     * @param fontStyle  one or more of:<br><table><tr><td>{@link #GL_BOLD_BIT_NV BOLD_BIT_NV}</td><td>{@link #GL_ITALIC_BIT_NV ITALIC_BIT_NV}</td></tr></table>
     */
    @NativeType("GLenum")
    public static int glPathGlyphIndexArrayNV(@NativeType("GLuint") int firstPathName, @NativeType("GLenum") int fontTarget, @NativeType("void const *") ByteBuffer fontName, @NativeType("GLbitfield") int fontStyle, @NativeType("GLuint") int firstGlyphIndex, @NativeType("GLsizei") int numGlyphs, @NativeType("GLuint") int pathParameterTemplate, @NativeType("GLfloat") float emScale) {
        if (CHECKS) {
            checkNT1(fontName);
        }
        return nglPathGlyphIndexArrayNV(firstPathName, fontTarget, memAddress(fontName), fontStyle, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale);
    }

    // --- [ glPathMemoryGlyphIndexArrayNV ] ---

    /** Unsafe version of: {@link #glPathMemoryGlyphIndexArrayNV PathMemoryGlyphIndexArrayNV} */
    public static native int nglPathMemoryGlyphIndexArrayNV(int firstPathName, int fontTarget, long fontSize, long fontData, int faceIndex, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale);

    /** @param fontTarget one of:<br><table><tr><td>{@link #GL_STANDARD_FONT_NAME_NV STANDARD_FONT_NAME_NV}</td><td>{@link #GL_SYSTEM_FONT_NAME_NV SYSTEM_FONT_NAME_NV}</td><td>{@link #GL_FILE_NAME_NV FILE_NAME_NV}</td></tr></table> */
    @NativeType("GLenum")
    public static int glPathMemoryGlyphIndexArrayNV(@NativeType("GLuint") int firstPathName, @NativeType("GLenum") int fontTarget, @NativeType("void const *") ByteBuffer fontData, @NativeType("GLsizei") int faceIndex, @NativeType("GLuint") int firstGlyphIndex, @NativeType("GLsizei") int numGlyphs, @NativeType("GLuint") int pathParameterTemplate, @NativeType("GLfloat") float emScale) {
        return nglPathMemoryGlyphIndexArrayNV(firstPathName, fontTarget, fontData.remaining(), memAddress(fontData), faceIndex, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale);
    }

    // --- [ glCopyPathNV ] ---

    public static native void glCopyPathNV(@NativeType("GLuint") int resultPath, @NativeType("GLuint") int srcPath);

    // --- [ glWeightPathsNV ] ---

    public static native void nglWeightPathsNV(int resultPath, int numPaths, long paths, long weights);

    public static void glWeightPathsNV(@NativeType("GLuint") int resultPath, @NativeType("GLuint const *") IntBuffer paths, @NativeType("GLfloat const *") FloatBuffer weights) {
        if (CHECKS) {
            check(weights, paths.remaining());
        }
        nglWeightPathsNV(resultPath, paths.remaining(), memAddress(paths), memAddress(weights));
    }

    // --- [ glInterpolatePathsNV ] ---

    public static native void glInterpolatePathsNV(@NativeType("GLuint") int resultPath, @NativeType("GLuint") int pathA, @NativeType("GLuint") int pathB, @NativeType("GLfloat") float weight);

    // --- [ glTransformPathNV ] ---

    /** Unsafe version of: {@link #glTransformPathNV TransformPathNV} */
    public static native void nglTransformPathNV(int resultPath, int srcPath, int transformType, long transformValues);

    /** @param transformType one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table> */
    public static void glTransformPathNV(@NativeType("GLuint") int resultPath, @NativeType("GLuint") int srcPath, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") FloatBuffer transformValues) {
        if (CHECKS) {
            check(transformValues, transformTypeToElements(transformType));
        }
        nglTransformPathNV(resultPath, srcPath, transformType, memAddress(transformValues));
    }

    // --- [ glPathParameterivNV ] ---

    /** Unsafe version of: {@link #glPathParameterivNV PathParameterivNV} */
    public static native void nglPathParameterivNV(int path, int pname, long value);

    /** @param pname one of:<br><table><tr><td>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}</td><td>{@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}</td><td>{@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}</td><td>{@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}</td><td>{@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}</td><td>{@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}</td><td>{@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td><td>{@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}</td></tr></table> */
    public static void glPathParameterivNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglPathParameterivNV(path, pname, memAddress(value));
    }

    // --- [ glPathParameteriNV ] ---

    /** @param pname one of:<br><table><tr><td>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}</td><td>{@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}</td><td>{@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}</td><td>{@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}</td><td>{@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}</td><td>{@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}</td><td>{@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td><td>{@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}</td></tr></table> */
    public static native void glPathParameteriNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLint") int value);

    // --- [ glPathParameterfvNV ] ---

    /** Unsafe version of: {@link #glPathParameterfvNV PathParameterfvNV} */
    public static native void nglPathParameterfvNV(int path, int pname, long value);

    /** @param pname one of:<br><table><tr><td>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}</td><td>{@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}</td><td>{@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}</td><td>{@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}</td><td>{@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}</td><td>{@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}</td><td>{@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td><td>{@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}</td><td>{@link #GL_PATH_END_CAPS_NV PATH_END_CAPS_NV}</td><td>{@link #GL_PATH_DASH_CAPS_NV PATH_DASH_CAPS_NV}</td></tr></table> */
    public static void glPathParameterfvNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglPathParameterfvNV(path, pname, memAddress(value));
    }

    // --- [ glPathParameterfNV ] ---

    /** @param pname one of:<br><table><tr><td>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}</td><td>{@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}</td><td>{@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}</td><td>{@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}</td><td>{@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}</td><td>{@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}</td><td>{@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td><td>{@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}</td><td>{@link #GL_PATH_END_CAPS_NV PATH_END_CAPS_NV}</td><td>{@link #GL_PATH_DASH_CAPS_NV PATH_DASH_CAPS_NV}</td></tr></table> */
    public static native void glPathParameterfNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLfloat") float value);

    // --- [ glPathDashArrayNV ] ---

    public static native void nglPathDashArrayNV(int path, int dashCount, long dashArray);

    public static void glPathDashArrayNV(@NativeType("GLuint") int path, @NativeType("GLfloat const *") FloatBuffer dashArray) {
        nglPathDashArrayNV(path, dashArray.remaining(), memAddress(dashArray));
    }

    // --- [ glGenPathsNV ] ---

    @NativeType("GLuint")
    public static native int glGenPathsNV(@NativeType("GLsizei") int range);

    // --- [ glDeletePathsNV ] ---

    public static native void glDeletePathsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int range);

    // --- [ glIsPathNV ] ---

    @NativeType("GLboolean")
    public static native boolean glIsPathNV(@NativeType("GLuint") int path);

    // --- [ glPathStencilFuncNV ] ---

    public static native void glPathStencilFuncNV(@NativeType("GLenum") int func, @NativeType("GLint") int ref, @NativeType("GLuint") int mask);

    // --- [ glPathStencilDepthOffsetNV ] ---

    public static native void glPathStencilDepthOffsetNV(@NativeType("GLfloat") float factor, @NativeType("GLfloat") float units);

    // --- [ glStencilFillPathNV ] ---

    /** @param fillMode one of:<br><table><tr><td>{@link GL11#GL_INVERT INVERT}</td><td>{@link #GL_COUNT_UP_NV COUNT_UP_NV}</td><td>{@link #GL_COUNT_DOWN_NV COUNT_DOWN_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td></tr></table> */
    public static native void glStencilFillPathNV(@NativeType("GLuint") int path, @NativeType("GLenum") int fillMode, @NativeType("GLuint") int mask);

    // --- [ glStencilStrokePathNV ] ---

    public static native void glStencilStrokePathNV(@NativeType("GLuint") int path, @NativeType("GLint") int reference, @NativeType("GLuint") int mask);

    // --- [ glStencilFillPathInstancedNV ] ---

    /** Unsafe version of: {@link #glStencilFillPathInstancedNV StencilFillPathInstancedNV} */
    public static native void nglStencilFillPathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int fillMode, int mask, int transformType, long transformValues);

    /**
     * @param pathNameType  one of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
     * @param fillMode      one of:<br><table><tr><td>{@link GL11#GL_INVERT INVERT}</td><td>{@link #GL_COUNT_UP_NV COUNT_UP_NV}</td><td>{@link #GL_COUNT_DOWN_NV COUNT_DOWN_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td></tr></table>
     * @param transformType one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table>
     */
    public static void glStencilFillPathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLenum") int fillMode, @NativeType("GLuint") int mask, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") FloatBuffer transformValues) {
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        nglStencilFillPathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, fillMode, mask, transformType, memAddress(transformValues));
    }

    // --- [ glStencilStrokePathInstancedNV ] ---

    /** Unsafe version of: {@link #glStencilStrokePathInstancedNV StencilStrokePathInstancedNV} */
    public static native void nglStencilStrokePathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int reference, int mask, int transformType, long transformValues);

    /**
     * @param pathNameType  one of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
     * @param transformType one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table>
     */
    public static void glStencilStrokePathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLint") int reference, @NativeType("GLuint") int mask, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") FloatBuffer transformValues) {
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        nglStencilStrokePathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, reference, mask, transformType, memAddress(transformValues));
    }

    // --- [ glPathCoverDepthFuncNV ] ---

    public static native void glPathCoverDepthFuncNV(@NativeType("GLenum") int zfunc);

    // --- [ glPathColorGenNV ] ---

    /** Unsafe version of: {@link #glPathColorGenNV PathColorGenNV} */
    public static native void nglPathColorGenNV(int color, int genMode, int colorFormat, long coeffs);

    /**
     * @param color       one of:<br><table><tr><td>{@link GL13#GL_PRIMARY_COLOR PRIMARY_COLOR}</td><td>{@link #GL_PRIMARY_COLOR_NV PRIMARY_COLOR_NV}</td><td>{@link #GL_SECONDARY_COLOR_NV SECONDARY_COLOR_NV}</td></tr></table>
     * @param genMode     one of:<br><table><tr><td>{@link GL11#GL_NONE NONE}</td><td>{@link #GL_OBJECT_LINEAR_NV OBJECT_LINEAR_NV}</td><td>{@link #GL_PATH_OBJECT_BOUNDING_BOX_NV PATH_OBJECT_BOUNDING_BOX_NV}</td><td>{@link #GL_EYE_LINEAR_NV EYE_LINEAR_NV}</td><td>{@link #GL_CONSTANT_NV CONSTANT_NV}</td></tr></table>
     * @param colorFormat {@link GL11#GL_LUMINANCE LUMINANCE} {@link GL11#GL_ALPHA ALPHA} {@link GL11#GL_INTENSITY INTENSITY} {@link GL11#GL_LUMINANCE_ALPHA LUMINANCE_ALPHA} {@link GL11#GL_RGB RGB} {@link GL11#GL_RGBA RGBA}
     */
    public static void glPathColorGenNV(@NativeType("GLenum") int color, @NativeType("GLenum") int genMode, @NativeType("GLenum") int colorFormat, @NativeType("GLfloat const *") FloatBuffer coeffs) {
        if (CHECKS) {
            check(coeffs, genModeToElements(genMode) * colorFormatToComponents(colorFormat));
        }
        nglPathColorGenNV(color, genMode, colorFormat, memAddress(coeffs));
    }

    // --- [ glPathTexGenNV ] ---

    public static native void nglPathTexGenNV(int texCoordSet, int genMode, int components, long coeffs);

    public static void glPathTexGenNV(@NativeType("GLenum") int texCoordSet, @NativeType("GLenum") int genMode, @NativeType("GLint") int components, @NativeType("GLfloat const *") FloatBuffer coeffs) {
        if (CHECKS) {
            check(coeffs, genModeToElements(genMode) * components);
        }
        nglPathTexGenNV(texCoordSet, genMode, components, memAddress(coeffs));
    }

    // --- [ glPathFogGenNV ] ---

    public static native void glPathFogGenNV(@NativeType("GLenum") int genMode);

    // --- [ glCoverFillPathNV ] ---

    /** @param coverMode one of:<br><table><tr><td>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}</td><td>{@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}</td></tr></table> */
    public static native void glCoverFillPathNV(@NativeType("GLuint") int path, @NativeType("GLenum") int coverMode);

    // --- [ glCoverStrokePathNV ] ---

    /** @param coverMode one of:<br><table><tr><td>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}</td><td>{@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}</td></tr></table> */
    public static native void glCoverStrokePathNV(@NativeType("GLuint") int path, @NativeType("GLenum") int coverMode);

    // --- [ glCoverFillPathInstancedNV ] ---

    /** Unsafe version of: {@link #glCoverFillPathInstancedNV CoverFillPathInstancedNV} */
    public static native void nglCoverFillPathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int coverMode, int transformType, long transformValues);

    /**
     * @param pathNameType  one of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
     * @param coverMode     one of:<br><table><tr><td>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}</td><td>{@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}</td><td>{@link #GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV BOUNDING_BOX_OF_BOUNDING_BOXES_NV}</td></tr></table>
     * @param transformType one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table>
     */
    public static void glCoverFillPathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLenum") int coverMode, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") FloatBuffer transformValues) {
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        nglCoverFillPathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, coverMode, transformType, memAddress(transformValues));
    }

    // --- [ glCoverStrokePathInstancedNV ] ---

    /** Unsafe version of: {@link #glCoverStrokePathInstancedNV CoverStrokePathInstancedNV} */
    public static native void nglCoverStrokePathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int coverMode, int transformType, long transformValues);

    /**
     * @param pathNameType  one of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
     * @param coverMode     one of:<br><table><tr><td>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}</td><td>{@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}</td><td>{@link #GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV BOUNDING_BOX_OF_BOUNDING_BOXES_NV}</td></tr></table>
     * @param transformType one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table>
     */
    public static void glCoverStrokePathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLenum") int coverMode, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") FloatBuffer transformValues) {
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        nglCoverStrokePathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, coverMode, transformType, memAddress(transformValues));
    }

    // --- [ glStencilThenCoverFillPathNV ] ---

    /**
     * @param fillMode  one of:<br><table><tr><td>{@link GL11#GL_INVERT INVERT}</td><td>{@link #GL_COUNT_UP_NV COUNT_UP_NV}</td><td>{@link #GL_COUNT_DOWN_NV COUNT_DOWN_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td></tr></table>
     * @param coverMode one of:<br><table><tr><td>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}</td><td>{@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}</td></tr></table>
     */
    public static native void glStencilThenCoverFillPathNV(@NativeType("GLuint") int path, @NativeType("GLenum") int fillMode, @NativeType("GLuint") int mask, @NativeType("GLenum") int coverMode);

    // --- [ glStencilThenCoverStrokePathNV ] ---

    /** @param coverMode one of:<br><table><tr><td>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}</td><td>{@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}</td></tr></table> */
    public static native void glStencilThenCoverStrokePathNV(@NativeType("GLuint") int path, @NativeType("GLint") int reference, @NativeType("GLuint") int mask, @NativeType("GLenum") int coverMode);

    // --- [ glStencilThenCoverFillPathInstancedNV ] ---

    /** Unsafe version of: {@link #glStencilThenCoverFillPathInstancedNV StencilThenCoverFillPathInstancedNV} */
    public static native void nglStencilThenCoverFillPathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int fillMode, int mask, int coverMode, int transformType, long transformValues);

    /**
     * @param pathNameType  one of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
     * @param fillMode      one of:<br><table><tr><td>{@link GL11#GL_INVERT INVERT}</td><td>{@link #GL_COUNT_UP_NV COUNT_UP_NV}</td><td>{@link #GL_COUNT_DOWN_NV COUNT_DOWN_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td></tr></table>
     * @param coverMode     one of:<br><table><tr><td>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}</td><td>{@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}</td><td>{@link #GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV BOUNDING_BOX_OF_BOUNDING_BOXES_NV}</td></tr></table>
     * @param transformType one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table>
     */
    public static void glStencilThenCoverFillPathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLenum") int fillMode, @NativeType("GLuint") int mask, @NativeType("GLenum") int coverMode, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") FloatBuffer transformValues) {
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        nglStencilThenCoverFillPathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, fillMode, mask, coverMode, transformType, memAddress(transformValues));
    }

    // --- [ glStencilThenCoverStrokePathInstancedNV ] ---

    /** Unsafe version of: {@link #glStencilThenCoverStrokePathInstancedNV StencilThenCoverStrokePathInstancedNV} */
    public static native void nglStencilThenCoverStrokePathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int reference, int mask, int coverMode, int transformType, long transformValues);

    /**
     * @param pathNameType  one of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
     * @param coverMode     one of:<br><table><tr><td>{@link #GL_CONVEX_HULL_NV CONVEX_HULL_NV}</td><td>{@link #GL_BOUNDING_BOX_NV BOUNDING_BOX_NV}</td><td>{@link #GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV BOUNDING_BOX_OF_BOUNDING_BOXES_NV}</td></tr></table>
     * @param transformType one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_Y_NV TRANSLATE_Y_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td><td>{@link #GL_TRANSLATE_3D_NV TRANSLATE_3D_NV}</td><td>{@link #GL_AFFINE_2D_NV AFFINE_2D_NV}</td></tr><tr><td>{@link #GL_AFFINE_3D_NV AFFINE_3D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_2D_NV TRANSPOSE_AFFINE_2D_NV}</td><td>{@link #GL_TRANSPOSE_AFFINE_3D_NV TRANSPOSE_AFFINE_3D_NV}</td></tr></table>
     */
    public static void glStencilThenCoverStrokePathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLint") int reference, @NativeType("GLuint") int mask, @NativeType("GLenum") int coverMode, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") FloatBuffer transformValues) {
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        nglStencilThenCoverStrokePathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, reference, mask, coverMode, transformType, memAddress(transformValues));
    }

    // --- [ glPathGlyphIndexRangeNV ] ---

    /** Unsafe version of: {@link #glPathGlyphIndexRangeNV PathGlyphIndexRangeNV} */
    public static native int nglPathGlyphIndexRangeNV(int fontTarget, long fontName, int fontStyle, int pathParameterTemplate, float emScale, long baseAndCount);

    /**
     * @param fontTarget one of:<br><table><tr><td>{@link #GL_STANDARD_FONT_NAME_NV STANDARD_FONT_NAME_NV}</td><td>{@link #GL_SYSTEM_FONT_NAME_NV SYSTEM_FONT_NAME_NV}</td><td>{@link #GL_FILE_NAME_NV FILE_NAME_NV}</td></tr></table>
     * @param fontStyle  one or more of:<br><table><tr><td>{@link #GL_BOLD_BIT_NV BOLD_BIT_NV}</td><td>{@link #GL_ITALIC_BIT_NV ITALIC_BIT_NV}</td></tr></table>
     */
    @NativeType("GLenum")
    public static int glPathGlyphIndexRangeNV(@NativeType("GLenum") int fontTarget, @NativeType("void const *") ByteBuffer fontName, @NativeType("GLbitfield") int fontStyle, @NativeType("GLuint") int pathParameterTemplate, @NativeType("GLfloat") float emScale, @NativeType("GLuint *") IntBuffer baseAndCount) {
        if (CHECKS) {
            checkNT1(fontName);
            check(baseAndCount, 2);
        }
        return nglPathGlyphIndexRangeNV(fontTarget, memAddress(fontName), fontStyle, pathParameterTemplate, emScale, memAddress(baseAndCount));
    }

    // --- [ glProgramPathFragmentInputGenNV ] ---

    public static native void nglProgramPathFragmentInputGenNV(int program, int location, int genMode, int components, long coeffs);

    public static void glProgramPathFragmentInputGenNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLenum") int genMode, @NativeType("GLint") int components, @NativeType("GLfloat const *") FloatBuffer coeffs) {
        if (CHECKS) {
            check(coeffs, genModeToElements(genMode) * components);
        }
        nglProgramPathFragmentInputGenNV(program, location, genMode, components, memAddress(coeffs));
    }

    // --- [ glGetPathParameterivNV ] ---

    /** Unsafe version of: {@link #glGetPathParameterivNV GetPathParameterivNV} */
    public static native void nglGetPathParameterivNV(int path, int pname, long value);

    /** @param pname one of:<br><table><tr><td>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}</td><td>{@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}</td><td>{@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}</td><td>{@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}</td><td>{@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}</td><td>{@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}</td><td>{@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td><td>{@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}</td><td>{@link #GL_PATH_COMMAND_COUNT_NV PATH_COMMAND_COUNT_NV}</td><td>{@link #GL_PATH_COORD_COUNT_NV PATH_COORD_COUNT_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_ARRAY_COUNT_NV PATH_DASH_ARRAY_COUNT_NV}</td><td>{@link #GL_PATH_COMPUTED_LENGTH_NV PATH_COMPUTED_LENGTH_NV}</td><td>{@link #GL_PATH_FILL_BOUNDING_BOX_NV PATH_FILL_BOUNDING_BOX_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUNDING_BOX_NV PATH_STROKE_BOUNDING_BOX_NV}</td></tr></table> */
    public static void glGetPathParameterivNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglGetPathParameterivNV(path, pname, memAddress(value));
    }

    /** @param pname one of:<br><table><tr><td>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}</td><td>{@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}</td><td>{@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}</td><td>{@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}</td><td>{@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}</td><td>{@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}</td><td>{@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td><td>{@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}</td><td>{@link #GL_PATH_COMMAND_COUNT_NV PATH_COMMAND_COUNT_NV}</td><td>{@link #GL_PATH_COORD_COUNT_NV PATH_COORD_COUNT_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_ARRAY_COUNT_NV PATH_DASH_ARRAY_COUNT_NV}</td><td>{@link #GL_PATH_COMPUTED_LENGTH_NV PATH_COMPUTED_LENGTH_NV}</td><td>{@link #GL_PATH_FILL_BOUNDING_BOX_NV PATH_FILL_BOUNDING_BOX_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUNDING_BOX_NV PATH_STROKE_BOUNDING_BOX_NV}</td></tr></table> */
    @NativeType("void")
    public static int glGetPathParameteriNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nglGetPathParameterivNV(path, pname, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetPathParameterfvNV ] ---

    /** Unsafe version of: {@link #glGetPathParameterfvNV GetPathParameterfvNV} */
    public static native void nglGetPathParameterfvNV(int path, int pname, long value);

    /** @param pname one of:<br><table><tr><td>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}</td><td>{@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}</td><td>{@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}</td><td>{@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}</td><td>{@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}</td><td>{@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}</td><td>{@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td><td>{@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}</td><td>{@link #GL_PATH_COMMAND_COUNT_NV PATH_COMMAND_COUNT_NV}</td><td>{@link #GL_PATH_COORD_COUNT_NV PATH_COORD_COUNT_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_ARRAY_COUNT_NV PATH_DASH_ARRAY_COUNT_NV}</td><td>{@link #GL_PATH_COMPUTED_LENGTH_NV PATH_COMPUTED_LENGTH_NV}</td><td>{@link #GL_PATH_FILL_BOUNDING_BOX_NV PATH_FILL_BOUNDING_BOX_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUNDING_BOX_NV PATH_STROKE_BOUNDING_BOX_NV}</td></tr></table> */
    public static void glGetPathParameterfvNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglGetPathParameterfvNV(path, pname, memAddress(value));
    }

    /** @param pname one of:<br><table><tr><td>{@link #GL_PATH_STROKE_WIDTH_NV PATH_STROKE_WIDTH_NV}</td><td>{@link #GL_PATH_INITIAL_END_CAP_NV PATH_INITIAL_END_CAP_NV}</td><td>{@link #GL_PATH_TERMINAL_END_CAP_NV PATH_TERMINAL_END_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_JOIN_STYLE_NV PATH_JOIN_STYLE_NV}</td><td>{@link #GL_PATH_MITER_LIMIT_NV PATH_MITER_LIMIT_NV}</td><td>{@link #GL_PATH_INITIAL_DASH_CAP_NV PATH_INITIAL_DASH_CAP_NV}</td></tr><tr><td>{@link #GL_PATH_TERMINAL_DASH_CAP_NV PATH_TERMINAL_DASH_CAP_NV}</td><td>{@link #GL_PATH_DASH_OFFSET_NV PATH_DASH_OFFSET_NV}</td><td>{@link #GL_PATH_CLIENT_LENGTH_NV PATH_CLIENT_LENGTH_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_OFFSET_RESET_NV PATH_DASH_OFFSET_RESET_NV}</td><td>{@link #GL_PATH_FILL_MODE_NV PATH_FILL_MODE_NV}</td><td>{@link #GL_PATH_FILL_MASK_NV PATH_FILL_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_FILL_COVER_MODE_NV PATH_FILL_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_COVER_MODE_NV PATH_STROKE_COVER_MODE_NV}</td><td>{@link #GL_PATH_STROKE_MASK_NV PATH_STROKE_MASK_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUND_NV PATH_STROKE_BOUND_NV}</td><td>{@link #GL_PATH_COMMAND_COUNT_NV PATH_COMMAND_COUNT_NV}</td><td>{@link #GL_PATH_COORD_COUNT_NV PATH_COORD_COUNT_NV}</td></tr><tr><td>{@link #GL_PATH_DASH_ARRAY_COUNT_NV PATH_DASH_ARRAY_COUNT_NV}</td><td>{@link #GL_PATH_COMPUTED_LENGTH_NV PATH_COMPUTED_LENGTH_NV}</td><td>{@link #GL_PATH_FILL_BOUNDING_BOX_NV PATH_FILL_BOUNDING_BOX_NV}</td></tr><tr><td>{@link #GL_PATH_STROKE_BOUNDING_BOX_NV PATH_STROKE_BOUNDING_BOX_NV}</td></tr></table> */
    @NativeType("void")
    public static float glGetPathParameterfNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nglGetPathParameterfvNV(path, pname, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetPathCommandsNV ] ---

    public static native void nglGetPathCommandsNV(int path, long commands);

    public static void glGetPathCommandsNV(@NativeType("GLuint") int path, @NativeType("GLubyte *") ByteBuffer commands) {
        if (CHECKS) {
            if (DEBUG) {
                check(commands, glGetPathParameteriNV(path, GL_PATH_COMMAND_COUNT_NV));
            }
        }
        nglGetPathCommandsNV(path, memAddress(commands));
    }

    // --- [ glGetPathCoordsNV ] ---

    public static native void nglGetPathCoordsNV(int path, long coords);

    public static void glGetPathCoordsNV(@NativeType("GLuint") int path, @NativeType("GLfloat *") FloatBuffer coords) {
        if (CHECKS) {
            if (DEBUG) {
                check(coords, glGetPathParameteriNV(path, GL_PATH_COORD_COUNT_NV));
            }
        }
        nglGetPathCoordsNV(path, memAddress(coords));
    }

    // --- [ glGetPathDashArrayNV ] ---

    public static native void nglGetPathDashArrayNV(int path, long dashArray);

    public static void glGetPathDashArrayNV(@NativeType("GLuint") int path, @NativeType("GLfloat *") FloatBuffer dashArray) {
        if (CHECKS) {
            if (DEBUG) {
                check(dashArray, glGetPathParameteriNV(path, GL_PATH_DASH_ARRAY_COUNT_NV));
            }
        }
        nglGetPathDashArrayNV(path, memAddress(dashArray));
    }

    // --- [ glGetPathMetricsNV ] ---

    /** Unsafe version of: {@link #glGetPathMetricsNV GetPathMetricsNV} */
    public static native void nglGetPathMetricsNV(int metricQueryMask, int numPaths, int pathNameType, long paths, int pathBase, int stride, long metrics);

    /**
     * @param metricQueryMask one or more of:<br><table><tr><td>{@link #GL_GLYPH_WIDTH_BIT_NV GLYPH_WIDTH_BIT_NV}</td><td>{@link #GL_GLYPH_HEIGHT_BIT_NV GLYPH_HEIGHT_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_HORIZONTAL_BEARING_X_BIT_NV GLYPH_HORIZONTAL_BEARING_X_BIT_NV}</td><td>{@link #GL_GLYPH_HORIZONTAL_BEARING_Y_BIT_NV GLYPH_HORIZONTAL_BEARING_Y_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV}</td><td>{@link #GL_GLYPH_VERTICAL_BEARING_X_BIT_NV GLYPH_VERTICAL_BEARING_X_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_VERTICAL_BEARING_Y_BIT_NV GLYPH_VERTICAL_BEARING_Y_BIT_NV}</td><td>{@link #GL_GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_HAS_KERNING_BIT_NV GLYPH_HAS_KERNING_BIT_NV}</td><td>{@link #GL_FONT_X_MIN_BOUNDS_BIT_NV FONT_X_MIN_BOUNDS_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_Y_MIN_BOUNDS_BIT_NV FONT_Y_MIN_BOUNDS_BIT_NV}</td><td>{@link #GL_FONT_X_MAX_BOUNDS_BIT_NV FONT_X_MAX_BOUNDS_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_Y_MAX_BOUNDS_BIT_NV FONT_Y_MAX_BOUNDS_BIT_NV}</td><td>{@link #GL_FONT_UNITS_PER_EM_BIT_NV FONT_UNITS_PER_EM_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_ASCENDER_BIT_NV FONT_ASCENDER_BIT_NV}</td><td>{@link #GL_FONT_DESCENDER_BIT_NV FONT_DESCENDER_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_HEIGHT_BIT_NV FONT_HEIGHT_BIT_NV}</td><td>{@link #GL_FONT_MAX_ADVANCE_WIDTH_BIT_NV FONT_MAX_ADVANCE_WIDTH_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_MAX_ADVANCE_HEIGHT_BIT_NV FONT_MAX_ADVANCE_HEIGHT_BIT_NV}</td><td>{@link #GL_FONT_UNDERLINE_POSITION_BIT_NV FONT_UNDERLINE_POSITION_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_UNDERLINE_THICKNESS_BIT_NV FONT_UNDERLINE_THICKNESS_BIT_NV}</td><td>{@link #GL_FONT_HAS_KERNING_BIT_NV FONT_HAS_KERNING_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_NUM_GLYPH_INDICES_BIT_NV FONT_NUM_GLYPH_INDICES_BIT_NV}</td></tr></table>
     * @param pathNameType    one of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
     */
    public static void glGetPathMetricsNV(@NativeType("GLbitfield") int metricQueryMask, @NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLsizei") int stride, @NativeType("GLfloat *") FloatBuffer metrics) {
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(metrics, numPaths * (stride == 0 ? Integer.bitCount(metricQueryMask) : (stride >> 2)));
        }
        nglGetPathMetricsNV(metricQueryMask, numPaths, pathNameType, memAddress(paths), pathBase, stride, memAddress(metrics));
    }

    // --- [ glGetPathMetricRangeNV ] ---

    /** Unsafe version of: {@link #glGetPathMetricRangeNV GetPathMetricRangeNV} */
    public static native void nglGetPathMetricRangeNV(int metricQueryMask, int firstPathName, int numPaths, int stride, long metrics);

    /** @param metricQueryMask one or more of:<br><table><tr><td>{@link #GL_GLYPH_WIDTH_BIT_NV GLYPH_WIDTH_BIT_NV}</td><td>{@link #GL_GLYPH_HEIGHT_BIT_NV GLYPH_HEIGHT_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_HORIZONTAL_BEARING_X_BIT_NV GLYPH_HORIZONTAL_BEARING_X_BIT_NV}</td><td>{@link #GL_GLYPH_HORIZONTAL_BEARING_Y_BIT_NV GLYPH_HORIZONTAL_BEARING_Y_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV}</td><td>{@link #GL_GLYPH_VERTICAL_BEARING_X_BIT_NV GLYPH_VERTICAL_BEARING_X_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_VERTICAL_BEARING_Y_BIT_NV GLYPH_VERTICAL_BEARING_Y_BIT_NV}</td><td>{@link #GL_GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV}</td></tr><tr><td>{@link #GL_GLYPH_HAS_KERNING_BIT_NV GLYPH_HAS_KERNING_BIT_NV}</td><td>{@link #GL_FONT_X_MIN_BOUNDS_BIT_NV FONT_X_MIN_BOUNDS_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_Y_MIN_BOUNDS_BIT_NV FONT_Y_MIN_BOUNDS_BIT_NV}</td><td>{@link #GL_FONT_X_MAX_BOUNDS_BIT_NV FONT_X_MAX_BOUNDS_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_Y_MAX_BOUNDS_BIT_NV FONT_Y_MAX_BOUNDS_BIT_NV}</td><td>{@link #GL_FONT_UNITS_PER_EM_BIT_NV FONT_UNITS_PER_EM_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_ASCENDER_BIT_NV FONT_ASCENDER_BIT_NV}</td><td>{@link #GL_FONT_DESCENDER_BIT_NV FONT_DESCENDER_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_HEIGHT_BIT_NV FONT_HEIGHT_BIT_NV}</td><td>{@link #GL_FONT_MAX_ADVANCE_WIDTH_BIT_NV FONT_MAX_ADVANCE_WIDTH_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_MAX_ADVANCE_HEIGHT_BIT_NV FONT_MAX_ADVANCE_HEIGHT_BIT_NV}</td><td>{@link #GL_FONT_UNDERLINE_POSITION_BIT_NV FONT_UNDERLINE_POSITION_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_UNDERLINE_THICKNESS_BIT_NV FONT_UNDERLINE_THICKNESS_BIT_NV}</td><td>{@link #GL_FONT_HAS_KERNING_BIT_NV FONT_HAS_KERNING_BIT_NV}</td></tr><tr><td>{@link #GL_FONT_NUM_GLYPH_INDICES_BIT_NV FONT_NUM_GLYPH_INDICES_BIT_NV}</td></tr></table> */
    public static void glGetPathMetricRangeNV(@NativeType("GLbitfield") int metricQueryMask, @NativeType("GLuint") int firstPathName, @NativeType("GLsizei") int numPaths, @NativeType("GLsizei") int stride, @NativeType("GLfloat *") FloatBuffer metrics) {
        if (CHECKS) {
            check(metrics, numPaths * (stride == 0 ? Integer.bitCount(metricQueryMask) : (stride >> 2)));
        }
        nglGetPathMetricRangeNV(metricQueryMask, firstPathName, numPaths, stride, memAddress(metrics));
    }

    // --- [ glGetPathSpacingNV ] ---

    /** Unsafe version of: {@link #glGetPathSpacingNV GetPathSpacingNV} */
    public static native void nglGetPathSpacingNV(int pathListMode, int numPaths, int pathNameType, long paths, int pathBase, float advanceScale, float kerningScale, int transformType, long returnedSpacing);

    /**
     * @param pathListMode  one of:<br><table><tr><td>{@link #GL_ACCUM_ADJACENT_PAIRS_NV ACCUM_ADJACENT_PAIRS_NV}</td><td>{@link #GL_ADJACENT_PAIRS_NV ADJACENT_PAIRS_NV}</td><td>{@link #GL_FIRST_TO_REST_NV FIRST_TO_REST_NV}</td></tr></table>
     * @param pathNameType  one of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link #GL_UTF8_NV UTF8_NV}</td><td>{@link #GL_UTF16_NV UTF16_NV}</td><td>{@link #GL_2_BYTES_NV 2_BYTES_NV}</td></tr><tr><td>{@link #GL_3_BYTES_NV 3_BYTES_NV}</td><td>{@link #GL_4_BYTES_NV 4_BYTES_NV}</td></tr></table>
     * @param transformType one of:<br><table><tr><td>{@link #GL_TRANSLATE_X_NV TRANSLATE_X_NV}</td><td>{@link #GL_TRANSLATE_2D_NV TRANSLATE_2D_NV}</td></tr></table>
     */
    public static void glGetPathSpacingNV(@NativeType("GLenum") int pathListMode, @NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLfloat") float advanceScale, @NativeType("GLfloat") float kerningScale, @NativeType("GLenum") int transformType, @NativeType("GLfloat *") FloatBuffer returnedSpacing) {
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(returnedSpacing, (numPaths - 1) * (transformType == GL_TRANSLATE_X_NV ? 1 : 2));
        }
        nglGetPathSpacingNV(pathListMode, numPaths, pathNameType, memAddress(paths), pathBase, advanceScale, kerningScale, transformType, memAddress(returnedSpacing));
    }

    // --- [ glGetPathColorGenivNV ] ---

    /** Unsafe version of: {@link #glGetPathColorGenivNV GetPathColorGenivNV} */
    public static native void nglGetPathColorGenivNV(int color, int pname, long value);

    /**
     * @param color one of:<br><table><tr><td>{@link GL13#GL_PRIMARY_COLOR PRIMARY_COLOR}</td><td>{@link #GL_PRIMARY_COLOR_NV PRIMARY_COLOR_NV}</td><td>{@link #GL_SECONDARY_COLOR_NV SECONDARY_COLOR_NV}</td></tr></table>
     * @param pname one of:<br><table><tr><td>{@link #GL_PATH_GEN_MODE_NV PATH_GEN_MODE_NV}</td><td>{@link #GL_PATH_GEN_COEFF_NV PATH_GEN_COEFF_NV}</td><td>{@link #GL_PATH_GEN_COLOR_FORMAT_NV PATH_GEN_COLOR_FORMAT_NV}</td></tr></table>
     */
    public static void glGetPathColorGenivNV(@NativeType("GLenum") int color, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglGetPathColorGenivNV(color, pname, memAddress(value));
    }

    /**
     * @param color one of:<br><table><tr><td>{@link GL13#GL_PRIMARY_COLOR PRIMARY_COLOR}</td><td>{@link #GL_PRIMARY_COLOR_NV PRIMARY_COLOR_NV}</td><td>{@link #GL_SECONDARY_COLOR_NV SECONDARY_COLOR_NV}</td></tr></table>
     * @param pname one of:<br><table><tr><td>{@link #GL_PATH_GEN_MODE_NV PATH_GEN_MODE_NV}</td><td>{@link #GL_PATH_GEN_COEFF_NV PATH_GEN_COEFF_NV}</td><td>{@link #GL_PATH_GEN_COLOR_FORMAT_NV PATH_GEN_COLOR_FORMAT_NV}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetPathColorGeniNV(@NativeType("GLenum") int color, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nglGetPathColorGenivNV(color, pname, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetPathColorGenfvNV ] ---

    /** Unsafe version of: {@link #glGetPathColorGenfvNV GetPathColorGenfvNV} */
    public static native void nglGetPathColorGenfvNV(int color, int pname, long value);

    /**
     * @param color one of:<br><table><tr><td>{@link GL13#GL_PRIMARY_COLOR PRIMARY_COLOR}</td><td>{@link #GL_PRIMARY_COLOR_NV PRIMARY_COLOR_NV}</td><td>{@link #GL_SECONDARY_COLOR_NV SECONDARY_COLOR_NV}</td></tr></table>
     * @param pname one of:<br><table><tr><td>{@link #GL_PATH_GEN_MODE_NV PATH_GEN_MODE_NV}</td><td>{@link #GL_PATH_GEN_COEFF_NV PATH_GEN_COEFF_NV}</td><td>{@link #GL_PATH_GEN_COLOR_FORMAT_NV PATH_GEN_COLOR_FORMAT_NV}</td></tr></table>
     */
    public static void glGetPathColorGenfvNV(@NativeType("GLenum") int color, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglGetPathColorGenfvNV(color, pname, memAddress(value));
    }

    /**
     * @param color one of:<br><table><tr><td>{@link GL13#GL_PRIMARY_COLOR PRIMARY_COLOR}</td><td>{@link #GL_PRIMARY_COLOR_NV PRIMARY_COLOR_NV}</td><td>{@link #GL_SECONDARY_COLOR_NV SECONDARY_COLOR_NV}</td></tr></table>
     * @param pname one of:<br><table><tr><td>{@link #GL_PATH_GEN_MODE_NV PATH_GEN_MODE_NV}</td><td>{@link #GL_PATH_GEN_COEFF_NV PATH_GEN_COEFF_NV}</td><td>{@link #GL_PATH_GEN_COLOR_FORMAT_NV PATH_GEN_COLOR_FORMAT_NV}</td></tr></table>
     */
    @NativeType("void")
    public static float glGetPathColorGenfNV(@NativeType("GLenum") int color, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nglGetPathColorGenfvNV(color, pname, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetPathTexGenivNV ] ---

    /** Unsafe version of: {@link #glGetPathTexGenivNV GetPathTexGenivNV} */
    public static native void nglGetPathTexGenivNV(int texCoordSet, int pname, long value);

    /** @param pname {@link #GL_PATH_GEN_MODE_NV PATH_GEN_MODE_NV} {@link #GL_PATH_GEN_COEFF_NV PATH_GEN_COEFF_NV} {@link #GL_PATH_GEN_COMPONENTS_NV PATH_GEN_COMPONENTS_NV} */
    public static void glGetPathTexGenivNV(@NativeType("GLenum") int texCoordSet, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglGetPathTexGenivNV(texCoordSet, pname, memAddress(value));
    }

    /** @param pname {@link #GL_PATH_GEN_MODE_NV PATH_GEN_MODE_NV} {@link #GL_PATH_GEN_COEFF_NV PATH_GEN_COEFF_NV} {@link #GL_PATH_GEN_COMPONENTS_NV PATH_GEN_COMPONENTS_NV} */
    @NativeType("void")
    public static int glGetPathTexGeniNV(@NativeType("GLenum") int texCoordSet, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer value = stack.callocInt(1);
            nglGetPathTexGenivNV(texCoordSet, pname, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetPathTexGenfvNV ] ---

    /** Unsafe version of: {@link #glGetPathTexGenfvNV GetPathTexGenfvNV} */
    public static native void nglGetPathTexGenfvNV(int texCoordSet, int pname, long value);

    /** @param pname {@link #GL_PATH_GEN_MODE_NV PATH_GEN_MODE_NV} {@link #GL_PATH_GEN_COEFF_NV PATH_GEN_COEFF_NV} {@link #GL_PATH_GEN_COMPONENTS_NV PATH_GEN_COMPONENTS_NV} */
    public static void glGetPathTexGenfvNV(@NativeType("GLenum") int texCoordSet, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglGetPathTexGenfvNV(texCoordSet, pname, memAddress(value));
    }

    /** @param pname {@link #GL_PATH_GEN_MODE_NV PATH_GEN_MODE_NV} {@link #GL_PATH_GEN_COEFF_NV PATH_GEN_COEFF_NV} {@link #GL_PATH_GEN_COMPONENTS_NV PATH_GEN_COMPONENTS_NV} */
    @NativeType("void")
    public static float glGetPathTexGenfNV(@NativeType("GLenum") int texCoordSet, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer value = stack.callocFloat(1);
            nglGetPathTexGenfvNV(texCoordSet, pname, memAddress(value));
            return value.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsPointInFillPathNV ] ---

    @NativeType("GLboolean")
    public static native boolean glIsPointInFillPathNV(@NativeType("GLuint") int path, @NativeType("GLuint") int mask, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y);

    // --- [ glIsPointInStrokePathNV ] ---

    @NativeType("GLboolean")
    public static native boolean glIsPointInStrokePathNV(@NativeType("GLuint") int path, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y);

    // --- [ glGetPathLengthNV ] ---

    @NativeType("GLfloat")
    public static native float glGetPathLengthNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int startSegment, @NativeType("GLsizei") int numSegments);

    // --- [ glPointAlongPathNV ] ---

    public static native boolean nglPointAlongPathNV(int path, int startSegment, int numSegments, float distance, long x, long y, long tangentX, long tangentY);

    @NativeType("GLboolean")
    public static boolean glPointAlongPathNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int startSegment, @NativeType("GLsizei") int numSegments, @NativeType("GLfloat") float distance, @Nullable @NativeType("GLfloat *") FloatBuffer x, @Nullable @NativeType("GLfloat *") FloatBuffer y, @Nullable @NativeType("GLfloat *") FloatBuffer tangentX, @Nullable @NativeType("GLfloat *") FloatBuffer tangentY) {
        if (CHECKS) {
            checkSafe(x, 1);
            checkSafe(y, 1);
            checkSafe(tangentX, 1);
            checkSafe(tangentY, 1);
        }
        return nglPointAlongPathNV(path, startSegment, numSegments, distance, memAddressSafe(x), memAddressSafe(y), memAddressSafe(tangentX), memAddressSafe(tangentY));
    }

    // --- [ glMatrixLoad3x2fNV ] ---

    /** Unsafe version of: {@link #glMatrixLoad3x2fNV MatrixLoad3x2fNV} */
    public static native void nglMatrixLoad3x2fNV(int matrixMode, long m);

    /** @param matrixMode one of:<br><table><tr><td>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}</td><td>{@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}</td></tr></table> */
    public static void glMatrixLoad3x2fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 6);
        }
        nglMatrixLoad3x2fNV(matrixMode, memAddress(m));
    }

    // --- [ glMatrixLoad3x3fNV ] ---

    /** Unsafe version of: {@link #glMatrixLoad3x3fNV MatrixLoad3x3fNV} */
    public static native void nglMatrixLoad3x3fNV(int matrixMode, long m);

    /** @param matrixMode one of:<br><table><tr><td>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}</td><td>{@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}</td></tr></table> */
    public static void glMatrixLoad3x3fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 9);
        }
        nglMatrixLoad3x3fNV(matrixMode, memAddress(m));
    }

    // --- [ glMatrixLoadTranspose3x3fNV ] ---

    /** Unsafe version of: {@link #glMatrixLoadTranspose3x3fNV MatrixLoadTranspose3x3fNV} */
    public static native void nglMatrixLoadTranspose3x3fNV(int matrixMode, long m);

    /** @param matrixMode one of:<br><table><tr><td>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}</td><td>{@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}</td></tr></table> */
    public static void glMatrixLoadTranspose3x3fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 9);
        }
        nglMatrixLoadTranspose3x3fNV(matrixMode, memAddress(m));
    }

    // --- [ glMatrixMult3x2fNV ] ---

    /** Unsafe version of: {@link #glMatrixMult3x2fNV MatrixMult3x2fNV} */
    public static native void nglMatrixMult3x2fNV(int matrixMode, long m);

    /** @param matrixMode one of:<br><table><tr><td>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}</td><td>{@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}</td></tr></table> */
    public static void glMatrixMult3x2fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 6);
        }
        nglMatrixMult3x2fNV(matrixMode, memAddress(m));
    }

    // --- [ glMatrixMult3x3fNV ] ---

    /** Unsafe version of: {@link #glMatrixMult3x3fNV MatrixMult3x3fNV} */
    public static native void nglMatrixMult3x3fNV(int matrixMode, long m);

    /** @param matrixMode one of:<br><table><tr><td>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}</td><td>{@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}</td></tr></table> */
    public static void glMatrixMult3x3fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 9);
        }
        nglMatrixMult3x3fNV(matrixMode, memAddress(m));
    }

    // --- [ glMatrixMultTranspose3x3fNV ] ---

    /** Unsafe version of: {@link #glMatrixMultTranspose3x3fNV MatrixMultTranspose3x3fNV} */
    public static native void nglMatrixMultTranspose3x3fNV(int matrixMode, long m);

    /** @param matrixMode one of:<br><table><tr><td>{@link #GL_PATH_PROJECTION_NV PATH_PROJECTION_NV}</td><td>{@link #GL_PATH_MODELVIEW_NV PATH_MODELVIEW_NV}</td></tr></table> */
    public static void glMatrixMultTranspose3x3fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 9);
        }
        nglMatrixMultTranspose3x3fNV(matrixMode, memAddress(m));
    }

    // --- [ glGetProgramResourcefvNV ] ---

    public static native void nglGetProgramResourcefvNV(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params);

    public static void glGetProgramResourcefvNV(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLenum const *") IntBuffer props, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetProgramResourcefvNV(program, programInterface, index, props.remaining(), memAddress(props), params.remaining(), memAddressSafe(length), memAddress(params));
    }

    /** Array version of: {@link #glPathCommandsNV PathCommandsNV} */
    public static void glPathCommandsNV(@NativeType("GLuint") int path, @NativeType("GLubyte const *") ByteBuffer commands, @NativeType("GLenum") int coordType, @NativeType("void const *") short[] coords) {
        long __functionAddress = GL.getICD().glPathCommandsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(path, commands.remaining(), memAddress(commands), coords.length, coordType, coords, __functionAddress);
    }

    /** Array version of: {@link #glPathCommandsNV PathCommandsNV} */
    public static void glPathCommandsNV(@NativeType("GLuint") int path, @NativeType("GLubyte const *") ByteBuffer commands, @NativeType("GLenum") int coordType, @NativeType("void const *") float[] coords) {
        long __functionAddress = GL.getICD().glPathCommandsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(path, commands.remaining(), memAddress(commands), coords.length, coordType, coords, __functionAddress);
    }

    /** Array version of: {@link #glPathCoordsNV PathCoordsNV} */
    public static void glPathCoordsNV(@NativeType("GLuint") int path, @NativeType("GLenum") int coordType, @NativeType("void const *") short[] coords) {
        long __functionAddress = GL.getICD().glPathCoordsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, coords.length, coordType, coords, __functionAddress);
    }

    /** Array version of: {@link #glPathCoordsNV PathCoordsNV} */
    public static void glPathCoordsNV(@NativeType("GLuint") int path, @NativeType("GLenum") int coordType, @NativeType("void const *") float[] coords) {
        long __functionAddress = GL.getICD().glPathCoordsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, coords.length, coordType, coords, __functionAddress);
    }

    /** Array version of: {@link #glPathSubCommandsNV PathSubCommandsNV} */
    public static void glPathSubCommandsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int commandStart, @NativeType("GLsizei") int commandsToDelete, @NativeType("GLubyte const *") ByteBuffer commands, @NativeType("GLenum") int coordType, @NativeType("void const *") short[] coords) {
        long __functionAddress = GL.getICD().glPathSubCommandsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(path, commandStart, commandsToDelete, commands.remaining(), memAddress(commands), coords.length, coordType, coords, __functionAddress);
    }

    /** Array version of: {@link #glPathSubCommandsNV PathSubCommandsNV} */
    public static void glPathSubCommandsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int commandStart, @NativeType("GLsizei") int commandsToDelete, @NativeType("GLubyte const *") ByteBuffer commands, @NativeType("GLenum") int coordType, @NativeType("void const *") float[] coords) {
        long __functionAddress = GL.getICD().glPathSubCommandsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(path, commandStart, commandsToDelete, commands.remaining(), memAddress(commands), coords.length, coordType, coords, __functionAddress);
    }

    /** Array version of: {@link #glPathSubCoordsNV PathSubCoordsNV} */
    public static void glPathSubCoordsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int coordStart, @NativeType("GLenum") int coordType, @NativeType("void const *") short[] coords) {
        long __functionAddress = GL.getICD().glPathSubCoordsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, coordStart, coords.length, coordType, coords, __functionAddress);
    }

    /** Array version of: {@link #glPathSubCoordsNV PathSubCoordsNV} */
    public static void glPathSubCoordsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int coordStart, @NativeType("GLenum") int coordType, @NativeType("void const *") float[] coords) {
        long __functionAddress = GL.getICD().glPathSubCoordsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, coordStart, coords.length, coordType, coords, __functionAddress);
    }

    /** Array version of: {@link #glWeightPathsNV WeightPathsNV} */
    public static void glWeightPathsNV(@NativeType("GLuint") int resultPath, @NativeType("GLuint const *") int[] paths, @NativeType("GLfloat const *") float[] weights) {
        long __functionAddress = GL.getICD().glWeightPathsNV;
        if (CHECKS) {
            check(__functionAddress);
            check(weights, paths.length);
        }
        callPPV(resultPath, paths.length, paths, weights, __functionAddress);
    }

    /** Array version of: {@link #glTransformPathNV TransformPathNV} */
    public static void glTransformPathNV(@NativeType("GLuint") int resultPath, @NativeType("GLuint") int srcPath, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") float[] transformValues) {
        long __functionAddress = GL.getICD().glTransformPathNV;
        if (CHECKS) {
            check(__functionAddress);
            check(transformValues, transformTypeToElements(transformType));
        }
        callPV(resultPath, srcPath, transformType, transformValues, __functionAddress);
    }

    /** Array version of: {@link #glPathParameterivNV PathParameterivNV} */
    public static void glPathParameterivNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glPathParameterivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(path, pname, value, __functionAddress);
    }

    /** Array version of: {@link #glPathParameterfvNV PathParameterfvNV} */
    public static void glPathParameterfvNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glPathParameterfvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(path, pname, value, __functionAddress);
    }

    /** Array version of: {@link #glPathDashArrayNV PathDashArrayNV} */
    public static void glPathDashArrayNV(@NativeType("GLuint") int path, @NativeType("GLfloat const *") float[] dashArray) {
        long __functionAddress = GL.getICD().glPathDashArrayNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, dashArray.length, dashArray, __functionAddress);
    }

    /** Array version of: {@link #glStencilFillPathInstancedNV StencilFillPathInstancedNV} */
    public static void glStencilFillPathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLenum") int fillMode, @NativeType("GLuint") int mask, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") float[] transformValues) {
        long __functionAddress = GL.getICD().glStencilFillPathInstancedNV;
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(__functionAddress);
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        callPPV(numPaths, pathNameType, memAddress(paths), pathBase, fillMode, mask, transformType, transformValues, __functionAddress);
    }

    /** Array version of: {@link #glStencilStrokePathInstancedNV StencilStrokePathInstancedNV} */
    public static void glStencilStrokePathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLint") int reference, @NativeType("GLuint") int mask, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") float[] transformValues) {
        long __functionAddress = GL.getICD().glStencilStrokePathInstancedNV;
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(__functionAddress);
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        callPPV(numPaths, pathNameType, memAddress(paths), pathBase, reference, mask, transformType, transformValues, __functionAddress);
    }

    /** Array version of: {@link #glPathColorGenNV PathColorGenNV} */
    public static void glPathColorGenNV(@NativeType("GLenum") int color, @NativeType("GLenum") int genMode, @NativeType("GLenum") int colorFormat, @NativeType("GLfloat const *") float[] coeffs) {
        long __functionAddress = GL.getICD().glPathColorGenNV;
        if (CHECKS) {
            check(__functionAddress);
            check(coeffs, genModeToElements(genMode) * colorFormatToComponents(colorFormat));
        }
        callPV(color, genMode, colorFormat, coeffs, __functionAddress);
    }

    /** Array version of: {@link #glPathTexGenNV PathTexGenNV} */
    public static void glPathTexGenNV(@NativeType("GLenum") int texCoordSet, @NativeType("GLenum") int genMode, @NativeType("GLint") int components, @NativeType("GLfloat const *") float[] coeffs) {
        long __functionAddress = GL.getICD().glPathTexGenNV;
        if (CHECKS) {
            check(__functionAddress);
            check(coeffs, genModeToElements(genMode) * components);
        }
        callPV(texCoordSet, genMode, components, coeffs, __functionAddress);
    }

    /** Array version of: {@link #glCoverFillPathInstancedNV CoverFillPathInstancedNV} */
    public static void glCoverFillPathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLenum") int coverMode, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") float[] transformValues) {
        long __functionAddress = GL.getICD().glCoverFillPathInstancedNV;
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(__functionAddress);
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        callPPV(numPaths, pathNameType, memAddress(paths), pathBase, coverMode, transformType, transformValues, __functionAddress);
    }

    /** Array version of: {@link #glCoverStrokePathInstancedNV CoverStrokePathInstancedNV} */
    public static void glCoverStrokePathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLenum") int coverMode, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") float[] transformValues) {
        long __functionAddress = GL.getICD().glCoverStrokePathInstancedNV;
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(__functionAddress);
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        callPPV(numPaths, pathNameType, memAddress(paths), pathBase, coverMode, transformType, transformValues, __functionAddress);
    }

    /** Array version of: {@link #glStencilThenCoverFillPathInstancedNV StencilThenCoverFillPathInstancedNV} */
    public static void glStencilThenCoverFillPathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLenum") int fillMode, @NativeType("GLuint") int mask, @NativeType("GLenum") int coverMode, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") float[] transformValues) {
        long __functionAddress = GL.getICD().glStencilThenCoverFillPathInstancedNV;
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(__functionAddress);
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        callPPV(numPaths, pathNameType, memAddress(paths), pathBase, fillMode, mask, coverMode, transformType, transformValues, __functionAddress);
    }

    /** Array version of: {@link #glStencilThenCoverStrokePathInstancedNV StencilThenCoverStrokePathInstancedNV} */
    public static void glStencilThenCoverStrokePathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLint") int reference, @NativeType("GLuint") int mask, @NativeType("GLenum") int coverMode, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") float[] transformValues) {
        long __functionAddress = GL.getICD().glStencilThenCoverStrokePathInstancedNV;
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(__functionAddress);
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        callPPV(numPaths, pathNameType, memAddress(paths), pathBase, reference, mask, coverMode, transformType, transformValues, __functionAddress);
    }

    /** Array version of: {@link #glPathGlyphIndexRangeNV PathGlyphIndexRangeNV} */
    @NativeType("GLenum")
    public static int glPathGlyphIndexRangeNV(@NativeType("GLenum") int fontTarget, @NativeType("void const *") ByteBuffer fontName, @NativeType("GLbitfield") int fontStyle, @NativeType("GLuint") int pathParameterTemplate, @NativeType("GLfloat") float emScale, @NativeType("GLuint *") int[] baseAndCount) {
        long __functionAddress = GL.getICD().glPathGlyphIndexRangeNV;
        if (CHECKS) {
            check(__functionAddress);
            checkNT1(fontName);
            check(baseAndCount, 2);
        }
        return callPPI(fontTarget, memAddress(fontName), fontStyle, pathParameterTemplate, emScale, baseAndCount, __functionAddress);
    }

    /** Array version of: {@link #glProgramPathFragmentInputGenNV ProgramPathFragmentInputGenNV} */
    public static void glProgramPathFragmentInputGenNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLenum") int genMode, @NativeType("GLint") int components, @NativeType("GLfloat const *") float[] coeffs) {
        long __functionAddress = GL.getICD().glProgramPathFragmentInputGenNV;
        if (CHECKS) {
            check(__functionAddress);
            check(coeffs, genModeToElements(genMode) * components);
        }
        callPV(program, location, genMode, components, coeffs, __functionAddress);
    }

    /** Array version of: {@link #glGetPathParameterivNV GetPathParameterivNV} */
    public static void glGetPathParameterivNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] value) {
        long __functionAddress = GL.getICD().glGetPathParameterivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(path, pname, value, __functionAddress);
    }

    /** Array version of: {@link #glGetPathParameterfvNV GetPathParameterfvNV} */
    public static void glGetPathParameterfvNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] value) {
        long __functionAddress = GL.getICD().glGetPathParameterfvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(path, pname, value, __functionAddress);
    }

    /** Array version of: {@link #glGetPathCoordsNV GetPathCoordsNV} */
    public static void glGetPathCoordsNV(@NativeType("GLuint") int path, @NativeType("GLfloat *") float[] coords) {
        long __functionAddress = GL.getICD().glGetPathCoordsNV;
        if (CHECKS) {
            check(__functionAddress);
            if (DEBUG) {
                check(coords, glGetPathParameteriNV(path, GL_PATH_COORD_COUNT_NV));
            }
        }
        callPV(path, coords, __functionAddress);
    }

    /** Array version of: {@link #glGetPathDashArrayNV GetPathDashArrayNV} */
    public static void glGetPathDashArrayNV(@NativeType("GLuint") int path, @NativeType("GLfloat *") float[] dashArray) {
        long __functionAddress = GL.getICD().glGetPathDashArrayNV;
        if (CHECKS) {
            check(__functionAddress);
            if (DEBUG) {
                check(dashArray, glGetPathParameteriNV(path, GL_PATH_DASH_ARRAY_COUNT_NV));
            }
        }
        callPV(path, dashArray, __functionAddress);
    }

    /** Array version of: {@link #glGetPathMetricsNV GetPathMetricsNV} */
    public static void glGetPathMetricsNV(@NativeType("GLbitfield") int metricQueryMask, @NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLsizei") int stride, @NativeType("GLfloat *") float[] metrics) {
        long __functionAddress = GL.getICD().glGetPathMetricsNV;
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(__functionAddress);
            check(metrics, numPaths * (stride == 0 ? Integer.bitCount(metricQueryMask) : (stride >> 2)));
        }
        callPPV(metricQueryMask, numPaths, pathNameType, memAddress(paths), pathBase, stride, metrics, __functionAddress);
    }

    /** Array version of: {@link #glGetPathMetricRangeNV GetPathMetricRangeNV} */
    public static void glGetPathMetricRangeNV(@NativeType("GLbitfield") int metricQueryMask, @NativeType("GLuint") int firstPathName, @NativeType("GLsizei") int numPaths, @NativeType("GLsizei") int stride, @NativeType("GLfloat *") float[] metrics) {
        long __functionAddress = GL.getICD().glGetPathMetricRangeNV;
        if (CHECKS) {
            check(__functionAddress);
            check(metrics, numPaths * (stride == 0 ? Integer.bitCount(metricQueryMask) : (stride >> 2)));
        }
        callPV(metricQueryMask, firstPathName, numPaths, stride, metrics, __functionAddress);
    }

    /** Array version of: {@link #glGetPathSpacingNV GetPathSpacingNV} */
    public static void glGetPathSpacingNV(@NativeType("GLenum") int pathListMode, @NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLfloat") float advanceScale, @NativeType("GLfloat") float kerningScale, @NativeType("GLenum") int transformType, @NativeType("GLfloat *") float[] returnedSpacing) {
        long __functionAddress = GL.getICD().glGetPathSpacingNV;
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(__functionAddress);
            check(returnedSpacing, (numPaths - 1) * (transformType == GL_TRANSLATE_X_NV ? 1 : 2));
        }
        callPPV(pathListMode, numPaths, pathNameType, memAddress(paths), pathBase, advanceScale, kerningScale, transformType, returnedSpacing, __functionAddress);
    }

    /** Array version of: {@link #glGetPathColorGenivNV GetPathColorGenivNV} */
    public static void glGetPathColorGenivNV(@NativeType("GLenum") int color, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] value) {
        long __functionAddress = GL.getICD().glGetPathColorGenivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(color, pname, value, __functionAddress);
    }

    /** Array version of: {@link #glGetPathColorGenfvNV GetPathColorGenfvNV} */
    public static void glGetPathColorGenfvNV(@NativeType("GLenum") int color, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] value) {
        long __functionAddress = GL.getICD().glGetPathColorGenfvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(color, pname, value, __functionAddress);
    }

    /** Array version of: {@link #glGetPathTexGenivNV GetPathTexGenivNV} */
    public static void glGetPathTexGenivNV(@NativeType("GLenum") int texCoordSet, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] value) {
        long __functionAddress = GL.getICD().glGetPathTexGenivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(texCoordSet, pname, value, __functionAddress);
    }

    /** Array version of: {@link #glGetPathTexGenfvNV GetPathTexGenfvNV} */
    public static void glGetPathTexGenfvNV(@NativeType("GLenum") int texCoordSet, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] value) {
        long __functionAddress = GL.getICD().glGetPathTexGenfvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(texCoordSet, pname, value, __functionAddress);
    }

    /** Array version of: {@link #glPointAlongPathNV PointAlongPathNV} */
    @NativeType("GLboolean")
    public static boolean glPointAlongPathNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int startSegment, @NativeType("GLsizei") int numSegments, @NativeType("GLfloat") float distance, @Nullable @NativeType("GLfloat *") float[] x, @Nullable @NativeType("GLfloat *") float[] y, @Nullable @NativeType("GLfloat *") float[] tangentX, @Nullable @NativeType("GLfloat *") float[] tangentY) {
        long __functionAddress = GL.getICD().glPointAlongPathNV;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(x, 1);
            checkSafe(y, 1);
            checkSafe(tangentX, 1);
            checkSafe(tangentY, 1);
        }
        return callPPPPZ(path, startSegment, numSegments, distance, x, y, tangentX, tangentY, __functionAddress);
    }

    /** Array version of: {@link #glMatrixLoad3x2fNV MatrixLoad3x2fNV} */
    public static void glMatrixLoad3x2fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMatrixLoad3x2fNV;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 6);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** Array version of: {@link #glMatrixLoad3x3fNV MatrixLoad3x3fNV} */
    public static void glMatrixLoad3x3fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMatrixLoad3x3fNV;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 9);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** Array version of: {@link #glMatrixLoadTranspose3x3fNV MatrixLoadTranspose3x3fNV} */
    public static void glMatrixLoadTranspose3x3fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMatrixLoadTranspose3x3fNV;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 9);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** Array version of: {@link #glMatrixMult3x2fNV MatrixMult3x2fNV} */
    public static void glMatrixMult3x2fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMatrixMult3x2fNV;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 6);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** Array version of: {@link #glMatrixMult3x3fNV MatrixMult3x3fNV} */
    public static void glMatrixMult3x3fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMatrixMult3x3fNV;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 9);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** Array version of: {@link #glMatrixMultTranspose3x3fNV MatrixMultTranspose3x3fNV} */
    public static void glMatrixMultTranspose3x3fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMatrixMultTranspose3x3fNV;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 9);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** Array version of: {@link #glGetProgramResourcefvNV GetProgramResourcefvNV} */
    public static void glGetProgramResourcefvNV(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLenum const *") int[] props, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetProgramResourcefvNV;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPPV(program, programInterface, index, props.length, props, params.length, length, params, __functionAddress);
    }

    private static int charcodeTypeToBytes(int type) {
        switch ( type ) {
            case GL_UNSIGNED_BYTE:
            case GL_UTF8_NV:
                return 1;
            case GL_UNSIGNED_SHORT:
            case GL_2_BYTES_NV:
            case GL_UTF16_NV:
                return 2;
            case GL_3_BYTES_NV:
                return 3;
            case GL_UNSIGNED_INT:
            case GL_4_BYTES_NV:
                return 4;
            default:
                throw new IllegalArgumentException(String.format("Unsupported charcode type: 0x%X", type));
        }
    }

    private static int pathNameTypeToBytes(int type) {
        switch ( type ) {
            case GL_BYTE:
            case GL_UNSIGNED_BYTE:
            case GL_UTF8_NV:
                return 1;
            case GL_SHORT:
            case GL_UNSIGNED_SHORT:
            case GL_2_BYTES_NV:
            case GL_UTF16_NV:
                return 2;
            case GL_3_BYTES_NV:
                return 3;
            case GL_INT:
            case GL_UNSIGNED_INT:
            case GL_4_BYTES_NV:
                return 4;
            default:
                throw new IllegalArgumentException(String.format("Unsupported path name type: 0x%X", type));
        }
    }

    private static int transformTypeToElements(int type) {
        switch ( type ) {
            case GL_NONE:
                return 0;
            case GL_TRANSLATE_X_NV:
            case GL_TRANSLATE_Y_NV:
                return 1;
            case GL_TRANSLATE_2D_NV:
                return 2;
            case GL_TRANSLATE_3D_NV:
                return 3;
            case GL_AFFINE_2D_NV:
            case GL_TRANSPOSE_AFFINE_2D_NV:
                return 6;
            case GL_AFFINE_3D_NV:
            case GL_TRANSPOSE_AFFINE_3D_NV:
                return 12;
            default:
                throw new IllegalArgumentException(String.format("Unsupported transform type: 0x%X", type));
        }
    }

    private static int colorFormatToComponents(int colorFormat) {
        switch ( colorFormat ) {
            case GL_LUMINANCE:
            case GL_INTENSITY:
            case GL_ALPHA:
                return 1;
            case GL_LUMINANCE_ALPHA:
                return 2;
            case GL_RGB:
                return 3;
            case GL_RGBA:
                return 4;
            default:
                throw new IllegalArgumentException(String.format("Unsupported colorFormat specified: 0x%X", colorFormat));
        }
    }

    private static int genModeToElements(int genMode) {
        switch ( genMode ) {
            case GL_NONE:
                return 0;
            case GL_CONSTANT_NV:
                return 1;
            case GL_OBJECT_LINEAR_NV:
            case GL_PATH_OBJECT_BOUNDING_BOX_NV:
                return 3;
            case GL_EYE_LINEAR_NV:
                return 4;
            default:
                throw new IllegalArgumentException(String.format("Unsupported genMode specified: 0x%X", genMode));
        }
    }

}