/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Color Vector.
 * 
 * <h5>Description</h5>
 * 
 * <p>Unless otherwise specified, colors are encoded as linear (not with sRGB nor other gamma compression) values with individual components being in the range of 0.0 through 1.0, and without the RGB components being premultiplied by the alpha component.</p>
 * 
 * <p>If color encoding is specified as being premultiplied by the alpha component, the RGB components are set to zero if the alpha component is zero.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrCompositionLayerColorScaleBiasKHR}, {@link XrPassthroughColorMapMonoToRgbaFB}, {@link XrPassthroughStyleFB}, {@link XrSwapchainStateSamplerOpenGLESFB}, {@link XrSwapchainStateSamplerVulkanFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrColor4f {
 *     float {@link #r};
 *     float {@link #g};
 *     float {@link #b};
 *     float {@link #a};
 * }</code></pre>
 */
public class XrColor4f extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        R,
        G,
        B,
        A;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        R = layout.offsetof(0);
        G = layout.offsetof(1);
        B = layout.offsetof(2);
        A = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrColor4f} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrColor4f(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the red component of the color. */
    public float r() { return nr(address()); }
    /** the green component of the color. */
    public float g() { return ng(address()); }
    /** the blue component of the color. */
    public float b() { return nb(address()); }
    /** the alpha component of the color. */
    public float a() { return na(address()); }

    /** Sets the specified value to the {@link #r} field. */
    public XrColor4f r(float value) { nr(address(), value); return this; }
    /** Sets the specified value to the {@link #g} field. */
    public XrColor4f g(float value) { ng(address(), value); return this; }
    /** Sets the specified value to the {@link #b} field. */
    public XrColor4f b(float value) { nb(address(), value); return this; }
    /** Sets the specified value to the {@link #a} field. */
    public XrColor4f a(float value) { na(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrColor4f set(
        float r,
        float g,
        float b,
        float a
    ) {
        r(r);
        g(g);
        b(b);
        a(a);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrColor4f set(XrColor4f src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrColor4f} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrColor4f malloc() {
        return wrap(XrColor4f.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrColor4f} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrColor4f calloc() {
        return wrap(XrColor4f.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrColor4f} instance allocated with {@link BufferUtils}. */
    public static XrColor4f create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrColor4f.class, memAddress(container), container);
    }

    /** Returns a new {@code XrColor4f} instance for the specified memory address. */
    public static XrColor4f create(long address) {
        return wrap(XrColor4f.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrColor4f createSafe(long address) {
        return address == NULL ? null : wrap(XrColor4f.class, address);
    }

    /**
     * Returns a new {@link XrColor4f.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrColor4f.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrColor4f.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrColor4f.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrColor4f.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrColor4f.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrColor4f.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrColor4f.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrColor4f.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrColor4f} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrColor4f malloc(MemoryStack stack) {
        return wrap(XrColor4f.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrColor4f} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrColor4f calloc(MemoryStack stack) {
        return wrap(XrColor4f.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrColor4f.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrColor4f.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrColor4f.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrColor4f.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #r}. */
    public static float nr(long struct) { return UNSAFE.getFloat(null, struct + XrColor4f.R); }
    /** Unsafe version of {@link #g}. */
    public static float ng(long struct) { return UNSAFE.getFloat(null, struct + XrColor4f.G); }
    /** Unsafe version of {@link #b}. */
    public static float nb(long struct) { return UNSAFE.getFloat(null, struct + XrColor4f.B); }
    /** Unsafe version of {@link #a}. */
    public static float na(long struct) { return UNSAFE.getFloat(null, struct + XrColor4f.A); }

    /** Unsafe version of {@link #r(float) r}. */
    public static void nr(long struct, float value) { UNSAFE.putFloat(null, struct + XrColor4f.R, value); }
    /** Unsafe version of {@link #g(float) g}. */
    public static void ng(long struct, float value) { UNSAFE.putFloat(null, struct + XrColor4f.G, value); }
    /** Unsafe version of {@link #b(float) b}. */
    public static void nb(long struct, float value) { UNSAFE.putFloat(null, struct + XrColor4f.B, value); }
    /** Unsafe version of {@link #a(float) a}. */
    public static void na(long struct, float value) { UNSAFE.putFloat(null, struct + XrColor4f.A, value); }

    // -----------------------------------

    /** An array of {@link XrColor4f} structs. */
    public static class Buffer extends StructBuffer<XrColor4f, Buffer> implements NativeResource {

        private static final XrColor4f ELEMENT_FACTORY = XrColor4f.create(-1L);

        /**
         * Creates a new {@code XrColor4f.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrColor4f#SIZEOF}, and its mark will be undefined.
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
        protected XrColor4f getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrColor4f#r} field. */
        public float r() { return XrColor4f.nr(address()); }
        /** @return the value of the {@link XrColor4f#g} field. */
        public float g() { return XrColor4f.ng(address()); }
        /** @return the value of the {@link XrColor4f#b} field. */
        public float b() { return XrColor4f.nb(address()); }
        /** @return the value of the {@link XrColor4f#a} field. */
        public float a() { return XrColor4f.na(address()); }

        /** Sets the specified value to the {@link XrColor4f#r} field. */
        public XrColor4f.Buffer r(float value) { XrColor4f.nr(address(), value); return this; }
        /** Sets the specified value to the {@link XrColor4f#g} field. */
        public XrColor4f.Buffer g(float value) { XrColor4f.ng(address(), value); return this; }
        /** Sets the specified value to the {@link XrColor4f#b} field. */
        public XrColor4f.Buffer b(float value) { XrColor4f.nb(address(), value); return this; }
        /** Sets the specified value to the {@link XrColor4f#a} field. */
        public XrColor4f.Buffer a(float value) { XrColor4f.na(address(), value); return this; }

    }

}