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
 * struct XrRenderModelAssetDataEXT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t bufferCapacityInput;
 *     uint32_t bufferCountOutput;
 *     uint8_t * buffer;
 * }}</pre>
 */
public class XrRenderModelAssetDataEXT extends Struct<XrRenderModelAssetDataEXT> implements NativeResource {

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

    protected XrRenderModelAssetDataEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRenderModelAssetDataEXT create(long address, @Nullable ByteBuffer container) {
        return new XrRenderModelAssetDataEXT(address, container);
    }

    /**
     * Creates a {@code XrRenderModelAssetDataEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRenderModelAssetDataEXT(ByteBuffer container) {
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
    public XrRenderModelAssetDataEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTRenderModel#XR_TYPE_RENDER_MODEL_ASSET_DATA_EXT TYPE_RENDER_MODEL_ASSET_DATA_EXT} value to the {@code type} field. */
    public XrRenderModelAssetDataEXT type$Default() { return type(EXTRenderModel.XR_TYPE_RENDER_MODEL_ASSET_DATA_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrRenderModelAssetDataEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code bufferCapacityInput} field. */
    public XrRenderModelAssetDataEXT bufferCapacityInput(@NativeType("uint32_t") int value) { nbufferCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code bufferCountOutput} field. */
    public XrRenderModelAssetDataEXT bufferCountOutput(@NativeType("uint32_t") int value) { nbufferCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code buffer} field. */
    public XrRenderModelAssetDataEXT buffer(@Nullable @NativeType("uint8_t *") ByteBuffer value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRenderModelAssetDataEXT set(
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
    public XrRenderModelAssetDataEXT set(XrRenderModelAssetDataEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRenderModelAssetDataEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRenderModelAssetDataEXT malloc() {
        return new XrRenderModelAssetDataEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelAssetDataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRenderModelAssetDataEXT calloc() {
        return new XrRenderModelAssetDataEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelAssetDataEXT} instance allocated with {@link BufferUtils}. */
    public static XrRenderModelAssetDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRenderModelAssetDataEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrRenderModelAssetDataEXT} instance for the specified memory address. */
    public static XrRenderModelAssetDataEXT create(long address) {
        return new XrRenderModelAssetDataEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRenderModelAssetDataEXT createSafe(long address) {
        return address == NULL ? null : new XrRenderModelAssetDataEXT(address, null);
    }

    /**
     * Returns a new {@link XrRenderModelAssetDataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetDataEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelAssetDataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetDataEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelAssetDataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetDataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRenderModelAssetDataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetDataEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRenderModelAssetDataEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRenderModelAssetDataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelAssetDataEXT malloc(MemoryStack stack) {
        return new XrRenderModelAssetDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRenderModelAssetDataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelAssetDataEXT calloc(MemoryStack stack) {
        return new XrRenderModelAssetDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRenderModelAssetDataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetDataEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelAssetDataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelAssetDataEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrRenderModelAssetDataEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRenderModelAssetDataEXT.NEXT); }
    /** Unsafe version of {@link #bufferCapacityInput}. */
    public static int nbufferCapacityInput(long struct) { return memGetInt(struct + XrRenderModelAssetDataEXT.BUFFERCAPACITYINPUT); }
    /** Unsafe version of {@link #bufferCountOutput}. */
    public static int nbufferCountOutput(long struct) { return memGetInt(struct + XrRenderModelAssetDataEXT.BUFFERCOUNTOUTPUT); }
    /** Unsafe version of {@link #buffer() buffer}. */
    public static @Nullable ByteBuffer nbuffer(long struct) { return memByteBufferSafe(memGetAddress(struct + XrRenderModelAssetDataEXT.BUFFER), nbufferCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrRenderModelAssetDataEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRenderModelAssetDataEXT.NEXT, value); }
    /** Sets the specified value to the {@code bufferCapacityInput} field of the specified {@code struct}. */
    public static void nbufferCapacityInput(long struct, int value) { memPutInt(struct + XrRenderModelAssetDataEXT.BUFFERCAPACITYINPUT, value); }
    /** Unsafe version of {@link #bufferCountOutput(int) bufferCountOutput}. */
    public static void nbufferCountOutput(long struct, int value) { memPutInt(struct + XrRenderModelAssetDataEXT.BUFFERCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #buffer(ByteBuffer) buffer}. */
    public static void nbuffer(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + XrRenderModelAssetDataEXT.BUFFER, memAddressSafe(value)); if (value != null) { nbufferCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrRenderModelAssetDataEXT} structs. */
    public static class Buffer extends StructBuffer<XrRenderModelAssetDataEXT, Buffer> implements NativeResource {

        private static final XrRenderModelAssetDataEXT ELEMENT_FACTORY = XrRenderModelAssetDataEXT.create(-1L);

        /**
         * Creates a new {@code XrRenderModelAssetDataEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRenderModelAssetDataEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRenderModelAssetDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRenderModelAssetDataEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrRenderModelAssetDataEXT.nnext(address()); }
        /** @return the value of the {@code bufferCapacityInput} field. */
        @NativeType("uint32_t")
        public int bufferCapacityInput() { return XrRenderModelAssetDataEXT.nbufferCapacityInput(address()); }
        /** @return the value of the {@code bufferCountOutput} field. */
        @NativeType("uint32_t")
        public int bufferCountOutput() { return XrRenderModelAssetDataEXT.nbufferCountOutput(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code buffer} field. */
        @NativeType("uint8_t *")
        public @Nullable ByteBuffer buffer() { return XrRenderModelAssetDataEXT.nbuffer(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrRenderModelAssetDataEXT.Buffer type(@NativeType("XrStructureType") int value) { XrRenderModelAssetDataEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTRenderModel#XR_TYPE_RENDER_MODEL_ASSET_DATA_EXT TYPE_RENDER_MODEL_ASSET_DATA_EXT} value to the {@code type} field. */
        public XrRenderModelAssetDataEXT.Buffer type$Default() { return type(EXTRenderModel.XR_TYPE_RENDER_MODEL_ASSET_DATA_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrRenderModelAssetDataEXT.Buffer next(@NativeType("void *") long value) { XrRenderModelAssetDataEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code bufferCapacityInput} field. */
        public XrRenderModelAssetDataEXT.Buffer bufferCapacityInput(@NativeType("uint32_t") int value) { XrRenderModelAssetDataEXT.nbufferCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code bufferCountOutput} field. */
        public XrRenderModelAssetDataEXT.Buffer bufferCountOutput(@NativeType("uint32_t") int value) { XrRenderModelAssetDataEXT.nbufferCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code buffer} field. */
        public XrRenderModelAssetDataEXT.Buffer buffer(@Nullable @NativeType("uint8_t *") ByteBuffer value) { XrRenderModelAssetDataEXT.nbuffer(address(), value); return this; }

    }

}