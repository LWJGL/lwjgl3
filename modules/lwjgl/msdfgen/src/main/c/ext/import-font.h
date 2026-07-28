
#pragma once

#include "../core/Shape.h"

namespace msdfgen {

#define MSDFGEN_LEGACY_FONT_COORDINATE_SCALE (1/64.)

typedef unsigned unicode_t;

class FreetypeHandle;
class FontHandle;

class GlyphIndex {

public:
    explicit GlyphIndex(unsigned index = 0);
    unsigned getIndex() const;

private:
    unsigned index;

};

/// Global metrics of a typeface (in font units).
struct FontMetrics {
    /// The size of one EM.
    double emSize;
    /// The vertical position of the ascender and descender relative to the baseline.
    double ascenderY, descenderY;
    /// The vertical difference between consecutive baselines.
    double lineHeight;
    /// The vertical position and thickness of the underline.
    double underlineY, underlineThickness;
};

/// A structure to model a given axis of a variable font.
struct FontVariationAxis {
    /// The name of the variation axis.
    const char *name;
    /// The axis's minimum coordinate value.
    double minValue;
    /// The axis's maximum coordinate value.
    double maxValue;
    /// The axis's default coordinate value. FreeType computes meaningful default values for Adobe MM fonts.
    double defaultValue;
};

/// The scaling applied to font glyph coordinates when loading a glyph
enum FontCoordinateScaling {
    /// The coordinates are kept as the integer values native to the font file
    FONT_SCALING_NONE,
    /// The coordinates will be normalized to the em size, i.e. 1 = 1 em
    FONT_SCALING_EM_NORMALIZED,
    /// The incorrect legacy version that was in effect before version 1.12, coordinate values are divided by 64 - DO NOT USE - for backwards compatibility only
    FONT_SCALING_LEGACY
};

#ifdef MSDFGEN_DYNAMIC_FREETYPE
/// A function pointer type used for resolving FreeType library functions at runtime.
using FreetypeLoadCallback = void* (*)(const char* functionName);
/// Overrides the default dynamic FreeType load callback with a user defined one.
void setFreetypeLoadCallback(FreetypeLoadCallback callback);
/// Retrieves the current FreeType load callback.
FreetypeLoadCallback getFreetypeLoadCallback();
#endif//MSDFGEN_DYNAMIC_FREETYPE

/// Initializes the FreeType library.
FreetypeHandle *initializeFreetype();
/// Deinitializes the FreeType library.
void deinitializeFreetype(FreetypeHandle *library);

#ifdef FT_LOAD_DEFAULT // FreeType included
/// Creates a FontHandle from FT_Face that was loaded by the user. destroyFont must still be called but will not affect the FT_Face.
FontHandle *adoptFreetypeFont(FT_Face ftFace);
/// Converts the geometry of FreeType's FT_Outline to a Shape object.
FT_Error readFreetypeOutline(Shape &output, FT_Outline *outline, double scale = MSDFGEN_LEGACY_FONT_COORDINATE_SCALE);
#endif

/// Creates a FontHandle from FT_Face opaque pointer (mostly used for C-API)
FontHandle *adoptFreetypeFontRaw(void *ftFace);
/// Loads a font file and returns its handle.
FontHandle *loadFont(FreetypeHandle *library, const char *filename);
/// Loads a font from binary data and returns its handle.
FontHandle *loadFontData(FreetypeHandle *library, const byte *data, int length);
/// Unloads a font.
void destroyFont(FontHandle *font);
/// Outputs the metrics of a font.
bool getFontMetrics(FontMetrics &metrics, FontHandle *font, FontCoordinateScaling coordinateScaling = FONT_SCALING_LEGACY);
/// Outputs the width of the space and tab characters.
bool getFontWhitespaceWidth(double &spaceAdvance, double &tabAdvance, FontHandle *font, FontCoordinateScaling coordinateScaling = FONT_SCALING_LEGACY);
/// Outputs the total number of glyphs available in the font.
bool getGlyphCount(unsigned &output, FontHandle *font);
/// Outputs the glyph index corresponding to the specified Unicode character.
bool getGlyphIndex(GlyphIndex &glyphIndex, FontHandle *font, unicode_t unicode);
/// Loads the geometry of a glyph from a font.
bool loadGlyph(Shape &output, FontHandle *font, GlyphIndex glyphIndex, FontCoordinateScaling coordinateScaling, double *outAdvance = NULL);
bool loadGlyph(Shape &output, FontHandle *font, unicode_t unicode, FontCoordinateScaling coordinateScaling, double *outAdvance = NULL);
// Legacy API - FontCoordinateScaling is LEGACY
bool loadGlyph(Shape &output, FontHandle *font, GlyphIndex glyphIndex, double *outAdvance = NULL);
bool loadGlyph(Shape &output, FontHandle *font, unicode_t unicode, double *outAdvance = NULL);
/// Outputs the kerning distance adjustment between two specific glyphs.
bool getKerning(double &output, FontHandle *font, GlyphIndex glyphIndex0, GlyphIndex glyphIndex1, FontCoordinateScaling coordinateScaling = FONT_SCALING_LEGACY);
bool getKerning(double &output, FontHandle *font, unicode_t unicode0, unicode_t unicode1, FontCoordinateScaling coordinateScaling = FONT_SCALING_LEGACY);

#ifndef MSDFGEN_DISABLE_VARIABLE_FONTS
/// Sets a single variation axis of a variable font.
bool setFontVariationAxis(FreetypeHandle *library, FontHandle *font, const char *name, double coordinate);
/// Lists names and ranges of variation axes of a variable font.
bool listFontVariationAxes(std::vector<FontVariationAxis> &axes, FreetypeHandle *library, FontHandle *font);
#endif

}
