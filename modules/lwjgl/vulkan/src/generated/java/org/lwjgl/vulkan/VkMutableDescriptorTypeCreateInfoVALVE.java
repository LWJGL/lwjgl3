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
 * Structure describing the list of possible active descriptor types for mutable type descriptors.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code mutableDescriptorTypeListCount} is zero or if this structure is not included in the {@code pNext} chain, the {@link VkMutableDescriptorTypeListVALVE} for each element is considered to be zero or {@code NULL} for each member. Otherwise, the descriptor set layout binding at {@link VkDescriptorSetLayoutCreateInfo}{@code ::pBindings}[i] uses the descriptor type lists in {@link VkMutableDescriptorTypeCreateInfoVALVE}{@code ::pMutableDescriptorTypeLists}[i].</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VALVEMutableDescriptorType#VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_VALVE STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_VALVE}</li>
 * <li>If {@code mutableDescriptorTypeListCount} is not 0, {@code pMutableDescriptorTypeLists} <b>must</b> be a valid pointer to an array of {@code mutableDescriptorTypeListCount} valid {@link VkMutableDescriptorTypeListVALVE} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkMutableDescriptorTypeListVALVE}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMutableDescriptorTypeCreateInfoVALVE {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #mutableDescriptorTypeListCount};
 *     {@link VkMutableDescriptorTypeListVALVE VkMutableDescriptorTypeListVALVE} const * {@link #pMutableDescriptorTypeLists};
 * }</code></pre>
 */
public class VkMutableDescriptorTypeCreateInfoVALVE extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MUTABLEDESCRIPTORTYPELISTCOUNT,
        PMUTABLEDESCRIPTORTYPELISTS;

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
        MUTABLEDESCRIPTORTYPELISTCOUNT = layout.offsetof(2);
        PMUTABLEDESCRIPTORTYPELISTS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkMutableDescriptorTypeCreateInfoVALVE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMutableDescriptorTypeCreateInfoVALVE(ByteBuffer container) {
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
    /** the number of elements in {@code pMutableDescriptorTypeLists}. */
    @NativeType("uint32_t")
    public int mutableDescriptorTypeListCount() { return nmutableDescriptorTypeListCount(address()); }
    /** a pointer to an array of {@link VkMutableDescriptorTypeListVALVE} structures. */
    @Nullable
    @NativeType("VkMutableDescriptorTypeListVALVE const *")
    public VkMutableDescriptorTypeListVALVE.Buffer pMutableDescriptorTypeLists() { return npMutableDescriptorTypeLists(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMutableDescriptorTypeCreateInfoVALVE sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VALVEMutableDescriptorType#VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_VALVE STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_VALVE} value to the {@link #sType} field. */
    public VkMutableDescriptorTypeCreateInfoVALVE sType$Default() { return sType(VALVEMutableDescriptorType.VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_VALVE); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMutableDescriptorTypeCreateInfoVALVE pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkMutableDescriptorTypeListVALVE.Buffer} to the {@link #pMutableDescriptorTypeLists} field. */
    public VkMutableDescriptorTypeCreateInfoVALVE pMutableDescriptorTypeLists(@Nullable @NativeType("VkMutableDescriptorTypeListVALVE const *") VkMutableDescriptorTypeListVALVE.Buffer value) { npMutableDescriptorTypeLists(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMutableDescriptorTypeCreateInfoVALVE set(
        int sType,
        long pNext,
        @Nullable VkMutableDescriptorTypeListVALVE.Buffer pMutableDescriptorTypeLists
    ) {
        sType(sType);
        pNext(pNext);
        pMutableDescriptorTypeLists(pMutableDescriptorTypeLists);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMutableDescriptorTypeCreateInfoVALVE set(VkMutableDescriptorTypeCreateInfoVALVE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMutableDescriptorTypeCreateInfoVALVE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMutableDescriptorTypeCreateInfoVALVE malloc() {
        return wrap(VkMutableDescriptorTypeCreateInfoVALVE.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMutableDescriptorTypeCreateInfoVALVE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMutableDescriptorTypeCreateInfoVALVE calloc() {
        return wrap(VkMutableDescriptorTypeCreateInfoVALVE.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMutableDescriptorTypeCreateInfoVALVE} instance allocated with {@link BufferUtils}. */
    public static VkMutableDescriptorTypeCreateInfoVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMutableDescriptorTypeCreateInfoVALVE.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMutableDescriptorTypeCreateInfoVALVE} instance for the specified memory address. */
    public static VkMutableDescriptorTypeCreateInfoVALVE create(long address) {
        return wrap(VkMutableDescriptorTypeCreateInfoVALVE.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMutableDescriptorTypeCreateInfoVALVE createSafe(long address) {
        return address == NULL ? null : wrap(VkMutableDescriptorTypeCreateInfoVALVE.class, address);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeCreateInfoVALVE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeCreateInfoVALVE.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeCreateInfoVALVE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeCreateInfoVALVE.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeCreateInfoVALVE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeCreateInfoVALVE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMutableDescriptorTypeCreateInfoVALVE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeCreateInfoVALVE.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMutableDescriptorTypeCreateInfoVALVE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkMutableDescriptorTypeCreateInfoVALVE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMutableDescriptorTypeCreateInfoVALVE malloc(MemoryStack stack) {
        return wrap(VkMutableDescriptorTypeCreateInfoVALVE.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMutableDescriptorTypeCreateInfoVALVE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMutableDescriptorTypeCreateInfoVALVE calloc(MemoryStack stack) {
        return wrap(VkMutableDescriptorTypeCreateInfoVALVE.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeCreateInfoVALVE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeCreateInfoVALVE.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeCreateInfoVALVE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeCreateInfoVALVE.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMutableDescriptorTypeCreateInfoVALVE.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMutableDescriptorTypeCreateInfoVALVE.PNEXT); }
    /** Unsafe version of {@link #mutableDescriptorTypeListCount}. */
    public static int nmutableDescriptorTypeListCount(long struct) { return UNSAFE.getInt(null, struct + VkMutableDescriptorTypeCreateInfoVALVE.MUTABLEDESCRIPTORTYPELISTCOUNT); }
    /** Unsafe version of {@link #pMutableDescriptorTypeLists}. */
    @Nullable public static VkMutableDescriptorTypeListVALVE.Buffer npMutableDescriptorTypeLists(long struct) { return VkMutableDescriptorTypeListVALVE.createSafe(memGetAddress(struct + VkMutableDescriptorTypeCreateInfoVALVE.PMUTABLEDESCRIPTORTYPELISTS), nmutableDescriptorTypeListCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMutableDescriptorTypeCreateInfoVALVE.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMutableDescriptorTypeCreateInfoVALVE.PNEXT, value); }
    /** Sets the specified value to the {@code mutableDescriptorTypeListCount} field of the specified {@code struct}. */
    public static void nmutableDescriptorTypeListCount(long struct, int value) { UNSAFE.putInt(null, struct + VkMutableDescriptorTypeCreateInfoVALVE.MUTABLEDESCRIPTORTYPELISTCOUNT, value); }
    /** Unsafe version of {@link #pMutableDescriptorTypeLists(VkMutableDescriptorTypeListVALVE.Buffer) pMutableDescriptorTypeLists}. */
    public static void npMutableDescriptorTypeLists(long struct, @Nullable VkMutableDescriptorTypeListVALVE.Buffer value) { memPutAddress(struct + VkMutableDescriptorTypeCreateInfoVALVE.PMUTABLEDESCRIPTORTYPELISTS, memAddressSafe(value)); nmutableDescriptorTypeListCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int mutableDescriptorTypeListCount = nmutableDescriptorTypeListCount(struct);
        if (mutableDescriptorTypeListCount != 0) {
            long pMutableDescriptorTypeLists = memGetAddress(struct + VkMutableDescriptorTypeCreateInfoVALVE.PMUTABLEDESCRIPTORTYPELISTS);
            check(pMutableDescriptorTypeLists);
            validate(pMutableDescriptorTypeLists, mutableDescriptorTypeListCount, VkMutableDescriptorTypeListVALVE.SIZEOF, VkMutableDescriptorTypeListVALVE::validate);
        }
    }

    // -----------------------------------

    /** An array of {@link VkMutableDescriptorTypeCreateInfoVALVE} structs. */
    public static class Buffer extends StructBuffer<VkMutableDescriptorTypeCreateInfoVALVE, Buffer> implements NativeResource {

        private static final VkMutableDescriptorTypeCreateInfoVALVE ELEMENT_FACTORY = VkMutableDescriptorTypeCreateInfoVALVE.create(-1L);

        /**
         * Creates a new {@code VkMutableDescriptorTypeCreateInfoVALVE.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMutableDescriptorTypeCreateInfoVALVE#SIZEOF}, and its mark will be undefined.
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
        protected VkMutableDescriptorTypeCreateInfoVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMutableDescriptorTypeCreateInfoVALVE#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMutableDescriptorTypeCreateInfoVALVE.nsType(address()); }
        /** @return the value of the {@link VkMutableDescriptorTypeCreateInfoVALVE#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMutableDescriptorTypeCreateInfoVALVE.npNext(address()); }
        /** @return the value of the {@link VkMutableDescriptorTypeCreateInfoVALVE#mutableDescriptorTypeListCount} field. */
        @NativeType("uint32_t")
        public int mutableDescriptorTypeListCount() { return VkMutableDescriptorTypeCreateInfoVALVE.nmutableDescriptorTypeListCount(address()); }
        /** @return a {@link VkMutableDescriptorTypeListVALVE.Buffer} view of the struct array pointed to by the {@link VkMutableDescriptorTypeCreateInfoVALVE#pMutableDescriptorTypeLists} field. */
        @Nullable
        @NativeType("VkMutableDescriptorTypeListVALVE const *")
        public VkMutableDescriptorTypeListVALVE.Buffer pMutableDescriptorTypeLists() { return VkMutableDescriptorTypeCreateInfoVALVE.npMutableDescriptorTypeLists(address()); }

        /** Sets the specified value to the {@link VkMutableDescriptorTypeCreateInfoVALVE#sType} field. */
        public VkMutableDescriptorTypeCreateInfoVALVE.Buffer sType(@NativeType("VkStructureType") int value) { VkMutableDescriptorTypeCreateInfoVALVE.nsType(address(), value); return this; }
        /** Sets the {@link VALVEMutableDescriptorType#VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_VALVE STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_VALVE} value to the {@link VkMutableDescriptorTypeCreateInfoVALVE#sType} field. */
        public VkMutableDescriptorTypeCreateInfoVALVE.Buffer sType$Default() { return sType(VALVEMutableDescriptorType.VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_VALVE); }
        /** Sets the specified value to the {@link VkMutableDescriptorTypeCreateInfoVALVE#pNext} field. */
        public VkMutableDescriptorTypeCreateInfoVALVE.Buffer pNext(@NativeType("void const *") long value) { VkMutableDescriptorTypeCreateInfoVALVE.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkMutableDescriptorTypeListVALVE.Buffer} to the {@link VkMutableDescriptorTypeCreateInfoVALVE#pMutableDescriptorTypeLists} field. */
        public VkMutableDescriptorTypeCreateInfoVALVE.Buffer pMutableDescriptorTypeLists(@Nullable @NativeType("VkMutableDescriptorTypeListVALVE const *") VkMutableDescriptorTypeListVALVE.Buffer value) { VkMutableDescriptorTypeCreateInfoVALVE.npMutableDescriptorTypeLists(address(), value); return this; }

    }

}