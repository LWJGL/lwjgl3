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
 * Structure specifying physical device properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@code pNext} chain of this structure is used to extend the structure with properties defined by extensions.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT}, {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT}, {@link VkPhysicalDeviceCooperativeMatrixPropertiesNV}, {@link VkPhysicalDeviceDepthStencilResolveProperties}, {@link VkPhysicalDeviceDescriptorIndexingProperties}, {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT}, {@link VkPhysicalDeviceDriverProperties}, {@link VkPhysicalDeviceExternalMemoryHostPropertiesEXT}, {@link VkPhysicalDeviceFloatControlsProperties}, {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT}, {@link VkPhysicalDeviceIDProperties}, {@link VkPhysicalDeviceInlineUniformBlockPropertiesEXT}, {@link VkPhysicalDeviceLineRasterizationPropertiesEXT}, {@link VkPhysicalDeviceMaintenance3Properties}, {@link VkPhysicalDeviceMeshShaderPropertiesNV}, {@link VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX}, {@link VkPhysicalDeviceMultiviewProperties}, {@link VkPhysicalDevicePCIBusInfoPropertiesEXT}, {@link VkPhysicalDevicePerformanceQueryPropertiesKHR}, {@link VkPhysicalDevicePointClippingProperties}, {@link VkPhysicalDeviceProtectedMemoryProperties}, {@link VkPhysicalDevicePushDescriptorPropertiesKHR}, {@link VkPhysicalDeviceRayTracingPropertiesNV}, {@link VkPhysicalDeviceSampleLocationsPropertiesEXT}, {@link VkPhysicalDeviceSamplerFilterMinmaxProperties}, {@link VkPhysicalDeviceShaderCoreProperties2AMD}, {@link VkPhysicalDeviceShaderCorePropertiesAMD}, {@link VkPhysicalDeviceShaderSMBuiltinsPropertiesNV}, {@link VkPhysicalDeviceShadingRateImagePropertiesNV}, {@link VkPhysicalDeviceSubgroupProperties}, {@link VkPhysicalDeviceSubgroupSizeControlPropertiesEXT}, {@link VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT}, {@link VkPhysicalDeviceTimelineSemaphoreProperties}, {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}, {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT}, {@link VkPhysicalDeviceVulkan11Properties}, or {@link VkPhysicalDeviceVulkan12Properties}</li>
 * <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPhysicalDeviceProperties}, {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceProperties2KHR GetPhysicalDeviceProperties2KHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code properties} &ndash; a {@link VkPhysicalDeviceProperties} structure describing properties of the physical device. This structure is written with the same values as if it were written by {@link VK10#vkGetPhysicalDeviceProperties GetPhysicalDeviceProperties}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceProperties2 {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkPhysicalDeviceProperties VkPhysicalDeviceProperties} properties;
 * }</code></pre>
 */
public class VkPhysicalDeviceProperties2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PROPERTIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkPhysicalDeviceProperties.SIZEOF, VkPhysicalDeviceProperties.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PROPERTIES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceProperties2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceProperties2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns a {@link VkPhysicalDeviceProperties} view of the {@code properties} field. */
    public VkPhysicalDeviceProperties properties() { return nproperties(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceProperties2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceProperties2 pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceProperties2 set(
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
    public VkPhysicalDeviceProperties2 set(VkPhysicalDeviceProperties2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceProperties2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceProperties2 malloc() {
        return wrap(VkPhysicalDeviceProperties2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceProperties2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceProperties2 calloc() {
        return wrap(VkPhysicalDeviceProperties2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceProperties2} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceProperties2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceProperties2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceProperties2} instance for the specified memory address. */
    public static VkPhysicalDeviceProperties2 create(long address) {
        return wrap(VkPhysicalDeviceProperties2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceProperties2 createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceProperties2.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceProperties2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceProperties2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceProperties2} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceProperties2 mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceProperties2} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceProperties2 callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceProperties2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceProperties2 mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceProperties2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceProperties2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceProperties2 callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceProperties2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties2.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties2.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties2.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties2.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties2.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties2.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceProperties2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceProperties2.PNEXT); }
    /** Unsafe version of {@link #properties}. */
    public static VkPhysicalDeviceProperties nproperties(long struct) { return VkPhysicalDeviceProperties.create(struct + VkPhysicalDeviceProperties2.PROPERTIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceProperties2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceProperties2.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceProperties2} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceProperties2, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceProperties2 ELEMENT_FACTORY = VkPhysicalDeviceProperties2.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceProperties2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceProperties2#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceProperties2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceProperties2.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceProperties2.npNext(address()); }
        /** Returns a {@link VkPhysicalDeviceProperties} view of the {@code properties} field. */
        public VkPhysicalDeviceProperties properties() { return VkPhysicalDeviceProperties2.nproperties(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceProperties2.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceProperties2.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceProperties2.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceProperties2.npNext(address(), value); return this; }

    }

}