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
 * A quaternion rotation.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrQuatf {
 *     float {@link #x};
 *     float {@link #y};
 *     float {@link #z};
 *     float {@link #w};
 * }</code></pre>
 */
@NativeType("struct ovrQuatf")
public class OVRQuatf extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        Z,
        W;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        Z = layout.offsetof(2);
        W = layout.offsetof(3);
    }

    /**
     * Creates a {@code OVRQuatf} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRQuatf(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the vector x component */
    public float x() { return nx(address()); }
    /** the vector y component */
    public float y() { return ny(address()); }
    /** the vector z component */
    public float z() { return nz(address()); }
    /** the vector w component */
    public float w() { return nw(address()); }

    /** Sets the specified value to the {@link #x} field. */
    public OVRQuatf x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public OVRQuatf y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@link #z} field. */
    public OVRQuatf z(float value) { nz(address(), value); return this; }
    /** Sets the specified value to the {@link #w} field. */
    public OVRQuatf w(float value) { nw(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRQuatf set(
        float x,
        float y,
        float z,
        float w
    ) {
        x(x);
        y(y);
        z(z);
        w(w);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRQuatf set(OVRQuatf src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRQuatf} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRQuatf malloc() {
        return wrap(OVRQuatf.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRQuatf} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRQuatf calloc() {
        return wrap(OVRQuatf.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRQuatf} instance allocated with {@link BufferUtils}. */
    public static OVRQuatf create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRQuatf.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRQuatf} instance for the specified memory address. */
    public static OVRQuatf create(long address) {
        return wrap(OVRQuatf.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRQuatf createSafe(long address) {
        return address == NULL ? null : wrap(OVRQuatf.class, address);
    }

    /**
     * Returns a new {@link OVRQuatf.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRQuatf.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRQuatf.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRQuatf.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRQuatf.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRQuatf.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRQuatf.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRQuatf.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRQuatf.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRQuatf mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRQuatf callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRQuatf mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRQuatf callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRQuatf.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRQuatf.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRQuatf.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRQuatf.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRQuatf} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRQuatf malloc(MemoryStack stack) {
        return wrap(OVRQuatf.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRQuatf} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRQuatf calloc(MemoryStack stack) {
        return wrap(OVRQuatf.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRQuatf.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRQuatf.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRQuatf.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRQuatf.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return UNSAFE.getFloat(null, struct + OVRQuatf.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return UNSAFE.getFloat(null, struct + OVRQuatf.Y); }
    /** Unsafe version of {@link #z}. */
    public static float nz(long struct) { return UNSAFE.getFloat(null, struct + OVRQuatf.Z); }
    /** Unsafe version of {@link #w}. */
    public static float nw(long struct) { return UNSAFE.getFloat(null, struct + OVRQuatf.W); }

    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { UNSAFE.putFloat(null, struct + OVRQuatf.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { UNSAFE.putFloat(null, struct + OVRQuatf.Y, value); }
    /** Unsafe version of {@link #z(float) z}. */
    public static void nz(long struct, float value) { UNSAFE.putFloat(null, struct + OVRQuatf.Z, value); }
    /** Unsafe version of {@link #w(float) w}. */
    public static void nw(long struct, float value) { UNSAFE.putFloat(null, struct + OVRQuatf.W, value); }

    // -----------------------------------

    /** An array of {@link OVRQuatf} structs. */
    public static class Buffer extends StructBuffer<OVRQuatf, Buffer> implements NativeResource {

        private static final OVRQuatf ELEMENT_FACTORY = OVRQuatf.create(-1L);

        /**
         * Creates a new {@code OVRQuatf.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRQuatf#SIZEOF}, and its mark will be undefined.
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
        protected OVRQuatf getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link OVRQuatf#x} field. */
        public float x() { return OVRQuatf.nx(address()); }
        /** @return the value of the {@link OVRQuatf#y} field. */
        public float y() { return OVRQuatf.ny(address()); }
        /** @return the value of the {@link OVRQuatf#z} field. */
        public float z() { return OVRQuatf.nz(address()); }
        /** @return the value of the {@link OVRQuatf#w} field. */
        public float w() { return OVRQuatf.nw(address()); }

        /** Sets the specified value to the {@link OVRQuatf#x} field. */
        public OVRQuatf.Buffer x(float value) { OVRQuatf.nx(address(), value); return this; }
        /** Sets the specified value to the {@link OVRQuatf#y} field. */
        public OVRQuatf.Buffer y(float value) { OVRQuatf.ny(address(), value); return this; }
        /** Sets the specified value to the {@link OVRQuatf#z} field. */
        public OVRQuatf.Buffer z(float value) { OVRQuatf.nz(address(), value); return this; }
        /** Sets the specified value to the {@link OVRQuatf#w} field. */
        public OVRQuatf.Buffer w(float value) { OVRQuatf.nw(address(), value); return this; }

    }

}