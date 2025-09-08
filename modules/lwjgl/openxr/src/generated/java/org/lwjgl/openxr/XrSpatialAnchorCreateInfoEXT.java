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
 * <pre><code>
 * struct XrSpatialAnchorCreateInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace baseSpace;
 *     XrTime time;
 *     {@link XrPosef XrPosef} pose;
 * }</code></pre>
 */
public class XrSpatialAnchorCreateInfoEXT extends Struct<XrSpatialAnchorCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BASESPACE,
        TIME,
        POSE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BASESPACE = layout.offsetof(2);
        TIME = layout.offsetof(3);
        POSE = layout.offsetof(4);
    }

    protected XrSpatialAnchorCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code baseSpace} field. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }
    /** @return a {@link XrPosef} view of the {@code pose} field. */
    public XrPosef pose() { return npose(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialAnchorCreateInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialAnchor#XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_EXT TYPE_SPATIAL_ANCHOR_CREATE_INFO_EXT} value to the {@code type} field. */
    public XrSpatialAnchorCreateInfoEXT type$Default() { return type(EXTSpatialAnchor.XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialAnchorCreateInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code baseSpace} field. */
    public XrSpatialAnchorCreateInfoEXT baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrSpatialAnchorCreateInfoEXT time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code pose} field. */
    public XrSpatialAnchorCreateInfoEXT pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialAnchorCreateInfoEXT pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorCreateInfoEXT set(
        int type,
        long next,
        XrSpace baseSpace,
        long time,
        XrPosef pose
    ) {
        type(type);
        next(next);
        baseSpace(baseSpace);
        time(time);
        pose(pose);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorCreateInfoEXT set(XrSpatialAnchorCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorCreateInfoEXT malloc() {
        return new XrSpatialAnchorCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorCreateInfoEXT calloc() {
        return new XrSpatialAnchorCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorCreateInfoEXT} instance for the specified memory address. */
    public static XrSpatialAnchorCreateInfoEXT create(long address) {
        return new XrSpatialAnchorCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorCreateInfoEXT malloc(MemoryStack stack) {
        return new XrSpatialAnchorCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorCreateInfoEXT calloc(MemoryStack stack) {
        return new XrSpatialAnchorCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialAnchorCreateInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorCreateInfoEXT.NEXT); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrSpatialAnchorCreateInfoEXT.BASESPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrSpatialAnchorCreateInfoEXT.TIME); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrSpatialAnchorCreateInfoEXT.POSE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialAnchorCreateInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorCreateInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrSpatialAnchorCreateInfoEXT.BASESPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrSpatialAnchorCreateInfoEXT.TIME, value); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrSpatialAnchorCreateInfoEXT.POSE, XrPosef.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorCreateInfoEXT.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorCreateInfoEXT, Buffer> implements NativeResource {

        private static final XrSpatialAnchorCreateInfoEXT ELEMENT_FACTORY = XrSpatialAnchorCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorCreateInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialAnchorCreateInfoEXT.nnext(address()); }
        /** @return the value of the {@code baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrSpatialAnchorCreateInfoEXT.nbaseSpace(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrSpatialAnchorCreateInfoEXT.ntime(address()); }
        /** @return a {@link XrPosef} view of the {@code pose} field. */
        public XrPosef pose() { return XrSpatialAnchorCreateInfoEXT.npose(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialAnchorCreateInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorCreateInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialAnchor#XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_EXT TYPE_SPATIAL_ANCHOR_CREATE_INFO_EXT} value to the {@code type} field. */
        public XrSpatialAnchorCreateInfoEXT.Buffer type$Default() { return type(EXTSpatialAnchor.XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialAnchorCreateInfoEXT.Buffer next(@NativeType("void const *") long value) { XrSpatialAnchorCreateInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code baseSpace} field. */
        public XrSpatialAnchorCreateInfoEXT.Buffer baseSpace(XrSpace value) { XrSpatialAnchorCreateInfoEXT.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrSpatialAnchorCreateInfoEXT.Buffer time(@NativeType("XrTime") long value) { XrSpatialAnchorCreateInfoEXT.ntime(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code pose} field. */
        public XrSpatialAnchorCreateInfoEXT.Buffer pose(XrPosef value) { XrSpatialAnchorCreateInfoEXT.npose(address(), value); return this; }
        /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialAnchorCreateInfoEXT.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }

    }

}