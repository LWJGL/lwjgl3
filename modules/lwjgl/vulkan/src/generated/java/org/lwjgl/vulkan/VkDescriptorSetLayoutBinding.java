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
 * Structure specifying a descriptor set layout binding.
 * 
 * <h5>Description</h5>
 * 
 * <p>The above layout definition allows the descriptor bindings to be specified sparsely such that not all binding numbers between 0 and the maximum binding number need to be specified in the {@code pBindings} array. Bindings that are not specified have a {@code descriptorCount} and {@code stageFlags} of zero, and the value of {@code descriptorType} is undefined. However, all binding numbers between 0 and the maximum binding number in the {@link VkDescriptorSetLayoutCreateInfo}{@code ::pBindings} array <b>may</b> consume memory in the descriptor set layout even if not all descriptor bindings are used, though it <b>should</b> not consume additional memory from the descriptor pool.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The maximum binding number specified <b>should</b> be as compact as possible to avoid wasted memory.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER} or {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, and {@code descriptorCount} is not 0 and {@code pImmutableSamplers} is not {@code NULL}, {@code pImmutableSamplers} <b>must</b> be a valid pointer to an array of {@code descriptorCount} valid {@code VkSampler} handles</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-inlineUniformBlock">inlineUniformBlock</a> feature is not enabled, {@code descriptorType} <b>must</b> not be {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK}</li>
 * <li>If {@code descriptorType} is {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} then {@code descriptorCount} <b>must</b> be a multiple of 4</li>
 * <li>If {@code descriptorType} is {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} then {@code descriptorCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceInlineUniformBlockProperties}{@code ::maxInlineUniformBlockSize}</li>
 * <li>If {@code descriptorCount} is not 0, {@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} and {@code descriptorCount} is not 0, then {@code stageFlags} <b>must</b> be 0 or {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}</li>
 * <li>The sampler objects indicated by {@code pImmutableSamplers} <b>must</b> not have a {@code borderColor} with one of the values {@link EXTCustomBorderColor#VK_BORDER_COLOR_FLOAT_CUSTOM_EXT BORDER_COLOR_FLOAT_CUSTOM_EXT} or {@link EXTCustomBorderColor#VK_BORDER_COLOR_INT_CUSTOM_EXT BORDER_COLOR_INT_CUSTOM_EXT}</li>
 * <li>If {@code descriptorType} is {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE}, then {@code pImmutableSamplers} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code descriptorType} <b>must</b> be a valid {@code VkDescriptorType} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDescriptorSetLayoutCreateInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorSetLayoutBinding {
 *     uint32_t {@link #binding};
 *     VkDescriptorType {@link #descriptorType};
 *     uint32_t {@link #descriptorCount};
 *     VkShaderStageFlags {@link #stageFlags};
 *     VkSampler const * {@link #pImmutableSamplers};
 * }</code></pre>
 */
public class VkDescriptorSetLayoutBinding extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BINDING,
        DESCRIPTORTYPE,
        DESCRIPTORCOUNT,
        STAGEFLAGS,
        PIMMUTABLESAMPLERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BINDING = layout.offsetof(0);
        DESCRIPTORTYPE = layout.offsetof(1);
        DESCRIPTORCOUNT = layout.offsetof(2);
        STAGEFLAGS = layout.offsetof(3);
        PIMMUTABLESAMPLERS = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkDescriptorSetLayoutBinding} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetLayoutBinding(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the binding number of this entry and corresponds to a resource of the same binding number in the shader stages. */
    @NativeType("uint32_t")
    public int binding() { return nbinding(address()); }
    /** a {@code VkDescriptorType} specifying which type of resource descriptors are used for this binding. */
    @NativeType("VkDescriptorType")
    public int descriptorType() { return ndescriptorType(address()); }
    /** the number of descriptors contained in the binding, accessed in a shader as an array, except if {@code descriptorType} is {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} in which case {@code descriptorCount} is the size in bytes of the inline uniform block. If {@code descriptorCount} is zero this binding entry is reserved and the resource <b>must</b> not be accessed from any stage via this binding within any pipeline using the set layout. */
    @NativeType("uint32_t")
    public int descriptorCount() { return ndescriptorCount(address()); }
    /**
     * member is a bitmask of {@code VkShaderStageFlagBits} specifying which pipeline shader stages <b>can</b> access a resource for this binding. {@link VK10#VK_SHADER_STAGE_ALL SHADER_STAGE_ALL} is a shorthand specifying that all defined shader stages, including any additional stages defined by extensions, <b>can</b> access the resource.
     * 
     * <p>If a shader stage is not included in {@code stageFlags}, then a resource <b>must</b> not be accessed from that stage via this binding within any pipeline using the set layout. Other than input attachments which are limited to the fragment shader, there are no limitations on what combinations of stages <b>can</b> use a descriptor binding, and in particular a binding <b>can</b> be used by both graphics stages and the compute stage.</p>
     */
    @NativeType("VkShaderStageFlags")
    public int stageFlags() { return nstageFlags(address()); }
    /** affects initialization of samplers. If {@code descriptorType} specifies a {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER} or {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} type descriptor, then {@code pImmutableSamplers} <b>can</b> be used to initialize a set of <em>immutable samplers</em>. Immutable samplers are permanently bound into the set layout and <b>must</b> not be changed; updating a {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER} descriptor with immutable samplers is not allowed and updates to a {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} descriptor with immutable samplers does not modify the samplers (the image views are updated, but the sampler updates are ignored). If {@code pImmutableSamplers} is not {@code NULL}, then it is a pointer to an array of sampler handles that will be copied into the set layout and used for the corresponding binding. Only the sampler handles are copied; the sampler objects <b>must</b> not be destroyed before the final use of the set layout and any descriptor pools and sets created using it. If {@code pImmutableSamplers} is {@code NULL}, then the sampler slots are dynamic and sampler handles <b>must</b> be bound into descriptor sets using this layout. If {@code descriptorType} is not one of these descriptor types, then {@code pImmutableSamplers} is ignored. */
    @Nullable
    @NativeType("VkSampler const *")
    public LongBuffer pImmutableSamplers() { return npImmutableSamplers(address()); }

    /** Sets the specified value to the {@link #binding} field. */
    public VkDescriptorSetLayoutBinding binding(@NativeType("uint32_t") int value) { nbinding(address(), value); return this; }
    /** Sets the specified value to the {@link #descriptorType} field. */
    public VkDescriptorSetLayoutBinding descriptorType(@NativeType("VkDescriptorType") int value) { ndescriptorType(address(), value); return this; }
    /** Sets the specified value to the {@link #descriptorCount} field. */
    public VkDescriptorSetLayoutBinding descriptorCount(@NativeType("uint32_t") int value) { ndescriptorCount(address(), value); return this; }
    /** Sets the specified value to the {@link #stageFlags} field. */
    public VkDescriptorSetLayoutBinding stageFlags(@NativeType("VkShaderStageFlags") int value) { nstageFlags(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pImmutableSamplers} field. */
    public VkDescriptorSetLayoutBinding pImmutableSamplers(@Nullable @NativeType("VkSampler const *") LongBuffer value) { npImmutableSamplers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorSetLayoutBinding set(
        int binding,
        int descriptorType,
        int descriptorCount,
        int stageFlags,
        @Nullable LongBuffer pImmutableSamplers
    ) {
        binding(binding);
        descriptorType(descriptorType);
        descriptorCount(descriptorCount);
        stageFlags(stageFlags);
        pImmutableSamplers(pImmutableSamplers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorSetLayoutBinding set(VkDescriptorSetLayoutBinding src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorSetLayoutBinding} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutBinding malloc() {
        return wrap(VkDescriptorSetLayoutBinding.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDescriptorSetLayoutBinding} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutBinding calloc() {
        return wrap(VkDescriptorSetLayoutBinding.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDescriptorSetLayoutBinding} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorSetLayoutBinding create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDescriptorSetLayoutBinding.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorSetLayoutBinding} instance for the specified memory address. */
    public static VkDescriptorSetLayoutBinding create(long address) {
        return wrap(VkDescriptorSetLayoutBinding.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetLayoutBinding createSafe(long address) {
        return address == NULL ? null : wrap(VkDescriptorSetLayoutBinding.class, address);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBinding.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBinding.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBinding.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBinding.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBinding.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBinding.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDescriptorSetLayoutBinding.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBinding.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetLayoutBinding.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBinding mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBinding callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBinding mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBinding callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBinding.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBinding.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBinding.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutBinding.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDescriptorSetLayoutBinding} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutBinding malloc(MemoryStack stack) {
        return wrap(VkDescriptorSetLayoutBinding.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDescriptorSetLayoutBinding} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutBinding calloc(MemoryStack stack) {
        return wrap(VkDescriptorSetLayoutBinding.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBinding.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBinding.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBinding.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBinding.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #binding}. */
    public static int nbinding(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorSetLayoutBinding.BINDING); }
    /** Unsafe version of {@link #descriptorType}. */
    public static int ndescriptorType(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorSetLayoutBinding.DESCRIPTORTYPE); }
    /** Unsafe version of {@link #descriptorCount}. */
    public static int ndescriptorCount(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorSetLayoutBinding.DESCRIPTORCOUNT); }
    /** Unsafe version of {@link #stageFlags}. */
    public static int nstageFlags(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorSetLayoutBinding.STAGEFLAGS); }
    /** Unsafe version of {@link #pImmutableSamplers() pImmutableSamplers}. */
    @Nullable public static LongBuffer npImmutableSamplers(long struct) { return memLongBufferSafe(memGetAddress(struct + VkDescriptorSetLayoutBinding.PIMMUTABLESAMPLERS), ndescriptorCount(struct)); }

    /** Unsafe version of {@link #binding(int) binding}. */
    public static void nbinding(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorSetLayoutBinding.BINDING, value); }
    /** Unsafe version of {@link #descriptorType(int) descriptorType}. */
    public static void ndescriptorType(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorSetLayoutBinding.DESCRIPTORTYPE, value); }
    /** Sets the specified value to the {@code descriptorCount} field of the specified {@code struct}. */
    public static void ndescriptorCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorSetLayoutBinding.DESCRIPTORCOUNT, value); }
    /** Unsafe version of {@link #stageFlags(int) stageFlags}. */
    public static void nstageFlags(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorSetLayoutBinding.STAGEFLAGS, value); }
    /** Unsafe version of {@link #pImmutableSamplers(LongBuffer) pImmutableSamplers}. */
    public static void npImmutableSamplers(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkDescriptorSetLayoutBinding.PIMMUTABLESAMPLERS, memAddressSafe(value)); if (value != null) { ndescriptorCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkDescriptorSetLayoutBinding} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorSetLayoutBinding, Buffer> implements NativeResource {

        private static final VkDescriptorSetLayoutBinding ELEMENT_FACTORY = VkDescriptorSetLayoutBinding.create(-1L);

        /**
         * Creates a new {@code VkDescriptorSetLayoutBinding.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetLayoutBinding#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorSetLayoutBinding getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDescriptorSetLayoutBinding#binding} field. */
        @NativeType("uint32_t")
        public int binding() { return VkDescriptorSetLayoutBinding.nbinding(address()); }
        /** @return the value of the {@link VkDescriptorSetLayoutBinding#descriptorType} field. */
        @NativeType("VkDescriptorType")
        public int descriptorType() { return VkDescriptorSetLayoutBinding.ndescriptorType(address()); }
        /** @return the value of the {@link VkDescriptorSetLayoutBinding#descriptorCount} field. */
        @NativeType("uint32_t")
        public int descriptorCount() { return VkDescriptorSetLayoutBinding.ndescriptorCount(address()); }
        /** @return the value of the {@link VkDescriptorSetLayoutBinding#stageFlags} field. */
        @NativeType("VkShaderStageFlags")
        public int stageFlags() { return VkDescriptorSetLayoutBinding.nstageFlags(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkDescriptorSetLayoutBinding#pImmutableSamplers} field. */
        @Nullable
        @NativeType("VkSampler const *")
        public LongBuffer pImmutableSamplers() { return VkDescriptorSetLayoutBinding.npImmutableSamplers(address()); }

        /** Sets the specified value to the {@link VkDescriptorSetLayoutBinding#binding} field. */
        public VkDescriptorSetLayoutBinding.Buffer binding(@NativeType("uint32_t") int value) { VkDescriptorSetLayoutBinding.nbinding(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorSetLayoutBinding#descriptorType} field. */
        public VkDescriptorSetLayoutBinding.Buffer descriptorType(@NativeType("VkDescriptorType") int value) { VkDescriptorSetLayoutBinding.ndescriptorType(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorSetLayoutBinding#descriptorCount} field. */
        public VkDescriptorSetLayoutBinding.Buffer descriptorCount(@NativeType("uint32_t") int value) { VkDescriptorSetLayoutBinding.ndescriptorCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorSetLayoutBinding#stageFlags} field. */
        public VkDescriptorSetLayoutBinding.Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) { VkDescriptorSetLayoutBinding.nstageFlags(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkDescriptorSetLayoutBinding#pImmutableSamplers} field. */
        public VkDescriptorSetLayoutBinding.Buffer pImmutableSamplers(@Nullable @NativeType("VkSampler const *") LongBuffer value) { VkDescriptorSetLayoutBinding.npImmutableSamplers(address(), value); return this; }

    }

}