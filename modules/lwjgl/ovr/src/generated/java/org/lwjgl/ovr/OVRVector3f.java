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
 * A 3D vector with float components.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code x} &ndash; the vector x component</li>
 * <li>{@code y} &ndash; the vector y component</li>
 * <li>{@code z} &ndash; the vector z component</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrVector3f {
 *     float x;
 *     float y;
 *     float z;
 * }</code></pre>
 */
@NativeType("struct ovrVector3f")
public class OVRVector3f extends Struct implements NativeResource {

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

    /**
     * Creates a {@code OVRVector3f} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRVector3f(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** Returns the value of the {@code z} field. */
    public float z() { return nz(address()); }

    /** Sets the specified value to the {@code x} field. */
    public OVRVector3f x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public OVRVector3f y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code z} field. */
    public OVRVector3f z(float value) { nz(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRVector3f set(
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
    public OVRVector3f set(OVRVector3f src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRVector3f} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRVector3f malloc() {
        return wrap(OVRVector3f.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRVector3f} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRVector3f calloc() {
        return wrap(OVRVector3f.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRVector3f} instance allocated with {@link BufferUtils}. */
    public static OVRVector3f create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRVector3f.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRVector3f} instance for the specified memory address. */
    public static OVRVector3f create(long address) {
        return wrap(OVRVector3f.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRVector3f createSafe(long address) {
        return address == NULL ? null : wrap(OVRVector3f.class, address);
    }

    /**
     * Returns a new {@link OVRVector3f.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRVector3f.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRVector3f.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRVector3f.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRVector3f.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRVector3f.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRVector3f.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRVector3f.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRVector3f.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code OVRVector3f} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRVector3f mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code OVRVector3f} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRVector3f callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code OVRVector3f} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRVector3f mallocStack(MemoryStack stack) {
        return wrap(OVRVector3f.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRVector3f} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRVector3f callocStack(MemoryStack stack) {
        return wrap(OVRVector3f.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRVector3f.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRVector3f.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRVector3f.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRVector3f.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRVector3f.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRVector3f.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRVector3f.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRVector3f.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return UNSAFE.getFloat(null, struct + OVRVector3f.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return UNSAFE.getFloat(null, struct + OVRVector3f.Y); }
    /** Unsafe version of {@link #z}. */
    public static float nz(long struct) { return UNSAFE.getFloat(null, struct + OVRVector3f.Z); }

    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { UNSAFE.putFloat(null, struct + OVRVector3f.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { UNSAFE.putFloat(null, struct + OVRVector3f.Y, value); }
    /** Unsafe version of {@link #z(float) z}. */
    public static void nz(long struct, float value) { UNSAFE.putFloat(null, struct + OVRVector3f.Z, value); }

    // -----------------------------------

    /** An array of {@link OVRVector3f} structs. */
    public static class Buffer extends StructBuffer<OVRVector3f, Buffer> implements NativeResource {

        private static final OVRVector3f ELEMENT_FACTORY = OVRVector3f.create(-1L);

        /**
         * Creates a new {@code OVRVector3f.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRVector3f#SIZEOF}, and its mark will be undefined.
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
        protected OVRVector3f getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code x} field. */
        public float x() { return OVRVector3f.nx(address()); }
        /** Returns the value of the {@code y} field. */
        public float y() { return OVRVector3f.ny(address()); }
        /** Returns the value of the {@code z} field. */
        public float z() { return OVRVector3f.nz(address()); }

        /** Sets the specified value to the {@code x} field. */
        public OVRVector3f.Buffer x(float value) { OVRVector3f.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public OVRVector3f.Buffer y(float value) { OVRVector3f.ny(address(), value); return this; }
        /** Sets the specified value to the {@code z} field. */
        public OVRVector3f.Buffer z(float value) { OVRVector3f.nz(address(), value); return this; }

    }

}