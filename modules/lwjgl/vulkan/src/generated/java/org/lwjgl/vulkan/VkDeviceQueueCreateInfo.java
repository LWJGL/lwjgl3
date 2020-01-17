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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created device queue.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code queueFamilyIndex} <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by {@code vkGetPhysicalDeviceQueueFamilyProperties}</li>
 * <li>{@code queueCount} <b>must</b> be less than or equal to the {@code queueCount} member of the {@link VkQueueFamilyProperties} structure, as returned by {@code vkGetPhysicalDeviceQueueFamilyProperties} in the {@code pQueueFamilyProperties}[queueFamilyIndex]</li>
 * <li>Each element of {@code pQueuePriorities} <b>must</b> be between {@code 0.0} and {@code 1.0} inclusive</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkDeviceQueueGlobalPriorityCreateInfoEXT}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkDeviceQueueCreateFlagBits} values</li>
 * <li>{@code pQueuePriorities} <b>must</b> be a valid pointer to an array of {@code queueCount} {@code float} values</li>
 * <li>{@code queueCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDeviceCreateInfo}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; a bitmask indicating behavior of the queue.</li>
 * <li>{@code queueFamilyIndex} &ndash; an unsigned integer indicating the index of the queue family to create on this device. This index corresponds to the index of an element of the {@code pQueueFamilyProperties} array that was returned by {@code vkGetPhysicalDeviceQueueFamilyProperties}.</li>
 * <li>{@code queueCount} &ndash; an unsigned integer specifying the number of queues to create in the queue family indicated by {@code queueFamilyIndex}.</li>
 * <li>{@code pQueuePriorities} &ndash; a pointer to an array of {@code queueCount} normalized floating point values, specifying priorities of work that will be submitted to each created queue. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-priority">Queue Priority</a> for more information.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceQueueCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDeviceQueueCreateFlags flags;
 *     uint32_t queueFamilyIndex;
 *     uint32_t queueCount;
 *     float const * pQueuePriorities;
 * }</code></pre>
 */
public class VkDeviceQueueCreateInfo extends Struct implements NativeResource {

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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkDeviceQueueCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code queueFamilyIndex} field. */
    @NativeType("uint32_t")
    public int queueFamilyIndex() { return nqueueFamilyIndex(address()); }
    /** Returns the value of the {@code queueCount} field. */
    @NativeType("uint32_t")
    public int queueCount() { return nqueueCount(address()); }
    /** Returns a {@link FloatBuffer} view of the data pointed to by the {@code pQueuePriorities} field. */
    @NativeType("float const *")
    public FloatBuffer pQueuePriorities() { return npQueuePriorities(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceQueueCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceQueueCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
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
        return wrap(VkDeviceQueueCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceQueueCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceQueueCreateInfo calloc() {
        return wrap(VkDeviceQueueCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceQueueCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkDeviceQueueCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceQueueCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceQueueCreateInfo} instance for the specified memory address. */
    public static VkDeviceQueueCreateInfo create(long address) {
        return wrap(VkDeviceQueueCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceQueueCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceQueueCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkDeviceQueueCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceQueueCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceQueueCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceQueueCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDeviceQueueCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkDeviceQueueCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDeviceQueueCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkDeviceQueueCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceQueueCreateInfo mallocStack(MemoryStack stack) {
        return wrap(VkDeviceQueueCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceQueueCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceQueueCreateInfo callocStack(MemoryStack stack) {
        return wrap(VkDeviceQueueCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceQueueCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceQueueCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceQueueCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceQueueCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceQueueCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkDeviceQueueCreateInfo.FLAGS); }
    /** Unsafe version of {@link #queueFamilyIndex}. */
    public static int nqueueFamilyIndex(long struct) { return UNSAFE.getInt(null, struct + VkDeviceQueueCreateInfo.QUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #queueCount}. */
    public static int nqueueCount(long struct) { return UNSAFE.getInt(null, struct + VkDeviceQueueCreateInfo.QUEUECOUNT); }
    /** Unsafe version of {@link #pQueuePriorities() pQueuePriorities}. */
    public static FloatBuffer npQueuePriorities(long struct) { return memFloatBuffer(memGetAddress(struct + VkDeviceQueueCreateInfo.PQUEUEPRIORITIES), nqueueCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceQueueCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceQueueCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceQueueCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #queueFamilyIndex(int) queueFamilyIndex}. */
    public static void nqueueFamilyIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceQueueCreateInfo.QUEUEFAMILYINDEX, value); }
    /** Sets the specified value to the {@code queueCount} field of the specified {@code struct}. */
    public static void nqueueCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceQueueCreateInfo.QUEUECOUNT, value); }
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

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkDeviceQueueCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkDeviceQueueCreateInfo, Buffer> implements NativeResource {

        private static final VkDeviceQueueCreateInfo ELEMENT_FACTORY = VkDeviceQueueCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkDeviceQueueCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceQueueCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceQueueCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceQueueCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceQueueCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkDeviceQueueCreateFlags")
        public int flags() { return VkDeviceQueueCreateInfo.nflags(address()); }
        /** Returns the value of the {@code queueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int queueFamilyIndex() { return VkDeviceQueueCreateInfo.nqueueFamilyIndex(address()); }
        /** Returns the value of the {@code queueCount} field. */
        @NativeType("uint32_t")
        public int queueCount() { return VkDeviceQueueCreateInfo.nqueueCount(address()); }
        /** Returns a {@link FloatBuffer} view of the data pointed to by the {@code pQueuePriorities} field. */
        @NativeType("float const *")
        public FloatBuffer pQueuePriorities() { return VkDeviceQueueCreateInfo.npQueuePriorities(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceQueueCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceQueueCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceQueueCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkDeviceQueueCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkDeviceQueueCreateInfo.Buffer flags(@NativeType("VkDeviceQueueCreateFlags") int value) { VkDeviceQueueCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code queueFamilyIndex} field. */
        public VkDeviceQueueCreateInfo.Buffer queueFamilyIndex(@NativeType("uint32_t") int value) { VkDeviceQueueCreateInfo.nqueueFamilyIndex(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code pQueuePriorities} field. */
        public VkDeviceQueueCreateInfo.Buffer pQueuePriorities(@NativeType("float const *") FloatBuffer value) { VkDeviceQueueCreateInfo.npQueuePriorities(address(), value); return this; }

    }

}