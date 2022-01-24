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
 * Structure indicating support for present wait.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDevicePresentWaitFeaturesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDevicePresentWaitFeaturesKHR} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPresentWait#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevicePresentWaitFeaturesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #presentWait};
 * }</code></pre>
 */
public class VkPhysicalDevicePresentWaitFeaturesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTWAIT;

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
        PRESENTWAIT = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDevicePresentWaitFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePresentWaitFeaturesKHR(ByteBuffer container) {
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
    /** indicates that the implementation supports {@code vkWaitForPresentKHR}. */
    @NativeType("VkBool32")
    public boolean presentWait() { return npresentWait(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDevicePresentWaitFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPresentWait#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_FEATURES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDevicePresentWaitFeaturesKHR sType$Default() { return sType(KHRPresentWait.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_FEATURES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDevicePresentWaitFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #presentWait} field. */
    public VkPhysicalDevicePresentWaitFeaturesKHR presentWait(@NativeType("VkBool32") boolean value) { npresentWait(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePresentWaitFeaturesKHR set(
        int sType,
        long pNext,
        boolean presentWait
    ) {
        sType(sType);
        pNext(pNext);
        presentWait(presentWait);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePresentWaitFeaturesKHR set(VkPhysicalDevicePresentWaitFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePresentWaitFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePresentWaitFeaturesKHR malloc() {
        return wrap(VkPhysicalDevicePresentWaitFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevicePresentWaitFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePresentWaitFeaturesKHR calloc() {
        return wrap(VkPhysicalDevicePresentWaitFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevicePresentWaitFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePresentWaitFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDevicePresentWaitFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePresentWaitFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDevicePresentWaitFeaturesKHR create(long address) {
        return wrap(VkPhysicalDevicePresentWaitFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePresentWaitFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDevicePresentWaitFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentWaitFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentWaitFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentWaitFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentWaitFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentWaitFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentWaitFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDevicePresentWaitFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentWaitFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePresentWaitFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePresentWaitFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePresentWaitFeaturesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDevicePresentWaitFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDevicePresentWaitFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePresentWaitFeaturesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDevicePresentWaitFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentWaitFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentWaitFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePresentWaitFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePresentWaitFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePresentWaitFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePresentWaitFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #presentWait}. */
    public static int npresentWait(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePresentWaitFeaturesKHR.PRESENTWAIT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePresentWaitFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePresentWaitFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #presentWait(boolean) presentWait}. */
    public static void npresentWait(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePresentWaitFeaturesKHR.PRESENTWAIT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePresentWaitFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePresentWaitFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePresentWaitFeaturesKHR ELEMENT_FACTORY = VkPhysicalDevicePresentWaitFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePresentWaitFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePresentWaitFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDevicePresentWaitFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDevicePresentWaitFeaturesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePresentWaitFeaturesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDevicePresentWaitFeaturesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePresentWaitFeaturesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDevicePresentWaitFeaturesKHR#presentWait} field. */
        @NativeType("VkBool32")
        public boolean presentWait() { return VkPhysicalDevicePresentWaitFeaturesKHR.npresentWait(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDevicePresentWaitFeaturesKHR#sType} field. */
        public VkPhysicalDevicePresentWaitFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePresentWaitFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPresentWait#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_FEATURES_KHR} value to the {@link VkPhysicalDevicePresentWaitFeaturesKHR#sType} field. */
        public VkPhysicalDevicePresentWaitFeaturesKHR.Buffer sType$Default() { return sType(KHRPresentWait.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_FEATURES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDevicePresentWaitFeaturesKHR#pNext} field. */
        public VkPhysicalDevicePresentWaitFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePresentWaitFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevicePresentWaitFeaturesKHR#presentWait} field. */
        public VkPhysicalDevicePresentWaitFeaturesKHR.Buffer presentWait(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePresentWaitFeaturesKHR.npresentWait(address(), value ? 1 : 0); return this; }

    }

}