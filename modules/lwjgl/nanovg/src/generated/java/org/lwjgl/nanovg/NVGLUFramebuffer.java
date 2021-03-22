/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * A framebuffer object.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct NVGLUframebuffer {
 *     GLuint {@link #fbo};
 *     GLuint {@link #rbo};
 *     GLuint {@link #texture};
 *     int {@link #image};
 * }</code></pre>
 */
@NativeType("struct NVGLUframebuffer")
public class NVGLUFramebuffer extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FBO,
        RBO,
        TEXTURE,
        IMAGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FBO = layout.offsetof(0);
        RBO = layout.offsetof(1);
        TEXTURE = layout.offsetof(2);
        IMAGE = layout.offsetof(3);
    }

    /**
     * Creates a {@code NVGLUFramebuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NVGLUFramebuffer(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the OpenGL framebuffer object handle */
    @NativeType("GLuint")
    public int fbo() { return nfbo(address()); }
    /** the OpenGL renderbuffer handle */
    @NativeType("GLuint")
    public int rbo() { return nrbo(address()); }
    /** the OpenGL texture handle */
    @NativeType("GLuint")
    public int texture() { return ntexture(address()); }
    /** the NanoVG image handle */
    public int image() { return nimage(address()); }

    // -----------------------------------

    /** Returns a new {@code NVGLUFramebuffer} instance for the specified memory address. */
    public static NVGLUFramebuffer create(long address) {
        return wrap(NVGLUFramebuffer.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NVGLUFramebuffer createSafe(long address) {
        return address == NULL ? null : wrap(NVGLUFramebuffer.class, address);
    }

    /**
     * Create a {@link NVGLUFramebuffer.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NVGLUFramebuffer.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NVGLUFramebuffer.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #fbo}. */
    public static int nfbo(long struct) { return UNSAFE.getInt(null, struct + NVGLUFramebuffer.FBO); }
    /** Unsafe version of {@link #rbo}. */
    public static int nrbo(long struct) { return UNSAFE.getInt(null, struct + NVGLUFramebuffer.RBO); }
    /** Unsafe version of {@link #texture}. */
    public static int ntexture(long struct) { return UNSAFE.getInt(null, struct + NVGLUFramebuffer.TEXTURE); }
    /** Unsafe version of {@link #image}. */
    public static int nimage(long struct) { return UNSAFE.getInt(null, struct + NVGLUFramebuffer.IMAGE); }

    // -----------------------------------

    /** An array of {@link NVGLUFramebuffer} structs. */
    public static class Buffer extends StructBuffer<NVGLUFramebuffer, Buffer> {

        private static final NVGLUFramebuffer ELEMENT_FACTORY = NVGLUFramebuffer.create(-1L);

        /**
         * Creates a new {@code NVGLUFramebuffer.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NVGLUFramebuffer#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected NVGLUFramebuffer getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link NVGLUFramebuffer#fbo} field. */
        @NativeType("GLuint")
        public int fbo() { return NVGLUFramebuffer.nfbo(address()); }
        /** @return the value of the {@link NVGLUFramebuffer#rbo} field. */
        @NativeType("GLuint")
        public int rbo() { return NVGLUFramebuffer.nrbo(address()); }
        /** @return the value of the {@link NVGLUFramebuffer#texture} field. */
        @NativeType("GLuint")
        public int texture() { return NVGLUFramebuffer.ntexture(address()); }
        /** @return the value of the {@link NVGLUFramebuffer#image} field. */
        public int image() { return NVGLUFramebuffer.nimage(address()); }

    }

}