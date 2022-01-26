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
 * Structure specifying a copy descriptor set operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkDescriptorSetLayoutBinding} for {@code dstBinding} is {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE} and {@code srcBinding} is not {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE}, the new active descriptor type becomes the descriptor type of {@code srcBinding}. If both {@link VkDescriptorSetLayoutBinding} for {@code srcBinding} and {@code dstBinding} are {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE}, the active descriptor type in each source descriptor is copied into the corresponding destination descriptor. The active descriptor type <b>can</b> be different for each source descriptor.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The intention is that copies to and from mutable descriptors is a simple memcpy. Copies between non-mutable and mutable descriptors are expected to require one memcpy per descriptor to handle the difference in size, but this use case with more than one {@code descriptorCount} is considered rare.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code srcBinding} <b>must</b> be a valid binding within {@code srcSet}</li>
 * <li>The sum of {@code srcArrayElement} and {@code descriptorCount} <b>must</b> be less than or equal to the number of array elements in the descriptor set binding specified by {@code srcBinding}, and all applicable consecutive bindings, as described by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-updates-consecutive">consecutive binding updates</a></li>
 * <li>{@code dstBinding} <b>must</b> be a valid binding within {@code dstSet}</li>
 * <li>The sum of {@code dstArrayElement} and {@code descriptorCount} <b>must</b> be less than or equal to the number of array elements in the descriptor set binding specified by {@code dstBinding}, and all applicable consecutive bindings, as described by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-updates-consecutive">consecutive binding updates</a></li>
 * <li>The type of {@code dstBinding} within {@code dstSet} <b>must</b> be equal to the type of {@code srcBinding} within {@code srcSet}</li>
 * <li>If {@code srcSet} is equal to {@code dstSet}, then the source and destination ranges of descriptors <b>must</b> not overlap, where the ranges <b>may</b> include array elements from consecutive bindings as described by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-updates-consecutive">consecutive binding updates</a></li>
 * <li>If the descriptor type of the descriptor set binding specified by {@code srcBinding} is {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK}, {@code srcArrayElement} <b>must</b> be an integer multiple of 4</li>
 * <li>If the descriptor type of the descriptor set binding specified by {@code dstBinding} is {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK}, {@code dstArrayElement} <b>must</b> be an integer multiple of 4</li>
 * <li>If the descriptor type of the descriptor set binding specified by either {@code srcBinding} or {@code dstBinding} is {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK}, {@code descriptorCount} <b>must</b> be an integer multiple of 4</li>
 * <li>If {@code srcSet}’s layout was created with the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} flag set, then {@code dstSet}’s layout <b>must</b> also have been created with the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} flag set</li>
 * <li>If {@code srcSet}’s layout was created with neither {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} nor {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_VALVE DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_VALVE} flags set, then {@code dstSet}’s layout <b>must</b> have been created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} flag set</li>
 * <li>If the descriptor pool from which {@code srcSet} was allocated was created with the {@link VK12#VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT} flag set, then the descriptor pool from which {@code dstSet} was allocated <b>must</b> also have been created with the {@link VK12#VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT} flag set</li>
 * <li>If the descriptor pool from which {@code srcSet} was allocated was created with neither {@link VK12#VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT} nor {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_POOL_CREATE_HOST_ONLY_BIT_VALVE DESCRIPTOR_POOL_CREATE_HOST_ONLY_BIT_VALVE} flags set, then the descriptor pool from which {@code dstSet} was allocated <b>must</b> have been created without the {@link VK12#VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT} flag set</li>
 * <li>If the descriptor type of the descriptor set binding specified by {@code dstBinding} is {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER}, then {@code dstSet} <b>must</b> not have been allocated with a layout that included immutable samplers for {@code dstBinding}</li>
 * <li>If {@link VkDescriptorSetLayoutBinding} for {@code dstSet} at {@code dstBinding} is {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE}, the new active descriptor type <b>must</b> exist in the corresponding {@code pMutableDescriptorTypeLists} list for {@code dstBinding} if the new active descriptor type is not {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE}</li>
 * <li>If {@link VkDescriptorSetLayoutBinding} for {@code srcSet} at {@code srcBinding} is {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE} and the {@link VkDescriptorSetLayoutBinding} for {@code dstSet} at {@code dstBinding} is not {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE}, the active descriptor type for the source descriptor <b>must</b> match the descriptor type of {@code dstBinding}</li>
 * <li>If {@link VkDescriptorSetLayoutBinding} for {@code dstSet} at {@code dstBinding} is {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE}, and the new active descriptor type is {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE}, the {@code pMutableDescriptorTypeLists} for {@code srcBinding} and {@code dstBinding} <b>must</b> match exactly</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET STRUCTURE_TYPE_COPY_DESCRIPTOR_SET}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code srcSet} <b>must</b> be a valid {@code VkDescriptorSet} handle</li>
 * <li>{@code dstSet} <b>must</b> be a valid {@code VkDescriptorSet} handle</li>
 * <li>Both of {@code dstSet}, and {@code srcSet} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkUpdateDescriptorSets UpdateDescriptorSets}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCopyDescriptorSet {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDescriptorSet {@link #srcSet};
 *     uint32_t {@link #srcBinding};
 *     uint32_t {@link #srcArrayElement};
 *     VkDescriptorSet {@link #dstSet};
 *     uint32_t {@link #dstBinding};
 *     uint32_t {@link #dstArrayElement};
 *     uint32_t {@link #descriptorCount};
 * }</code></pre>
 */
public class VkCopyDescriptorSet extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCSET,
        SRCBINDING,
        SRCARRAYELEMENT,
        DSTSET,
        DSTBINDING,
        DSTARRAYELEMENT,
        DESCRIPTORCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSET = layout.offsetof(2);
        SRCBINDING = layout.offsetof(3);
        SRCARRAYELEMENT = layout.offsetof(4);
        DSTSET = layout.offsetof(5);
        DSTBINDING = layout.offsetof(6);
        DSTARRAYELEMENT = layout.offsetof(7);
        DESCRIPTORCOUNT = layout.offsetof(8);
    }

    /**
     * Creates a {@code VkCopyDescriptorSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyDescriptorSet(ByteBuffer container) {
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
    /** {@code srcSet}, {@code srcBinding}, and {@code srcArrayElement} are the source set, binding, and array element, respectively. If the descriptor binding identified by {@code srcSet} and {@code srcBinding} has a descriptor type of {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} then {@code srcArrayElement} specifies the starting byte offset within the binding to copy from. */
    @NativeType("VkDescriptorSet")
    public long srcSet() { return nsrcSet(address()); }
    /** see {@code srcSet} */
    @NativeType("uint32_t")
    public int srcBinding() { return nsrcBinding(address()); }
    /** see {@code srcSet} */
    @NativeType("uint32_t")
    public int srcArrayElement() { return nsrcArrayElement(address()); }
    /** {@code dstSet}, {@code dstBinding}, and {@code dstArrayElement} are the destination set, binding, and array element, respectively. If the descriptor binding identified by {@code dstSet} and {@code dstBinding} has a descriptor type of {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} then {@code dstArrayElement} specifies the starting byte offset within the binding to copy to. */
    @NativeType("VkDescriptorSet")
    public long dstSet() { return ndstSet(address()); }
    /** see {@code dstSet} */
    @NativeType("uint32_t")
    public int dstBinding() { return ndstBinding(address()); }
    /** see {@code dstSet} */
    @NativeType("uint32_t")
    public int dstArrayElement() { return ndstArrayElement(address()); }
    /** the number of descriptors to copy from the source to destination. If {@code descriptorCount} is greater than the number of remaining array elements in the source or destination binding, those affect consecutive bindings in a manner similar to {@link VkWriteDescriptorSet} above. If the descriptor binding identified by {@code srcSet} and {@code srcBinding} has a descriptor type of {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK} then {@code descriptorCount} specifies the number of bytes to copy and the remaining array elements in the source or destination binding refer to the remaining number of bytes in those. */
    @NativeType("uint32_t")
    public int descriptorCount() { return ndescriptorCount(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCopyDescriptorSet sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET STRUCTURE_TYPE_COPY_DESCRIPTOR_SET} value to the {@link #sType} field. */
    public VkCopyDescriptorSet sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCopyDescriptorSet pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #srcSet} field. */
    public VkCopyDescriptorSet srcSet(@NativeType("VkDescriptorSet") long value) { nsrcSet(address(), value); return this; }
    /** Sets the specified value to the {@link #srcBinding} field. */
    public VkCopyDescriptorSet srcBinding(@NativeType("uint32_t") int value) { nsrcBinding(address(), value); return this; }
    /** Sets the specified value to the {@link #srcArrayElement} field. */
    public VkCopyDescriptorSet srcArrayElement(@NativeType("uint32_t") int value) { nsrcArrayElement(address(), value); return this; }
    /** Sets the specified value to the {@link #dstSet} field. */
    public VkCopyDescriptorSet dstSet(@NativeType("VkDescriptorSet") long value) { ndstSet(address(), value); return this; }
    /** Sets the specified value to the {@link #dstBinding} field. */
    public VkCopyDescriptorSet dstBinding(@NativeType("uint32_t") int value) { ndstBinding(address(), value); return this; }
    /** Sets the specified value to the {@link #dstArrayElement} field. */
    public VkCopyDescriptorSet dstArrayElement(@NativeType("uint32_t") int value) { ndstArrayElement(address(), value); return this; }
    /** Sets the specified value to the {@link #descriptorCount} field. */
    public VkCopyDescriptorSet descriptorCount(@NativeType("uint32_t") int value) { ndescriptorCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyDescriptorSet set(
        int sType,
        long pNext,
        long srcSet,
        int srcBinding,
        int srcArrayElement,
        long dstSet,
        int dstBinding,
        int dstArrayElement,
        int descriptorCount
    ) {
        sType(sType);
        pNext(pNext);
        srcSet(srcSet);
        srcBinding(srcBinding);
        srcArrayElement(srcArrayElement);
        dstSet(dstSet);
        dstBinding(dstBinding);
        dstArrayElement(dstArrayElement);
        descriptorCount(descriptorCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCopyDescriptorSet set(VkCopyDescriptorSet src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyDescriptorSet} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyDescriptorSet malloc() {
        return wrap(VkCopyDescriptorSet.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCopyDescriptorSet} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyDescriptorSet calloc() {
        return wrap(VkCopyDescriptorSet.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCopyDescriptorSet} instance allocated with {@link BufferUtils}. */
    public static VkCopyDescriptorSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCopyDescriptorSet.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCopyDescriptorSet} instance for the specified memory address. */
    public static VkCopyDescriptorSet create(long address) {
        return wrap(VkCopyDescriptorSet.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyDescriptorSet createSafe(long address) {
        return address == NULL ? null : wrap(VkCopyDescriptorSet.class, address);
    }

    /**
     * Returns a new {@link VkCopyDescriptorSet.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyDescriptorSet.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyDescriptorSet.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyDescriptorSet.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyDescriptorSet.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyDescriptorSet.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCopyDescriptorSet.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyDescriptorSet.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyDescriptorSet.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCopyDescriptorSet mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCopyDescriptorSet callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCopyDescriptorSet mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCopyDescriptorSet callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCopyDescriptorSet.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCopyDescriptorSet.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCopyDescriptorSet.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCopyDescriptorSet.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkCopyDescriptorSet} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyDescriptorSet malloc(MemoryStack stack) {
        return wrap(VkCopyDescriptorSet.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCopyDescriptorSet} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyDescriptorSet calloc(MemoryStack stack) {
        return wrap(VkCopyDescriptorSet.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCopyDescriptorSet.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyDescriptorSet.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyDescriptorSet.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyDescriptorSet.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCopyDescriptorSet.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyDescriptorSet.PNEXT); }
    /** Unsafe version of {@link #srcSet}. */
    public static long nsrcSet(long struct) { return UNSAFE.getLong(null, struct + VkCopyDescriptorSet.SRCSET); }
    /** Unsafe version of {@link #srcBinding}. */
    public static int nsrcBinding(long struct) { return UNSAFE.getInt(null, struct + VkCopyDescriptorSet.SRCBINDING); }
    /** Unsafe version of {@link #srcArrayElement}. */
    public static int nsrcArrayElement(long struct) { return UNSAFE.getInt(null, struct + VkCopyDescriptorSet.SRCARRAYELEMENT); }
    /** Unsafe version of {@link #dstSet}. */
    public static long ndstSet(long struct) { return UNSAFE.getLong(null, struct + VkCopyDescriptorSet.DSTSET); }
    /** Unsafe version of {@link #dstBinding}. */
    public static int ndstBinding(long struct) { return UNSAFE.getInt(null, struct + VkCopyDescriptorSet.DSTBINDING); }
    /** Unsafe version of {@link #dstArrayElement}. */
    public static int ndstArrayElement(long struct) { return UNSAFE.getInt(null, struct + VkCopyDescriptorSet.DSTARRAYELEMENT); }
    /** Unsafe version of {@link #descriptorCount}. */
    public static int ndescriptorCount(long struct) { return UNSAFE.getInt(null, struct + VkCopyDescriptorSet.DESCRIPTORCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyDescriptorSet.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyDescriptorSet.PNEXT, value); }
    /** Unsafe version of {@link #srcSet(long) srcSet}. */
    public static void nsrcSet(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyDescriptorSet.SRCSET, value); }
    /** Unsafe version of {@link #srcBinding(int) srcBinding}. */
    public static void nsrcBinding(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyDescriptorSet.SRCBINDING, value); }
    /** Unsafe version of {@link #srcArrayElement(int) srcArrayElement}. */
    public static void nsrcArrayElement(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyDescriptorSet.SRCARRAYELEMENT, value); }
    /** Unsafe version of {@link #dstSet(long) dstSet}. */
    public static void ndstSet(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyDescriptorSet.DSTSET, value); }
    /** Unsafe version of {@link #dstBinding(int) dstBinding}. */
    public static void ndstBinding(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyDescriptorSet.DSTBINDING, value); }
    /** Unsafe version of {@link #dstArrayElement(int) dstArrayElement}. */
    public static void ndstArrayElement(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyDescriptorSet.DSTARRAYELEMENT, value); }
    /** Unsafe version of {@link #descriptorCount(int) descriptorCount}. */
    public static void ndescriptorCount(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyDescriptorSet.DESCRIPTORCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkCopyDescriptorSet} structs. */
    public static class Buffer extends StructBuffer<VkCopyDescriptorSet, Buffer> implements NativeResource {

        private static final VkCopyDescriptorSet ELEMENT_FACTORY = VkCopyDescriptorSet.create(-1L);

        /**
         * Creates a new {@code VkCopyDescriptorSet.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyDescriptorSet#SIZEOF}, and its mark will be undefined.
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
        protected VkCopyDescriptorSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCopyDescriptorSet#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyDescriptorSet.nsType(address()); }
        /** @return the value of the {@link VkCopyDescriptorSet#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyDescriptorSet.npNext(address()); }
        /** @return the value of the {@link VkCopyDescriptorSet#srcSet} field. */
        @NativeType("VkDescriptorSet")
        public long srcSet() { return VkCopyDescriptorSet.nsrcSet(address()); }
        /** @return the value of the {@link VkCopyDescriptorSet#srcBinding} field. */
        @NativeType("uint32_t")
        public int srcBinding() { return VkCopyDescriptorSet.nsrcBinding(address()); }
        /** @return the value of the {@link VkCopyDescriptorSet#srcArrayElement} field. */
        @NativeType("uint32_t")
        public int srcArrayElement() { return VkCopyDescriptorSet.nsrcArrayElement(address()); }
        /** @return the value of the {@link VkCopyDescriptorSet#dstSet} field. */
        @NativeType("VkDescriptorSet")
        public long dstSet() { return VkCopyDescriptorSet.ndstSet(address()); }
        /** @return the value of the {@link VkCopyDescriptorSet#dstBinding} field. */
        @NativeType("uint32_t")
        public int dstBinding() { return VkCopyDescriptorSet.ndstBinding(address()); }
        /** @return the value of the {@link VkCopyDescriptorSet#dstArrayElement} field. */
        @NativeType("uint32_t")
        public int dstArrayElement() { return VkCopyDescriptorSet.ndstArrayElement(address()); }
        /** @return the value of the {@link VkCopyDescriptorSet#descriptorCount} field. */
        @NativeType("uint32_t")
        public int descriptorCount() { return VkCopyDescriptorSet.ndescriptorCount(address()); }

        /** Sets the specified value to the {@link VkCopyDescriptorSet#sType} field. */
        public VkCopyDescriptorSet.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyDescriptorSet.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET STRUCTURE_TYPE_COPY_DESCRIPTOR_SET} value to the {@link VkCopyDescriptorSet#sType} field. */
        public VkCopyDescriptorSet.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET); }
        /** Sets the specified value to the {@link VkCopyDescriptorSet#pNext} field. */
        public VkCopyDescriptorSet.Buffer pNext(@NativeType("void const *") long value) { VkCopyDescriptorSet.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyDescriptorSet#srcSet} field. */
        public VkCopyDescriptorSet.Buffer srcSet(@NativeType("VkDescriptorSet") long value) { VkCopyDescriptorSet.nsrcSet(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyDescriptorSet#srcBinding} field. */
        public VkCopyDescriptorSet.Buffer srcBinding(@NativeType("uint32_t") int value) { VkCopyDescriptorSet.nsrcBinding(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyDescriptorSet#srcArrayElement} field. */
        public VkCopyDescriptorSet.Buffer srcArrayElement(@NativeType("uint32_t") int value) { VkCopyDescriptorSet.nsrcArrayElement(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyDescriptorSet#dstSet} field. */
        public VkCopyDescriptorSet.Buffer dstSet(@NativeType("VkDescriptorSet") long value) { VkCopyDescriptorSet.ndstSet(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyDescriptorSet#dstBinding} field. */
        public VkCopyDescriptorSet.Buffer dstBinding(@NativeType("uint32_t") int value) { VkCopyDescriptorSet.ndstBinding(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyDescriptorSet#dstArrayElement} field. */
        public VkCopyDescriptorSet.Buffer dstArrayElement(@NativeType("uint32_t") int value) { VkCopyDescriptorSet.ndstArrayElement(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyDescriptorSet#descriptorCount} field. */
        public VkCopyDescriptorSet.Buffer descriptorCount(@NativeType("uint32_t") int value) { VkCopyDescriptorSet.ndescriptorCount(address(), value); return this; }

    }

}