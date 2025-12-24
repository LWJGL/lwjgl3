#ifndef MSDFGEN_DYNAMIC_FREETYPE

#include "import-font.h"

#include <cstring>
#include <vector>
#include <ft2build.h>
#include FT_FREETYPE_H
#include FT_OUTLINE_H
#ifndef MSDFGEN_DISABLE_VARIABLE_FONTS
#include FT_MULTIPLE_MASTERS_H
#endif

namespace msdfgen {

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

GlyphIndex::GlyphIndex(unsigned index) : index(index) { }

unsigned GlyphIndex::getIndex() const {
    return index;
}

FreetypeHandle *initializeFreetype() {
    FreetypeHandle *handle = new FreetypeHandle;
    FT_Error error = FT_Init_FreeType(&handle->library);
    if (error) {
        delete handle;
        return NULL;
    }
    return handle;
}

void deinitializeFreetype(FreetypeHandle *library) {
    FT_Done_FreeType(library->library);
    delete library;
}

FontHandle *adoptFreetypeFontRaw(void *ftFace) {
    FontHandle *handle = new FontHandle;
    handle->face = static_cast<FT_Face>(ftFace);
    handle->ownership = false;
    return handle;
}

FontHandle *adoptFreetypeFont(FT_Face ftFace) {
    FontHandle *handle = new FontHandle;
    handle->face = ftFace;
    handle->ownership = false;
    return handle;
}

FT_Error readFreetypeOutline(Shape &output, FT_Outline *outline, double scale) {
    output.contours.clear();
    output.setYAxisOrientation(Y_UPWARD);
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
    FT_Error error = FT_Outline_Decompose(outline, &ftFunctions, &context);
    if (!output.contours.empty() && output.contours.back().edges.empty())
        output.contours.pop_back();
    return error;
}

FontHandle *loadFont(FreetypeHandle *library, const char *filename) {
    if (!library)
        return NULL;
    FontHandle *handle = new FontHandle;
    FT_Error error = FT_New_Face(library->library, filename, 0, &handle->face);
    if (error) {
        delete handle;
        return NULL;
    }
    handle->ownership = true;
    return handle;
}

FontHandle *loadFontData(FreetypeHandle *library, const byte *data, int length) {
    if (!library)
        return NULL;
    FontHandle *handle = new FontHandle;
    FT_Error error = FT_New_Memory_Face(library->library, data, length, 0, &handle->face);
    if (error) {
        delete handle;
        return NULL;
    }
    handle->ownership = true;
    return handle;
}

void destroyFont(FontHandle *font) {
    if (font->ownership)
        FT_Done_Face(font->face);
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
    double scale = getFontCoordinateScale(font->face, coordinateScaling);
    FT_Error error = FT_Load_Char(font->face, ' ', FT_LOAD_NO_SCALE);
    if (error)
        return false;
    spaceAdvance = scale*font->face->glyph->advance.x;
    error = FT_Load_Char(font->face, '\t', FT_LOAD_NO_SCALE);
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
    glyphIndex = GlyphIndex(FT_Get_Char_Index(font->face, unicode));
    return glyphIndex.getIndex() != 0;
}

bool loadGlyph(Shape &output, FontHandle *font, GlyphIndex glyphIndex, FontCoordinateScaling coordinateScaling, double *outAdvance) {
    if (!font)
        return false;
    FT_Error error = FT_Load_Glyph(font->face, glyphIndex.getIndex(), FT_LOAD_NO_SCALE);
    if (error)
        return false;
    double scale = getFontCoordinateScale(font->face, coordinateScaling);
    if (outAdvance)
        *outAdvance = scale*font->face->glyph->advance.x;
    return !readFreetypeOutline(output, &font->face->glyph->outline, scale);
}

bool loadGlyph(Shape &output, FontHandle *font, unicode_t unicode, FontCoordinateScaling coordinateScaling, double *outAdvance) {
    return loadGlyph(output, font, GlyphIndex(FT_Get_Char_Index(font->face, unicode)), coordinateScaling, outAdvance);
}

bool loadGlyph(Shape &output, FontHandle *font, GlyphIndex glyphIndex, double *outAdvance) {
    return loadGlyph(output, font, glyphIndex, FONT_SCALING_LEGACY, outAdvance);
}

bool loadGlyph(Shape &output, FontHandle *font, unicode_t unicode, double *outAdvance) {
    return loadGlyph(output, font, unicode, FONT_SCALING_LEGACY, outAdvance);
}

bool getKerning(double &output, FontHandle *font, GlyphIndex glyphIndex0, GlyphIndex glyphIndex1, FontCoordinateScaling coordinateScaling) {
    FT_Vector kerning;
    if (FT_Get_Kerning(font->face, glyphIndex0.getIndex(), glyphIndex1.getIndex(), FT_KERNING_UNSCALED, &kerning)) {
        output = 0;
        return false;
    }
    output = getFontCoordinateScale(font->face, coordinateScaling)*kerning.x;
    return true;
}

bool getKerning(double &output, FontHandle *font, unicode_t unicode0, unicode_t unicode1, FontCoordinateScaling coordinateScaling) {
    return getKerning(output, font, GlyphIndex(FT_Get_Char_Index(font->face, unicode0)), GlyphIndex(FT_Get_Char_Index(font->face, unicode1)), coordinateScaling);
}

#ifndef MSDFGEN_DISABLE_VARIABLE_FONTS

bool setFontVariationAxis(FreetypeHandle *library, FontHandle *font, const char *name, double coordinate) {
    bool success = false;
    if (font->face->face_flags&FT_FACE_FLAG_MULTIPLE_MASTERS) {
        FT_MM_Var *master = NULL;
        if (FT_Get_MM_Var(font->face, &master))
            return false;
        if (master && master->num_axis) {
            std::vector<FT_Fixed> coords(master->num_axis);
            if (!FT_Get_Var_Design_Coordinates(font->face, FT_UInt(coords.size()), &coords[0])) {
                for (FT_UInt i = 0; i < master->num_axis; ++i) {
                    if (!strcmp(name, master->axis[i].name)) {
                        coords[i] = DOUBLE_TO_F16DOT16(coordinate);
                        success = true;
                        break;
                    }
                }
            }
            if (FT_Set_Var_Design_Coordinates(font->face, FT_UInt(coords.size()), &coords[0]))
                success = false;
        }
        FT_Done_MM_Var(library->library, master);
    }
    return success;
}

bool listFontVariationAxes(std::vector<FontVariationAxis> &axes, FreetypeHandle *library, FontHandle *font) {
    if (font->face->face_flags&FT_FACE_FLAG_MULTIPLE_MASTERS) {
        FT_MM_Var *master = NULL;
        if (FT_Get_MM_Var(font->face, &master))
            return false;
        axes.resize(master->num_axis);
        for (FT_UInt i = 0; i < master->num_axis; ++i) {
            FontVariationAxis &axis = axes[i];
            axis.name = master->axis[i].name;
            axis.minValue = F16DOT16_TO_DOUBLE(master->axis[i].minimum);
            axis.maxValue = F16DOT16_TO_DOUBLE(master->axis[i].maximum);
            axis.defaultValue = F16DOT16_TO_DOUBLE(master->axis[i].def);
        }
        FT_Done_MM_Var(library->library, master);
        return true;
    }
    return false;
}

#endif

}

#endif//MSDFGEN_DYNAMIC_FREETYPE
