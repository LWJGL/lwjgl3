/*
* MULTI-CHANNEL SIGNED DISTANCE FIELD GENERATOR
 * ---------------------------------------------
 * A utility by Viktor Chlumsky, (c) 2014 - 2024
 *
 * The technique used to generate multi-channel distance fields in this code
 * has been developed by Viktor Chlumsky in 2014 for his master's thesis,
 * "Shape Decomposition for Multi-Channel Distance Fields". It provides improved
 * quality of sharp corners in glyphs and other 2D shapes compared to monochrome
 * distance fields. To reconstruct an image of the shape, apply the median of
 * three operation on the triplet of sampled signed distance values.
 *
 */

#include "msdfgen-ext-c.h"
#include "import-font.h"

/*
 * A C-API modeled closely after the msdfgen C++ API
 * to allow C-programs and other language runtimes to
 * use the msdfgen library. Originally written for LWJGL.
 *
 * @since 11/05/2024
 * @author Alexander Hinze
 */

extern "C" {

MSDF_API int msdf_ft_set_load_callback(msdf_ft_load_callback callback) {
    if(callback == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    msdfgen::setFreetypeLoadCallback(callback);
    return MSDF_SUCCESS;
}

MSDF_API msdf_ft_load_callback msdf_ft_get_load_callback() {
    return msdfgen::getFreetypeLoadCallback();
}

MSDF_API int msdf_ft_init(msdf_ft_handle* handle) {
    if(handle == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    *handle = reinterpret_cast<msdf_ft_handle>(msdfgen::initializeFreetype());
    return MSDF_SUCCESS;
}

int msdf_ft_adopt_font(void* face, msdf_ft_font_handle* font) {
    if(face == nullptr || font == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    *font = reinterpret_cast<msdf_ft_font_handle>(msdfgen::adoptFreetypeFontRaw(face));
    return MSDF_SUCCESS;
}

MSDF_API int msdf_ft_load_font(msdf_ft_handle handle, const char* filename, msdf_ft_font_handle* font) {
    if(handle == nullptr || filename == nullptr || font == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    *font = reinterpret_cast<msdf_ft_font_handle>(msdfgen::loadFont(reinterpret_cast<msdfgen::FreetypeHandle*>(handle), filename));
    return MSDF_SUCCESS;
}

MSDF_API int msdf_ft_load_font_data(msdf_ft_handle handle, const void* data, const size_t size, msdf_ft_font_handle* font) {
    if(handle == nullptr || data == nullptr || font == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    *font = reinterpret_cast<msdf_ft_font_handle>(msdfgen::loadFontData(reinterpret_cast<msdfgen::FreetypeHandle*>(handle),
                                                                        static_cast<const msdfgen::byte*>(data), static_cast<int>(size)));
    return MSDF_SUCCESS;
}

MSDF_API int msdf_ft_font_load_glyph(msdf_ft_font_handle font, const unsigned cp, const int coordinateScaling, msdf_shape_handle* shape) {
    if(font == nullptr || shape == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    auto* actual_shape = new msdfgen::Shape();
    msdfgen::loadGlyph(*actual_shape, reinterpret_cast<msdfgen::FontHandle*>(font), cp, (msdfgen::FontCoordinateScaling)coordinateScaling);
    *shape = reinterpret_cast<msdf_shape_handle>(actual_shape);
    return MSDF_SUCCESS;
}

MSDF_API int msdf_ft_font_load_glyph_by_index(msdf_ft_font_handle font, const unsigned index, const int coordinateScaling, msdf_shape_handle* shape) {
    if(font == nullptr || shape == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    auto* actual_shape = new msdfgen::Shape();
    msdfgen::loadGlyph(*actual_shape, reinterpret_cast<msdfgen::FontHandle*>(font), msdfgen::GlyphIndex(index), (msdfgen::FontCoordinateScaling)coordinateScaling);
    *shape = reinterpret_cast<msdf_shape_handle>(actual_shape);
    return MSDF_SUCCESS;
}

MSDF_API int msdf_ft_font_get_glyph_index(msdf_ft_font_handle font, unsigned cp, unsigned* index) {
    if(font == nullptr || index == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    msdfgen::GlyphIndex glyph_index{};
    msdfgen::getGlyphIndex(glyph_index, reinterpret_cast<msdfgen::FontHandle*>(font), cp);
    *index = glyph_index.getIndex();
    return MSDF_SUCCESS;
}

MSDF_API int msdf_ft_font_get_kerning_by_index(msdf_ft_font_handle font, unsigned index1, unsigned index2, double* kerning) {
    if(font == nullptr || kerning == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    msdfgen::getKerning(*kerning, reinterpret_cast<msdfgen::FontHandle*>(font), msdfgen::GlyphIndex(index1), msdfgen::GlyphIndex(index2));
    return MSDF_SUCCESS;
}

MSDF_API int msdf_ft_font_get_kerning(msdf_ft_font_handle font, unsigned cp1, unsigned cp2, double* kerning) {
    if(font == nullptr || kerning == nullptr) {
        return MSDF_ERR_INVALID_ARG;
    }
    msdfgen::getKerning(*kerning, reinterpret_cast<msdfgen::FontHandle*>(font), cp1, cp2);
    return MSDF_SUCCESS;
}

MSDF_API void msdf_ft_font_destroy(msdf_ft_font_handle handle) {
    if(handle == nullptr) {
        return;
    }
    msdfgen::destroyFont(reinterpret_cast<msdfgen::FontHandle*>(handle));
}

MSDF_API void msdf_ft_deinit(msdf_ft_handle handle) {
    if(handle == nullptr) {
        return;
    }
    msdfgen::deinitializeFreetype(reinterpret_cast<msdfgen::FreetypeHandle*>(handle));
}
}