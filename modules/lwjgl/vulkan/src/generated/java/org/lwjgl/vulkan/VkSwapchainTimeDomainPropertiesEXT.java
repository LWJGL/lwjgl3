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
 * struct VkSwapchainTimeDomainPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t timeDomainCount;
 *     VkTimeDomainKHR * pTimeDomains;
 *     uint64_t * pTimeDomainIds;
 * }}</pre>
 */
public class VkSwapchainTimeDomainPropertiesEXT extends Struct<VkSwapchainTimeDomainPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TIMEDOMAINCOUNT,
        PTIMEDOMAINS,
        PTIMEDOMAINIDS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TIMEDOMAINCOUNT = layout.offsetof(2);
        PTIMEDOMAINS = layout.offsetof(3);
        PTIMEDOMAINIDS = layout.offsetof(4);
    }

    protected VkSwapchainTimeDomainPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSwapchainTimeDomainPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSwapchainTimeDomainPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkSwapchainTimeDomainPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSwapchainTimeDomainPropertiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code timeDomainCount} field. */
    @NativeType("uint32_t")
    public int timeDomainCount() { return ntimeDomainCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pTimeDomains} field. */
    @NativeType("VkTimeDomainKHR *")
    public @Nullable IntBuffer pTimeDomains() { return npTimeDomains(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pTimeDomainIds} field. */
    @NativeType("uint64_t *")
    public @Nullable LongBuffer pTimeDomainIds() { return npTimeDomainIds(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSwapchainTimeDomainPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPresentTiming#VK_STRUCTURE_TYPE_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT STRUCTURE_TYPE_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkSwapchainTimeDomainPropertiesEXT sType$Default() { return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSwapchainTimeDomainPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSwapchainTimeDomainPropertiesEXT set(
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
    public VkSwapchainTimeDomainPropertiesEXT set(VkSwapchainTimeDomainPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSwapchainTimeDomainPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSwapchainTimeDomainPropertiesEXT malloc() {
        return new VkSwapchainTimeDomainPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainTimeDomainPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSwapchainTimeDomainPropertiesEXT calloc() {
        return new VkSwapchainTimeDomainPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainTimeDomainPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkSwapchainTimeDomainPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainTimeDomainPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSwapchainTimeDomainPropertiesEXT} instance for the specified memory address. */
    public static VkSwapchainTimeDomainPropertiesEXT create(long address) {
        return new VkSwapchainTimeDomainPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSwapchainTimeDomainPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkSwapchainTimeDomainPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkSwapchainTimeDomainPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainTimeDomainPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainTimeDomainPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainTimeDomainPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainTimeDomainPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainTimeDomainPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSwapchainTimeDomainPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSwapchainTimeDomainPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSwapchainTimeDomainPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSwapchainTimeDomainPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainTimeDomainPropertiesEXT malloc(MemoryStack stack) {
        return new VkSwapchainTimeDomainPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSwapchainTimeDomainPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainTimeDomainPropertiesEXT calloc(MemoryStack stack) {
        return new VkSwapchainTimeDomainPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSwapchainTimeDomainPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainTimeDomainPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainTimeDomainPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainTimeDomainPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSwapchainTimeDomainPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSwapchainTimeDomainPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #timeDomainCount}. */
    public static int ntimeDomainCount(long struct) { return memGetInt(struct + VkSwapchainTimeDomainPropertiesEXT.TIMEDOMAINCOUNT); }
    /** Unsafe version of {@link #pTimeDomains() pTimeDomains}. */
    public static @Nullable IntBuffer npTimeDomains(long struct) { return memIntBufferSafe(memGetAddress(struct + VkSwapchainTimeDomainPropertiesEXT.PTIMEDOMAINS), ntimeDomainCount(struct)); }
    /** Unsafe version of {@link #pTimeDomainIds() pTimeDomainIds}. */
    public static @Nullable LongBuffer npTimeDomainIds(long struct) { return memLongBufferSafe(memGetAddress(struct + VkSwapchainTimeDomainPropertiesEXT.PTIMEDOMAINIDS), ntimeDomainCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSwapchainTimeDomainPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSwapchainTimeDomainPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkSwapchainTimeDomainPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkSwapchainTimeDomainPropertiesEXT, Buffer> implements NativeResource {

        private static final VkSwapchainTimeDomainPropertiesEXT ELEMENT_FACTORY = VkSwapchainTimeDomainPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkSwapchainTimeDomainPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSwapchainTimeDomainPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSwapchainTimeDomainPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSwapchainTimeDomainPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSwapchainTimeDomainPropertiesEXT.npNext(address()); }
        /** @return the value of the {@code timeDomainCount} field. */
        @NativeType("uint32_t")
        public int timeDomainCount() { return VkSwapchainTimeDomainPropertiesEXT.ntimeDomainCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pTimeDomains} field. */
        @NativeType("VkTimeDomainKHR *")
        public @Nullable IntBuffer pTimeDomains() { return VkSwapchainTimeDomainPropertiesEXT.npTimeDomains(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pTimeDomainIds} field. */
        @NativeType("uint64_t *")
        public @Nullable LongBuffer pTimeDomainIds() { return VkSwapchainTimeDomainPropertiesEXT.npTimeDomainIds(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSwapchainTimeDomainPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSwapchainTimeDomainPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPresentTiming#VK_STRUCTURE_TYPE_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT STRUCTURE_TYPE_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkSwapchainTimeDomainPropertiesEXT.Buffer sType$Default() { return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSwapchainTimeDomainPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkSwapchainTimeDomainPropertiesEXT.npNext(address(), value); return this; }

    }

}