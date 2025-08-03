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
 * <pre>{@code
 * struct XrBodyJointLocationsFB {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 isActive;
 *     float confidence;
 *     uint32_t jointCount;
 *     {@link XrBodyJointLocationFB XrBodyJointLocationFB} * jointLocations;
 *     uint32_t skeletonChangedCount;
 *     XrTime time;
 * }}</pre>
 */
public class XrBodyJointLocationsFB extends Struct<XrBodyJointLocationsFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ISACTIVE,
        CONFIDENCE,
        JOINTCOUNT,
        JOINTLOCATIONS,
        SKELETONCHANGEDCOUNT,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ISACTIVE = layout.offsetof(2);
        CONFIDENCE = layout.offsetof(3);
        JOINTCOUNT = layout.offsetof(4);
        JOINTLOCATIONS = layout.offsetof(5);
        SKELETONCHANGEDCOUNT = layout.offsetof(6);
        TIME = layout.offsetof(7);
    }

    protected XrBodyJointLocationsFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyJointLocationsFB create(long address, @Nullable ByteBuffer container) {
        return new XrBodyJointLocationsFB(address, container);
    }

    /**
     * Creates a {@code XrBodyJointLocationsFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyJointLocationsFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code isActive} field. */
    @NativeType("XrBool32")
    public boolean isActive() { return nisActive(address()) != 0; }
    /** @return the value of the {@code confidence} field. */
    public float confidence() { return nconfidence(address()); }
    /** @return the value of the {@code jointCount} field. */
    @NativeType("uint32_t")
    public int jointCount() { return njointCount(address()); }
    /** @return a {@link XrBodyJointLocationFB.Buffer} view of the struct array pointed to by the {@code jointLocations} field. */
    @NativeType("XrBodyJointLocationFB *")
    public XrBodyJointLocationFB.Buffer jointLocations() { return njointLocations(address()); }
    /** @return the value of the {@code skeletonChangedCount} field. */
    @NativeType("uint32_t")
    public int skeletonChangedCount() { return nskeletonChangedCount(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrBodyJointLocationsFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBBodyTracking#XR_TYPE_BODY_JOINT_LOCATIONS_FB TYPE_BODY_JOINT_LOCATIONS_FB} value to the {@code type} field. */
    public XrBodyJointLocationsFB type$Default() { return type(FBBodyTracking.XR_TYPE_BODY_JOINT_LOCATIONS_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrBodyJointLocationsFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrBodyTrackingCalibrationStatusMETA} value to the {@code next} chain. */
    public XrBodyJointLocationsFB next(XrBodyTrackingCalibrationStatusMETA value) { return this.next(value.next(this.next()).address()); }

    /** Initializes this struct with the specified values. */
    public XrBodyJointLocationsFB set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBodyJointLocationsFB set(XrBodyJointLocationsFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodyJointLocationsFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyJointLocationsFB malloc() {
        return new XrBodyJointLocationsFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointLocationsFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyJointLocationsFB calloc() {
        return new XrBodyJointLocationsFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointLocationsFB} instance allocated with {@link BufferUtils}. */
    public static XrBodyJointLocationsFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyJointLocationsFB(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyJointLocationsFB} instance for the specified memory address. */
    public static XrBodyJointLocationsFB create(long address) {
        return new XrBodyJointLocationsFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBodyJointLocationsFB createSafe(long address) {
        return address == NULL ? null : new XrBodyJointLocationsFB(address, null);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyJointLocationsFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBodyJointLocationsFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyJointLocationsFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointLocationsFB malloc(MemoryStack stack) {
        return new XrBodyJointLocationsFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyJointLocationsFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointLocationsFB calloc(MemoryStack stack) {
        return new XrBodyJointLocationsFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrBodyJointLocationsFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBodyJointLocationsFB.NEXT); }
    /** Unsafe version of {@link #isActive}. */
    public static int nisActive(long struct) { return memGetInt(struct + XrBodyJointLocationsFB.ISACTIVE); }
    /** Unsafe version of {@link #confidence}. */
    public static float nconfidence(long struct) { return memGetFloat(struct + XrBodyJointLocationsFB.CONFIDENCE); }
    /** Unsafe version of {@link #jointCount}. */
    public static int njointCount(long struct) { return memGetInt(struct + XrBodyJointLocationsFB.JOINTCOUNT); }
    /** Unsafe version of {@link #jointLocations}. */
    public static XrBodyJointLocationFB.Buffer njointLocations(long struct) { return XrBodyJointLocationFB.create(memGetAddress(struct + XrBodyJointLocationsFB.JOINTLOCATIONS), njointCount(struct)); }
    /** Unsafe version of {@link #skeletonChangedCount}. */
    public static int nskeletonChangedCount(long struct) { return memGetInt(struct + XrBodyJointLocationsFB.SKELETONCHANGEDCOUNT); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrBodyJointLocationsFB.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrBodyJointLocationsFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBodyJointLocationsFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrBodyJointLocationsFB} structs. */
    public static class Buffer extends StructBuffer<XrBodyJointLocationsFB, Buffer> implements NativeResource {

        private static final XrBodyJointLocationsFB ELEMENT_FACTORY = XrBodyJointLocationsFB.create(-1L);

        /**
         * Creates a new {@code XrBodyJointLocationsFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyJointLocationsFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyJointLocationsFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBodyJointLocationsFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrBodyJointLocationsFB.nnext(address()); }
        /** @return the value of the {@code isActive} field. */
        @NativeType("XrBool32")
        public boolean isActive() { return XrBodyJointLocationsFB.nisActive(address()) != 0; }
        /** @return the value of the {@code confidence} field. */
        public float confidence() { return XrBodyJointLocationsFB.nconfidence(address()); }
        /** @return the value of the {@code jointCount} field. */
        @NativeType("uint32_t")
        public int jointCount() { return XrBodyJointLocationsFB.njointCount(address()); }
        /** @return a {@link XrBodyJointLocationFB.Buffer} view of the struct array pointed to by the {@code jointLocations} field. */
        @NativeType("XrBodyJointLocationFB *")
        public XrBodyJointLocationFB.Buffer jointLocations() { return XrBodyJointLocationsFB.njointLocations(address()); }
        /** @return the value of the {@code skeletonChangedCount} field. */
        @NativeType("uint32_t")
        public int skeletonChangedCount() { return XrBodyJointLocationsFB.nskeletonChangedCount(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrBodyJointLocationsFB.ntime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrBodyJointLocationsFB.Buffer type(@NativeType("XrStructureType") int value) { XrBodyJointLocationsFB.ntype(address(), value); return this; }
        /** Sets the {@link FBBodyTracking#XR_TYPE_BODY_JOINT_LOCATIONS_FB TYPE_BODY_JOINT_LOCATIONS_FB} value to the {@code type} field. */
        public XrBodyJointLocationsFB.Buffer type$Default() { return type(FBBodyTracking.XR_TYPE_BODY_JOINT_LOCATIONS_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrBodyJointLocationsFB.Buffer next(@NativeType("void *") long value) { XrBodyJointLocationsFB.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrBodyTrackingCalibrationStatusMETA} value to the {@code next} chain. */
        public XrBodyJointLocationsFB.Buffer next(XrBodyTrackingCalibrationStatusMETA value) { return this.next(value.next(this.next()).address()); }

    }

}