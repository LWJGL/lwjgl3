/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.opengl.GL11.*;

public class NVPathRendering {

    static { GL.initialize(); }

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

    public static final int
        GL_PATH_FORMAT_SVG_NV = 0x9070,
        GL_PATH_FORMAT_PS_NV  = 0x9071;

    public static final int
        GL_STANDARD_FONT_NAME_NV = 0x9072,
        GL_SYSTEM_FONT_NAME_NV   = 0x9073,
        GL_FILE_NAME_NV          = 0x9074;

    public static final int GL_STANDARD_FONT_FORMAT_NV = 0x936C;

    public static final int
        GL_SKIP_MISSING_GLYPH_NV = 0x90A9,
        GL_USE_MISSING_GLYPH_NV  = 0x90AA;

    public static final int
        GL_FONT_GLYPHS_AVAILABLE_NV   = 0x9368,
        GL_FONT_TARGET_UNAVAILABLE_NV = 0x9369,
        GL_FONT_UNAVAILABLE_NV        = 0x936A,
        GL_FONT_UNINTELLIGIBLE_NV     = 0x936B;

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

    public static final int
        GL_PATH_END_CAPS_NV  = 0x9076,
        GL_PATH_DASH_CAPS_NV = 0x907B;

    public static final int
        GL_COUNT_UP_NV   = 0x9088,
        GL_COUNT_DOWN_NV = 0x9089;

    public static final int
        GL_PRIMARY_COLOR_NV   = 0x852C,
        GL_SECONDARY_COLOR_NV = 0x852D;

    public static final int GL_PATH_OBJECT_BOUNDING_BOX_NV = 0x908A;

    public static final int
        GL_CONVEX_HULL_NV  = 0x908B,
        GL_BOUNDING_BOX_NV = 0x908D;

    public static final int
        GL_TRANSLATE_X_NV         = 0x908E,
        GL_TRANSLATE_Y_NV         = 0x908F,
        GL_TRANSLATE_2D_NV        = 0x9090,
        GL_TRANSLATE_3D_NV        = 0x9091,
        GL_AFFINE_2D_NV           = 0x9092,
        GL_AFFINE_3D_NV           = 0x9094,
        GL_TRANSPOSE_AFFINE_2D_NV = 0x9096,
        GL_TRANSPOSE_AFFINE_3D_NV = 0x9098;

    public static final int
        GL_UTF8_NV  = 0x909A,
        GL_UTF16_NV = 0x909B;

    public static final int GL_BOUNDING_BOX_OF_BOUNDING_BOXES_NV = 0x909C;

    public static final int
        GL_PATH_COMMAND_COUNT_NV       = 0x909D,
        GL_PATH_COORD_COUNT_NV         = 0x909E,
        GL_PATH_DASH_ARRAY_COUNT_NV    = 0x909F,
        GL_PATH_COMPUTED_LENGTH_NV     = 0x90A0,
        GL_PATH_FILL_BOUNDING_BOX_NV   = 0x90A1,
        GL_PATH_STROKE_BOUNDING_BOX_NV = 0x90A2;

    public static final int
        GL_SQUARE_NV     = 0x90A3,
        GL_ROUND_NV      = 0x90A4,
        GL_TRIANGULAR_NV = 0x90A5;

    public static final int
        GL_BEVEL_NV          = 0x90A6,
        GL_MITER_REVERT_NV   = 0x90A7,
        GL_MITER_TRUNCATE_NV = 0x90A8;

    public static final int
        GL_MOVE_TO_RESETS_NV    = 0x90B5,
        GL_MOVE_TO_CONTINUES_NV = 0x90B6;

    public static final int
        GL_BOLD_BIT_NV   = 0x1,
        GL_ITALIC_BIT_NV = 0x2;

    public static final int
        GL_PATH_ERROR_POSITION_NV              = 0x90AB,
        GL_PATH_FOG_GEN_MODE_NV                = 0x90AC,
        GL_PATH_STENCIL_FUNC_NV                = 0x90B7,
        GL_PATH_STENCIL_REF_NV                 = 0x90B8,
        GL_PATH_STENCIL_VALUE_MASK_NV          = 0x90B9,
        GL_PATH_STENCIL_DEPTH_OFFSET_FACTOR_NV = 0x90BD,
        GL_PATH_STENCIL_DEPTH_OFFSET_UNITS_NV  = 0x90BE,
        GL_PATH_COVER_DEPTH_FUNC_NV            = 0x90BF;

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

    public static final int
        GL_ACCUM_ADJACENT_PAIRS_NV = 0x90AD,
        GL_ADJACENT_PAIRS_NV       = 0x90AE,
        GL_FIRST_TO_REST_NV        = 0x90AF;

    public static final int
        GL_PATH_GEN_MODE_NV  = 0x90B0,
        GL_PATH_GEN_COEFF_NV = 0x90B1;

    public static final int GL_PATH_GEN_COLOR_FORMAT_NV = 0x90B2;

    public static final int GL_PATH_GEN_COMPONENTS_NV = 0x90B3;

    public static final int GL_FRAGMENT_INPUT_NV = 0x936D;

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

    /** {@code void glPathCommandsNV(GLuint path, GLsizei numCommands, GLubyte const * commands, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static native void nglPathCommandsNV(int path, int numCommands, long commands, int numCoords, int coordType, long coords);

    /** {@code void glPathCommandsNV(GLuint path, GLsizei numCommands, GLubyte const * commands, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static void glPathCommandsNV(@NativeType("GLuint") int path, @NativeType("GLubyte const *") ByteBuffer commands, @NativeType("GLenum") int coordType, @NativeType("void const *") ByteBuffer coords) {
        nglPathCommandsNV(path, commands.remaining(), memAddress(commands), coords.remaining() >> GLChecks.typeToByteShift(coordType), coordType, memAddress(coords));
    }

    /** {@code void glPathCommandsNV(GLuint path, GLsizei numCommands, GLubyte const * commands, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static void glPathCommandsNV(@NativeType("GLuint") int path, @NativeType("GLubyte const *") ByteBuffer commands, @NativeType("GLenum") int coordType, @NativeType("void const *") ShortBuffer coords) {
        nglPathCommandsNV(path, commands.remaining(), memAddress(commands), (int)(((long)coords.remaining() << 1) >> GLChecks.typeToByteShift(coordType)), coordType, memAddress(coords));
    }

    /** {@code void glPathCommandsNV(GLuint path, GLsizei numCommands, GLubyte const * commands, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static void glPathCommandsNV(@NativeType("GLuint") int path, @NativeType("GLubyte const *") ByteBuffer commands, @NativeType("GLenum") int coordType, @NativeType("void const *") FloatBuffer coords) {
        nglPathCommandsNV(path, commands.remaining(), memAddress(commands), (int)(((long)coords.remaining() << 2) >> GLChecks.typeToByteShift(coordType)), coordType, memAddress(coords));
    }

    // --- [ glPathCoordsNV ] ---

    /** {@code void glPathCoordsNV(GLuint path, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static native void nglPathCoordsNV(int path, int numCoords, int coordType, long coords);

    /** {@code void glPathCoordsNV(GLuint path, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static void glPathCoordsNV(@NativeType("GLuint") int path, @NativeType("GLenum") int coordType, @NativeType("void const *") ByteBuffer coords) {
        nglPathCoordsNV(path, coords.remaining() >> GLChecks.typeToByteShift(coordType), coordType, memAddress(coords));
    }

    /** {@code void glPathCoordsNV(GLuint path, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static void glPathCoordsNV(@NativeType("GLuint") int path, @NativeType("GLenum") int coordType, @NativeType("void const *") ShortBuffer coords) {
        nglPathCoordsNV(path, (int)(((long)coords.remaining() << 1) >> GLChecks.typeToByteShift(coordType)), coordType, memAddress(coords));
    }

    /** {@code void glPathCoordsNV(GLuint path, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static void glPathCoordsNV(@NativeType("GLuint") int path, @NativeType("GLenum") int coordType, @NativeType("void const *") FloatBuffer coords) {
        nglPathCoordsNV(path, (int)(((long)coords.remaining() << 2) >> GLChecks.typeToByteShift(coordType)), coordType, memAddress(coords));
    }

    // --- [ glPathSubCommandsNV ] ---

    /** {@code void glPathSubCommandsNV(GLuint path, GLsizei commandStart, GLsizei commandsToDelete, GLsizei numCommands, GLubyte const * commands, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static native void nglPathSubCommandsNV(int path, int commandStart, int commandsToDelete, int numCommands, long commands, int numCoords, int coordType, long coords);

    /** {@code void glPathSubCommandsNV(GLuint path, GLsizei commandStart, GLsizei commandsToDelete, GLsizei numCommands, GLubyte const * commands, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static void glPathSubCommandsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int commandStart, @NativeType("GLsizei") int commandsToDelete, @NativeType("GLubyte const *") ByteBuffer commands, @NativeType("GLenum") int coordType, @NativeType("void const *") ByteBuffer coords) {
        nglPathSubCommandsNV(path, commandStart, commandsToDelete, commands.remaining(), memAddress(commands), coords.remaining() >> GLChecks.typeToByteShift(coordType), coordType, memAddress(coords));
    }

    /** {@code void glPathSubCommandsNV(GLuint path, GLsizei commandStart, GLsizei commandsToDelete, GLsizei numCommands, GLubyte const * commands, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static void glPathSubCommandsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int commandStart, @NativeType("GLsizei") int commandsToDelete, @NativeType("GLubyte const *") ByteBuffer commands, @NativeType("GLenum") int coordType, @NativeType("void const *") ShortBuffer coords) {
        nglPathSubCommandsNV(path, commandStart, commandsToDelete, commands.remaining(), memAddress(commands), (int)(((long)coords.remaining() << 1) >> GLChecks.typeToByteShift(coordType)), coordType, memAddress(coords));
    }

    /** {@code void glPathSubCommandsNV(GLuint path, GLsizei commandStart, GLsizei commandsToDelete, GLsizei numCommands, GLubyte const * commands, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static void glPathSubCommandsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int commandStart, @NativeType("GLsizei") int commandsToDelete, @NativeType("GLubyte const *") ByteBuffer commands, @NativeType("GLenum") int coordType, @NativeType("void const *") FloatBuffer coords) {
        nglPathSubCommandsNV(path, commandStart, commandsToDelete, commands.remaining(), memAddress(commands), (int)(((long)coords.remaining() << 2) >> GLChecks.typeToByteShift(coordType)), coordType, memAddress(coords));
    }

    // --- [ glPathSubCoordsNV ] ---

    /** {@code void glPathSubCoordsNV(GLuint path, GLsizei coordStart, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static native void nglPathSubCoordsNV(int path, int coordStart, int numCoords, int coordType, long coords);

    /** {@code void glPathSubCoordsNV(GLuint path, GLsizei coordStart, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static void glPathSubCoordsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int coordStart, @NativeType("GLenum") int coordType, @NativeType("void const *") ByteBuffer coords) {
        nglPathSubCoordsNV(path, coordStart, coords.remaining() >> GLChecks.typeToByteShift(coordType), coordType, memAddress(coords));
    }

    /** {@code void glPathSubCoordsNV(GLuint path, GLsizei coordStart, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static void glPathSubCoordsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int coordStart, @NativeType("GLenum") int coordType, @NativeType("void const *") ShortBuffer coords) {
        nglPathSubCoordsNV(path, coordStart, (int)(((long)coords.remaining() << 1) >> GLChecks.typeToByteShift(coordType)), coordType, memAddress(coords));
    }

    /** {@code void glPathSubCoordsNV(GLuint path, GLsizei coordStart, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static void glPathSubCoordsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int coordStart, @NativeType("GLenum") int coordType, @NativeType("void const *") FloatBuffer coords) {
        nglPathSubCoordsNV(path, coordStart, (int)(((long)coords.remaining() << 2) >> GLChecks.typeToByteShift(coordType)), coordType, memAddress(coords));
    }

    // --- [ glPathStringNV ] ---

    /** {@code void glPathStringNV(GLuint path, GLenum format, GLsizei length, void const * pathString)} */
    public static native void nglPathStringNV(int path, int format, int length, long pathString);

    /** {@code void glPathStringNV(GLuint path, GLenum format, GLsizei length, void const * pathString)} */
    public static void glPathStringNV(@NativeType("GLuint") int path, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer pathString) {
        nglPathStringNV(path, format, pathString.remaining(), memAddress(pathString));
    }

    // --- [ glPathGlyphsNV ] ---

    /** {@code void glPathGlyphsNV(GLuint firstPathName, GLenum fontTarget, void const * fontName, GLbitfield fontStyle, GLsizei numGlyphs, GLenum type, void const * charcodes, GLenum handleMissingGlyphs, GLuint pathParameterTemplate, GLfloat emScale)} */
    public static native void nglPathGlyphsNV(int firstPathName, int fontTarget, long fontName, int fontStyle, int numGlyphs, int type, long charcodes, int handleMissingGlyphs, int pathParameterTemplate, float emScale);

    /** {@code void glPathGlyphsNV(GLuint firstPathName, GLenum fontTarget, void const * fontName, GLbitfield fontStyle, GLsizei numGlyphs, GLenum type, void const * charcodes, GLenum handleMissingGlyphs, GLuint pathParameterTemplate, GLfloat emScale)} */
    public static void glPathGlyphsNV(@NativeType("GLuint") int firstPathName, @NativeType("GLenum") int fontTarget, @NativeType("void const *") ByteBuffer fontName, @NativeType("GLbitfield") int fontStyle, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer charcodes, @NativeType("GLenum") int handleMissingGlyphs, @NativeType("GLuint") int pathParameterTemplate, @NativeType("GLfloat") float emScale) {
        if (CHECKS) {
            checkNT1(fontName);
        }
        nglPathGlyphsNV(firstPathName, fontTarget, memAddress(fontName), fontStyle, charcodes.remaining() / charcodeTypeToBytes(type), type, memAddress(charcodes), handleMissingGlyphs, pathParameterTemplate, emScale);
    }

    // --- [ glPathGlyphRangeNV ] ---

    /** {@code void glPathGlyphRangeNV(GLuint firstPathName, GLenum fontTarget, void const * fontName, GLbitfield fontStyle, GLuint firstGlyph, GLsizei numGlyphs, GLenum handleMissingGlyphs, GLuint pathParameterTemplate, GLfloat emScale)} */
    public static native void nglPathGlyphRangeNV(int firstPathName, int fontTarget, long fontName, int fontStyle, int firstGlyph, int numGlyphs, int handleMissingGlyphs, int pathParameterTemplate, float emScale);

    /** {@code void glPathGlyphRangeNV(GLuint firstPathName, GLenum fontTarget, void const * fontName, GLbitfield fontStyle, GLuint firstGlyph, GLsizei numGlyphs, GLenum handleMissingGlyphs, GLuint pathParameterTemplate, GLfloat emScale)} */
    public static void glPathGlyphRangeNV(@NativeType("GLuint") int firstPathName, @NativeType("GLenum") int fontTarget, @NativeType("void const *") ByteBuffer fontName, @NativeType("GLbitfield") int fontStyle, @NativeType("GLuint") int firstGlyph, @NativeType("GLsizei") int numGlyphs, @NativeType("GLenum") int handleMissingGlyphs, @NativeType("GLuint") int pathParameterTemplate, @NativeType("GLfloat") float emScale) {
        if (CHECKS) {
            checkNT1(fontName);
        }
        nglPathGlyphRangeNV(firstPathName, fontTarget, memAddress(fontName), fontStyle, firstGlyph, numGlyphs, handleMissingGlyphs, pathParameterTemplate, emScale);
    }

    // --- [ glPathGlyphIndexArrayNV ] ---

    /** {@code GLenum glPathGlyphIndexArrayNV(GLuint firstPathName, GLenum fontTarget, void const * fontName, GLbitfield fontStyle, GLuint firstGlyphIndex, GLsizei numGlyphs, GLuint pathParameterTemplate, GLfloat emScale)} */
    public static native int nglPathGlyphIndexArrayNV(int firstPathName, int fontTarget, long fontName, int fontStyle, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale);

    /** {@code GLenum glPathGlyphIndexArrayNV(GLuint firstPathName, GLenum fontTarget, void const * fontName, GLbitfield fontStyle, GLuint firstGlyphIndex, GLsizei numGlyphs, GLuint pathParameterTemplate, GLfloat emScale)} */
    @NativeType("GLenum")
    public static int glPathGlyphIndexArrayNV(@NativeType("GLuint") int firstPathName, @NativeType("GLenum") int fontTarget, @NativeType("void const *") ByteBuffer fontName, @NativeType("GLbitfield") int fontStyle, @NativeType("GLuint") int firstGlyphIndex, @NativeType("GLsizei") int numGlyphs, @NativeType("GLuint") int pathParameterTemplate, @NativeType("GLfloat") float emScale) {
        if (CHECKS) {
            checkNT1(fontName);
        }
        return nglPathGlyphIndexArrayNV(firstPathName, fontTarget, memAddress(fontName), fontStyle, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale);
    }

    // --- [ glPathMemoryGlyphIndexArrayNV ] ---

    /** {@code GLenum glPathMemoryGlyphIndexArrayNV(GLuint firstPathName, GLenum fontTarget, GLsizeiptr fontSize, void const * fontData, GLsizei faceIndex, GLuint firstGlyphIndex, GLsizei numGlyphs, GLuint pathParameterTemplate, GLfloat emScale)} */
    public static native int nglPathMemoryGlyphIndexArrayNV(int firstPathName, int fontTarget, long fontSize, long fontData, int faceIndex, int firstGlyphIndex, int numGlyphs, int pathParameterTemplate, float emScale);

    /** {@code GLenum glPathMemoryGlyphIndexArrayNV(GLuint firstPathName, GLenum fontTarget, GLsizeiptr fontSize, void const * fontData, GLsizei faceIndex, GLuint firstGlyphIndex, GLsizei numGlyphs, GLuint pathParameterTemplate, GLfloat emScale)} */
    @NativeType("GLenum")
    public static int glPathMemoryGlyphIndexArrayNV(@NativeType("GLuint") int firstPathName, @NativeType("GLenum") int fontTarget, @NativeType("void const *") ByteBuffer fontData, @NativeType("GLsizei") int faceIndex, @NativeType("GLuint") int firstGlyphIndex, @NativeType("GLsizei") int numGlyphs, @NativeType("GLuint") int pathParameterTemplate, @NativeType("GLfloat") float emScale) {
        return nglPathMemoryGlyphIndexArrayNV(firstPathName, fontTarget, fontData.remaining(), memAddress(fontData), faceIndex, firstGlyphIndex, numGlyphs, pathParameterTemplate, emScale);
    }

    // --- [ glCopyPathNV ] ---

    /** {@code void glCopyPathNV(GLuint resultPath, GLuint srcPath)} */
    public static native void glCopyPathNV(@NativeType("GLuint") int resultPath, @NativeType("GLuint") int srcPath);

    // --- [ glWeightPathsNV ] ---

    /** {@code void glWeightPathsNV(GLuint resultPath, GLsizei numPaths, GLuint const * paths, GLfloat const * weights)} */
    public static native void nglWeightPathsNV(int resultPath, int numPaths, long paths, long weights);

    /** {@code void glWeightPathsNV(GLuint resultPath, GLsizei numPaths, GLuint const * paths, GLfloat const * weights)} */
    public static void glWeightPathsNV(@NativeType("GLuint") int resultPath, @NativeType("GLuint const *") IntBuffer paths, @NativeType("GLfloat const *") FloatBuffer weights) {
        if (CHECKS) {
            check(weights, paths.remaining());
        }
        nglWeightPathsNV(resultPath, paths.remaining(), memAddress(paths), memAddress(weights));
    }

    // --- [ glInterpolatePathsNV ] ---

    /** {@code void glInterpolatePathsNV(GLuint resultPath, GLuint pathA, GLuint pathB, GLfloat weight)} */
    public static native void glInterpolatePathsNV(@NativeType("GLuint") int resultPath, @NativeType("GLuint") int pathA, @NativeType("GLuint") int pathB, @NativeType("GLfloat") float weight);

    // --- [ glTransformPathNV ] ---

    /** {@code void glTransformPathNV(GLuint resultPath, GLuint srcPath, GLenum transformType, GLfloat const * transformValues)} */
    public static native void nglTransformPathNV(int resultPath, int srcPath, int transformType, long transformValues);

    /** {@code void glTransformPathNV(GLuint resultPath, GLuint srcPath, GLenum transformType, GLfloat const * transformValues)} */
    public static void glTransformPathNV(@NativeType("GLuint") int resultPath, @NativeType("GLuint") int srcPath, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") FloatBuffer transformValues) {
        if (CHECKS) {
            check(transformValues, transformTypeToElements(transformType));
        }
        nglTransformPathNV(resultPath, srcPath, transformType, memAddress(transformValues));
    }

    // --- [ glPathParameterivNV ] ---

    /** {@code void glPathParameterivNV(GLuint path, GLenum pname, GLint const * value)} */
    public static native void nglPathParameterivNV(int path, int pname, long value);

    /** {@code void glPathParameterivNV(GLuint path, GLenum pname, GLint const * value)} */
    public static void glPathParameterivNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglPathParameterivNV(path, pname, memAddress(value));
    }

    // --- [ glPathParameteriNV ] ---

    /** {@code void glPathParameteriNV(GLuint path, GLenum pname, GLint value)} */
    public static native void glPathParameteriNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLint") int value);

    // --- [ glPathParameterfvNV ] ---

    /** {@code void glPathParameterfvNV(GLuint path, GLenum pname, GLfloat const * value)} */
    public static native void nglPathParameterfvNV(int path, int pname, long value);

    /** {@code void glPathParameterfvNV(GLuint path, GLenum pname, GLfloat const * value)} */
    public static void glPathParameterfvNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglPathParameterfvNV(path, pname, memAddress(value));
    }

    // --- [ glPathParameterfNV ] ---

    /** {@code void glPathParameterfNV(GLuint path, GLenum pname, GLfloat value)} */
    public static native void glPathParameterfNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLfloat") float value);

    // --- [ glPathDashArrayNV ] ---

    /** {@code void glPathDashArrayNV(GLuint path, GLsizei dashCount, GLfloat const * dashArray)} */
    public static native void nglPathDashArrayNV(int path, int dashCount, long dashArray);

    /** {@code void glPathDashArrayNV(GLuint path, GLsizei dashCount, GLfloat const * dashArray)} */
    public static void glPathDashArrayNV(@NativeType("GLuint") int path, @NativeType("GLfloat const *") FloatBuffer dashArray) {
        nglPathDashArrayNV(path, dashArray.remaining(), memAddress(dashArray));
    }

    // --- [ glGenPathsNV ] ---

    /** {@code GLuint glGenPathsNV(GLsizei range)} */
    @NativeType("GLuint")
    public static native int glGenPathsNV(@NativeType("GLsizei") int range);

    // --- [ glDeletePathsNV ] ---

    /** {@code void glDeletePathsNV(GLuint path, GLsizei range)} */
    public static native void glDeletePathsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int range);

    // --- [ glIsPathNV ] ---

    /** {@code GLboolean glIsPathNV(GLuint path)} */
    @NativeType("GLboolean")
    public static native boolean glIsPathNV(@NativeType("GLuint") int path);

    // --- [ glPathStencilFuncNV ] ---

    /** {@code void glPathStencilFuncNV(GLenum func, GLint ref, GLuint mask)} */
    public static native void glPathStencilFuncNV(@NativeType("GLenum") int func, @NativeType("GLint") int ref, @NativeType("GLuint") int mask);

    // --- [ glPathStencilDepthOffsetNV ] ---

    /** {@code void glPathStencilDepthOffsetNV(GLfloat factor, GLfloat units)} */
    public static native void glPathStencilDepthOffsetNV(@NativeType("GLfloat") float factor, @NativeType("GLfloat") float units);

    // --- [ glStencilFillPathNV ] ---

    /** {@code void glStencilFillPathNV(GLuint path, GLenum fillMode, GLuint mask)} */
    public static native void glStencilFillPathNV(@NativeType("GLuint") int path, @NativeType("GLenum") int fillMode, @NativeType("GLuint") int mask);

    // --- [ glStencilStrokePathNV ] ---

    /** {@code void glStencilStrokePathNV(GLuint path, GLint reference, GLuint mask)} */
    public static native void glStencilStrokePathNV(@NativeType("GLuint") int path, @NativeType("GLint") int reference, @NativeType("GLuint") int mask);

    // --- [ glStencilFillPathInstancedNV ] ---

    /** {@code void glStencilFillPathInstancedNV(GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLenum fillMode, GLuint mask, GLenum transformType, GLfloat const * transformValues)} */
    public static native void nglStencilFillPathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int fillMode, int mask, int transformType, long transformValues);

    /** {@code void glStencilFillPathInstancedNV(GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLenum fillMode, GLuint mask, GLenum transformType, GLfloat const * transformValues)} */
    public static void glStencilFillPathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLenum") int fillMode, @NativeType("GLuint") int mask, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") FloatBuffer transformValues) {
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        nglStencilFillPathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, fillMode, mask, transformType, memAddress(transformValues));
    }

    // --- [ glStencilStrokePathInstancedNV ] ---

    /** {@code void glStencilStrokePathInstancedNV(GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLint reference, GLuint mask, GLenum transformType, GLfloat const * transformValues)} */
    public static native void nglStencilStrokePathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int reference, int mask, int transformType, long transformValues);

    /** {@code void glStencilStrokePathInstancedNV(GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLint reference, GLuint mask, GLenum transformType, GLfloat const * transformValues)} */
    public static void glStencilStrokePathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLint") int reference, @NativeType("GLuint") int mask, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") FloatBuffer transformValues) {
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        nglStencilStrokePathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, reference, mask, transformType, memAddress(transformValues));
    }

    // --- [ glPathCoverDepthFuncNV ] ---

    /** {@code void glPathCoverDepthFuncNV(GLenum zfunc)} */
    public static native void glPathCoverDepthFuncNV(@NativeType("GLenum") int zfunc);

    // --- [ glPathColorGenNV ] ---

    /** {@code void glPathColorGenNV(GLenum color, GLenum genMode, GLenum colorFormat, GLfloat const * coeffs)} */
    public static native void nglPathColorGenNV(int color, int genMode, int colorFormat, long coeffs);

    /** {@code void glPathColorGenNV(GLenum color, GLenum genMode, GLenum colorFormat, GLfloat const * coeffs)} */
    public static void glPathColorGenNV(@NativeType("GLenum") int color, @NativeType("GLenum") int genMode, @NativeType("GLenum") int colorFormat, @NativeType("GLfloat const *") FloatBuffer coeffs) {
        if (CHECKS) {
            check(coeffs, genModeToElements(genMode) * colorFormatToComponents(colorFormat));
        }
        nglPathColorGenNV(color, genMode, colorFormat, memAddress(coeffs));
    }

    // --- [ glPathTexGenNV ] ---

    /** {@code void glPathTexGenNV(GLenum texCoordSet, GLenum genMode, GLint components, GLfloat const * coeffs)} */
    public static native void nglPathTexGenNV(int texCoordSet, int genMode, int components, long coeffs);

    /** {@code void glPathTexGenNV(GLenum texCoordSet, GLenum genMode, GLint components, GLfloat const * coeffs)} */
    public static void glPathTexGenNV(@NativeType("GLenum") int texCoordSet, @NativeType("GLenum") int genMode, @NativeType("GLint") int components, @NativeType("GLfloat const *") FloatBuffer coeffs) {
        if (CHECKS) {
            check(coeffs, genModeToElements(genMode) * components);
        }
        nglPathTexGenNV(texCoordSet, genMode, components, memAddress(coeffs));
    }

    // --- [ glPathFogGenNV ] ---

    /** {@code void glPathFogGenNV(GLenum genMode)} */
    public static native void glPathFogGenNV(@NativeType("GLenum") int genMode);

    // --- [ glCoverFillPathNV ] ---

    /** {@code void glCoverFillPathNV(GLuint path, GLenum coverMode)} */
    public static native void glCoverFillPathNV(@NativeType("GLuint") int path, @NativeType("GLenum") int coverMode);

    // --- [ glCoverStrokePathNV ] ---

    /** {@code void glCoverStrokePathNV(GLuint path, GLenum coverMode)} */
    public static native void glCoverStrokePathNV(@NativeType("GLuint") int path, @NativeType("GLenum") int coverMode);

    // --- [ glCoverFillPathInstancedNV ] ---

    /** {@code void glCoverFillPathInstancedNV(GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLenum coverMode, GLenum transformType, GLfloat const * transformValues)} */
    public static native void nglCoverFillPathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int coverMode, int transformType, long transformValues);

    /** {@code void glCoverFillPathInstancedNV(GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLenum coverMode, GLenum transformType, GLfloat const * transformValues)} */
    public static void glCoverFillPathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLenum") int coverMode, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") FloatBuffer transformValues) {
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        nglCoverFillPathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, coverMode, transformType, memAddress(transformValues));
    }

    // --- [ glCoverStrokePathInstancedNV ] ---

    /** {@code void glCoverStrokePathInstancedNV(GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLenum coverMode, GLenum transformType, GLfloat const * transformValues)} */
    public static native void nglCoverStrokePathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int coverMode, int transformType, long transformValues);

    /** {@code void glCoverStrokePathInstancedNV(GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLenum coverMode, GLenum transformType, GLfloat const * transformValues)} */
    public static void glCoverStrokePathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLenum") int coverMode, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") FloatBuffer transformValues) {
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        nglCoverStrokePathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, coverMode, transformType, memAddress(transformValues));
    }

    // --- [ glStencilThenCoverFillPathNV ] ---

    /** {@code void glStencilThenCoverFillPathNV(GLuint path, GLenum fillMode, GLuint mask, GLenum coverMode)} */
    public static native void glStencilThenCoverFillPathNV(@NativeType("GLuint") int path, @NativeType("GLenum") int fillMode, @NativeType("GLuint") int mask, @NativeType("GLenum") int coverMode);

    // --- [ glStencilThenCoverStrokePathNV ] ---

    /** {@code void glStencilThenCoverStrokePathNV(GLuint path, GLint reference, GLuint mask, GLenum coverMode)} */
    public static native void glStencilThenCoverStrokePathNV(@NativeType("GLuint") int path, @NativeType("GLint") int reference, @NativeType("GLuint") int mask, @NativeType("GLenum") int coverMode);

    // --- [ glStencilThenCoverFillPathInstancedNV ] ---

    /** {@code void glStencilThenCoverFillPathInstancedNV(GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLenum fillMode, GLuint mask, GLenum coverMode, GLenum transformType, GLfloat const * transformValues)} */
    public static native void nglStencilThenCoverFillPathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int fillMode, int mask, int coverMode, int transformType, long transformValues);

    /** {@code void glStencilThenCoverFillPathInstancedNV(GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLenum fillMode, GLuint mask, GLenum coverMode, GLenum transformType, GLfloat const * transformValues)} */
    public static void glStencilThenCoverFillPathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLenum") int fillMode, @NativeType("GLuint") int mask, @NativeType("GLenum") int coverMode, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") FloatBuffer transformValues) {
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        nglStencilThenCoverFillPathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, fillMode, mask, coverMode, transformType, memAddress(transformValues));
    }

    // --- [ glStencilThenCoverStrokePathInstancedNV ] ---

    /** {@code void glStencilThenCoverStrokePathInstancedNV(GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLint reference, GLuint mask, GLenum coverMode, GLenum transformType, GLfloat const * transformValues)} */
    public static native void nglStencilThenCoverStrokePathInstancedNV(int numPaths, int pathNameType, long paths, int pathBase, int reference, int mask, int coverMode, int transformType, long transformValues);

    /** {@code void glStencilThenCoverStrokePathInstancedNV(GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLint reference, GLuint mask, GLenum coverMode, GLenum transformType, GLfloat const * transformValues)} */
    public static void glStencilThenCoverStrokePathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLint") int reference, @NativeType("GLuint") int mask, @NativeType("GLenum") int coverMode, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") FloatBuffer transformValues) {
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        nglStencilThenCoverStrokePathInstancedNV(numPaths, pathNameType, memAddress(paths), pathBase, reference, mask, coverMode, transformType, memAddress(transformValues));
    }

    // --- [ glPathGlyphIndexRangeNV ] ---

    /** {@code GLenum glPathGlyphIndexRangeNV(GLenum fontTarget, void const * fontName, GLbitfield fontStyle, GLuint pathParameterTemplate, GLfloat emScale, GLuint * baseAndCount)} */
    public static native int nglPathGlyphIndexRangeNV(int fontTarget, long fontName, int fontStyle, int pathParameterTemplate, float emScale, long baseAndCount);

    /** {@code GLenum glPathGlyphIndexRangeNV(GLenum fontTarget, void const * fontName, GLbitfield fontStyle, GLuint pathParameterTemplate, GLfloat emScale, GLuint * baseAndCount)} */
    @NativeType("GLenum")
    public static int glPathGlyphIndexRangeNV(@NativeType("GLenum") int fontTarget, @NativeType("void const *") ByteBuffer fontName, @NativeType("GLbitfield") int fontStyle, @NativeType("GLuint") int pathParameterTemplate, @NativeType("GLfloat") float emScale, @NativeType("GLuint *") IntBuffer baseAndCount) {
        if (CHECKS) {
            checkNT1(fontName);
            check(baseAndCount, 2);
        }
        return nglPathGlyphIndexRangeNV(fontTarget, memAddress(fontName), fontStyle, pathParameterTemplate, emScale, memAddress(baseAndCount));
    }

    // --- [ glProgramPathFragmentInputGenNV ] ---

    /** {@code void glProgramPathFragmentInputGenNV(GLuint program, GLint location, GLenum genMode, GLint components, GLfloat const * coeffs)} */
    public static native void nglProgramPathFragmentInputGenNV(int program, int location, int genMode, int components, long coeffs);

    /** {@code void glProgramPathFragmentInputGenNV(GLuint program, GLint location, GLenum genMode, GLint components, GLfloat const * coeffs)} */
    public static void glProgramPathFragmentInputGenNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLenum") int genMode, @NativeType("GLint") int components, @NativeType("GLfloat const *") FloatBuffer coeffs) {
        if (CHECKS) {
            check(coeffs, genModeToElements(genMode) * components);
        }
        nglProgramPathFragmentInputGenNV(program, location, genMode, components, memAddress(coeffs));
    }

    // --- [ glGetPathParameterivNV ] ---

    /** {@code void glGetPathParameterivNV(GLuint path, GLenum pname, GLint * value)} */
    public static native void nglGetPathParameterivNV(int path, int pname, long value);

    /** {@code void glGetPathParameterivNV(GLuint path, GLenum pname, GLint * value)} */
    public static void glGetPathParameterivNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglGetPathParameterivNV(path, pname, memAddress(value));
    }

    /** {@code void glGetPathParameterivNV(GLuint path, GLenum pname, GLint * value)} */
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

    /** {@code void glGetPathParameterfvNV(GLuint path, GLenum pname, GLfloat * value)} */
    public static native void nglGetPathParameterfvNV(int path, int pname, long value);

    /** {@code void glGetPathParameterfvNV(GLuint path, GLenum pname, GLfloat * value)} */
    public static void glGetPathParameterfvNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglGetPathParameterfvNV(path, pname, memAddress(value));
    }

    /** {@code void glGetPathParameterfvNV(GLuint path, GLenum pname, GLfloat * value)} */
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

    /** {@code void glGetPathCommandsNV(GLuint path, GLubyte * commands)} */
    public static native void nglGetPathCommandsNV(int path, long commands);

    /** {@code void glGetPathCommandsNV(GLuint path, GLubyte * commands)} */
    public static void glGetPathCommandsNV(@NativeType("GLuint") int path, @NativeType("GLubyte *") ByteBuffer commands) {
        if (CHECKS) {
            if (DEBUG) {
                check(commands, glGetPathParameteriNV(path, GL_PATH_COMMAND_COUNT_NV));
            }
        }
        nglGetPathCommandsNV(path, memAddress(commands));
    }

    // --- [ glGetPathCoordsNV ] ---

    /** {@code void glGetPathCoordsNV(GLuint path, GLfloat * coords)} */
    public static native void nglGetPathCoordsNV(int path, long coords);

    /** {@code void glGetPathCoordsNV(GLuint path, GLfloat * coords)} */
    public static void glGetPathCoordsNV(@NativeType("GLuint") int path, @NativeType("GLfloat *") FloatBuffer coords) {
        if (CHECKS) {
            if (DEBUG) {
                check(coords, glGetPathParameteriNV(path, GL_PATH_COORD_COUNT_NV));
            }
        }
        nglGetPathCoordsNV(path, memAddress(coords));
    }

    // --- [ glGetPathDashArrayNV ] ---

    /** {@code void glGetPathDashArrayNV(GLuint path, GLfloat * dashArray)} */
    public static native void nglGetPathDashArrayNV(int path, long dashArray);

    /** {@code void glGetPathDashArrayNV(GLuint path, GLfloat * dashArray)} */
    public static void glGetPathDashArrayNV(@NativeType("GLuint") int path, @NativeType("GLfloat *") FloatBuffer dashArray) {
        if (CHECKS) {
            if (DEBUG) {
                check(dashArray, glGetPathParameteriNV(path, GL_PATH_DASH_ARRAY_COUNT_NV));
            }
        }
        nglGetPathDashArrayNV(path, memAddress(dashArray));
    }

    // --- [ glGetPathMetricsNV ] ---

    /** {@code void glGetPathMetricsNV(GLbitfield metricQueryMask, GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLsizei stride, GLfloat * metrics)} */
    public static native void nglGetPathMetricsNV(int metricQueryMask, int numPaths, int pathNameType, long paths, int pathBase, int stride, long metrics);

    /** {@code void glGetPathMetricsNV(GLbitfield metricQueryMask, GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLsizei stride, GLfloat * metrics)} */
    public static void glGetPathMetricsNV(@NativeType("GLbitfield") int metricQueryMask, @NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLsizei") int stride, @NativeType("GLfloat *") FloatBuffer metrics) {
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(metrics, numPaths * (stride == 0 ? Integer.bitCount(metricQueryMask) : (stride >> 2)));
        }
        nglGetPathMetricsNV(metricQueryMask, numPaths, pathNameType, memAddress(paths), pathBase, stride, memAddress(metrics));
    }

    // --- [ glGetPathMetricRangeNV ] ---

    /** {@code void glGetPathMetricRangeNV(GLbitfield metricQueryMask, GLuint firstPathName, GLsizei numPaths, GLsizei stride, GLfloat * metrics)} */
    public static native void nglGetPathMetricRangeNV(int metricQueryMask, int firstPathName, int numPaths, int stride, long metrics);

    /** {@code void glGetPathMetricRangeNV(GLbitfield metricQueryMask, GLuint firstPathName, GLsizei numPaths, GLsizei stride, GLfloat * metrics)} */
    public static void glGetPathMetricRangeNV(@NativeType("GLbitfield") int metricQueryMask, @NativeType("GLuint") int firstPathName, @NativeType("GLsizei") int numPaths, @NativeType("GLsizei") int stride, @NativeType("GLfloat *") FloatBuffer metrics) {
        if (CHECKS) {
            check(metrics, numPaths * (stride == 0 ? Integer.bitCount(metricQueryMask) : (stride >> 2)));
        }
        nglGetPathMetricRangeNV(metricQueryMask, firstPathName, numPaths, stride, memAddress(metrics));
    }

    // --- [ glGetPathSpacingNV ] ---

    /** {@code void glGetPathSpacingNV(GLenum pathListMode, GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLfloat advanceScale, GLfloat kerningScale, GLenum transformType, GLfloat * returnedSpacing)} */
    public static native void nglGetPathSpacingNV(int pathListMode, int numPaths, int pathNameType, long paths, int pathBase, float advanceScale, float kerningScale, int transformType, long returnedSpacing);

    /** {@code void glGetPathSpacingNV(GLenum pathListMode, GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLfloat advanceScale, GLfloat kerningScale, GLenum transformType, GLfloat * returnedSpacing)} */
    public static void glGetPathSpacingNV(@NativeType("GLenum") int pathListMode, @NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLfloat") float advanceScale, @NativeType("GLfloat") float kerningScale, @NativeType("GLenum") int transformType, @NativeType("GLfloat *") FloatBuffer returnedSpacing) {
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(returnedSpacing, (numPaths - 1) * (transformType == GL_TRANSLATE_X_NV ? 1 : 2));
        }
        nglGetPathSpacingNV(pathListMode, numPaths, pathNameType, memAddress(paths), pathBase, advanceScale, kerningScale, transformType, memAddress(returnedSpacing));
    }

    // --- [ glGetPathColorGenivNV ] ---

    /** {@code void glGetPathColorGenivNV(GLenum color, GLenum pname, GLint * value)} */
    public static native void nglGetPathColorGenivNV(int color, int pname, long value);

    /** {@code void glGetPathColorGenivNV(GLenum color, GLenum pname, GLint * value)} */
    public static void glGetPathColorGenivNV(@NativeType("GLenum") int color, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglGetPathColorGenivNV(color, pname, memAddress(value));
    }

    /** {@code void glGetPathColorGenivNV(GLenum color, GLenum pname, GLint * value)} */
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

    /** {@code void glGetPathColorGenfvNV(GLenum color, GLenum pname, GLfloat * value)} */
    public static native void nglGetPathColorGenfvNV(int color, int pname, long value);

    /** {@code void glGetPathColorGenfvNV(GLenum color, GLenum pname, GLfloat * value)} */
    public static void glGetPathColorGenfvNV(@NativeType("GLenum") int color, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglGetPathColorGenfvNV(color, pname, memAddress(value));
    }

    /** {@code void glGetPathColorGenfvNV(GLenum color, GLenum pname, GLfloat * value)} */
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

    /** {@code void glGetPathTexGenivNV(GLenum texCoordSet, GLenum pname, GLint * value)} */
    public static native void nglGetPathTexGenivNV(int texCoordSet, int pname, long value);

    /** {@code void glGetPathTexGenivNV(GLenum texCoordSet, GLenum pname, GLint * value)} */
    public static void glGetPathTexGenivNV(@NativeType("GLenum") int texCoordSet, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglGetPathTexGenivNV(texCoordSet, pname, memAddress(value));
    }

    /** {@code void glGetPathTexGenivNV(GLenum texCoordSet, GLenum pname, GLint * value)} */
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

    /** {@code void glGetPathTexGenfvNV(GLenum texCoordSet, GLenum pname, GLfloat * value)} */
    public static native void nglGetPathTexGenfvNV(int texCoordSet, int pname, long value);

    /** {@code void glGetPathTexGenfvNV(GLenum texCoordSet, GLenum pname, GLfloat * value)} */
    public static void glGetPathTexGenfvNV(@NativeType("GLenum") int texCoordSet, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglGetPathTexGenfvNV(texCoordSet, pname, memAddress(value));
    }

    /** {@code void glGetPathTexGenfvNV(GLenum texCoordSet, GLenum pname, GLfloat * value)} */
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

    /** {@code GLboolean glIsPointInFillPathNV(GLuint path, GLuint mask, GLfloat x, GLfloat y)} */
    @NativeType("GLboolean")
    public static native boolean glIsPointInFillPathNV(@NativeType("GLuint") int path, @NativeType("GLuint") int mask, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y);

    // --- [ glIsPointInStrokePathNV ] ---

    /** {@code GLboolean glIsPointInStrokePathNV(GLuint path, GLfloat x, GLfloat y)} */
    @NativeType("GLboolean")
    public static native boolean glIsPointInStrokePathNV(@NativeType("GLuint") int path, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y);

    // --- [ glGetPathLengthNV ] ---

    /** {@code GLfloat glGetPathLengthNV(GLuint path, GLsizei startSegment, GLsizei numSegments)} */
    @NativeType("GLfloat")
    public static native float glGetPathLengthNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int startSegment, @NativeType("GLsizei") int numSegments);

    // --- [ glPointAlongPathNV ] ---

    /** {@code GLboolean glPointAlongPathNV(GLuint path, GLsizei startSegment, GLsizei numSegments, GLfloat distance, GLfloat * x, GLfloat * y, GLfloat * tangentX, GLfloat * tangentY)} */
    public static native boolean nglPointAlongPathNV(int path, int startSegment, int numSegments, float distance, long x, long y, long tangentX, long tangentY);

    /** {@code GLboolean glPointAlongPathNV(GLuint path, GLsizei startSegment, GLsizei numSegments, GLfloat distance, GLfloat * x, GLfloat * y, GLfloat * tangentX, GLfloat * tangentY)} */
    @NativeType("GLboolean")
    public static boolean glPointAlongPathNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int startSegment, @NativeType("GLsizei") int numSegments, @NativeType("GLfloat") float distance, @NativeType("GLfloat *") @Nullable FloatBuffer x, @NativeType("GLfloat *") @Nullable FloatBuffer y, @NativeType("GLfloat *") @Nullable FloatBuffer tangentX, @NativeType("GLfloat *") @Nullable FloatBuffer tangentY) {
        if (CHECKS) {
            checkSafe(x, 1);
            checkSafe(y, 1);
            checkSafe(tangentX, 1);
            checkSafe(tangentY, 1);
        }
        return nglPointAlongPathNV(path, startSegment, numSegments, distance, memAddressSafe(x), memAddressSafe(y), memAddressSafe(tangentX), memAddressSafe(tangentY));
    }

    // --- [ glMatrixLoad3x2fNV ] ---

    /** {@code void glMatrixLoad3x2fNV(GLenum matrixMode, GLfloat const * m)} */
    public static native void nglMatrixLoad3x2fNV(int matrixMode, long m);

    /** {@code void glMatrixLoad3x2fNV(GLenum matrixMode, GLfloat const * m)} */
    public static void glMatrixLoad3x2fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 6);
        }
        nglMatrixLoad3x2fNV(matrixMode, memAddress(m));
    }

    // --- [ glMatrixLoad3x3fNV ] ---

    /** {@code void glMatrixLoad3x3fNV(GLenum matrixMode, GLfloat const * m)} */
    public static native void nglMatrixLoad3x3fNV(int matrixMode, long m);

    /** {@code void glMatrixLoad3x3fNV(GLenum matrixMode, GLfloat const * m)} */
    public static void glMatrixLoad3x3fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 9);
        }
        nglMatrixLoad3x3fNV(matrixMode, memAddress(m));
    }

    // --- [ glMatrixLoadTranspose3x3fNV ] ---

    /** {@code void glMatrixLoadTranspose3x3fNV(GLenum matrixMode, GLfloat const * m)} */
    public static native void nglMatrixLoadTranspose3x3fNV(int matrixMode, long m);

    /** {@code void glMatrixLoadTranspose3x3fNV(GLenum matrixMode, GLfloat const * m)} */
    public static void glMatrixLoadTranspose3x3fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 9);
        }
        nglMatrixLoadTranspose3x3fNV(matrixMode, memAddress(m));
    }

    // --- [ glMatrixMult3x2fNV ] ---

    /** {@code void glMatrixMult3x2fNV(GLenum matrixMode, GLfloat const * m)} */
    public static native void nglMatrixMult3x2fNV(int matrixMode, long m);

    /** {@code void glMatrixMult3x2fNV(GLenum matrixMode, GLfloat const * m)} */
    public static void glMatrixMult3x2fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 6);
        }
        nglMatrixMult3x2fNV(matrixMode, memAddress(m));
    }

    // --- [ glMatrixMult3x3fNV ] ---

    /** {@code void glMatrixMult3x3fNV(GLenum matrixMode, GLfloat const * m)} */
    public static native void nglMatrixMult3x3fNV(int matrixMode, long m);

    /** {@code void glMatrixMult3x3fNV(GLenum matrixMode, GLfloat const * m)} */
    public static void glMatrixMult3x3fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 9);
        }
        nglMatrixMult3x3fNV(matrixMode, memAddress(m));
    }

    // --- [ glMatrixMultTranspose3x3fNV ] ---

    /** {@code void glMatrixMultTranspose3x3fNV(GLenum matrixMode, GLfloat const * m)} */
    public static native void nglMatrixMultTranspose3x3fNV(int matrixMode, long m);

    /** {@code void glMatrixMultTranspose3x3fNV(GLenum matrixMode, GLfloat const * m)} */
    public static void glMatrixMultTranspose3x3fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 9);
        }
        nglMatrixMultTranspose3x3fNV(matrixMode, memAddress(m));
    }

    // --- [ glGetProgramResourcefvNV ] ---

    /** {@code void glGetProgramResourcefvNV(GLuint program, GLenum programInterface, GLuint index, GLsizei propCount, GLenum const * props, GLsizei bufSize, GLsizei * length, GLfloat * params)} */
    public static native void nglGetProgramResourcefvNV(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params);

    /** {@code void glGetProgramResourcefvNV(GLuint program, GLenum programInterface, GLuint index, GLsizei propCount, GLenum const * props, GLsizei bufSize, GLsizei * length, GLfloat * params)} */
    public static void glGetProgramResourcefvNV(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLenum const *") IntBuffer props, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetProgramResourcefvNV(program, programInterface, index, props.remaining(), memAddress(props), params.remaining(), memAddressSafe(length), memAddress(params));
    }

    /** {@code void glPathCommandsNV(GLuint path, GLsizei numCommands, GLubyte const * commands, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static void glPathCommandsNV(@NativeType("GLuint") int path, @NativeType("GLubyte const *") ByteBuffer commands, @NativeType("GLenum") int coordType, @NativeType("void const *") short[] coords) {
        long __functionAddress = GL.getICD().glPathCommandsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(path, commands.remaining(), memAddress(commands), coords.length, coordType, coords, __functionAddress);
    }

    /** {@code void glPathCommandsNV(GLuint path, GLsizei numCommands, GLubyte const * commands, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static void glPathCommandsNV(@NativeType("GLuint") int path, @NativeType("GLubyte const *") ByteBuffer commands, @NativeType("GLenum") int coordType, @NativeType("void const *") float[] coords) {
        long __functionAddress = GL.getICD().glPathCommandsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(path, commands.remaining(), memAddress(commands), coords.length, coordType, coords, __functionAddress);
    }

    /** {@code void glPathCoordsNV(GLuint path, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static void glPathCoordsNV(@NativeType("GLuint") int path, @NativeType("GLenum") int coordType, @NativeType("void const *") short[] coords) {
        long __functionAddress = GL.getICD().glPathCoordsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, coords.length, coordType, coords, __functionAddress);
    }

    /** {@code void glPathCoordsNV(GLuint path, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static void glPathCoordsNV(@NativeType("GLuint") int path, @NativeType("GLenum") int coordType, @NativeType("void const *") float[] coords) {
        long __functionAddress = GL.getICD().glPathCoordsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, coords.length, coordType, coords, __functionAddress);
    }

    /** {@code void glPathSubCommandsNV(GLuint path, GLsizei commandStart, GLsizei commandsToDelete, GLsizei numCommands, GLubyte const * commands, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static void glPathSubCommandsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int commandStart, @NativeType("GLsizei") int commandsToDelete, @NativeType("GLubyte const *") ByteBuffer commands, @NativeType("GLenum") int coordType, @NativeType("void const *") short[] coords) {
        long __functionAddress = GL.getICD().glPathSubCommandsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(path, commandStart, commandsToDelete, commands.remaining(), memAddress(commands), coords.length, coordType, coords, __functionAddress);
    }

    /** {@code void glPathSubCommandsNV(GLuint path, GLsizei commandStart, GLsizei commandsToDelete, GLsizei numCommands, GLubyte const * commands, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static void glPathSubCommandsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int commandStart, @NativeType("GLsizei") int commandsToDelete, @NativeType("GLubyte const *") ByteBuffer commands, @NativeType("GLenum") int coordType, @NativeType("void const *") float[] coords) {
        long __functionAddress = GL.getICD().glPathSubCommandsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(path, commandStart, commandsToDelete, commands.remaining(), memAddress(commands), coords.length, coordType, coords, __functionAddress);
    }

    /** {@code void glPathSubCoordsNV(GLuint path, GLsizei coordStart, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static void glPathSubCoordsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int coordStart, @NativeType("GLenum") int coordType, @NativeType("void const *") short[] coords) {
        long __functionAddress = GL.getICD().glPathSubCoordsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, coordStart, coords.length, coordType, coords, __functionAddress);
    }

    /** {@code void glPathSubCoordsNV(GLuint path, GLsizei coordStart, GLsizei numCoords, GLenum coordType, void const * coords)} */
    public static void glPathSubCoordsNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int coordStart, @NativeType("GLenum") int coordType, @NativeType("void const *") float[] coords) {
        long __functionAddress = GL.getICD().glPathSubCoordsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, coordStart, coords.length, coordType, coords, __functionAddress);
    }

    /** {@code void glWeightPathsNV(GLuint resultPath, GLsizei numPaths, GLuint const * paths, GLfloat const * weights)} */
    public static void glWeightPathsNV(@NativeType("GLuint") int resultPath, @NativeType("GLuint const *") int[] paths, @NativeType("GLfloat const *") float[] weights) {
        long __functionAddress = GL.getICD().glWeightPathsNV;
        if (CHECKS) {
            check(__functionAddress);
            check(weights, paths.length);
        }
        callPPV(resultPath, paths.length, paths, weights, __functionAddress);
    }

    /** {@code void glTransformPathNV(GLuint resultPath, GLuint srcPath, GLenum transformType, GLfloat const * transformValues)} */
    public static void glTransformPathNV(@NativeType("GLuint") int resultPath, @NativeType("GLuint") int srcPath, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") float[] transformValues) {
        long __functionAddress = GL.getICD().glTransformPathNV;
        if (CHECKS) {
            check(__functionAddress);
            check(transformValues, transformTypeToElements(transformType));
        }
        callPV(resultPath, srcPath, transformType, transformValues, __functionAddress);
    }

    /** {@code void glPathParameterivNV(GLuint path, GLenum pname, GLint const * value)} */
    public static void glPathParameterivNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glPathParameterivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(path, pname, value, __functionAddress);
    }

    /** {@code void glPathParameterfvNV(GLuint path, GLenum pname, GLfloat const * value)} */
    public static void glPathParameterfvNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glPathParameterfvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(path, pname, value, __functionAddress);
    }

    /** {@code void glPathDashArrayNV(GLuint path, GLsizei dashCount, GLfloat const * dashArray)} */
    public static void glPathDashArrayNV(@NativeType("GLuint") int path, @NativeType("GLfloat const *") float[] dashArray) {
        long __functionAddress = GL.getICD().glPathDashArrayNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(path, dashArray.length, dashArray, __functionAddress);
    }

    /** {@code void glStencilFillPathInstancedNV(GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLenum fillMode, GLuint mask, GLenum transformType, GLfloat const * transformValues)} */
    public static void glStencilFillPathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLenum") int fillMode, @NativeType("GLuint") int mask, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") float[] transformValues) {
        long __functionAddress = GL.getICD().glStencilFillPathInstancedNV;
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(__functionAddress);
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        callPPV(numPaths, pathNameType, memAddress(paths), pathBase, fillMode, mask, transformType, transformValues, __functionAddress);
    }

    /** {@code void glStencilStrokePathInstancedNV(GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLint reference, GLuint mask, GLenum transformType, GLfloat const * transformValues)} */
    public static void glStencilStrokePathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLint") int reference, @NativeType("GLuint") int mask, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") float[] transformValues) {
        long __functionAddress = GL.getICD().glStencilStrokePathInstancedNV;
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(__functionAddress);
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        callPPV(numPaths, pathNameType, memAddress(paths), pathBase, reference, mask, transformType, transformValues, __functionAddress);
    }

    /** {@code void glPathColorGenNV(GLenum color, GLenum genMode, GLenum colorFormat, GLfloat const * coeffs)} */
    public static void glPathColorGenNV(@NativeType("GLenum") int color, @NativeType("GLenum") int genMode, @NativeType("GLenum") int colorFormat, @NativeType("GLfloat const *") float[] coeffs) {
        long __functionAddress = GL.getICD().glPathColorGenNV;
        if (CHECKS) {
            check(__functionAddress);
            check(coeffs, genModeToElements(genMode) * colorFormatToComponents(colorFormat));
        }
        callPV(color, genMode, colorFormat, coeffs, __functionAddress);
    }

    /** {@code void glPathTexGenNV(GLenum texCoordSet, GLenum genMode, GLint components, GLfloat const * coeffs)} */
    public static void glPathTexGenNV(@NativeType("GLenum") int texCoordSet, @NativeType("GLenum") int genMode, @NativeType("GLint") int components, @NativeType("GLfloat const *") float[] coeffs) {
        long __functionAddress = GL.getICD().glPathTexGenNV;
        if (CHECKS) {
            check(__functionAddress);
            check(coeffs, genModeToElements(genMode) * components);
        }
        callPV(texCoordSet, genMode, components, coeffs, __functionAddress);
    }

    /** {@code void glCoverFillPathInstancedNV(GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLenum coverMode, GLenum transformType, GLfloat const * transformValues)} */
    public static void glCoverFillPathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLenum") int coverMode, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") float[] transformValues) {
        long __functionAddress = GL.getICD().glCoverFillPathInstancedNV;
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(__functionAddress);
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        callPPV(numPaths, pathNameType, memAddress(paths), pathBase, coverMode, transformType, transformValues, __functionAddress);
    }

    /** {@code void glCoverStrokePathInstancedNV(GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLenum coverMode, GLenum transformType, GLfloat const * transformValues)} */
    public static void glCoverStrokePathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLenum") int coverMode, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") float[] transformValues) {
        long __functionAddress = GL.getICD().glCoverStrokePathInstancedNV;
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(__functionAddress);
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        callPPV(numPaths, pathNameType, memAddress(paths), pathBase, coverMode, transformType, transformValues, __functionAddress);
    }

    /** {@code void glStencilThenCoverFillPathInstancedNV(GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLenum fillMode, GLuint mask, GLenum coverMode, GLenum transformType, GLfloat const * transformValues)} */
    public static void glStencilThenCoverFillPathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLenum") int fillMode, @NativeType("GLuint") int mask, @NativeType("GLenum") int coverMode, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") float[] transformValues) {
        long __functionAddress = GL.getICD().glStencilThenCoverFillPathInstancedNV;
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(__functionAddress);
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        callPPV(numPaths, pathNameType, memAddress(paths), pathBase, fillMode, mask, coverMode, transformType, transformValues, __functionAddress);
    }

    /** {@code void glStencilThenCoverStrokePathInstancedNV(GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLint reference, GLuint mask, GLenum coverMode, GLenum transformType, GLfloat const * transformValues)} */
    public static void glStencilThenCoverStrokePathInstancedNV(@NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLint") int reference, @NativeType("GLuint") int mask, @NativeType("GLenum") int coverMode, @NativeType("GLenum") int transformType, @NativeType("GLfloat const *") float[] transformValues) {
        long __functionAddress = GL.getICD().glStencilThenCoverStrokePathInstancedNV;
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(__functionAddress);
            check(transformValues, numPaths * transformTypeToElements(transformType));
        }
        callPPV(numPaths, pathNameType, memAddress(paths), pathBase, reference, mask, coverMode, transformType, transformValues, __functionAddress);
    }

    /** {@code GLenum glPathGlyphIndexRangeNV(GLenum fontTarget, void const * fontName, GLbitfield fontStyle, GLuint pathParameterTemplate, GLfloat emScale, GLuint * baseAndCount)} */
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

    /** {@code void glProgramPathFragmentInputGenNV(GLuint program, GLint location, GLenum genMode, GLint components, GLfloat const * coeffs)} */
    public static void glProgramPathFragmentInputGenNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLenum") int genMode, @NativeType("GLint") int components, @NativeType("GLfloat const *") float[] coeffs) {
        long __functionAddress = GL.getICD().glProgramPathFragmentInputGenNV;
        if (CHECKS) {
            check(__functionAddress);
            check(coeffs, genModeToElements(genMode) * components);
        }
        callPV(program, location, genMode, components, coeffs, __functionAddress);
    }

    /** {@code void glGetPathParameterivNV(GLuint path, GLenum pname, GLint * value)} */
    public static void glGetPathParameterivNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] value) {
        long __functionAddress = GL.getICD().glGetPathParameterivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(path, pname, value, __functionAddress);
    }

    /** {@code void glGetPathParameterfvNV(GLuint path, GLenum pname, GLfloat * value)} */
    public static void glGetPathParameterfvNV(@NativeType("GLuint") int path, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] value) {
        long __functionAddress = GL.getICD().glGetPathParameterfvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(path, pname, value, __functionAddress);
    }

    /** {@code void glGetPathCoordsNV(GLuint path, GLfloat * coords)} */
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

    /** {@code void glGetPathDashArrayNV(GLuint path, GLfloat * dashArray)} */
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

    /** {@code void glGetPathMetricsNV(GLbitfield metricQueryMask, GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLsizei stride, GLfloat * metrics)} */
    public static void glGetPathMetricsNV(@NativeType("GLbitfield") int metricQueryMask, @NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLsizei") int stride, @NativeType("GLfloat *") float[] metrics) {
        long __functionAddress = GL.getICD().glGetPathMetricsNV;
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(__functionAddress);
            check(metrics, numPaths * (stride == 0 ? Integer.bitCount(metricQueryMask) : (stride >> 2)));
        }
        callPPV(metricQueryMask, numPaths, pathNameType, memAddress(paths), pathBase, stride, metrics, __functionAddress);
    }

    /** {@code void glGetPathMetricRangeNV(GLbitfield metricQueryMask, GLuint firstPathName, GLsizei numPaths, GLsizei stride, GLfloat * metrics)} */
    public static void glGetPathMetricRangeNV(@NativeType("GLbitfield") int metricQueryMask, @NativeType("GLuint") int firstPathName, @NativeType("GLsizei") int numPaths, @NativeType("GLsizei") int stride, @NativeType("GLfloat *") float[] metrics) {
        long __functionAddress = GL.getICD().glGetPathMetricRangeNV;
        if (CHECKS) {
            check(__functionAddress);
            check(metrics, numPaths * (stride == 0 ? Integer.bitCount(metricQueryMask) : (stride >> 2)));
        }
        callPV(metricQueryMask, firstPathName, numPaths, stride, metrics, __functionAddress);
    }

    /** {@code void glGetPathSpacingNV(GLenum pathListMode, GLsizei numPaths, GLenum pathNameType, void const * paths, GLuint pathBase, GLfloat advanceScale, GLfloat kerningScale, GLenum transformType, GLfloat * returnedSpacing)} */
    public static void glGetPathSpacingNV(@NativeType("GLenum") int pathListMode, @NativeType("GLenum") int pathNameType, @NativeType("void const *") ByteBuffer paths, @NativeType("GLuint") int pathBase, @NativeType("GLfloat") float advanceScale, @NativeType("GLfloat") float kerningScale, @NativeType("GLenum") int transformType, @NativeType("GLfloat *") float[] returnedSpacing) {
        long __functionAddress = GL.getICD().glGetPathSpacingNV;
        int numPaths = paths.remaining() / pathNameTypeToBytes(pathNameType);
        if (CHECKS) {
            check(__functionAddress);
            check(returnedSpacing, (numPaths - 1) * (transformType == GL_TRANSLATE_X_NV ? 1 : 2));
        }
        callPPV(pathListMode, numPaths, pathNameType, memAddress(paths), pathBase, advanceScale, kerningScale, transformType, returnedSpacing, __functionAddress);
    }

    /** {@code void glGetPathColorGenivNV(GLenum color, GLenum pname, GLint * value)} */
    public static void glGetPathColorGenivNV(@NativeType("GLenum") int color, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] value) {
        long __functionAddress = GL.getICD().glGetPathColorGenivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(color, pname, value, __functionAddress);
    }

    /** {@code void glGetPathColorGenfvNV(GLenum color, GLenum pname, GLfloat * value)} */
    public static void glGetPathColorGenfvNV(@NativeType("GLenum") int color, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] value) {
        long __functionAddress = GL.getICD().glGetPathColorGenfvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(color, pname, value, __functionAddress);
    }

    /** {@code void glGetPathTexGenivNV(GLenum texCoordSet, GLenum pname, GLint * value)} */
    public static void glGetPathTexGenivNV(@NativeType("GLenum") int texCoordSet, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] value) {
        long __functionAddress = GL.getICD().glGetPathTexGenivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(texCoordSet, pname, value, __functionAddress);
    }

    /** {@code void glGetPathTexGenfvNV(GLenum texCoordSet, GLenum pname, GLfloat * value)} */
    public static void glGetPathTexGenfvNV(@NativeType("GLenum") int texCoordSet, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] value) {
        long __functionAddress = GL.getICD().glGetPathTexGenfvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(texCoordSet, pname, value, __functionAddress);
    }

    /** {@code GLboolean glPointAlongPathNV(GLuint path, GLsizei startSegment, GLsizei numSegments, GLfloat distance, GLfloat * x, GLfloat * y, GLfloat * tangentX, GLfloat * tangentY)} */
    @NativeType("GLboolean")
    public static boolean glPointAlongPathNV(@NativeType("GLuint") int path, @NativeType("GLsizei") int startSegment, @NativeType("GLsizei") int numSegments, @NativeType("GLfloat") float distance, @NativeType("GLfloat *") float @Nullable [] x, @NativeType("GLfloat *") float @Nullable [] y, @NativeType("GLfloat *") float @Nullable [] tangentX, @NativeType("GLfloat *") float @Nullable [] tangentY) {
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

    /** {@code void glMatrixLoad3x2fNV(GLenum matrixMode, GLfloat const * m)} */
    public static void glMatrixLoad3x2fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMatrixLoad3x2fNV;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 6);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** {@code void glMatrixLoad3x3fNV(GLenum matrixMode, GLfloat const * m)} */
    public static void glMatrixLoad3x3fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMatrixLoad3x3fNV;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 9);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** {@code void glMatrixLoadTranspose3x3fNV(GLenum matrixMode, GLfloat const * m)} */
    public static void glMatrixLoadTranspose3x3fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMatrixLoadTranspose3x3fNV;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 9);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** {@code void glMatrixMult3x2fNV(GLenum matrixMode, GLfloat const * m)} */
    public static void glMatrixMult3x2fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMatrixMult3x2fNV;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 6);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** {@code void glMatrixMult3x3fNV(GLenum matrixMode, GLfloat const * m)} */
    public static void glMatrixMult3x3fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMatrixMult3x3fNV;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 9);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** {@code void glMatrixMultTranspose3x3fNV(GLenum matrixMode, GLfloat const * m)} */
    public static void glMatrixMultTranspose3x3fNV(@NativeType("GLenum") int matrixMode, @NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMatrixMultTranspose3x3fNV;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 9);
        }
        callPV(matrixMode, m, __functionAddress);
    }

    /** {@code void glGetProgramResourcefvNV(GLuint program, GLenum programInterface, GLuint index, GLsizei propCount, GLenum const * props, GLsizei bufSize, GLsizei * length, GLfloat * params)} */
    public static void glGetProgramResourcefvNV(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLenum const *") int[] props, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLfloat *") float[] params) {
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