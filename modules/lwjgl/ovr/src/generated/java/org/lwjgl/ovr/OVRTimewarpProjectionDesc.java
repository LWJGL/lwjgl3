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
 * Projection information for {@link OVRLayerEyeFovDepth}.
 * 
 * <p>Use the utility function {@link OVRUtil#ovrTimewarpProjectionDesc_FromProjection TimewarpProjectionDesc_FromProjection} to generate this structure from the application's projection matrix.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrTimewarpProjectionDesc {
 *     float {@link #Projection22};
 *     float {@link #Projection23};
 *     float {@link #Projection32};
 * }</code></pre>
 */
@NativeType("struct ovrTimewarpProjectionDesc")
public class OVRTimewarpProjectionDesc extends Struct<OVRTimewarpProjectionDesc> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PROJECTION22,
        PROJECTION23,
        PROJECTION32;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PROJECTION22 = layout.offsetof(0);
        PROJECTION23 = layout.offsetof(1);
        PROJECTION32 = layout.offsetof(2);
    }

    protected OVRTimewarpProjectionDesc(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected OVRTimewarpProjectionDesc create(long address, @Nullable ByteBuffer container) {
        return new OVRTimewarpProjectionDesc(address, container);
    }

    /**
     * Creates a {@code OVRTimewarpProjectionDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRTimewarpProjectionDesc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** projection matrix element [2][2] */
    public float Projection22() { return nProjection22(address()); }
    /** projection matrix element [2][3] */
    public float Projection23() { return nProjection23(address()); }
    /** projection matrix element [3][2] */
    public float Projection32() { return nProjection32(address()); }

    // -----------------------------------

    /** Returns a new {@code OVRTimewarpProjectionDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRTimewarpProjectionDesc malloc() {
        return new OVRTimewarpProjectionDesc(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code OVRTimewarpProjectionDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRTimewarpProjectionDesc calloc() {
        return new OVRTimewarpProjectionDesc(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code OVRTimewarpProjectionDesc} instance allocated with {@link BufferUtils}. */
    public static OVRTimewarpProjectionDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new OVRTimewarpProjectionDesc(memAddress(container), container);
    }

    /** Returns a new {@code OVRTimewarpProjectionDesc} instance for the specified memory address. */
    public static OVRTimewarpProjectionDesc create(long address) {
        return new OVRTimewarpProjectionDesc(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRTimewarpProjectionDesc createSafe(long address) {
        return address == NULL ? null : new OVRTimewarpProjectionDesc(address, null);
    }

    /**
     * Returns a new {@link OVRTimewarpProjectionDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTimewarpProjectionDesc.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRTimewarpProjectionDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTimewarpProjectionDesc.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRTimewarpProjectionDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTimewarpProjectionDesc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link OVRTimewarpProjectionDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRTimewarpProjectionDesc.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRTimewarpProjectionDesc.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRTimewarpProjectionDesc mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRTimewarpProjectionDesc callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRTimewarpProjectionDesc mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRTimewarpProjectionDesc callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRTimewarpProjectionDesc.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRTimewarpProjectionDesc.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRTimewarpProjectionDesc.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRTimewarpProjectionDesc.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRTimewarpProjectionDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRTimewarpProjectionDesc malloc(MemoryStack stack) {
        return new OVRTimewarpProjectionDesc(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code OVRTimewarpProjectionDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRTimewarpProjectionDesc calloc(MemoryStack stack) {
        return new OVRTimewarpProjectionDesc(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link OVRTimewarpProjectionDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRTimewarpProjectionDesc.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRTimewarpProjectionDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRTimewarpProjectionDesc.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Projection22}. */
    public static float nProjection22(long struct) { return UNSAFE.getFloat(null, struct + OVRTimewarpProjectionDesc.PROJECTION22); }
    /** Unsafe version of {@link #Projection23}. */
    public static float nProjection23(long struct) { return UNSAFE.getFloat(null, struct + OVRTimewarpProjectionDesc.PROJECTION23); }
    /** Unsafe version of {@link #Projection32}. */
    public static float nProjection32(long struct) { return UNSAFE.getFloat(null, struct + OVRTimewarpProjectionDesc.PROJECTION32); }

    // -----------------------------------

    /** An array of {@link OVRTimewarpProjectionDesc} structs. */
    public static class Buffer extends StructBuffer<OVRTimewarpProjectionDesc, Buffer> implements NativeResource {

        private static final OVRTimewarpProjectionDesc ELEMENT_FACTORY = OVRTimewarpProjectionDesc.create(-1L);

        /**
         * Creates a new {@code OVRTimewarpProjectionDesc.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRTimewarpProjectionDesc#SIZEOF}, and its mark will be undefined.</p>
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
        protected OVRTimewarpProjectionDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link OVRTimewarpProjectionDesc#Projection22} field. */
        public float Projection22() { return OVRTimewarpProjectionDesc.nProjection22(address()); }
        /** @return the value of the {@link OVRTimewarpProjectionDesc#Projection23} field. */
        public float Projection23() { return OVRTimewarpProjectionDesc.nProjection23(address()); }
        /** @return the value of the {@link OVRTimewarpProjectionDesc#Projection32} field. */
        public float Projection32() { return OVRTimewarpProjectionDesc.nProjection32(address()); }

    }

}