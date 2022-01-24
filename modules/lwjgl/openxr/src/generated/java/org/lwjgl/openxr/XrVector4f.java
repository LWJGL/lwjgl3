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
 * Four-dimensional vector.
 * 
 * <h5>Description</h5>
 * 
 * <p>If used to represent physical distances, {@code x}, {@code y}, and {@code z} values <b>must</b> be in meters.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrHandTrackingMeshFB}, {@link XrPosef}, {@link XrQuaternionf}, {@link XrVector2f}, {@link XrVector3f}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrVector4f {
 *     float {@link #x};
 *     float {@link #y};
 *     float {@link #z};
 *     float {@link #w};
 * }</code></pre>
 */
public class XrVector4f extends Struct implements NativeResource {

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
     * Creates a {@code XrVector4f} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVector4f(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the x coordinate of the vector. */
    public float x() { return nx(address()); }
    /** the y coordinate of the vector. */
    public float y() { return ny(address()); }
    /** the z coordinate of the vector. */
    public float z() { return nz(address()); }
    /** the w coordinate of the vector. */
    public float w() { return nw(address()); }

    /** Sets the specified value to the {@link #x} field. */
    public XrVector4f x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public XrVector4f y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@link #z} field. */
    public XrVector4f z(float value) { nz(address(), value); return this; }
    /** Sets the specified value to the {@link #w} field. */
    public XrVector4f w(float value) { nw(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrVector4f set(
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
    public XrVector4f set(XrVector4f src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVector4f} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVector4f malloc() {
        return wrap(XrVector4f.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrVector4f} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVector4f calloc() {
        return wrap(XrVector4f.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrVector4f} instance allocated with {@link BufferUtils}. */
    public static XrVector4f create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrVector4f.class, memAddress(container), container);
    }

    /** Returns a new {@code XrVector4f} instance for the specified memory address. */
    public static XrVector4f create(long address) {
        return wrap(XrVector4f.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVector4f createSafe(long address) {
        return address == NULL ? null : wrap(XrVector4f.class, address);
    }

    /**
     * Returns a new {@link XrVector4f.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVector4f.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVector4f.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVector4f.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVector4f.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVector4f.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrVector4f.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVector4f.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVector4f.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrVector4f} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVector4f malloc(MemoryStack stack) {
        return wrap(XrVector4f.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrVector4f} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVector4f calloc(MemoryStack stack) {
        return wrap(XrVector4f.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrVector4f.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVector4f.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVector4f.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVector4f.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return UNSAFE.getFloat(null, struct + XrVector4f.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return UNSAFE.getFloat(null, struct + XrVector4f.Y); }
    /** Unsafe version of {@link #z}. */
    public static float nz(long struct) { return UNSAFE.getFloat(null, struct + XrVector4f.Z); }
    /** Unsafe version of {@link #w}. */
    public static float nw(long struct) { return UNSAFE.getFloat(null, struct + XrVector4f.W); }

    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { UNSAFE.putFloat(null, struct + XrVector4f.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { UNSAFE.putFloat(null, struct + XrVector4f.Y, value); }
    /** Unsafe version of {@link #z(float) z}. */
    public static void nz(long struct, float value) { UNSAFE.putFloat(null, struct + XrVector4f.Z, value); }
    /** Unsafe version of {@link #w(float) w}. */
    public static void nw(long struct, float value) { UNSAFE.putFloat(null, struct + XrVector4f.W, value); }

    // -----------------------------------

    /** An array of {@link XrVector4f} structs. */
    public static class Buffer extends StructBuffer<XrVector4f, Buffer> implements NativeResource {

        private static final XrVector4f ELEMENT_FACTORY = XrVector4f.create(-1L);

        /**
         * Creates a new {@code XrVector4f.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVector4f#SIZEOF}, and its mark will be undefined.
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
        protected XrVector4f getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrVector4f#x} field. */
        public float x() { return XrVector4f.nx(address()); }
        /** @return the value of the {@link XrVector4f#y} field. */
        public float y() { return XrVector4f.ny(address()); }
        /** @return the value of the {@link XrVector4f#z} field. */
        public float z() { return XrVector4f.nz(address()); }
        /** @return the value of the {@link XrVector4f#w} field. */
        public float w() { return XrVector4f.nw(address()); }

        /** Sets the specified value to the {@link XrVector4f#x} field. */
        public XrVector4f.Buffer x(float value) { XrVector4f.nx(address(), value); return this; }
        /** Sets the specified value to the {@link XrVector4f#y} field. */
        public XrVector4f.Buffer y(float value) { XrVector4f.ny(address(), value); return this; }
        /** Sets the specified value to the {@link XrVector4f#z} field. */
        public XrVector4f.Buffer z(float value) { XrVector4f.nz(address(), value); return this; }
        /** Sets the specified value to the {@link XrVector4f#w} field. */
        public XrVector4f.Buffer w(float value) { XrVector4f.nw(address(), value); return this; }

    }

}