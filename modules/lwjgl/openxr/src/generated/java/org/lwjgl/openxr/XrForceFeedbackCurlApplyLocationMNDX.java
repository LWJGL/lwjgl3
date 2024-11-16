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
 * Structure representing and containing information on how to apply force feedback to a single location.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code value} is specified as a limit in a single direction. For example, if the value specified is 0.5, a location <b>must</b> have free movement from the point where it would be incapable of movement if {@code value} was 1, to 0.5 of the range the location is capable of moving.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MNDXForceFeedbackCurl XR_MNDX_force_feedback_curl} extension <b>must</b> be enabled prior to using {@link XrForceFeedbackCurlApplyLocationMNDX}</li>
 * <li>{@code location} <b>must</b> be a valid {@code XrForceFeedbackCurlLocationMNDX} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrForceFeedbackCurlApplyLocationsMNDX}, {@link MNDXForceFeedbackCurl#xrApplyForceFeedbackCurlMNDX ApplyForceFeedbackCurlMNDX}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrForceFeedbackCurlApplyLocationMNDX {
 *     XrForceFeedbackCurlLocationMNDX {@link #location};
 *     float {@link #value};
 * }</code></pre>
 */
public class XrForceFeedbackCurlApplyLocationMNDX extends Struct<XrForceFeedbackCurlApplyLocationMNDX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LOCATION,
        VALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LOCATION = layout.offsetof(0);
        VALUE = layout.offsetof(1);
    }

    protected XrForceFeedbackCurlApplyLocationMNDX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrForceFeedbackCurlApplyLocationMNDX create(long address, @Nullable ByteBuffer container) {
        return new XrForceFeedbackCurlApplyLocationMNDX(address, container);
    }

    /**
     * Creates a {@code XrForceFeedbackCurlApplyLocationMNDX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrForceFeedbackCurlApplyLocationMNDX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** represents the location to apply force feedback to. */
    @NativeType("XrForceFeedbackCurlLocationMNDX")
    public int location() { return nlocation(address()); }
    /** a value from 0-1 representing the amount of force feedback to apply. The range of the value should represent the entire range the location is capable of moving through, with 1 representing making the location incapable of movement, and 0 being fully flexible. For example, in the case of a finger curl, setting {@code value} to 1 would prevent the finger from curling at all (fully extended), and 0 would allow the finger to have free range of movement, being able to curl fully. */
    public float value() { return nvalue(address()); }

    /** Sets the specified value to the {@link #location} field. */
    public XrForceFeedbackCurlApplyLocationMNDX location(@NativeType("XrForceFeedbackCurlLocationMNDX") int value) { nlocation(address(), value); return this; }
    /** Sets the specified value to the {@link #value} field. */
    public XrForceFeedbackCurlApplyLocationMNDX value(float value) { nvalue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrForceFeedbackCurlApplyLocationMNDX set(
        int location,
        float value
    ) {
        location(location);
        value(value);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrForceFeedbackCurlApplyLocationMNDX set(XrForceFeedbackCurlApplyLocationMNDX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrForceFeedbackCurlApplyLocationMNDX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrForceFeedbackCurlApplyLocationMNDX malloc() {
        return new XrForceFeedbackCurlApplyLocationMNDX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrForceFeedbackCurlApplyLocationMNDX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrForceFeedbackCurlApplyLocationMNDX calloc() {
        return new XrForceFeedbackCurlApplyLocationMNDX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrForceFeedbackCurlApplyLocationMNDX} instance allocated with {@link BufferUtils}. */
    public static XrForceFeedbackCurlApplyLocationMNDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrForceFeedbackCurlApplyLocationMNDX(memAddress(container), container);
    }

    /** Returns a new {@code XrForceFeedbackCurlApplyLocationMNDX} instance for the specified memory address. */
    public static XrForceFeedbackCurlApplyLocationMNDX create(long address) {
        return new XrForceFeedbackCurlApplyLocationMNDX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrForceFeedbackCurlApplyLocationMNDX createSafe(long address) {
        return address == NULL ? null : new XrForceFeedbackCurlApplyLocationMNDX(address, null);
    }

    /**
     * Returns a new {@link XrForceFeedbackCurlApplyLocationMNDX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrForceFeedbackCurlApplyLocationMNDX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrForceFeedbackCurlApplyLocationMNDX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrForceFeedbackCurlApplyLocationMNDX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrForceFeedbackCurlApplyLocationMNDX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrForceFeedbackCurlApplyLocationMNDX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrForceFeedbackCurlApplyLocationMNDX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrForceFeedbackCurlApplyLocationMNDX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrForceFeedbackCurlApplyLocationMNDX.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrForceFeedbackCurlApplyLocationMNDX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrForceFeedbackCurlApplyLocationMNDX malloc(MemoryStack stack) {
        return new XrForceFeedbackCurlApplyLocationMNDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrForceFeedbackCurlApplyLocationMNDX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrForceFeedbackCurlApplyLocationMNDX calloc(MemoryStack stack) {
        return new XrForceFeedbackCurlApplyLocationMNDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrForceFeedbackCurlApplyLocationMNDX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrForceFeedbackCurlApplyLocationMNDX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrForceFeedbackCurlApplyLocationMNDX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrForceFeedbackCurlApplyLocationMNDX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #location}. */
    public static int nlocation(long struct) { return memGetInt(struct + XrForceFeedbackCurlApplyLocationMNDX.LOCATION); }
    /** Unsafe version of {@link #value}. */
    public static float nvalue(long struct) { return memGetFloat(struct + XrForceFeedbackCurlApplyLocationMNDX.VALUE); }

    /** Unsafe version of {@link #location(int) location}. */
    public static void nlocation(long struct, int value) { memPutInt(struct + XrForceFeedbackCurlApplyLocationMNDX.LOCATION, value); }
    /** Unsafe version of {@link #value(float) value}. */
    public static void nvalue(long struct, float value) { memPutFloat(struct + XrForceFeedbackCurlApplyLocationMNDX.VALUE, value); }

    // -----------------------------------

    /** An array of {@link XrForceFeedbackCurlApplyLocationMNDX} structs. */
    public static class Buffer extends StructBuffer<XrForceFeedbackCurlApplyLocationMNDX, Buffer> implements NativeResource {

        private static final XrForceFeedbackCurlApplyLocationMNDX ELEMENT_FACTORY = XrForceFeedbackCurlApplyLocationMNDX.create(-1L);

        /**
         * Creates a new {@code XrForceFeedbackCurlApplyLocationMNDX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrForceFeedbackCurlApplyLocationMNDX#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrForceFeedbackCurlApplyLocationMNDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrForceFeedbackCurlApplyLocationMNDX#location} field. */
        @NativeType("XrForceFeedbackCurlLocationMNDX")
        public int location() { return XrForceFeedbackCurlApplyLocationMNDX.nlocation(address()); }
        /** @return the value of the {@link XrForceFeedbackCurlApplyLocationMNDX#value} field. */
        public float value() { return XrForceFeedbackCurlApplyLocationMNDX.nvalue(address()); }

        /** Sets the specified value to the {@link XrForceFeedbackCurlApplyLocationMNDX#location} field. */
        public XrForceFeedbackCurlApplyLocationMNDX.Buffer location(@NativeType("XrForceFeedbackCurlLocationMNDX") int value) { XrForceFeedbackCurlApplyLocationMNDX.nlocation(address(), value); return this; }
        /** Sets the specified value to the {@link XrForceFeedbackCurlApplyLocationMNDX#value} field. */
        public XrForceFeedbackCurlApplyLocationMNDX.Buffer value(float value) { XrForceFeedbackCurlApplyLocationMNDX.nvalue(address(), value); return this; }

    }

}