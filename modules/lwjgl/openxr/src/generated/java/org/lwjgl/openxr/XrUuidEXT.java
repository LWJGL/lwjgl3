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

import static org.lwjgl.openxr.EXTUUIUD.*;

/**
 * Universally Unique Identifier.
 * 
 * <h5>Description</h5>
 * 
 * <p>The structure is composed of 16 octets, with the size and order of the fields defined in <a target="_blank" href="https://www.rfc-editor.org/rfc/rfc4122.html#section-4.1.2">RFC 4122 section 4.1.2</a>.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTUUIUD XR_EXT_uuid} extension <b>must</b> be enabled prior to using {@link XrUuidEXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrUuidEXT {
 *     uint8_t {@link #data}[XR_UUID_SIZE_EXT];
 * }</code></pre>
 */
public class XrUuidEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATA;

    static {
        Layout layout = __struct(
            __array(1, XR_UUID_SIZE_EXT)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATA = layout.offsetof(0);
    }

    /**
     * Creates a {@code XrUuidEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrUuidEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a 128-bit Universally Unique Identifier. */
    @NativeType("uint8_t[XR_UUID_SIZE_EXT]")
    public ByteBuffer data() { return ndata(address()); }
    /** a 128-bit Universally Unique Identifier. */
    @NativeType("uint8_t")
    public byte data(int index) { return ndata(address(), index); }

    /** Copies the specified {@link ByteBuffer} to the {@link #data} field. */
    public XrUuidEXT data(@NativeType("uint8_t[XR_UUID_SIZE_EXT]") ByteBuffer value) { ndata(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #data} field. */
    public XrUuidEXT data(int index, @NativeType("uint8_t") byte value) { ndata(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrUuidEXT set(XrUuidEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrUuidEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrUuidEXT malloc() {
        return wrap(XrUuidEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrUuidEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrUuidEXT calloc() {
        return wrap(XrUuidEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrUuidEXT} instance allocated with {@link BufferUtils}. */
    public static XrUuidEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrUuidEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrUuidEXT} instance for the specified memory address. */
    public static XrUuidEXT create(long address) {
        return wrap(XrUuidEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrUuidEXT createSafe(long address) {
        return address == NULL ? null : wrap(XrUuidEXT.class, address);
    }

    /**
     * Returns a new {@link XrUuidEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrUuidEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrUuidEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrUuidEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrUuidEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrUuidEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrUuidEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrUuidEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrUuidEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrUuidEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrUuidEXT malloc(MemoryStack stack) {
        return wrap(XrUuidEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrUuidEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrUuidEXT calloc(MemoryStack stack) {
        return wrap(XrUuidEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrUuidEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrUuidEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrUuidEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrUuidEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #data}. */
    public static ByteBuffer ndata(long struct) { return memByteBuffer(struct + XrUuidEXT.DATA, XR_UUID_SIZE_EXT); }
    /** Unsafe version of {@link #data(int) data}. */
    public static byte ndata(long struct, int index) {
        return UNSAFE.getByte(null, struct + XrUuidEXT.DATA + check(index, XR_UUID_SIZE_EXT) * 1);
    }

    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, XR_UUID_SIZE_EXT); }
        memCopy(memAddress(value), struct + XrUuidEXT.DATA, value.remaining() * 1);
    }
    /** Unsafe version of {@link #data(int, byte) data}. */
    public static void ndata(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + XrUuidEXT.DATA + check(index, XR_UUID_SIZE_EXT) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link XrUuidEXT} structs. */
    public static class Buffer extends StructBuffer<XrUuidEXT, Buffer> implements NativeResource {

        private static final XrUuidEXT ELEMENT_FACTORY = XrUuidEXT.create(-1L);

        /**
         * Creates a new {@code XrUuidEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrUuidEXT#SIZEOF}, and its mark will be undefined.
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
        protected XrUuidEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@link XrUuidEXT#data} field. */
        @NativeType("uint8_t[XR_UUID_SIZE_EXT]")
        public ByteBuffer data() { return XrUuidEXT.ndata(address()); }
        /** @return the value at the specified index of the {@link XrUuidEXT#data} field. */
        @NativeType("uint8_t")
        public byte data(int index) { return XrUuidEXT.ndata(address(), index); }

        /** Copies the specified {@link ByteBuffer} to the {@link XrUuidEXT#data} field. */
        public XrUuidEXT.Buffer data(@NativeType("uint8_t[XR_UUID_SIZE_EXT]") ByteBuffer value) { XrUuidEXT.ndata(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link XrUuidEXT#data} field. */
        public XrUuidEXT.Buffer data(int index, @NativeType("uint8_t") byte value) { XrUuidEXT.ndata(address(), index, value); return this; }

    }

}