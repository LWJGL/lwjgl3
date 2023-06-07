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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Contains summary information about the current skeletal pose.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VRSkeletalSummaryData_t {
 *     float {@link #flFingerCurl}[5];
 *     float {@link #flFingerSplay}[4];
 * }</code></pre>
 */
@NativeType("struct VRSkeletalSummaryData_t")
public class VRSkeletalSummaryData extends Struct<VRSkeletalSummaryData> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLFINGERCURL,
        FLFINGERSPLAY;

    static {
        Layout layout = __struct(
            __array(4, 5),
            __array(4, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLFINGERCURL = layout.offsetof(0);
        FLFINGERSPLAY = layout.offsetof(1);
    }

    protected VRSkeletalSummaryData(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VRSkeletalSummaryData create(long address, @Nullable ByteBuffer container) {
        return new VRSkeletalSummaryData(address, container);
    }

    /**
     * Creates a {@code VRSkeletalSummaryData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VRSkeletalSummaryData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * The amount that each finger is 'curled' inwards towards the palm.
     * 
     * <p>In the case of the thumb, this represents how much the thumb is wrapped around the fist. 0 means straight, 1 means fully curled.</p>
     */
    @NativeType("float[5]")
    public FloatBuffer flFingerCurl() { return nflFingerCurl(address()); }
    /**
     * The amount that each finger is 'curled' inwards towards the palm.
     * 
     * <p>In the case of the thumb, this represents how much the thumb is wrapped around the fist. 0 means straight, 1 means fully curled.</p>
     */
    public float flFingerCurl(int index) { return nflFingerCurl(address(), index); }
    /**
     * The amount that each pair of adjacent fingers are separated.
     * 
     * <p>0 means the digits are touching, 1 means they are fully separated.</p>
     */
    @NativeType("float[4]")
    public FloatBuffer flFingerSplay() { return nflFingerSplay(address()); }
    /**
     * The amount that each pair of adjacent fingers are separated.
     * 
     * <p>0 means the digits are touching, 1 means they are fully separated.</p>
     */
    public float flFingerSplay(int index) { return nflFingerSplay(address(), index); }

    // -----------------------------------

    /** Returns a new {@code VRSkeletalSummaryData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VRSkeletalSummaryData malloc() {
        return new VRSkeletalSummaryData(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VRSkeletalSummaryData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VRSkeletalSummaryData calloc() {
        return new VRSkeletalSummaryData(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VRSkeletalSummaryData} instance allocated with {@link BufferUtils}. */
    public static VRSkeletalSummaryData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VRSkeletalSummaryData(memAddress(container), container);
    }

    /** Returns a new {@code VRSkeletalSummaryData} instance for the specified memory address. */
    public static VRSkeletalSummaryData create(long address) {
        return new VRSkeletalSummaryData(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRSkeletalSummaryData createSafe(long address) {
        return address == NULL ? null : new VRSkeletalSummaryData(address, null);
    }

    /**
     * Returns a new {@link VRSkeletalSummaryData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRSkeletalSummaryData.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VRSkeletalSummaryData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRSkeletalSummaryData.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRSkeletalSummaryData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VRSkeletalSummaryData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VRSkeletalSummaryData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VRSkeletalSummaryData.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VRSkeletalSummaryData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VRSkeletalSummaryData mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VRSkeletalSummaryData callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VRSkeletalSummaryData mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VRSkeletalSummaryData callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VRSkeletalSummaryData.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VRSkeletalSummaryData.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VRSkeletalSummaryData.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VRSkeletalSummaryData.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VRSkeletalSummaryData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VRSkeletalSummaryData malloc(MemoryStack stack) {
        return new VRSkeletalSummaryData(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VRSkeletalSummaryData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VRSkeletalSummaryData calloc(MemoryStack stack) {
        return new VRSkeletalSummaryData(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VRSkeletalSummaryData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRSkeletalSummaryData.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRSkeletalSummaryData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRSkeletalSummaryData.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flFingerCurl}. */
    public static FloatBuffer nflFingerCurl(long struct) { return memFloatBuffer(struct + VRSkeletalSummaryData.FLFINGERCURL, 5); }
    /** Unsafe version of {@link #flFingerCurl(int) flFingerCurl}. */
    public static float nflFingerCurl(long struct, int index) {
        return UNSAFE.getFloat(null, struct + VRSkeletalSummaryData.FLFINGERCURL + check(index, 5) * 4);
    }
    /** Unsafe version of {@link #flFingerSplay}. */
    public static FloatBuffer nflFingerSplay(long struct) { return memFloatBuffer(struct + VRSkeletalSummaryData.FLFINGERSPLAY, 4); }
    /** Unsafe version of {@link #flFingerSplay(int) flFingerSplay}. */
    public static float nflFingerSplay(long struct, int index) {
        return UNSAFE.getFloat(null, struct + VRSkeletalSummaryData.FLFINGERSPLAY + check(index, 4) * 4);
    }

    // -----------------------------------

    /** An array of {@link VRSkeletalSummaryData} structs. */
    public static class Buffer extends StructBuffer<VRSkeletalSummaryData, Buffer> implements NativeResource {

        private static final VRSkeletalSummaryData ELEMENT_FACTORY = VRSkeletalSummaryData.create(-1L);

        /**
         * Creates a new {@code VRSkeletalSummaryData.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VRSkeletalSummaryData#SIZEOF}, and its mark will be undefined.</p>
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
        protected VRSkeletalSummaryData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the {@link VRSkeletalSummaryData#flFingerCurl} field. */
        @NativeType("float[5]")
        public FloatBuffer flFingerCurl() { return VRSkeletalSummaryData.nflFingerCurl(address()); }
        /** @return the value at the specified index of the {@link VRSkeletalSummaryData#flFingerCurl} field. */
        public float flFingerCurl(int index) { return VRSkeletalSummaryData.nflFingerCurl(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@link VRSkeletalSummaryData#flFingerSplay} field. */
        @NativeType("float[4]")
        public FloatBuffer flFingerSplay() { return VRSkeletalSummaryData.nflFingerSplay(address()); }
        /** @return the value at the specified index of the {@link VRSkeletalSummaryData#flFingerSplay} field. */
        public float flFingerSplay(int index) { return VRSkeletalSummaryData.nflFingerSplay(address(), index); }

    }

}