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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Deserialize Scene Fragment.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSceneUnderstandingSerialization XR_MSFT_scene_understanding_serialization} extension <b>must</b> be enabled prior to using {@link XrDeserializeSceneFragmentMSFT}</li>
 * <li>If {@code bufferSize} is not 0, {@code buffer} <b>must</b> be a pointer to an array of {@code bufferSize} {@code uint8_t} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSceneDeserializeInfoMSFT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrDeserializeSceneFragmentMSFT {
 *     uint32_t {@link #bufferSize};
 *     uint8_t const * {@link #buffer};
 * }</code></pre>
 */
public class XrDeserializeSceneFragmentMSFT extends Struct<XrDeserializeSceneFragmentMSFT> implements NativeResource {

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

    protected XrDeserializeSceneFragmentMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrDeserializeSceneFragmentMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrDeserializeSceneFragmentMSFT(address, container);
    }

    /**
     * Creates a {@code XrDeserializeSceneFragmentMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrDeserializeSceneFragmentMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the size of the {@code buffer} array. */
    @NativeType("uint32_t")
    public int bufferSize() { return nbufferSize(address()); }
    /** an array of {@code uint_8} data for the scene fragment to be deserialized. */
    @Nullable
    @NativeType("uint8_t const *")
    public ByteBuffer buffer() { return nbuffer(address()); }

    /** Sets the specified value to the {@link #bufferSize} field. */
    public XrDeserializeSceneFragmentMSFT bufferSize(@NativeType("uint32_t") int value) { nbufferSize(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #buffer} field. */
    public XrDeserializeSceneFragmentMSFT buffer(@Nullable @NativeType("uint8_t const *") ByteBuffer value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrDeserializeSceneFragmentMSFT set(
        int bufferSize,
        @Nullable ByteBuffer buffer
    ) {
        bufferSize(bufferSize);
        buffer(buffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrDeserializeSceneFragmentMSFT set(XrDeserializeSceneFragmentMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrDeserializeSceneFragmentMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrDeserializeSceneFragmentMSFT malloc() {
        return new XrDeserializeSceneFragmentMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrDeserializeSceneFragmentMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrDeserializeSceneFragmentMSFT calloc() {
        return new XrDeserializeSceneFragmentMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrDeserializeSceneFragmentMSFT} instance allocated with {@link BufferUtils}. */
    public static XrDeserializeSceneFragmentMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrDeserializeSceneFragmentMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrDeserializeSceneFragmentMSFT} instance for the specified memory address. */
    public static XrDeserializeSceneFragmentMSFT create(long address) {
        return new XrDeserializeSceneFragmentMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrDeserializeSceneFragmentMSFT createSafe(long address) {
        return address == NULL ? null : new XrDeserializeSceneFragmentMSFT(address, null);
    }

    /**
     * Returns a new {@link XrDeserializeSceneFragmentMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDeserializeSceneFragmentMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrDeserializeSceneFragmentMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDeserializeSceneFragmentMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDeserializeSceneFragmentMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrDeserializeSceneFragmentMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrDeserializeSceneFragmentMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrDeserializeSceneFragmentMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrDeserializeSceneFragmentMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrDeserializeSceneFragmentMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDeserializeSceneFragmentMSFT malloc(MemoryStack stack) {
        return new XrDeserializeSceneFragmentMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrDeserializeSceneFragmentMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDeserializeSceneFragmentMSFT calloc(MemoryStack stack) {
        return new XrDeserializeSceneFragmentMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrDeserializeSceneFragmentMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDeserializeSceneFragmentMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDeserializeSceneFragmentMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDeserializeSceneFragmentMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bufferSize}. */
    public static int nbufferSize(long struct) { return UNSAFE.getInt(null, struct + XrDeserializeSceneFragmentMSFT.BUFFERSIZE); }
    /** Unsafe version of {@link #buffer() buffer}. */
    @Nullable public static ByteBuffer nbuffer(long struct) { return memByteBufferSafe(memGetAddress(struct + XrDeserializeSceneFragmentMSFT.BUFFER), nbufferSize(struct)); }

    /** Sets the specified value to the {@code bufferSize} field of the specified {@code struct}. */
    public static void nbufferSize(long struct, int value) { UNSAFE.putInt(null, struct + XrDeserializeSceneFragmentMSFT.BUFFERSIZE, value); }
    /** Unsafe version of {@link #buffer(ByteBuffer) buffer}. */
    public static void nbuffer(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + XrDeserializeSceneFragmentMSFT.BUFFER, memAddressSafe(value)); if (value != null) { nbufferSize(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrDeserializeSceneFragmentMSFT} structs. */
    public static class Buffer extends StructBuffer<XrDeserializeSceneFragmentMSFT, Buffer> implements NativeResource {

        private static final XrDeserializeSceneFragmentMSFT ELEMENT_FACTORY = XrDeserializeSceneFragmentMSFT.create(-1L);

        /**
         * Creates a new {@code XrDeserializeSceneFragmentMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrDeserializeSceneFragmentMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrDeserializeSceneFragmentMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrDeserializeSceneFragmentMSFT#bufferSize} field. */
        @NativeType("uint32_t")
        public int bufferSize() { return XrDeserializeSceneFragmentMSFT.nbufferSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link XrDeserializeSceneFragmentMSFT#buffer} field. */
        @Nullable
        @NativeType("uint8_t const *")
        public ByteBuffer buffer() { return XrDeserializeSceneFragmentMSFT.nbuffer(address()); }

        /** Sets the specified value to the {@link XrDeserializeSceneFragmentMSFT#bufferSize} field. */
        public XrDeserializeSceneFragmentMSFT.Buffer bufferSize(@NativeType("uint32_t") int value) { XrDeserializeSceneFragmentMSFT.nbufferSize(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link XrDeserializeSceneFragmentMSFT#buffer} field. */
        public XrDeserializeSceneFragmentMSFT.Buffer buffer(@Nullable @NativeType("uint8_t const *") ByteBuffer value) { XrDeserializeSceneFragmentMSFT.nbuffer(address(), value); return this; }

    }

}