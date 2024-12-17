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
 * struct XrSpaceLocation {
 *     XrStructureType type;
 *     void * next;
 *     XrSpaceLocationFlags locationFlags;
 *     {@link XrPosef XrPosef} pose;
 * }}</pre>
 */
public class XrSpaceLocation extends Struct<XrSpaceLocation> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LOCATIONFLAGS,
        POSE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LOCATIONFLAGS = layout.offsetof(2);
        POSE = layout.offsetof(3);
    }

    protected XrSpaceLocation(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceLocation create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceLocation(address, container);
    }

    /**
     * Creates a {@code XrSpaceLocation} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceLocation(ByteBuffer container) {
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
    /** @return the value of the {@code locationFlags} field. */
    @NativeType("XrSpaceLocationFlags")
    public long locationFlags() { return nlocationFlags(address()); }
    /** @return a {@link XrPosef} view of the {@code pose} field. */
    public XrPosef pose() { return npose(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpaceLocation type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_SPACE_LOCATION TYPE_SPACE_LOCATION} value to the {@code type} field. */
    public XrSpaceLocation type$Default() { return type(XR10.XR_TYPE_SPACE_LOCATION); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpaceLocation next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrEyeGazeSampleTimeEXT} value to the {@code next} chain. */
    public XrSpaceLocation next(XrEyeGazeSampleTimeEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSpaceVelocity} value to the {@code next} chain. */
    public XrSpaceLocation next(XrSpaceVelocity value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code locationFlags} field. */
    public XrSpaceLocation locationFlags(@NativeType("XrSpaceLocationFlags") long value) { nlocationFlags(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code pose} field. */
    public XrSpaceLocation pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpaceLocation pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceLocation set(
        int type,
        long next,
        long locationFlags,
        XrPosef pose
    ) {
        type(type);
        next(next);
        locationFlags(locationFlags);
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
    public XrSpaceLocation set(XrSpaceLocation src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceLocation} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceLocation malloc() {
        return new XrSpaceLocation(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceLocation} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceLocation calloc() {
        return new XrSpaceLocation(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceLocation} instance allocated with {@link BufferUtils}. */
    public static XrSpaceLocation create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceLocation(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceLocation} instance for the specified memory address. */
    public static XrSpaceLocation create(long address) {
        return new XrSpaceLocation(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpaceLocation createSafe(long address) {
        return address == NULL ? null : new XrSpaceLocation(address, null);
    }

    /**
     * Returns a new {@link XrSpaceLocation.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocation.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceLocation.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocation.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceLocation.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocation.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceLocation.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocation.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpaceLocation.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpaceLocation} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceLocation malloc(MemoryStack stack) {
        return new XrSpaceLocation(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceLocation} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceLocation calloc(MemoryStack stack) {
        return new XrSpaceLocation(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceLocation.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocation.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceLocation.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceLocation.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpaceLocation.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceLocation.NEXT); }
    /** Unsafe version of {@link #locationFlags}. */
    public static long nlocationFlags(long struct) { return memGetLong(struct + XrSpaceLocation.LOCATIONFLAGS); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrSpaceLocation.POSE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpaceLocation.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceLocation.NEXT, value); }
    /** Unsafe version of {@link #locationFlags(long) locationFlags}. */
    public static void nlocationFlags(long struct, long value) { memPutLong(struct + XrSpaceLocation.LOCATIONFLAGS, value); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrSpaceLocation.POSE, XrPosef.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSpaceLocation} structs. */
    public static class Buffer extends StructBuffer<XrSpaceLocation, Buffer> implements NativeResource {

        private static final XrSpaceLocation ELEMENT_FACTORY = XrSpaceLocation.create(-1L);

        /**
         * Creates a new {@code XrSpaceLocation.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceLocation#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceLocation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceLocation.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpaceLocation.nnext(address()); }
        /** @return the value of the {@code locationFlags} field. */
        @NativeType("XrSpaceLocationFlags")
        public long locationFlags() { return XrSpaceLocation.nlocationFlags(address()); }
        /** @return a {@link XrPosef} view of the {@code pose} field. */
        public XrPosef pose() { return XrSpaceLocation.npose(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpaceLocation.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceLocation.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_SPACE_LOCATION TYPE_SPACE_LOCATION} value to the {@code type} field. */
        public XrSpaceLocation.Buffer type$Default() { return type(XR10.XR_TYPE_SPACE_LOCATION); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpaceLocation.Buffer next(@NativeType("void *") long value) { XrSpaceLocation.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrEyeGazeSampleTimeEXT} value to the {@code next} chain. */
        public XrSpaceLocation.Buffer next(XrEyeGazeSampleTimeEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSpaceVelocity} value to the {@code next} chain. */
        public XrSpaceLocation.Buffer next(XrSpaceVelocity value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code locationFlags} field. */
        public XrSpaceLocation.Buffer locationFlags(@NativeType("XrSpaceLocationFlags") long value) { XrSpaceLocation.nlocationFlags(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code pose} field. */
        public XrSpaceLocation.Buffer pose(XrPosef value) { XrSpaceLocation.npose(address(), value); return this; }
        /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpaceLocation.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }

    }

}