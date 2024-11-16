/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created descriptor set layout.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-perStageDescriptorSet">{@code perStageDescriptorSet}</a> feature is not enabled, or {@code flags} does not contain {@link NVPerStageDescriptorSet#VK_DESCRIPTOR_SET_LAYOUT_CREATE_PER_STAGE_BIT_NV DESCRIPTOR_SET_LAYOUT_CREATE_PER_STAGE_BIT_NV}, then the {@link VkDescriptorSetLayoutBinding}{@code ::binding} members of the elements of the {@code pBindings} array <b>must</b> each have different values</li>
 * <li>If {@code flags} contains {@link KHRPushDescriptor#VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR}, then all elements of {@code pBindings} <b>must</b> not have a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}</li>
 * <li>If {@code flags} contains {@link KHRPushDescriptor#VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR}, then all elements of {@code pBindings} <b>must</b> not have a {@code descriptorType} of {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK}</li>
 * <li>If {@code flags} contains {@link KHRPushDescriptor#VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR}, then the total number of elements of all bindings <b>must</b> be less than or equal to {@link VkPhysicalDevicePushDescriptorPropertiesKHR}{@code ::maxPushDescriptors}</li>
 * <li>If {@code flags} contains {@link KHRPushDescriptor#VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR}, {@code flags} <b>must</b> not contain {@link EXTMutableDescriptorType#VK_DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_EXT}</li>
 * <li>If {@code flags} contains {@link KHRPushDescriptor#VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR}, {@code pBindings} <b>must</b> not have a {@code descriptorType} of {@link EXTMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_EXT DESCRIPTOR_TYPE_MUTABLE_EXT}</li>
 * <li>If any binding has the {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT} bit set, {@code flags} <b>must</b> include {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT}</li>
 * <li>If any binding has the {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT} bit set, then all bindings <b>must</b> not have {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}</li>
 * <li>If {@code flags} contains {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT}, {@code flags} <b>must</b> not contain {@link EXTMutableDescriptorType#VK_DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_EXT}</li>
 * <li>If any element {@code pBindings}[i] has a {@code descriptorType} of {@link EXTMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_EXT DESCRIPTOR_TYPE_MUTABLE_EXT}, then the {@code pNext} chain <b>must</b> include a {@link VkMutableDescriptorTypeCreateInfoEXT} structure, and {@code mutableDescriptorTypeListCount} <b>must</b> be greater than i</li>
 * <li>If a binding has a {@code descriptorType} value of {@link EXTMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_EXT DESCRIPTOR_TYPE_MUTABLE_EXT}, then {@code pImmutableSamplers} <b>must</b> be {@code NULL}</li>
 * <li>If {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT}{@code ::mutableDescriptorType} is not enabled, {@code pBindings} <b>must</b> not contain a {@code descriptorType} of {@link EXTMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_EXT DESCRIPTOR_TYPE_MUTABLE_EXT}</li>
 * <li>If {@code flags} contains {@link EXTMutableDescriptorType#VK_DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_EXT}, {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT}{@code ::mutableDescriptorType} <b>must</b> be enabled</li>
 * <li>If {@code flags} contains {@link EXTDescriptorBuffer#VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}, then all elements of {@code pBindings} <b>must</b> not have a {@code descriptorType} of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}</li>
 * <li>If {@code flags} contains {@link EXTDescriptorBuffer#VK_DESCRIPTOR_SET_LAYOUT_CREATE_EMBEDDED_IMMUTABLE_SAMPLERS_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_EMBEDDED_IMMUTABLE_SAMPLERS_BIT_EXT}, {@code flags} <b>must</b> also contain {@link EXTDescriptorBuffer#VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}</li>
 * <li>If {@code flags} contains {@link EXTDescriptorBuffer#VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}, then {@code flags} <b>must</b> not contain {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT}</li>
 * <li>If {@code flags} contains {@link EXTDescriptorBuffer#VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT}, then {@code flags} <b>must</b> not contain {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_VALVE DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_VALVE}</li>
 * <li>If {@code flags} contains {@link NVPerStageDescriptorSet#VK_DESCRIPTOR_SET_LAYOUT_CREATE_PER_STAGE_BIT_NV DESCRIPTOR_SET_LAYOUT_CREATE_PER_STAGE_BIT_NV}, then <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-perStageDescriptorSet">{@code perStageDescriptorSet}</a> <b>must</b> be enabled</li>
 * <li>If {@code flags} contains {@link NVPerStageDescriptorSet#VK_DESCRIPTOR_SET_LAYOUT_CREATE_PER_STAGE_BIT_NV DESCRIPTOR_SET_LAYOUT_CREATE_PER_STAGE_BIT_NV}, then there <b>must</b> not be any two elements of the {@code pBindings} array with the same {@link VkDescriptorSetLayoutBinding}{@code ::binding} value and their {@link VkDescriptorSetLayoutBinding}{@code ::stageFlags} containing the same bit</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkDescriptorSetLayoutBindingFlagsCreateInfo} or {@link VkMutableDescriptorTypeCreateInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkDescriptorSetLayoutCreateFlagBits} values</li>
 * <li>If {@code bindingCount} is not 0, {@code pBindings} <b>must</b> be a valid pointer to an array of {@code bindingCount} valid {@link VkDescriptorSetLayoutBinding} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDescriptorSetLayoutBinding}, {@link VK10#vkCreateDescriptorSetLayout CreateDescriptorSetLayout}, {@link VK11#vkGetDescriptorSetLayoutSupport GetDescriptorSetLayoutSupport}, {@link KHRMaintenance3#vkGetDescriptorSetLayoutSupportKHR GetDescriptorSetLayoutSupportKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorSetLayoutCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDescriptorSetLayoutCreateFlags {@link #flags};
 *     uint32_t {@link #bindingCount};
 *     {@link VkDescriptorSetLayoutBinding VkDescriptorSetLayoutBinding} const * {@link #pBindings};
 * }</code></pre>
 */
public class VkDescriptorSetLayoutCreateInfo extends Struct<VkDescriptorSetLayoutCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        BINDINGCOUNT,
        PBINDINGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        BINDINGCOUNT = layout.offsetof(3);
        PBINDINGS = layout.offsetof(4);
    }

    protected VkDescriptorSetLayoutCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorSetLayoutCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorSetLayoutCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkDescriptorSetLayoutCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetLayoutCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkDescriptorSetLayoutCreateFlagBits} specifying options for descriptor set layout creation. */
    @NativeType("VkDescriptorSetLayoutCreateFlags")
    public int flags() { return nflags(address()); }
    /** the number of elements in {@code pBindings}. */
    @NativeType("uint32_t")
    public int bindingCount() { return nbindingCount(address()); }
    /** a pointer to an array of {@link VkDescriptorSetLayoutBinding} structures. */
    @NativeType("VkDescriptorSetLayoutBinding const *")
    public VkDescriptorSetLayoutBinding.@Nullable Buffer pBindings() { return npBindings(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDescriptorSetLayoutCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO} value to the {@link #sType} field. */
    public VkDescriptorSetLayoutCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDescriptorSetLayoutCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDescriptorSetLayoutBindingFlagsCreateInfo} value to the {@code pNext} chain. */
    public VkDescriptorSetLayoutCreateInfo pNext(VkDescriptorSetLayoutBindingFlagsCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT} value to the {@code pNext} chain. */
    public VkDescriptorSetLayoutCreateInfo pNext(VkDescriptorSetLayoutBindingFlagsCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMutableDescriptorTypeCreateInfoEXT} value to the {@code pNext} chain. */
    public VkDescriptorSetLayoutCreateInfo pNext(VkMutableDescriptorTypeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMutableDescriptorTypeCreateInfoVALVE} value to the {@code pNext} chain. */
    public VkDescriptorSetLayoutCreateInfo pNext(VkMutableDescriptorTypeCreateInfoVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkDescriptorSetLayoutCreateInfo flags(@NativeType("VkDescriptorSetLayoutCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorSetLayoutBinding.Buffer} to the {@link #pBindings} field. */
    public VkDescriptorSetLayoutCreateInfo pBindings(@NativeType("VkDescriptorSetLayoutBinding const *") VkDescriptorSetLayoutBinding.@Nullable Buffer value) { npBindings(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorSetLayoutCreateInfo set(
        int sType,
        long pNext,
        int flags,
        VkDescriptorSetLayoutBinding.@Nullable Buffer pBindings
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pBindings(pBindings);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorSetLayoutCreateInfo set(VkDescriptorSetLayoutCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorSetLayoutCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutCreateInfo malloc() {
        return new VkDescriptorSetLayoutCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorSetLayoutCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutCreateInfo calloc() {
        return new VkDescriptorSetLayoutCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorSetLayoutCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorSetLayoutCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorSetLayoutCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorSetLayoutCreateInfo} instance for the specified memory address. */
    public static VkDescriptorSetLayoutCreateInfo create(long address) {
        return new VkDescriptorSetLayoutCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorSetLayoutCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkDescriptorSetLayoutCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorSetLayoutCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorSetLayoutCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDescriptorSetLayoutCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutCreateInfo malloc(MemoryStack stack) {
        return new VkDescriptorSetLayoutCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorSetLayoutCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutCreateInfo calloc(MemoryStack stack) {
        return new VkDescriptorSetLayoutCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDescriptorSetLayoutCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorSetLayoutCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkDescriptorSetLayoutCreateInfo.FLAGS); }
    /** Unsafe version of {@link #bindingCount}. */
    public static int nbindingCount(long struct) { return memGetInt(struct + VkDescriptorSetLayoutCreateInfo.BINDINGCOUNT); }
    /** Unsafe version of {@link #pBindings}. */
    public static VkDescriptorSetLayoutBinding.@Nullable Buffer npBindings(long struct) { return VkDescriptorSetLayoutBinding.createSafe(memGetAddress(struct + VkDescriptorSetLayoutCreateInfo.PBINDINGS), nbindingCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorSetLayoutCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutCreateInfo.FLAGS, value); }
    /** Sets the specified value to the {@code bindingCount} field of the specified {@code struct}. */
    public static void nbindingCount(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutCreateInfo.BINDINGCOUNT, value); }
    /** Unsafe version of {@link #pBindings(VkDescriptorSetLayoutBinding.Buffer) pBindings}. */
    public static void npBindings(long struct, VkDescriptorSetLayoutBinding.@Nullable Buffer value) { memPutAddress(struct + VkDescriptorSetLayoutCreateInfo.PBINDINGS, memAddressSafe(value)); nbindingCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nbindingCount(struct) != 0) {
            check(memGetAddress(struct + VkDescriptorSetLayoutCreateInfo.PBINDINGS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkDescriptorSetLayoutCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorSetLayoutCreateInfo, Buffer> implements NativeResource {

        private static final VkDescriptorSetLayoutCreateInfo ELEMENT_FACTORY = VkDescriptorSetLayoutCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkDescriptorSetLayoutCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetLayoutCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkDescriptorSetLayoutCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDescriptorSetLayoutCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorSetLayoutCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkDescriptorSetLayoutCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDescriptorSetLayoutCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkDescriptorSetLayoutCreateInfo#flags} field. */
        @NativeType("VkDescriptorSetLayoutCreateFlags")
        public int flags() { return VkDescriptorSetLayoutCreateInfo.nflags(address()); }
        /** @return the value of the {@link VkDescriptorSetLayoutCreateInfo#bindingCount} field. */
        @NativeType("uint32_t")
        public int bindingCount() { return VkDescriptorSetLayoutCreateInfo.nbindingCount(address()); }
        /** @return a {@link VkDescriptorSetLayoutBinding.Buffer} view of the struct array pointed to by the {@link VkDescriptorSetLayoutCreateInfo#pBindings} field. */
        @NativeType("VkDescriptorSetLayoutBinding const *")
        public VkDescriptorSetLayoutBinding.@Nullable Buffer pBindings() { return VkDescriptorSetLayoutCreateInfo.npBindings(address()); }

        /** Sets the specified value to the {@link VkDescriptorSetLayoutCreateInfo#sType} field. */
        public VkDescriptorSetLayoutCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorSetLayoutCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO} value to the {@link VkDescriptorSetLayoutCreateInfo#sType} field. */
        public VkDescriptorSetLayoutCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO); }
        /** Sets the specified value to the {@link VkDescriptorSetLayoutCreateInfo#pNext} field. */
        public VkDescriptorSetLayoutCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorSetLayoutCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDescriptorSetLayoutBindingFlagsCreateInfo} value to the {@code pNext} chain. */
        public VkDescriptorSetLayoutCreateInfo.Buffer pNext(VkDescriptorSetLayoutBindingFlagsCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT} value to the {@code pNext} chain. */
        public VkDescriptorSetLayoutCreateInfo.Buffer pNext(VkDescriptorSetLayoutBindingFlagsCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMutableDescriptorTypeCreateInfoEXT} value to the {@code pNext} chain. */
        public VkDescriptorSetLayoutCreateInfo.Buffer pNext(VkMutableDescriptorTypeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMutableDescriptorTypeCreateInfoVALVE} value to the {@code pNext} chain. */
        public VkDescriptorSetLayoutCreateInfo.Buffer pNext(VkMutableDescriptorTypeCreateInfoVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkDescriptorSetLayoutCreateInfo#flags} field. */
        public VkDescriptorSetLayoutCreateInfo.Buffer flags(@NativeType("VkDescriptorSetLayoutCreateFlags") int value) { VkDescriptorSetLayoutCreateInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorSetLayoutBinding.Buffer} to the {@link VkDescriptorSetLayoutCreateInfo#pBindings} field. */
        public VkDescriptorSetLayoutCreateInfo.Buffer pBindings(@NativeType("VkDescriptorSetLayoutBinding const *") VkDescriptorSetLayoutBinding.@Nullable Buffer value) { VkDescriptorSetLayoutCreateInfo.npBindings(address(), value); return this; }

    }

}