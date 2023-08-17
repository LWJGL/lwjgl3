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
 * <p>If {@code mutableDescriptorTypeListCount} is zero or if this structure is not included in the {@code pNext} chain, the {@link VkMutableDescriptorTypeListEXT} for each element is considered to be zero or {@code NULL} for each member. Otherwise, the descriptor set layout binding at {@link VkDescriptorSetLayoutCreateInfo}{@code ::pBindings}[i] uses the descriptor type lists in {@link VkMutableDescriptorTypeCreateInfoEXT}{@code ::pMutableDescriptorTypeLists}[i].</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTMutableDescriptorType#VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT}</li>
 * <li>If {@code mutableDescriptorTypeListCount} is not 0, {@code pMutableDescriptorTypeLists} <b>must</b> be a valid pointer to an array of {@code mutableDescriptorTypeListCount} valid {@link VkMutableDescriptorTypeListEXT} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkMutableDescriptorTypeListEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMutableDescriptorTypeCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #mutableDescriptorTypeListCount};
 *     {@link VkMutableDescriptorTypeListEXT VkMutableDescriptorTypeListEXT} const * {@link #pMutableDescriptorTypeLists};
 * }</code></pre>
 */
public class VkMutableDescriptorTypeCreateInfoEXT extends Struct<VkMutableDescriptorTypeCreateInfoEXT> implements NativeResource {

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

    protected VkMutableDescriptorTypeCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMutableDescriptorTypeCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkMutableDescriptorTypeCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkMutableDescriptorTypeCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMutableDescriptorTypeCreateInfoEXT(ByteBuffer container) {
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
    /** the number of elements in {@code pMutableDescriptorTypeLists}. */
    @NativeType("uint32_t")
    public int mutableDescriptorTypeListCount() { return nmutableDescriptorTypeListCount(address()); }
    /** a pointer to an array of {@link VkMutableDescriptorTypeListEXT} structures. */
    @Nullable
    @NativeType("VkMutableDescriptorTypeListEXT const *")
    public VkMutableDescriptorTypeListEXT.Buffer pMutableDescriptorTypeLists() { return npMutableDescriptorTypeLists(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMutableDescriptorTypeCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMutableDescriptorType#VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkMutableDescriptorTypeCreateInfoEXT sType$Default() { return sType(EXTMutableDescriptorType.VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMutableDescriptorTypeCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkMutableDescriptorTypeListEXT.Buffer} to the {@link #pMutableDescriptorTypeLists} field. */
    public VkMutableDescriptorTypeCreateInfoEXT pMutableDescriptorTypeLists(@Nullable @NativeType("VkMutableDescriptorTypeListEXT const *") VkMutableDescriptorTypeListEXT.Buffer value) { npMutableDescriptorTypeLists(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMutableDescriptorTypeCreateInfoEXT set(
        int sType,
        long pNext,
        @Nullable VkMutableDescriptorTypeListEXT.Buffer pMutableDescriptorTypeLists
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
    public VkMutableDescriptorTypeCreateInfoEXT set(VkMutableDescriptorTypeCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMutableDescriptorTypeCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMutableDescriptorTypeCreateInfoEXT malloc() {
        return new VkMutableDescriptorTypeCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMutableDescriptorTypeCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMutableDescriptorTypeCreateInfoEXT calloc() {
        return new VkMutableDescriptorTypeCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMutableDescriptorTypeCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkMutableDescriptorTypeCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMutableDescriptorTypeCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkMutableDescriptorTypeCreateInfoEXT} instance for the specified memory address. */
    public static VkMutableDescriptorTypeCreateInfoEXT create(long address) {
        return new VkMutableDescriptorTypeCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMutableDescriptorTypeCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkMutableDescriptorTypeCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMutableDescriptorTypeCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMutableDescriptorTypeCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMutableDescriptorTypeCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMutableDescriptorTypeCreateInfoEXT malloc(MemoryStack stack) {
        return new VkMutableDescriptorTypeCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMutableDescriptorTypeCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMutableDescriptorTypeCreateInfoEXT calloc(MemoryStack stack) {
        return new VkMutableDescriptorTypeCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMutableDescriptorTypeCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMutableDescriptorTypeCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #mutableDescriptorTypeListCount}. */
    public static int nmutableDescriptorTypeListCount(long struct) { return UNSAFE.getInt(null, struct + VkMutableDescriptorTypeCreateInfoEXT.MUTABLEDESCRIPTORTYPELISTCOUNT); }
    /** Unsafe version of {@link #pMutableDescriptorTypeLists}. */
    @Nullable public static VkMutableDescriptorTypeListEXT.Buffer npMutableDescriptorTypeLists(long struct) { return VkMutableDescriptorTypeListEXT.createSafe(memGetAddress(struct + VkMutableDescriptorTypeCreateInfoEXT.PMUTABLEDESCRIPTORTYPELISTS), nmutableDescriptorTypeListCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMutableDescriptorTypeCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMutableDescriptorTypeCreateInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code mutableDescriptorTypeListCount} field of the specified {@code struct}. */
    public static void nmutableDescriptorTypeListCount(long struct, int value) { UNSAFE.putInt(null, struct + VkMutableDescriptorTypeCreateInfoEXT.MUTABLEDESCRIPTORTYPELISTCOUNT, value); }
    /** Unsafe version of {@link #pMutableDescriptorTypeLists(VkMutableDescriptorTypeListEXT.Buffer) pMutableDescriptorTypeLists}. */
    public static void npMutableDescriptorTypeLists(long struct, @Nullable VkMutableDescriptorTypeListEXT.Buffer value) { memPutAddress(struct + VkMutableDescriptorTypeCreateInfoEXT.PMUTABLEDESCRIPTORTYPELISTS, memAddressSafe(value)); nmutableDescriptorTypeListCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int mutableDescriptorTypeListCount = nmutableDescriptorTypeListCount(struct);
        if (mutableDescriptorTypeListCount != 0) {
            long pMutableDescriptorTypeLists = memGetAddress(struct + VkMutableDescriptorTypeCreateInfoEXT.PMUTABLEDESCRIPTORTYPELISTS);
            check(pMutableDescriptorTypeLists);
            validate(pMutableDescriptorTypeLists, mutableDescriptorTypeListCount, VkMutableDescriptorTypeListEXT.SIZEOF, VkMutableDescriptorTypeListEXT::validate);
        }
    }

    // -----------------------------------

    /** An array of {@link VkMutableDescriptorTypeCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkMutableDescriptorTypeCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkMutableDescriptorTypeCreateInfoEXT ELEMENT_FACTORY = VkMutableDescriptorTypeCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkMutableDescriptorTypeCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMutableDescriptorTypeCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMutableDescriptorTypeCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMutableDescriptorTypeCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMutableDescriptorTypeCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkMutableDescriptorTypeCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMutableDescriptorTypeCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkMutableDescriptorTypeCreateInfoEXT#mutableDescriptorTypeListCount} field. */
        @NativeType("uint32_t")
        public int mutableDescriptorTypeListCount() { return VkMutableDescriptorTypeCreateInfoEXT.nmutableDescriptorTypeListCount(address()); }
        /** @return a {@link VkMutableDescriptorTypeListEXT.Buffer} view of the struct array pointed to by the {@link VkMutableDescriptorTypeCreateInfoEXT#pMutableDescriptorTypeLists} field. */
        @Nullable
        @NativeType("VkMutableDescriptorTypeListEXT const *")
        public VkMutableDescriptorTypeListEXT.Buffer pMutableDescriptorTypeLists() { return VkMutableDescriptorTypeCreateInfoEXT.npMutableDescriptorTypeLists(address()); }

        /** Sets the specified value to the {@link VkMutableDescriptorTypeCreateInfoEXT#sType} field. */
        public VkMutableDescriptorTypeCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkMutableDescriptorTypeCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMutableDescriptorType#VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT} value to the {@link VkMutableDescriptorTypeCreateInfoEXT#sType} field. */
        public VkMutableDescriptorTypeCreateInfoEXT.Buffer sType$Default() { return sType(EXTMutableDescriptorType.VK_STRUCTURE_TYPE_MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkMutableDescriptorTypeCreateInfoEXT#pNext} field. */
        public VkMutableDescriptorTypeCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkMutableDescriptorTypeCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkMutableDescriptorTypeListEXT.Buffer} to the {@link VkMutableDescriptorTypeCreateInfoEXT#pMutableDescriptorTypeLists} field. */
        public VkMutableDescriptorTypeCreateInfoEXT.Buffer pMutableDescriptorTypeLists(@Nullable @NativeType("VkMutableDescriptorTypeListEXT const *") VkMutableDescriptorTypeListEXT.Buffer value) { VkMutableDescriptorTypeCreateInfoEXT.npMutableDescriptorTypeLists(address(), value); return this; }

    }

}