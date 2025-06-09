#pragma once

/*
 * MULTI-CHANNEL SIGNED DISTANCE FIELD GENERATOR
 * ---------------------------------------------
 * A utility by Viktor Chlumsky, (c) 2014 - 2024
 *
 * The technique used to generate multi-channel distance fields in this code
 * has been developed by Viktor Chlumsky in 2014 for his master's thesis,
 * "Shape Decomposition for Multi-Channel Distance Fields". It provides improved
 * quality of sharp corners in glyphs and other 2D shapes compared to monochrome
 * distance fields. To reconstruct an image of the shape, apply the median of three
 * operation on the triplet of sampled signed distance values.
 */

#include "msdfgen-c.h"

/*
 * A C-API modeled closely after the msdfgen C++ API
 * to allow C-programs and other language runtimes to
 * use the msdfgen library. Originally written for LWJGL.
 *
 * @since 11/05/2024
 * @author Alexander Hinze
 */

#ifdef __cplusplus
extern "C" {
#endif

MSDF_DEFINE_HANDLE_TYPE(msdf_ft);
MSDF_DEFINE_HANDLE_TYPE(msdf_ft_font);

typedef void* (*msdf_ft_load_callback)(const char* functionName);

/**
 * Overrides the default load callback function used for resolving FreeTypee function at runtime.
 * @param callback A pointer to the function to call for resolving FreeType functions at runtime.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_ft_set_load_callback(msdf_ft_load_callback callback);

/**
 * Retrieves the current FreeType load callback.
 * @returns A pointer to the current FreeType load callback function.
 */
MSDF_API msdf_ft_load_callback msdf_ft_get_load_callback();

/**
 * Initializes a new FreeType instance to be used with msdfgen.
 * @param handle A pointer to a handle to be populated with a new FreeType context.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_ft_init(msdf_ft_handle* handle);

/**
 * Loads a TrueType font from the given file(path) and populates
 * the given font handle with the address of the newly loaded font.
 * @param handle The handle to the FreeType context to use for loading the font.
 * @param filename The name or path of/to the font file to load.
 * @param font A pointer to a font handle to be populated with the address of the newly loaded font.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_ft_load_font(msdf_ft_handle handle, const char* filename, msdf_ft_font_handle* font);

/**
 * Adopts the given FreeType FT_Face pointer as a font handle.
 * @param face An opaque pointer to the FT_Face to adopt.
 * @param font A pointer to an address to be populated with the newly allocated font handle.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_ft_adopt_font(void* face, msdf_ft_font_handle* font);

/**
 * Loads a TrueType font from the given buffer and populates
 * the given font handle with the address of the newly loaded font.
 * @param handle The handle to the FreeType context to use for loading the font.
 * @param data A pointer to the raw data of the TrueType font to load.
 * @param size The size of the data buffer in bytes.
 * @param font A pointer to a font handle to be populated with the address of the newly loaded font.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_ft_load_font_data(msdf_ft_handle handle, const void* data, size_t size, msdf_ft_font_handle* font);

/**
 * Loads a single glyph from the given font and converts it into a vector shape
 * for rendering glyph sprites.
 * @param font A handle to the font to use for generating the glyph shape.
 * @param cp The codepoint to generate a shape for.
 * @param coordinateScaling The type of coordinate transform applied to the shape.
 * @param shape A pointer to a handle to be populated with the address of the newly created shape.
 *  This shape must later be freed using msdf_shape_free!
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_ft_font_load_glyph(msdf_ft_font_handle font, unsigned cp, int coordinateScaling, msdf_shape_handle* shape);

/**
 * Loads a single glyph from the given font and converts it into a vector shape
 * for rendering glyph sprites.
 * @param font A handle to the font to load the glyph shape from.
 * @param index The glyph index to generate a shape for.
 * @param coordinateScaling The type of coordinate transform applied to the shape.
 * @param shape A pointer to a handle to be populated with the address of the newly created shape.
 *  This shape must later be freed using msdf_shape_free!
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_ft_font_load_glyph_by_index(msdf_ft_font_handle font, unsigned index, int coordinateScaling, msdf_shape_handle* shape);

/**
 * Retrieves the glyph index of the given unicode codepoint.
 * @param font A handle to the font to retrieve the glyph index from.
 * @param cp The codepoint to retrieve the glyph index for.
 * @param index A pointer to the glyph index to be retrieved.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_ft_font_get_glyph_index(msdf_ft_font_handle font, unsigned cp, unsigned* index);

/**
 * Retrieves the kerning between the two given glyphs.
 * @param font A handle to the font to retrieve the kerning from.
 * @param index1 The glyph index of the left glyph.
 * @param index2 The glyph index of the right glyph.
 * @param kerning A pointer to the kerning value to be retrieved.
 * @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
 */
MSDF_API int msdf_ft_font_get_kerning_by_index(msdf_ft_font_handle font, unsigned index1, unsigned index2, double* kerning);

/**
 * Retrieves the kerning between the two given codepoints.
 * @param font A handle to the font to retrieve the kerning from.
 * @param cp1 The left codepoint.
 * @param cp2 The right codepoint.
 * @param kerning A pointer to the kerning value to be retrieved.
 */
MSDF_API int msdf_ft_font_get_kerning(msdf_ft_font_handle font, unsigned cp1, unsigned cp2, double* kerning);

/**
 * Frees the underlying instance of the given FreeType font.
 * @param handle The handle to the font to free.
 */
MSDF_API void msdf_ft_font_destroy(msdf_ft_font_handle handle);

/**
 * Frees the underlying FreeType instance of the given context.
 * @param handle The handle to the FreeType context to free.
 */
MSDF_API void msdf_ft_deinit(msdf_ft_handle handle);

#ifdef __cplusplus
}
#endif