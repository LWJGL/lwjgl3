/**
 * This implementation of the msdfgen font importer offers exactly the same API
 * but doesn't need to be statically linked against FreeType. This is especially
 * useful if you want to use the msdfgen FreeType integration in a very portable
 * environment like Java (JNI) or C# (P/Invoke).
 */

#ifdef MSDFGEN_DYNAMIC_FREETYPE

#include "import-font.h"
#include "freetype-loader.h"

#include <cstring>
#include <vector>

#define FT_FACE_FLAG_MULTIPLE_MASTERS (1L << 8)
#define FT_LOAD_NO_SCALE 1L
#define FT_KERNING_UNSCALED 2

namespace msdfgen {

// Minimum FreeType2 ABI used by msdfgen rebuilt from the FreeType headers
namespace {
    using FT_Byte = unsigned char;
    using FT_Short = signed short;
    using FT_UShort = unsigned short;
    using FT_Int = signed int;
    using FT_Int32 = signed int;
    using FT_UInt = unsigned int;
    using FT_Long = signed long;
    using FT_ULong = unsigned long;
    using FT_String = char;
    using FT_Pos = signed long;
    using FT_Fixed = signed long;
    using FT_Face = struct FT_FaceRec*;
    using FT_Library = void*;
    using FT_Encoding = int;
    using FT_CharMap = struct FT_CharMapRec*;
    using FT_Generic_Finalizer = void (*)(void* object);
    using FT_GlyphSlot = struct FT_GlyphSlotRec*;
    using FT_Size = struct FT_SizeRec*;
    using FT_Glyph_Format = int;
    using FT_SubGlyph = void*;
    using FT_Slot_Internal = void*;
    using FT_Face_Internal = void*;
    using FT_Size_Internal = void*;
    using FT_ListNode = struct FT_ListNodeRec*;
    using FT_Error = int;
    // Types we don't need to know the implementation for
    using FT_Driver = void*;
    using FT_Memory = void*;
    using FT_Stream = void*;

    struct FT_Vector {
        FT_Pos x;
        FT_Pos y;
    };

    using FT_Outline_MoveToFunc = int (*)(const FT_Vector* to, void* user);
    using FT_Outline_LineToFunc = int (*)(const FT_Vector* to, void* user);
    using FT_Outline_ConicToFunc = int (*)(const FT_Vector* control, const FT_Vector* to, void* user);
    using FT_Outline_CubicToFunc = int (*)(const FT_Vector* control1, const FT_Vector* control2, const FT_Vector* to, void* user);

    struct FT_Bitmap_Size {
        FT_Short height;
        FT_Short width;
        FT_Pos size;
        FT_Pos x_ppem;
        FT_Pos y_ppem;
    };

    struct FT_CharMapRec {
        FT_Face face;
        FT_Encoding encoding;
        FT_UShort platform_id;
        FT_UShort encoding_id;
    };

    struct FT_Generic {
        void* data;
        FT_Generic_Finalizer finalizer;
    };

    struct FT_BBox {
        FT_Pos xMin, yMin;
        FT_Pos xMax, yMax;
    };

    struct FT_Glyph_Metrics {
        FT_Pos width;
        FT_Pos height;
        FT_Pos horiBearingX;
        FT_Pos horiBearingY;
        FT_Pos horiAdvance;
        FT_Pos vertBearingX;
        FT_Pos vertBearingY;
        FT_Pos vertAdvance;
    };

    struct FT_Bitmap {
        unsigned int rows;
        unsigned int width;
        int pitch;
        unsigned char* buffer;
        unsigned short num_grays;
        unsigned char pixel_mode;
        unsigned char palette_mode;
        void* palette;
    };

    struct FT_Outline {
        short n_contours;
        short n_points;
        FT_Vector* points;
        char* tags;
        short* contours;
        int flags;
    };

    struct FT_GlyphSlotRec {
        FT_Library library;
        FT_Face face;
        FT_GlyphSlot next;
        FT_UInt glyph_index;
        FT_Generic generic;
        FT_Glyph_Metrics metrics;
        FT_Fixed linearHoriAdvance;
        FT_Fixed linearVertAdvance;
        FT_Vector advance;
        FT_Glyph_Format format;
        FT_Bitmap bitmap;
        FT_Int bitmap_left;
        FT_Int bitmap_top;
        FT_Outline outline;
        FT_UInt num_subglyphs;
        FT_SubGlyph subglyphs;
        void* control_data;
        long control_len;
        FT_Pos lsb_delta;
        FT_Pos rsb_delta;
        void* other;
        FT_Slot_Internal internal;
    };

    struct FT_Size_Metrics {
        FT_UShort x_ppem;
        FT_UShort y_ppem;
        FT_Fixed x_scale;
        FT_Fixed y_scale;
        FT_Pos ascender;
        FT_Pos descender;
        FT_Pos height;
        FT_Pos max_advance;
    };

    struct FT_SizeRec {
        FT_Face face;
        FT_Generic generic;
        FT_Size_Metrics metrics;
        FT_Size_Internal internal;
    };

    struct FT_ListNodeRec {
        FT_ListNode prev;
        FT_ListNode next;
        void* data;
    };

    struct FT_ListRec {
        FT_ListNode head;
        FT_ListNode tail;
    };

    struct FT_FaceRec {
        FT_Long num_faces;
        FT_Long face_index;
        FT_Long face_flags;
        FT_Long style_flags;
        FT_Long num_glyphs;
        FT_String* family_name;
        FT_String* style_name;
        FT_Int num_fixed_sizes;
        FT_Bitmap_Size* available_sizes;
        FT_Int num_charmaps;
        FT_CharMap* charmaps;
        FT_Generic generic;
        FT_BBox bbox;
        FT_UShort units_per_EM;
        FT_Short ascender;
        FT_Short descender;
        FT_Short height;
        FT_Short max_advance_width;
        FT_Short max_advance_height;
        FT_Short underline_position;
        FT_Short underline_thickness;
        FT_GlyphSlot glyph;
        FT_Size size;
        FT_CharMap charmap;
        FT_Driver driver;
        FT_Memory memory;
        FT_Stream stream;
        FT_ListRec sizes_list;
        FT_Generic autohint;
        void* extensions;
        FT_Face_Internal internal;
    };

    struct FT_Outline_Funcs {
        FT_Outline_MoveToFunc move_to;
        FT_Outline_LineToFunc line_to;
        FT_Outline_ConicToFunc conic_to;
        FT_Outline_CubicToFunc cubic_to;
        int shift;
        FT_Pos delta;
    };

    struct FT_Var_Axis {
        FT_String* name;
        FT_Fixed minimum;
        FT_Fixed def;
        FT_Fixed maximum;
        FT_ULong tag;
        FT_UInt strid;
    };

    struct FT_Var_Named_Style {
        FT_Fixed* coords;
        FT_UInt strid;
        FT_UInt psid;
    };

    struct FT_MM_Var {
        FT_UInt num_axis;
        FT_UInt num_designs;
        FT_UInt num_namedstyles;
        FT_Var_Axis* axis;
        FT_Var_Named_Style* namedstyle;
    };
}

#define F16DOT16_TO_DOUBLE(x) (1/65536.*double(x))
#define DOUBLE_TO_F16DOT16(x) FT_Fixed(65536.*x)

class FreetypeHandle {
    friend FreetypeHandle *initializeFreetype();
    friend void deinitializeFreetype(FreetypeHandle *library);
    friend FontHandle *loadFont(FreetypeHandle *library, const char *filename);
    friend FontHandle *loadFontData(FreetypeHandle *library, const byte *data, int length);
#ifndef MSDFGEN_DISABLE_VARIABLE_FONTS
    friend bool setFontVariationAxis(FreetypeHandle *library, FontHandle *font, const char *name, double coordinate);
    friend bool listFontVariationAxes(std::vector<FontVariationAxis> &axes, FreetypeHandle *library, FontHandle *font);
#endif

    FT_Library library;

};

class FontHandle {
    friend FontHandle *adoptFreetypeFontRaw(void *ftFace);
    friend FontHandle *adoptFreetypeFont(FT_Face ftFace);
    friend FontHandle *loadFont(FreetypeHandle *library, const char *filename);
    friend FontHandle *loadFontData(FreetypeHandle *library, const byte *data, int length);
    friend void destroyFont(FontHandle *font);
    friend bool getFontMetrics(FontMetrics &metrics, FontHandle *font, FontCoordinateScaling coordinateScaling);
    friend bool getFontWhitespaceWidth(double &spaceAdvance, double &tabAdvance, FontHandle *font, FontCoordinateScaling coordinateScaling);
    friend bool getGlyphCount(unsigned &output, FontHandle *font);
    friend bool getGlyphIndex(GlyphIndex &glyphIndex, FontHandle *font, unicode_t unicode);
    friend bool loadGlyph(Shape &output, FontHandle *font, GlyphIndex glyphIndex, FontCoordinateScaling coordinateScaling, double *outAdvance);
    friend bool loadGlyph(Shape &output, FontHandle *font, unicode_t unicode, FontCoordinateScaling coordinateScaling, double *outAdvance);
    friend bool getKerning(double &output, FontHandle *font, GlyphIndex glyphIndex0, GlyphIndex glyphIndex1, FontCoordinateScaling coordinateScaling);
    friend bool getKerning(double &output, FontHandle *font, unicode_t unicode0, unicode_t unicode1, FontCoordinateScaling coordinateScaling);
#ifndef MSDFGEN_DISABLE_VARIABLE_FONTS
    friend bool setFontVariationAxis(FreetypeHandle *library, FontHandle *font, const char *name, double coordinate);
    friend bool listFontVariationAxes(std::vector<FontVariationAxis> &axes, FreetypeHandle *library, FontHandle *font);
#endif

    FT_Face face;
    bool ownership;

};

struct FtContext {
    double scale;
    Point2 position;
    Shape *shape;
    Contour *contour;
};

static Point2 ftPoint2(const FT_Vector &vector, double scale) {
    return Point2(scale*vector.x, scale*vector.y);
}

static int ftMoveTo(const FT_Vector *to, void *user) {
    FtContext *context = static_cast<FtContext *>(user);
    if (!(context->contour && context->contour->edges.empty()))
        context->contour = &context->shape->addContour();
    context->position = ftPoint2(*to, context->scale);
    return 0;
}

static int ftLineTo(const FT_Vector *to, void *user) {
    FtContext *context = static_cast<FtContext *>(user);
    Point2 endpoint = ftPoint2(*to, context->scale);
    if (endpoint != context->position) {
        context->contour->addEdge(EdgeHolder(context->position, endpoint));
        context->position = endpoint;
    }
    return 0;
}

static int ftConicTo(const FT_Vector *control, const FT_Vector *to, void *user) {
    FtContext *context = static_cast<FtContext *>(user);
    Point2 endpoint = ftPoint2(*to, context->scale);
    if (endpoint != context->position) {
        context->contour->addEdge(EdgeHolder(context->position, ftPoint2(*control, context->scale), endpoint));
        context->position = endpoint;
    }
    return 0;
}

static int ftCubicTo(const FT_Vector *control1, const FT_Vector *control2, const FT_Vector *to, void *user) {
    FtContext *context = static_cast<FtContext *>(user);
    Point2 endpoint = ftPoint2(*to, context->scale);
    if (endpoint != context->position || crossProduct(ftPoint2(*control1, context->scale)-endpoint, ftPoint2(*control2, context->scale)-endpoint)) {
        context->contour->addEdge(EdgeHolder(context->position, ftPoint2(*control1, context->scale), ftPoint2(*control2, context->scale), endpoint));
        context->position = endpoint;
    }
    return 0;
}

static double getFontCoordinateScale(const FT_Face &face, FontCoordinateScaling coordinateScaling) {
    switch (coordinateScaling) {
        case FONT_SCALING_NONE:
            return 1;
        case FONT_SCALING_EM_NORMALIZED:
            return 1./(face->units_per_EM ? face->units_per_EM : 1);
        case FONT_SCALING_LEGACY:
            return MSDFGEN_LEGACY_FONT_COORDINATE_SCALE;
    }
    return 1;
}

// -------------------- Begin runtime loader code --------------------

namespace {
    using FT_Init_FreeType_Ptr = FT_Error (*)(FT_Library* library);
    using FT_Done_FreeType_Ptr = FT_Error (*)(FT_Library library);
    using FT_Outline_Decompose_Ptr = FT_Error (*)(FT_Outline* outline, const FT_Outline_Funcs* funcs, void* user);
    using FT_New_Face_Ptr = FT_Error (*)(FT_Library library, const char* filePath, FT_Long faceIndex, FT_Face* face);
    using FT_New_Memory_Face_Ptr = FT_Error (*)(FT_Library library, const FT_Byte* base, FT_Long size, FT_Long faceIndex, FT_Face* face);
    using FT_Done_Face_Ptr = FT_Error (*)(FT_Face face);
    using FT_Load_Char_Ptr = FT_Error (*)(FT_Face face, FT_ULong charCode, FT_Int32 loadFlags);
    using FT_Get_Char_Index_Ptr = FT_Error (*)(FT_Face face, FT_ULong charCode);
    using FT_Load_Glyph_Ptr = FT_Error (*)(FT_Face face, FT_UInt glyphIndex, FT_Int32 loadFlags);
    using FT_Get_Kerning_Ptr = FT_Error (*)(FT_Face face, FT_UInt left, FT_UInt right, FT_UInt kernMode, FT_Vector* kerning);
    using FT_Get_MM_Var_Ptr = FT_Error (*)(FT_Face face, FT_MM_Var** master);
    using FT_Get_Var_Design_Coordinates_Ptr = FT_Error (*)(FT_Face face, FT_UInt numCoords, FT_Fixed* coords);
    using FT_Set_Var_Design_Coordinates_Ptr = FT_Error (*)(FT_Face face, FT_UInt numCoords, FT_Fixed* coords);
    using FT_Done_MM_Var_Ptr = FT_Error (*)(FT_Library library, FT_MM_Var* master);

    struct FreetypeFunctions {
        bool loaded;
        FT_Init_FreeType_Ptr FT_Init_FreeType;
        FT_Done_FreeType_Ptr FT_Done_FreeType;
        FT_Outline_Decompose_Ptr FT_Outline_Decompose;
        FT_New_Face_Ptr FT_New_Face;
        FT_New_Memory_Face_Ptr FT_New_Memory_Face;
        FT_Done_Face_Ptr FT_Done_Face;
        FT_Load_Char_Ptr FT_Load_Char;
        FT_Get_Char_Index_Ptr FT_Get_Char_Index;
        FT_Load_Glyph_Ptr FT_Load_Glyph;
        FT_Get_Kerning_Ptr FT_Get_Kerning;
        FT_Get_MM_Var_Ptr FT_Get_MM_Var;
        FT_Get_Var_Design_Coordinates_Ptr FT_Get_Var_Design_Coordinates;
        FT_Set_Var_Design_Coordinates_Ptr FT_Set_Var_Design_Coordinates;
        FT_Done_MM_Var_Ptr FT_Done_MM_Var;
    };

    FreetypeLoadCallback g_loadCallback = &loadFreetypeFunction;
    FreetypeFunctions g_freetype {};

#define MSDFGEN_LOAD_FT_FUNCTION(n) g_freetype.n = reinterpret_cast<n##_Ptr>(g_loadCallback(#n))

    void ensureFunctionsLoaded() {
        if(g_freetype.loaded) {
            return; // Skip loading functions if we already did that at some point
        }
        MSDFGEN_LOAD_FT_FUNCTION(FT_Init_FreeType);
        MSDFGEN_LOAD_FT_FUNCTION(FT_Done_FreeType);
        MSDFGEN_LOAD_FT_FUNCTION(FT_Outline_Decompose);
        MSDFGEN_LOAD_FT_FUNCTION(FT_New_Face);
        MSDFGEN_LOAD_FT_FUNCTION(FT_New_Memory_Face);
        MSDFGEN_LOAD_FT_FUNCTION(FT_Done_Face);
        MSDFGEN_LOAD_FT_FUNCTION(FT_Load_Char);
        MSDFGEN_LOAD_FT_FUNCTION(FT_Get_Char_Index);
        MSDFGEN_LOAD_FT_FUNCTION(FT_Load_Glyph);
        MSDFGEN_LOAD_FT_FUNCTION(FT_Get_Kerning);
        MSDFGEN_LOAD_FT_FUNCTION(FT_Get_MM_Var);
        MSDFGEN_LOAD_FT_FUNCTION(FT_Get_Var_Design_Coordinates);
        MSDFGEN_LOAD_FT_FUNCTION(FT_Set_Var_Design_Coordinates);
        MSDFGEN_LOAD_FT_FUNCTION(FT_Done_MM_Var);
        g_freetype.loaded = true;
    }

#undef MSDFGEN_LOAD_FT_FUNCTION
}

void setFreetypeLoadCallback(const FreetypeLoadCallback callback) {
    g_loadCallback = callback;
}

FreetypeLoadCallback getFreetypeLoadCallback() {
    return g_loadCallback;
}

// -------------------- End runtime loader code --------------------

GlyphIndex::GlyphIndex(unsigned index) : index(index) { }

unsigned GlyphIndex::getIndex() const {
    return index;
}

FreetypeHandle *initializeFreetype() {
    ensureFunctionsLoaded();
    FreetypeHandle *handle = new FreetypeHandle;
    FT_Error error = g_freetype.FT_Init_FreeType(&handle->library);
    if (error) {
        delete handle;
        return NULL;
    }
    return handle;
}

void deinitializeFreetype(FreetypeHandle *library) {
    ensureFunctionsLoaded();
    g_freetype.FT_Done_FreeType(library->library);
    delete library;
}

FontHandle *adoptFreetypeFontRaw(void *ftFace) {
    ensureFunctionsLoaded();
    FontHandle *handle = new FontHandle;
    handle->face = static_cast<FT_Face>(ftFace);
    handle->ownership = false;
    return handle;
}

FontHandle *adoptFreetypeFont(FT_Face ftFace) {
    ensureFunctionsLoaded();
    FontHandle *handle = new FontHandle;
    handle->face = ftFace;
    handle->ownership = false;
    return handle;
}

FT_Error readFreetypeOutline(Shape &output, FT_Outline *outline, double scale) {
    ensureFunctionsLoaded();
    output.contours.clear();
    output.inverseYAxis = false;
    FtContext context = { };
    context.scale = scale;
    context.shape = &output;
    FT_Outline_Funcs ftFunctions;
    ftFunctions.move_to = &ftMoveTo;
    ftFunctions.line_to = &ftLineTo;
    ftFunctions.conic_to = &ftConicTo;
    ftFunctions.cubic_to = &ftCubicTo;
    ftFunctions.shift = 0;
    ftFunctions.delta = 0;
    FT_Error error = g_freetype.FT_Outline_Decompose(outline, &ftFunctions, &context);
    if (!output.contours.empty() && output.contours.back().edges.empty())
        output.contours.pop_back();
    return error;
}

FontHandle *loadFont(FreetypeHandle *library, const char *filename) {
    ensureFunctionsLoaded();
    if (!library)
        return NULL;
    FontHandle *handle = new FontHandle;
    FT_Error error = g_freetype.FT_New_Face(library->library, filename, 0, &handle->face);
    if (error) {
        delete handle;
        return NULL;
    }
    handle->ownership = true;
    return handle;
}

FontHandle *loadFontData(FreetypeHandle *library, const byte *data, int length) {
    ensureFunctionsLoaded();
    if (!library)
        return NULL;
    FontHandle *handle = new FontHandle;
    FT_Error error = g_freetype.FT_New_Memory_Face(library->library, data, length, 0, &handle->face);
    if (error) {
        delete handle;
        return NULL;
    }
    handle->ownership = true;
    return handle;
}

void destroyFont(FontHandle *font) {
    ensureFunctionsLoaded();
    if (font->ownership)
        g_freetype.FT_Done_Face(font->face);
    delete font;
}

bool getFontMetrics(FontMetrics &metrics, FontHandle *font, FontCoordinateScaling coordinateScaling) {
    double scale = getFontCoordinateScale(font->face, coordinateScaling);
    metrics.emSize = scale*font->face->units_per_EM;
    metrics.ascenderY = scale*font->face->ascender;
    metrics.descenderY = scale*font->face->descender;
    metrics.lineHeight = scale*font->face->height;
    metrics.underlineY = scale*font->face->underline_position;
    metrics.underlineThickness = scale*font->face->underline_thickness;
    return true;
}

bool getFontWhitespaceWidth(double &spaceAdvance, double &tabAdvance, FontHandle *font, FontCoordinateScaling coordinateScaling) {
    ensureFunctionsLoaded();
    double scale = getFontCoordinateScale(font->face, coordinateScaling);
    FT_Error error = g_freetype.FT_Load_Char(font->face, ' ', FT_LOAD_NO_SCALE);
    if (error)
        return false;
    spaceAdvance = scale*font->face->glyph->advance.x;
    error = g_freetype.FT_Load_Char(font->face, '\t', FT_LOAD_NO_SCALE);
    if (error)
        return false;
    tabAdvance = scale*font->face->glyph->advance.x;
    return true;
}

bool getGlyphCount(unsigned &output, FontHandle *font) {
    output = (unsigned) font->face->num_glyphs;
    return true;
}

bool getGlyphIndex(GlyphIndex &glyphIndex, FontHandle *font, unicode_t unicode) {
    ensureFunctionsLoaded();
    glyphIndex = GlyphIndex(g_freetype.FT_Get_Char_Index(font->face, unicode));
    return glyphIndex.getIndex() != 0;
}

bool loadGlyph(Shape &output, FontHandle *font, GlyphIndex glyphIndex, FontCoordinateScaling coordinateScaling, double *outAdvance) {
    ensureFunctionsLoaded();
    if (!font)
        return false;
    FT_Error error = g_freetype.FT_Load_Glyph(font->face, glyphIndex.getIndex(), FT_LOAD_NO_SCALE);
    if (error)
        return false;
    double scale = getFontCoordinateScale(font->face, coordinateScaling);
    if (outAdvance)
        *outAdvance = scale*font->face->glyph->advance.x;
    return !readFreetypeOutline(output, &font->face->glyph->outline, scale);
}

bool loadGlyph(Shape &output, FontHandle *font, unicode_t unicode, FontCoordinateScaling coordinateScaling, double *outAdvance) {
    ensureFunctionsLoaded();
    return loadGlyph(output, font, GlyphIndex(g_freetype.FT_Get_Char_Index(font->face, unicode)), coordinateScaling, outAdvance);
}

bool loadGlyph(Shape &output, FontHandle *font, GlyphIndex glyphIndex, double *outAdvance) {
    return loadGlyph(output, font, glyphIndex, FONT_SCALING_LEGACY, outAdvance);
}

bool loadGlyph(Shape &output, FontHandle *font, unicode_t unicode, double *outAdvance) {
    return loadGlyph(output, font, unicode, FONT_SCALING_LEGACY, outAdvance);
}

bool getKerning(double &output, FontHandle *font, GlyphIndex glyphIndex0, GlyphIndex glyphIndex1, FontCoordinateScaling coordinateScaling) {
    ensureFunctionsLoaded();
    FT_Vector kerning;
    if (g_freetype.FT_Get_Kerning(font->face, glyphIndex0.getIndex(), glyphIndex1.getIndex(), FT_KERNING_UNSCALED, &kerning)) {
        output = 0;
        return false;
    }
    output = getFontCoordinateScale(font->face, coordinateScaling)*kerning.x;
    return true;
}

bool getKerning(double &output, FontHandle *font, unicode_t unicode0, unicode_t unicode1, FontCoordinateScaling coordinateScaling) {
    ensureFunctionsLoaded();
    return getKerning(output, font, GlyphIndex(g_freetype.FT_Get_Char_Index(font->face, unicode0)), GlyphIndex(g_freetype.FT_Get_Char_Index(font->face, unicode1)), coordinateScaling);
}

#ifndef MSDFGEN_DISABLE_VARIABLE_FONTS

bool setFontVariationAxis(FreetypeHandle *library, FontHandle *font, const char *name, double coordinate) {
    ensureFunctionsLoaded();
    bool success = false;
    if (font->face->face_flags&FT_FACE_FLAG_MULTIPLE_MASTERS) {
        FT_MM_Var *master = NULL;
        if (g_freetype.FT_Get_MM_Var(font->face, &master))
            return false;
        if (master && master->num_axis) {
            std::vector<FT_Fixed> coords(master->num_axis);
            if (!g_freetype.FT_Get_Var_Design_Coordinates(font->face, FT_UInt(coords.size()), &coords[0])) {
                for (FT_UInt i = 0; i < master->num_axis; ++i) {
                    if (!strcmp(name, master->axis[i].name)) {
                        coords[i] = DOUBLE_TO_F16DOT16(coordinate);
                        success = true;
                        break;
                    }
                }
            }
            if (g_freetype.FT_Set_Var_Design_Coordinates(font->face, FT_UInt(coords.size()), &coords[0]))
                success = false;
        }
        g_freetype.FT_Done_MM_Var(library->library, master);
    }
    return success;
}

bool listFontVariationAxes(std::vector<FontVariationAxis> &axes, FreetypeHandle *library, FontHandle *font) {
    ensureFunctionsLoaded();
    if (font->face->face_flags&FT_FACE_FLAG_MULTIPLE_MASTERS) {
        FT_MM_Var *master = NULL;
        if (g_freetype.FT_Get_MM_Var(font->face, &master))
            return false;
        axes.resize(master->num_axis);
        for (FT_UInt i = 0; i < master->num_axis; ++i) {
            FontVariationAxis &axis = axes[i];
            axis.name = master->axis[i].name;
            axis.minValue = F16DOT16_TO_DOUBLE(master->axis[i].minimum);
            axis.maxValue = F16DOT16_TO_DOUBLE(master->axis[i].maximum);
            axis.defaultValue = F16DOT16_TO_DOUBLE(master->axis[i].def);
        }
        g_freetype.FT_Done_MM_Var(library->library, master);
        return true;
    }
    return false;
}

#endif

}

#endif//MSDFGEN_DYNAMIC_FREETYPE
