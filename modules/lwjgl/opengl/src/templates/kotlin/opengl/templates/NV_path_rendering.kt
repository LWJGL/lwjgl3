/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_path_rendering = "NVPathRendering".nativeClassGL("NV_path_rendering", postfix = NV) {
    javaImport(
        "static org.lwjgl.opengl.GL11.*"
    )

    ByteConstant(
        "CLOSE_PATH_NV"..(0x00).b,
        "MOVE_TO_NV"..(0x02).b,
        "RELATIVE_MOVE_TO_NV"..(0x03).b,
        "LINE_TO_NV"..(0x04).b,
        "RELATIVE_LINE_TO_NV"..(0x05).b,
        "HORIZONTAL_LINE_TO_NV"..(0x06).b,
        "RELATIVE_HORIZONTAL_LINE_TO_NV"..(0x07).b,
        "VERTICAL_LINE_TO_NV"..(0x08).b,
        "RELATIVE_VERTICAL_LINE_TO_NV"..(0x09).b,
        "QUADRATIC_CURVE_TO_NV"..(0x0A).b,
        "RELATIVE_QUADRATIC_CURVE_TO_NV"..(0x0B).b,
        "CUBIC_CURVE_TO_NV"..(0x0C).b,
        "RELATIVE_CUBIC_CURVE_TO_NV"..(0x0D).b,
        "SMOOTH_QUADRATIC_CURVE_TO_NV"..(0x0E).b,
        "RELATIVE_SMOOTH_QUADRATIC_CURVE_TO_NV"..(0x0F).b,
        "SMOOTH_CUBIC_CURVE_TO_NV"..(0x10).b,
        "RELATIVE_SMOOTH_CUBIC_CURVE_TO_NV"..(0x11).b,
        "SMALL_CCW_ARC_TO_NV"..(0x12).b,
        "RELATIVE_SMALL_CCW_ARC_TO_NV"..(0x13).b,
        "SMALL_CW_ARC_TO_NV"..(0x14).b,
        "RELATIVE_SMALL_CW_ARC_TO_NV"..(0x15).b,
        "LARGE_CCW_ARC_TO_NV"..(0x16).b,
        "RELATIVE_LARGE_CCW_ARC_TO_NV"..(0x17).b,
        "LARGE_CW_ARC_TO_NV"..(0x18).b,
        "RELATIVE_LARGE_CW_ARC_TO_NV"..(0x19).b,
        "CONIC_CURVE_TO_NV"..(0x1A).b,
        "RELATIVE_CONIC_CURVE_TO_NV"..(0x1B).b,
        "ROUNDED_RECT_NV"..(0xE8).b,
        "RELATIVE_ROUNDED_RECT_NV"..(0xE9).b,
        "ROUNDED_RECT2_NV"..(0xEA).b,
        "RELATIVE_ROUNDED_RECT2_NV"..(0xEB).b,
        "ROUNDED_RECT4_NV"..(0xEC).b,
        "RELATIVE_ROUNDED_RECT4_NV"..(0xED).b,
        "ROUNDED_RECT8_NV"..(0xEE).b,
        "RELATIVE_ROUNDED_RECT8_NV"..(0xEF).b,
        "RESTART_PATH_NV"..(0xF0).b,
        "DUP_FIRST_CUBIC_CURVE_TO_NV"..(0xF2).b,
        "DUP_LAST_CUBIC_CURVE_TO_NV"..(0xF4).b,
        "RECT_NV"..(0xF6).b,
        "RELATIVE_RECT_NV"..(0xF7).b,
        "CIRCULAR_CCW_ARC_TO_NV"..(0xF8).b,
        "CIRCULAR_CW_ARC_TO_NV"..(0xFA).b,
        "CIRCULAR_TANGENT_ARC_TO_NV"..(0xFC).b,
        "ARC_TO_NV"..(0xFE).b,
        "RELATIVE_ARC_TO_NV"..(0xFF).b
    )

    IntConstant(
        "PATH_FORMAT_SVG_NV"..0x9070,
        "PATH_FORMAT_PS_NV"..0x9071
    )

    IntConstant(
        "STANDARD_FONT_NAME_NV"..0x9072,
        "SYSTEM_FONT_NAME_NV"..0x9073,
        "FILE_NAME_NV"..0x9074
    )

    IntConstant(
        "STANDARD_FONT_FORMAT_NV"..0x936C
    )

    IntConstant(
        "SKIP_MISSING_GLYPH_NV"..0x90A9,
        "USE_MISSING_GLYPH_NV"..0x90AA
    )

    IntConstant(
        "FONT_GLYPHS_AVAILABLE_NV"..0x9368,
        "FONT_TARGET_UNAVAILABLE_NV"..0x9369,
        "FONT_UNAVAILABLE_NV"..0x936A,
        "FONT_UNINTELLIGIBLE_NV"..0x936B
    )

    IntConstant(
        "PATH_STROKE_WIDTH_NV"..0x9075,
        "PATH_INITIAL_END_CAP_NV"..0x9077,
        "PATH_TERMINAL_END_CAP_NV"..0x9078,
        "PATH_JOIN_STYLE_NV"..0x9079,
        "PATH_MITER_LIMIT_NV"..0x907A,
        "PATH_INITIAL_DASH_CAP_NV"..0x907C,
        "PATH_TERMINAL_DASH_CAP_NV"..0x907D,
        "PATH_DASH_OFFSET_NV"..0x907E,
        "PATH_CLIENT_LENGTH_NV"..0x907F,
        "PATH_DASH_OFFSET_RESET_NV"..0x90B4,
        "PATH_FILL_MODE_NV"..0x9080,
        "PATH_FILL_MASK_NV"..0x9081,
        "PATH_FILL_COVER_MODE_NV"..0x9082,
        "PATH_STROKE_COVER_MODE_NV"..0x9083,
        "PATH_STROKE_MASK_NV"..0x9084,
        "PATH_STROKE_BOUND_NV"..0x9086
    )

    IntConstant(
        "PATH_END_CAPS_NV"..0x9076,
        "PATH_DASH_CAPS_NV"..0x907B
    )

    IntConstant(
        "COUNT_UP_NV"..0x9088,
        "COUNT_DOWN_NV"..0x9089
    )

    IntConstant(
        "PRIMARY_COLOR_NV"..0x852C,
        "SECONDARY_COLOR_NV"..0x852D
    )

    IntConstant(
        "PATH_OBJECT_BOUNDING_BOX_NV"..0x908A
    )

    IntConstant(
        "CONVEX_HULL_NV"..0x908B,
        "BOUNDING_BOX_NV"..0x908D
    )

    IntConstant(
        "TRANSLATE_X_NV"..0x908E,
        "TRANSLATE_Y_NV"..0x908F,
        "TRANSLATE_2D_NV"..0x9090,
        "TRANSLATE_3D_NV"..0x9091,
        "AFFINE_2D_NV"..0x9092,
        "AFFINE_3D_NV"..0x9094,
        "TRANSPOSE_AFFINE_2D_NV"..0x9096,
        "TRANSPOSE_AFFINE_3D_NV"..0x9098
    )

    IntConstant(
        "UTF8_NV"..0x909A,
        "UTF16_NV"..0x909B
    )

    IntConstant(
        "BOUNDING_BOX_OF_BOUNDING_BOXES_NV"..0x909C
    )

    IntConstant(
        "PATH_COMMAND_COUNT_NV"..0x909D,
        "PATH_COORD_COUNT_NV"..0x909E,
        "PATH_DASH_ARRAY_COUNT_NV"..0x909F,
        "PATH_COMPUTED_LENGTH_NV"..0x90A0,
        "PATH_FILL_BOUNDING_BOX_NV"..0x90A1,
        "PATH_STROKE_BOUNDING_BOX_NV"..0x90A2
    )

    IntConstant(
        "SQUARE_NV"..0x90A3,
        "ROUND_NV"..0x90A4,
        "TRIANGULAR_NV"..0x90A5
    )

    IntConstant(
        "BEVEL_NV"..0x90A6,
        "MITER_REVERT_NV"..0x90A7,
        "MITER_TRUNCATE_NV"..0x90A8
    )

    IntConstant(
        "MOVE_TO_RESETS_NV"..0x90B5,
        "MOVE_TO_CONTINUES_NV"..0x90B6
    )

    IntConstant(
        "BOLD_BIT_NV"..0x01,
        "ITALIC_BIT_NV"..0x02
    )

    IntConstant(
        "PATH_ERROR_POSITION_NV"..0x90AB,
        "PATH_FOG_GEN_MODE_NV"..0x90AC,
        "PATH_STENCIL_FUNC_NV"..0x90B7,
        "PATH_STENCIL_REF_NV"..0x90B8,
        "PATH_STENCIL_VALUE_MASK_NV"..0x90B9,
        "PATH_STENCIL_DEPTH_OFFSET_FACTOR_NV"..0x90BD,
        "PATH_STENCIL_DEPTH_OFFSET_UNITS_NV"..0x90BE,
        "PATH_COVER_DEPTH_FUNC_NV"..0x90BF
    )

    IntConstant(
        "GLYPH_WIDTH_BIT_NV"..0x01,
        "GLYPH_HEIGHT_BIT_NV"..0x02,
        "GLYPH_HORIZONTAL_BEARING_X_BIT_NV"..0x04,
        "GLYPH_HORIZONTAL_BEARING_Y_BIT_NV"..0x08,
        "GLYPH_HORIZONTAL_BEARING_ADVANCE_BIT_NV"..0x10,
        "GLYPH_VERTICAL_BEARING_X_BIT_NV"..0x20,
        "GLYPH_VERTICAL_BEARING_Y_BIT_NV"..0x40,
        "GLYPH_VERTICAL_BEARING_ADVANCE_BIT_NV"..0x80,
        "GLYPH_HAS_KERNING_BIT_NV"..0x100,
        "FONT_X_MIN_BOUNDS_BIT_NV"..0x00010000,
        "FONT_Y_MIN_BOUNDS_BIT_NV"..0x00020000,
        "FONT_X_MAX_BOUNDS_BIT_NV"..0x00040000,
        "FONT_Y_MAX_BOUNDS_BIT_NV"..0x00080000,
        "FONT_UNITS_PER_EM_BIT_NV"..0x00100000,
        "FONT_ASCENDER_BIT_NV"..0x00200000,
        "FONT_DESCENDER_BIT_NV"..0x00400000,
        "FONT_HEIGHT_BIT_NV"..0x00800000,
        "FONT_MAX_ADVANCE_WIDTH_BIT_NV"..0x01000000,
        "FONT_MAX_ADVANCE_HEIGHT_BIT_NV"..0x02000000,
        "FONT_UNDERLINE_POSITION_BIT_NV"..0x04000000,
        "FONT_UNDERLINE_THICKNESS_BIT_NV"..0x08000000,
        "FONT_HAS_KERNING_BIT_NV"..0x10000000,
        "FONT_NUM_GLYPH_INDICES_BIT_NV"..0x20000000
    )

    IntConstant(
        "ACCUM_ADJACENT_PAIRS_NV"..0x90AD,
        "ADJACENT_PAIRS_NV"..0x90AE,
        "FIRST_TO_REST_NV"..0x90AF
    )

    IntConstant(
        "PATH_GEN_MODE_NV"..0x90B0,
        "PATH_GEN_COEFF_NV"..0x90B1
    )

    IntConstant(
        "PATH_GEN_COLOR_FORMAT_NV"..0x90B2
    )

    IntConstant(
        "PATH_GEN_COMPONENTS_NV"..0x90B3
    )

    IntConstant(
        "FRAGMENT_INPUT_NV"..0x936D
    )

    IntConstant(
        "PATH_PROJECTION_NV"..0x1701,
        "PATH_MODELVIEW_NV"..0x1700,
        "PATH_MODELVIEW_STACK_DEPTH_NV"..0x0BA3,
        "PATH_MODELVIEW_MATRIX_NV"..0x0BA6,
        "PATH_MAX_MODELVIEW_STACK_DEPTH_NV"..0x0D36,
        "PATH_TRANSPOSE_MODELVIEW_MATRIX_NV"..0x84E3,
        "PATH_PROJECTION_STACK_DEPTH_NV"..0x0BA4,
        "PATH_PROJECTION_MATRIX_NV"..0x0BA7,
        "PATH_MAX_PROJECTION_STACK_DEPTH_NV"..0x0D38,
        "PATH_TRANSPOSE_PROJECTION_MATRIX_NV"..0x84E4
    )

    IntConstant(
        "2_BYTES_NV"..0x1407,
        "3_BYTES_NV"..0x1408,
        "4_BYTES_NV"..0x1409,
        "EYE_LINEAR_NV"..0x2400,
        "OBJECT_LINEAR_NV"..0x2401,
        "CONSTANT_NV"..0x8576
    )

    void(
        "PathCommandsNV",

        GLuint("path"),
        AutoSize("commands")..GLsizei("numCommands"),
        GLubyte.const.p("commands"),
        AutoSizeShr("GLChecks.typeToByteShift(coordType)", "coords")..GLsizei("numCoords"),
        GLenum("coordType"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_FLOAT
        )..void.const.p("coords")
    )

    void(
        "PathCoordsNV",

        GLuint("path"),
        this["PathCommandsNV"]["numCoords"],
        this["PathCommandsNV"]["coordType"],
        this["PathCommandsNV"]["coords"]
    )

    void(
        "PathSubCommandsNV",

        GLuint("path"),
        GLsizei("commandStart"),
        GLsizei("commandsToDelete"),
        AutoSize("commands")..GLsizei("numCommands"),
        GLubyte.const.p("commands"),
        this["PathCommandsNV"]["numCoords"],
        this["PathCommandsNV"]["coordType"],
        this["PathCommandsNV"]["coords"]
    )

    void(
        "PathSubCoordsNV",

        GLuint("path"),
        GLsizei("coordStart"),
        this["PathCommandsNV"]["numCoords"],
        this["PathCommandsNV"]["coordType"],
        this["PathCommandsNV"]["coords"]
    )

    void(
        "PathStringNV",

        GLuint("path"),
        GLenum("format"),
        AutoSize("pathString")..GLsizei("length"),
        void.const.p("pathString")
    )

    val PathGlyphsNV = void(
        "PathGlyphsNV",

        GLuint("firstPathName"),
        GLenum("fontTarget"),
        NullTerminated..void.const.p("fontName"),
        GLbitfield("fontStyle"),
        AutoSizeDiv("charcodeTypeToBytes(type)", "charcodes")..GLsizei("numGlyphs"),
        GLenum("type"),
        void.const.p("charcodes"),
        GLenum("handleMissingGlyphs"),
        GLuint("pathParameterTemplate"),
        GLfloat("emScale")
    )

    void(
        "PathGlyphRangeNV",

        PathGlyphsNV["firstPathName"],
        PathGlyphsNV["fontTarget"],
        PathGlyphsNV["fontName"],
        PathGlyphsNV["fontStyle"],
        GLuint("firstGlyph"),
        GLsizei("numGlyphs"),
        PathGlyphsNV["handleMissingGlyphs"],
        PathGlyphsNV["pathParameterTemplate"],
        PathGlyphsNV["emScale"]
    )

    IgnoreMissing..GLenum(
        "PathGlyphIndexArrayNV",

        PathGlyphsNV["firstPathName"],
        PathGlyphsNV["fontTarget"],
        PathGlyphsNV["fontName"],
        PathGlyphsNV["fontStyle"],
        GLuint("firstGlyphIndex"),
        this["PathGlyphRangeNV"]["numGlyphs"],
        PathGlyphsNV["pathParameterTemplate"],
        PathGlyphsNV["emScale"]
    )

    IgnoreMissing..GLenum(
        "PathMemoryGlyphIndexArrayNV",

        PathGlyphsNV["firstPathName"],
        PathGlyphsNV["fontTarget"],
        AutoSize("fontData")..GLsizeiptr("fontSize"),
        void.const.p("fontData"),
        GLsizei("faceIndex"),
        this["PathGlyphIndexArrayNV"]["firstGlyphIndex"],
        this["PathGlyphRangeNV"]["numGlyphs"],
        PathGlyphsNV["pathParameterTemplate"],
        PathGlyphsNV["emScale"]
    )

    void(
        "CopyPathNV",

        GLuint("resultPath"),
        GLuint("srcPath")
    )

    IgnoreMissing..void(
        "WeightPathsNV",

        GLuint("resultPath"),
        AutoSize("paths", "weights")..GLsizei("numPaths"),
        GLuint.const.p("paths"),
        GLfloat.const.p("weights")
    )

    void(
        "InterpolatePathsNV",

        GLuint("resultPath"),
        GLuint("pathA"),
        GLuint("pathB"),
        GLfloat("weight")
    )

    void(
        "TransformPathNV",

        GLuint("resultPath"),
        GLuint("srcPath"),
        GLenum("transformType"),
        Check("transformTypeToElements(transformType)")..GLfloat.const.p("transformValues")
    )

    void(
        "PathParameterivNV",

        GLuint("path"),
        GLenum("pname"),
        Check(1)..GLint.const.p("value")
    )

    void(
        "PathParameteriNV",

        GLuint("path"),
        this["PathParameterivNV"]["pname"],
        GLint("value")
    )

    void(
        "PathParameterfvNV",

        GLuint("path"),
        GLenum("pname"),
        Check(1)..GLfloat.const.p("value")
    )

    void(
        "PathParameterfNV",

        GLuint("path"),
        this["PathParameterfvNV"]["pname"],
        GLfloat("value")
    )

    void(
        "PathDashArrayNV",

        GLuint("path"),
        AutoSize("dashArray")..GLsizei("dashCount"),
        GLfloat.const.p("dashArray")
    )

    GLuint(
        "GenPathsNV",

        GLsizei("range")
    )

    void(
        "DeletePathsNV",

        GLuint("path"),
        GLsizei("range")
    )

    GLboolean(
        "IsPathNV",

        GLuint("path")
    )

    void(
        "PathStencilFuncNV",

        GLenum("func"),
        GLint("ref"),
        GLuint("mask")
    )

    void(
        "PathStencilDepthOffsetNV",

        GLfloat("factor"),
        GLfloat("units")
    )

    void(
        "StencilFillPathNV",

        GLuint("path"),
        GLenum("fillMode"),
        GLuint("mask")
    )

    void(
        "StencilStrokePathNV",

        GLuint("path"),
        GLint("reference"),
        GLuint("mask")
    )

    val StencilFillPathInstancedNV = void(
        "StencilFillPathInstancedNV",

        UseVariable..AutoSizeDiv("pathNameTypeToBytes(pathNameType)", "paths")..GLsizei("numPaths"),
        GLenum("pathNameType"),
        void.const.p("paths"),
        GLuint("pathBase"),
        this["StencilFillPathNV"]["fillMode"],
        GLuint("mask"),
        this["TransformPathNV"]["transformType"],
        Check("numPaths * transformTypeToElements(transformType)")..GLfloat.const.p("transformValues")
    )

    void(
        "StencilStrokePathInstancedNV",

        StencilFillPathInstancedNV["numPaths"],
        StencilFillPathInstancedNV["pathNameType"],
        StencilFillPathInstancedNV["paths"],
        StencilFillPathInstancedNV["pathBase"],
        GLint("reference"),
        StencilFillPathInstancedNV["mask"],
        StencilFillPathInstancedNV["transformType"],
        StencilFillPathInstancedNV["transformValues"]
    )

    void(
        "PathCoverDepthFuncNV",

        GLenum("zfunc")
    )

    IgnoreMissing..void(
        "PathColorGenNV",

        GLenum("color"),
        GLenum("genMode"),
        GLenum("colorFormat"),
        Check("genModeToElements(genMode) * colorFormatToComponents(colorFormat)")..GLfloat.const.p("coeffs")
    )

    IgnoreMissing..void(
        "PathTexGenNV",

        GLenum("texCoordSet"),
        GLenum("genMode"),
        GLint("components"),
        Check("genModeToElements(genMode) * components")..GLfloat.const.p("coeffs")
    )

    IgnoreMissing..void(
        "PathFogGenNV",

        GLenum("genMode")
    )

    void(
        "CoverFillPathNV",

        GLuint("path"),
        GLenum("coverMode")
    )

    void(
        "CoverStrokePathNV",

        GLuint("path"),
        this["CoverFillPathNV"]["coverMode"]
    )

    void(
        "CoverFillPathInstancedNV",

        StencilFillPathInstancedNV["numPaths"],
        StencilFillPathInstancedNV["pathNameType"],
        StencilFillPathInstancedNV["paths"],
        StencilFillPathInstancedNV["pathBase"],
        GLenum("coverMode"),
        StencilFillPathInstancedNV["transformType"],
        StencilFillPathInstancedNV["transformValues"]
    )

    void(
        "CoverStrokePathInstancedNV",

        StencilFillPathInstancedNV["numPaths"],
        StencilFillPathInstancedNV["pathNameType"],
        StencilFillPathInstancedNV["paths"],
        StencilFillPathInstancedNV["pathBase"],
        this["CoverFillPathInstancedNV"]["coverMode"],
        StencilFillPathInstancedNV["transformType"],
        StencilFillPathInstancedNV["transformValues"]
    )

    IgnoreMissing..void(
        "StencilThenCoverFillPathNV",

        GLuint("path"),
        this["StencilFillPathNV"]["fillMode"],
        GLuint("mask"),
        this["CoverFillPathNV"]["coverMode"]
    )

    IgnoreMissing..void(
        "StencilThenCoverStrokePathNV",

        GLuint("path"),
        GLint("reference"),
        GLuint("mask"),
        this["CoverFillPathNV"]["coverMode"]
    )

    IgnoreMissing..void(
        "StencilThenCoverFillPathInstancedNV",

        StencilFillPathInstancedNV["numPaths"],
        StencilFillPathInstancedNV["pathNameType"],
        StencilFillPathInstancedNV["paths"],
        StencilFillPathInstancedNV["pathBase"],
        this["StencilFillPathNV"]["fillMode"],
        GLuint("mask"),
        this["CoverFillPathInstancedNV"]["coverMode"],
        StencilFillPathInstancedNV["transformType"],
        StencilFillPathInstancedNV["transformValues"]
    )

    IgnoreMissing..void(
        "StencilThenCoverStrokePathInstancedNV",

        StencilFillPathInstancedNV["numPaths"],
        StencilFillPathInstancedNV["pathNameType"],
        StencilFillPathInstancedNV["paths"],
        StencilFillPathInstancedNV["pathBase"],
        GLint("reference"),
        GLuint("mask"),
        this["CoverFillPathInstancedNV"]["coverMode"],
        StencilFillPathInstancedNV["transformType"],
        StencilFillPathInstancedNV["transformValues"]
    )

    IgnoreMissing..GLenum(
        "PathGlyphIndexRangeNV",

        PathGlyphsNV["fontTarget"],
        PathGlyphsNV["fontName"],
        PathGlyphsNV["fontStyle"],
        GLuint("pathParameterTemplate"),
        GLfloat("emScale"),
        Check(2)..GLuint.p("baseAndCount")
    )

    IgnoreMissing..void(
        "ProgramPathFragmentInputGenNV",

        GLuint("program"),
        GLint("location"),
        GLenum("genMode"),
        GLint("components"),
        Check("genModeToElements(genMode) * components")..GLfloat.const.p("coeffs")
    )

    void(
        "GetPathParameterivNV",

        GLuint("path"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLint.p("value")
    )

    void(
        "GetPathParameterfvNV",

        GLuint("path"),
        this["GetPathParameterivNV"]["pname"],
        ReturnParam..Check(1)..GLfloat.p("value")
    )

    void(
        "GetPathCommandsNV",

        GLuint("path"),
        Check("glGetPathParameteriNV(path, GL_PATH_COMMAND_COUNT_NV)", debug = true)..GLubyte.p("commands")
    )

    void(
        "GetPathCoordsNV",

        GLuint("path"),
        Check("glGetPathParameteriNV(path, GL_PATH_COORD_COUNT_NV)", debug = true)..GLfloat.p("coords")
    )

    void(
        "GetPathDashArrayNV",

        GLuint("path"),
        Check("glGetPathParameteriNV(path, GL_PATH_DASH_ARRAY_COUNT_NV)", debug = true)..GLfloat.p("dashArray")
    )

    void(
        "GetPathMetricsNV",

        GLbitfield("metricQueryMask"),
        StencilFillPathInstancedNV["numPaths"],
        StencilFillPathInstancedNV["pathNameType"],
        StencilFillPathInstancedNV["paths"],
        StencilFillPathInstancedNV["pathBase"],
        GLsizei("stride"),
        Check("numPaths * (stride == 0 ? Integer.bitCount(metricQueryMask) : (stride >> 2))")..GLfloat.p("metrics")
    )

    void(
        "GetPathMetricRangeNV",

        this["GetPathMetricsNV"]["metricQueryMask"],
        GLuint("firstPathName"),
        GLsizei("numPaths"),
        this["GetPathMetricsNV"]["stride"],
        this["GetPathMetricsNV"]["metrics"]
    )

    void(
        "GetPathSpacingNV",

        GLenum("pathListMode"),
        StencilFillPathInstancedNV["numPaths"],
        StencilFillPathInstancedNV["pathNameType"],
        StencilFillPathInstancedNV["paths"],
        StencilFillPathInstancedNV["pathBase"],
        GLfloat("advanceScale"),
        GLfloat("kerningScale"),
        GLenum("transformType"),
        Check("(numPaths - 1) * (transformType == GL_TRANSLATE_X_NV ? 1 : 2)")..GLfloat.p("returnedSpacing")
    )

    IgnoreMissing..void(
        "GetPathColorGenivNV",

        this["PathColorGenNV"]["color"],
        GLenum("pname"),
        ReturnParam..Check(1)..GLint.p("value")
    )

    IgnoreMissing..void(
        "GetPathColorGenfvNV",

        this["PathColorGenNV"]["color"],
        this["GetPathColorGenivNV"]["pname"],
        ReturnParam..Check(1)..GLfloat.p("value")
    )

    IgnoreMissing..void(
        "GetPathTexGenivNV",

        GLenum("texCoordSet"),
        GLenum("pname"),
        ReturnParam..Check(1)..GLint.p("value")
    )

    IgnoreMissing..void(
        "GetPathTexGenfvNV",

        GLenum("texCoordSet"),
        this["GetPathTexGenivNV"]["pname"],
        ReturnParam..Check(1)..GLfloat.p("value")
    )

    GLboolean(
        "IsPointInFillPathNV",

        GLuint("path"),
        GLuint("mask"),
        GLfloat("x"),
        GLfloat("y")
    )

    GLboolean(
        "IsPointInStrokePathNV",

        GLuint("path"),
        GLfloat("x"),
        GLfloat("y")
    )

    GLfloat(
        "GetPathLengthNV",

        GLuint("path"),
        GLsizei("startSegment"),
        GLsizei("numSegments")
    )

    GLboolean(
        "PointAlongPathNV",

        GLuint("path"),
        GLsizei("startSegment"),
        GLsizei("numSegments"),
        GLfloat("distance"),
        nullable..Check(1)..GLfloat.p("x"),
        nullable..Check(1)..GLfloat.p("y"),
        nullable..Check(1)..GLfloat.p("tangentX"),
        nullable..Check(1)..GLfloat.p("tangentY")
    )

    IgnoreMissing..void(
        "MatrixLoad3x2fNV",

        GLenum("matrixMode"),
        Check(3 * 2)..GLfloat.const.p("m")
    )

    IgnoreMissing..void(
        "MatrixLoad3x3fNV",

        this["MatrixLoad3x2fNV"]["matrixMode"],
        Check(3 * 3)..GLfloat.const.p("m")
    )

    IgnoreMissing..void(
        "MatrixLoadTranspose3x3fNV",

        this["MatrixLoad3x2fNV"]["matrixMode"],
        this["MatrixLoad3x3fNV"]["m"]
    )

    IgnoreMissing..void(
        "MatrixMult3x2fNV",

        this["MatrixLoad3x2fNV"]["matrixMode"],
        Check(3 * 2)..GLfloat.const.p("m")
    )

    IgnoreMissing..void(
        "MatrixMult3x3fNV",

        this["MatrixLoad3x2fNV"]["matrixMode"],
        this["MatrixLoad3x3fNV"]["m"]
    )

    IgnoreMissing..void(
        "MatrixMultTranspose3x3fNV",

        this["MatrixLoad3x2fNV"]["matrixMode"],
        this["MatrixLoad3x3fNV"]["m"]
    )

    IgnoreMissing..void(
        "GetProgramResourcefvNV",

        GLuint("program"),
        GLenum("programInterface"),
        GLuint("index"),
        AutoSize("props")..GLsizei("propCount"),
        GLenum.const.p("props"),
        AutoSize("params")..GLsizei("bufSize"),
        Check(1)..nullable..GLsizei.p("length"),
        GLfloat.p("params")
    )

    customMethod("""
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
    """)

    customMethod("""
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
    """)

    customMethod("""
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
    """)

    customMethod("""
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
    """)

    customMethod("""
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
    """)
}