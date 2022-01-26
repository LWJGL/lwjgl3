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
 * Structure indicating support for variable rate fragment shading.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRFragmentShadingRate#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFragmentShadingRateFeaturesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #pipelineFragmentShadingRate};
 *     VkBool32 {@link #primitiveFragmentShadingRate};
 *     VkBool32 {@link #attachmentFragmentShadingRate};
 * }</code></pre>
 */
public class VkPhysicalDeviceFragmentShadingRateFeaturesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINEFRAGMENTSHADINGRATE,
        PRIMITIVEFRAGMENTSHADINGRATE,
        ATTACHMENTFRAGMENTSHADINGRATE;

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
        PIPELINEFRAGMENTSHADINGRATE = layout.offsetof(2);
        PRIMITIVEFRAGMENTSHADINGRATE = layout.offsetof(3);
        ATTACHMENTFRAGMENTSHADINGRATE = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentShadingRateFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR(ByteBuffer container) {
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
    /** indicates that the implementation supports the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-pipeline">pipeline fragment shading rate</a>. */
    @NativeType("VkBool32")
    public boolean pipelineFragmentShadingRate() { return npipelineFragmentShadingRate(address()) != 0; }
    /** indicates that the implementation supports the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-primitive">primitive fragment shading rate</a>. */
    @NativeType("VkBool32")
    public boolean primitiveFragmentShadingRate() { return nprimitiveFragmentShadingRate(address()) != 0; }
    /** indicates that the implementation supports the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-attachment">attachment fragment shading rate</a>. */
    @NativeType("VkBool32")
    public boolean attachmentFragmentShadingRate() { return nattachmentFragmentShadingRate(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRFragmentShadingRate#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR sType$Default() { return sType(KHRFragmentShadingRate.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #pipelineFragmentShadingRate} field. */
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR pipelineFragmentShadingRate(@NativeType("VkBool32") boolean value) { npipelineFragmentShadingRate(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #primitiveFragmentShadingRate} field. */
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR primitiveFragmentShadingRate(@NativeType("VkBool32") boolean value) { nprimitiveFragmentShadingRate(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #attachmentFragmentShadingRate} field. */
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR attachmentFragmentShadingRate(@NativeType("VkBool32") boolean value) { nattachmentFragmentShadingRate(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR set(
        int sType,
        long pNext,
        boolean pipelineFragmentShadingRate,
        boolean primitiveFragmentShadingRate,
        boolean attachmentFragmentShadingRate
    ) {
        sType(sType);
        pNext(pNext);
        pipelineFragmentShadingRate(pipelineFragmentShadingRate);
        primitiveFragmentShadingRate(primitiveFragmentShadingRate);
        attachmentFragmentShadingRate(attachmentFragmentShadingRate);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR set(VkPhysicalDeviceFragmentShadingRateFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceFragmentShadingRateFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceFragmentShadingRateFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceFragmentShadingRateFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShadingRateFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceFragmentShadingRateFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceFragmentShadingRateFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShadingRateFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentShadingRateFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShadingRateFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentShadingRateFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRateFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentShadingRateFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #pipelineFragmentShadingRate}. */
    public static int npipelineFragmentShadingRate(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRateFeaturesKHR.PIPELINEFRAGMENTSHADINGRATE); }
    /** Unsafe version of {@link #primitiveFragmentShadingRate}. */
    public static int nprimitiveFragmentShadingRate(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRateFeaturesKHR.PRIMITIVEFRAGMENTSHADINGRATE); }
    /** Unsafe version of {@link #attachmentFragmentShadingRate}. */
    public static int nattachmentFragmentShadingRate(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShadingRateFeaturesKHR.ATTACHMENTFRAGMENTSHADINGRATE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentShadingRateFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentShadingRateFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #pipelineFragmentShadingRate(boolean) pipelineFragmentShadingRate}. */
    public static void npipelineFragmentShadingRate(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentShadingRateFeaturesKHR.PIPELINEFRAGMENTSHADINGRATE, value); }
    /** Unsafe version of {@link #primitiveFragmentShadingRate(boolean) primitiveFragmentShadingRate}. */
    public static void nprimitiveFragmentShadingRate(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentShadingRateFeaturesKHR.PRIMITIVEFRAGMENTSHADINGRATE, value); }
    /** Unsafe version of {@link #attachmentFragmentShadingRate(boolean) attachmentFragmentShadingRate}. */
    public static void nattachmentFragmentShadingRate(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentShadingRateFeaturesKHR.ATTACHMENTFRAGMENTSHADINGRATE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentShadingRateFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentShadingRateFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceFragmentShadingRateFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentShadingRateFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceFragmentShadingRateFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR#pipelineFragmentShadingRate} field. */
        @NativeType("VkBool32")
        public boolean pipelineFragmentShadingRate() { return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.npipelineFragmentShadingRate(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR#primitiveFragmentShadingRate} field. */
        @NativeType("VkBool32")
        public boolean primitiveFragmentShadingRate() { return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.nprimitiveFragmentShadingRate(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR#attachmentFragmentShadingRate} field. */
        @NativeType("VkBool32")
        public boolean attachmentFragmentShadingRate() { return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.nattachmentFragmentShadingRate(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR#sType} field. */
        public VkPhysicalDeviceFragmentShadingRateFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRateFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRFragmentShadingRate#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR} value to the {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR#sType} field. */
        public VkPhysicalDeviceFragmentShadingRateFeaturesKHR.Buffer sType$Default() { return sType(KHRFragmentShadingRate.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR#pNext} field. */
        public VkPhysicalDeviceFragmentShadingRateFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentShadingRateFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR#pipelineFragmentShadingRate} field. */
        public VkPhysicalDeviceFragmentShadingRateFeaturesKHR.Buffer pipelineFragmentShadingRate(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentShadingRateFeaturesKHR.npipelineFragmentShadingRate(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR#primitiveFragmentShadingRate} field. */
        public VkPhysicalDeviceFragmentShadingRateFeaturesKHR.Buffer primitiveFragmentShadingRate(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentShadingRateFeaturesKHR.nprimitiveFragmentShadingRate(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShadingRateFeaturesKHR#attachmentFragmentShadingRate} field. */
        public VkPhysicalDeviceFragmentShadingRateFeaturesKHR.Buffer attachmentFragmentShadingRate(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentShadingRateFeaturesKHR.nattachmentFragmentShadingRate(address(), value ? 1 : 0); return this; }

    }

}