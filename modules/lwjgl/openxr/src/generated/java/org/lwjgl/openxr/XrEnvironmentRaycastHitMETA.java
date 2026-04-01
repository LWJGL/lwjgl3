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
 * <pre><code>
 * struct XrEnvironmentRaycastHitMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrEnvironmentRaycastHitStatusMETA status;
 *     {@link XrPosef XrPosef} pose;
 * }</code></pre>
 */
public class XrEnvironmentRaycastHitMETA extends Struct<XrEnvironmentRaycastHitMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        STATUS,
        POSE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        STATUS = layout.offsetof(2);
        POSE = layout.offsetof(3);
    }

    protected XrEnvironmentRaycastHitMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEnvironmentRaycastHitMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEnvironmentRaycastHitMETA(address, container);
    }

    /**
     * Creates a {@code XrEnvironmentRaycastHitMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEnvironmentRaycastHitMETA(ByteBuffer container) {
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
    /** @return the value of the {@code status} field. */
    @NativeType("XrEnvironmentRaycastHitStatusMETA")
    public int status() { return nstatus(address()); }
    /** @return a {@link XrPosef} view of the {@code pose} field. */
    public XrPosef pose() { return npose(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEnvironmentRaycastHitMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAEnvironmentRaycast#XR_TYPE_ENVIRONMENT_RAYCAST_HIT_META TYPE_ENVIRONMENT_RAYCAST_HIT_META} value to the {@code type} field. */
    public XrEnvironmentRaycastHitMETA type$Default() { return type(METAEnvironmentRaycast.XR_TYPE_ENVIRONMENT_RAYCAST_HIT_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrEnvironmentRaycastHitMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code status} field. */
    public XrEnvironmentRaycastHitMETA status(@NativeType("XrEnvironmentRaycastHitStatusMETA") int value) { nstatus(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code pose} field. */
    public XrEnvironmentRaycastHitMETA pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrEnvironmentRaycastHitMETA pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }

    /** Initializes this struct with the specified values. */
    public XrEnvironmentRaycastHitMETA set(
        int type,
        long next,
        int status,
        XrPosef pose
    ) {
        type(type);
        next(next);
        status(status);
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
    public XrEnvironmentRaycastHitMETA set(XrEnvironmentRaycastHitMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEnvironmentRaycastHitMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEnvironmentRaycastHitMETA malloc() {
        return new XrEnvironmentRaycastHitMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentRaycastHitMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEnvironmentRaycastHitMETA calloc() {
        return new XrEnvironmentRaycastHitMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentRaycastHitMETA} instance allocated with {@link BufferUtils}. */
    public static XrEnvironmentRaycastHitMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEnvironmentRaycastHitMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEnvironmentRaycastHitMETA} instance for the specified memory address. */
    public static XrEnvironmentRaycastHitMETA create(long address) {
        return new XrEnvironmentRaycastHitMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEnvironmentRaycastHitMETA createSafe(long address) {
        return address == NULL ? null : new XrEnvironmentRaycastHitMETA(address, null);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycastHitMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycastHitMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycastHitMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycastHitMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycastHitMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycastHitMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEnvironmentRaycastHitMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycastHitMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEnvironmentRaycastHitMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEnvironmentRaycastHitMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentRaycastHitMETA malloc(MemoryStack stack) {
        return new XrEnvironmentRaycastHitMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEnvironmentRaycastHitMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentRaycastHitMETA calloc(MemoryStack stack) {
        return new XrEnvironmentRaycastHitMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycastHitMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycastHitMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycastHitMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycastHitMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEnvironmentRaycastHitMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEnvironmentRaycastHitMETA.NEXT); }
    /** Unsafe version of {@link #status}. */
    public static int nstatus(long struct) { return memGetInt(struct + XrEnvironmentRaycastHitMETA.STATUS); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrEnvironmentRaycastHitMETA.POSE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEnvironmentRaycastHitMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEnvironmentRaycastHitMETA.NEXT, value); }
    /** Unsafe version of {@link #status(int) status}. */
    public static void nstatus(long struct, int value) { memPutInt(struct + XrEnvironmentRaycastHitMETA.STATUS, value); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrEnvironmentRaycastHitMETA.POSE, XrPosef.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrEnvironmentRaycastHitMETA} structs. */
    public static class Buffer extends StructBuffer<XrEnvironmentRaycastHitMETA, Buffer> implements NativeResource {

        private static final XrEnvironmentRaycastHitMETA ELEMENT_FACTORY = XrEnvironmentRaycastHitMETA.create(-1L);

        /**
         * Creates a new {@code XrEnvironmentRaycastHitMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEnvironmentRaycastHitMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEnvironmentRaycastHitMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEnvironmentRaycastHitMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEnvironmentRaycastHitMETA.nnext(address()); }
        /** @return the value of the {@code status} field. */
        @NativeType("XrEnvironmentRaycastHitStatusMETA")
        public int status() { return XrEnvironmentRaycastHitMETA.nstatus(address()); }
        /** @return a {@link XrPosef} view of the {@code pose} field. */
        public XrPosef pose() { return XrEnvironmentRaycastHitMETA.npose(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEnvironmentRaycastHitMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEnvironmentRaycastHitMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAEnvironmentRaycast#XR_TYPE_ENVIRONMENT_RAYCAST_HIT_META TYPE_ENVIRONMENT_RAYCAST_HIT_META} value to the {@code type} field. */
        public XrEnvironmentRaycastHitMETA.Buffer type$Default() { return type(METAEnvironmentRaycast.XR_TYPE_ENVIRONMENT_RAYCAST_HIT_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrEnvironmentRaycastHitMETA.Buffer next(@NativeType("void const *") long value) { XrEnvironmentRaycastHitMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code status} field. */
        public XrEnvironmentRaycastHitMETA.Buffer status(@NativeType("XrEnvironmentRaycastHitStatusMETA") int value) { XrEnvironmentRaycastHitMETA.nstatus(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code pose} field. */
        public XrEnvironmentRaycastHitMETA.Buffer pose(XrPosef value) { XrEnvironmentRaycastHitMETA.npose(address(), value); return this; }
        /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrEnvironmentRaycastHitMETA.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }

    }

}