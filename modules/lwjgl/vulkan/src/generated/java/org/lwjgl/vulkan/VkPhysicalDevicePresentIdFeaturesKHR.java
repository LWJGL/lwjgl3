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
 * Structure indicating support for present id.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDevicePresentIdFeaturesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDevicePresentIdFeaturesKHR} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPresentId#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevicePresentIdFeaturesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #presentId};
 * }</code></pre>
 */
public class VkPhysicalDevicePresentIdFeaturesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTID;

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
        PRESENTID = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDevicePresentIdFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePresentIdFeaturesKHR(ByteBuffer container) {
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
    /** indicates that the implementation supports specifying present ID values in the {@link VkPresentIdKHR} extension to the {@link VkPresentInfoKHR} struct. */
    @NativeType("VkBool32")
    public boolean presentId() { return npresentId(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDevicePresentIdFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPresentId#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_FEATURES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDevicePresentIdFeaturesKHR sType$Default() { return sType(KHRPresentId.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_FEATURES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDevicePresentIdFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #presentId} field. */
    public VkPhysicalDevicePresentIdFeaturesKHR presentId(@NativeType("VkBool32") boolean value) { npresentId(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePresentIdFeaturesKHR set(
        int sType,
        long pNext,
        boolean presentId
    ) {
        sType(sType);
        pNext(pNext);
        presentId(presentId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePresentIdFeaturesKHR set(VkPhysicalDevicePresentIdFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePresentIdFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePresentIdFeaturesKHR malloc() {
        return wrap(VkPhysicalDevicePresentIdFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevicePresentIdFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePresentIdFeaturesKHR calloc() {
        return wrap(VkPhysicalDevicePresentIdFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevicePresentIdFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePresentIdFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDevicePresentIdFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePresentIdFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDevicePresentIdFeaturesKHR create(long address) {
        return wrap(VkPhysicalDevicePresentIdFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePresentIdFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDevicePresentIdFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentIdFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentIdFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentIdFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentIdFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentIdFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentIdFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDevicePresentIdFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentIdFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePresentIdFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePresentIdFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePresentIdFeaturesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDevicePresentIdFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDevicePresentIdFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePresentIdFeaturesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDevicePresentIdFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentIdFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentIdFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentIdFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentIdFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePresentIdFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePresentIdFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #presentId}. */
    public static int npresentId(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePresentIdFeaturesKHR.PRESENTID); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePresentIdFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePresentIdFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #presentId(boolean) presentId}. */
    public static void npresentId(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePresentIdFeaturesKHR.PRESENTID, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePresentIdFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePresentIdFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePresentIdFeaturesKHR ELEMENT_FACTORY = VkPhysicalDevicePresentIdFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePresentIdFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePresentIdFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDevicePresentIdFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDevicePresentIdFeaturesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePresentIdFeaturesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDevicePresentIdFeaturesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePresentIdFeaturesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDevicePresentIdFeaturesKHR#presentId} field. */
        @NativeType("VkBool32")
        public boolean presentId() { return VkPhysicalDevicePresentIdFeaturesKHR.npresentId(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDevicePresentIdFeaturesKHR#sType} field. */
        public VkPhysicalDevicePresentIdFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePresentIdFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPresentId#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_FEATURES_KHR} value to the {@link VkPhysicalDevicePresentIdFeaturesKHR#sType} field. */
        public VkPhysicalDevicePresentIdFeaturesKHR.Buffer sType$Default() { return sType(KHRPresentId.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_FEATURES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDevicePresentIdFeaturesKHR#pNext} field. */
        public VkPhysicalDevicePresentIdFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePresentIdFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevicePresentIdFeaturesKHR#presentId} field. */
        public VkPhysicalDevicePresentIdFeaturesKHR.Buffer presentId(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePresentIdFeaturesKHR.npresentId(address(), value ? 1 : 0); return this; }

    }

}