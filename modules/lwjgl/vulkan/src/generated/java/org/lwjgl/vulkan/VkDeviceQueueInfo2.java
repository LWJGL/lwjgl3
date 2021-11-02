/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the parameters used for device queue creation.
 * 
 * <h5>Description</h5>
 * 
 * <p>The queue returned by {@code vkGetDeviceQueue2} <b>must</b> have the same {@code flags} value from this structure as that used at device creation time in a {@link VkDeviceQueueCreateInfo} structure. If no matching {@code flags} were specified at device creation time, then the handle returned in {@code pQueue} <b>must</b> be {@code NULL}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code queueFamilyIndex} <b>must</b> be one of the queue family indices specified when {@code device} was created, via the {@link VkDeviceQueueCreateInfo} structure</li>
 * <li>{@code flags} <b>must</b> be equal to {@link VkDeviceQueueCreateInfo}{@code ::flags} for a {@link VkDeviceQueueCreateInfo} structure for the queue family indicated by {@code queueFamilyIndex} when {@code device} was created</li>
 * <li>{@code queueIndex} <b>must</b> be less than {@link VkDeviceQueueCreateInfo}{@code ::queueCount} for the corresponding queue family and flags indicated by {@code queueFamilyIndex} and {@code flags} when {@code device} was created</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2 STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkDeviceQueueCreateFlagBits} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK11#vkGetDeviceQueue2 GetDeviceQueue2}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceQueueInfo2 {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDeviceQueueCreateFlags {@link #flags};
 *     uint32_t {@link #queueFamilyIndex};
 *     uint32_t {@link #queueIndex};
 * }</code></pre>
 */
public class VkDeviceQueueInfo2 extends Struct implements NativeResource {

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
        QUEUEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        QUEUEFAMILYINDEX = layout.offsetof(3);
        QUEUEINDEX = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkDeviceQueueInfo2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceQueueInfo2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. The {@code pNext} chain of {@link VkDeviceQueueInfo2} <b>can</b> be used to provide additional device queue parameters to {@code vkGetDeviceQueue2}. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkDeviceQueueCreateFlags} value indicating the flags used to create the device queue. */
    @NativeType("VkDeviceQueueCreateFlags")
    public int flags() { return nflags(address()); }
    /** the index of the queue family to which the queue belongs. */
    @NativeType("uint32_t")
    public int queueFamilyIndex() { return nqueueFamilyIndex(address()); }
    /** the index within this queue family of the queue to retrieve. */
    @NativeType("uint32_t")
    public int queueIndex() { return nqueueIndex(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDeviceQueueInfo2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2 STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2} value to the {@link #sType} field. */
    public VkDeviceQueueInfo2 sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDeviceQueueInfo2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkDeviceQueueInfo2 flags(@NativeType("VkDeviceQueueCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #queueFamilyIndex} field. */
    public VkDeviceQueueInfo2 queueFamilyIndex(@NativeType("uint32_t") int value) { nqueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@link #queueIndex} field. */
    public VkDeviceQueueInfo2 queueIndex(@NativeType("uint32_t") int value) { nqueueIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceQueueInfo2 set(
        int sType,
        long pNext,
        int flags,
        int queueFamilyIndex,
        int queueIndex
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        queueFamilyIndex(queueFamilyIndex);
        queueIndex(queueIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceQueueInfo2 set(VkDeviceQueueInfo2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceQueueInfo2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceQueueInfo2 malloc() {
        return wrap(VkDeviceQueueInfo2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceQueueInfo2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceQueueInfo2 calloc() {
        return wrap(VkDeviceQueueInfo2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceQueueInfo2} instance allocated with {@link BufferUtils}. */
    public static VkDeviceQueueInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceQueueInfo2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceQueueInfo2} instance for the specified memory address. */
    public static VkDeviceQueueInfo2 create(long address) {
        return wrap(VkDeviceQueueInfo2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceQueueInfo2 createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceQueueInfo2.class, address);
    }

    /**
     * Returns a new {@link VkDeviceQueueInfo2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueInfo2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueInfo2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueInfo2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueInfo2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueInfo2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceQueueInfo2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueInfo2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceQueueInfo2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueInfo2 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueInfo2 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueInfo2 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueInfo2 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueInfo2.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueInfo2.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueInfo2.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueInfo2.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDeviceQueueInfo2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceQueueInfo2 malloc(MemoryStack stack) {
        return wrap(VkDeviceQueueInfo2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceQueueInfo2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceQueueInfo2 calloc(MemoryStack stack) {
        return wrap(VkDeviceQueueInfo2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceQueueInfo2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueInfo2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueInfo2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueInfo2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceQueueInfo2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceQueueInfo2.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkDeviceQueueInfo2.FLAGS); }
    /** Unsafe version of {@link #queueFamilyIndex}. */
    public static int nqueueFamilyIndex(long struct) { return UNSAFE.getInt(null, struct + VkDeviceQueueInfo2.QUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #queueIndex}. */
    public static int nqueueIndex(long struct) { return UNSAFE.getInt(null, struct + VkDeviceQueueInfo2.QUEUEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceQueueInfo2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceQueueInfo2.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceQueueInfo2.FLAGS, value); }
    /** Unsafe version of {@link #queueFamilyIndex(int) queueFamilyIndex}. */
    public static void nqueueFamilyIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceQueueInfo2.QUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #queueIndex(int) queueIndex}. */
    public static void nqueueIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceQueueInfo2.QUEUEINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceQueueInfo2} structs. */
    public static class Buffer extends StructBuffer<VkDeviceQueueInfo2, Buffer> implements NativeResource {

        private static final VkDeviceQueueInfo2 ELEMENT_FACTORY = VkDeviceQueueInfo2.create(-1L);

        /**
         * Creates a new {@code VkDeviceQueueInfo2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceQueueInfo2#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceQueueInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceQueueInfo2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceQueueInfo2.nsType(address()); }
        /** @return the value of the {@link VkDeviceQueueInfo2#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceQueueInfo2.npNext(address()); }
        /** @return the value of the {@link VkDeviceQueueInfo2#flags} field. */
        @NativeType("VkDeviceQueueCreateFlags")
        public int flags() { return VkDeviceQueueInfo2.nflags(address()); }
        /** @return the value of the {@link VkDeviceQueueInfo2#queueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int queueFamilyIndex() { return VkDeviceQueueInfo2.nqueueFamilyIndex(address()); }
        /** @return the value of the {@link VkDeviceQueueInfo2#queueIndex} field. */
        @NativeType("uint32_t")
        public int queueIndex() { return VkDeviceQueueInfo2.nqueueIndex(address()); }

        /** Sets the specified value to the {@link VkDeviceQueueInfo2#sType} field. */
        public VkDeviceQueueInfo2.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceQueueInfo2.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2 STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2} value to the {@link VkDeviceQueueInfo2#sType} field. */
        public VkDeviceQueueInfo2.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2); }
        /** Sets the specified value to the {@link VkDeviceQueueInfo2#pNext} field. */
        public VkDeviceQueueInfo2.Buffer pNext(@NativeType("void const *") long value) { VkDeviceQueueInfo2.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceQueueInfo2#flags} field. */
        public VkDeviceQueueInfo2.Buffer flags(@NativeType("VkDeviceQueueCreateFlags") int value) { VkDeviceQueueInfo2.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceQueueInfo2#queueFamilyIndex} field. */
        public VkDeviceQueueInfo2.Buffer queueFamilyIndex(@NativeType("uint32_t") int value) { VkDeviceQueueInfo2.nqueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceQueueInfo2#queueIndex} field. */
        public VkDeviceQueueInfo2.Buffer queueIndex(@NativeType("uint32_t") int value) { VkDeviceQueueInfo2.nqueueIndex(address(), value); return this; }

    }

}