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
 * struct XrHandJointLocationEXT {
 *     XrSpaceLocationFlags locationFlags;
 *     {@link XrPosef XrPosef} pose;
 *     float radius;
 * }</code></pre>
 */
public class XrHandJointLocationEXT extends Struct<XrHandJointLocationEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LOCATIONFLAGS,
        POSE,
        RADIUS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LOCATIONFLAGS = layout.offsetof(0);
        POSE = layout.offsetof(1);
        RADIUS = layout.offsetof(2);
    }

    protected XrHandJointLocationEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHandJointLocationEXT create(long address, @Nullable ByteBuffer container) {
        return new XrHandJointLocationEXT(address, container);
    }

    /**
     * Creates a {@code XrHandJointLocationEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandJointLocationEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code locationFlags} field. */
    @NativeType("XrSpaceLocationFlags")
    public long locationFlags() { return nlocationFlags(address()); }
    /** @return a {@link XrPosef} view of the {@code pose} field. */
    public XrPosef pose() { return npose(address()); }
    /** @return the value of the {@code radius} field. */
    public float radius() { return nradius(address()); }

    /** Sets the specified value to the {@code locationFlags} field. */
    public XrHandJointLocationEXT locationFlags(@NativeType("XrSpaceLocationFlags") long value) { nlocationFlags(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code pose} field. */
    public XrHandJointLocationEXT pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrHandJointLocationEXT pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Sets the specified value to the {@code radius} field. */
    public XrHandJointLocationEXT radius(float value) { nradius(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandJointLocationEXT set(
        long locationFlags,
        XrPosef pose,
        float radius
    ) {
        locationFlags(locationFlags);
        pose(pose);
        radius(radius);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandJointLocationEXT set(XrHandJointLocationEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandJointLocationEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandJointLocationEXT malloc() {
        return new XrHandJointLocationEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHandJointLocationEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandJointLocationEXT calloc() {
        return new XrHandJointLocationEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHandJointLocationEXT} instance allocated with {@link BufferUtils}. */
    public static XrHandJointLocationEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHandJointLocationEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrHandJointLocationEXT} instance for the specified memory address. */
    public static XrHandJointLocationEXT create(long address) {
        return new XrHandJointLocationEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrHandJointLocationEXT createSafe(long address) {
        return address == NULL ? null : new XrHandJointLocationEXT(address, null);
    }

    /**
     * Returns a new {@link XrHandJointLocationEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandJointLocationEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointLocationEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHandJointLocationEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrHandJointLocationEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrHandJointLocationEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointLocationEXT malloc(MemoryStack stack) {
        return new XrHandJointLocationEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHandJointLocationEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointLocationEXT calloc(MemoryStack stack) {
        return new XrHandJointLocationEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHandJointLocationEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointLocationEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointLocationEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #locationFlags}. */
    public static long nlocationFlags(long struct) { return memGetLong(struct + XrHandJointLocationEXT.LOCATIONFLAGS); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrHandJointLocationEXT.POSE); }
    /** Unsafe version of {@link #radius}. */
    public static float nradius(long struct) { return memGetFloat(struct + XrHandJointLocationEXT.RADIUS); }

    /** Unsafe version of {@link #locationFlags(long) locationFlags}. */
    public static void nlocationFlags(long struct, long value) { memPutLong(struct + XrHandJointLocationEXT.LOCATIONFLAGS, value); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrHandJointLocationEXT.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #radius(float) radius}. */
    public static void nradius(long struct, float value) { memPutFloat(struct + XrHandJointLocationEXT.RADIUS, value); }

    // -----------------------------------

    /** An array of {@link XrHandJointLocationEXT} structs. */
    public static class Buffer extends StructBuffer<XrHandJointLocationEXT, Buffer> implements NativeResource {

        private static final XrHandJointLocationEXT ELEMENT_FACTORY = XrHandJointLocationEXT.create(-1L);

        /**
         * Creates a new {@code XrHandJointLocationEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandJointLocationEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrHandJointLocationEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code locationFlags} field. */
        @NativeType("XrSpaceLocationFlags")
        public long locationFlags() { return XrHandJointLocationEXT.nlocationFlags(address()); }
        /** @return a {@link XrPosef} view of the {@code pose} field. */
        public XrPosef pose() { return XrHandJointLocationEXT.npose(address()); }
        /** @return the value of the {@code radius} field. */
        public float radius() { return XrHandJointLocationEXT.nradius(address()); }

        /** Sets the specified value to the {@code locationFlags} field. */
        public XrHandJointLocationEXT.Buffer locationFlags(@NativeType("XrSpaceLocationFlags") long value) { XrHandJointLocationEXT.nlocationFlags(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code pose} field. */
        public XrHandJointLocationEXT.Buffer pose(XrPosef value) { XrHandJointLocationEXT.npose(address(), value); return this; }
        /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrHandJointLocationEXT.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Sets the specified value to the {@code radius} field. */
        public XrHandJointLocationEXT.Buffer radius(float value) { XrHandJointLocationEXT.nradius(address(), value); return this; }

    }

}