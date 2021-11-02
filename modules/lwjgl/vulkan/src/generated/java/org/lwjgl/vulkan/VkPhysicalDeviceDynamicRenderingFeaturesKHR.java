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
 * Structure indicating support for dynamic render pass instances.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRDynamicRendering#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDynamicRenderingFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 {@link #dynamicRendering};
 * }</code></pre>
 */
public class VkPhysicalDeviceDynamicRenderingFeaturesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DYNAMICRENDERING;

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
        DYNAMICRENDERING = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDynamicRenderingFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDynamicRenderingFeaturesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** specifies that the implementation supports dynamic render pass instances using the {@link KHRDynamicRendering#vkCmdBeginRenderingKHR CmdBeginRenderingKHR} command. */
    @NativeType("VkBool32")
    public boolean dynamicRendering() { return ndynamicRendering(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDynamicRenderingFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDynamicRendering#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceDynamicRenderingFeaturesKHR sType$Default() { return sType(KHRDynamicRendering.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDynamicRenderingFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #dynamicRendering} field. */
    public VkPhysicalDeviceDynamicRenderingFeaturesKHR dynamicRendering(@NativeType("VkBool32") boolean value) { ndynamicRendering(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDynamicRenderingFeaturesKHR set(
        int sType,
        long pNext,
        boolean dynamicRendering
    ) {
        sType(sType);
        pNext(pNext);
        dynamicRendering(dynamicRendering);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDynamicRenderingFeaturesKHR set(VkPhysicalDeviceDynamicRenderingFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDynamicRenderingFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceDynamicRenderingFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDynamicRenderingFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceDynamicRenderingFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDynamicRenderingFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceDynamicRenderingFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDynamicRenderingFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceDynamicRenderingFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceDynamicRenderingFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code VkPhysicalDeviceDynamicRenderingFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDynamicRenderingFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDynamicRenderingFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDynamicRenderingFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDynamicRenderingFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDynamicRenderingFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #dynamicRendering}. */
    public static int ndynamicRendering(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDynamicRenderingFeaturesKHR.DYNAMICRENDERING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDynamicRenderingFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDynamicRenderingFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #dynamicRendering(boolean) dynamicRendering}. */
    public static void ndynamicRendering(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDynamicRenderingFeaturesKHR.DYNAMICRENDERING, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDynamicRenderingFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDynamicRenderingFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceDynamicRenderingFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceDynamicRenderingFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDynamicRenderingFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDynamicRenderingFeaturesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR#dynamicRendering} field. */
        @NativeType("VkBool32")
        public boolean dynamicRendering() { return VkPhysicalDeviceDynamicRenderingFeaturesKHR.ndynamicRendering(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDynamicRenderingFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDynamicRendering#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer sType$Default() { return sType(KHRDynamicRendering.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDynamicRenderingFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDynamicRenderingFeaturesKHR#dynamicRendering} field. */
        public VkPhysicalDeviceDynamicRenderingFeaturesKHR.Buffer dynamicRendering(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDynamicRenderingFeaturesKHR.ndynamicRendering(address(), value ? 1 : 0); return this; }

    }

}