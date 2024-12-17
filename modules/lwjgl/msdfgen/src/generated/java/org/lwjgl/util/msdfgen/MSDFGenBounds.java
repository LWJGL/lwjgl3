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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct msdf_bounds {
 *     double l;
 *     double b;
 *     double r;
 *     double t;
 * }}</pre>
 */
@NativeType("struct msdf_bounds")
public class MSDFGenBounds extends Struct<MSDFGenBounds> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        L,
        B,
        R,
        T;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        L = layout.offsetof(0);
        B = layout.offsetof(1);
        R = layout.offsetof(2);
        T = layout.offsetof(3);
    }

    protected MSDFGenBounds(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MSDFGenBounds create(long address, @Nullable ByteBuffer container) {
        return new MSDFGenBounds(address, container);
    }

    /**
     * Creates a {@code MSDFGenBounds} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MSDFGenBounds(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code l} field. */
    public double l() { return nl(address()); }
    /** @return the value of the {@code b} field. */
    public double b() { return nb(address()); }
    /** @return the value of the {@code r} field. */
    public double r() { return nr(address()); }
    /** @return the value of the {@code t} field. */
    public double t() { return nt(address()); }

    /** Sets the specified value to the {@code l} field. */
    public MSDFGenBounds l(double value) { nl(address(), value); return this; }
    /** Sets the specified value to the {@code b} field. */
    public MSDFGenBounds b(double value) { nb(address(), value); return this; }
    /** Sets the specified value to the {@code r} field. */
    public MSDFGenBounds r(double value) { nr(address(), value); return this; }
    /** Sets the specified value to the {@code t} field. */
    public MSDFGenBounds t(double value) { nt(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public MSDFGenBounds set(
        double l,
        double b,
        double r,
        double t
    ) {
        l(l);
        b(b);
        r(r);
        t(t);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public MSDFGenBounds set(MSDFGenBounds src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code MSDFGenBounds} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MSDFGenBounds malloc() {
        return new MSDFGenBounds(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MSDFGenBounds} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MSDFGenBounds calloc() {
        return new MSDFGenBounds(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MSDFGenBounds} instance allocated with {@link BufferUtils}. */
    public static MSDFGenBounds create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MSDFGenBounds(memAddress(container), container);
    }

    /** Returns a new {@code MSDFGenBounds} instance for the specified memory address. */
    public static MSDFGenBounds create(long address) {
        return new MSDFGenBounds(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable MSDFGenBounds createSafe(long address) {
        return address == NULL ? null : new MSDFGenBounds(address, null);
    }

    /**
     * Returns a new {@link MSDFGenBounds.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenBounds.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MSDFGenBounds.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenBounds.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MSDFGenBounds.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenBounds.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link MSDFGenBounds.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MSDFGenBounds.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static MSDFGenBounds.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code MSDFGenBounds} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MSDFGenBounds malloc(MemoryStack stack) {
        return new MSDFGenBounds(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MSDFGenBounds} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MSDFGenBounds calloc(MemoryStack stack) {
        return new MSDFGenBounds(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link MSDFGenBounds.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MSDFGenBounds.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MSDFGenBounds.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MSDFGenBounds.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #l}. */
    public static double nl(long struct) { return memGetDouble(struct + MSDFGenBounds.L); }
    /** Unsafe version of {@link #b}. */
    public static double nb(long struct) { return memGetDouble(struct + MSDFGenBounds.B); }
    /** Unsafe version of {@link #r}. */
    public static double nr(long struct) { return memGetDouble(struct + MSDFGenBounds.R); }
    /** Unsafe version of {@link #t}. */
    public static double nt(long struct) { return memGetDouble(struct + MSDFGenBounds.T); }

    /** Unsafe version of {@link #l(double) l}. */
    public static void nl(long struct, double value) { memPutDouble(struct + MSDFGenBounds.L, value); }
    /** Unsafe version of {@link #b(double) b}. */
    public static void nb(long struct, double value) { memPutDouble(struct + MSDFGenBounds.B, value); }
    /** Unsafe version of {@link #r(double) r}. */
    public static void nr(long struct, double value) { memPutDouble(struct + MSDFGenBounds.R, value); }
    /** Unsafe version of {@link #t(double) t}. */
    public static void nt(long struct, double value) { memPutDouble(struct + MSDFGenBounds.T, value); }

    // -----------------------------------

    /** An array of {@link MSDFGenBounds} structs. */
    public static class Buffer extends StructBuffer<MSDFGenBounds, Buffer> implements NativeResource {

        private static final MSDFGenBounds ELEMENT_FACTORY = MSDFGenBounds.create(-1L);

        /**
         * Creates a new {@code MSDFGenBounds.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MSDFGenBounds#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected MSDFGenBounds getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code l} field. */
        public double l() { return MSDFGenBounds.nl(address()); }
        /** @return the value of the {@code b} field. */
        public double b() { return MSDFGenBounds.nb(address()); }
        /** @return the value of the {@code r} field. */
        public double r() { return MSDFGenBounds.nr(address()); }
        /** @return the value of the {@code t} field. */
        public double t() { return MSDFGenBounds.nt(address()); }

        /** Sets the specified value to the {@code l} field. */
        public MSDFGenBounds.Buffer l(double value) { MSDFGenBounds.nl(address(), value); return this; }
        /** Sets the specified value to the {@code b} field. */
        public MSDFGenBounds.Buffer b(double value) { MSDFGenBounds.nb(address(), value); return this; }
        /** Sets the specified value to the {@code r} field. */
        public MSDFGenBounds.Buffer r(double value) { MSDFGenBounds.nr(address(), value); return this; }
        /** Sets the specified value to the {@code t} field. */
        public MSDFGenBounds.Buffer t(double value) { MSDFGenBounds.nt(address(), value); return this; }

    }

}