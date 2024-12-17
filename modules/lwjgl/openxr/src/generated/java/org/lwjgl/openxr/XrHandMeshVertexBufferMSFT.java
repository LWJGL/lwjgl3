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
 * struct XrHandMeshVertexBufferMSFT {
 *     XrTime vertexUpdateTime;
 *     uint32_t vertexCapacityInput;
 *     uint32_t vertexCountOutput;
 *     {@link XrHandMeshVertexMSFT XrHandMeshVertexMSFT} * vertices;
 * }}</pre>
 */
public class XrHandMeshVertexBufferMSFT extends Struct<XrHandMeshVertexBufferMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERTEXUPDATETIME,
        VERTEXCAPACITYINPUT,
        VERTEXCOUNTOUTPUT,
        VERTICES;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERTEXUPDATETIME = layout.offsetof(0);
        VERTEXCAPACITYINPUT = layout.offsetof(1);
        VERTEXCOUNTOUTPUT = layout.offsetof(2);
        VERTICES = layout.offsetof(3);
    }

    protected XrHandMeshVertexBufferMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHandMeshVertexBufferMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrHandMeshVertexBufferMSFT(address, container);
    }

    /**
     * Creates a {@code XrHandMeshVertexBufferMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandMeshVertexBufferMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code vertexUpdateTime} field. */
    @NativeType("XrTime")
    public long vertexUpdateTime() { return nvertexUpdateTime(address()); }
    /** @return the value of the {@code vertexCapacityInput} field. */
    @NativeType("uint32_t")
    public int vertexCapacityInput() { return nvertexCapacityInput(address()); }
    /** @return the value of the {@code vertexCountOutput} field. */
    @NativeType("uint32_t")
    public int vertexCountOutput() { return nvertexCountOutput(address()); }
    /** @return a {@link XrHandMeshVertexMSFT.Buffer} view of the struct array pointed to by the {@code vertices} field. */
    @NativeType("XrHandMeshVertexMSFT *")
    public XrHandMeshVertexMSFT.@Nullable Buffer vertices() { return nvertices(address()); }

    /** Sets the specified value to the {@code vertexUpdateTime} field. */
    public XrHandMeshVertexBufferMSFT vertexUpdateTime(@NativeType("XrTime") long value) { nvertexUpdateTime(address(), value); return this; }
    /** Sets the specified value to the {@code vertexCapacityInput} field. */
    public XrHandMeshVertexBufferMSFT vertexCapacityInput(@NativeType("uint32_t") int value) { nvertexCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code vertexCountOutput} field. */
    public XrHandMeshVertexBufferMSFT vertexCountOutput(@NativeType("uint32_t") int value) { nvertexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrHandMeshVertexMSFT.Buffer} to the {@code vertices} field. */
    public XrHandMeshVertexBufferMSFT vertices(@NativeType("XrHandMeshVertexMSFT *") XrHandMeshVertexMSFT.@Nullable Buffer value) { nvertices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandMeshVertexBufferMSFT set(
        long vertexUpdateTime,
        int vertexCapacityInput,
        int vertexCountOutput,
        XrHandMeshVertexMSFT.@Nullable Buffer vertices
    ) {
        vertexUpdateTime(vertexUpdateTime);
        vertexCapacityInput(vertexCapacityInput);
        vertexCountOutput(vertexCountOutput);
        vertices(vertices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandMeshVertexBufferMSFT set(XrHandMeshVertexBufferMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandMeshVertexBufferMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandMeshVertexBufferMSFT malloc() {
        return new XrHandMeshVertexBufferMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHandMeshVertexBufferMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandMeshVertexBufferMSFT calloc() {
        return new XrHandMeshVertexBufferMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHandMeshVertexBufferMSFT} instance allocated with {@link BufferUtils}. */
    public static XrHandMeshVertexBufferMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHandMeshVertexBufferMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrHandMeshVertexBufferMSFT} instance for the specified memory address. */
    public static XrHandMeshVertexBufferMSFT create(long address) {
        return new XrHandMeshVertexBufferMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrHandMeshVertexBufferMSFT createSafe(long address) {
        return address == NULL ? null : new XrHandMeshVertexBufferMSFT(address, null);
    }

    /**
     * Returns a new {@link XrHandMeshVertexBufferMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexBufferMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshVertexBufferMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexBufferMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshVertexBufferMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexBufferMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHandMeshVertexBufferMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexBufferMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrHandMeshVertexBufferMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrHandMeshVertexBufferMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshVertexBufferMSFT malloc(MemoryStack stack) {
        return new XrHandMeshVertexBufferMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHandMeshVertexBufferMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshVertexBufferMSFT calloc(MemoryStack stack) {
        return new XrHandMeshVertexBufferMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHandMeshVertexBufferMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexBufferMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshVertexBufferMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexBufferMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vertexUpdateTime}. */
    public static long nvertexUpdateTime(long struct) { return memGetLong(struct + XrHandMeshVertexBufferMSFT.VERTEXUPDATETIME); }
    /** Unsafe version of {@link #vertexCapacityInput}. */
    public static int nvertexCapacityInput(long struct) { return memGetInt(struct + XrHandMeshVertexBufferMSFT.VERTEXCAPACITYINPUT); }
    /** Unsafe version of {@link #vertexCountOutput}. */
    public static int nvertexCountOutput(long struct) { return memGetInt(struct + XrHandMeshVertexBufferMSFT.VERTEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #vertices}. */
    public static XrHandMeshVertexMSFT.@Nullable Buffer nvertices(long struct) { return XrHandMeshVertexMSFT.createSafe(memGetAddress(struct + XrHandMeshVertexBufferMSFT.VERTICES), nvertexCapacityInput(struct)); }

    /** Unsafe version of {@link #vertexUpdateTime(long) vertexUpdateTime}. */
    public static void nvertexUpdateTime(long struct, long value) { memPutLong(struct + XrHandMeshVertexBufferMSFT.VERTEXUPDATETIME, value); }
    /** Sets the specified value to the {@code vertexCapacityInput} field of the specified {@code struct}. */
    public static void nvertexCapacityInput(long struct, int value) { memPutInt(struct + XrHandMeshVertexBufferMSFT.VERTEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #vertexCountOutput(int) vertexCountOutput}. */
    public static void nvertexCountOutput(long struct, int value) { memPutInt(struct + XrHandMeshVertexBufferMSFT.VERTEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #vertices(XrHandMeshVertexMSFT.Buffer) vertices}. */
    public static void nvertices(long struct, XrHandMeshVertexMSFT.@Nullable Buffer value) { memPutAddress(struct + XrHandMeshVertexBufferMSFT.VERTICES, memAddressSafe(value)); if (value != null) { nvertexCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrHandMeshVertexBufferMSFT} structs. */
    public static class Buffer extends StructBuffer<XrHandMeshVertexBufferMSFT, Buffer> implements NativeResource {

        private static final XrHandMeshVertexBufferMSFT ELEMENT_FACTORY = XrHandMeshVertexBufferMSFT.create(-1L);

        /**
         * Creates a new {@code XrHandMeshVertexBufferMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandMeshVertexBufferMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrHandMeshVertexBufferMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code vertexUpdateTime} field. */
        @NativeType("XrTime")
        public long vertexUpdateTime() { return XrHandMeshVertexBufferMSFT.nvertexUpdateTime(address()); }
        /** @return the value of the {@code vertexCapacityInput} field. */
        @NativeType("uint32_t")
        public int vertexCapacityInput() { return XrHandMeshVertexBufferMSFT.nvertexCapacityInput(address()); }
        /** @return the value of the {@code vertexCountOutput} field. */
        @NativeType("uint32_t")
        public int vertexCountOutput() { return XrHandMeshVertexBufferMSFT.nvertexCountOutput(address()); }
        /** @return a {@link XrHandMeshVertexMSFT.Buffer} view of the struct array pointed to by the {@code vertices} field. */
        @NativeType("XrHandMeshVertexMSFT *")
        public XrHandMeshVertexMSFT.@Nullable Buffer vertices() { return XrHandMeshVertexBufferMSFT.nvertices(address()); }

        /** Sets the specified value to the {@code vertexUpdateTime} field. */
        public XrHandMeshVertexBufferMSFT.Buffer vertexUpdateTime(@NativeType("XrTime") long value) { XrHandMeshVertexBufferMSFT.nvertexUpdateTime(address(), value); return this; }
        /** Sets the specified value to the {@code vertexCapacityInput} field. */
        public XrHandMeshVertexBufferMSFT.Buffer vertexCapacityInput(@NativeType("uint32_t") int value) { XrHandMeshVertexBufferMSFT.nvertexCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code vertexCountOutput} field. */
        public XrHandMeshVertexBufferMSFT.Buffer vertexCountOutput(@NativeType("uint32_t") int value) { XrHandMeshVertexBufferMSFT.nvertexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrHandMeshVertexMSFT.Buffer} to the {@code vertices} field. */
        public XrHandMeshVertexBufferMSFT.Buffer vertices(@NativeType("XrHandMeshVertexMSFT *") XrHandMeshVertexMSFT.@Nullable Buffer value) { XrHandMeshVertexBufferMSFT.nvertices(address(), value); return this; }

    }

}