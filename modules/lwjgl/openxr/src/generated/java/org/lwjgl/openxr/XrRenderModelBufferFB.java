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
 * struct XrRenderModelBufferFB {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t bufferCapacityInput;
 *     uint32_t bufferCountOutput;
 *     uint8_t * buffer;
 * }}</pre>
 */
public class XrRenderModelBufferFB extends Struct<XrRenderModelBufferFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BUFFERCAPACITYINPUT,
        BUFFERCOUNTOUTPUT,
        BUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BUFFERCAPACITYINPUT = layout.offsetof(2);
        BUFFERCOUNTOUTPUT = layout.offsetof(3);
        BUFFER = layout.offsetof(4);
    }

    protected XrRenderModelBufferFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRenderModelBufferFB create(long address, @Nullable ByteBuffer container) {
        return new XrRenderModelBufferFB(address, container);
    }

    /**
     * Creates a {@code XrRenderModelBufferFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRenderModelBufferFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code bufferCapacityInput} field. */
    @NativeType("uint32_t")
    public int bufferCapacityInput() { return nbufferCapacityInput(address()); }
    /** @return the value of the {@code bufferCountOutput} field. */
    @NativeType("uint32_t")
    public int bufferCountOutput() { return nbufferCountOutput(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code buffer} field. */
    @NativeType("uint8_t *")
    public @Nullable ByteBuffer buffer() { return nbuffer(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrRenderModelBufferFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBRenderModel#XR_TYPE_RENDER_MODEL_BUFFER_FB TYPE_RENDER_MODEL_BUFFER_FB} value to the {@code type} field. */
    public XrRenderModelBufferFB type$Default() { return type(FBRenderModel.XR_TYPE_RENDER_MODEL_BUFFER_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrRenderModelBufferFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code bufferCapacityInput} field. */
    public XrRenderModelBufferFB bufferCapacityInput(@NativeType("uint32_t") int value) { nbufferCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code bufferCountOutput} field. */
    public XrRenderModelBufferFB bufferCountOutput(@NativeType("uint32_t") int value) { nbufferCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code buffer} field. */
    public XrRenderModelBufferFB buffer(@Nullable @NativeType("uint8_t *") ByteBuffer value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRenderModelBufferFB set(
        int type,
        long next,
        int bufferCapacityInput,
        int bufferCountOutput,
        @Nullable ByteBuffer buffer
    ) {
        type(type);
        next(next);
        bufferCapacityInput(bufferCapacityInput);
        bufferCountOutput(bufferCountOutput);
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
    public XrRenderModelBufferFB set(XrRenderModelBufferFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRenderModelBufferFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRenderModelBufferFB malloc() {
        return new XrRenderModelBufferFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelBufferFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRenderModelBufferFB calloc() {
        return new XrRenderModelBufferFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelBufferFB} instance allocated with {@link BufferUtils}. */
    public static XrRenderModelBufferFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRenderModelBufferFB(memAddress(container), container);
    }

    /** Returns a new {@code XrRenderModelBufferFB} instance for the specified memory address. */
    public static XrRenderModelBufferFB create(long address) {
        return new XrRenderModelBufferFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRenderModelBufferFB createSafe(long address) {
        return address == NULL ? null : new XrRenderModelBufferFB(address, null);
    }

    /**
     * Returns a new {@link XrRenderModelBufferFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelBufferFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelBufferFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelBufferFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelBufferFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelBufferFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRenderModelBufferFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRenderModelBufferFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRenderModelBufferFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRenderModelBufferFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelBufferFB malloc(MemoryStack stack) {
        return new XrRenderModelBufferFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRenderModelBufferFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelBufferFB calloc(MemoryStack stack) {
        return new XrRenderModelBufferFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRenderModelBufferFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelBufferFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelBufferFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelBufferFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrRenderModelBufferFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRenderModelBufferFB.NEXT); }
    /** Unsafe version of {@link #bufferCapacityInput}. */
    public static int nbufferCapacityInput(long struct) { return memGetInt(struct + XrRenderModelBufferFB.BUFFERCAPACITYINPUT); }
    /** Unsafe version of {@link #bufferCountOutput}. */
    public static int nbufferCountOutput(long struct) { return memGetInt(struct + XrRenderModelBufferFB.BUFFERCOUNTOUTPUT); }
    /** Unsafe version of {@link #buffer() buffer}. */
    public static @Nullable ByteBuffer nbuffer(long struct) { return memByteBufferSafe(memGetAddress(struct + XrRenderModelBufferFB.BUFFER), nbufferCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrRenderModelBufferFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRenderModelBufferFB.NEXT, value); }
    /** Sets the specified value to the {@code bufferCapacityInput} field of the specified {@code struct}. */
    public static void nbufferCapacityInput(long struct, int value) { memPutInt(struct + XrRenderModelBufferFB.BUFFERCAPACITYINPUT, value); }
    /** Unsafe version of {@link #bufferCountOutput(int) bufferCountOutput}. */
    public static void nbufferCountOutput(long struct, int value) { memPutInt(struct + XrRenderModelBufferFB.BUFFERCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #buffer(ByteBuffer) buffer}. */
    public static void nbuffer(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + XrRenderModelBufferFB.BUFFER, memAddressSafe(value)); if (value != null) { nbufferCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrRenderModelBufferFB} structs. */
    public static class Buffer extends StructBuffer<XrRenderModelBufferFB, Buffer> implements NativeResource {

        private static final XrRenderModelBufferFB ELEMENT_FACTORY = XrRenderModelBufferFB.create(-1L);

        /**
         * Creates a new {@code XrRenderModelBufferFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRenderModelBufferFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRenderModelBufferFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRenderModelBufferFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrRenderModelBufferFB.nnext(address()); }
        /** @return the value of the {@code bufferCapacityInput} field. */
        @NativeType("uint32_t")
        public int bufferCapacityInput() { return XrRenderModelBufferFB.nbufferCapacityInput(address()); }
        /** @return the value of the {@code bufferCountOutput} field. */
        @NativeType("uint32_t")
        public int bufferCountOutput() { return XrRenderModelBufferFB.nbufferCountOutput(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code buffer} field. */
        @NativeType("uint8_t *")
        public @Nullable ByteBuffer buffer() { return XrRenderModelBufferFB.nbuffer(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrRenderModelBufferFB.Buffer type(@NativeType("XrStructureType") int value) { XrRenderModelBufferFB.ntype(address(), value); return this; }
        /** Sets the {@link FBRenderModel#XR_TYPE_RENDER_MODEL_BUFFER_FB TYPE_RENDER_MODEL_BUFFER_FB} value to the {@code type} field. */
        public XrRenderModelBufferFB.Buffer type$Default() { return type(FBRenderModel.XR_TYPE_RENDER_MODEL_BUFFER_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrRenderModelBufferFB.Buffer next(@NativeType("void *") long value) { XrRenderModelBufferFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code bufferCapacityInput} field. */
        public XrRenderModelBufferFB.Buffer bufferCapacityInput(@NativeType("uint32_t") int value) { XrRenderModelBufferFB.nbufferCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code bufferCountOutput} field. */
        public XrRenderModelBufferFB.Buffer bufferCountOutput(@NativeType("uint32_t") int value) { XrRenderModelBufferFB.nbufferCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code buffer} field. */
        public XrRenderModelBufferFB.Buffer buffer(@Nullable @NativeType("uint8_t *") ByteBuffer value) { XrRenderModelBufferFB.nbuffer(address(), value); return this; }

    }

}