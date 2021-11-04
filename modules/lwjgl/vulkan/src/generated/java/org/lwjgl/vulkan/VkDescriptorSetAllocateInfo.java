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
 * Structure specifying the allocation parameters for descriptor sets.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>Each element of {@code pSetLayouts} <b>must</b> not have been created with {@link KHRPushDescriptor#VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR} set</li>
 * <li>If any element of {@code pSetLayouts} was created with the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set, {@code descriptorPool} <b>must</b> have been created with the {@link VK12#VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT} flag set</li>
 * <li>If any element of {@code pSetLayouts} was created with the {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_VALVE DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_VALVE} bit set, {@code descriptorPool} <b>must</b> have been created with the {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_POOL_CREATE_HOST_ONLY_BIT_VALVE DESCRIPTOR_POOL_CREATE_HOST_ONLY_BIT_VALVE} flag set</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkDescriptorSetVariableDescriptorCountAllocateInfo}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code descriptorPool} <b>must</b> be a valid {@code VkDescriptorPool} handle</li>
 * <li>{@code pSetLayouts} <b>must</b> be a valid pointer to an array of {@code descriptorSetCount} valid {@code VkDescriptorSetLayout} handles</li>
 * <li>{@code descriptorSetCount} <b>must</b> be greater than 0</li>
 * <li>Both of {@code descriptorPool}, and the elements of {@code pSetLayouts} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkAllocateDescriptorSets AllocateDescriptorSets}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorSetAllocateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDescriptorPool {@link #descriptorPool};
 *     uint32_t {@link #descriptorSetCount};
 *     VkDescriptorSetLayout const * {@link #pSetLayouts};
 * }</code></pre>
 */
public class VkDescriptorSetAllocateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DESCRIPTORPOOL,
        DESCRIPTORSETCOUNT,
        PSETLAYOUTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DESCRIPTORPOOL = layout.offsetof(2);
        DESCRIPTORSETCOUNT = layout.offsetof(3);
        PSETLAYOUTS = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkDescriptorSetAllocateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetAllocateInfo(ByteBuffer container) {
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
    /** the pool which the sets will be allocated from. */
    @NativeType("VkDescriptorPool")
    public long descriptorPool() { return ndescriptorPool(address()); }
    /** determines the number of descriptor sets to be allocated from the pool. */
    @NativeType("uint32_t")
    public int descriptorSetCount() { return ndescriptorSetCount(address()); }
    /** a pointer to an array of descriptor set layouts, with each member specifying how the corresponding descriptor set is allocated. */
    @NativeType("VkDescriptorSetLayout const *")
    public LongBuffer pSetLayouts() { return npSetLayouts(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDescriptorSetAllocateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO} value to the {@link #sType} field. */
    public VkDescriptorSetAllocateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDescriptorSetAllocateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDescriptorSetVariableDescriptorCountAllocateInfo} value to the {@code pNext} chain. */
    public VkDescriptorSetAllocateInfo pNext(VkDescriptorSetVariableDescriptorCountAllocateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT} value to the {@code pNext} chain. */
    public VkDescriptorSetAllocateInfo pNext(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #descriptorPool} field. */
    public VkDescriptorSetAllocateInfo descriptorPool(@NativeType("VkDescriptorPool") long value) { ndescriptorPool(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pSetLayouts} field. */
    public VkDescriptorSetAllocateInfo pSetLayouts(@NativeType("VkDescriptorSetLayout const *") LongBuffer value) { npSetLayouts(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorSetAllocateInfo set(
        int sType,
        long pNext,
        long descriptorPool,
        LongBuffer pSetLayouts
    ) {
        sType(sType);
        pNext(pNext);
        descriptorPool(descriptorPool);
        pSetLayouts(pSetLayouts);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorSetAllocateInfo set(VkDescriptorSetAllocateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorSetAllocateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetAllocateInfo malloc() {
        return wrap(VkDescriptorSetAllocateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDescriptorSetAllocateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetAllocateInfo calloc() {
        return wrap(VkDescriptorSetAllocateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDescriptorSetAllocateInfo} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorSetAllocateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDescriptorSetAllocateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorSetAllocateInfo} instance for the specified memory address. */
    public static VkDescriptorSetAllocateInfo create(long address) {
        return wrap(VkDescriptorSetAllocateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetAllocateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkDescriptorSetAllocateInfo.class, address);
    }

    /**
     * Returns a new {@link VkDescriptorSetAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetAllocateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetAllocateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetAllocateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetAllocateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDescriptorSetAllocateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetAllocateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetAllocateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetAllocateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetAllocateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetAllocateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetAllocateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetAllocateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetAllocateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetAllocateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetAllocateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDescriptorSetAllocateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetAllocateInfo malloc(MemoryStack stack) {
        return wrap(VkDescriptorSetAllocateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDescriptorSetAllocateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetAllocateInfo calloc(MemoryStack stack) {
        return wrap(VkDescriptorSetAllocateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorSetAllocateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetAllocateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetAllocateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetAllocateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorSetAllocateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorSetAllocateInfo.PNEXT); }
    /** Unsafe version of {@link #descriptorPool}. */
    public static long ndescriptorPool(long struct) { return UNSAFE.getLong(null, struct + VkDescriptorSetAllocateInfo.DESCRIPTORPOOL); }
    /** Unsafe version of {@link #descriptorSetCount}. */
    public static int ndescriptorSetCount(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorSetAllocateInfo.DESCRIPTORSETCOUNT); }
    /** Unsafe version of {@link #pSetLayouts() pSetLayouts}. */
    public static LongBuffer npSetLayouts(long struct) { return memLongBuffer(memGetAddress(struct + VkDescriptorSetAllocateInfo.PSETLAYOUTS), ndescriptorSetCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorSetAllocateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorSetAllocateInfo.PNEXT, value); }
    /** Unsafe version of {@link #descriptorPool(long) descriptorPool}. */
    public static void ndescriptorPool(long struct, long value) { UNSAFE.putLong(null, struct + VkDescriptorSetAllocateInfo.DESCRIPTORPOOL, value); }
    /** Sets the specified value to the {@code descriptorSetCount} field of the specified {@code struct}. */
    public static void ndescriptorSetCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorSetAllocateInfo.DESCRIPTORSETCOUNT, value); }
    /** Unsafe version of {@link #pSetLayouts(LongBuffer) pSetLayouts}. */
    public static void npSetLayouts(long struct, LongBuffer value) { memPutAddress(struct + VkDescriptorSetAllocateInfo.PSETLAYOUTS, memAddress(value)); ndescriptorSetCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDescriptorSetAllocateInfo.PSETLAYOUTS));
    }

    // -----------------------------------

    /** An array of {@link VkDescriptorSetAllocateInfo} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorSetAllocateInfo, Buffer> implements NativeResource {

        private static final VkDescriptorSetAllocateInfo ELEMENT_FACTORY = VkDescriptorSetAllocateInfo.create(-1L);

        /**
         * Creates a new {@code VkDescriptorSetAllocateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetAllocateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorSetAllocateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDescriptorSetAllocateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorSetAllocateInfo.nsType(address()); }
        /** @return the value of the {@link VkDescriptorSetAllocateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDescriptorSetAllocateInfo.npNext(address()); }
        /** @return the value of the {@link VkDescriptorSetAllocateInfo#descriptorPool} field. */
        @NativeType("VkDescriptorPool")
        public long descriptorPool() { return VkDescriptorSetAllocateInfo.ndescriptorPool(address()); }
        /** @return the value of the {@link VkDescriptorSetAllocateInfo#descriptorSetCount} field. */
        @NativeType("uint32_t")
        public int descriptorSetCount() { return VkDescriptorSetAllocateInfo.ndescriptorSetCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkDescriptorSetAllocateInfo#pSetLayouts} field. */
        @NativeType("VkDescriptorSetLayout const *")
        public LongBuffer pSetLayouts() { return VkDescriptorSetAllocateInfo.npSetLayouts(address()); }

        /** Sets the specified value to the {@link VkDescriptorSetAllocateInfo#sType} field. */
        public VkDescriptorSetAllocateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorSetAllocateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO} value to the {@link VkDescriptorSetAllocateInfo#sType} field. */
        public VkDescriptorSetAllocateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO); }
        /** Sets the specified value to the {@link VkDescriptorSetAllocateInfo#pNext} field. */
        public VkDescriptorSetAllocateInfo.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorSetAllocateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDescriptorSetVariableDescriptorCountAllocateInfo} value to the {@code pNext} chain. */
        public VkDescriptorSetAllocateInfo.Buffer pNext(VkDescriptorSetVariableDescriptorCountAllocateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT} value to the {@code pNext} chain. */
        public VkDescriptorSetAllocateInfo.Buffer pNext(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkDescriptorSetAllocateInfo#descriptorPool} field. */
        public VkDescriptorSetAllocateInfo.Buffer descriptorPool(@NativeType("VkDescriptorPool") long value) { VkDescriptorSetAllocateInfo.ndescriptorPool(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkDescriptorSetAllocateInfo#pSetLayouts} field. */
        public VkDescriptorSetAllocateInfo.Buffer pSetLayouts(@NativeType("VkDescriptorSetLayout const *") LongBuffer value) { VkDescriptorSetAllocateInfo.npSetLayouts(address(), value); return this; }

    }

}