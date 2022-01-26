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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created descriptor pool.
 * 
 * <h5>Description</h5>
 * 
 * <p>If multiple {@link VkDescriptorPoolSize} structures containing the same descriptor type appear in the {@code pPoolSizes} array then the pool will be created with enough storage for the total number of descriptors of each type.</p>
 * 
 * <p>Fragmentation of a descriptor pool is possible and <b>may</b> lead to descriptor set allocation failures. A failure due to fragmentation is defined as failing a descriptor set allocation despite the sum of all outstanding descriptor set allocations from the pool plus the requested allocation requiring no more than the total number of descriptors requested at pool creation. Implementations provide certain guarantees of when fragmentation <b>must</b> not cause allocation failure, as described below.</p>
 * 
 * <p>If a descriptor pool has not had any descriptor sets freed since it was created or most recently reset then fragmentation <b>must</b> not cause an allocation failure (note that this is always the case for a pool created without the {@link VK10#VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT} bit set). Additionally, if all sets allocated from the pool since it was created or most recently reset use the same number of descriptors (of each type) and the requested allocation also uses that same number of descriptors (of each type), then fragmentation <b>must</b> not cause an allocation failure.</p>
 * 
 * <p>If an allocation failure occurs due to fragmentation, an application <b>can</b> create an additional descriptor pool to perform further descriptor set allocations.</p>
 * 
 * <p>If {@code flags} has the {@link VK12#VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT} bit set, descriptor pool creation <b>may</b> fail with the error {@link VK12#VK_ERROR_FRAGMENTATION ERROR_FRAGMENTATION} if the total number of descriptors across all pools (including this one) created with this bit set exceeds {@code maxUpdateAfterBindDescriptorsInAllPools}, or if fragmentation of the underlying hardware resources occurs.</p>
 * 
 * <p>If a {@code pPoolSizes}[i]{@code ::type} is {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE}, a {@link VkMutableDescriptorTypeCreateInfoVALVE} struct in the {@code pNext} chain <b>can</b> be used to specify which mutable descriptor types <b>can</b> be allocated from the pool. If present in the {@code pNext} chain, {@link VkMutableDescriptorTypeCreateInfoVALVE}{@code ::pMutableDescriptorTypeLists}[i] specifies which kind of {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE} descriptors <b>can</b> be allocated from this pool entry. If {@link VkMutableDescriptorTypeCreateInfoVALVE} does not exist in the {@code pNext} chain, or {@link VkMutableDescriptorTypeCreateInfoVALVE}{@code ::pMutableDescriptorTypeLists}[i] is out of range, the descriptor pool allocates enough memory to be able to allocate a {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE} descriptor with any supported {@code VkDescriptorType} as a mutable descriptor. A mutable descriptor <b>can</b> be allocated from a pool entry if the type list in {@link VkDescriptorSetLayoutCreateInfo} is a subset of the type list declared in the descriptor pool, or if the pool entry is created without a descriptor type list. Multiple {@code pPoolSizes} entries with {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE} <b>can</b> be declared. When multiple such pool entries are present in {@code pPoolSizes}, they specify sets of supported descriptor types which either fully overlap, partially overlap, or are disjoint. Two sets fully overlap if the sets of supported descriptor types are equal. If the sets are not disjoint they partially overlap. A pool entry without a {@link VkMutableDescriptorTypeListVALVE} assigned to it is considered to partially overlap any other pool entry which has a {@link VkMutableDescriptorTypeListVALVE} assigned to it. The application <b>must</b> ensure that partial overlap does not exist in {@code pPoolSizes}.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The requirement of no partial overlap is intended to resolve ambiguity for validation as there is no confusion which {@code pPoolSizes} entries will be allocated from. An implementation is not expected to depend on this requirement.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code maxSets} <b>must</b> be greater than 0</li>
 * <li>If {@code flags} has the {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_POOL_CREATE_HOST_ONLY_BIT_VALVE DESCRIPTOR_POOL_CREATE_HOST_ONLY_BIT_VALVE} bit set, then the {@link VK12#VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT} bit <b>must</b> not be set</li>
 * <li>If {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE}{@code ::mutableDescriptorType} is not enabled, {@code pPoolSizes} <b>must</b> not contain a {@code descriptorType} of {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE}</li>
 * <li>If {@code flags} has the {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_POOL_CREATE_HOST_ONLY_BIT_VALVE DESCRIPTOR_POOL_CREATE_HOST_ONLY_BIT_VALVE} bit set, {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE}{@code ::mutableDescriptorType} <b>must</b> be enabled</li>
 * <li>If {@code pPoolSizes} contains a {@code descriptorType} of {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE}, any other {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE} element in {@code pPoolSizes} <b>must</b> not have sets of supported descriptor types which partially overlap</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkDescriptorPoolInlineUniformBlockCreateInfo} or {@link VkMutableDescriptorTypeCreateInfoVALVE}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkDescriptorPoolCreateFlagBits} values</li>
 * <li>{@code pPoolSizes} <b>must</b> be a valid pointer to an array of {@code poolSizeCount} valid {@link VkDescriptorPoolSize} structures</li>
 * <li>{@code poolSizeCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDescriptorPoolSize}, {@link VK10#vkCreateDescriptorPool CreateDescriptorPool}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorPoolCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDescriptorPoolCreateFlags {@link #flags};
 *     uint32_t {@link #maxSets};
 *     uint32_t {@link #poolSizeCount};
 *     {@link VkDescriptorPoolSize VkDescriptorPoolSize} const * {@link #pPoolSizes};
 * }</code></pre>
 */
public class VkDescriptorPoolCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        MAXSETS,
        POOLSIZECOUNT,
        PPOOLSIZES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MAXSETS = layout.offsetof(3);
        POOLSIZECOUNT = layout.offsetof(4);
        PPOOLSIZES = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkDescriptorPoolCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorPoolCreateInfo(ByteBuffer container) {
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
    /** a bitmask of {@code VkDescriptorPoolCreateFlagBits} specifying certain supported operations on the pool. */
    @NativeType("VkDescriptorPoolCreateFlags")
    public int flags() { return nflags(address()); }
    /** the maximum number of descriptor sets that <b>can</b> be allocated from the pool. */
    @NativeType("uint32_t")
    public int maxSets() { return nmaxSets(address()); }
    /** the number of elements in {@code pPoolSizes}. */
    @NativeType("uint32_t")
    public int poolSizeCount() { return npoolSizeCount(address()); }
    /** a pointer to an array of {@link VkDescriptorPoolSize} structures, each containing a descriptor type and number of descriptors of that type to be allocated in the pool. */
    @NativeType("VkDescriptorPoolSize const *")
    public VkDescriptorPoolSize.Buffer pPoolSizes() { return npPoolSizes(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDescriptorPoolCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO} value to the {@link #sType} field. */
    public VkDescriptorPoolCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDescriptorPoolCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDescriptorPoolInlineUniformBlockCreateInfo} value to the {@code pNext} chain. */
    public VkDescriptorPoolCreateInfo pNext(VkDescriptorPoolInlineUniformBlockCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT} value to the {@code pNext} chain. */
    public VkDescriptorPoolCreateInfo pNext(VkDescriptorPoolInlineUniformBlockCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMutableDescriptorTypeCreateInfoVALVE} value to the {@code pNext} chain. */
    public VkDescriptorPoolCreateInfo pNext(VkMutableDescriptorTypeCreateInfoVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkDescriptorPoolCreateInfo flags(@NativeType("VkDescriptorPoolCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #maxSets} field. */
    public VkDescriptorPoolCreateInfo maxSets(@NativeType("uint32_t") int value) { nmaxSets(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorPoolSize.Buffer} to the {@link #pPoolSizes} field. */
    public VkDescriptorPoolCreateInfo pPoolSizes(@NativeType("VkDescriptorPoolSize const *") VkDescriptorPoolSize.Buffer value) { npPoolSizes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorPoolCreateInfo set(
        int sType,
        long pNext,
        int flags,
        int maxSets,
        VkDescriptorPoolSize.Buffer pPoolSizes
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        maxSets(maxSets);
        pPoolSizes(pPoolSizes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorPoolCreateInfo set(VkDescriptorPoolCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorPoolCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorPoolCreateInfo malloc() {
        return wrap(VkDescriptorPoolCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDescriptorPoolCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorPoolCreateInfo calloc() {
        return wrap(VkDescriptorPoolCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDescriptorPoolCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorPoolCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDescriptorPoolCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorPoolCreateInfo} instance for the specified memory address. */
    public static VkDescriptorPoolCreateInfo create(long address) {
        return wrap(VkDescriptorPoolCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorPoolCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkDescriptorPoolCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkDescriptorPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDescriptorPoolCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorPoolCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorPoolCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDescriptorPoolCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorPoolCreateInfo malloc(MemoryStack stack) {
        return wrap(VkDescriptorPoolCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDescriptorPoolCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorPoolCreateInfo calloc(MemoryStack stack) {
        return wrap(VkDescriptorPoolCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorPoolCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorPoolCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorPoolCreateInfo.FLAGS); }
    /** Unsafe version of {@link #maxSets}. */
    public static int nmaxSets(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorPoolCreateInfo.MAXSETS); }
    /** Unsafe version of {@link #poolSizeCount}. */
    public static int npoolSizeCount(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorPoolCreateInfo.POOLSIZECOUNT); }
    /** Unsafe version of {@link #pPoolSizes}. */
    public static VkDescriptorPoolSize.Buffer npPoolSizes(long struct) { return VkDescriptorPoolSize.create(memGetAddress(struct + VkDescriptorPoolCreateInfo.PPOOLSIZES), npoolSizeCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorPoolCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorPoolCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorPoolCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #maxSets(int) maxSets}. */
    public static void nmaxSets(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorPoolCreateInfo.MAXSETS, value); }
    /** Sets the specified value to the {@code poolSizeCount} field of the specified {@code struct}. */
    public static void npoolSizeCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorPoolCreateInfo.POOLSIZECOUNT, value); }
    /** Unsafe version of {@link #pPoolSizes(VkDescriptorPoolSize.Buffer) pPoolSizes}. */
    public static void npPoolSizes(long struct, VkDescriptorPoolSize.Buffer value) { memPutAddress(struct + VkDescriptorPoolCreateInfo.PPOOLSIZES, value.address()); npoolSizeCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDescriptorPoolCreateInfo.PPOOLSIZES));
    }

    // -----------------------------------

    /** An array of {@link VkDescriptorPoolCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorPoolCreateInfo, Buffer> implements NativeResource {

        private static final VkDescriptorPoolCreateInfo ELEMENT_FACTORY = VkDescriptorPoolCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkDescriptorPoolCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorPoolCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorPoolCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDescriptorPoolCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorPoolCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkDescriptorPoolCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDescriptorPoolCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkDescriptorPoolCreateInfo#flags} field. */
        @NativeType("VkDescriptorPoolCreateFlags")
        public int flags() { return VkDescriptorPoolCreateInfo.nflags(address()); }
        /** @return the value of the {@link VkDescriptorPoolCreateInfo#maxSets} field. */
        @NativeType("uint32_t")
        public int maxSets() { return VkDescriptorPoolCreateInfo.nmaxSets(address()); }
        /** @return the value of the {@link VkDescriptorPoolCreateInfo#poolSizeCount} field. */
        @NativeType("uint32_t")
        public int poolSizeCount() { return VkDescriptorPoolCreateInfo.npoolSizeCount(address()); }
        /** @return a {@link VkDescriptorPoolSize.Buffer} view of the struct array pointed to by the {@link VkDescriptorPoolCreateInfo#pPoolSizes} field. */
        @NativeType("VkDescriptorPoolSize const *")
        public VkDescriptorPoolSize.Buffer pPoolSizes() { return VkDescriptorPoolCreateInfo.npPoolSizes(address()); }

        /** Sets the specified value to the {@link VkDescriptorPoolCreateInfo#sType} field. */
        public VkDescriptorPoolCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorPoolCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO} value to the {@link VkDescriptorPoolCreateInfo#sType} field. */
        public VkDescriptorPoolCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO); }
        /** Sets the specified value to the {@link VkDescriptorPoolCreateInfo#pNext} field. */
        public VkDescriptorPoolCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorPoolCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDescriptorPoolInlineUniformBlockCreateInfo} value to the {@code pNext} chain. */
        public VkDescriptorPoolCreateInfo.Buffer pNext(VkDescriptorPoolInlineUniformBlockCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT} value to the {@code pNext} chain. */
        public VkDescriptorPoolCreateInfo.Buffer pNext(VkDescriptorPoolInlineUniformBlockCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMutableDescriptorTypeCreateInfoVALVE} value to the {@code pNext} chain. */
        public VkDescriptorPoolCreateInfo.Buffer pNext(VkMutableDescriptorTypeCreateInfoVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkDescriptorPoolCreateInfo#flags} field. */
        public VkDescriptorPoolCreateInfo.Buffer flags(@NativeType("VkDescriptorPoolCreateFlags") int value) { VkDescriptorPoolCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorPoolCreateInfo#maxSets} field. */
        public VkDescriptorPoolCreateInfo.Buffer maxSets(@NativeType("uint32_t") int value) { VkDescriptorPoolCreateInfo.nmaxSets(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorPoolSize.Buffer} to the {@link VkDescriptorPoolCreateInfo#pPoolSizes} field. */
        public VkDescriptorPoolCreateInfo.Buffer pPoolSizes(@NativeType("VkDescriptorPoolSize const *") VkDescriptorPoolSize.Buffer value) { VkDescriptorPoolCreateInfo.npPoolSizes(address(), value); return this; }

    }

}