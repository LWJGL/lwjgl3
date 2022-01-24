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
 * Universally Unique Identifier.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstanding XR_MSFT_scene_understanding} extension <b>must</b> be enabled prior to using {@link XrUuidMSFT}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSceneComponentMSFT}, {@link XrSceneComponentParentFilterInfoMSFT}, {@link XrSceneComponentsLocateInfoMSFT}, {@link XrSerializedSceneFragmentDataGetInfoMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrUuidMSFT {
 *     uint8_t {@link #bytes}[16];
 * }</code></pre>
 */
public class XrUuidMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BYTES;

    static {
        Layout layout = __struct(
            __array(1, 16)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BYTES = layout.offsetof(0);
    }

    /**
     * Creates a {@code XrUuidMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrUuidMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a 128-bit Variant-1 Universally Unique Identifier. */
    @NativeType("uint8_t[16]")
    public ByteBuffer bytes() { return nbytes(address()); }
    /** a 128-bit Variant-1 Universally Unique Identifier. */
    @NativeType("uint8_t")
    public byte bytes(int index) { return nbytes(address(), index); }

    /** Copies the specified {@link ByteBuffer} to the {@link #bytes} field. */
    public XrUuidMSFT bytes(@NativeType("uint8_t[16]") ByteBuffer value) { nbytes(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #bytes} field. */
    public XrUuidMSFT bytes(int index, @NativeType("uint8_t") byte value) { nbytes(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrUuidMSFT set(XrUuidMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrUuidMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrUuidMSFT malloc() {
        return wrap(XrUuidMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrUuidMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrUuidMSFT calloc() {
        return wrap(XrUuidMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrUuidMSFT} instance allocated with {@link BufferUtils}. */
    public static XrUuidMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrUuidMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrUuidMSFT} instance for the specified memory address. */
    public static XrUuidMSFT create(long address) {
        return wrap(XrUuidMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrUuidMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrUuidMSFT.class, address);
    }

    /**
     * Returns a new {@link XrUuidMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrUuidMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrUuidMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrUuidMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrUuidMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrUuidMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrUuidMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrUuidMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrUuidMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrUuidMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrUuidMSFT malloc(MemoryStack stack) {
        return wrap(XrUuidMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrUuidMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrUuidMSFT calloc(MemoryStack stack) {
        return wrap(XrUuidMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrUuidMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrUuidMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrUuidMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrUuidMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bytes}. */
    public static ByteBuffer nbytes(long struct) { return memByteBuffer(struct + XrUuidMSFT.BYTES, 16); }
    /** Unsafe version of {@link #bytes(int) bytes}. */
    public static byte nbytes(long struct, int index) {
        return UNSAFE.getByte(null, struct + XrUuidMSFT.BYTES + check(index, 16) * 1);
    }

    /** Unsafe version of {@link #bytes(ByteBuffer) bytes}. */
    public static void nbytes(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 16); }
        memCopy(memAddress(value), struct + XrUuidMSFT.BYTES, value.remaining() * 1);
    }
    /** Unsafe version of {@link #bytes(int, byte) bytes}. */
    public static void nbytes(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + XrUuidMSFT.BYTES + check(index, 16) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link XrUuidMSFT} structs. */
    public static class Buffer extends StructBuffer<XrUuidMSFT, Buffer> implements NativeResource {

        private static final XrUuidMSFT ELEMENT_FACTORY = XrUuidMSFT.create(-1L);

        /**
         * Creates a new {@code XrUuidMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrUuidMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrUuidMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@link XrUuidMSFT#bytes} field. */
        @NativeType("uint8_t[16]")
        public ByteBuffer bytes() { return XrUuidMSFT.nbytes(address()); }
        /** @return the value at the specified index of the {@link XrUuidMSFT#bytes} field. */
        @NativeType("uint8_t")
        public byte bytes(int index) { return XrUuidMSFT.nbytes(address(), index); }

        /** Copies the specified {@link ByteBuffer} to the {@link XrUuidMSFT#bytes} field. */
        public XrUuidMSFT.Buffer bytes(@NativeType("uint8_t[16]") ByteBuffer value) { XrUuidMSFT.nbytes(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link XrUuidMSFT#bytes} field. */
        public XrUuidMSFT.Buffer bytes(int index, @NativeType("uint8_t") byte value) { XrUuidMSFT.nbytes(address(), index, value); return this; }

    }

}