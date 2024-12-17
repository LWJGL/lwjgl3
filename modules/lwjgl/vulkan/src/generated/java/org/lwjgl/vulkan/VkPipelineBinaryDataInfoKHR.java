/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPipelineBinaryDataInfoKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkPipelineBinaryKHR pipelineBinary;
 * }}</pre>
 */
public class VkPipelineBinaryDataInfoKHR extends Struct<VkPipelineBinaryDataInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINEBINARY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEBINARY = layout.offsetof(2);
    }

    protected VkPipelineBinaryDataInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineBinaryDataInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineBinaryDataInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkPipelineBinaryDataInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineBinaryDataInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code pipelineBinary} field. */
    @NativeType("VkPipelineBinaryKHR")
    public long pipelineBinary() { return npipelineBinary(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineBinaryDataInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPipelineBinary#VK_STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR} value to the {@code sType} field. */
    public VkPipelineBinaryDataInfoKHR sType$Default() { return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineBinaryDataInfoKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineBinary} field. */
    public VkPipelineBinaryDataInfoKHR pipelineBinary(@NativeType("VkPipelineBinaryKHR") long value) { npipelineBinary(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineBinaryDataInfoKHR set(
        int sType,
        long pNext,
        long pipelineBinary
    ) {
        sType(sType);
        pNext(pNext);
        pipelineBinary(pipelineBinary);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineBinaryDataInfoKHR set(VkPipelineBinaryDataInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineBinaryDataInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineBinaryDataInfoKHR malloc() {
        return new VkPipelineBinaryDataInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineBinaryDataInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineBinaryDataInfoKHR calloc() {
        return new VkPipelineBinaryDataInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineBinaryDataInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineBinaryDataInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineBinaryDataInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineBinaryDataInfoKHR} instance for the specified memory address. */
    public static VkPipelineBinaryDataInfoKHR create(long address) {
        return new VkPipelineBinaryDataInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineBinaryDataInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkPipelineBinaryDataInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkPipelineBinaryDataInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryDataInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineBinaryDataInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryDataInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineBinaryDataInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryDataInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineBinaryDataInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryDataInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineBinaryDataInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineBinaryDataInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineBinaryDataInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineBinaryDataInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineBinaryDataInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineBinaryDataInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineBinaryDataInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineBinaryDataInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryDataInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineBinaryDataInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineBinaryDataInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineBinaryDataInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineBinaryDataInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pipelineBinary}. */
    public static long npipelineBinary(long struct) { return memGetLong(struct + VkPipelineBinaryDataInfoKHR.PIPELINEBINARY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineBinaryDataInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineBinaryDataInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pipelineBinary(long) pipelineBinary}. */
    public static void npipelineBinary(long struct, long value) { memPutLong(struct + VkPipelineBinaryDataInfoKHR.PIPELINEBINARY, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineBinaryDataInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPipelineBinaryDataInfoKHR, Buffer> implements NativeResource {

        private static final VkPipelineBinaryDataInfoKHR ELEMENT_FACTORY = VkPipelineBinaryDataInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineBinaryDataInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineBinaryDataInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineBinaryDataInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineBinaryDataInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPipelineBinaryDataInfoKHR.npNext(address()); }
        /** @return the value of the {@code pipelineBinary} field. */
        @NativeType("VkPipelineBinaryKHR")
        public long pipelineBinary() { return VkPipelineBinaryDataInfoKHR.npipelineBinary(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineBinaryDataInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineBinaryDataInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPipelineBinary#VK_STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR} value to the {@code sType} field. */
        public VkPipelineBinaryDataInfoKHR.Buffer sType$Default() { return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineBinaryDataInfoKHR.Buffer pNext(@NativeType("void *") long value) { VkPipelineBinaryDataInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineBinary} field. */
        public VkPipelineBinaryDataInfoKHR.Buffer pipelineBinary(@NativeType("VkPipelineBinaryKHR") long value) { VkPipelineBinaryDataInfoKHR.npipelineBinary(address(), value); return this; }

    }

}