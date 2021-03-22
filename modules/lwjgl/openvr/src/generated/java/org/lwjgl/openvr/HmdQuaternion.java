/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct HmdQuaternion_t {
 *     double w;
 *     double x;
 *     double y;
 *     double z;
 * }</code></pre>
 */
@NativeType("struct HmdQuaternion_t")
public class HmdQuaternion extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        W,
        X,
        Y,
        Z;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        W = layout.offsetof(0);
        X = layout.offsetof(1);
        Y = layout.offsetof(2);
        Z = layout.offsetof(3);
    }

    /**
     * Creates a {@code HmdQuaternion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public HmdQuaternion(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code w} field. */
    public double w() { return nw(address()); }
    /** @return the value of the {@code x} field. */
    public double x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public double y() { return ny(address()); }
    /** @return the value of the {@code z} field. */
    public double z() { return nz(address()); }

    /** Sets the specified value to the {@code w} field. */
    public HmdQuaternion w(double value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public HmdQuaternion x(double value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public HmdQuaternion y(double value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code z} field. */
    public HmdQuaternion z(double value) { nz(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public HmdQuaternion set(
        double w,
        double x,
        double y,
        double z
    ) {
        w(w);
        x(x);
        y(y);
        z(z);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public HmdQuaternion set(HmdQuaternion src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code HmdQuaternion} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static HmdQuaternion malloc() {
        return wrap(HmdQuaternion.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code HmdQuaternion} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static HmdQuaternion calloc() {
        return wrap(HmdQuaternion.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code HmdQuaternion} instance allocated with {@link BufferUtils}. */
    public static HmdQuaternion create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(HmdQuaternion.class, memAddress(container), container);
    }

    /** Returns a new {@code HmdQuaternion} instance for the specified memory address. */
    public static HmdQuaternion create(long address) {
        return wrap(HmdQuaternion.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static HmdQuaternion createSafe(long address) {
        return address == NULL ? null : wrap(HmdQuaternion.class, address);
    }

    /**
     * Returns a new {@link HmdQuaternion.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HmdQuaternion.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link HmdQuaternion.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HmdQuaternion.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdQuaternion.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static HmdQuaternion.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link HmdQuaternion.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static HmdQuaternion.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static HmdQuaternion.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code HmdQuaternion} instance allocated on the thread-local {@link MemoryStack}. */
    public static HmdQuaternion mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code HmdQuaternion} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static HmdQuaternion callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code HmdQuaternion} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdQuaternion mallocStack(MemoryStack stack) {
        return wrap(HmdQuaternion.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code HmdQuaternion} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static HmdQuaternion callocStack(MemoryStack stack) {
        return wrap(HmdQuaternion.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link HmdQuaternion.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static HmdQuaternion.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link HmdQuaternion.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static HmdQuaternion.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link HmdQuaternion.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HmdQuaternion.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HmdQuaternion.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HmdQuaternion.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #w}. */
    public static double nw(long struct) { return UNSAFE.getDouble(null, struct + HmdQuaternion.W); }
    /** Unsafe version of {@link #x}. */
    public static double nx(long struct) { return UNSAFE.getDouble(null, struct + HmdQuaternion.X); }
    /** Unsafe version of {@link #y}. */
    public static double ny(long struct) { return UNSAFE.getDouble(null, struct + HmdQuaternion.Y); }
    /** Unsafe version of {@link #z}. */
    public static double nz(long struct) { return UNSAFE.getDouble(null, struct + HmdQuaternion.Z); }

    /** Unsafe version of {@link #w(double) w}. */
    public static void nw(long struct, double value) { UNSAFE.putDouble(null, struct + HmdQuaternion.W, value); }
    /** Unsafe version of {@link #x(double) x}. */
    public static void nx(long struct, double value) { UNSAFE.putDouble(null, struct + HmdQuaternion.X, value); }
    /** Unsafe version of {@link #y(double) y}. */
    public static void ny(long struct, double value) { UNSAFE.putDouble(null, struct + HmdQuaternion.Y, value); }
    /** Unsafe version of {@link #z(double) z}. */
    public static void nz(long struct, double value) { UNSAFE.putDouble(null, struct + HmdQuaternion.Z, value); }

    // -----------------------------------

    /** An array of {@link HmdQuaternion} structs. */
    public static class Buffer extends StructBuffer<HmdQuaternion, Buffer> implements NativeResource {

        private static final HmdQuaternion ELEMENT_FACTORY = HmdQuaternion.create(-1L);

        /**
         * Creates a new {@code HmdQuaternion.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link HmdQuaternion#SIZEOF}, and its mark will be undefined.
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
        protected HmdQuaternion getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code w} field. */
        public double w() { return HmdQuaternion.nw(address()); }
        /** @return the value of the {@code x} field. */
        public double x() { return HmdQuaternion.nx(address()); }
        /** @return the value of the {@code y} field. */
        public double y() { return HmdQuaternion.ny(address()); }
        /** @return the value of the {@code z} field. */
        public double z() { return HmdQuaternion.nz(address()); }

        /** Sets the specified value to the {@code w} field. */
        public HmdQuaternion.Buffer w(double value) { HmdQuaternion.nw(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public HmdQuaternion.Buffer x(double value) { HmdQuaternion.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public HmdQuaternion.Buffer y(double value) { HmdQuaternion.ny(address(), value); return this; }
        /** Sets the specified value to the {@code z} field. */
        public HmdQuaternion.Buffer z(double value) { HmdQuaternion.nz(address(), value); return this; }

    }

}