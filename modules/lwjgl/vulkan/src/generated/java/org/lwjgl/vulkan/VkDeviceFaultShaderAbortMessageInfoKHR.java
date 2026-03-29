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
 * struct VkDeviceFaultShaderAbortMessageInfoKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint64_t messageDataSize;
 *     void * pMessageData;
 * }}</pre>
 */
public class VkDeviceFaultShaderAbortMessageInfoKHR extends Struct<VkDeviceFaultShaderAbortMessageInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MESSAGEDATASIZE,
        PMESSAGEDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MESSAGEDATASIZE = layout.offsetof(2);
        PMESSAGEDATA = layout.offsetof(3);
    }

    protected VkDeviceFaultShaderAbortMessageInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceFaultShaderAbortMessageInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceFaultShaderAbortMessageInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkDeviceFaultShaderAbortMessageInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceFaultShaderAbortMessageInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code messageDataSize} field. */
    @NativeType("uint64_t")
    public long messageDataSize() { return nmessageDataSize(address()); }
    /** @return the value of the {@code pMessageData} field. */
    @NativeType("void *")
    public long pMessageData() { return npMessageData(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceFaultShaderAbortMessageInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRShaderAbort#VK_STRUCTURE_TYPE_DEVICE_FAULT_SHADER_ABORT_MESSAGE_INFO_KHR STRUCTURE_TYPE_DEVICE_FAULT_SHADER_ABORT_MESSAGE_INFO_KHR} value to the {@code sType} field. */
    public VkDeviceFaultShaderAbortMessageInfoKHR sType$Default() { return sType(KHRShaderAbort.VK_STRUCTURE_TYPE_DEVICE_FAULT_SHADER_ABORT_MESSAGE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceFaultShaderAbortMessageInfoKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceFaultShaderAbortMessageInfoKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceFaultShaderAbortMessageInfoKHR set(VkDeviceFaultShaderAbortMessageInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceFaultShaderAbortMessageInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultShaderAbortMessageInfoKHR malloc() {
        return new VkDeviceFaultShaderAbortMessageInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceFaultShaderAbortMessageInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultShaderAbortMessageInfoKHR calloc() {
        return new VkDeviceFaultShaderAbortMessageInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceFaultShaderAbortMessageInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceFaultShaderAbortMessageInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceFaultShaderAbortMessageInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceFaultShaderAbortMessageInfoKHR} instance for the specified memory address. */
    public static VkDeviceFaultShaderAbortMessageInfoKHR create(long address) {
        return new VkDeviceFaultShaderAbortMessageInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceFaultShaderAbortMessageInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkDeviceFaultShaderAbortMessageInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkDeviceFaultShaderAbortMessageInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultShaderAbortMessageInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultShaderAbortMessageInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultShaderAbortMessageInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultShaderAbortMessageInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultShaderAbortMessageInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceFaultShaderAbortMessageInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultShaderAbortMessageInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceFaultShaderAbortMessageInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceFaultShaderAbortMessageInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultShaderAbortMessageInfoKHR malloc(MemoryStack stack) {
        return new VkDeviceFaultShaderAbortMessageInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceFaultShaderAbortMessageInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultShaderAbortMessageInfoKHR calloc(MemoryStack stack) {
        return new VkDeviceFaultShaderAbortMessageInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceFaultShaderAbortMessageInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultShaderAbortMessageInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultShaderAbortMessageInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultShaderAbortMessageInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceFaultShaderAbortMessageInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceFaultShaderAbortMessageInfoKHR.PNEXT); }
    /** Unsafe version of {@link #messageDataSize}. */
    public static long nmessageDataSize(long struct) { return memGetLong(struct + VkDeviceFaultShaderAbortMessageInfoKHR.MESSAGEDATASIZE); }
    /** Unsafe version of {@link #pMessageData}. */
    public static long npMessageData(long struct) { return memGetAddress(struct + VkDeviceFaultShaderAbortMessageInfoKHR.PMESSAGEDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceFaultShaderAbortMessageInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceFaultShaderAbortMessageInfoKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceFaultShaderAbortMessageInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkDeviceFaultShaderAbortMessageInfoKHR, Buffer> implements NativeResource {

        private static final VkDeviceFaultShaderAbortMessageInfoKHR ELEMENT_FACTORY = VkDeviceFaultShaderAbortMessageInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceFaultShaderAbortMessageInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceFaultShaderAbortMessageInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceFaultShaderAbortMessageInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceFaultShaderAbortMessageInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDeviceFaultShaderAbortMessageInfoKHR.npNext(address()); }
        /** @return the value of the {@code messageDataSize} field. */
        @NativeType("uint64_t")
        public long messageDataSize() { return VkDeviceFaultShaderAbortMessageInfoKHR.nmessageDataSize(address()); }
        /** @return the value of the {@code pMessageData} field. */
        @NativeType("void *")
        public long pMessageData() { return VkDeviceFaultShaderAbortMessageInfoKHR.npMessageData(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceFaultShaderAbortMessageInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceFaultShaderAbortMessageInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRShaderAbort#VK_STRUCTURE_TYPE_DEVICE_FAULT_SHADER_ABORT_MESSAGE_INFO_KHR STRUCTURE_TYPE_DEVICE_FAULT_SHADER_ABORT_MESSAGE_INFO_KHR} value to the {@code sType} field. */
        public VkDeviceFaultShaderAbortMessageInfoKHR.Buffer sType$Default() { return sType(KHRShaderAbort.VK_STRUCTURE_TYPE_DEVICE_FAULT_SHADER_ABORT_MESSAGE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceFaultShaderAbortMessageInfoKHR.Buffer pNext(@NativeType("void *") long value) { VkDeviceFaultShaderAbortMessageInfoKHR.npNext(address(), value); return this; }

    }

}