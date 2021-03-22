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
 *     NVGcontext * ctx;
 *     bgfx_frame_buffer_handle_t handle;
 *     int image;
 *     bgfx_view_id_t viewId;
 * }</code></pre>
 */
@NativeType("struct NVGLUframebuffer")
public class NVGLUFramebufferBGFX extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CTX,
        HANDLE,
        IMAGE,
        VIEWID;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(2),
            __member(4),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CTX = layout.offsetof(0);
        HANDLE = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
        VIEWID = layout.offsetof(3);
    }

    /**
     * Creates a {@code NVGLUFramebufferBGFX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NVGLUFramebufferBGFX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code ctx} field. */
    @NativeType("NVGcontext *")
    public long ctx() { return nctx(address()); }
    /** @return the value of the {@code handle} field. */
    @NativeType("bgfx_frame_buffer_handle_t")
    public short handle() { return nhandle(address()); }
    /** @return the value of the {@code image} field. */
    public int image() { return nimage(address()); }
    /** @return the value of the {@code viewId} field. */
    @NativeType("bgfx_view_id_t")
    public short viewId() { return nviewId(address()); }

    // -----------------------------------

    /** Returns a new {@code NVGLUFramebufferBGFX} instance for the specified memory address. */
    public static NVGLUFramebufferBGFX create(long address) {
        return wrap(NVGLUFramebufferBGFX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NVGLUFramebufferBGFX createSafe(long address) {
        return address == NULL ? null : wrap(NVGLUFramebufferBGFX.class, address);
    }

    /**
     * Create a {@link NVGLUFramebufferBGFX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NVGLUFramebufferBGFX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NVGLUFramebufferBGFX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ctx}. */
    public static long nctx(long struct) { return memGetAddress(struct + NVGLUFramebufferBGFX.CTX); }
    /** Unsafe version of {@link #handle}. */
    public static short nhandle(long struct) { return UNSAFE.getShort(null, struct + NVGLUFramebufferBGFX.HANDLE); }
    /** Unsafe version of {@link #image}. */
    public static int nimage(long struct) { return UNSAFE.getInt(null, struct + NVGLUFramebufferBGFX.IMAGE); }
    /** Unsafe version of {@link #viewId}. */
    public static short nviewId(long struct) { return UNSAFE.getShort(null, struct + NVGLUFramebufferBGFX.VIEWID); }

    // -----------------------------------

    /** An array of {@link NVGLUFramebufferBGFX} structs. */
    public static class Buffer extends StructBuffer<NVGLUFramebufferBGFX, Buffer> {

        private static final NVGLUFramebufferBGFX ELEMENT_FACTORY = NVGLUFramebufferBGFX.create(-1L);

        /**
         * Creates a new {@code NVGLUFramebufferBGFX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NVGLUFramebufferBGFX#SIZEOF}, and its mark will be undefined.
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
        protected NVGLUFramebufferBGFX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code ctx} field. */
        @NativeType("NVGcontext *")
        public long ctx() { return NVGLUFramebufferBGFX.nctx(address()); }
        /** @return the value of the {@code handle} field. */
        @NativeType("bgfx_frame_buffer_handle_t")
        public short handle() { return NVGLUFramebufferBGFX.nhandle(address()); }
        /** @return the value of the {@code image} field. */
        public int image() { return NVGLUFramebufferBGFX.nimage(address()); }
        /** @return the value of the {@code viewId} field. */
        @NativeType("bgfx_view_id_t")
        public short viewId() { return NVGLUFramebufferBGFX.nviewId(address()); }

    }

}