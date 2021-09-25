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
 * Structure describing whether device coherent memory can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link AMDDeviceCoherentMemory#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES_AMD STRUCTURE_TYPE_PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES_AMD}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceCoherentMemoryFeaturesAMD {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #deviceCoherentMemory};
 * }</code></pre>
 */
public class VkPhysicalDeviceCoherentMemoryFeaturesAMD extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICECOHERENTMEMORY;

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
        DEVICECOHERENTMEMORY = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCoherentMemoryFeaturesAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD(ByteBuffer container) {
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
    /** indicates that the implementation supports device coherent memory ({@code VkMemoryPropertyFlagBits}). */
    @NativeType("VkBool32")
    public boolean deviceCoherentMemory() { return ndeviceCoherentMemory(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDDeviceCoherentMemory#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES_AMD STRUCTURE_TYPE_PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES_AMD} value to the {@link #sType} field. */
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD sType$Default() { return sType(AMDDeviceCoherentMemory.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES_AMD); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #deviceCoherentMemory} field. */
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD deviceCoherentMemory(@NativeType("VkBool32") boolean value) { ndeviceCoherentMemory(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD set(
        int sType,
        long pNext,
        boolean deviceCoherentMemory
    ) {
        sType(sType);
        pNext(pNext);
        deviceCoherentMemory(deviceCoherentMemory);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceCoherentMemoryFeaturesAMD set(VkPhysicalDeviceCoherentMemoryFeaturesAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCoherentMemoryFeaturesAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD malloc() {
        return wrap(VkPhysicalDeviceCoherentMemoryFeaturesAMD.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceCoherentMemoryFeaturesAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD calloc() {
        return wrap(VkPhysicalDeviceCoherentMemoryFeaturesAMD.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceCoherentMemoryFeaturesAMD} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceCoherentMemoryFeaturesAMD.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCoherentMemoryFeaturesAMD} instance for the specified memory address. */
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD create(long address) {
        return wrap(VkPhysicalDeviceCoherentMemoryFeaturesAMD.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceCoherentMemoryFeaturesAMD.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCoherentMemoryFeaturesAMD mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCoherentMemoryFeaturesAMD callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCoherentMemoryFeaturesAMD mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCoherentMemoryFeaturesAMD callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceCoherentMemoryFeaturesAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceCoherentMemoryFeaturesAMD.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCoherentMemoryFeaturesAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceCoherentMemoryFeaturesAMD.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceCoherentMemoryFeaturesAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCoherentMemoryFeaturesAMD.PNEXT); }
    /** Unsafe version of {@link #deviceCoherentMemory}. */
    public static int ndeviceCoherentMemory(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceCoherentMemoryFeaturesAMD.DEVICECOHERENTMEMORY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceCoherentMemoryFeaturesAMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCoherentMemoryFeaturesAMD.PNEXT, value); }
    /** Unsafe version of {@link #deviceCoherentMemory(boolean) deviceCoherentMemory}. */
    public static void ndeviceCoherentMemory(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceCoherentMemoryFeaturesAMD.DEVICECOHERENTMEMORY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCoherentMemoryFeaturesAMD, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCoherentMemoryFeaturesAMD ELEMENT_FACTORY = VkPhysicalDeviceCoherentMemoryFeaturesAMD.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceCoherentMemoryFeaturesAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCoherentMemoryFeaturesAMD.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCoherentMemoryFeaturesAMD.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD#deviceCoherentMemory} field. */
        @NativeType("VkBool32")
        public boolean deviceCoherentMemory() { return VkPhysicalDeviceCoherentMemoryFeaturesAMD.ndeviceCoherentMemory(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD#sType} field. */
        public VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCoherentMemoryFeaturesAMD.nsType(address(), value); return this; }
        /** Sets the {@link AMDDeviceCoherentMemory#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES_AMD STRUCTURE_TYPE_PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES_AMD} value to the {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD#sType} field. */
        public VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer sType$Default() { return sType(AMDDeviceCoherentMemory.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COHERENT_MEMORY_FEATURES_AMD); }
        /** Sets the specified value to the {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD#pNext} field. */
        public VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCoherentMemoryFeaturesAMD.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceCoherentMemoryFeaturesAMD#deviceCoherentMemory} field. */
        public VkPhysicalDeviceCoherentMemoryFeaturesAMD.Buffer deviceCoherentMemory(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCoherentMemoryFeaturesAMD.ndeviceCoherentMemory(address(), value ? 1 : 0); return this; }

    }

}