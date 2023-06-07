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
 * Represents a point of 3D space.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is used for component values that may be fractional (floating-point). If used to represent physical distances, values must be in meters.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBScene XR_FB_scene} extension <b>must</b> be enabled prior to using {@link XrOffset3DfFB}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrRect3DfFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrOffset3DfFB {
 *     float {@link #x};
 *     float {@link #y};
 *     float {@link #z};
 * }</code></pre>
 */
public class XrOffset3DfFB extends Struct<XrOffset3DfFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        Z;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        Z = layout.offsetof(2);
    }

    protected XrOffset3DfFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrOffset3DfFB create(long address, @Nullable ByteBuffer container) {
        return new XrOffset3DfFB(address, container);
    }

    /**
     * Creates a {@code XrOffset3DfFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrOffset3DfFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the floating-point offset in the x direction. */
    public float x() { return nx(address()); }
    /** the floating-point offset in the y direction. */
    public float y() { return ny(address()); }
    /** the floating-point offset in the z direction. */
    public float z() { return nz(address()); }

    /** Sets the specified value to the {@link #x} field. */
    public XrOffset3DfFB x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@link #y} field. */
    public XrOffset3DfFB y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@link #z} field. */
    public XrOffset3DfFB z(float value) { nz(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrOffset3DfFB set(
        float x,
        float y,
        float z
    ) {
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
    public XrOffset3DfFB set(XrOffset3DfFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrOffset3DfFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrOffset3DfFB malloc() {
        return new XrOffset3DfFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrOffset3DfFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrOffset3DfFB calloc() {
        return new XrOffset3DfFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrOffset3DfFB} instance allocated with {@link BufferUtils}. */
    public static XrOffset3DfFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrOffset3DfFB(memAddress(container), container);
    }

    /** Returns a new {@code XrOffset3DfFB} instance for the specified memory address. */
    public static XrOffset3DfFB create(long address) {
        return new XrOffset3DfFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrOffset3DfFB createSafe(long address) {
        return address == NULL ? null : new XrOffset3DfFB(address, null);
    }

    /**
     * Returns a new {@link XrOffset3DfFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrOffset3DfFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrOffset3DfFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrOffset3DfFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrOffset3DfFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrOffset3DfFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrOffset3DfFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrOffset3DfFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrOffset3DfFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrOffset3DfFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrOffset3DfFB malloc(MemoryStack stack) {
        return new XrOffset3DfFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrOffset3DfFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrOffset3DfFB calloc(MemoryStack stack) {
        return new XrOffset3DfFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrOffset3DfFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrOffset3DfFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrOffset3DfFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrOffset3DfFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return UNSAFE.getFloat(null, struct + XrOffset3DfFB.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return UNSAFE.getFloat(null, struct + XrOffset3DfFB.Y); }
    /** Unsafe version of {@link #z}. */
    public static float nz(long struct) { return UNSAFE.getFloat(null, struct + XrOffset3DfFB.Z); }

    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { UNSAFE.putFloat(null, struct + XrOffset3DfFB.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { UNSAFE.putFloat(null, struct + XrOffset3DfFB.Y, value); }
    /** Unsafe version of {@link #z(float) z}. */
    public static void nz(long struct, float value) { UNSAFE.putFloat(null, struct + XrOffset3DfFB.Z, value); }

    // -----------------------------------

    /** An array of {@link XrOffset3DfFB} structs. */
    public static class Buffer extends StructBuffer<XrOffset3DfFB, Buffer> implements NativeResource {

        private static final XrOffset3DfFB ELEMENT_FACTORY = XrOffset3DfFB.create(-1L);

        /**
         * Creates a new {@code XrOffset3DfFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrOffset3DfFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrOffset3DfFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrOffset3DfFB#x} field. */
        public float x() { return XrOffset3DfFB.nx(address()); }
        /** @return the value of the {@link XrOffset3DfFB#y} field. */
        public float y() { return XrOffset3DfFB.ny(address()); }
        /** @return the value of the {@link XrOffset3DfFB#z} field. */
        public float z() { return XrOffset3DfFB.nz(address()); }

        /** Sets the specified value to the {@link XrOffset3DfFB#x} field. */
        public XrOffset3DfFB.Buffer x(float value) { XrOffset3DfFB.nx(address(), value); return this; }
        /** Sets the specified value to the {@link XrOffset3DfFB#y} field. */
        public XrOffset3DfFB.Buffer y(float value) { XrOffset3DfFB.ny(address(), value); return this; }
        /** Sets the specified value to the {@link XrOffset3DfFB#z} field. */
        public XrOffset3DfFB.Buffer z(float value) { XrOffset3DfFB.nz(address(), value); return this; }

    }

}