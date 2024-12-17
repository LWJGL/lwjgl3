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
 * struct VkSemaphoreSubmitInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSemaphore semaphore;
 *     uint64_t value;
 *     VkPipelineStageFlags2 stageMask;
 *     uint32_t deviceIndex;
 * }}</pre>
 */
public class VkSemaphoreSubmitInfo extends Struct<VkSemaphoreSubmitInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SEMAPHORE,
        VALUE,
        STAGEMASK,
        DEVICEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SEMAPHORE = layout.offsetof(2);
        VALUE = layout.offsetof(3);
        STAGEMASK = layout.offsetof(4);
        DEVICEINDEX = layout.offsetof(5);
    }

    protected VkSemaphoreSubmitInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSemaphoreSubmitInfo create(long address, @Nullable ByteBuffer container) {
        return new VkSemaphoreSubmitInfo(address, container);
    }

    /**
     * Creates a {@code VkSemaphoreSubmitInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSemaphoreSubmitInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code semaphore} field. */
    @NativeType("VkSemaphore")
    public long semaphore() { return nsemaphore(address()); }
    /** @return the value of the {@code value} field. */
    @NativeType("uint64_t")
    public long value() { return nvalue(address()); }
    /** @return the value of the {@code stageMask} field. */
    @NativeType("VkPipelineStageFlags2")
    public long stageMask() { return nstageMask(address()); }
    /** @return the value of the {@code deviceIndex} field. */
    @NativeType("uint32_t")
    public int deviceIndex() { return ndeviceIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSemaphoreSubmitInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO} value to the {@code sType} field. */
    public VkSemaphoreSubmitInfo sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSemaphoreSubmitInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code semaphore} field. */
    public VkSemaphoreSubmitInfo semaphore(@NativeType("VkSemaphore") long value) { nsemaphore(address(), value); return this; }
    /** Sets the specified value to the {@code value} field. */
    public VkSemaphoreSubmitInfo value(@NativeType("uint64_t") long value) { nvalue(address(), value); return this; }
    /** Sets the specified value to the {@code stageMask} field. */
    public VkSemaphoreSubmitInfo stageMask(@NativeType("VkPipelineStageFlags2") long value) { nstageMask(address(), value); return this; }
    /** Sets the specified value to the {@code deviceIndex} field. */
    public VkSemaphoreSubmitInfo deviceIndex(@NativeType("uint32_t") int value) { ndeviceIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSemaphoreSubmitInfo set(
        int sType,
        long pNext,
        long semaphore,
        long value,
        long stageMask,
        int deviceIndex
    ) {
        sType(sType);
        pNext(pNext);
        semaphore(semaphore);
        value(value);
        stageMask(stageMask);
        deviceIndex(deviceIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSemaphoreSubmitInfo set(VkSemaphoreSubmitInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreSubmitInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSemaphoreSubmitInfo malloc() {
        return new VkSemaphoreSubmitInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSemaphoreSubmitInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSemaphoreSubmitInfo calloc() {
        return new VkSemaphoreSubmitInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSemaphoreSubmitInfo} instance allocated with {@link BufferUtils}. */
    public static VkSemaphoreSubmitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSemaphoreSubmitInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkSemaphoreSubmitInfo} instance for the specified memory address. */
    public static VkSemaphoreSubmitInfo create(long address) {
        return new VkSemaphoreSubmitInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSemaphoreSubmitInfo createSafe(long address) {
        return address == NULL ? null : new VkSemaphoreSubmitInfo(address, null);
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSemaphoreSubmitInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSemaphoreSubmitInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSemaphoreSubmitInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreSubmitInfo malloc(MemoryStack stack) {
        return new VkSemaphoreSubmitInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSemaphoreSubmitInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreSubmitInfo calloc(MemoryStack stack) {
        return new VkSemaphoreSubmitInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSemaphoreSubmitInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSemaphoreSubmitInfo.PNEXT); }
    /** Unsafe version of {@link #semaphore}. */
    public static long nsemaphore(long struct) { return memGetLong(struct + VkSemaphoreSubmitInfo.SEMAPHORE); }
    /** Unsafe version of {@link #value}. */
    public static long nvalue(long struct) { return memGetLong(struct + VkSemaphoreSubmitInfo.VALUE); }
    /** Unsafe version of {@link #stageMask}. */
    public static long nstageMask(long struct) { return memGetLong(struct + VkSemaphoreSubmitInfo.STAGEMASK); }
    /** Unsafe version of {@link #deviceIndex}. */
    public static int ndeviceIndex(long struct) { return memGetInt(struct + VkSemaphoreSubmitInfo.DEVICEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSemaphoreSubmitInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSemaphoreSubmitInfo.PNEXT, value); }
    /** Unsafe version of {@link #semaphore(long) semaphore}. */
    public static void nsemaphore(long struct, long value) { memPutLong(struct + VkSemaphoreSubmitInfo.SEMAPHORE, value); }
    /** Unsafe version of {@link #value(long) value}. */
    public static void nvalue(long struct, long value) { memPutLong(struct + VkSemaphoreSubmitInfo.VALUE, value); }
    /** Unsafe version of {@link #stageMask(long) stageMask}. */
    public static void nstageMask(long struct, long value) { memPutLong(struct + VkSemaphoreSubmitInfo.STAGEMASK, value); }
    /** Unsafe version of {@link #deviceIndex(int) deviceIndex}. */
    public static void ndeviceIndex(long struct, int value) { memPutInt(struct + VkSemaphoreSubmitInfo.DEVICEINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkSemaphoreSubmitInfo} structs. */
    public static class Buffer extends StructBuffer<VkSemaphoreSubmitInfo, Buffer> implements NativeResource {

        private static final VkSemaphoreSubmitInfo ELEMENT_FACTORY = VkSemaphoreSubmitInfo.create(-1L);

        /**
         * Creates a new {@code VkSemaphoreSubmitInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSemaphoreSubmitInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSemaphoreSubmitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSemaphoreSubmitInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSemaphoreSubmitInfo.npNext(address()); }
        /** @return the value of the {@code semaphore} field. */
        @NativeType("VkSemaphore")
        public long semaphore() { return VkSemaphoreSubmitInfo.nsemaphore(address()); }
        /** @return the value of the {@code value} field. */
        @NativeType("uint64_t")
        public long value() { return VkSemaphoreSubmitInfo.nvalue(address()); }
        /** @return the value of the {@code stageMask} field. */
        @NativeType("VkPipelineStageFlags2")
        public long stageMask() { return VkSemaphoreSubmitInfo.nstageMask(address()); }
        /** @return the value of the {@code deviceIndex} field. */
        @NativeType("uint32_t")
        public int deviceIndex() { return VkSemaphoreSubmitInfo.ndeviceIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSemaphoreSubmitInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSemaphoreSubmitInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO} value to the {@code sType} field. */
        public VkSemaphoreSubmitInfo.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSemaphoreSubmitInfo.Buffer pNext(@NativeType("void const *") long value) { VkSemaphoreSubmitInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code semaphore} field. */
        public VkSemaphoreSubmitInfo.Buffer semaphore(@NativeType("VkSemaphore") long value) { VkSemaphoreSubmitInfo.nsemaphore(address(), value); return this; }
        /** Sets the specified value to the {@code value} field. */
        public VkSemaphoreSubmitInfo.Buffer value(@NativeType("uint64_t") long value) { VkSemaphoreSubmitInfo.nvalue(address(), value); return this; }
        /** Sets the specified value to the {@code stageMask} field. */
        public VkSemaphoreSubmitInfo.Buffer stageMask(@NativeType("VkPipelineStageFlags2") long value) { VkSemaphoreSubmitInfo.nstageMask(address(), value); return this; }
        /** Sets the specified value to the {@code deviceIndex} field. */
        public VkSemaphoreSubmitInfo.Buffer deviceIndex(@NativeType("uint32_t") int value) { VkSemaphoreSubmitInfo.ndeviceIndex(address(), value); return this; }

    }

}