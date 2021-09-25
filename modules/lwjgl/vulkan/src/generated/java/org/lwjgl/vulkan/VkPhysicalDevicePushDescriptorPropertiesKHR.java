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
 * Structure describing push descriptor limits that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDevicePushDescriptorPropertiesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPushDescriptor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevicePushDescriptorPropertiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #maxPushDescriptors};
 * }</code></pre>
 */
public class VkPhysicalDevicePushDescriptorPropertiesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXPUSHDESCRIPTORS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXPUSHDESCRIPTORS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDevicePushDescriptorPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePushDescriptorPropertiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the maximum number of descriptors that <b>can</b> be used in a descriptor set created with {@link KHRPushDescriptor#VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR} set. */
    @NativeType("uint32_t")
    public int maxPushDescriptors() { return nmaxPushDescriptors(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDevicePushDescriptorPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPushDescriptor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDevicePushDescriptorPropertiesKHR sType$Default() { return sType(KHRPushDescriptor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDevicePushDescriptorPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePushDescriptorPropertiesKHR set(
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
    public VkPhysicalDevicePushDescriptorPropertiesKHR set(VkPhysicalDevicePushDescriptorPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePushDescriptorPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePushDescriptorPropertiesKHR malloc() {
        return wrap(VkPhysicalDevicePushDescriptorPropertiesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevicePushDescriptorPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePushDescriptorPropertiesKHR calloc() {
        return wrap(VkPhysicalDevicePushDescriptorPropertiesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevicePushDescriptorPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePushDescriptorPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDevicePushDescriptorPropertiesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePushDescriptorPropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDevicePushDescriptorPropertiesKHR create(long address) {
        return wrap(VkPhysicalDevicePushDescriptorPropertiesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePushDescriptorPropertiesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDevicePushDescriptorPropertiesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePushDescriptorPropertiesKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePushDescriptorPropertiesKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePushDescriptorPropertiesKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePushDescriptorPropertiesKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDevicePushDescriptorPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePushDescriptorPropertiesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDevicePushDescriptorPropertiesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDevicePushDescriptorPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePushDescriptorPropertiesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDevicePushDescriptorPropertiesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePushDescriptorPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePushDescriptorPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #maxPushDescriptors}. */
    public static int nmaxPushDescriptors(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePushDescriptorPropertiesKHR.MAXPUSHDESCRIPTORS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePushDescriptorPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePushDescriptorPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePushDescriptorPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePushDescriptorPropertiesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePushDescriptorPropertiesKHR ELEMENT_FACTORY = VkPhysicalDevicePushDescriptorPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePushDescriptorPropertiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDevicePushDescriptorPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDevicePushDescriptorPropertiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePushDescriptorPropertiesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDevicePushDescriptorPropertiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePushDescriptorPropertiesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDevicePushDescriptorPropertiesKHR#maxPushDescriptors} field. */
        @NativeType("uint32_t")
        public int maxPushDescriptors() { return VkPhysicalDevicePushDescriptorPropertiesKHR.nmaxPushDescriptors(address()); }

        /** Sets the specified value to the {@link VkPhysicalDevicePushDescriptorPropertiesKHR#sType} field. */
        public VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePushDescriptorPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPushDescriptor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR} value to the {@link VkPhysicalDevicePushDescriptorPropertiesKHR#sType} field. */
        public VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer sType$Default() { return sType(KHRPushDescriptor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDevicePushDescriptorPropertiesKHR#pNext} field. */
        public VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePushDescriptorPropertiesKHR.npNext(address(), value); return this; }

    }

}