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
 * struct VROverlayIntersectionResults_t {
 *     {@link HmdVector3 HmdVector3_t} vPoint;
 *     {@link HmdVector3 HmdVector3_t} vNormal;
 *     {@link HmdVector2 HmdVector2_t} vUVs;
 *     float fDistance;
 * }</code></pre>
 */
@NativeType("struct VROverlayIntersectionResults_t")
public class VROverlayIntersectionResults extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VPOINT,
        VNORMAL,
        VUVS,
        FDISTANCE;

    static {
        Layout layout = __struct(
            __member(HmdVector3.SIZEOF, HmdVector3.ALIGNOF),
            __member(HmdVector3.SIZEOF, HmdVector3.ALIGNOF),
            __member(HmdVector2.SIZEOF, HmdVector2.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VPOINT = layout.offsetof(0);
        VNORMAL = layout.offsetof(1);
        VUVS = layout.offsetof(2);
        FDISTANCE = layout.offsetof(3);
    }

    /**
     * Creates a {@code VROverlayIntersectionResults} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VROverlayIntersectionResults(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link HmdVector3} view of the {@code vPoint} field. */
    @NativeType("HmdVector3_t")
    public HmdVector3 vPoint() { return nvPoint(address()); }
    /** @return a {@link HmdVector3} view of the {@code vNormal} field. */
    @NativeType("HmdVector3_t")
    public HmdVector3 vNormal() { return nvNormal(address()); }
    /** @return a {@link HmdVector2} view of the {@code vUVs} field. */
    @NativeType("HmdVector2_t")
    public HmdVector2 vUVs() { return nvUVs(address()); }
    /** @return the value of the {@code fDistance} field. */
    public float fDistance() { return nfDistance(address()); }

    // -----------------------------------

    /** Returns a new {@code VROverlayIntersectionResults} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VROverlayIntersectionResults malloc() {
        return wrap(VROverlayIntersectionResults.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VROverlayIntersectionResults} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VROverlayIntersectionResults calloc() {
        return wrap(VROverlayIntersectionResults.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VROverlayIntersectionResults} instance allocated with {@link BufferUtils}. */
    public static VROverlayIntersectionResults create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VROverlayIntersectionResults.class, memAddress(container), container);
    }

    /** Returns a new {@code VROverlayIntersectionResults} instance for the specified memory address. */
    public static VROverlayIntersectionResults create(long address) {
        return wrap(VROverlayIntersectionResults.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VROverlayIntersectionResults createSafe(long address) {
        return address == NULL ? null : wrap(VROverlayIntersectionResults.class, address);
    }

    /**
     * Returns a new {@link VROverlayIntersectionResults.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionResults.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionResults.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionResults.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionResults.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionResults.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VROverlayIntersectionResults.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionResults.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VROverlayIntersectionResults.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionResults mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionResults callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionResults mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionResults callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionResults.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionResults.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionResults.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VROverlayIntersectionResults.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VROverlayIntersectionResults} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VROverlayIntersectionResults malloc(MemoryStack stack) {
        return wrap(VROverlayIntersectionResults.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VROverlayIntersectionResults} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VROverlayIntersectionResults calloc(MemoryStack stack) {
        return wrap(VROverlayIntersectionResults.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VROverlayIntersectionResults.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionResults.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayIntersectionResults.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VROverlayIntersectionResults.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vPoint}. */
    public static HmdVector3 nvPoint(long struct) { return HmdVector3.create(struct + VROverlayIntersectionResults.VPOINT); }
    /** Unsafe version of {@link #vNormal}. */
    public static HmdVector3 nvNormal(long struct) { return HmdVector3.create(struct + VROverlayIntersectionResults.VNORMAL); }
    /** Unsafe version of {@link #vUVs}. */
    public static HmdVector2 nvUVs(long struct) { return HmdVector2.create(struct + VROverlayIntersectionResults.VUVS); }
    /** Unsafe version of {@link #fDistance}. */
    public static float nfDistance(long struct) { return UNSAFE.getFloat(null, struct + VROverlayIntersectionResults.FDISTANCE); }

    // -----------------------------------

    /** An array of {@link VROverlayIntersectionResults} structs. */
    public static class Buffer extends StructBuffer<VROverlayIntersectionResults, Buffer> implements NativeResource {

        private static final VROverlayIntersectionResults ELEMENT_FACTORY = VROverlayIntersectionResults.create(-1L);

        /**
         * Creates a new {@code VROverlayIntersectionResults.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VROverlayIntersectionResults#SIZEOF}, and its mark will be undefined.
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
        protected VROverlayIntersectionResults getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link HmdVector3} view of the {@code vPoint} field. */
        @NativeType("HmdVector3_t")
        public HmdVector3 vPoint() { return VROverlayIntersectionResults.nvPoint(address()); }
        /** @return a {@link HmdVector3} view of the {@code vNormal} field. */
        @NativeType("HmdVector3_t")
        public HmdVector3 vNormal() { return VROverlayIntersectionResults.nvNormal(address()); }
        /** @return a {@link HmdVector2} view of the {@code vUVs} field. */
        @NativeType("HmdVector2_t")
        public HmdVector2 vUVs() { return VROverlayIntersectionResults.nvUVs(address()); }
        /** @return the value of the {@code fDistance} field. */
        public float fDistance() { return VROverlayIntersectionResults.nfDistance(address()); }

    }

}