/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VmaAllocationCreateInfo {
 *     VmaAllocationCreateFlags flags;
 *     VmaMemoryUsage usage;
 *     VkMemoryPropertyFlags requiredFlags;
 *     VkMemoryPropertyFlags preferredFlags;
 *     uint32_t memoryTypeBits;
 *     VmaPool pool;
 *     void * pUserData;
 *     float priority;
 * }}</pre>
 */
public class VmaAllocationCreateInfo extends Struct<VmaAllocationCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        USAGE,
        REQUIREDFLAGS,
        PREFERREDFLAGS,
        MEMORYTYPEBITS,
        POOL,
        PUSERDATA,
        PRIORITY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        USAGE = layout.offsetof(1);
        REQUIREDFLAGS = layout.offsetof(2);
        PREFERREDFLAGS = layout.offsetof(3);
        MEMORYTYPEBITS = layout.offsetof(4);
        POOL = layout.offsetof(5);
        PUSERDATA = layout.offsetof(6);
        PRIORITY = layout.offsetof(7);
    }

    protected VmaAllocationCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VmaAllocationCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VmaAllocationCreateInfo(address, container);
    }

    /**
     * Creates a {@code VmaAllocationCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaAllocationCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code flags} field. */
    @NativeType("VmaAllocationCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code usage} field. */
    @NativeType("VmaMemoryUsage")
    public int usage() { return nusage(address()); }
    /** @return the value of the {@code requiredFlags} field. */
    @NativeType("VkMemoryPropertyFlags")
    public int requiredFlags() { return nrequiredFlags(address()); }
    /** @return the value of the {@code preferredFlags} field. */
    @NativeType("VkMemoryPropertyFlags")
    public int preferredFlags() { return npreferredFlags(address()); }
    /** @return the value of the {@code memoryTypeBits} field. */
    @NativeType("uint32_t")
    public int memoryTypeBits() { return nmemoryTypeBits(address()); }
    /** @return the value of the {@code pool} field. */
    @NativeType("VmaPool")
    public long pool() { return npool(address()); }
    /** @return the value of the {@code pUserData} field. */
    @NativeType("void *")
    public long pUserData() { return npUserData(address()); }
    /** @return the value of the {@code priority} field. */
    public float priority() { return npriority(address()); }

    /** Sets the specified value to the {@code flags} field. */
    public VmaAllocationCreateInfo flags(@NativeType("VmaAllocationCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code usage} field. */
    public VmaAllocationCreateInfo usage(@NativeType("VmaMemoryUsage") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@code requiredFlags} field. */
    public VmaAllocationCreateInfo requiredFlags(@NativeType("VkMemoryPropertyFlags") int value) { nrequiredFlags(address(), value); return this; }
    /** Sets the specified value to the {@code preferredFlags} field. */
    public VmaAllocationCreateInfo preferredFlags(@NativeType("VkMemoryPropertyFlags") int value) { npreferredFlags(address(), value); return this; }
    /** Sets the specified value to the {@code memoryTypeBits} field. */
    public VmaAllocationCreateInfo memoryTypeBits(@NativeType("uint32_t") int value) { nmemoryTypeBits(address(), value); return this; }
    /** Sets the specified value to the {@code pool} field. */
    public VmaAllocationCreateInfo pool(@NativeType("VmaPool") long value) { npool(address(), value); return this; }
    /** Sets the specified value to the {@code pUserData} field. */
    public VmaAllocationCreateInfo pUserData(@NativeType("void *") long value) { npUserData(address(), value); return this; }
    /** Sets the specified value to the {@code priority} field. */
    public VmaAllocationCreateInfo priority(float value) { npriority(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VmaAllocationCreateInfo set(
        int flags,
        int usage,
        int requiredFlags,
        int preferredFlags,
        int memoryTypeBits,
        long pool,
        long pUserData,
        float priority
    ) {
        flags(flags);
        usage(usage);
        requiredFlags(requiredFlags);
        preferredFlags(preferredFlags);
        memoryTypeBits(memoryTypeBits);
        pool(pool);
        pUserData(pUserData);
        priority(priority);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VmaAllocationCreateInfo set(VmaAllocationCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VmaAllocationCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaAllocationCreateInfo malloc() {
        return new VmaAllocationCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VmaAllocationCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaAllocationCreateInfo calloc() {
        return new VmaAllocationCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VmaAllocationCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VmaAllocationCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaAllocationCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VmaAllocationCreateInfo} instance for the specified memory address. */
    public static VmaAllocationCreateInfo create(long address) {
        return new VmaAllocationCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VmaAllocationCreateInfo createSafe(long address) {
        return address == NULL ? null : new VmaAllocationCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VmaAllocationCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocationCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaAllocationCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocationCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaAllocationCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocationCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VmaAllocationCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaAllocationCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VmaAllocationCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaAllocationCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaAllocationCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaAllocationCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaAllocationCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaAllocationCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaAllocationCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaAllocationCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VmaAllocationCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VmaAllocationCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaAllocationCreateInfo malloc(MemoryStack stack) {
        return new VmaAllocationCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VmaAllocationCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaAllocationCreateInfo calloc(MemoryStack stack) {
        return new VmaAllocationCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VmaAllocationCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaAllocationCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaAllocationCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaAllocationCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VmaAllocationCreateInfo.FLAGS); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return memGetInt(struct + VmaAllocationCreateInfo.USAGE); }
    /** Unsafe version of {@link #requiredFlags}. */
    public static int nrequiredFlags(long struct) { return memGetInt(struct + VmaAllocationCreateInfo.REQUIREDFLAGS); }
    /** Unsafe version of {@link #preferredFlags}. */
    public static int npreferredFlags(long struct) { return memGetInt(struct + VmaAllocationCreateInfo.PREFERREDFLAGS); }
    /** Unsafe version of {@link #memoryTypeBits}. */
    public static int nmemoryTypeBits(long struct) { return memGetInt(struct + VmaAllocationCreateInfo.MEMORYTYPEBITS); }
    /** Unsafe version of {@link #pool}. */
    public static long npool(long struct) { return memGetAddress(struct + VmaAllocationCreateInfo.POOL); }
    /** Unsafe version of {@link #pUserData}. */
    public static long npUserData(long struct) { return memGetAddress(struct + VmaAllocationCreateInfo.PUSERDATA); }
    /** Unsafe version of {@link #priority}. */
    public static float npriority(long struct) { return memGetFloat(struct + VmaAllocationCreateInfo.PRIORITY); }

    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VmaAllocationCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { memPutInt(struct + VmaAllocationCreateInfo.USAGE, value); }
    /** Unsafe version of {@link #requiredFlags(int) requiredFlags}. */
    public static void nrequiredFlags(long struct, int value) { memPutInt(struct + VmaAllocationCreateInfo.REQUIREDFLAGS, value); }
    /** Unsafe version of {@link #preferredFlags(int) preferredFlags}. */
    public static void npreferredFlags(long struct, int value) { memPutInt(struct + VmaAllocationCreateInfo.PREFERREDFLAGS, value); }
    /** Unsafe version of {@link #memoryTypeBits(int) memoryTypeBits}. */
    public static void nmemoryTypeBits(long struct, int value) { memPutInt(struct + VmaAllocationCreateInfo.MEMORYTYPEBITS, value); }
    /** Unsafe version of {@link #pool(long) pool}. */
    public static void npool(long struct, long value) { memPutAddress(struct + VmaAllocationCreateInfo.POOL, value); }
    /** Unsafe version of {@link #pUserData(long) pUserData}. */
    public static void npUserData(long struct, long value) { memPutAddress(struct + VmaAllocationCreateInfo.PUSERDATA, value); }
    /** Unsafe version of {@link #priority(float) priority}. */
    public static void npriority(long struct, float value) { memPutFloat(struct + VmaAllocationCreateInfo.PRIORITY, value); }

    // -----------------------------------

    /** An array of {@link VmaAllocationCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VmaAllocationCreateInfo, Buffer> implements NativeResource {

        private static final VmaAllocationCreateInfo ELEMENT_FACTORY = VmaAllocationCreateInfo.create(-1L);

        /**
         * Creates a new {@code VmaAllocationCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaAllocationCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VmaAllocationCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code flags} field. */
        @NativeType("VmaAllocationCreateFlags")
        public int flags() { return VmaAllocationCreateInfo.nflags(address()); }
        /** @return the value of the {@code usage} field. */
        @NativeType("VmaMemoryUsage")
        public int usage() { return VmaAllocationCreateInfo.nusage(address()); }
        /** @return the value of the {@code requiredFlags} field. */
        @NativeType("VkMemoryPropertyFlags")
        public int requiredFlags() { return VmaAllocationCreateInfo.nrequiredFlags(address()); }
        /** @return the value of the {@code preferredFlags} field. */
        @NativeType("VkMemoryPropertyFlags")
        public int preferredFlags() { return VmaAllocationCreateInfo.npreferredFlags(address()); }
        /** @return the value of the {@code memoryTypeBits} field. */
        @NativeType("uint32_t")
        public int memoryTypeBits() { return VmaAllocationCreateInfo.nmemoryTypeBits(address()); }
        /** @return the value of the {@code pool} field. */
        @NativeType("VmaPool")
        public long pool() { return VmaAllocationCreateInfo.npool(address()); }
        /** @return the value of the {@code pUserData} field. */
        @NativeType("void *")
        public long pUserData() { return VmaAllocationCreateInfo.npUserData(address()); }
        /** @return the value of the {@code priority} field. */
        public float priority() { return VmaAllocationCreateInfo.npriority(address()); }

        /** Sets the specified value to the {@code flags} field. */
        public VmaAllocationCreateInfo.Buffer flags(@NativeType("VmaAllocationCreateFlags") int value) { VmaAllocationCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code usage} field. */
        public VmaAllocationCreateInfo.Buffer usage(@NativeType("VmaMemoryUsage") int value) { VmaAllocationCreateInfo.nusage(address(), value); return this; }
        /** Sets the specified value to the {@code requiredFlags} field. */
        public VmaAllocationCreateInfo.Buffer requiredFlags(@NativeType("VkMemoryPropertyFlags") int value) { VmaAllocationCreateInfo.nrequiredFlags(address(), value); return this; }
        /** Sets the specified value to the {@code preferredFlags} field. */
        public VmaAllocationCreateInfo.Buffer preferredFlags(@NativeType("VkMemoryPropertyFlags") int value) { VmaAllocationCreateInfo.npreferredFlags(address(), value); return this; }
        /** Sets the specified value to the {@code memoryTypeBits} field. */
        public VmaAllocationCreateInfo.Buffer memoryTypeBits(@NativeType("uint32_t") int value) { VmaAllocationCreateInfo.nmemoryTypeBits(address(), value); return this; }
        /** Sets the specified value to the {@code pool} field. */
        public VmaAllocationCreateInfo.Buffer pool(@NativeType("VmaPool") long value) { VmaAllocationCreateInfo.npool(address(), value); return this; }
        /** Sets the specified value to the {@code pUserData} field. */
        public VmaAllocationCreateInfo.Buffer pUserData(@NativeType("void *") long value) { VmaAllocationCreateInfo.npUserData(address(), value); return this; }
        /** Sets the specified value to the {@code priority} field. */
        public VmaAllocationCreateInfo.Buffer priority(float value) { VmaAllocationCreateInfo.npriority(address(), value); return this; }

    }

}