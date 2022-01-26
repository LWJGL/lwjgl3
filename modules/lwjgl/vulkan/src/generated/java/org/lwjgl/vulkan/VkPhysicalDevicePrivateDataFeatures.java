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
 * Structure specifying physical device support.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDevicePrivateDataFeatures} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDevicePrivateDataFeatures} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevicePrivateDataFeatures {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #privateData};
 * }</code></pre>
 */
public class VkPhysicalDevicePrivateDataFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRIVATEDATA;

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
        PRIVATEDATA = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDevicePrivateDataFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePrivateDataFeatures(ByteBuffer container) {
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
    /** indicates whether the implementation supports private data. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#private-data">Private Data</a>. */
    @NativeType("VkBool32")
    public boolean privateData() { return nprivateData(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDevicePrivateDataFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDevicePrivateDataFeatures sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDevicePrivateDataFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #privateData} field. */
    public VkPhysicalDevicePrivateDataFeatures privateData(@NativeType("VkBool32") boolean value) { nprivateData(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePrivateDataFeatures set(
        int sType,
        long pNext,
        boolean privateData
    ) {
        sType(sType);
        pNext(pNext);
        privateData(privateData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePrivateDataFeatures set(VkPhysicalDevicePrivateDataFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePrivateDataFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePrivateDataFeatures malloc() {
        return wrap(VkPhysicalDevicePrivateDataFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevicePrivateDataFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePrivateDataFeatures calloc() {
        return wrap(VkPhysicalDevicePrivateDataFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevicePrivateDataFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePrivateDataFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDevicePrivateDataFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePrivateDataFeatures} instance for the specified memory address. */
    public static VkPhysicalDevicePrivateDataFeatures create(long address) {
        return wrap(VkPhysicalDevicePrivateDataFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePrivateDataFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDevicePrivateDataFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrivateDataFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrivateDataFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrivateDataFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrivateDataFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrivateDataFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrivateDataFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDevicePrivateDataFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrivateDataFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePrivateDataFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePrivateDataFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePrivateDataFeatures malloc(MemoryStack stack) {
        return wrap(VkPhysicalDevicePrivateDataFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDevicePrivateDataFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePrivateDataFeatures calloc(MemoryStack stack) {
        return wrap(VkPhysicalDevicePrivateDataFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrivateDataFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrivateDataFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrivateDataFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrivateDataFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePrivateDataFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePrivateDataFeatures.PNEXT); }
    /** Unsafe version of {@link #privateData}. */
    public static int nprivateData(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePrivateDataFeatures.PRIVATEDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePrivateDataFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePrivateDataFeatures.PNEXT, value); }
    /** Unsafe version of {@link #privateData(boolean) privateData}. */
    public static void nprivateData(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePrivateDataFeatures.PRIVATEDATA, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePrivateDataFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePrivateDataFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePrivateDataFeatures ELEMENT_FACTORY = VkPhysicalDevicePrivateDataFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePrivateDataFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePrivateDataFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDevicePrivateDataFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDevicePrivateDataFeatures#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePrivateDataFeatures.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDevicePrivateDataFeatures#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePrivateDataFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDevicePrivateDataFeatures#privateData} field. */
        @NativeType("VkBool32")
        public boolean privateData() { return VkPhysicalDevicePrivateDataFeatures.nprivateData(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDevicePrivateDataFeatures#sType} field. */
        public VkPhysicalDevicePrivateDataFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePrivateDataFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES} value to the {@link VkPhysicalDevicePrivateDataFeatures#sType} field. */
        public VkPhysicalDevicePrivateDataFeatures.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDevicePrivateDataFeatures#pNext} field. */
        public VkPhysicalDevicePrivateDataFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePrivateDataFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevicePrivateDataFeatures#privateData} field. */
        public VkPhysicalDevicePrivateDataFeatures.Buffer privateData(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePrivateDataFeatures.nprivateData(address(), value ? 1 : 0); return this; }

    }

}