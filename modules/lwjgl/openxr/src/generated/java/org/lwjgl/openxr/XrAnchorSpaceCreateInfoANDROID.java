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
 * struct XrAnchorSpaceCreateInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace space;
 *     XrTime time;
 *     {@link XrPosef XrPosef} pose;
 *     XrTrackableANDROID trackable;
 * }}</pre>
 */
public class XrAnchorSpaceCreateInfoANDROID extends Struct<XrAnchorSpaceCreateInfoANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SPACE,
        TIME,
        POSE,
        TRACKABLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPACE = layout.offsetof(2);
        TIME = layout.offsetof(3);
        POSE = layout.offsetof(4);
        TRACKABLE = layout.offsetof(5);
    }

    protected XrAnchorSpaceCreateInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrAnchorSpaceCreateInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrAnchorSpaceCreateInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrAnchorSpaceCreateInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrAnchorSpaceCreateInfoANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code space} field. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }
    /** @return a {@link XrPosef} view of the {@code pose} field. */
    public XrPosef pose() { return npose(address()); }
    /** @return the value of the {@code trackable} field. */
    @NativeType("XrTrackableANDROID")
    public long trackable() { return ntrackable(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrAnchorSpaceCreateInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDTrackables#XR_TYPE_ANCHOR_SPACE_CREATE_INFO_ANDROID TYPE_ANCHOR_SPACE_CREATE_INFO_ANDROID} value to the {@code type} field. */
    public XrAnchorSpaceCreateInfoANDROID type$Default() { return type(ANDROIDTrackables.XR_TYPE_ANCHOR_SPACE_CREATE_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrAnchorSpaceCreateInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrAnchorSpaceCreateInfoANDROID space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrAnchorSpaceCreateInfoANDROID time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code pose} field. */
    public XrAnchorSpaceCreateInfoANDROID pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrAnchorSpaceCreateInfoANDROID pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Sets the specified value to the {@code trackable} field. */
    public XrAnchorSpaceCreateInfoANDROID trackable(@NativeType("XrTrackableANDROID") long value) { ntrackable(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrAnchorSpaceCreateInfoANDROID set(
        int type,
        long next,
        XrSpace space,
        long time,
        XrPosef pose,
        long trackable
    ) {
        type(type);
        next(next);
        space(space);
        time(time);
        pose(pose);
        trackable(trackable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrAnchorSpaceCreateInfoANDROID set(XrAnchorSpaceCreateInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrAnchorSpaceCreateInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrAnchorSpaceCreateInfoANDROID malloc() {
        return new XrAnchorSpaceCreateInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrAnchorSpaceCreateInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrAnchorSpaceCreateInfoANDROID calloc() {
        return new XrAnchorSpaceCreateInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrAnchorSpaceCreateInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrAnchorSpaceCreateInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrAnchorSpaceCreateInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrAnchorSpaceCreateInfoANDROID} instance for the specified memory address. */
    public static XrAnchorSpaceCreateInfoANDROID create(long address) {
        return new XrAnchorSpaceCreateInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrAnchorSpaceCreateInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrAnchorSpaceCreateInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrAnchorSpaceCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrAnchorSpaceCreateInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrAnchorSpaceCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrAnchorSpaceCreateInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrAnchorSpaceCreateInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrAnchorSpaceCreateInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrAnchorSpaceCreateInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrAnchorSpaceCreateInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrAnchorSpaceCreateInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrAnchorSpaceCreateInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrAnchorSpaceCreateInfoANDROID malloc(MemoryStack stack) {
        return new XrAnchorSpaceCreateInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrAnchorSpaceCreateInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrAnchorSpaceCreateInfoANDROID calloc(MemoryStack stack) {
        return new XrAnchorSpaceCreateInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrAnchorSpaceCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrAnchorSpaceCreateInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrAnchorSpaceCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrAnchorSpaceCreateInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrAnchorSpaceCreateInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrAnchorSpaceCreateInfoANDROID.NEXT); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrAnchorSpaceCreateInfoANDROID.SPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrAnchorSpaceCreateInfoANDROID.TIME); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrAnchorSpaceCreateInfoANDROID.POSE); }
    /** Unsafe version of {@link #trackable}. */
    public static long ntrackable(long struct) { return memGetLong(struct + XrAnchorSpaceCreateInfoANDROID.TRACKABLE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrAnchorSpaceCreateInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrAnchorSpaceCreateInfoANDROID.NEXT, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrAnchorSpaceCreateInfoANDROID.SPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrAnchorSpaceCreateInfoANDROID.TIME, value); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrAnchorSpaceCreateInfoANDROID.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #trackable(long) trackable}. */
    public static void ntrackable(long struct, long value) { memPutLong(struct + XrAnchorSpaceCreateInfoANDROID.TRACKABLE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrAnchorSpaceCreateInfoANDROID.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrAnchorSpaceCreateInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrAnchorSpaceCreateInfoANDROID, Buffer> implements NativeResource {

        private static final XrAnchorSpaceCreateInfoANDROID ELEMENT_FACTORY = XrAnchorSpaceCreateInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrAnchorSpaceCreateInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrAnchorSpaceCreateInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrAnchorSpaceCreateInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrAnchorSpaceCreateInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrAnchorSpaceCreateInfoANDROID.nnext(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrAnchorSpaceCreateInfoANDROID.nspace(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrAnchorSpaceCreateInfoANDROID.ntime(address()); }
        /** @return a {@link XrPosef} view of the {@code pose} field. */
        public XrPosef pose() { return XrAnchorSpaceCreateInfoANDROID.npose(address()); }
        /** @return the value of the {@code trackable} field. */
        @NativeType("XrTrackableANDROID")
        public long trackable() { return XrAnchorSpaceCreateInfoANDROID.ntrackable(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrAnchorSpaceCreateInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrAnchorSpaceCreateInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDTrackables#XR_TYPE_ANCHOR_SPACE_CREATE_INFO_ANDROID TYPE_ANCHOR_SPACE_CREATE_INFO_ANDROID} value to the {@code type} field. */
        public XrAnchorSpaceCreateInfoANDROID.Buffer type$Default() { return type(ANDROIDTrackables.XR_TYPE_ANCHOR_SPACE_CREATE_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrAnchorSpaceCreateInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrAnchorSpaceCreateInfoANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrAnchorSpaceCreateInfoANDROID.Buffer space(XrSpace value) { XrAnchorSpaceCreateInfoANDROID.nspace(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrAnchorSpaceCreateInfoANDROID.Buffer time(@NativeType("XrTime") long value) { XrAnchorSpaceCreateInfoANDROID.ntime(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code pose} field. */
        public XrAnchorSpaceCreateInfoANDROID.Buffer pose(XrPosef value) { XrAnchorSpaceCreateInfoANDROID.npose(address(), value); return this; }
        /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrAnchorSpaceCreateInfoANDROID.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Sets the specified value to the {@code trackable} field. */
        public XrAnchorSpaceCreateInfoANDROID.Buffer trackable(@NativeType("XrTrackableANDROID") long value) { XrAnchorSpaceCreateInfoANDROID.ntrackable(address(), value); return this; }

    }

}