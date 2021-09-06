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
 * Allows the application to control what part of the provided texture will be used in the frame buffer.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VRTextureBounds_t {
 *     float uMin;
 *     float vMin;
 *     float uMax;
 *     float vMax;
 * }</code></pre>
 */
@NativeType("struct VRTextureBounds_t")
public class VRTextureBounds extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        UMIN,
        VMIN,
        UMAX,
        VMAX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        UMIN = layout.offsetof(0);
        VMIN = layout.offsetof(1);
        UMAX = layout.offsetof(2);
        VMAX = layout.offsetof(3);
    }

    /**
     * Creates a {@code VRTextureBounds} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VRTextureBounds(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code uMin} field. */
    public float uMin() { return nuMin(address()); }
    /** @return the value of the {@code vMin} field. */
    public float vMin() { return nvMin(address()); }
    /** @return the value of the {@code uMax} field. */
    public float uMax() { return nuMax(address()); }
    /** @return the value of the {@code vMax} field. */
    public float vMax() { return nvMax(address()); }

    /** Sets the specified value to the {@code uMin} field. */
    public VRTextureBounds uMin(float value) { nuMin(address(), value); return this; }
    /** Sets the specified value to the {@code vMin} field. */
    public VRTextureBounds vMin(float value) { nvMin(address(), value); return this; }
    /** Sets the specified value to the {@code uMax} field. */
    public VRTextureBounds uMax(float value) { nuMax(address(), value); return this; }
    /** Sets the specified value to the {@code vMax} field. */
    public VRTextureBounds vMax(float value) { nvMax(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VRTextureBounds set(
        float uMin,
        float vMin,
        float uMax,
        float vMax
    ) {
        uMin(uMin);
        vMin(vMin);
        uMax(uMax);
        vMax(vMax);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VRTextureBounds set(VRTextureBounds src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VRTextureBounds} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VRTextureBounds malloc() {
        return wrap(VRTextureBounds.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VRTextureBounds} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VRTextureBounds calloc() {
        return wrap(VRTextureBounds.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VRTextureBounds} instance allocated with {@link BufferUtils}. */
    public static VRTextureBounds create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VRTextureBounds.class, memAddress(container), container);
    }

    /** Returns a new {@code VRTextureBounds} instance for the specified memory address. */
    public static VRTextureBounds create(long address) {
        return wrap(VRTextureBounds.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRTextureBounds createSafe(long address) {
        return address == NULL ? null : wrap(VRTextureBounds.class, address);
    }

    /**
     * Returns a new {@link VRTextureBounds.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureBounds.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VRTextureBounds.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureBounds.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRTextureBounds.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VRTextureBounds.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VRTextureBounds.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VRTextureBounds.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRTextureBounds.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VRTextureBounds mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VRTextureBounds callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VRTextureBounds mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VRTextureBounds callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VRTextureBounds.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VRTextureBounds.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VRTextureBounds.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VRTextureBounds.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VRTextureBounds} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VRTextureBounds malloc(MemoryStack stack) {
        return wrap(VRTextureBounds.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VRTextureBounds} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VRTextureBounds calloc(MemoryStack stack) {
        return wrap(VRTextureBounds.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VRTextureBounds.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRTextureBounds.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRTextureBounds.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRTextureBounds.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #uMin}. */
    public static float nuMin(long struct) { return UNSAFE.getFloat(null, struct + VRTextureBounds.UMIN); }
    /** Unsafe version of {@link #vMin}. */
    public static float nvMin(long struct) { return UNSAFE.getFloat(null, struct + VRTextureBounds.VMIN); }
    /** Unsafe version of {@link #uMax}. */
    public static float nuMax(long struct) { return UNSAFE.getFloat(null, struct + VRTextureBounds.UMAX); }
    /** Unsafe version of {@link #vMax}. */
    public static float nvMax(long struct) { return UNSAFE.getFloat(null, struct + VRTextureBounds.VMAX); }

    /** Unsafe version of {@link #uMin(float) uMin}. */
    public static void nuMin(long struct, float value) { UNSAFE.putFloat(null, struct + VRTextureBounds.UMIN, value); }
    /** Unsafe version of {@link #vMin(float) vMin}. */
    public static void nvMin(long struct, float value) { UNSAFE.putFloat(null, struct + VRTextureBounds.VMIN, value); }
    /** Unsafe version of {@link #uMax(float) uMax}. */
    public static void nuMax(long struct, float value) { UNSAFE.putFloat(null, struct + VRTextureBounds.UMAX, value); }
    /** Unsafe version of {@link #vMax(float) vMax}. */
    public static void nvMax(long struct, float value) { UNSAFE.putFloat(null, struct + VRTextureBounds.VMAX, value); }

    // -----------------------------------

    /** An array of {@link VRTextureBounds} structs. */
    public static class Buffer extends StructBuffer<VRTextureBounds, Buffer> implements NativeResource {

        private static final VRTextureBounds ELEMENT_FACTORY = VRTextureBounds.create(-1L);

        /**
         * Creates a new {@code VRTextureBounds.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VRTextureBounds#SIZEOF}, and its mark will be undefined.
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
        protected VRTextureBounds getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code uMin} field. */
        public float uMin() { return VRTextureBounds.nuMin(address()); }
        /** @return the value of the {@code vMin} field. */
        public float vMin() { return VRTextureBounds.nvMin(address()); }
        /** @return the value of the {@code uMax} field. */
        public float uMax() { return VRTextureBounds.nuMax(address()); }
        /** @return the value of the {@code vMax} field. */
        public float vMax() { return VRTextureBounds.nvMax(address()); }

        /** Sets the specified value to the {@code uMin} field. */
        public VRTextureBounds.Buffer uMin(float value) { VRTextureBounds.nuMin(address(), value); return this; }
        /** Sets the specified value to the {@code vMin} field. */
        public VRTextureBounds.Buffer vMin(float value) { VRTextureBounds.nvMin(address(), value); return this; }
        /** Sets the specified value to the {@code uMax} field. */
        public VRTextureBounds.Buffer uMax(float value) { VRTextureBounds.nuMax(address(), value); return this; }
        /** Sets the specified value to the {@code vMax} field. */
        public VRTextureBounds.Buffer vMax(float value) { VRTextureBounds.nvMax(address(), value); return this; }

    }

}