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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrBodyJointLocationsHTC {
 *     XrStructureType type;
 *     void * next;
 *     XrSpaceLocationFlags combinedLocationFlags;
 *     XrBodyJointConfidenceHTC confidenceLevel;
 *     uint32_t jointLocationCount;
 *     {@link XrBodyJointLocationHTC XrBodyJointLocationHTC} * jointLocations;
 *     uint32_t skeletonGenerationId;
 * }}</pre>
 */
public class XrBodyJointLocationsHTC extends Struct<XrBodyJointLocationsHTC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        COMBINEDLOCATIONFLAGS,
        CONFIDENCELEVEL,
        JOINTLOCATIONCOUNT,
        JOINTLOCATIONS,
        SKELETONGENERATIONID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        COMBINEDLOCATIONFLAGS = layout.offsetof(2);
        CONFIDENCELEVEL = layout.offsetof(3);
        JOINTLOCATIONCOUNT = layout.offsetof(4);
        JOINTLOCATIONS = layout.offsetof(5);
        SKELETONGENERATIONID = layout.offsetof(6);
    }

    protected XrBodyJointLocationsHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyJointLocationsHTC create(long address, @Nullable ByteBuffer container) {
        return new XrBodyJointLocationsHTC(address, container);
    }

    /**
     * Creates a {@code XrBodyJointLocationsHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyJointLocationsHTC(ByteBuffer container) {
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
    /** @return the value of the {@code combinedLocationFlags} field. */
    @NativeType("XrSpaceLocationFlags")
    public long combinedLocationFlags() { return ncombinedLocationFlags(address()); }
    /** @return the value of the {@code confidenceLevel} field. */
    @NativeType("XrBodyJointConfidenceHTC")
    public int confidenceLevel() { return nconfidenceLevel(address()); }
    /** @return the value of the {@code jointLocationCount} field. */
    @NativeType("uint32_t")
    public int jointLocationCount() { return njointLocationCount(address()); }
    /** @return a {@link XrBodyJointLocationHTC.Buffer} view of the struct array pointed to by the {@code jointLocations} field. */
    @NativeType("XrBodyJointLocationHTC *")
    public XrBodyJointLocationHTC.Buffer jointLocations() { return njointLocations(address()); }
    /** @return the value of the {@code skeletonGenerationId} field. */
    @NativeType("uint32_t")
    public int skeletonGenerationId() { return nskeletonGenerationId(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrBodyJointLocationsHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCBodyTracking#XR_TYPE_BODY_JOINT_LOCATIONS_HTC TYPE_BODY_JOINT_LOCATIONS_HTC} value to the {@code type} field. */
    public XrBodyJointLocationsHTC type$Default() { return type(HTCBodyTracking.XR_TYPE_BODY_JOINT_LOCATIONS_HTC); }
    /** Sets the specified value to the {@code next} field. */
    public XrBodyJointLocationsHTC next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code combinedLocationFlags} field. */
    public XrBodyJointLocationsHTC combinedLocationFlags(@NativeType("XrSpaceLocationFlags") long value) { ncombinedLocationFlags(address(), value); return this; }
    /** Sets the specified value to the {@code confidenceLevel} field. */
    public XrBodyJointLocationsHTC confidenceLevel(@NativeType("XrBodyJointConfidenceHTC") int value) { nconfidenceLevel(address(), value); return this; }
    /** Sets the address of the specified {@link XrBodyJointLocationHTC.Buffer} to the {@code jointLocations} field. */
    public XrBodyJointLocationsHTC jointLocations(@NativeType("XrBodyJointLocationHTC *") XrBodyJointLocationHTC.Buffer value) { njointLocations(address(), value); return this; }
    /** Sets the specified value to the {@code skeletonGenerationId} field. */
    public XrBodyJointLocationsHTC skeletonGenerationId(@NativeType("uint32_t") int value) { nskeletonGenerationId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodyJointLocationsHTC set(
        int type,
        long next,
        long combinedLocationFlags,
        int confidenceLevel,
        XrBodyJointLocationHTC.Buffer jointLocations,
        int skeletonGenerationId
    ) {
        type(type);
        next(next);
        combinedLocationFlags(combinedLocationFlags);
        confidenceLevel(confidenceLevel);
        jointLocations(jointLocations);
        skeletonGenerationId(skeletonGenerationId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBodyJointLocationsHTC set(XrBodyJointLocationsHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodyJointLocationsHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyJointLocationsHTC malloc() {
        return new XrBodyJointLocationsHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointLocationsHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyJointLocationsHTC calloc() {
        return new XrBodyJointLocationsHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyJointLocationsHTC} instance allocated with {@link BufferUtils}. */
    public static XrBodyJointLocationsHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyJointLocationsHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyJointLocationsHTC} instance for the specified memory address. */
    public static XrBodyJointLocationsHTC create(long address) {
        return new XrBodyJointLocationsHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBodyJointLocationsHTC createSafe(long address) {
        return address == NULL ? null : new XrBodyJointLocationsHTC(address, null);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyJointLocationsHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBodyJointLocationsHTC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyJointLocationsHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointLocationsHTC malloc(MemoryStack stack) {
        return new XrBodyJointLocationsHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyJointLocationsHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyJointLocationsHTC calloc(MemoryStack stack) {
        return new XrBodyJointLocationsHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyJointLocationsHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyJointLocationsHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrBodyJointLocationsHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBodyJointLocationsHTC.NEXT); }
    /** Unsafe version of {@link #combinedLocationFlags}. */
    public static long ncombinedLocationFlags(long struct) { return memGetLong(struct + XrBodyJointLocationsHTC.COMBINEDLOCATIONFLAGS); }
    /** Unsafe version of {@link #confidenceLevel}. */
    public static int nconfidenceLevel(long struct) { return memGetInt(struct + XrBodyJointLocationsHTC.CONFIDENCELEVEL); }
    /** Unsafe version of {@link #jointLocationCount}. */
    public static int njointLocationCount(long struct) { return memGetInt(struct + XrBodyJointLocationsHTC.JOINTLOCATIONCOUNT); }
    /** Unsafe version of {@link #jointLocations}. */
    public static XrBodyJointLocationHTC.Buffer njointLocations(long struct) { return XrBodyJointLocationHTC.create(memGetAddress(struct + XrBodyJointLocationsHTC.JOINTLOCATIONS), njointLocationCount(struct)); }
    /** Unsafe version of {@link #skeletonGenerationId}. */
    public static int nskeletonGenerationId(long struct) { return memGetInt(struct + XrBodyJointLocationsHTC.SKELETONGENERATIONID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrBodyJointLocationsHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBodyJointLocationsHTC.NEXT, value); }
    /** Unsafe version of {@link #combinedLocationFlags(long) combinedLocationFlags}. */
    public static void ncombinedLocationFlags(long struct, long value) { memPutLong(struct + XrBodyJointLocationsHTC.COMBINEDLOCATIONFLAGS, value); }
    /** Unsafe version of {@link #confidenceLevel(int) confidenceLevel}. */
    public static void nconfidenceLevel(long struct, int value) { memPutInt(struct + XrBodyJointLocationsHTC.CONFIDENCELEVEL, value); }
    /** Sets the specified value to the {@code jointLocationCount} field of the specified {@code struct}. */
    public static void njointLocationCount(long struct, int value) { memPutInt(struct + XrBodyJointLocationsHTC.JOINTLOCATIONCOUNT, value); }
    /** Unsafe version of {@link #jointLocations(XrBodyJointLocationHTC.Buffer) jointLocations}. */
    public static void njointLocations(long struct, XrBodyJointLocationHTC.Buffer value) { memPutAddress(struct + XrBodyJointLocationsHTC.JOINTLOCATIONS, value.address()); njointLocationCount(struct, value.remaining()); }
    /** Unsafe version of {@link #skeletonGenerationId(int) skeletonGenerationId}. */
    public static void nskeletonGenerationId(long struct, int value) { memPutInt(struct + XrBodyJointLocationsHTC.SKELETONGENERATIONID, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrBodyJointLocationsHTC.JOINTLOCATIONS));
    }

    // -----------------------------------

    /** An array of {@link XrBodyJointLocationsHTC} structs. */
    public static class Buffer extends StructBuffer<XrBodyJointLocationsHTC, Buffer> implements NativeResource {

        private static final XrBodyJointLocationsHTC ELEMENT_FACTORY = XrBodyJointLocationsHTC.create(-1L);

        /**
         * Creates a new {@code XrBodyJointLocationsHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyJointLocationsHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyJointLocationsHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBodyJointLocationsHTC.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrBodyJointLocationsHTC.nnext(address()); }
        /** @return the value of the {@code combinedLocationFlags} field. */
        @NativeType("XrSpaceLocationFlags")
        public long combinedLocationFlags() { return XrBodyJointLocationsHTC.ncombinedLocationFlags(address()); }
        /** @return the value of the {@code confidenceLevel} field. */
        @NativeType("XrBodyJointConfidenceHTC")
        public int confidenceLevel() { return XrBodyJointLocationsHTC.nconfidenceLevel(address()); }
        /** @return the value of the {@code jointLocationCount} field. */
        @NativeType("uint32_t")
        public int jointLocationCount() { return XrBodyJointLocationsHTC.njointLocationCount(address()); }
        /** @return a {@link XrBodyJointLocationHTC.Buffer} view of the struct array pointed to by the {@code jointLocations} field. */
        @NativeType("XrBodyJointLocationHTC *")
        public XrBodyJointLocationHTC.Buffer jointLocations() { return XrBodyJointLocationsHTC.njointLocations(address()); }
        /** @return the value of the {@code skeletonGenerationId} field. */
        @NativeType("uint32_t")
        public int skeletonGenerationId() { return XrBodyJointLocationsHTC.nskeletonGenerationId(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrBodyJointLocationsHTC.Buffer type(@NativeType("XrStructureType") int value) { XrBodyJointLocationsHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCBodyTracking#XR_TYPE_BODY_JOINT_LOCATIONS_HTC TYPE_BODY_JOINT_LOCATIONS_HTC} value to the {@code type} field. */
        public XrBodyJointLocationsHTC.Buffer type$Default() { return type(HTCBodyTracking.XR_TYPE_BODY_JOINT_LOCATIONS_HTC); }
        /** Sets the specified value to the {@code next} field. */
        public XrBodyJointLocationsHTC.Buffer next(@NativeType("void *") long value) { XrBodyJointLocationsHTC.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code combinedLocationFlags} field. */
        public XrBodyJointLocationsHTC.Buffer combinedLocationFlags(@NativeType("XrSpaceLocationFlags") long value) { XrBodyJointLocationsHTC.ncombinedLocationFlags(address(), value); return this; }
        /** Sets the specified value to the {@code confidenceLevel} field. */
        public XrBodyJointLocationsHTC.Buffer confidenceLevel(@NativeType("XrBodyJointConfidenceHTC") int value) { XrBodyJointLocationsHTC.nconfidenceLevel(address(), value); return this; }
        /** Sets the address of the specified {@link XrBodyJointLocationHTC.Buffer} to the {@code jointLocations} field. */
        public XrBodyJointLocationsHTC.Buffer jointLocations(@NativeType("XrBodyJointLocationHTC *") XrBodyJointLocationHTC.Buffer value) { XrBodyJointLocationsHTC.njointLocations(address(), value); return this; }
        /** Sets the specified value to the {@code skeletonGenerationId} field. */
        public XrBodyJointLocationsHTC.Buffer skeletonGenerationId(@NativeType("uint32_t") int value) { XrBodyJointLocationsHTC.nskeletonGenerationId(address(), value); return this; }

    }

}