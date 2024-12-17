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
 * struct XrWorldMeshStateRequestCompletionML {
 *     XrStructureType type;
 *     void * next;
 *     XrResult futureResult;
 *     XrTime timestamp;
 *     uint32_t meshBlockStateCapacityInput;
 *     uint32_t meshBlockStateCountOutput;
 *     {@link XrWorldMeshBlockStateML XrWorldMeshBlockStateML} * meshBlockStates;
 * }}</pre>
 */
public class XrWorldMeshStateRequestCompletionML extends Struct<XrWorldMeshStateRequestCompletionML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT,
        TIMESTAMP,
        MESHBLOCKSTATECAPACITYINPUT,
        MESHBLOCKSTATECOUNTOUTPUT,
        MESHBLOCKSTATES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FUTURERESULT = layout.offsetof(2);
        TIMESTAMP = layout.offsetof(3);
        MESHBLOCKSTATECAPACITYINPUT = layout.offsetof(4);
        MESHBLOCKSTATECOUNTOUTPUT = layout.offsetof(5);
        MESHBLOCKSTATES = layout.offsetof(6);
    }

    protected XrWorldMeshStateRequestCompletionML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrWorldMeshStateRequestCompletionML create(long address, @Nullable ByteBuffer container) {
        return new XrWorldMeshStateRequestCompletionML(address, container);
    }

    /**
     * Creates a {@code XrWorldMeshStateRequestCompletionML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrWorldMeshStateRequestCompletionML(ByteBuffer container) {
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
    /** @return the value of the {@code futureResult} field. */
    @NativeType("XrResult")
    public int futureResult() { return nfutureResult(address()); }
    /** @return the value of the {@code timestamp} field. */
    @NativeType("XrTime")
    public long timestamp() { return ntimestamp(address()); }
    /** @return the value of the {@code meshBlockStateCapacityInput} field. */
    @NativeType("uint32_t")
    public int meshBlockStateCapacityInput() { return nmeshBlockStateCapacityInput(address()); }
    /** @return the value of the {@code meshBlockStateCountOutput} field. */
    @NativeType("uint32_t")
    public int meshBlockStateCountOutput() { return nmeshBlockStateCountOutput(address()); }
    /** @return a {@link XrWorldMeshBlockStateML.Buffer} view of the struct array pointed to by the {@code meshBlockStates} field. */
    @NativeType("XrWorldMeshBlockStateML *")
    public XrWorldMeshBlockStateML.@Nullable Buffer meshBlockStates() { return nmeshBlockStates(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrWorldMeshStateRequestCompletionML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML} value to the {@code type} field. */
    public XrWorldMeshStateRequestCompletionML type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrWorldMeshStateRequestCompletionML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code futureResult} field. */
    public XrWorldMeshStateRequestCompletionML futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public XrWorldMeshStateRequestCompletionML timestamp(@NativeType("XrTime") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code meshBlockStateCapacityInput} field. */
    public XrWorldMeshStateRequestCompletionML meshBlockStateCapacityInput(@NativeType("uint32_t") int value) { nmeshBlockStateCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code meshBlockStateCountOutput} field. */
    public XrWorldMeshStateRequestCompletionML meshBlockStateCountOutput(@NativeType("uint32_t") int value) { nmeshBlockStateCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrWorldMeshBlockStateML.Buffer} to the {@code meshBlockStates} field. */
    public XrWorldMeshStateRequestCompletionML meshBlockStates(@NativeType("XrWorldMeshBlockStateML *") XrWorldMeshBlockStateML.@Nullable Buffer value) { nmeshBlockStates(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrWorldMeshStateRequestCompletionML set(
        int type,
        long next,
        int futureResult,
        long timestamp,
        int meshBlockStateCapacityInput,
        int meshBlockStateCountOutput,
        XrWorldMeshBlockStateML.@Nullable Buffer meshBlockStates
    ) {
        type(type);
        next(next);
        futureResult(futureResult);
        timestamp(timestamp);
        meshBlockStateCapacityInput(meshBlockStateCapacityInput);
        meshBlockStateCountOutput(meshBlockStateCountOutput);
        meshBlockStates(meshBlockStates);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrWorldMeshStateRequestCompletionML set(XrWorldMeshStateRequestCompletionML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrWorldMeshStateRequestCompletionML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrWorldMeshStateRequestCompletionML malloc() {
        return new XrWorldMeshStateRequestCompletionML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshStateRequestCompletionML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrWorldMeshStateRequestCompletionML calloc() {
        return new XrWorldMeshStateRequestCompletionML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrWorldMeshStateRequestCompletionML} instance allocated with {@link BufferUtils}. */
    public static XrWorldMeshStateRequestCompletionML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrWorldMeshStateRequestCompletionML(memAddress(container), container);
    }

    /** Returns a new {@code XrWorldMeshStateRequestCompletionML} instance for the specified memory address. */
    public static XrWorldMeshStateRequestCompletionML create(long address) {
        return new XrWorldMeshStateRequestCompletionML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrWorldMeshStateRequestCompletionML createSafe(long address) {
        return address == NULL ? null : new XrWorldMeshStateRequestCompletionML(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrWorldMeshStateRequestCompletionML}. */
    public static XrWorldMeshStateRequestCompletionML create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrWorldMeshStateRequestCompletionML(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrWorldMeshStateRequestCompletionML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshStateRequestCompletionML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshStateRequestCompletionML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshStateRequestCompletionML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshStateRequestCompletionML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshStateRequestCompletionML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrWorldMeshStateRequestCompletionML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshStateRequestCompletionML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrWorldMeshStateRequestCompletionML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrWorldMeshStateRequestCompletionML.Buffer}. */
    public static XrWorldMeshStateRequestCompletionML.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrWorldMeshStateRequestCompletionML.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrWorldMeshStateRequestCompletionML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshStateRequestCompletionML malloc(MemoryStack stack) {
        return new XrWorldMeshStateRequestCompletionML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrWorldMeshStateRequestCompletionML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrWorldMeshStateRequestCompletionML calloc(MemoryStack stack) {
        return new XrWorldMeshStateRequestCompletionML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrWorldMeshStateRequestCompletionML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshStateRequestCompletionML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrWorldMeshStateRequestCompletionML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrWorldMeshStateRequestCompletionML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrWorldMeshStateRequestCompletionML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrWorldMeshStateRequestCompletionML.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return memGetInt(struct + XrWorldMeshStateRequestCompletionML.FUTURERESULT); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + XrWorldMeshStateRequestCompletionML.TIMESTAMP); }
    /** Unsafe version of {@link #meshBlockStateCapacityInput}. */
    public static int nmeshBlockStateCapacityInput(long struct) { return memGetInt(struct + XrWorldMeshStateRequestCompletionML.MESHBLOCKSTATECAPACITYINPUT); }
    /** Unsafe version of {@link #meshBlockStateCountOutput}. */
    public static int nmeshBlockStateCountOutput(long struct) { return memGetInt(struct + XrWorldMeshStateRequestCompletionML.MESHBLOCKSTATECOUNTOUTPUT); }
    /** Unsafe version of {@link #meshBlockStates}. */
    public static XrWorldMeshBlockStateML.@Nullable Buffer nmeshBlockStates(long struct) { return XrWorldMeshBlockStateML.createSafe(memGetAddress(struct + XrWorldMeshStateRequestCompletionML.MESHBLOCKSTATES), nmeshBlockStateCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrWorldMeshStateRequestCompletionML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrWorldMeshStateRequestCompletionML.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { memPutInt(struct + XrWorldMeshStateRequestCompletionML.FUTURERESULT, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + XrWorldMeshStateRequestCompletionML.TIMESTAMP, value); }
    /** Sets the specified value to the {@code meshBlockStateCapacityInput} field of the specified {@code struct}. */
    public static void nmeshBlockStateCapacityInput(long struct, int value) { memPutInt(struct + XrWorldMeshStateRequestCompletionML.MESHBLOCKSTATECAPACITYINPUT, value); }
    /** Unsafe version of {@link #meshBlockStateCountOutput(int) meshBlockStateCountOutput}. */
    public static void nmeshBlockStateCountOutput(long struct, int value) { memPutInt(struct + XrWorldMeshStateRequestCompletionML.MESHBLOCKSTATECOUNTOUTPUT, value); }
    /** Unsafe version of {@link #meshBlockStates(XrWorldMeshBlockStateML.Buffer) meshBlockStates}. */
    public static void nmeshBlockStates(long struct, XrWorldMeshBlockStateML.@Nullable Buffer value) { memPutAddress(struct + XrWorldMeshStateRequestCompletionML.MESHBLOCKSTATES, memAddressSafe(value)); if (value != null) { nmeshBlockStateCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrWorldMeshStateRequestCompletionML} structs. */
    public static class Buffer extends StructBuffer<XrWorldMeshStateRequestCompletionML, Buffer> implements NativeResource {

        private static final XrWorldMeshStateRequestCompletionML ELEMENT_FACTORY = XrWorldMeshStateRequestCompletionML.create(-1L);

        /**
         * Creates a new {@code XrWorldMeshStateRequestCompletionML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrWorldMeshStateRequestCompletionML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrWorldMeshStateRequestCompletionML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrWorldMeshStateRequestCompletionML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrWorldMeshStateRequestCompletionML.nnext(address()); }
        /** @return the value of the {@code futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrWorldMeshStateRequestCompletionML.nfutureResult(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("XrTime")
        public long timestamp() { return XrWorldMeshStateRequestCompletionML.ntimestamp(address()); }
        /** @return the value of the {@code meshBlockStateCapacityInput} field. */
        @NativeType("uint32_t")
        public int meshBlockStateCapacityInput() { return XrWorldMeshStateRequestCompletionML.nmeshBlockStateCapacityInput(address()); }
        /** @return the value of the {@code meshBlockStateCountOutput} field. */
        @NativeType("uint32_t")
        public int meshBlockStateCountOutput() { return XrWorldMeshStateRequestCompletionML.nmeshBlockStateCountOutput(address()); }
        /** @return a {@link XrWorldMeshBlockStateML.Buffer} view of the struct array pointed to by the {@code meshBlockStates} field. */
        @NativeType("XrWorldMeshBlockStateML *")
        public XrWorldMeshBlockStateML.@Nullable Buffer meshBlockStates() { return XrWorldMeshStateRequestCompletionML.nmeshBlockStates(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrWorldMeshStateRequestCompletionML.Buffer type(@NativeType("XrStructureType") int value) { XrWorldMeshStateRequestCompletionML.ntype(address(), value); return this; }
        /** Sets the {@link MLWorldMeshDetection#XR_TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML} value to the {@code type} field. */
        public XrWorldMeshStateRequestCompletionML.Buffer type$Default() { return type(MLWorldMeshDetection.XR_TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrWorldMeshStateRequestCompletionML.Buffer next(@NativeType("void *") long value) { XrWorldMeshStateRequestCompletionML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code futureResult} field. */
        public XrWorldMeshStateRequestCompletionML.Buffer futureResult(@NativeType("XrResult") int value) { XrWorldMeshStateRequestCompletionML.nfutureResult(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public XrWorldMeshStateRequestCompletionML.Buffer timestamp(@NativeType("XrTime") long value) { XrWorldMeshStateRequestCompletionML.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code meshBlockStateCapacityInput} field. */
        public XrWorldMeshStateRequestCompletionML.Buffer meshBlockStateCapacityInput(@NativeType("uint32_t") int value) { XrWorldMeshStateRequestCompletionML.nmeshBlockStateCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code meshBlockStateCountOutput} field. */
        public XrWorldMeshStateRequestCompletionML.Buffer meshBlockStateCountOutput(@NativeType("uint32_t") int value) { XrWorldMeshStateRequestCompletionML.nmeshBlockStateCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrWorldMeshBlockStateML.Buffer} to the {@code meshBlockStates} field. */
        public XrWorldMeshStateRequestCompletionML.Buffer meshBlockStates(@NativeType("XrWorldMeshBlockStateML *") XrWorldMeshBlockStateML.@Nullable Buffer value) { XrWorldMeshStateRequestCompletionML.nmeshBlockStates(address(), value); return this; }

    }

}