/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class STBEasyFont {

    static { LibSTB.initialize(); }

    protected STBEasyFont() {
        throw new UnsupportedOperationException();
    }

    // --- [ stb_easy_font_width ] ---

    /** {@code int stb_easy_font_width(char * text)} */
    public static native int nstb_easy_font_width(long text);

    /** {@code int stb_easy_font_width(char * text)} */
    public static int stb_easy_font_width(@NativeType("char *") ByteBuffer text) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nstb_easy_font_width(memAddress(text));
    }

    /** {@code int stb_easy_font_width(char * text)} */
    public static int stb_easy_font_width(@NativeType("char *") CharSequence text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(text, true);
            long textEncoded = stack.getPointerAddress();
            return nstb_easy_font_width(textEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stb_easy_font_height ] ---

    /** {@code int stb_easy_font_height(char * text)} */
    public static native int nstb_easy_font_height(long text);

    /** {@code int stb_easy_font_height(char * text)} */
    public static int stb_easy_font_height(@NativeType("char *") ByteBuffer text) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nstb_easy_font_height(memAddress(text));
    }

    /** {@code int stb_easy_font_height(char * text)} */
    public static int stb_easy_font_height(@NativeType("char *") CharSequence text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(text, true);
            long textEncoded = stack.getPointerAddress();
            return nstb_easy_font_height(textEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stb_easy_font_print ] ---

    /** {@code int stb_easy_font_print(float x, float y, char * text, unsigned char * color, void * vertex_buffer, int vbuf_size)} */
    public static native int nstb_easy_font_print(float x, float y, long text, long color, long vertex_buffer, int vbuf_size);

    /** {@code int stb_easy_font_print(float x, float y, char * text, unsigned char * color, void * vertex_buffer, int vbuf_size)} */
    public static int stb_easy_font_print(float x, float y, @NativeType("char *") ByteBuffer text, @NativeType("unsigned char *") @Nullable ByteBuffer color, @NativeType("void *") ByteBuffer vertex_buffer) {
        if (CHECKS) {
            checkNT1(text);
            checkSafe(color, 4);
        }
        return nstb_easy_font_print(x, y, memAddress(text), memAddressSafe(color), memAddress(vertex_buffer), vertex_buffer.remaining());
    }

    /** {@code int stb_easy_font_print(float x, float y, char * text, unsigned char * color, void * vertex_buffer, int vbuf_size)} */
    public static int stb_easy_font_print(float x, float y, @NativeType("char *") CharSequence text, @NativeType("unsigned char *") @Nullable ByteBuffer color, @NativeType("void *") ByteBuffer vertex_buffer) {
        if (CHECKS) {
            checkSafe(color, 4);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(text, true);
            long textEncoded = stack.getPointerAddress();
            return nstb_easy_font_print(x, y, textEncoded, memAddressSafe(color), memAddress(vertex_buffer), vertex_buffer.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stb_easy_font_spacing ] ---

    /** {@code void stb_easy_font_spacing(float spacing)} */
    public static native void stb_easy_font_spacing(float spacing);

}