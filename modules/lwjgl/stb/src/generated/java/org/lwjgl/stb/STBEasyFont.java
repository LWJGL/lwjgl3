/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to stb_easy_font.h from the <a href="https://github.com/nothings/stb">stb library</a>.
 * 
 * <p>Bitmap font for use in 3D APIs:</p>
 * 
 * <ul>
 * <li>Easy-to-deploy</li>
 * <li>reasonably compact</li>
 * <li>extremely inefficient performance-wise</li>
 * <li>crappy-looking</li>
 * <li>ASCII-only</li>
 * </ul>
 * 
 * <p>Intended for when you just want to get some text displaying in a 3D app as quickly as possible.</p>
 * 
 * <p>Doesn't use any textures, instead builds characters out of quads.</p>
 * 
 * <h3>SAMPLE CODE</h3>
 * 
 * <p>Here's sample code for old OpenGL; it's a lot more complicated to make work on modern APIs, and that's your problem.</p>
 * 
 * <pre><code>
 * void print_string(float x, float y, char *text, float r, float g, float b)
 * {
 *     static char buffer[99999]; // ~500 chars
 *     int num_quads;
 * 
 *     num_quads = stb_easy_font_print(x, y, text, NULL, buffer, sizeof(buffer));
 * 
 *     glColor3f(r,g,b);
 *     glEnableClientState(GL_VERTEX_ARRAY);
 *     glVertexPointer(2, GL_FLOAT, 16, buffer);
 *     glDrawArrays(GL_QUADS, 0, num_quads*4);
 *     glDisableClientState(GL_VERTEX_ARRAY);
 * }</code></pre>
 */
public class STBEasyFont {

    static { LibSTB.initialize(); }

    protected STBEasyFont() {
        throw new UnsupportedOperationException();
    }

    // --- [ stb_easy_font_width ] ---

    /** Unsafe version of: {@link #stb_easy_font_width easy_font_width} */
    public static native int nstb_easy_font_width(long text);

    /**
     * Takes a string and returns the horizontal size.
     *
     * @param text an ASCII string
     *
     * @return the horizontal size, in pixels
     */
    public static int stb_easy_font_width(@NativeType("char *") ByteBuffer text) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nstb_easy_font_width(memAddress(text));
    }

    /**
     * Takes a string and returns the horizontal size.
     *
     * @param text an ASCII string
     *
     * @return the horizontal size, in pixels
     */
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

    /** Unsafe version of: {@link #stb_easy_font_height easy_font_height} */
    public static native int nstb_easy_font_height(long text);

    /**
     * Takes a string and returns the vertical size (which can vary if {@code text} has newlines).
     *
     * @param text an ASCII string
     *
     * @return the vertical size, in pixels
     */
    public static int stb_easy_font_height(@NativeType("char *") ByteBuffer text) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nstb_easy_font_height(memAddress(text));
    }

    /**
     * Takes a string and returns the vertical size (which can vary if {@code text} has newlines).
     *
     * @param text an ASCII string
     *
     * @return the vertical size, in pixels
     */
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

    /**
     * Unsafe version of: {@link #stb_easy_font_print easy_font_print}
     *
     * @param vbuf_size the {@code vertex_buffer} size, in bytes
     */
    public static native int nstb_easy_font_print(float x, float y, long text, long color, long vertex_buffer, int vbuf_size);

    /**
     * Takes a string (which can contain '\n') and fills out a vertex buffer with renderable data to draw the string. Output data assumes increasing x is
     * rightwards, increasing y is downwards.
     * 
     * <p>The vertex data is divided into quads, i.e. there are four vertices in the vertex buffer for each quad.</p>
     * 
     * <p>The vertices are stored in an interleaved format:</p>
     * 
     * <pre><code>
     * x:float
     * y:float
     * z:float
     * color:uint8[4]</code></pre>
     * 
     * <p>You can ignore z and color if you get them from elsewhere. This format was chosen in the hopes it would make it easier for you to reuse existing
     * buffer-drawing code.</p>
     * 
     * <p>If you pass in {@code NULL} for color, it becomes {@code 255,255,255,255}.</p>
     * 
     * <p>If the buffer isn't large enough, it will truncate. Expect it to use an average of ~270 bytes per character.</p>
     * 
     * <p>If your API doesn't draw quads, build a reusable index list that allows you to render quads as indexed triangles.</p>
     *
     * @param x             the x offset
     * @param y             the y offset
     * @param text          an ASCII string
     * @param color         the text color, in RGBA (4 bytes)
     * @param vertex_buffer a pointer to memory in which to store the vertex data
     *
     * @return the number of quads
     */
    public static int stb_easy_font_print(float x, float y, @NativeType("char *") ByteBuffer text, @Nullable @NativeType("unsigned char *") ByteBuffer color, @NativeType("void *") ByteBuffer vertex_buffer) {
        if (CHECKS) {
            checkNT1(text);
            checkSafe(color, 4);
        }
        return nstb_easy_font_print(x, y, memAddress(text), memAddressSafe(color), memAddress(vertex_buffer), vertex_buffer.remaining());
    }

    /**
     * Takes a string (which can contain '\n') and fills out a vertex buffer with renderable data to draw the string. Output data assumes increasing x is
     * rightwards, increasing y is downwards.
     * 
     * <p>The vertex data is divided into quads, i.e. there are four vertices in the vertex buffer for each quad.</p>
     * 
     * <p>The vertices are stored in an interleaved format:</p>
     * 
     * <pre><code>
     * x:float
     * y:float
     * z:float
     * color:uint8[4]</code></pre>
     * 
     * <p>You can ignore z and color if you get them from elsewhere. This format was chosen in the hopes it would make it easier for you to reuse existing
     * buffer-drawing code.</p>
     * 
     * <p>If you pass in {@code NULL} for color, it becomes {@code 255,255,255,255}.</p>
     * 
     * <p>If the buffer isn't large enough, it will truncate. Expect it to use an average of ~270 bytes per character.</p>
     * 
     * <p>If your API doesn't draw quads, build a reusable index list that allows you to render quads as indexed triangles.</p>
     *
     * @param x             the x offset
     * @param y             the y offset
     * @param text          an ASCII string
     * @param color         the text color, in RGBA (4 bytes)
     * @param vertex_buffer a pointer to memory in which to store the vertex data
     *
     * @return the number of quads
     */
    public static int stb_easy_font_print(float x, float y, @NativeType("char *") CharSequence text, @Nullable @NativeType("unsigned char *") ByteBuffer color, @NativeType("void *") ByteBuffer vertex_buffer) {
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

    /**
     * Use positive values to expand the space between characters, and small negative values (no smaller than {@code -1.5}) to contract the space between characters.
     * 
     * <p>E.g. {@code spacing = 1} adds one "pixel" of spacing between the characters. {@code spacing = -1} is reasonable but feels a bit too compact to me;
     * {@code -0.5} is a reasonable compromise as long as you're scaling the font up.</p>
     *
     * @param spacing the font spacing
     */
    public static native void stb_easy_font_spacing(float spacing);

}