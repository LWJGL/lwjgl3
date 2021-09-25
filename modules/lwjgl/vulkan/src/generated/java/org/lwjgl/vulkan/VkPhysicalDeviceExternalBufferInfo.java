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
 * Structure specifying buffer creation parameters.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkBufferCreateFlagBits} values</li>
 * <li>{@code usage} <b>must</b> be a valid combination of {@code VkBufferUsageFlagBits} values</li>
 * <li>{@code usage} <b>must</b> not be 0</li>
 * <li>{@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBits} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK11#vkGetPhysicalDeviceExternalBufferProperties GetPhysicalDeviceExternalBufferProperties}, {@link KHRExternalMemoryCapabilities#vkGetPhysicalDeviceExternalBufferPropertiesKHR GetPhysicalDeviceExternalBufferPropertiesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceExternalBufferInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBufferCreateFlags {@link #flags};
 *     VkBufferUsageFlags {@link #usage};
 *     VkExternalMemoryHandleTypeFlagBits {@link #handleType};
 * }</code></pre>
 */
public class VkPhysicalDeviceExternalBufferInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        USAGE,
        HANDLETYPE;

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
        USAGE = layout.offsetof(3);
        HANDLETYPE = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPhysicalDeviceExternalBufferInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceExternalBufferInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkBufferCreateFlagBits} describing additional parameters of the buffer, corresponding to {@link VkBufferCreateInfo}{@code ::flags}. */
    @NativeType("VkBufferCreateFlags")
    public int flags() { return nflags(address()); }
    /** a bitmask of {@code VkBufferUsageFlagBits} describing the intended usage of the buffer, corresponding to {@link VkBufferCreateInfo}{@code ::usage}. */
    @NativeType("VkBufferUsageFlags")
    public int usage() { return nusage(address()); }
    /** a {@code VkExternalMemoryHandleTypeFlagBits} value specifying the memory handle type that will be used with the memory associated with the buffer. */
    @NativeType("VkExternalMemoryHandleTypeFlagBits")
    public int handleType() { return nhandleType(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceExternalBufferInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO} value to the {@link #sType} field. */
    public VkPhysicalDeviceExternalBufferInfo sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceExternalBufferInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkPhysicalDeviceExternalBufferInfo flags(@NativeType("VkBufferCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #usage} field. */
    public VkPhysicalDeviceExternalBufferInfo usage(@NativeType("VkBufferUsageFlags") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@link #handleType} field. */
    public VkPhysicalDeviceExternalBufferInfo handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceExternalBufferInfo set(
        int sType,
        long pNext,
        int flags,
        int usage,
        int handleType
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        usage(usage);
        handleType(handleType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceExternalBufferInfo set(VkPhysicalDeviceExternalBufferInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceExternalBufferInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExternalBufferInfo malloc() {
        return wrap(VkPhysicalDeviceExternalBufferInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceExternalBufferInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExternalBufferInfo calloc() {
        return wrap(VkPhysicalDeviceExternalBufferInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceExternalBufferInfo} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceExternalBufferInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceExternalBufferInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceExternalBufferInfo} instance for the specified memory address. */
    public static VkPhysicalDeviceExternalBufferInfo create(long address) {
        return wrap(VkPhysicalDeviceExternalBufferInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExternalBufferInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceExternalBufferInfo.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalBufferInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalBufferInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalBufferInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalBufferInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalBufferInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalBufferInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceExternalBufferInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalBufferInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExternalBufferInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalBufferInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalBufferInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalBufferInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalBufferInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalBufferInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalBufferInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalBufferInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalBufferInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceExternalBufferInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExternalBufferInfo malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceExternalBufferInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExternalBufferInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExternalBufferInfo calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceExternalBufferInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalBufferInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalBufferInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalBufferInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalBufferInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExternalBufferInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceExternalBufferInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExternalBufferInfo.FLAGS); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExternalBufferInfo.USAGE); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceExternalBufferInfo.HANDLETYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExternalBufferInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceExternalBufferInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExternalBufferInfo.FLAGS, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExternalBufferInfo.USAGE, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceExternalBufferInfo.HANDLETYPE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceExternalBufferInfo} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExternalBufferInfo, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceExternalBufferInfo ELEMENT_FACTORY = VkPhysicalDeviceExternalBufferInfo.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceExternalBufferInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceExternalBufferInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceExternalBufferInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceExternalBufferInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceExternalBufferInfo.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExternalBufferInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPhysicalDeviceExternalBufferInfo.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExternalBufferInfo#flags} field. */
        @NativeType("VkBufferCreateFlags")
        public int flags() { return VkPhysicalDeviceExternalBufferInfo.nflags(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExternalBufferInfo#usage} field. */
        @NativeType("VkBufferUsageFlags")
        public int usage() { return VkPhysicalDeviceExternalBufferInfo.nusage(address()); }
        /** @return the value of the {@link VkPhysicalDeviceExternalBufferInfo#handleType} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagBits")
        public int handleType() { return VkPhysicalDeviceExternalBufferInfo.nhandleType(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceExternalBufferInfo#sType} field. */
        public VkPhysicalDeviceExternalBufferInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceExternalBufferInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO} value to the {@link VkPhysicalDeviceExternalBufferInfo#sType} field. */
        public VkPhysicalDeviceExternalBufferInfo.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO); }
        /** Sets the specified value to the {@link VkPhysicalDeviceExternalBufferInfo#pNext} field. */
        public VkPhysicalDeviceExternalBufferInfo.Buffer pNext(@NativeType("void const *") long value) { VkPhysicalDeviceExternalBufferInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExternalBufferInfo#flags} field. */
        public VkPhysicalDeviceExternalBufferInfo.Buffer flags(@NativeType("VkBufferCreateFlags") int value) { VkPhysicalDeviceExternalBufferInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExternalBufferInfo#usage} field. */
        public VkPhysicalDeviceExternalBufferInfo.Buffer usage(@NativeType("VkBufferUsageFlags") int value) { VkPhysicalDeviceExternalBufferInfo.nusage(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceExternalBufferInfo#handleType} field. */
        public VkPhysicalDeviceExternalBufferInfo.Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { VkPhysicalDeviceExternalBufferInfo.nhandleType(address(), value); return this; }

    }

}