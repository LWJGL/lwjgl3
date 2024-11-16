/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.msdfgen;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class MSDFGenExt {

    static { LibMsdfGen.initialize(); }

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #MSDF_FONT_SCALING_NONE FONT_SCALING_NONE} - The coordinates are kept as the integer values native to the font file.</li>
     * <li>{@link #MSDF_FONT_SCALING_EM_NORMALIZED FONT_SCALING_EM_NORMALIZED} - The coordinates will be normalized to the em size, i.e. 1 = 1 em.</li>
     * <li>{@link #MSDF_FONT_SCALING_LEGACY FONT_SCALING_LEGACY} - 
     * The incorrect legacy version that was in effect before version 1.12, coordinate values are divided by 64 - DO NOT USE - for backwards compatibility
     * only.
     * </li>
     * </ul>
     */
    public static final int
        MSDF_FONT_SCALING_NONE          = 0,
        MSDF_FONT_SCALING_EM_NORMALIZED = 1,
        MSDF_FONT_SCALING_LEGACY        = 2;

    protected MSDFGenExt() {
        throw new UnsupportedOperationException();
    }

    // --- [ msdf_ft_set_load_callback ] ---

    /** Unsafe version of: {@link #msdf_ft_set_load_callback ft_set_load_callback} */
    public static native int nmsdf_ft_set_load_callback(long callback);

    /**
     * Overrides the default load callback function used for resolving FreeType function at runtime.
     *
     * @param callback a pointer to the function to call for resolving FreeType functions at runtime
     *
     * @return {@link MSDFGen#MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_ft_set_load_callback(@NativeType("void * (*) (char const *)") MSDFGenFTLoadCallbackI callback) {
        return nmsdf_ft_set_load_callback(callback.address());
    }

    // --- [ msdf_ft_get_load_callback ] ---

    /** Unsafe version of: {@link #msdf_ft_get_load_callback ft_get_load_callback} */
    public static native long nmsdf_ft_get_load_callback();

    /**
     * Retrieves the current FreeType load callback.
     *
     * @return a pointer to the current FreeType load callback function
     */
    @NativeType("void * (*) (char const *)")
    public static @Nullable MSDFGenFTLoadCallback msdf_ft_get_load_callback() {
        return MSDFGenFTLoadCallback.createSafe(nmsdf_ft_get_load_callback());
    }

    // --- [ msdf_ft_init ] ---

    /** Unsafe version of: {@link #msdf_ft_init ft_init} */
    public static native int nmsdf_ft_init(long handle);

    /**
     * Initializes a new FreeType instance to be used with msdfgen.
     *
     * @param handle a pointer to a handle to be populated with a new FreeType context
     *
     * @return {@link MSDFGen#MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_ft_init(@NativeType("msdf_ft_handle *") PointerBuffer handle) {
        if (CHECKS) {
            check(handle, 1);
        }
        return nmsdf_ft_init(memAddress(handle));
    }

    // --- [ msdf_ft_load_font ] ---

    /** Unsafe version of: {@link #msdf_ft_load_font ft_load_font} */
    public static native int nmsdf_ft_load_font(long handle, long fileName, long font);

    /**
     * Loads a TrueType font from the given file(path) and populates the given font handle with the address of the newly loaded font.
     *
     * @param handle   the handle to the FreeType context to use for loading the font
     * @param fileName the name or path of/to the font file to load
     * @param font     a pointer to a font handle to be populated with the address of the newly loaded font
     *
     * @return {@link MSDFGen#MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_ft_load_font(@NativeType("msdf_ft_handle") long handle, @NativeType("char const *") ByteBuffer fileName, @NativeType("msdf_ft_font_handle *") PointerBuffer font) {
        if (CHECKS) {
            check(handle);
            checkNT1(fileName);
            check(font, 1);
        }
        return nmsdf_ft_load_font(handle, memAddress(fileName), memAddress(font));
    }

    /**
     * Loads a TrueType font from the given file(path) and populates the given font handle with the address of the newly loaded font.
     *
     * @param handle   the handle to the FreeType context to use for loading the font
     * @param fileName the name or path of/to the font file to load
     * @param font     a pointer to a font handle to be populated with the address of the newly loaded font
     *
     * @return {@link MSDFGen#MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_ft_load_font(@NativeType("msdf_ft_handle") long handle, @NativeType("char const *") CharSequence fileName, @NativeType("msdf_ft_font_handle *") PointerBuffer font) {
        if (CHECKS) {
            check(handle);
            check(font, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fileName, true);
            long fileNameEncoded = stack.getPointerAddress();
            return nmsdf_ft_load_font(handle, fileNameEncoded, memAddress(font));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ msdf_ft_adopt_font ] ---

    /** Unsafe version of: {@link #msdf_ft_adopt_font ft_adopt_font} */
    public static native int nmsdf_ft_adopt_font(long face, long font);

    /**
     * Adopts the given FreeType {@code FT_Face} pointer as a font handle.
     *
     * @param face an opaque pointer to the {@code FT_Face} to adopt
     * @param font a pointer to an address to be populated with the newly allocated font handle
     *
     * @return {@link MSDFGen#MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_ft_adopt_font(@NativeType("void *") long face, @NativeType("msdf_ft_font_handle *") PointerBuffer font) {
        if (CHECKS) {
            check(face);
            check(font, 1);
        }
        return nmsdf_ft_adopt_font(face, memAddress(font));
    }

    // --- [ msdf_ft_load_font_data ] ---

    /**
     * Unsafe version of: {@link #msdf_ft_load_font_data ft_load_font_data}
     *
     * @param size the size of the data buffer in bytes
     */
    public static native int nmsdf_ft_load_font_data(long handle, long data, long size, long font);

    /**
     * Loads a TrueType font from the given buffer and populates the given font handle with the address of the newly loaded font.
     *
     * @param handle the handle to the FreeType context to use for loading the font
     * @param data   a pointer to the raw data of the TrueType font to load
     * @param font   a pointer to a font handle to be populated with the address of the newly loaded font
     *
     * @return {@link MSDFGen#MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_ft_load_font_data(@NativeType("msdf_ft_handle") long handle, @NativeType("void const *") ByteBuffer data, @NativeType("msdf_ft_font_handle *") PointerBuffer font) {
        if (CHECKS) {
            check(handle);
            check(font, 1);
        }
        return nmsdf_ft_load_font_data(handle, memAddress(data), data.remaining(), memAddress(font));
    }

    // --- [ msdf_ft_font_load_glyph ] ---

    /** Unsafe version of: {@link #msdf_ft_font_load_glyph ft_font_load_glyph} */
    public static native int nmsdf_ft_font_load_glyph(long font, int cp, int coordinateScaling, long shape);

    /**
     * Loads a single glyph from the given font and converts it into a vector shape for rendering glyph sprites.
     *
     * @param font              a handle to the font to use for generating the glyph shape
     * @param cp                the codepoint to generate a shape for
     * @param coordinateScaling the coordinate scaling to use. One of:<br><table><tr><td>{@link #MSDF_FONT_SCALING_NONE FONT_SCALING_NONE}</td><td>{@link #MSDF_FONT_SCALING_EM_NORMALIZED FONT_SCALING_EM_NORMALIZED}</td><td>{@link #MSDF_FONT_SCALING_LEGACY FONT_SCALING_LEGACY}</td></tr></table>
     * @param shape             a pointer to a handle to be populated with the address of the newly created shape.
     *                          
     *                          <p>This shape must later be freed using {@link MSDFGen#msdf_shape_free shape_free}!</p>
     *
     * @return {@link MSDFGen#MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_ft_font_load_glyph(@NativeType("msdf_ft_font_handle") long font, @NativeType("unsigned") int cp, int coordinateScaling, @NativeType("msdf_shape_handle *") PointerBuffer shape) {
        if (CHECKS) {
            check(font);
            check(shape, 1);
        }
        return nmsdf_ft_font_load_glyph(font, cp, coordinateScaling, memAddress(shape));
    }

    // --- [ msdf_ft_font_load_glyph_by_index ] ---

    /** Unsafe version of: {@link #msdf_ft_font_load_glyph_by_index ft_font_load_glyph_by_index} */
    public static native int nmsdf_ft_font_load_glyph_by_index(long font, int index, int coordinateScaling, long shape);

    /**
     * Loads a single glyph from the given font and converts it into a vector shape for rendering glyph sprites.
     *
     * @param font              a handle to the font to use for generating the glyph shape
     * @param index             the glyph index to generate a shape for
     * @param coordinateScaling the coordinate scaling to use. One of:<br><table><tr><td>{@link #MSDF_FONT_SCALING_NONE FONT_SCALING_NONE}</td><td>{@link #MSDF_FONT_SCALING_EM_NORMALIZED FONT_SCALING_EM_NORMALIZED}</td><td>{@link #MSDF_FONT_SCALING_LEGACY FONT_SCALING_LEGACY}</td></tr></table>
     * @param shape             a pointer to a handle to be populated with the address of the newly created shape.
     *                          
     *                          <p>This shape must later be freed using {@link MSDFGen#msdf_shape_free shape_free}!</p>
     *
     * @return {@link MSDFGen#MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_ft_font_load_glyph_by_index(@NativeType("msdf_ft_font_handle") long font, @NativeType("unsigned") int index, int coordinateScaling, @NativeType("msdf_shape_handle *") PointerBuffer shape) {
        if (CHECKS) {
            check(font);
            check(shape, 1);
        }
        return nmsdf_ft_font_load_glyph_by_index(font, index, coordinateScaling, memAddress(shape));
    }

    // --- [ msdf_ft_font_get_glyph_index ] ---

    /** Unsafe version of: {@link #msdf_ft_font_get_glyph_index ft_font_get_glyph_index} */
    public static native int nmsdf_ft_font_get_glyph_index(long font, int cp, long index);

    /**
     * Retrieves the glyph index of the given unicode codepoint.
     *
     * @param font  a handle to the font to retrieve the glyph index from
     * @param cp    the codepoint to retrieve the glyph index for
     * @param index a pointer to the glyph index to be retrieved
     *
     * @return {@link MSDFGen#MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_ft_font_get_glyph_index(@NativeType("msdf_ft_font_handle") long font, @NativeType("unsigned") int cp, @NativeType("unsigned *") IntBuffer index) {
        if (CHECKS) {
            check(font);
            check(index, 1);
        }
        return nmsdf_ft_font_get_glyph_index(font, cp, memAddress(index));
    }

    // --- [ msdf_ft_font_get_kerning ] ---

    /** Unsafe version of: {@link #msdf_ft_font_get_kerning ft_font_get_kerning} */
    public static native int nmsdf_ft_font_get_kerning(long font, int cp1, int cp2, long kerning);

    /**
     * Retrieves the kerning between the two given codepoints.
     *
     * @param font    a handle to the font to retrieve the kerning from
     * @param cp1     the left codepoint
     * @param cp2     the right codepoint
     * @param kerning a pointer to the kerning value to be retrieved
     *
     * @return {@link MSDFGen#MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_ft_font_get_kerning(@NativeType("msdf_ft_font_handle") long font, @NativeType("unsigned") int cp1, @NativeType("unsigned") int cp2, @NativeType("double *") DoubleBuffer kerning) {
        if (CHECKS) {
            check(font);
            check(kerning, 1);
        }
        return nmsdf_ft_font_get_kerning(font, cp1, cp2, memAddress(kerning));
    }

    // --- [ msdf_ft_font_get_kerning_by_index ] ---

    /** Unsafe version of: {@link #msdf_ft_font_get_kerning_by_index ft_font_get_kerning_by_index} */
    public static native int nmsdf_ft_font_get_kerning_by_index(long font, int index1, int index2, long kerning);

    /**
     * etrieves the kerning between the two given glyphs.
     *
     * @param font    a handle to the font to retrieve the kerning from
     * @param index1  the glyph index of the left glyph
     * @param index2  the glyph index of the right glyph
     * @param kerning a pointer to the kerning value to be retrieved
     *
     * @return {@link MSDFGen#MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_ft_font_get_kerning_by_index(@NativeType("msdf_ft_font_handle") long font, @NativeType("unsigned") int index1, @NativeType("unsigned") int index2, @NativeType("double *") DoubleBuffer kerning) {
        if (CHECKS) {
            check(font);
            check(kerning, 1);
        }
        return nmsdf_ft_font_get_kerning_by_index(font, index1, index2, memAddress(kerning));
    }

    // --- [ msdf_ft_font_destroy ] ---

    /** Unsafe version of: {@link #msdf_ft_font_destroy ft_font_destroy} */
    public static native void nmsdf_ft_font_destroy(long font);

    /**
     * Frees the underlying instance of the given FreeType font.
     *
     * @param font the handle to the font to free
     */
    public static void msdf_ft_font_destroy(@NativeType("msdf_ft_font_handle") long font) {
        if (CHECKS) {
            check(font);
        }
        nmsdf_ft_font_destroy(font);
    }

    // --- [ msdf_ft_deinit ] ---

    /** Unsafe version of: {@link #msdf_ft_deinit ft_deinit} */
    public static native void nmsdf_ft_deinit(long handle);

    /**
     * Frees the underlying FreeType instance of the given context.
     *
     * @param handle the handle to the FreeType context to free
     */
    public static void msdf_ft_deinit(@NativeType("msdf_ft_handle") long handle) {
        if (CHECKS) {
            check(handle);
        }
        nmsdf_ft_deinit(handle);
    }

}