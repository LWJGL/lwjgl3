/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * An RGBA color with normalized float components.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code r} &ndash; the R component</li>
 * <li>{@code g} &ndash; the G component</li>
 * <li>{@code b} &ndash; the B component</li>
 * <li>{@code a} &ndash; the A component</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrColorf {
 *     float r;
 *     float g;
 *     float b;
 *     float a;
 * }</code></pre>
 */
@NativeType("struct ovrColorf")
public class OVRColorf extends Struct implements NativeResource {

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
     * Creates a {@code OVRColorf} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRColorf(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code r} field. */
    public float r() { return nr(address()); }
    /** Returns the value of the {@code g} field. */
    public float g() { return ng(address()); }
    /** Returns the value of the {@code b} field. */
    public float b() { return nb(address()); }
    /** Returns the value of the {@code a} field. */
    public float a() { return na(address()); }

    /** Sets the specified value to the {@code r} field. */
    public OVRColorf r(float value) { nr(address(), value); return this; }
    /** Sets the specified value to the {@code g} field. */
    public OVRColorf g(float value) { ng(address(), value); return this; }
    /** Sets the specified value to the {@code b} field. */
    public OVRColorf b(float value) { nb(address(), value); return this; }
    /** Sets the specified value to the {@code a} field. */
    public OVRColorf a(float value) { na(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRColorf set(
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
    public OVRColorf set(OVRColorf src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRColorf} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRColorf malloc() {
        return wrap(OVRColorf.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRColorf} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRColorf calloc() {
        return wrap(OVRColorf.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRColorf} instance allocated with {@link BufferUtils}. */
    public static OVRColorf create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRColorf.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRColorf} instance for the specified memory address. */
    public static OVRColorf create(long address) {
        return wrap(OVRColorf.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRColorf createSafe(long address) {
        return address == NULL ? null : wrap(OVRColorf.class, address);
    }

    /**
     * Returns a new {@link OVRColorf.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRColorf.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRColorf.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRColorf.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRColorf.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRColorf.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRColorf.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRColorf.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRColorf.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code OVRColorf} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRColorf mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code OVRColorf} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRColorf callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code OVRColorf} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRColorf mallocStack(MemoryStack stack) {
        return wrap(OVRColorf.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRColorf} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRColorf callocStack(MemoryStack stack) {
        return wrap(OVRColorf.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRColorf.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRColorf.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRColorf.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRColorf.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRColorf.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRColorf.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRColorf.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRColorf.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #r}. */
    public static float nr(long struct) { return UNSAFE.getFloat(null, struct + OVRColorf.R); }
    /** Unsafe version of {@link #g}. */
    public static float ng(long struct) { return UNSAFE.getFloat(null, struct + OVRColorf.G); }
    /** Unsafe version of {@link #b}. */
    public static float nb(long struct) { return UNSAFE.getFloat(null, struct + OVRColorf.B); }
    /** Unsafe version of {@link #a}. */
    public static float na(long struct) { return UNSAFE.getFloat(null, struct + OVRColorf.A); }

    /** Unsafe version of {@link #r(float) r}. */
    public static void nr(long struct, float value) { UNSAFE.putFloat(null, struct + OVRColorf.R, value); }
    /** Unsafe version of {@link #g(float) g}. */
    public static void ng(long struct, float value) { UNSAFE.putFloat(null, struct + OVRColorf.G, value); }
    /** Unsafe version of {@link #b(float) b}. */
    public static void nb(long struct, float value) { UNSAFE.putFloat(null, struct + OVRColorf.B, value); }
    /** Unsafe version of {@link #a(float) a}. */
    public static void na(long struct, float value) { UNSAFE.putFloat(null, struct + OVRColorf.A, value); }

    // -----------------------------------

    /** An array of {@link OVRColorf} structs. */
    public static class Buffer extends StructBuffer<OVRColorf, Buffer> implements NativeResource {

        private static final OVRColorf ELEMENT_FACTORY = OVRColorf.create(-1L);

        /**
         * Creates a new {@code OVRColorf.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRColorf#SIZEOF}, and its mark will be undefined.
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
        protected OVRColorf getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code r} field. */
        public float r() { return OVRColorf.nr(address()); }
        /** Returns the value of the {@code g} field. */
        public float g() { return OVRColorf.ng(address()); }
        /** Returns the value of the {@code b} field. */
        public float b() { return OVRColorf.nb(address()); }
        /** Returns the value of the {@code a} field. */
        public float a() { return OVRColorf.na(address()); }

        /** Sets the specified value to the {@code r} field. */
        public OVRColorf.Buffer r(float value) { OVRColorf.nr(address(), value); return this; }
        /** Sets the specified value to the {@code g} field. */
        public OVRColorf.Buffer g(float value) { OVRColorf.ng(address(), value); return this; }
        /** Sets the specified value to the {@code b} field. */
        public OVRColorf.Buffer b(float value) { OVRColorf.nb(address(), value); return this; }
        /** Sets the specified value to the {@code a} field. */
        public OVRColorf.Buffer a(float value) { OVRColorf.na(address(), value); return this; }

    }

}