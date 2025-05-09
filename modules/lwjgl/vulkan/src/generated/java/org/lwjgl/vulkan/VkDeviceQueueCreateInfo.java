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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkDeviceQueueCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDeviceQueueCreateFlags flags;
 *     uint32_t queueFamilyIndex;
 *     uint32_t queueCount;
 *     float const * pQueuePriorities;
 * }}</pre>
 */
public class VkDeviceQueueCreateInfo extends Struct<VkDeviceQueueCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        QUEUEFAMILYINDEX,
        QUEUECOUNT,
        PQUEUEPRIORITIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        QUEUEFAMILYINDEX = layout.offsetof(3);
        QUEUECOUNT = layout.offsetof(4);
        PQUEUEPRIORITIES = layout.offsetof(5);
    }

    protected VkDeviceQueueCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceQueueCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceQueueCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkDeviceQueueCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceQueueCreateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkDeviceQueueCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code queueFamilyIndex} field. */
    @NativeType("uint32_t")
    public int queueFamilyIndex() { return nqueueFamilyIndex(address()); }
    /** @return the value of the {@code queueCount} field. */
    @NativeType("uint32_t")
    public int queueCount() { return nqueueCount(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code pQueuePriorities} field. */
    @NativeType("float const *")
    public FloatBuffer pQueuePriorities() { return npQueuePriorities(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceQueueCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO} value to the {@code sType} field. */
    public VkDeviceQueueCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceQueueCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDeviceQueueGlobalPriorityCreateInfo} value to the {@code pNext} chain. */
    public VkDeviceQueueCreateInfo pNext(VkDeviceQueueGlobalPriorityCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDeviceQueueGlobalPriorityCreateInfoEXT} value to the {@code pNext} chain. */
    public VkDeviceQueueCreateInfo pNext(VkDeviceQueueGlobalPriorityCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDeviceQueueGlobalPriorityCreateInfoKHR} value to the {@code pNext} chain. */
    public VkDeviceQueueCreateInfo pNext(VkDeviceQueueGlobalPriorityCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDeviceQueueShaderCoreControlCreateInfoARM} value to the {@code pNext} chain. */
    public VkDeviceQueueCreateInfo pNext(VkDeviceQueueShaderCoreControlCreateInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkDeviceQueueCreateInfo flags(@NativeType("VkDeviceQueueCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code queueFamilyIndex} field. */
    public VkDeviceQueueCreateInfo queueFamilyIndex(@NativeType("uint32_t") int value) { nqueueFamilyIndex(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code pQueuePriorities} field. */
    public VkDeviceQueueCreateInfo pQueuePriorities(@NativeType("float const *") FloatBuffer value) { npQueuePriorities(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceQueueCreateInfo set(
        int sType,
        long pNext,
        int flags,
        int queueFamilyIndex,
        FloatBuffer pQueuePriorities
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        queueFamilyIndex(queueFamilyIndex);
        pQueuePriorities(pQueuePriorities);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceQueueCreateInfo set(VkDeviceQueueCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceQueueCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceQueueCreateInfo malloc() {
        return new VkDeviceQueueCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceQueueCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceQueueCreateInfo calloc() {
        return new VkDeviceQueueCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceQueueCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkDeviceQueueCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceQueueCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceQueueCreateInfo} instance for the specified memory address. */
    public static VkDeviceQueueCreateInfo create(long address) {
        return new VkDeviceQueueCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceQueueCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkDeviceQueueCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkDeviceQueueCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceQueueCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceQueueCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDeviceQueueCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceQueueCreateInfo malloc(MemoryStack stack) {
        return new VkDeviceQueueCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceQueueCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceQueueCreateInfo calloc(MemoryStack stack) {
        return new VkDeviceQueueCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceQueueCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceQueueCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceQueueCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkDeviceQueueCreateInfo.FLAGS); }
    /** Unsafe version of {@link #queueFamilyIndex}. */
    public static int nqueueFamilyIndex(long struct) { return memGetInt(struct + VkDeviceQueueCreateInfo.QUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #queueCount}. */
    public static int nqueueCount(long struct) { return memGetInt(struct + VkDeviceQueueCreateInfo.QUEUECOUNT); }
    /** Unsafe version of {@link #pQueuePriorities() pQueuePriorities}. */
    public static FloatBuffer npQueuePriorities(long struct) { return memFloatBuffer(memGetAddress(struct + VkDeviceQueueCreateInfo.PQUEUEPRIORITIES), nqueueCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceQueueCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceQueueCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkDeviceQueueCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #queueFamilyIndex(int) queueFamilyIndex}. */
    public static void nqueueFamilyIndex(long struct, int value) { memPutInt(struct + VkDeviceQueueCreateInfo.QUEUEFAMILYINDEX, value); }
    /** Sets the specified value to the {@code queueCount} field of the specified {@code struct}. */
    public static void nqueueCount(long struct, int value) { memPutInt(struct + VkDeviceQueueCreateInfo.QUEUECOUNT, value); }
    /** Unsafe version of {@link #pQueuePriorities(FloatBuffer) pQueuePriorities}. */
    public static void npQueuePriorities(long struct, FloatBuffer value) { memPutAddress(struct + VkDeviceQueueCreateInfo.PQUEUEPRIORITIES, memAddress(value)); nqueueCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDeviceQueueCreateInfo.PQUEUEPRIORITIES));
    }

    // -----------------------------------

    /** An array of {@link VkDeviceQueueCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkDeviceQueueCreateInfo, Buffer> implements NativeResource {

        private static final VkDeviceQueueCreateInfo ELEMENT_FACTORY = VkDeviceQueueCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkDeviceQueueCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceQueueCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceQueueCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceQueueCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceQueueCreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkDeviceQueueCreateFlags")
        public int flags() { return VkDeviceQueueCreateInfo.nflags(address()); }
        /** @return the value of the {@code queueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int queueFamilyIndex() { return VkDeviceQueueCreateInfo.nqueueFamilyIndex(address()); }
        /** @return the value of the {@code queueCount} field. */
        @NativeType("uint32_t")
        public int queueCount() { return VkDeviceQueueCreateInfo.nqueueCount(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code pQueuePriorities} field. */
        @NativeType("float const *")
        public FloatBuffer pQueuePriorities() { return VkDeviceQueueCreateInfo.npQueuePriorities(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceQueueCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceQueueCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO} value to the {@code sType} field. */
        public VkDeviceQueueCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceQueueCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkDeviceQueueCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDeviceQueueGlobalPriorityCreateInfo} value to the {@code pNext} chain. */
        public VkDeviceQueueCreateInfo.Buffer pNext(VkDeviceQueueGlobalPriorityCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDeviceQueueGlobalPriorityCreateInfoEXT} value to the {@code pNext} chain. */
        public VkDeviceQueueCreateInfo.Buffer pNext(VkDeviceQueueGlobalPriorityCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDeviceQueueGlobalPriorityCreateInfoKHR} value to the {@code pNext} chain. */
        public VkDeviceQueueCreateInfo.Buffer pNext(VkDeviceQueueGlobalPriorityCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDeviceQueueShaderCoreControlCreateInfoARM} value to the {@code pNext} chain. */
        public VkDeviceQueueCreateInfo.Buffer pNext(VkDeviceQueueShaderCoreControlCreateInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkDeviceQueueCreateInfo.Buffer flags(@NativeType("VkDeviceQueueCreateFlags") int value) { VkDeviceQueueCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code queueFamilyIndex} field. */
        public VkDeviceQueueCreateInfo.Buffer queueFamilyIndex(@NativeType("uint32_t") int value) { VkDeviceQueueCreateInfo.nqueueFamilyIndex(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code pQueuePriorities} field. */
        public VkDeviceQueueCreateInfo.Buffer pQueuePriorities(@NativeType("float const *") FloatBuffer value) { VkDeviceQueueCreateInfo.npQueuePriorities(address(), value); return this; }

    }

}