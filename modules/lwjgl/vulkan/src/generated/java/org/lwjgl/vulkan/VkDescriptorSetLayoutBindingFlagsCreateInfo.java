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
 * Structure specifying creation flags for descriptor set layout bindings.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code bindingCount} is zero or if this structure is not included in the {@code pNext} chain, the {@code VkDescriptorBindingFlags} for each descriptor set layout binding is considered to be zero. Otherwise, the descriptor set layout binding at {@link VkDescriptorSetLayoutCreateInfo}{@code ::pBindings}[i] uses the flags in {@code pBindingFlags}[i].</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code bindingCount} is not zero, {@code bindingCount} <b>must</b> equal {@link VkDescriptorSetLayoutCreateInfo}{@code ::bindingCount}</li>
 * <li>If {@link VkDescriptorSetLayoutCreateInfo}{@code ::flags} includes {@link KHRPushDescriptor#VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR}, then all elements of {@code pBindingFlags} <b>must</b> not include {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT}, {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT}, or {@link VK12#VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT}</li>
 * <li>If an element of {@code pBindingFlags} includes {@link VK12#VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT}, then all other elements of {@link VkDescriptorSetLayoutCreateInfo}{@code ::pBindings} <b>must</b> have a smaller value of {@code binding}</li>
 * <li>If {@link VkPhysicalDeviceDescriptorIndexingFeatures}{@code ::descriptorBindingUniformBufferUpdateAfterBind} is not enabled, all bindings with descriptor type {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} <b>must</b> not use {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT}</li>
 * <li>If {@link VkPhysicalDeviceDescriptorIndexingFeatures}{@code ::descriptorBindingSampledImageUpdateAfterBind} is not enabled, all bindings with descriptor type {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, or {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE} <b>must</b> not use {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT}</li>
 * <li>If {@link VkPhysicalDeviceDescriptorIndexingFeatures}{@code ::descriptorBindingStorageImageUpdateAfterBind} is not enabled, all bindings with descriptor type {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE} <b>must</b> not use {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT}</li>
 * <li>If {@link VkPhysicalDeviceDescriptorIndexingFeatures}{@code ::descriptorBindingStorageBufferUpdateAfterBind} is not enabled, all bindings with descriptor type {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} <b>must</b> not use {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT}</li>
 * <li>If {@link VkPhysicalDeviceDescriptorIndexingFeatures}{@code ::descriptorBindingUniformTexelBufferUpdateAfterBind} is not enabled, all bindings with descriptor type {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} <b>must</b> not use {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT}</li>
 * <li>If {@link VkPhysicalDeviceDescriptorIndexingFeatures}{@code ::descriptorBindingStorageTexelBufferUpdateAfterBind} is not enabled, all bindings with descriptor type {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} <b>must</b> not use {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT}</li>
 * <li>If {@link VkPhysicalDeviceInlineUniformBlockFeatures}{@code ::descriptorBindingInlineUniformBlockUpdateAfterBind} is not enabled, all bindings with descriptor type {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} <b>must</b> not use {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT}</li>
 * <li>If {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR}{@code ::descriptorBindingAccelerationStructureUpdateAfterBind} is not enabled, all bindings with descriptor type {@link KHRAccelerationStructure#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR} or {@link NVRayTracing#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV} <b>must</b> not use {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT}</li>
 * <li>All bindings with descriptor type {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}, {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}, or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} <b>must</b> not use {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT}</li>
 * <li>If {@link VkPhysicalDeviceDescriptorIndexingFeatures}{@code ::descriptorBindingUpdateUnusedWhilePending} is not enabled, all elements of {@code pBindingFlags} <b>must</b> not include {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT}</li>
 * <li>If {@link VkPhysicalDeviceDescriptorIndexingFeatures}{@code ::descriptorBindingPartiallyBound} is not enabled, all elements of {@code pBindingFlags} <b>must</b> not include {@link VK12#VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT}</li>
 * <li>If {@link VkPhysicalDeviceDescriptorIndexingFeatures}{@code ::descriptorBindingVariableDescriptorCount} is not enabled, all elements of {@code pBindingFlags} <b>must</b> not include {@link VK12#VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT}</li>
 * <li>If an element of {@code pBindingFlags} includes {@link VK12#VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT}, that element’s {@code descriptorType} <b>must</b> not be {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO}</li>
 * <li>If {@code bindingCount} is not 0, {@code pBindingFlags} <b>must</b> be a valid pointer to an array of {@code bindingCount} valid combinations of {@code VkDescriptorBindingFlagBits} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorSetLayoutBindingFlagsCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #bindingCount};
 *     VkDescriptorBindingFlags const * {@link #pBindingFlags};
 * }</code></pre>
 */
public class VkDescriptorSetLayoutBindingFlagsCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BINDINGCOUNT,
        PBINDINGFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BINDINGCOUNT = layout.offsetof(2);
        PBINDINGFLAGS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkDescriptorSetLayoutBindingFlagsCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetLayoutBindingFlagsCreateInfo(ByteBuffer container) {
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
    /** zero or the number of elements in {@code pBindingFlags}. */
    @NativeType("uint32_t")
    public int bindingCount() { return nbindingCount(address()); }
    /** a pointer to an array of {@code VkDescriptorBindingFlags} bitfields, one for each descriptor set layout binding. */
    @Nullable
    @NativeType("VkDescriptorBindingFlags const *")
    public IntBuffer pBindingFlags() { return npBindingFlags(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDescriptorSetLayoutBindingFlagsCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO} value to the {@link #sType} field. */
    public VkDescriptorSetLayoutBindingFlagsCreateInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDescriptorSetLayoutBindingFlagsCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #bindingCount} field. */
    public VkDescriptorSetLayoutBindingFlagsCreateInfo bindingCount(@NativeType("uint32_t") int value) { nbindingCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pBindingFlags} field. */
    public VkDescriptorSetLayoutBindingFlagsCreateInfo pBindingFlags(@Nullable @NativeType("VkDescriptorBindingFlags const *") IntBuffer value) { npBindingFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorSetLayoutBindingFlagsCreateInfo set(
        int sType,
        long pNext,
        int bindingCount,
        @Nullable IntBuffer pBindingFlags
    ) {
        sType(sType);
        pNext(pNext);
        bindingCount(bindingCount);
        pBindingFlags(pBindingFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorSetLayoutBindingFlagsCreateInfo set(VkDescriptorSetLayoutBindingFlagsCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo malloc() {
        return wrap(VkDescriptorSetLayoutBindingFlagsCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo calloc() {
        return wrap(VkDescriptorSetLayoutBindingFlagsCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDescriptorSetLayoutBindingFlagsCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfo} instance for the specified memory address. */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo create(long address) {
        return wrap(VkDescriptorSetLayoutBindingFlagsCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkDescriptorSetLayoutBindingFlagsCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo malloc(MemoryStack stack) {
        return wrap(VkDescriptorSetLayoutBindingFlagsCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo calloc(MemoryStack stack) {
        return wrap(VkDescriptorSetLayoutBindingFlagsCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorSetLayoutBindingFlagsCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorSetLayoutBindingFlagsCreateInfo.PNEXT); }
    /** Unsafe version of {@link #bindingCount}. */
    public static int nbindingCount(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorSetLayoutBindingFlagsCreateInfo.BINDINGCOUNT); }
    /** Unsafe version of {@link #pBindingFlags() pBindingFlags}. */
    @Nullable public static IntBuffer npBindingFlags(long struct) { return memIntBufferSafe(memGetAddress(struct + VkDescriptorSetLayoutBindingFlagsCreateInfo.PBINDINGFLAGS), nbindingCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorSetLayoutBindingFlagsCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorSetLayoutBindingFlagsCreateInfo.PNEXT, value); }
    /** Sets the specified value to the {@code bindingCount} field of the specified {@code struct}. */
    public static void nbindingCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorSetLayoutBindingFlagsCreateInfo.BINDINGCOUNT, value); }
    /** Unsafe version of {@link #pBindingFlags(IntBuffer) pBindingFlags}. */
    public static void npBindingFlags(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkDescriptorSetLayoutBindingFlagsCreateInfo.PBINDINGFLAGS, memAddressSafe(value)); if (value != null) { nbindingCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkDescriptorSetLayoutBindingFlagsCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorSetLayoutBindingFlagsCreateInfo, Buffer> implements NativeResource {

        private static final VkDescriptorSetLayoutBindingFlagsCreateInfo ELEMENT_FACTORY = VkDescriptorSetLayoutBindingFlagsCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetLayoutBindingFlagsCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorSetLayoutBindingFlagsCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDescriptorSetLayoutBindingFlagsCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorSetLayoutBindingFlagsCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkDescriptorSetLayoutBindingFlagsCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDescriptorSetLayoutBindingFlagsCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkDescriptorSetLayoutBindingFlagsCreateInfo#bindingCount} field. */
        @NativeType("uint32_t")
        public int bindingCount() { return VkDescriptorSetLayoutBindingFlagsCreateInfo.nbindingCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkDescriptorSetLayoutBindingFlagsCreateInfo#pBindingFlags} field. */
        @Nullable
        @NativeType("VkDescriptorBindingFlags const *")
        public IntBuffer pBindingFlags() { return VkDescriptorSetLayoutBindingFlagsCreateInfo.npBindingFlags(address()); }

        /** Sets the specified value to the {@link VkDescriptorSetLayoutBindingFlagsCreateInfo#sType} field. */
        public VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorSetLayoutBindingFlagsCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO} value to the {@link VkDescriptorSetLayoutBindingFlagsCreateInfo#sType} field. */
        public VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO); }
        /** Sets the specified value to the {@link VkDescriptorSetLayoutBindingFlagsCreateInfo#pNext} field. */
        public VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorSetLayoutBindingFlagsCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorSetLayoutBindingFlagsCreateInfo#bindingCount} field. */
        public VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer bindingCount(@NativeType("uint32_t") int value) { VkDescriptorSetLayoutBindingFlagsCreateInfo.nbindingCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkDescriptorSetLayoutBindingFlagsCreateInfo#pBindingFlags} field. */
        public VkDescriptorSetLayoutBindingFlagsCreateInfo.Buffer pBindingFlags(@Nullable @NativeType("VkDescriptorBindingFlags const *") IntBuffer value) { VkDescriptorSetLayoutBindingFlagsCreateInfo.npBindingFlags(address(), value); return this; }

    }

}