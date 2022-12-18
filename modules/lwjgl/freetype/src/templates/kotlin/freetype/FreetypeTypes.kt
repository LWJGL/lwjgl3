/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package freetype

import org.lwjgl.generator.*

val FREETYPE_BINDING = simpleBinding(
    Module.FREETYPE,
    libraryExpression = """Configuration.FREETYPE_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("freetype"))""",
    bundledWithLWJGL = true
)
val FREETYPE_BINDING_DELEGATE = FREETYPE_BINDING.delegate("FreeType.getLibrary()")

val CID_FaceDict = typedef(struct(Module.FREETYPE, "CID_FaceDict").p, "CID_FaceDict")
val CID_FaceInfo = typedef(struct(Module.FREETYPE, "CID_FaceInfo").p, "CID_FaceInfo")

val FT_BitmapGlyph = typedef(struct(Module.FREETYPE, "FT_BitmapGlyph").p, "FT_BitmapGlyph")
val FT_CharMap = typedef(struct(Module.FREETYPE, "FT_CharMap").p, "FT_CharMap")
val FT_Driver = "FT_Driver".handle
val FT_Face = typedef(struct(Module.FREETYPE, "FT_Face").p, "FT_Face")
val FT_Face_Internal = "FT_Face_Internal".handle
val FT_Glyph = typedef(struct(Module.FREETYPE, "FT_Glyph").p, "FT_Glyph")
val FT_GlyphSlot = typedef(struct(Module.FREETYPE, "FT_GlyphSlot").p, "FT_GlyphSlot")
val FT_Incremental = "FT_Incremental".handle
val FT_Incremental_Interface = typedef(struct(Module.FREETYPE, "FT_Incremental_Interface").p, "FT_Incremental_Interface")
val FT_Incremental_Metrics = typedef(struct(Module.FREETYPE, "FT_Incremental_Metrics").p, "FT_Incremental_Metrics")
val FT_Library = "FT_Library".handle
val FT_List = typedef(struct(Module.FREETYPE, "FT_List").p, "FT_List")
val FT_ListNode = typedef(struct(Module.FREETYPE, "FT_ListNode").p, "FT_ListNode")
val FT_Memory = typedef(struct(Module.FREETYPE, "FT_Memory", nativeName = "struct FT_MemoryRec_").p, "FT_Memory")
val FT_Module = "FT_Module".handle
val FT_OutlineGlyph = typedef(struct(Module.FREETYPE, "FT_OutlineGlyph").p, "FT_OutlineGlyph")
val FT_Pointer = typedef(void.p, "FT_Pointer")
val FT_Raster = "FT_Raster".handle
val FT_Renderer = "FT_Renderer".handle
val FT_SVG_Document = typedef(struct(Module.FREETYPE, "FT_SVG_Document").p, "FT_SVG_Document")
val FT_Size = typedef(struct(Module.FREETYPE, "FT_Size").p, "FT_Size")
val FT_Size_Request = typedef(struct(Module.FREETYPE, "FT_Size_Request").p, "FT_Size_Request")
val FT_Slot_Internal = "FT_Slot_Internal".handle
val FT_Stream = typedef(struct(Module.FREETYPE, "FT_Stream").p, "FT_Stream")
val FT_Stroker = "FT_Stroker".handle
val FT_SubGlyph = "FT_SubGlyph".handle
val FT_SvgGlyph = typedef(struct(Module.FREETYPE, "FT_SvgGlyph").p, "FT_SvgGlyph")

val FTC_CMapCache = "FTC_CMapCache".handle
val FTC_FaceID = "FTC_FaceID".handle
val FTC_ImageCache = "FTC_ImageCache".handle
val FTC_ImageType = typedef(struct(Module.FREETYPE, "FTC_ImageType").p, "FTC_ImageType")
val FTC_Manager = "FTC_Manager".handle
val FTC_Node = "FTC_Node".handle
val FTC_SBit = typedef(struct(Module.FREETYPE, "FTC_SBit").p, "FTC_SBit")
val FTC_SBitCache = "FTC_SBitCache".handle
val FTC_Scaler = typedef(struct(Module.FREETYPE, "FTC_Scaler").p, "FTC_Scaler")

val PS_FontInfo = typedef(struct(Module.FREETYPE, "PS_FontInfo").p, "PS_FontInfo")
val PS_Private = "PS_Private".handle

val FT_Bool = PrimitiveType("FT_Bool", PrimitiveMapping.BOOLEAN)

val FT_Byte = typedef(unsigned_char, "FT_Byte")
val FT_Char = typedef(char, "FT_Char")

val FT_UInt16 = typedef(unsigned_short, "FT_UInt16")
val FT_UShort = typedef(unsigned_short, "FT_UShort")
val FT_UFWord = typedef(unsigned_short, "FT_UFWord")
val FT_Int16 = typedef(short, "FT_Int16")
val FT_Short = typedef(short, "FT_Short")
val FT_FWord = typedef(short, "FT_FWord")
val FT_F2Dot14 = typedef(short, "FT_F2Dot14")

val FT_UInt = typedef(unsigned_int, "FT_UInt")
val FT_UInt32 = typedef(unsigned_int, "FT_UInt32")
val FT_UFast = typedef(unsigned_int, "FT_UFast")
val FT_Int = typedef(int, "FT_Int")
val FT_Int32 = typedef(int, "FT_Int32")
val FT_Fast = typedef(int, "FT_Fast")

val FT_Long = typedef(long, "FT_Long")
val FT_F26Dot6 = typedef(long, "FT_F26Dot6")
val FT_Fixed = typedef(long, "FT_Fixed")

val FT_UInt64 = typedef(unsigned_long_long, "FT_UInt64")
val FT_ULong = typedef(unsigned_long, "FT_ULong")
val FT_Int64 = typedef(long_long, "FT_Int64")

val FT_Offset = typedef(size_t, "FT_Offset")

val FT_String = typedef(charUTF8, "FT_String")

val FT_Angle = typedef(FT_Fixed, "FT_Angle")
val FT_Bytes = typedef(FT_Byte.const.p, "FT_Bytes")
val FT_Error = typedef(int, "FT_Error")
val FT_Module_Interface = typedef(FT_Pointer, "FT_Module_Interface")
val FT_Pos = typedef(long, "FT_Pos")

val BDF_PropertyType = "BDF_PropertyType".enumType
val FT_Color_Root_Transform = "FT_Color_Root_Transform".enumType
val FT_Composite_Mode = "FT_Composite_Mode".enumType
val FT_Encoding = "FT_Encoding".enumType
val FT_Glyph_BBox_Mode = "FT_Glyph_BBox_Mode".enumType
val FT_Glyph_Format = "FT_Glyph_Format".enumType
val FT_Kerning_Mode = "FT_Kerning_Mode".enumType
val FT_LcdFilter = "FT_LcdFilter".enumType
val FT_Orientation = "FT_Orientation".enumType
val FT_PaintExtend = "FT_PaintExtend".enumType
val FT_PaintFormat = "FT_PaintFormat".enumType
val FT_Pixel_Mode = "FT_Pixel_Mode".enumType
val FT_Render_Mode = "FT_Render_Mode".enumType
val FT_Sfnt_Tag = "FT_Sfnt_Tag".enumType
val FT_Size_Request_Type = "FT_Size_Request_Type".enumType
val FT_StrokerBorder = "FT_StrokerBorder".enumType
val FT_Stroker_LineCap = "FT_Stroker_LineCap".enumType
val FT_Stroker_LineJoin = "FT_Stroker_LineJoin".enumType
val FT_TrueTypeEngineType = "FT_TrueTypeEngineType".enumType
val PS_Dict_Keys = "PS_Dict_Keys".enumType

val FT_Alloc_Func = Module.FREETYPE.callback {
    void.p(
        "FT_Alloc_Func",
        "A function used to allocate {@code size} bytes from {@code memory}.",

        FT_Memory("memory", ""),
        AutoSizeResult..long("size", ""),

        nativeType = "FT_Alloc_Func"
    )
}

val FT_Free_Func = Module.FREETYPE.callback {
    void(
        "FT_Free_Func",
        "A function used to release a given block of memory.",

        FT_Memory("memory", ""),
        Unsafe..void.p("block", ""),

        nativeType = "FT_Free_Func"
    )
}

val FT_Realloc_Func = Module.FREETYPE.callback {
    void.p(
        "FT_Realloc_Func",
        "A function used to re-allocate a given block of memory.",

        FT_Memory("memory", ""),
        AutoSize("block")..long("cur_size", ""),
        AutoSizeResult..long("new_size", ""),
        nullable..void.p("block", ""),

        nativeType = "FT_Realloc_Func"
    )
}

val FT_MemoryRec_ = struct(Module.FREETYPE, "FT_Memory", nativeName = "struct FT_MemoryRec_") {
    documentation = "A structure used to describe a given memory manager to FreeType~2."

    nullable..opaque_p("user", "")
    nullable..FT_Alloc_Func("alloc", "")
    nullable..FT_Free_Func("free", "")
    nullable..FT_Realloc_Func("realloc", "")
}

val FT_StreamDesc = union(Module.FREETYPE, "FT_StreamDesc") {
    documentation = "A union type used to store either a long or a pointer. This is used to store a file descriptor or a {@code FILE*} in an input stream."

    long("value", "")
    nullable..opaque_p("pointer", "")
}

val FT_Stream_IoFunc = Module.FREETYPE.callback {
    unsigned_long(
        "FT_Stream_IoFunc",
        "A function used to seek and read data from a given input stream.",

        FT_Stream("stream", ""),
        unsigned_long("offset", ""),
        unsigned_char.p("buffer", ""),
        AutoSize("buffer")..unsigned_long("count", ""),

        nativeType = "FT_Stream_IoFunc"
    )
}

val FT_Stream_CloseFunc = Module.FREETYPE.callback {
    void(
        "FT_Stream_CloseFunc",
        "",

        FT_Stream("stream", ""),

        nativeType = "FT_Stream_CloseFunc"
    )
}

val FT_StreamRec = struct(Module.FREETYPE, "FT_Stream", nativeName = "FT_StreamRec") {
    documentation = "A structure used to describe an input stream."

    nullable..unsigned_char.p("base", "")
    AutoSize("base")..unsigned_long("size", "")
    unsigned_long("pos", "")
    FT_StreamDesc("descriptor", "")
    FT_StreamDesc("pathname", "")
    nullable..FT_Stream_IoFunc("read", "")
    nullable..FT_Stream_CloseFunc("close", "")
    nullable..FT_Memory("memory", "").private()
    nullable..unsigned_char.p("cursor", "").private()
    nullable..unsigned_char.p("limit", "").private()
}

val FT_Vector = struct(Module.FREETYPE, "FT_Vector") {
    documentation = "A simple structure used to store a 2D vector; coordinates are of the {@code FT_Pos} type."

    FT_Pos("x", "")
    FT_Pos("y", "")
}

val FT_BBox = struct(Module.FREETYPE, "FT_BBox") {
    documentation = "A structure used to hold an outline's bounding box, i.e., the coordinates of its extrema in the horizontal and vertical directions."

    FT_Pos("xMin", "")
    FT_Pos("yMin", "")
    FT_Pos("xMax", "")
    FT_Pos("yMax", "")
}

val FT_Bitmap = struct(Module.FREETYPE, "FT_Bitmap", mutable = false) {
    documentation =
        "A structure used to describe a bitmap or pixmap to the raster. Note that we now manage pixmaps of various depths through the {@code pixel_mode} field."

    unsigned_int("rows", "")
    unsigned_int("width", "")
    int("pitch", "")
    nullable..unsigned_char.p("buffer", "")
    unsigned_short("num_grays", "")
    unsigned_char("pixel_mode", "")
    unsigned_char("palette_mode", "")
    nullable..opaque_p("palette", "")
}

val FT_Outline = struct(Module.FREETYPE, "FT_Outline", mutable = false) {
    documentation = "This structure is used to describe an outline to the scan-line converter."

    AutoSize("contours")..short("n_contours", "number of contours in glyph")
    AutoSize("points", "tags")..short("n_points", "number of points in the glyph")
    FT_Vector.p("points", "the outline's points")
    char.p("tags", "the points flags")
    short.p("contours", "the contour end points")
    int("flags", "outline masks")
}

val FT_Outline_MoveToFunc = Module.FREETYPE.callback {
    int(
        "FT_Outline_MoveToFunc",
        "A function pointer type used to describe the signature of a 'move to' function during outline walking/decomposition.",

        FT_Vector.const.p("to", ""),
        nullable..opaque_p("user", ""),

        nativeType = "FT_Outline_MoveToFunc"
    )
}

val FT_Outline_LineToFunc = Module.FREETYPE.callback {
    int(
        "FT_Outline_LineToFunc",
        "A function pointer type used to describe the signature of a 'line to' function during outline walking/decomposition.",

        FT_Vector.const.p("to", ""),
        nullable..opaque_p("user", ""),

        nativeType = "FT_Outline_LineToFunc"
    )
}

val FT_Outline_ConicToFunc = Module.FREETYPE.callback {
    int(
        "FT_Outline_ConicToFunc",
        "A function pointer type used to describe the signature of a 'conic to' function during outline walking or decomposition.",

        FT_Vector.const.p("control", ""),
        FT_Vector.const.p("to", ""),
        nullable..opaque_p("user", ""),

        nativeType = "FT_Outline_ConicToFunc"
    )
}

val FT_Outline_CubicToFunc = Module.FREETYPE.callback {
    int(
        "FT_Outline_CubicToFunc",
        "A function pointer type used to describe the signature of a 'cubic to' function during outline walking or decomposition.",

        FT_Vector.const.p("control1", ""),
        FT_Vector.const.p("control2", ""),
        FT_Vector.const.p("to", ""),
        nullable..opaque_p("user", ""),

        nativeType = "FT_Outline_CubicToFunc"
    )
}

val FT_Outline_Funcs = struct(Module.FREETYPE, "FT_Outline_Funcs") {
    documentation = "A structure to hold various function pointers used during outline decomposition in order to emit segments, conic, and cubic Beziers."

    nullable..FT_Outline_MoveToFunc("move_to", "")
    nullable..FT_Outline_LineToFunc("line_to", "")
    nullable..FT_Outline_ConicToFunc("conic_to", "")
    nullable..FT_Outline_CubicToFunc("cubic_to", "")
    int("shift", "")
    FT_Pos("delta", "")
}

val FT_Span = struct(Module.FREETYPE, "FT_Span", mutable = false) {
    documentation = "A structure to model a single span of consecutive pixels when rendering an anti-aliased bitmap."

    short("x", "")
    unsigned_short("len", "")
    unsigned_char("coverage", "")
}

val FT_SpanFunc = Module.FREETYPE.callback {
    void(
        "FT_SpanFunc",
        "A function used as a call-back by the anti-aliased renderer in order to let client applications draw themselves the pixel spans on each scan line.",

        int("y", ""),
        AutoSize("spans")..int("count", ""),
        FT_Span.const.p("spans", ""),
        nullable..opaque_p("user", ""),

        nativeType = "FT_SpanFunc"
    )
}

val FT_Raster_Params = struct(Module.FREETYPE, "FT_Raster_Params") {
    documentation = "A structure to hold the parameters used by a raster's render function, passed as an argument to #Outline_Render()."

    nullable..FT_Bitmap.const.p("target", "")
    nullable..void.const.p("source", "")
    int("flags", "")
    nullable..FT_SpanFunc("gray_spans", "")
    nullable..FT_SpanFunc("black_spans", "unused").private()
    nullable.."FT_Raster_BitTest_Func".handle("bit_test", "unused").private()
    nullable.."FT_Raster_BitTest_Func".handle("bit_set", "unused").private()
    nullable..opaque_p("user", "")
    FT_BBox("clip_box", "")
}

val FT_Raster_NewFunc = Module.FREETYPE.callback {
    int(
        "FT_Raster_NewFunc",
        "A function used to create a new raster object.",

        Unsafe..nullable..void.p("memory", ""),
        Check(1)..FT_Raster.p("raster", ""),

        nativeType = "FT_Raster_NewFunc"
    )
}

val FT_Raster_DoneFunc = Module.FREETYPE.callback {
    void(
        "FT_Raster_DoneFunc",
        "A function used to destroy a given raster object.",

        FT_Raster("raster", ""),

        nativeType = "FT_Raster_DoneFunc"
    )
}

val FT_Raster_ResetFunc = Module.FREETYPE.callback {
    void(
        "FT_Raster_ResetFunc",
        """
        FreeType used to provide an area of memory called the 'render pool' available to all registered rasterizers. This was not thread safe, however, and now
        FreeType never allocates this pool.

        This function is called after a new raster object is created.
        """,

        FT_Raster("raster", ""),
        unsigned_char.p("pool_base", ""),
        AutoSize("pool_base")..unsigned_long("pool_size", ""),

        nativeType = "FT_Raster_ResetFunc"
    )
}

val FT_Raster_SetModeFunc = Module.FREETYPE.callback {
    int(
        "FT_Raster_SetModeFunc",
        """
        This function is a generic facility to change modes or attributes in a given raster. This can be used for debugging purposes, or simply
        to allow implementation-specific 'features' in a given raster module.
        """,

        FT_Raster("raster", ""),
        unsigned_long("mode", ""),
        Unsafe..void.p("args", ""),

        nativeType = "FT_Raster_SetModeFunc"
    )
}

val FT_Raster_RenderFunc = Module.FREETYPE.callback {
    int(
        "FT_Raster_RenderFunc",
        "Invoke a given raster to scan-convert a given glyph image into a target bitmap.",

        FT_Raster("raster", ""),
        FT_Raster_Params.const.p("params", ""),

        nativeType = "FT_Raster_RenderFunc"
    )
}

val FT_Raster_Funcs = struct(Module.FREETYPE, "FT_Raster_Funcs") {
    documentation = "A structure used to describe a given raster class to the library."

    FT_Glyph_Format("glyph_format", "")
    nullable..FT_Raster_NewFunc("raster_new", "")
    nullable..FT_Raster_ResetFunc("raster_reset", "")
    nullable..FT_Raster_SetModeFunc("raster_set_mode", "")
    nullable..FT_Raster_RenderFunc("raster_render", "")
    nullable..FT_Raster_DoneFunc("raster_done", "")
}

val FT_UnitVector = struct(Module.FREETYPE, "FT_UnitVector") {
    documentation = "A simple structure used to store a 2D vector unit vector. Uses {@code FT_F2Dot14} types."

    FT_F2Dot14("x", "")
    FT_F2Dot14("y", "")
}

val FT_Matrix = struct(Module.FREETYPE, "FT_Matrix") {
    documentation = "A simple structure used to store a 2x2 matrix. Coefficients are in 16.16 fixed-point format."

    FT_Fixed("xx", "")
    FT_Fixed("xy", "")
    FT_Fixed("yx", "")
    FT_Fixed("yy", "")
}

val FT_Data = struct(Module.FREETYPE, "FT_Data") {
    documentation = "Read-only binary data represented as a pointer and a length."

    FT_Byte.const.p("pointer", "")
    AutoSize("pointer")..FT_UInt("length", "")
}

val FT_Generic_Finalizer = Module.FREETYPE.callback {
    void(
        "FT_Generic_Finalizer",
        "Describe a function used to destroy the {@code client} data of any FreeType object.",

        opaque_p("object", "the address of the FreeType object that is under finalization. Its client data is accessed through its {@code generic} field."),

        nativeType = "FT_Generic_Finalizer"
    )
}

val FT_Generic = struct(Module.FREETYPE, "FT_Generic") {
    documentation =
        """
        Client applications often need to associate their own data to a variety of FreeType core objects. For example, a text layout API might
        want to associate a glyph cache to a given size object.
        """

    nullable..opaque_p("data", "")
    FT_Generic_Finalizer("finalizer", "")
}

val FT_ListNodeRec = struct(Module.FREETYPE, "FT_ListNode", nativeName = "FT_ListNodeRec", mutable = false) {
    documentation = "A structure used to hold a single list element."

    nullable..FT_ListNode("prev", "")
    nullable..FT_ListNode("next", "")
    void.p("data", "")
}

val FT_ListRec = struct(Module.FREETYPE, "FT_List", nativeName = "FT_ListRec", mutable = false) {
    documentation = "A structure used to hold a simple doubly-linked list. These are used in many parts of FreeType."

    nullable..FT_ListNode("head", "")
    nullable..FT_ListNode("tail", "")
}

val FT_Glyph_Metrics = struct(Module.FREETYPE, "FT_Glyph_Metrics", mutable = false) {
    documentation =
        """
        A structure to model the metrics of a single glyph.

        The values are expressed in 26.6 fractional pixel format; if the flag #LOAD_NO_SCALE has been used while loading the glyph, values are expressed in
        font units instead.

        ${note("""If not disabled with #LOAD_NO_HINTING, the values represent dimensions of the hinted glyph (in case hinting is applicable).""")}

        Stroking a glyph with an outside border does not increase {@code horiAdvance} or {@code vertAdvance}; you have to manually adjust these values to
        account for the added width and height.

        FreeType doesn't use the {@code VORG} table data for CFF fonts because it doesn't have an interface to quickly retrieve the glyph height. The
        y~coordinate of the vertical origin can be simply computed as {@code vertBearingY + height} after loading a glyph.
        """

    FT_Pos("width", "the glyph's width")
    FT_Pos("height", "the glyph's height")
    FT_Pos("horiBearingX", "left side bearing for horizontal layout")
    FT_Pos("horiBearingY", "top side bearing for horizontal layout")
    FT_Pos("horiAdvance", "advance width for horizontal layout")
    FT_Pos("vertBearingX", "left side bearing for vertical layout")
    FT_Pos("vertBearingY", "top side bearing for vertical layout. Larger positive values mean further below the vertical glyph origin")
    FT_Pos("vertAdvance", "advance height for vertical layout. Positive values mean the glyph has a positive advance downward")
}

val FT_Bitmap_Size = struct(Module.FREETYPE, "FT_Bitmap_Size", mutable = false) {
    documentation =
        """
        This structure models the metrics of a bitmap strike (i.e., a set of glyphs for a given point size and resolution) in a bitmap font. It
        is used for the {@code available_sizes} field of {@code FT_Face}.

        ${note("""Windows FNT: The nominal size given in a FNT font is not reliable. If the driver finds it incorrect, it sets {@code size} to some calculated
        values, and {@code x_ppem} and {@code y_ppem} to the pixel width and height given in the font, respectively.""")}

        ${note("""TrueType embedded bitmaps: {@code size}, {@code width}, and {@code height} values are not contained in the bitmap strike itself. They are
        computed from the global font parameters.""")}
        """

    FT_Short("height", "the vertical distance, in pixels, between two consecutive baselines. It is always positive.")
    FT_Short("width", "the average width, in pixels, of all glyphs in the strike")
    FT_Pos("size", "the nominal size of the strike in 26.6 fractional points. This field is not very useful.")
    FT_Pos("x_ppem", "the horizontal ppem (nominal width) in 26.6 fractional pixels")
    FT_Pos("y_ppem", "the vertical ppem (nominal height) in 26.6 fractional pixels")
}

val FT_CharMapRec = struct(Module.FREETYPE, "FT_CharMap", nativeName = "FT_CharMapRec", mutable = false) {
    documentation = "The base charmap structure."

    FT_Face("face", "a handle to the parent face object")
    FT_Encoding("encoding", "an {@code FT_Encoding} tag identifying the charmap. Use this with #Select_Charmap().")
    FT_UShort(
        "platform_id",
        """
        an ID number describing the platform for the following encoding ID. This comes directly from the TrueType specification and gets emulated for other
        formats.
        """
    )
    FT_UShort("encoding_id", "a platform-specific encoding number. This also comes from the TrueType specification and gets emulated similarly.")
}

val FT_FaceRec = struct(Module.FREETYPE, "FT_Face", nativeName = "FT_FaceRec", mutable = false) {
    documentation = "FreeType root face class structure. A face object models a typeface in a font file."

    FT_Long("num_faces", "")
    FT_Long("face_index", "")
    FT_Long("face_flags", "")
    FT_Long("style_flags", "")
    FT_Long("num_glyphs", "")
    FT_String.p("family_name", "")
    FT_String.p("style_name", "")
    AutoSize("available_sizes")..FT_Int("num_fixed_sizes", "")
    nullable..FT_Bitmap_Size.p("available_sizes", "")
    AutoSize("charmaps")..FT_Int("num_charmaps", "")
    FT_CharMap.p("charmaps", "")
    FT_Generic("generic", "")
    FT_BBox("bbox", "")
    FT_UShort("units_per_EM", "")
    FT_Short("ascender", "")
    FT_Short("descender", "")
    FT_Short("height", "")
    FT_Short("max_advance_width", "")
    FT_Short("max_advance_height", "")
    FT_Short("underline_position", "")
    FT_Short("underline_thickness", "")
    nullable..FT_GlyphSlot("glyph", "")
    nullable..FT_Size("size", "")
    nullable..FT_CharMap("charmap", "")
    nullable..FT_Driver("driver", "").private()
    nullable..FT_Memory("memory", "").private()
    nullable..FT_Stream("stream", "").private()
    FT_ListRec("sizes_list", "").private()
    FT_Generic("autohint", "").private()
    nullable..opaque_p("extensions", "").private()
    nullable..FT_Face_Internal("internal", "").private()
}

val FT_Size_Metrics = struct(Module.FREETYPE, "FT_Size_Metrics", mutable = false) {
    documentation = "The size metrics structure gives the metrics of a size object."

    FT_UShort("x_ppem", "horizontal pixels per EM")
    FT_UShort("y_ppem", "vertical pixels per EM")
    FT_Fixed("x_scale", "scaling values used to convert font")
    FT_Fixed("y_scale", "units to 26.6 fractional pixels")
    FT_Pos("ascender", "ascender in 26.6 frac. pixels")
    FT_Pos("descender", "descender in 26.6 frac. pixels")
    FT_Pos("height", "text height in 26.6 frac. pixels")
    FT_Pos("max_advance", "max horizontal advance, in 26.6 pixels")
}

val FT_SizeRec = struct(Module.FREETYPE, "FT_Size", nativeName = "FT_SizeRec") {
    documentation = "FreeType root size class structure. A size object models a face object at a given size."

    FT_Face("face", "parent face object")
    FT_Generic("generic", "generic pointer for client uses")
    FT_Size_Metrics("metrics", "size metrics")
    struct(Module.FREETYPE, "FT_Size_Internal", mutable = false) {
        nullable..opaque_p("module_data", "")
        FT_Render_Mode("autohint_mode", "")
        FT_Size_Metrics("autohint_metrics", "")
    }.p("internal", "").private()
}

val FT_GlyphSlotRec = struct(Module.FREETYPE, "FT_GlyphSlot", nativeName = "FT_GlyphSlotRec", mutable = false) {
    documentation =
        "FreeType root glyph slot class structure. A glyph slot is a container where individual glyphs can be loaded, be they in outline or bitmap format."

    FT_Library("library", "")
    FT_Face("face", "")
    nullable..FT_GlyphSlot("next", "")
    FT_UInt("glyph_index", "")
    FT_Generic("generic", "")
    FT_Glyph_Metrics("metrics", "")
    FT_Fixed("linearHoriAdvance", "")
    FT_Fixed("linearVertAdvance", "")
    FT_Vector("advance", "")
    FT_Glyph_Format("format", "")
    FT_Bitmap("bitmap", "")
    FT_Int("bitmap_left", "")
    FT_Int("bitmap_top", "")
    FT_Outline("outline", "")
    FT_UInt("num_subglyphs", "").private()
    nullable.."FT_SubGlyph".handle("subglyphs", "").private()
    nullable..void.p("control_data", "").private()
    AutoSize("control_data")..long("control_len", "").private()
    FT_Pos("lsb_delta", "")
    FT_Pos("rsb_delta", "")
    nullable..opaque_p("other", "").private()
    nullable..FT_Slot_Internal("internal", "").private()
}

val FT_Parameter = struct(Module.FREETYPE, "FT_Parameter") {
    documentation = "A simple structure to pass more or less generic parameters to #Open_Face() and #Face_Properties()."

    FT_ULong("tag", "")
    nullable..FT_Pointer("data", "")
}

val FT_Open_Args = struct(Module.FREETYPE, "FT_Open_Args") {
    documentation =
        """
        A structure to indicate how to open a new font file or stream. A pointer to such a structure can be used as a parameter for the functions
        #Open_Face() and #Attach_Stream().
        """

    FT_UInt("flags", "")
    nullable..FT_Byte.const.p("memory_base", "")
    AutoSize("memory_base")..FT_Long("memory_size", "")
    nullable..FT_String.p("pathname", "")
    nullable..FT_Stream("stream", "")
    nullable..FT_Module("driver", "")
    AutoSize("params")..FT_Int("num_params", "")
    nullable..FT_Parameter.p("params", "")
}

val FT_Size_RequestRec = struct(Module.FREETYPE, "FT_Size_Request", nativeName = "FT_Size_RequestRec") {
    documentation = "A structure to model a size request."

    FT_Size_Request_Type("type", "")
    FT_Long("width", "")
    FT_Long("height", "")
    FT_UInt("horiResolution", "")
    FT_UInt("vertResolution", "")
}

val FT_List_Iterator = Module.FREETYPE.callback {
    FT_Error(
        "FT_List_Iterator",
        "An {@code FT_List} iterator function that is called during a list parse by #List_Iterate().",

        FT_ListNode("node", ""),
        nullable..opaque_p("user", ""),

        nativeType = "FT_List_Iterator"
    )
}

val FT_List_Destructor = Module.FREETYPE.callback {
    void(
        "FT_List_Destructor",
        "An {@code FT_List} iterator function that is called during a list finalization by #List_Finalize() to destroy all elements in a given list.",

        FT_Memory("memory", ""),
        Unsafe..void.p("data", ""),
        nullable..opaque_p("user", ""),

        nativeType = "FT_List_Destructor"
    )
}

val FT_Module_Constructor = Module.FREETYPE.callback {
    FT_Error(
        "FT_Module_Constructor",
        "A function used to initialize (not create) a new module object.",

        FT_Module("module", ""),

        nativeType = "FT_Module_Constructor"
    )
}

val FT_Module_Destructor = Module.FREETYPE.callback {
    void(
        "FT_Module_Destructor",
        "A function used to finalize (not destroy) a given module object.",

        FT_Module("module", ""),

        nativeType = "FT_Module_Destructor"
    )
}

val FT_Module_Requester = Module.FREETYPE.callback {
    FT_Module_Interface(
        "FT_Module_Requester",
        "A function used to query a given module for a specific interface.",

        FT_Module("module", ""),
        charASCII.const.p("name", ""),

        nativeType = "FT_Module_Requester"
    )
}

val FT_Module_Class = struct(Module.FREETYPE, "FT_Module_Class") {
    documentation = "The module class descriptor."

    FT_ULong("module_flags", "")
    FT_Long("module_size", "")
    FT_String.const.p("module_name", "")
    FT_Fixed("module_version", "")
    FT_Fixed("module_requires", "")
    nullable..void.const.p("module_interface", "")
    nullable..FT_Module_Constructor("module_init", "")
    nullable..FT_Module_Destructor("module_done", "")
    nullable..FT_Module_Requester("get_interface", "")
}

val FT_DebugHook_Func = Module.FREETYPE.callback {
    FT_Error(
        "FT_DebugHook_Func",
        "A drop-in replacement (or rather a wrapper) for the bytecode or charstring interpreter's main loop function.",

        Unsafe..void.p("arg", ""),

        nativeType = "FT_DebugHook_Func"
    )
}

val FT_GlyphRec = struct(Module.FREETYPE, "FT_Glyph", nativeName = "FT_GlyphRec", mutable = false) {
    documentation = "The root glyph structure contains a given glyph image plus its advance width in 16.16 fixed-point format."

    FT_Library("library", "")
    "FT_Glyph_Class".opaque.const.p("clazz", "").private()
    FT_Glyph_Format("format", "")
    FT_Vector("advance", "")
}

val FT_BitmapGlyphRec = struct(Module.FREETYPE, "FT_BitmapGlyph", nativeName = "FT_BitmapGlyphRec", mutable = false) {
    documentation = "A structure used for bitmap glyph images. This really is a 'sub-class' of ##FT_Glyph."

    FT_GlyphRec("root", "")
    FT_Int("left", "")
    FT_Int("top", "")
    FT_Bitmap("bitmap", "")
}

val FT_OutlineGlyphRec = struct(Module.FREETYPE, "FT_OutlineGlyph", nativeName = "FT_OutlineGlyphRec", mutable = false) {
    documentation = "A structure used for outline (vectorial) glyph images. This really is a 'sub-class' of ##FT_Glyph."

    FT_GlyphRec("root", "")
    FT_Outline("outline", "")
}

val FT_SvgGlyphRec = struct(Module.FREETYPE, "FT_SvgGlyph", nativeName = "FT_SvgGlyphRec", mutable = false) {
    documentation = "A structure used for OT-SVG glyphs. This is a 'sub-class' of ##FT_Glyph."

    FT_GlyphRec("root", "")
    FT_Byte.p("svg_document", "")
    AutoSize("svg_document")..FT_ULong("svg_document_length", "")
    FT_UInt("glyph_index", "")
    FT_Size_Metrics("metrics", "")
    FT_UShort("units_per_EM", "")
    FT_UShort("start_glyph_id", "")
    FT_UShort("end_glyph_id", "")
    FT_Matrix("transform", "")
    FT_Vector("delta", "")
}

val FT_Prop_GlyphToScriptMap = struct(Module.FREETYPE, "FT_Prop_GlyphToScriptMap", mutable = false) {
    documentation = "The data exchange structure for the glyph -to-script-map property."

    FT_Face("face", "")
    nullable..FT_UShort.p("map", "")
}

val FT_Prop_IncreaseXHeight = struct(Module.FREETYPE, "FT_Prop_IncreaseXHeight", mutable = false) {
    documentation = "The data exchange structure for the {@code increase-x-height} property."

    FT_Face("face", "")
    FT_UInt("limit", "")
}

val PS_FontInfoRec = struct(Module.FREETYPE, "PS_FontInfo", nativeName = "PS_FontInfoRec", mutable = false) {
    documentation =
        "A structure used to model a Type~1 or Type~2 FontInfo dictionary. Note that for Multiple Master fonts, each instance has its own FontInfo dictionary."

    FT_String.p("version", "")
    FT_String.p("notice", "")
    FT_String.p("full_name", "")
    FT_String.p("family_name", "")
    FT_String.p("weight", "")
    FT_Long("italic_angle", "")
    FT_Bool("is_fixed_pitch", "")
    FT_Short("underline_position", "")
    FT_UShort("underline_thickness", "")
}

val PS_PrivateRec = struct(Module.FREETYPE, "PS_Private", nativeName = "PS_PrivateRec", mutable = false) {
    documentation =
        "A structure used to model a Type~1 or Type~2 private dictionary. Note that for Multiple Master fonts, each instance has its own Private dictionary."

    FT_Int("unique_id", "")
    FT_Int("lenIV", "")
    FT_Byte("num_blue_values", "")
    FT_Byte("num_other_blues", "")
    FT_Byte("num_family_blues", "")
    FT_Byte("num_family_other_blues", "")
    FT_Short("blue_values", "")[14]
    FT_Short("other_blues", "")[10]
    FT_Short("family_blues", "")[14]
    FT_Short("family_other_blues", "")[10]
    FT_Fixed("blue_scale", "")
    FT_Int("blue_shift", "")
    FT_Int("blue_fuzz", "")
    FT_UShort("standard_width", "")[1]
    FT_UShort("standard_height", "")[1]
    FT_Byte("num_snap_widths", "")
    FT_Byte("num_snap_heights", "")
    FT_Bool("force_bold", "")
    FT_Bool("round_stem_up", "")
    FT_Short("snap_widths", "including std width")[13]
    FT_Short("snap_heights", "including std height")[13]
    FT_Fixed("expansion_factor", "")
    FT_Long("language_group", "")
    FT_Long("password", "")
    FT_Short("min_feature", "")[2]
}

val CID_FaceDictRec = struct(Module.FREETYPE, "CID_FaceDict", nativeName = "CID_FaceDictRec", mutable = false) {
    documentation = "A structure used to represent data in a CID top-level dictionary."

    PS_PrivateRec("private_dict", "")
    FT_UInt("len_buildchar", "")
    FT_Fixed("forcebold_threshold", "")
    FT_Pos("stroke_width", "")
    FT_Fixed("expansion_factor", "")
    FT_Byte("paint_type", "")
    FT_Byte("font_type", "")
    FT_Matrix("font_matrix", "")
    FT_Vector("font_offset", "")
    FT_UInt("num_subrs", "")
    FT_ULong("subrmap_offset", "")
    FT_UInt("sd_bytes", "")
}

val CID_FaceInfoRec = struct(Module.FREETYPE, "CID_FaceInfo", nativeName = "CID_FaceInfoRec", mutable = false) {
    documentation = "A structure used to represent CID Face information."

    FT_String.p("cid_font_name", "")
    FT_Fixed("cid_version", "")
    FT_Int("cid_font_type", "")
    FT_String.p("registry", "")
    FT_String.p("ordering", "")
    FT_Int("supplement", "")
    PS_FontInfoRec("font_info", "")
    FT_BBox("font_bbox", "")
    FT_ULong("uid_base", "")
    FT_Int("num_xuid", "")
    FT_ULong("xuid", "")[16]
    FT_ULong("cidmap_offset", "")
    FT_UInt("fd_bytes", "")
    FT_UInt("gd_bytes", "")
    FT_ULong("cid_count", "")
    FT_UInt("num_dicts", "")
    CID_FaceDict("font_dicts", "")
    FT_ULong("data_offset", "")
}

val TT_Header = struct(Module.FREETYPE, "TT_Header", mutable = false) {
    documentation = "A structure to model a TrueType font header table."

    FT_Fixed("Table_Version", "")
    FT_Fixed("Font_Revision", "")
    FT_Long("CheckSum_Adjust", "")
    FT_Long("Magic_Number", "")
    FT_UShort("Flags", "")
    FT_UShort("Units_Per_EM", "")
    FT_ULong("Created", "")[2]
    FT_ULong("Modified", "")[2]
    FT_Short("xMin", "")
    FT_Short("yMin", "")
    FT_Short("xMax", "")
    FT_Short("yMax", "")
    FT_UShort("Mac_Style", "")
    FT_UShort("Lowest_Rec_PPEM", "")
    FT_Short("Font_Direction", "")
    FT_Short("Index_To_Loc_Format", "")
    FT_Short("Glyph_Data_Format", "")
}

val TT_HoriHeader = struct(Module.FREETYPE, "TT_HoriHeader", mutable = false) {
    documentation =
        "A structure to model a TrueType horizontal header, the {@code hhea} table, as well as the corresponding horizontal metrics table, {@code hmtx}."

    FT_Fixed("Version", "")
    FT_Short("Ascender", "")
    FT_Short("Descender", "")
    FT_Short("Line_Gap", "")
    FT_UShort("advance_Width_Max", "advance width maximum")
    FT_Short("min_Left_Side_Bearing", "minimum left-sb")
    FT_Short("min_Right_Side_Bearing", "minimum right-sb")
    FT_Short("xMax_Extent", "xmax extents")
    FT_Short("caret_Slope_Rise", "")
    FT_Short("caret_Slope_Run", "")
    FT_Short("caret_Offset", "")
    FT_Short("Reserved", "")[4]
    FT_Short("metric_Data_Format", "")
    FT_UShort("number_Of_HMetrics", "")
    nullable..void.p("long_metrics", "")
    nullable..void.p("short_metrics", "")
}

val TT_VertHeader = struct(Module.FREETYPE, "TT_VertHeader", mutable = false) {
    documentation =
        "A structure used to model a TrueType vertical header, the {@code vhea} table, as well as the corresponding vertical metrics table, {@code vmtx}."

    FT_Fixed("Version", "")
    FT_Short("Ascender", "")
    FT_Short("Descender", "")
    FT_Short("Line_Gap", "")
    FT_UShort("advance_Height_Max", "advance height maximum")
    FT_Short("min_Top_Side_Bearing", "minimum top-sb")
    FT_Short("min_Bottom_Side_Bearing", "minimum bottom-sb")
    FT_Short("yMax_Extent", "ymax extents")
    FT_Short("caret_Slope_Rise", "")
    FT_Short("caret_Slope_Run", "")
    FT_Short("caret_Offset", "")
    FT_Short("Reserved", "")[4]
    FT_Short("metric_Data_Format", "")
    FT_UShort("number_Of_VMetrics", "")
    nullable..void.p("long_metrics", "")
    nullable..void.p("short_metrics", "")
}

val TT_OS2 = struct(Module.FREETYPE, "TT_OS2", mutable = false) {
    documentation =
        "A structure to model a TrueType {@code OS/2} table."

    FT_UShort("version", "")
    FT_Short("xAvgCharWidth", "")
    FT_UShort("usWeightClass", "")
    FT_UShort("usWidthClass", "")
    FT_UShort("fsType", "")
    FT_Short("ySubscriptXSize", "")
    FT_Short("ySubscriptYSize", "")
    FT_Short("ySubscriptXOffset", "")
    FT_Short("ySubscriptYOffset", "")
    FT_Short("ySuperscriptXSize", "")
    FT_Short("ySuperscriptYSize", "")
    FT_Short("ySuperscriptXOffset", "")
    FT_Short("ySuperscriptYOffset", "")
    FT_Short("yStrikeoutSize", "")
    FT_Short("yStrikeoutPosition", "")
    FT_Short("sFamilyClass", "")
    FT_Byte("panose", "")[10]
    FT_ULong("ulUnicodeRange1", "")
    FT_ULong("ulUnicodeRange2", "")
    FT_ULong("ulUnicodeRange3", "")
    FT_ULong("ulUnicodeRange4", "")
    FT_Char("achVendID", "")[4]
    FT_UShort("fsSelection", "")
    FT_UShort("usFirstCharIndex", "")
    FT_UShort("usLastCharIndex", "")
    FT_Short("sTypoAscender", "")
    FT_Short("sTypoDescender", "")
    FT_Short("sTypoLineGap", "")
    FT_UShort("usWinAscent", "")
    FT_UShort("usWinDescent", "")
    FT_ULong("ulCodePageRange1", "")
    FT_ULong("ulCodePageRange2", "")
    FT_Short("sxHeight", "")
    FT_Short("sCapHeight", "")
    FT_UShort("usDefaultChar", "")
    FT_UShort("usBreakChar", "")
    FT_UShort("usMaxContext", "")
    FT_UShort("usLowerOpticalPointSize", "")
    FT_UShort("usUpperOpticalPointSize", "")
}

val TT_Postscript = struct(Module.FREETYPE, "TT_Postscript", mutable = false) {
    documentation = "A structure to model a TrueType 'post' table."

    FT_Fixed("FormatType", "")
    FT_Fixed("italicAngle", "")
    FT_Short("underlinePosition", "")
    FT_Short("underlineThickness", "")
    FT_ULong("isFixedPitch", "")
    FT_ULong("minMemType42", "")
    FT_ULong("maxMemType42", "")
    FT_ULong("minMemType1", "")
    FT_ULong("maxMemType1", "")
}

val TT_PCLT = struct(Module.FREETYPE, "TT_PCLT", mutable = false) {
    documentation = "A structure to model a TrueType {@code PCLT} table."

    FT_Fixed("Version", "")
    FT_ULong("FontNumber", "")
    FT_UShort("Pitch", "")
    FT_UShort("xHeight", "")
    FT_UShort("Style", "")
    FT_UShort("TypeFamily", "")
    FT_UShort("CapHeight", "")
    FT_UShort("SymbolSet", "")
    FT_Char("TypeFace", "")[16]
    FT_Char("CharacterComplement", "")[8]
    FT_Char("FileName", "")[6]
    FT_Char("StrokeWeight", "")
    FT_Char("WidthType", "")
    FT_Byte("SerifStyle", "")
    FT_Byte("Reserved", "")
}

val TT_MaxProfile = struct(Module.FREETYPE, "TT_MaxProfile", mutable = false) {
    documentation =
        "The maximum profile ({@code maxp}) table contains many max values, which can be used to pre-allocate arrays for speeding up glyph loading and hinting."

    FT_Fixed("version", "")
    FT_UShort("numGlyphs", "")
    FT_UShort("maxPoints", "")
    FT_UShort("maxContours", "")
    FT_UShort("maxCompositePoints", "")
    FT_UShort("maxCompositeContours", "")
    FT_UShort("maxZones", "")
    FT_UShort("maxTwilightPoints", "")
    FT_UShort("maxStorage", "")
    FT_UShort("maxFunctionDefs", "")
    FT_UShort("maxInstructionDefs", "")
    FT_UShort("maxStackElements", "")
    FT_UShort("maxSizeOfInstructions", "")
    FT_UShort("maxComponentElements", "")
    FT_UShort("maxComponentDepth", "")
}

val BDF_PropertyRec = struct(Module.FREETYPE, "BDF_Property", nativeName = "BDF_PropertyRec", mutable = false) {
    documentation = "This structure models a given BDF/PCF property."

    BDF_PropertyType("type", "")
    union {
        nullable..charASCII.const.p("atom", "")
        FT_Int32("integer", "")
        FT_UInt32("cardinal", "")
    }("u", "")
}

val FT_Color = struct(Module.FREETYPE, "FT_Color") {
    documentation = "This structure models a BGRA color value of a {@code CPAL} palette entry."

    FT_Byte("blue", "")
    FT_Byte("green", "")
    FT_Byte("red", "")
    FT_Byte("alpha", "")
}

val FT_Palette_Data = struct(Module.FREETYPE, "FT_Palette_Data", mutable = false) {
    documentation = "This structure holds the data of the {@code CPAL} table."

    AutoSize("palette_name_ids", "palette_flags")..FT_UShort("num_palettes", "")
    nullable..FT_UShort.const.p("palette_name_ids", "")
    nullable..FT_UShort.const.p("palette_flags", "")
    AutoSize("palette_entry_name_ids")..FT_UShort("num_palette_entries", "")
    nullable..FT_UShort.const.p("palette_entry_name_ids", "")
}

val FT_LayerIterator = struct(Module.FREETYPE, "FT_LayerIterator", mutable = false) {
    documentation = "This iterator object is needed for #Get_Color_Glyph_Layer()."

    FT_UInt("num_layers", "")
    FT_UInt("layer", "")
    nullable..FT_Byte.p("p", "")
}

val FT_ColorStopIterator = struct(Module.FREETYPE, "FT_ColorStopIterator", mutable = false) {
    documentation = "This iterator object is needed for #Get_Colorline_Stops()."

    FT_UInt("num_color_stops", "")
    FT_UInt("current_color_stop", "")
    nullable..FT_Byte.p("p", "")
    FT_Bool("read_variable", "")
}

val FT_ColorIndex = struct(Module.FREETYPE, "FT_ColorIndex", mutable = false) {
    documentation = "A structure representing a {@code ColorIndex} value of the {@code COLR} v1 extensions."

    FT_UInt16("palette_index", "")
    FT_F2Dot14("alpha", "")
}

val FT_ColorStop = struct(Module.FREETYPE, "FT_ColorStop", mutable = false) {
    documentation = "A structure representing a {@code ColorStop} value of the 'COLR' v1 extensions."

    FT_Fixed("stop_offset", "")
    FT_ColorIndex("color", "")
}

val FT_ColorLine = struct(Module.FREETYPE, "FT_ColorLine", mutable = false) {
    documentation = "A structure representing a {@code ColorLine} value of the {@code COLR} v1 extensions."

    FT_PaintExtend("extend", "")
    FT_ColorStopIterator("color_stop_iterator", "")
}

val FT_Affine23 = struct(Module.FREETYPE, "FT_Affine23", mutable = false) {
    documentation = "A structure used to store a 2x3 matrix. Coefficients are in 16.16 fixed-point format."

    FT_Fixed("xx", "")
    FT_Fixed("xy", "")
    FT_Fixed("dx", "")
    FT_Fixed("yx", "")
    FT_Fixed("yy", "")
    FT_Fixed("dy", "")
}

val FT_OpaquePaint = struct(Module.FREETYPE, "FT_OpaquePaint", nativeName = "FT_OpaquePaintRec", mutable = false) {
    documentation = "A structure representing an offset to a {@code Paint} value stored in any of the paint tables of a {@code COLR} v1 font."

    nullable..FT_Byte.p("p", "")
    FT_Bool("insert_root_transform", "")
}

val FT_PaintColrLayers = struct(Module.FREETYPE, "FT_PaintColrLayers", mutable = false) {
    documentation = "A structure representing a {@code PaintColrLayers} table of a {@code COLR} v1 font."

    FT_LayerIterator("layer_iterator", "")
}

val FT_PaintSolid = struct(Module.FREETYPE, "FT_PaintSolid", mutable = false) {
    documentation = "A structure representing a {@code PaintSolid} value of the {@code COLR} v1 extensions."

    FT_ColorIndex("color", "")
}

val FT_PaintLinearGradient = struct(Module.FREETYPE, "FT_PaintLinearGradient", mutable = false) {
    documentation = "A structure representing a {@code PaintLinearGradient} value of the {@code COLR} v1 extensions."

    FT_ColorLine("colorline", "")
    FT_Vector("p0", "")
    FT_Vector("p1", "")
    FT_Vector("p2", "")
}

val FT_PaintRadialGradient = struct(Module.FREETYPE, "FT_PaintRadialGradient", mutable = false) {
    documentation = "A structure representing a {@code PaintRadialGradient} value of the {@code COLR} v1 extensions."

    FT_ColorLine("colorline", "")
    FT_Vector("c0", "")
    FT_Pos("r0", "")
    FT_Vector("c1", "")
    FT_Pos("r1", "")
}

val FT_PaintSweepGradient = struct(Module.FREETYPE, "FT_PaintSweepGradient", mutable = false) {
    documentation = "A structure representing a {@code PaintSweepGradient} value of the {@code COLR} v1 extensions."

    FT_ColorLine("colorline", "")
    FT_Vector("center", "")
    FT_Fixed("start_angle", "")
    FT_Fixed("end_angle", "")
}

val FT_PaintGlyph = struct(Module.FREETYPE, "FT_PaintGlyph", mutable = false) {
    documentation = "A structure representing a {@code COLR} v1 {@code PaintGlyph} paint table."

    FT_OpaquePaint("paint", "")
    FT_UInt("glyphID", "")
}

val FT_PaintColrGlyph = struct(Module.FREETYPE, "FT_PaintColrGlyph", mutable = false) {
    documentation = "A structure representing a {@code COLR} v1 {@code PaintColorGlyph} paint table."

    FT_UInt("glyphID", "")
}

val FT_PaintTransform = struct(Module.FREETYPE, "FT_PaintTransform", mutable = false) {
    documentation = "A structure representing a {@code COLR} v1 {@code PaintTransform} paint table."

    FT_OpaquePaint("paint", "")
    FT_Affine23("affine", "")
}

val FT_PaintTranslate = struct(Module.FREETYPE, "FT_PaintTranslate", mutable = false) {
    documentation =
        "A structure representing a {@code COLR} v1 {@code PaintTranslate} paint table. Used for translating downstream paints by a given x and y~delta."

    FT_OpaquePaint("paint", "")
    FT_Fixed("dx", "")
    FT_Fixed("dy", "")
}

val FT_PaintScale = struct(Module.FREETYPE, "FT_PaintScale", mutable = false) {
    documentation = "A structure representing all of the {@code COLR} v1 {@code PaintScale*} paint tables."

    FT_OpaquePaint("paint", "")
    FT_Fixed("scale_x", "")
    FT_Fixed("scale_y", "")
    FT_Fixed("center_x", "")
    FT_Fixed("center_y", "")
}

val FT_PaintRotate = struct(Module.FREETYPE, "FT_PaintRotate", mutable = false) {
    documentation =
        "A structure representing a {@code COLR} v1 {@code PaintRotate} paint table. Used for rotating downstream paints with a given center and angle."

    FT_OpaquePaint("paint", "")
    FT_Fixed("angle", "")
    FT_Fixed("center_x", "")
    FT_Fixed("center_y", "")
}

val FT_PaintSkew = struct(Module.FREETYPE, "FT_PaintSkew", mutable = false) {
    documentation =
        "A structure representing a {@code COLR} v1 {@code PaintSkew} paint table. Used for skewing or shearing downstream paints by a given center and angle."

    FT_OpaquePaint("paint", "")
    FT_Fixed("x_skew_angle", "")
    FT_Fixed("y_skew_angle", "")
    FT_Fixed("center_x", "")
    FT_Fixed("center_y", "")
}

val FT_PaintComposite = struct(Module.FREETYPE, "FT_PaintComposite", mutable = false) {
    documentation =
        """
        A structure representing a {@code COLR} v1 {@code PaintComposite} paint table. Used for compositing two paints in a {@code COLR} v1 directed acyclic
        graph.
        """

    FT_OpaquePaint("source_paint", "")
    FT_Composite_Mode("composite_mode", "")
    FT_OpaquePaint("backdrop_paint", "")
}

val FT_COLR_Paint = struct(Module.FREETYPE, "FT_COLR_Paint", mutable = false) {
    documentation = "A union object representing format and details of a paint table of a {@code COLR} v1 font."

    FT_PaintFormat("format", "")
    union {
        FT_PaintColrLayers("colr_layers", "")
        FT_PaintGlyph("glyph", "")
        FT_PaintSolid("solid", "")
        FT_PaintLinearGradient("linear_gradient", "")
        FT_PaintRadialGradient("radial_gradient", "")
        FT_PaintSweepGradient("sweep_gradient", "")
        FT_PaintTransform("transform", "")
        FT_PaintTranslate("translate", "")
        FT_PaintScale("scale", "")
        FT_PaintRotate("rotate", "")
        FT_PaintSkew("skew", "")
        FT_PaintComposite("composite", "")
        FT_PaintColrGlyph("colr_glyph", "")
    }("u", "")
}

val FT_ClipBox = struct(Module.FREETYPE, "FT_ClipBox", mutable = false) {
    documentation = "A structure representing a {@code COLR} v1 {@code ClipBox} table."

    FT_Vector("bottom_left", "")
    FT_Vector("top_left", "")
    FT_Vector("top_right", "")
    FT_Vector("bottom_right", "")
}

val FTC_Face_Requester = Module.FREETYPE.callback {
    FT_Error(
        "FTC_Face_Requester",
        """
        A callback function provided by client applications. It is used by the cache manager to translate a given FTC _FaceID into a new valid {@code FT_Face}
        object, on demand.
        """,

        FTC_FaceID("face_id", ""),
        FT_Library("library", ""),
        FT_Pointer("req_data", ""),
        Check(1)..FT_Face.p("aface", ""),

        nativeType = "FTC_Face_Requester"
    )
}

val FTC_ScalerRec = struct(Module.FREETYPE, "FTC_Scaler", nativeName = "FTC_ScalerRec", mutable = false) {
    documentation = "A structure used to describe a given character size in either pixels or points to the cache manager. See #FTC_Manager_LookupSize()."

    FTC_FaceID("face_id", "")
    FT_UInt("width", "")
    FT_UInt("height", "")
    FT_Int("pixel", "")
    FT_UInt("x_res", "")
    FT_UInt("y_res", "")
}

val FTC_ImageTypeRec = struct(Module.FREETYPE, "FTC_ImageType", nativeName = "FTC_ImageTypeRec", mutable = false) {
    documentation = "A structure used to model the type of images in a glyph cache."

    FTC_FaceID("face_id", "")
    FT_UInt("width", "")
    FT_UInt("height", "")
    FT_Int32("flags", "")
}

val FTC_SBitRec = struct(Module.FREETYPE, "FTC_SBit", nativeName = "FTC_SBitRec", mutable = false) {
    documentation = "A very compact structure used to describe a small glyph bitmap."

    FT_Byte("width", "")
    FT_Byte("height", "")
    FT_Char("left", "")
    FT_Char("top", "")
    FT_Byte("format", "")
    FT_Byte("max_grays", "")
    FT_Short("pitch", "")
    FT_Char("xadvance", "")
    FT_Char("yadvance", "")
    FT_Byte.p("buffer", "")
}

val FT_MM_Axis = struct(Module.FREETYPE, "FT_MM_Axis", mutable = false) {
    documentation = "A structure to model a given axis in design space for Multiple Masters fonts."

    FT_String.p("name", "")
    FT_Long("minimum", "")
    FT_Long("maximum", "")
}

val FT_Multi_Master = struct(Module.FREETYPE, "FT_Multi_Master", mutable = false) {
    documentation = "A structure to model the axes and space of a Multiple Masters font."
    javaImport("static org.lwjgl.util.freetype.FreeType.*")

    FT_UInt("num_axis", "")
    FT_UInt("num_designs", "")
    FT_MM_Axis("axis", "")["T1_MAX_MM_AXIS"]
}

val FT_Var_Axis = struct(Module.FREETYPE, "FT_Var_Axis", mutable = false) {
    documentation = "A structure to model a given axis in design space for Multiple Masters, TrueType GX, and OpenType variation fonts."

    FT_String.p("name", "")
    FT_Fixed("minimum", "")
    FT_Fixed("def", "")
    FT_Fixed("maximum", "")
    FT_ULong("tag", "")
    FT_UInt("strid", "")
}

val FT_Var_Named_Style = struct(Module.FREETYPE, "FT_Var_Named_Style", mutable = false) {
    documentation = "A structure to model a named instance in a TrueType GX or OpenType variation font."

    FT_Fixed.p("coords", "")
    FT_UInt("strid", "")
    FT_UInt("psid", "")
}

val FT_MM_Var = struct(Module.FREETYPE, "FT_MM_Var", mutable = false) {
    documentation = "A structure to model the axes and space of an Adobe MM, TrueType GX, or OpenType variation font."

    AutoSize("axis")..FT_UInt("num_axis", "")
    FT_UInt("num_designs", "")
    AutoSize("namedstyle")..FT_UInt("num_namedstyles", "")
    FT_Var_Axis.p("axis", "")
    FT_Var_Named_Style.p("namedstyle", "")
}

val FT_SfntName = struct(Module.FREETYPE, "FT_SfntName", mutable = false) {
    FT_UShort("platform_id", "")
    FT_UShort("encoding_id", "")
    FT_UShort("language_id", "")
    FT_UShort("name_id", "")
    FT_Byte.p("string", "")
    AutoSize("string")..FT_UInt("string_len", "")
}

val FT_SfntLangTag = struct(Module.FREETYPE, "FT_SfntLangTag", mutable = false) {
    FT_Byte.p("string", "")
    AutoSize("string")..FT_UInt("string_len", "")
}

val FT_Incremental_MetricsRec = struct(Module.FREETYPE, "FT_Incremental_Metrics", nativeName = "FT_Incremental_MetricsRec", mutable = false) {
    documentation = "A small structure used to contain the basic glyph metrics returned by the ##FT_Incremental_GetGlyphMetricsFunc method."

    FT_Long("bearing_x", "")
    FT_Long("bearing_y", "")
    FT_Long("advance", "")
    FT_Long("advance_v", "")
}

val FT_Incremental_GetGlyphDataFunc = Module.FREETYPE.callback {
    FT_Error(
        "FT_Incremental_GetGlyphDataFunc",
        "A function called by FreeType to access a given glyph's data bytes during #Load_Glyph() or #Load_Char() if incremental loading is enabled.",

        nullable..FT_Incremental("incremental", ""),
        FT_UInt("glyph_index", ""),
        FT_Data.p("adata", ""),

        nativeType = "FT_Incremental_GetGlyphDataFunc"
    )
}

val FT_Incremental_FreeGlyphDataFunc = Module.FREETYPE.callback {
    void(
        "FT_Incremental_FreeGlyphDataFunc",
        "A function used to release the glyph data bytes returned by a successful call to ##FT_Incremental_GetGlyphDataFunc.",

        nullable..FT_Incremental("incremental", ""),
        FT_Data.p("data", ""),

        nativeType = "FT_Incremental_FreeGlyphDataFunc"
    )
}

val FT_Incremental_GetGlyphMetricsFunc = Module.FREETYPE.callback {
    FT_Error(
        "FT_Incremental_GetGlyphMetricsFunc",
        "A function used to retrieve the basic metrics of a given glyph index before accessing its data.",

        nullable..FT_Incremental("incremental", ""),
        FT_UInt("glyph_index", ""),
        FT_Bool("vertical", ""),
        FT_Incremental_MetricsRec.p("ametrics", ""),

        nativeType = "FT_Incremental_GetGlyphMetricsFunc"
    )
}

val FT_Incremental_FuncsRec = struct(Module.FREETYPE, "FT_Incremental_Funcs", nativeName = "FT_Incremental_FuncsRec") {
    documentation = "A table of functions for accessing fonts that load data incrementally. Used in ##FT_Incremental_Interface."

    FT_Incremental_GetGlyphDataFunc("get_glyph_data", "")
    FT_Incremental_FreeGlyphDataFunc("free_glyph_data", "")
    nullable..FT_Incremental_GetGlyphMetricsFunc("get_glyph_metrics", "")
}

val FT_Incremental_InterfaceRec = struct(Module.FREETYPE, "FT_Incremental_Interface", nativeName = "FT_Incremental_InterfaceRec") {
    documentation = "A structure to be used with #Open_Face() to indicate that the user wants to support incremental glyph loading."

    FT_Incremental_FuncsRec.const.p("funcs", "")
    nullable..FT_Incremental("object", "")
}

val SVG_Lib_Init_Func = Module.FREETYPE.callback {
    FT_Error(
        "SVG_Lib_Init_Func",
        "A callback that is called when the first OT-SVG glyph is rendered in the lifetime of an {@code FT_Library} object.",

        FT_Pointer.p("data_pointer", ""),

        nativeType = "SVG_Lib_Init_Func"
    )
}

val SVG_Lib_Free_Func = Module.FREETYPE.callback {
    void(
        "SVG_Lib_Free_Func",
        "A callback that is called when the {@code ot-svg} module is being freed.",

        FT_Pointer.p("data_pointer", ""),

        nativeType = "SVG_Lib_Free_Func"
    )
}

val SVG_Lib_Render_Func = Module.FREETYPE.callback {
    FT_Error(
        "SVG_Lib_Render_Func",
        "A callback that is called to render an OT-SVG glyph.",

        FT_GlyphSlot("slot", ""),
        FT_Pointer.p("data_pointer", ""),

        nativeType = "SVG_Lib_Render_Func"
    )
}

val SVG_Lib_Preset_Slot_Func = Module.FREETYPE.callback {
    FT_Error(
        "SVG_Lib_Preset_Slot_Func",
        "A callback that is called to preset the glyph slot.",

        FT_GlyphSlot("slot", ""),
        FT_Bool("cache", ""),
        FT_Pointer.p("state", ""),

        nativeType = "SVG_Lib_Preset_Slot_Func"
    )
}

val SVG_RendererHooks = struct(Module.FREETYPE, "SVG_RendererHooks") {
    documentation = "A structure that stores the four hooks needed to render OT-SVG glyphs properly."

    SVG_Lib_Init_Func("init_svg", "")
    SVG_Lib_Free_Func("free_svg", "")
    SVG_Lib_Render_Func("render_svg", "")
    SVG_Lib_Preset_Slot_Func("preset_slot", "")
}

val FT_SVG_DocumentRec = struct(Module.FREETYPE, "FT_SVG_Document", nativeName = "FT_SVG_DocumentRec", mutable = false) {
    documentation = "A structure that models one SVG document."

    FT_Byte.p("svg_document", "")
    AutoSize("svg_document")..FT_ULong("svg_document_length", "")
    FT_Size_Metrics("metrics", "")
    FT_UShort("units_per_EM", "")
    FT_UShort("start_glyph_id", "")
    FT_UShort("end_glyph_id", "")
    FT_Matrix("transform", "")
    FT_Vector("delta", "")
}
