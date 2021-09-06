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
 * Provides boundary test information.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrBoundaryTestResult {
 *     ovrBool {@link #IsTriggering};
 *     float {@link #ClosestDistance};
 *     {@link OVRVector3f ovrVector3f} {@link #ClosestPoint};
 *     {@link OVRVector3f ovrVector3f} {@link #ClosestPointNormal};
 * }</code></pre>
 */
@NativeType("struct ovrBoundaryTestResult")
public class OVRBoundaryTestResult extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ISTRIGGERING,
        CLOSESTDISTANCE,
        CLOSESTPOINT,
        CLOSESTPOINTNORMAL;

    static {
        Layout layout = __struct(
            __member(1),
            __member(4),
            __member(OVRVector3f.SIZEOF, OVRVector3f.ALIGNOF),
            __member(OVRVector3f.SIZEOF, OVRVector3f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ISTRIGGERING = layout.offsetof(0);
        CLOSESTDISTANCE = layout.offsetof(1);
        CLOSESTPOINT = layout.offsetof(2);
        CLOSESTPOINTNORMAL = layout.offsetof(3);
    }

    /**
     * Creates a {@code OVRBoundaryTestResult} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRBoundaryTestResult(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** True if the boundary system is being triggered. Note that due to fade in/out effects this may not exactly match visibility. */
    @NativeType("ovrBool")
    public boolean IsTriggering() { return nIsTriggering(address()); }
    /** Distance to the closest play area or outer boundary surface */
    public float ClosestDistance() { return nClosestDistance(address()); }
    /** Closest point on the boundary surface */
    @NativeType("ovrVector3f")
    public OVRVector3f ClosestPoint() { return nClosestPoint(address()); }
    /** Unit surface normal of the closest boundary surface */
    @NativeType("ovrVector3f")
    public OVRVector3f ClosestPointNormal() { return nClosestPointNormal(address()); }

    // -----------------------------------

    /** Returns a new {@code OVRBoundaryTestResult} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRBoundaryTestResult malloc() {
        return wrap(OVRBoundaryTestResult.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRBoundaryTestResult} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRBoundaryTestResult calloc() {
        return wrap(OVRBoundaryTestResult.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRBoundaryTestResult} instance allocated with {@link BufferUtils}. */
    public static OVRBoundaryTestResult create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRBoundaryTestResult.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRBoundaryTestResult} instance for the specified memory address. */
    public static OVRBoundaryTestResult create(long address) {
        return wrap(OVRBoundaryTestResult.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRBoundaryTestResult createSafe(long address) {
        return address == NULL ? null : wrap(OVRBoundaryTestResult.class, address);
    }

    /**
     * Returns a new {@link OVRBoundaryTestResult.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRBoundaryTestResult.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRBoundaryTestResult.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRBoundaryTestResult.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRBoundaryTestResult.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRBoundaryTestResult.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRBoundaryTestResult.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRBoundaryTestResult.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRBoundaryTestResult.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRBoundaryTestResult mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRBoundaryTestResult callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRBoundaryTestResult mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRBoundaryTestResult callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRBoundaryTestResult.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRBoundaryTestResult.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRBoundaryTestResult.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRBoundaryTestResult.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRBoundaryTestResult} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRBoundaryTestResult malloc(MemoryStack stack) {
        return wrap(OVRBoundaryTestResult.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRBoundaryTestResult} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRBoundaryTestResult calloc(MemoryStack stack) {
        return wrap(OVRBoundaryTestResult.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRBoundaryTestResult.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRBoundaryTestResult.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRBoundaryTestResult.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRBoundaryTestResult.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #IsTriggering}. */
    public static boolean nIsTriggering(long struct) { return UNSAFE.getByte(null, struct + OVRBoundaryTestResult.ISTRIGGERING) != 0; }
    /** Unsafe version of {@link #ClosestDistance}. */
    public static float nClosestDistance(long struct) { return UNSAFE.getFloat(null, struct + OVRBoundaryTestResult.CLOSESTDISTANCE); }
    /** Unsafe version of {@link #ClosestPoint}. */
    public static OVRVector3f nClosestPoint(long struct) { return OVRVector3f.create(struct + OVRBoundaryTestResult.CLOSESTPOINT); }
    /** Unsafe version of {@link #ClosestPointNormal}. */
    public static OVRVector3f nClosestPointNormal(long struct) { return OVRVector3f.create(struct + OVRBoundaryTestResult.CLOSESTPOINTNORMAL); }

    // -----------------------------------

    /** An array of {@link OVRBoundaryTestResult} structs. */
    public static class Buffer extends StructBuffer<OVRBoundaryTestResult, Buffer> implements NativeResource {

        private static final OVRBoundaryTestResult ELEMENT_FACTORY = OVRBoundaryTestResult.create(-1L);

        /**
         * Creates a new {@code OVRBoundaryTestResult.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRBoundaryTestResult#SIZEOF}, and its mark will be undefined.
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
        protected OVRBoundaryTestResult getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link OVRBoundaryTestResult#IsTriggering} field. */
        @NativeType("ovrBool")
        public boolean IsTriggering() { return OVRBoundaryTestResult.nIsTriggering(address()); }
        /** @return the value of the {@link OVRBoundaryTestResult#ClosestDistance} field. */
        public float ClosestDistance() { return OVRBoundaryTestResult.nClosestDistance(address()); }
        /** @return a {@link OVRVector3f} view of the {@link OVRBoundaryTestResult#ClosestPoint} field. */
        @NativeType("ovrVector3f")
        public OVRVector3f ClosestPoint() { return OVRBoundaryTestResult.nClosestPoint(address()); }
        /** @return a {@link OVRVector3f} view of the {@link OVRBoundaryTestResult#ClosestPointNormal} field. */
        @NativeType("ovrVector3f")
        public OVRVector3f ClosestPointNormal() { return OVRBoundaryTestResult.nClosestPointNormal(address()); }

    }

}