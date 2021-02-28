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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandMeshVertexBufferMSFT {
 *     XrTime vertexUpdateTime;
 *     uint32_t vertexCapacityInput;
 *     uint32_t vertexCountOutput;
 *     {@link XrHandMeshVertexMSFT XrHandMeshVertexMSFT} * vertices;
 * }</code></pre>
 */
public class XrHandMeshVertexBufferMSFT extends Struct implements NativeResource {

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

    /** Returns the value of the {@code vertexUpdateTime} field. */
    @NativeType("XrTime")
    public long vertexUpdateTime() { return nvertexUpdateTime(address()); }
    /** Returns the value of the {@code vertexCapacityInput} field. */
    @NativeType("uint32_t")
    public int vertexCapacityInput() { return nvertexCapacityInput(address()); }
    /** Returns the value of the {@code vertexCountOutput} field. */
    @NativeType("uint32_t")
    public int vertexCountOutput() { return nvertexCountOutput(address()); }
    /** Returns a {@link XrHandMeshVertexMSFT.Buffer} view of the struct array pointed to by the {@code vertices} field. */
    @NativeType("XrHandMeshVertexMSFT *")
    public XrHandMeshVertexMSFT.Buffer vertices() { return nvertices(address()); }

    /** Sets the specified value to the {@code vertexUpdateTime} field. */
    public XrHandMeshVertexBufferMSFT vertexUpdateTime(@NativeType("XrTime") long value) { nvertexUpdateTime(address(), value); return this; }
    /** Sets the specified value to the {@code vertexCountOutput} field. */
    public XrHandMeshVertexBufferMSFT vertexCountOutput(@NativeType("uint32_t") int value) { nvertexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrHandMeshVertexMSFT.Buffer} to the {@code vertices} field. */
    public XrHandMeshVertexBufferMSFT vertices(@NativeType("XrHandMeshVertexMSFT *") XrHandMeshVertexMSFT.Buffer value) { nvertices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandMeshVertexBufferMSFT set(
        long vertexUpdateTime,
        int vertexCountOutput,
        XrHandMeshVertexMSFT.Buffer vertices
    ) {
        vertexUpdateTime(vertexUpdateTime);
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
        return wrap(XrHandMeshVertexBufferMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHandMeshVertexBufferMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandMeshVertexBufferMSFT calloc() {
        return wrap(XrHandMeshVertexBufferMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHandMeshVertexBufferMSFT} instance allocated with {@link BufferUtils}. */
    public static XrHandMeshVertexBufferMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHandMeshVertexBufferMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHandMeshVertexBufferMSFT} instance for the specified memory address. */
    public static XrHandMeshVertexBufferMSFT create(long address) {
        return wrap(XrHandMeshVertexBufferMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandMeshVertexBufferMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrHandMeshVertexBufferMSFT.class, address);
    }

    /**
     * Returns a new {@link XrHandMeshVertexBufferMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexBufferMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshVertexBufferMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexBufferMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshVertexBufferMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexBufferMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHandMeshVertexBufferMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexBufferMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandMeshVertexBufferMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrHandMeshVertexBufferMSFT} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrHandMeshVertexBufferMSFT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrHandMeshVertexBufferMSFT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrHandMeshVertexBufferMSFT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrHandMeshVertexBufferMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshVertexBufferMSFT mallocStack(MemoryStack stack) {
        return wrap(XrHandMeshVertexBufferMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHandMeshVertexBufferMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandMeshVertexBufferMSFT callocStack(MemoryStack stack) {
        return wrap(XrHandMeshVertexBufferMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHandMeshVertexBufferMSFT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexBufferMSFT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrHandMeshVertexBufferMSFT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexBufferMSFT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrHandMeshVertexBufferMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexBufferMSFT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandMeshVertexBufferMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandMeshVertexBufferMSFT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vertexUpdateTime}. */
    public static long nvertexUpdateTime(long struct) { return UNSAFE.getLong(null, struct + XrHandMeshVertexBufferMSFT.VERTEXUPDATETIME); }
    /** Unsafe version of {@link #vertexCapacityInput}. */
    public static int nvertexCapacityInput(long struct) { return UNSAFE.getInt(null, struct + XrHandMeshVertexBufferMSFT.VERTEXCAPACITYINPUT); }
    /** Unsafe version of {@link #vertexCountOutput}. */
    public static int nvertexCountOutput(long struct) { return UNSAFE.getInt(null, struct + XrHandMeshVertexBufferMSFT.VERTEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #vertices}. */
    public static XrHandMeshVertexMSFT.Buffer nvertices(long struct) { return XrHandMeshVertexMSFT.create(memGetAddress(struct + XrHandMeshVertexBufferMSFT.VERTICES), nvertexCapacityInput(struct)); }

    /** Unsafe version of {@link #vertexUpdateTime(long) vertexUpdateTime}. */
    public static void nvertexUpdateTime(long struct, long value) { UNSAFE.putLong(null, struct + XrHandMeshVertexBufferMSFT.VERTEXUPDATETIME, value); }
    /** Sets the specified value to the {@code vertexCapacityInput} field of the specified {@code struct}. */
    public static void nvertexCapacityInput(long struct, int value) { UNSAFE.putInt(null, struct + XrHandMeshVertexBufferMSFT.VERTEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #vertexCountOutput(int) vertexCountOutput}. */
    public static void nvertexCountOutput(long struct, int value) { UNSAFE.putInt(null, struct + XrHandMeshVertexBufferMSFT.VERTEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #vertices(XrHandMeshVertexMSFT.Buffer) vertices}. */
    public static void nvertices(long struct, XrHandMeshVertexMSFT.Buffer value) { memPutAddress(struct + XrHandMeshVertexBufferMSFT.VERTICES, value.address()); nvertexCapacityInput(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrHandMeshVertexBufferMSFT.VERTICES));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link XrHandMeshVertexBufferMSFT} structs. */
    public static class Buffer extends StructBuffer<XrHandMeshVertexBufferMSFT, Buffer> implements NativeResource {

        private static final XrHandMeshVertexBufferMSFT ELEMENT_FACTORY = XrHandMeshVertexBufferMSFT.create(-1L);

        /**
         * Creates a new {@code XrHandMeshVertexBufferMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandMeshVertexBufferMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrHandMeshVertexBufferMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code vertexUpdateTime} field. */
        @NativeType("XrTime")
        public long vertexUpdateTime() { return XrHandMeshVertexBufferMSFT.nvertexUpdateTime(address()); }
        /** Returns the value of the {@code vertexCapacityInput} field. */
        @NativeType("uint32_t")
        public int vertexCapacityInput() { return XrHandMeshVertexBufferMSFT.nvertexCapacityInput(address()); }
        /** Returns the value of the {@code vertexCountOutput} field. */
        @NativeType("uint32_t")
        public int vertexCountOutput() { return XrHandMeshVertexBufferMSFT.nvertexCountOutput(address()); }
        /** Returns a {@link XrHandMeshVertexMSFT.Buffer} view of the struct array pointed to by the {@code vertices} field. */
        @NativeType("XrHandMeshVertexMSFT *")
        public XrHandMeshVertexMSFT.Buffer vertices() { return XrHandMeshVertexBufferMSFT.nvertices(address()); }

        /** Sets the specified value to the {@code vertexUpdateTime} field. */
        public XrHandMeshVertexBufferMSFT.Buffer vertexUpdateTime(@NativeType("XrTime") long value) { XrHandMeshVertexBufferMSFT.nvertexUpdateTime(address(), value); return this; }
        /** Sets the specified value to the {@code vertexCountOutput} field. */
        public XrHandMeshVertexBufferMSFT.Buffer vertexCountOutput(@NativeType("uint32_t") int value) { XrHandMeshVertexBufferMSFT.nvertexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrHandMeshVertexMSFT.Buffer} to the {@code vertices} field. */
        public XrHandMeshVertexBufferMSFT.Buffer vertices(@NativeType("XrHandMeshVertexMSFT *") XrHandMeshVertexMSFT.Buffer value) { XrHandMeshVertexBufferMSFT.nvertices(address(), value); return this; }

    }

}