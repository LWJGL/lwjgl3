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
 * struct XrHandMeshIndexBufferMSFT {
 *     uint32_t indexBufferKey;
 *     uint32_t indexCapacityInput;
 *     uint32_t indexCountOutput;
 *     uint32_t * indices;
 * }}</pre>
 */
public class XrHandMeshIndexBufferMSFT extends Struct<XrHandMeshIndexBufferMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INDEXBUFFERKEY,
        INDEXCAPACITYINPUT,
        INDEXCOUNTOUTPUT,
        INDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INDEXBUFFERKEY = layout.offsetof(0);
        INDEXCAPACITYINPUT = layout.offsetof(1);
        INDEXCOUNTOUTPUT = layout.offsetof(2);
        INDICES = layout.offsetof(3);
    }

    protected XrHandMeshIndexBufferMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHandMeshIndexBufferMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrHandMeshIndexBufferMSFT(address, container);
    }

    /**
     * Creates a {@code XrHandMeshIndexBufferMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandMeshIndexBufferMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code indexBufferKey} field. */
    @NativeType("uint32_t")
    public int indexBufferKey() { return nindexBufferKey(address()); }
    /** @return the value of the {@code indexCapacityInput} field. */
    @NativeType("uint32_t")
    public int indexCapacityInput() { return nindexCapacityInput(address()); }
    /** @return the value of the {@code indexCountOutput} field. */
    @NativeType("uint32_t")
    public int indexCountOutput() { return nindexCountOutput(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code indices} field. */
    @NativeType("uint32_t *")
    public @Nullable IntBuffer indices() { return nindices(address()); }

    /** Sets the specified value to the {@code indexBufferKey} field. */
    public XrHandMeshIndexBufferMSFT indexBufferKey(@NativeType("uint32_t") int value) { nindexBufferKey(address(), value); return this; }
    /** Sets the specified value to the {@code indexCapacityInput} field. */
    public XrHandMeshIndexBufferMSFT indexCapacityInput(@NativeType("uint32_t") int value) { nindexCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code indexCountOutput} field. */
    public XrHandMeshIndexBufferMSFT indexCountOutput(@NativeType("uint32_t") int value) { nindexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code indices} field. */
    public XrHandMeshIndexBufferMSFT indices(@Nullable @NativeType("uint32_t *") IntBuffer value) { nindices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandMeshIndexBufferMSFT set(
        int indexBufferKey,
        int indexCapacityInput,
        int indexCountOutput,
        @Nullable IntBuffer indices
    ) {
        indexBufferKey(indexBufferKey);
        indexCapacityInput(indexCapacityInput);
        indexCountOutput(indexCountOutput);
        indices(indices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandMeshIndexBufferMSFT set(XrHandMeshIndexBufferMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandMeshIndexBufferMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandMeshIndexBufferMSFT malloc() {
        return new XrHandMeshIndexBufferMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHandMeshIndexBufferMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandMeshIndexBufferMSFT calloc() {
        return new XrHandMeshIndexBufferMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHandMeshIndexBufferMSFT} instance allocated with {@link BufferUtils}. */
    public static XrHandMeshIndexBufferMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHandMeshIndexBufferMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrHandMeshIndexBufferMSFT} instance for the specified memory address. */
    public static XrHandMeshIndexBufferMSFT create(long address) {
        return new XrHandMeshIndexBufferMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrHandMeshIndexBufferMSFT createSafe(long address) {
        return address == NULL ? null : new XrHandMeshIndexBufferMSFT(address, null);
    }

    /**
     * Returns a new {@link XrHandMeshIndexBufferMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshIndexBufferMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshIndexBufferMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshIndexBufferMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshIndexBufferMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshIndexBufferMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHandMeshIndexBufferMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandMeshIndexBufferMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrHandMeshIndexBufferMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrHandMeshIndexBufferMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshIndexBufferMSFT malloc(MemoryStack stack) {
        return new XrHandMeshIndexBufferMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHandMeshIndexBufferMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshIndexBufferMSFT calloc(MemoryStack stack) {
        return new XrHandMeshIndexBufferMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHandMeshIndexBufferMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshIndexBufferMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshIndexBufferMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshIndexBufferMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #indexBufferKey}. */
    public static int nindexBufferKey(long struct) { return memGetInt(struct + XrHandMeshIndexBufferMSFT.INDEXBUFFERKEY); }
    /** Unsafe version of {@link #indexCapacityInput}. */
    public static int nindexCapacityInput(long struct) { return memGetInt(struct + XrHandMeshIndexBufferMSFT.INDEXCAPACITYINPUT); }
    /** Unsafe version of {@link #indexCountOutput}. */
    public static int nindexCountOutput(long struct) { return memGetInt(struct + XrHandMeshIndexBufferMSFT.INDEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #indices() indices}. */
    public static @Nullable IntBuffer nindices(long struct) { return memIntBufferSafe(memGetAddress(struct + XrHandMeshIndexBufferMSFT.INDICES), nindexCapacityInput(struct)); }

    /** Unsafe version of {@link #indexBufferKey(int) indexBufferKey}. */
    public static void nindexBufferKey(long struct, int value) { memPutInt(struct + XrHandMeshIndexBufferMSFT.INDEXBUFFERKEY, value); }
    /** Sets the specified value to the {@code indexCapacityInput} field of the specified {@code struct}. */
    public static void nindexCapacityInput(long struct, int value) { memPutInt(struct + XrHandMeshIndexBufferMSFT.INDEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #indexCountOutput(int) indexCountOutput}. */
    public static void nindexCountOutput(long struct, int value) { memPutInt(struct + XrHandMeshIndexBufferMSFT.INDEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #indices(IntBuffer) indices}. */
    public static void nindices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrHandMeshIndexBufferMSFT.INDICES, memAddressSafe(value)); if (value != null) { nindexCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrHandMeshIndexBufferMSFT} structs. */
    public static class Buffer extends StructBuffer<XrHandMeshIndexBufferMSFT, Buffer> implements NativeResource {

        private static final XrHandMeshIndexBufferMSFT ELEMENT_FACTORY = XrHandMeshIndexBufferMSFT.create(-1L);

        /**
         * Creates a new {@code XrHandMeshIndexBufferMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandMeshIndexBufferMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrHandMeshIndexBufferMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code indexBufferKey} field. */
        @NativeType("uint32_t")
        public int indexBufferKey() { return XrHandMeshIndexBufferMSFT.nindexBufferKey(address()); }
        /** @return the value of the {@code indexCapacityInput} field. */
        @NativeType("uint32_t")
        public int indexCapacityInput() { return XrHandMeshIndexBufferMSFT.nindexCapacityInput(address()); }
        /** @return the value of the {@code indexCountOutput} field. */
        @NativeType("uint32_t")
        public int indexCountOutput() { return XrHandMeshIndexBufferMSFT.nindexCountOutput(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code indices} field. */
        @NativeType("uint32_t *")
        public @Nullable IntBuffer indices() { return XrHandMeshIndexBufferMSFT.nindices(address()); }

        /** Sets the specified value to the {@code indexBufferKey} field. */
        public XrHandMeshIndexBufferMSFT.Buffer indexBufferKey(@NativeType("uint32_t") int value) { XrHandMeshIndexBufferMSFT.nindexBufferKey(address(), value); return this; }
        /** Sets the specified value to the {@code indexCapacityInput} field. */
        public XrHandMeshIndexBufferMSFT.Buffer indexCapacityInput(@NativeType("uint32_t") int value) { XrHandMeshIndexBufferMSFT.nindexCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code indexCountOutput} field. */
        public XrHandMeshIndexBufferMSFT.Buffer indexCountOutput(@NativeType("uint32_t") int value) { XrHandMeshIndexBufferMSFT.nindexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code indices} field. */
        public XrHandMeshIndexBufferMSFT.Buffer indices(@Nullable @NativeType("uint32_t *") IntBuffer value) { XrHandMeshIndexBufferMSFT.nindices(address(), value); return this; }

    }

}