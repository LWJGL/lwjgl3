/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Passthrough color LUT data.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrPassthroughColorLutDataMETA} defines the LUT data for a color LUT. This structure is used when creating and updating color LUTs.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAPassthroughColorLut XR_META_passthrough_color_lut} extension <b>must</b> be enabled prior to using {@link XrPassthroughColorLutDataMETA}</li>
 * <li>{@code buffer} <b>must</b> be a pointer to an array of {@code bufferSize} {@code uint8_t} values</li>
 * <li>The {@code bufferSize} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrPassthroughColorLutCreateInfoMETA}, {@link XrPassthroughColorLutUpdateInfoMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrPassthroughColorLutDataMETA {
 *     uint32_t {@link #bufferSize};
 *     uint8_t const * {@link #buffer};
 * }</code></pre>
 */
public class XrPassthroughColorLutDataMETA extends Struct<XrPassthroughColorLutDataMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUFFERSIZE,
        BUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BUFFERSIZE = layout.offsetof(0);
        BUFFER = layout.offsetof(1);
    }

    protected XrPassthroughColorLutDataMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPassthroughColorLutDataMETA create(long address, @Nullable ByteBuffer container) {
        return new XrPassthroughColorLutDataMETA(address, container);
    }

    /**
     * Creates a {@code XrPassthroughColorLutDataMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPassthroughColorLutDataMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the number of bytes contained in the buffer data. */
    @NativeType("uint32_t")
    public int bufferSize() { return nbufferSize(address()); }
    /** a pointer to a memory block of {@code bufferSize} bytes that contains the LUT data. */
    @NativeType("uint8_t const *")
    public ByteBuffer buffer() { return nbuffer(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@link #buffer} field. */
    public XrPassthroughColorLutDataMETA buffer(@NativeType("uint8_t const *") ByteBuffer value) { nbuffer(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPassthroughColorLutDataMETA set(XrPassthroughColorLutDataMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPassthroughColorLutDataMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPassthroughColorLutDataMETA malloc() {
        return new XrPassthroughColorLutDataMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughColorLutDataMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPassthroughColorLutDataMETA calloc() {
        return new XrPassthroughColorLutDataMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughColorLutDataMETA} instance allocated with {@link BufferUtils}. */
    public static XrPassthroughColorLutDataMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPassthroughColorLutDataMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrPassthroughColorLutDataMETA} instance for the specified memory address. */
    public static XrPassthroughColorLutDataMETA create(long address) {
        return new XrPassthroughColorLutDataMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPassthroughColorLutDataMETA createSafe(long address) {
        return address == NULL ? null : new XrPassthroughColorLutDataMETA(address, null);
    }

    /**
     * Returns a new {@link XrPassthroughColorLutDataMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutDataMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorLutDataMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutDataMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorLutDataMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutDataMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPassthroughColorLutDataMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutDataMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPassthroughColorLutDataMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPassthroughColorLutDataMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughColorLutDataMETA malloc(MemoryStack stack) {
        return new XrPassthroughColorLutDataMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPassthroughColorLutDataMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughColorLutDataMETA calloc(MemoryStack stack) {
        return new XrPassthroughColorLutDataMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPassthroughColorLutDataMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutDataMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughColorLutDataMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughColorLutDataMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bufferSize}. */
    public static int nbufferSize(long struct) { return UNSAFE.getInt(null, struct + XrPassthroughColorLutDataMETA.BUFFERSIZE); }
    /** Unsafe version of {@link #buffer() buffer}. */
    public static ByteBuffer nbuffer(long struct) { return memByteBuffer(memGetAddress(struct + XrPassthroughColorLutDataMETA.BUFFER), nbufferSize(struct)); }

    /** Sets the specified value to the {@code bufferSize} field of the specified {@code struct}. */
    public static void nbufferSize(long struct, int value) { UNSAFE.putInt(null, struct + XrPassthroughColorLutDataMETA.BUFFERSIZE, value); }
    /** Unsafe version of {@link #buffer(ByteBuffer) buffer}. */
    public static void nbuffer(long struct, ByteBuffer value) { memPutAddress(struct + XrPassthroughColorLutDataMETA.BUFFER, memAddress(value)); nbufferSize(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrPassthroughColorLutDataMETA.BUFFER));
    }

    // -----------------------------------

    /** An array of {@link XrPassthroughColorLutDataMETA} structs. */
    public static class Buffer extends StructBuffer<XrPassthroughColorLutDataMETA, Buffer> implements NativeResource {

        private static final XrPassthroughColorLutDataMETA ELEMENT_FACTORY = XrPassthroughColorLutDataMETA.create(-1L);

        /**
         * Creates a new {@code XrPassthroughColorLutDataMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPassthroughColorLutDataMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPassthroughColorLutDataMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrPassthroughColorLutDataMETA#bufferSize} field. */
        @NativeType("uint32_t")
        public int bufferSize() { return XrPassthroughColorLutDataMETA.nbufferSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link XrPassthroughColorLutDataMETA#buffer} field. */
        @NativeType("uint8_t const *")
        public ByteBuffer buffer() { return XrPassthroughColorLutDataMETA.nbuffer(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@link XrPassthroughColorLutDataMETA#buffer} field. */
        public XrPassthroughColorLutDataMETA.Buffer buffer(@NativeType("uint8_t const *") ByteBuffer value) { XrPassthroughColorLutDataMETA.nbuffer(address(), value); return this; }

    }

}