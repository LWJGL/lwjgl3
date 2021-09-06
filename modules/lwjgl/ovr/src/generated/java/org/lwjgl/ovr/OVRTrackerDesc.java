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
 * Specifies the description of a single sensor.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrTrackerDesc {
 *     float {@link #FrustumHFovInRadians};
 *     float {@link #FrustumVFovInRadians};
 *     float {@link #FrustumNearZInMeters};
 *     float {@link #FrustumFarZInMeters};
 * }</code></pre>
 */
@NativeType("struct ovrTrackerDesc")
public class OVRTrackerDesc extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FRUSTUMHFOVINRADIANS,
        FRUSTUMVFOVINRADIANS,
        FRUSTUMNEARZINMETERS,
        FRUSTUMFARZINMETERS;

    static {
        Layout layout = __struct(
            DEFAULT_PACK_ALIGNMENT, POINTER_SIZE,
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FRUSTUMHFOVINRADIANS = layout.offsetof(0);
        FRUSTUMVFOVINRADIANS = layout.offsetof(1);
        FRUSTUMNEARZINMETERS = layout.offsetof(2);
        FRUSTUMFARZINMETERS = layout.offsetof(3);
    }

    /**
     * Creates a {@code OVRTrackerDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRTrackerDesc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** sensor frustum horizontal field-of-view (if present). */
    public float FrustumHFovInRadians() { return nFrustumHFovInRadians(address()); }
    /** sensor frustum vertical field-of-view (if present). */
    public float FrustumVFovInRadians() { return nFrustumVFovInRadians(address()); }
    /** sensor frustum near Z (if present). */
    public float FrustumNearZInMeters() { return nFrustumNearZInMeters(address()); }
    /** sensor frustum far Z (if present). */
    public float FrustumFarZInMeters() { return nFrustumFarZInMeters(address()); }

    // -----------------------------------

    /** Returns a new {@code OVRTrackerDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRTrackerDesc malloc() {
        return wrap(OVRTrackerDesc.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRTrackerDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRTrackerDesc calloc() {
        return wrap(OVRTrackerDesc.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRTrackerDesc} instance allocated with {@link BufferUtils}. */
    public static OVRTrackerDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRTrackerDesc.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRTrackerDesc} instance for the specified memory address. */
    public static OVRTrackerDesc create(long address) {
        return wrap(OVRTrackerDesc.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRTrackerDesc createSafe(long address) {
        return address == NULL ? null : wrap(OVRTrackerDesc.class, address);
    }

    /**
     * Returns a new {@link OVRTrackerDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTrackerDesc.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRTrackerDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTrackerDesc.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRTrackerDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTrackerDesc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRTrackerDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRTrackerDesc.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRTrackerDesc.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRTrackerDesc mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRTrackerDesc callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRTrackerDesc mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRTrackerDesc callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRTrackerDesc.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRTrackerDesc.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRTrackerDesc.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRTrackerDesc.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRTrackerDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRTrackerDesc malloc(MemoryStack stack) {
        return wrap(OVRTrackerDesc.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRTrackerDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRTrackerDesc calloc(MemoryStack stack) {
        return wrap(OVRTrackerDesc.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRTrackerDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRTrackerDesc.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRTrackerDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRTrackerDesc.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #FrustumHFovInRadians}. */
    public static float nFrustumHFovInRadians(long struct) { return UNSAFE.getFloat(null, struct + OVRTrackerDesc.FRUSTUMHFOVINRADIANS); }
    /** Unsafe version of {@link #FrustumVFovInRadians}. */
    public static float nFrustumVFovInRadians(long struct) { return UNSAFE.getFloat(null, struct + OVRTrackerDesc.FRUSTUMVFOVINRADIANS); }
    /** Unsafe version of {@link #FrustumNearZInMeters}. */
    public static float nFrustumNearZInMeters(long struct) { return UNSAFE.getFloat(null, struct + OVRTrackerDesc.FRUSTUMNEARZINMETERS); }
    /** Unsafe version of {@link #FrustumFarZInMeters}. */
    public static float nFrustumFarZInMeters(long struct) { return UNSAFE.getFloat(null, struct + OVRTrackerDesc.FRUSTUMFARZINMETERS); }

    // -----------------------------------

    /** An array of {@link OVRTrackerDesc} structs. */
    public static class Buffer extends StructBuffer<OVRTrackerDesc, Buffer> implements NativeResource {

        private static final OVRTrackerDesc ELEMENT_FACTORY = OVRTrackerDesc.create(-1L);

        /**
         * Creates a new {@code OVRTrackerDesc.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRTrackerDesc#SIZEOF}, and its mark will be undefined.
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
        protected OVRTrackerDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link OVRTrackerDesc#FrustumHFovInRadians} field. */
        public float FrustumHFovInRadians() { return OVRTrackerDesc.nFrustumHFovInRadians(address()); }
        /** @return the value of the {@link OVRTrackerDesc#FrustumVFovInRadians} field. */
        public float FrustumVFovInRadians() { return OVRTrackerDesc.nFrustumVFovInRadians(address()); }
        /** @return the value of the {@link OVRTrackerDesc#FrustumNearZInMeters} field. */
        public float FrustumNearZInMeters() { return OVRTrackerDesc.nFrustumNearZInMeters(address()); }
        /** @return the value of the {@link OVRTrackerDesc#FrustumFarZInMeters} field. */
        public float FrustumFarZInMeters() { return OVRTrackerDesc.nFrustumFarZInMeters(address()); }

    }

}