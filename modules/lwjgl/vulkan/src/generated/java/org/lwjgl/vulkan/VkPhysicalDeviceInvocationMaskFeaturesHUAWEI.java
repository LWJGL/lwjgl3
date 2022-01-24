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
 * Structure describing invocation mask features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link HUAWEIInvocationMask#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INVOCATION_MASK_FEATURES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_INVOCATION_MASK_FEATURES_HUAWEI}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceInvocationMaskFeaturesHUAWEI {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #invocationMask};
 * }</code></pre>
 */
public class VkPhysicalDeviceInvocationMaskFeaturesHUAWEI extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        INVOCATIONMASK;

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
        INVOCATIONMASK = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceInvocationMaskFeaturesHUAWEI} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI(ByteBuffer container) {
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
    /** indicates that the implementation supports the use of an invocation mask image to optimize the ray dispatch. */
    @NativeType("VkBool32")
    public boolean invocationMask() { return ninvocationMask(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link HUAWEIInvocationMask#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INVOCATION_MASK_FEATURES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_INVOCATION_MASK_FEATURES_HUAWEI} value to the {@link #sType} field. */
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI sType$Default() { return sType(HUAWEIInvocationMask.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INVOCATION_MASK_FEATURES_HUAWEI); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #invocationMask} field. */
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI invocationMask(@NativeType("VkBool32") boolean value) { ninvocationMask(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI set(
        int sType,
        long pNext,
        boolean invocationMask
    ) {
        sType(sType);
        pNext(pNext);
        invocationMask(invocationMask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI set(VkPhysicalDeviceInvocationMaskFeaturesHUAWEI src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceInvocationMaskFeaturesHUAWEI} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI malloc() {
        return wrap(VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceInvocationMaskFeaturesHUAWEI} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI calloc() {
        return wrap(VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceInvocationMaskFeaturesHUAWEI} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceInvocationMaskFeaturesHUAWEI} instance for the specified memory address. */
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI create(long address) {
        return wrap(VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceInvocationMaskFeaturesHUAWEI} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceInvocationMaskFeaturesHUAWEI} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.PNEXT); }
    /** Unsafe version of {@link #invocationMask}. */
    public static int ninvocationMask(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.INVOCATIONMASK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.PNEXT, value); }
    /** Unsafe version of {@link #invocationMask(boolean) invocationMask}. */
    public static void ninvocationMask(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.INVOCATIONMASK, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceInvocationMaskFeaturesHUAWEI, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceInvocationMaskFeaturesHUAWEI ELEMENT_FACTORY = VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceInvocationMaskFeaturesHUAWEI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI#invocationMask} field. */
        @NativeType("VkBool32")
        public boolean invocationMask() { return VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.ninvocationMask(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI#sType} field. */
        public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.nsType(address(), value); return this; }
        /** Sets the {@link HUAWEIInvocationMask#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INVOCATION_MASK_FEATURES_HUAWEI STRUCTURE_TYPE_PHYSICAL_DEVICE_INVOCATION_MASK_FEATURES_HUAWEI} value to the {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI#sType} field. */
        public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.Buffer sType$Default() { return sType(HUAWEIInvocationMask.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INVOCATION_MASK_FEATURES_HUAWEI); }
        /** Sets the specified value to the {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI#pNext} field. */
        public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceInvocationMaskFeaturesHUAWEI#invocationMask} field. */
        public VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.Buffer invocationMask(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceInvocationMaskFeaturesHUAWEI.ninvocationMask(address(), value ? 1 : 0); return this; }

    }

}