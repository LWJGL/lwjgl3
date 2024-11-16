/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Unit Quaternion.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrCompositionLayerCubeKHR}, {@link XrPosef}, {@link XrVector2f}, {@link XrVector3f}, {@link XrVector4f}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrQuaternionf {
 *     float {@link #x};
 *     float {@link #y};
 *     float {@link #z};
 *     float {@link #w};
 * }</code></pre>
 */
public class XrQuaternionf extends Struct<XrQuaternionf> implements NativeResource {

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

    protected XrQuaternionf(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrQuaternionf create(long address, @Nullable ByteBuffer container) {
        return new XrQuaternionf(address, container);
    }

    /**
     * Creates a {@code XrQuaternionf} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrQuaternionf(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the x coordinate of the quaternion. */
    public float x() { return nx(address()); }
    /** the y coordinate of the quaternion. */
    public float y() { return ny(address()); }
    /** the z coordinate of the quaternion. */
    public float z() { return nz(address()); }
    /** the w coordinate of the quaternion. */
    public float w() { return nw(address()); }

    /** Sets the specified value to the {@link #x} field. */
    public XrQuaternionf x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public XrQuaternionf y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@link #z} field. */
    public XrQuaternionf z(float value) { nz(address(), value); return this; }
    /** Sets the specified value to the {@link #w} field. */
    public XrQuaternionf w(float value) { nw(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrQuaternionf set(
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
    public XrQuaternionf set(XrQuaternionf src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrQuaternionf} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrQuaternionf malloc() {
        return new XrQuaternionf(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrQuaternionf} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrQuaternionf calloc() {
        return new XrQuaternionf(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrQuaternionf} instance allocated with {@link BufferUtils}. */
    public static XrQuaternionf create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrQuaternionf(memAddress(container), container);
    }

    /** Returns a new {@code XrQuaternionf} instance for the specified memory address. */
    public static XrQuaternionf create(long address) {
        return new XrQuaternionf(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrQuaternionf createSafe(long address) {
        return address == NULL ? null : new XrQuaternionf(address, null);
    }

    /**
     * Returns a new {@link XrQuaternionf.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrQuaternionf.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrQuaternionf.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrQuaternionf.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrQuaternionf.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrQuaternionf.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrQuaternionf.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrQuaternionf.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrQuaternionf.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrQuaternionf} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrQuaternionf malloc(MemoryStack stack) {
        return new XrQuaternionf(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrQuaternionf} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrQuaternionf calloc(MemoryStack stack) {
        return new XrQuaternionf(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrQuaternionf.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrQuaternionf.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrQuaternionf.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrQuaternionf.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + XrQuaternionf.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + XrQuaternionf.Y); }
    /** Unsafe version of {@link #z}. */
    public static float nz(long struct) { return memGetFloat(struct + XrQuaternionf.Z); }
    /** Unsafe version of {@link #w}. */
    public static float nw(long struct) { return memGetFloat(struct + XrQuaternionf.W); }

    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { memPutFloat(struct + XrQuaternionf.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { memPutFloat(struct + XrQuaternionf.Y, value); }
    /** Unsafe version of {@link #z(float) z}. */
    public static void nz(long struct, float value) { memPutFloat(struct + XrQuaternionf.Z, value); }
    /** Unsafe version of {@link #w(float) w}. */
    public static void nw(long struct, float value) { memPutFloat(struct + XrQuaternionf.W, value); }

    // -----------------------------------

    /** An array of {@link XrQuaternionf} structs. */
    public static class Buffer extends StructBuffer<XrQuaternionf, Buffer> implements NativeResource {

        private static final XrQuaternionf ELEMENT_FACTORY = XrQuaternionf.create(-1L);

        /**
         * Creates a new {@code XrQuaternionf.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrQuaternionf#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrQuaternionf getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrQuaternionf#x} field. */
        public float x() { return XrQuaternionf.nx(address()); }
        /** @return the value of the {@link XrQuaternionf#y} field. */
        public float y() { return XrQuaternionf.ny(address()); }
        /** @return the value of the {@link XrQuaternionf#z} field. */
        public float z() { return XrQuaternionf.nz(address()); }
        /** @return the value of the {@link XrQuaternionf#w} field. */
        public float w() { return XrQuaternionf.nw(address()); }

        /** Sets the specified value to the {@link XrQuaternionf#x} field. */
        public XrQuaternionf.Buffer x(float value) { XrQuaternionf.nx(address(), value); return this; }
        /** Sets the specified value to the {@link XrQuaternionf#y} field. */
        public XrQuaternionf.Buffer y(float value) { XrQuaternionf.ny(address(), value); return this; }
        /** Sets the specified value to the {@link XrQuaternionf#z} field. */
        public XrQuaternionf.Buffer z(float value) { XrQuaternionf.nz(address(), value); return this; }
        /** Sets the specified value to the {@link XrQuaternionf#w} field. */
        public XrQuaternionf.Buffer w(float value) { XrQuaternionf.nw(address(), value); return this; }

    }

}