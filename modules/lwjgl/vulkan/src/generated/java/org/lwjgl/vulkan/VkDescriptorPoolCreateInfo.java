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
 * <pre><code>
 * struct VkDescriptorPoolCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDescriptorPoolCreateFlags flags;
 *     uint32_t maxSets;
 *     uint32_t poolSizeCount;
 *     {@link VkDescriptorPoolSize VkDescriptorPoolSize} const * pPoolSizes;
 * }</code></pre>
 */
public class VkDescriptorPoolCreateInfo extends Struct<VkDescriptorPoolCreateInfo> implements NativeResource {

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

    protected VkDescriptorPoolCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorPoolCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorPoolCreateInfo(address, container);
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkDescriptorPoolCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code maxSets} field. */
    @NativeType("uint32_t")
    public int maxSets() { return nmaxSets(address()); }
    /** @return the value of the {@code poolSizeCount} field. */
    @NativeType("uint32_t")
    public int poolSizeCount() { return npoolSizeCount(address()); }
    /** @return a {@link VkDescriptorPoolSize.Buffer} view of the struct array pointed to by the {@code pPoolSizes} field. */
    @NativeType("VkDescriptorPoolSize const *")
    public VkDescriptorPoolSize.@Nullable Buffer pPoolSizes() { return npPoolSizes(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDescriptorPoolCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO} value to the {@code sType} field. */
    public VkDescriptorPoolCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDescriptorPoolCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDataGraphProcessingEngineCreateInfoARM} value to the {@code pNext} chain. */
    public VkDescriptorPoolCreateInfo pNext(VkDataGraphProcessingEngineCreateInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDescriptorPoolInlineUniformBlockCreateInfo} value to the {@code pNext} chain. */
    public VkDescriptorPoolCreateInfo pNext(VkDescriptorPoolInlineUniformBlockCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT} value to the {@code pNext} chain. */
    public VkDescriptorPoolCreateInfo pNext(VkDescriptorPoolInlineUniformBlockCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMutableDescriptorTypeCreateInfoEXT} value to the {@code pNext} chain. */
    public VkDescriptorPoolCreateInfo pNext(VkMutableDescriptorTypeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMutableDescriptorTypeCreateInfoVALVE} value to the {@code pNext} chain. */
    public VkDescriptorPoolCreateInfo pNext(VkMutableDescriptorTypeCreateInfoVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkDescriptorPoolCreateInfo flags(@NativeType("VkDescriptorPoolCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code maxSets} field. */
    public VkDescriptorPoolCreateInfo maxSets(@NativeType("uint32_t") int value) { nmaxSets(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorPoolSize.Buffer} to the {@code pPoolSizes} field. */
    public VkDescriptorPoolCreateInfo pPoolSizes(@NativeType("VkDescriptorPoolSize const *") VkDescriptorPoolSize.@Nullable Buffer value) { npPoolSizes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorPoolCreateInfo set(
        int sType,
        long pNext,
        int flags,
        int maxSets,
        VkDescriptorPoolSize.@Nullable Buffer pPoolSizes
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
        return new VkDescriptorPoolCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorPoolCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorPoolCreateInfo calloc() {
        return new VkDescriptorPoolCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorPoolCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorPoolCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorPoolCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorPoolCreateInfo} instance for the specified memory address. */
    public static VkDescriptorPoolCreateInfo create(long address) {
        return new VkDescriptorPoolCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorPoolCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkDescriptorPoolCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorPoolCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorPoolCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
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
        return new VkDescriptorPoolCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorPoolCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorPoolCreateInfo calloc(MemoryStack stack) {
        return new VkDescriptorPoolCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorPoolCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDescriptorPoolCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorPoolCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkDescriptorPoolCreateInfo.FLAGS); }
    /** Unsafe version of {@link #maxSets}. */
    public static int nmaxSets(long struct) { return memGetInt(struct + VkDescriptorPoolCreateInfo.MAXSETS); }
    /** Unsafe version of {@link #poolSizeCount}. */
    public static int npoolSizeCount(long struct) { return memGetInt(struct + VkDescriptorPoolCreateInfo.POOLSIZECOUNT); }
    /** Unsafe version of {@link #pPoolSizes}. */
    public static VkDescriptorPoolSize.@Nullable Buffer npPoolSizes(long struct) { return VkDescriptorPoolSize.createSafe(memGetAddress(struct + VkDescriptorPoolCreateInfo.PPOOLSIZES), npoolSizeCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDescriptorPoolCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorPoolCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkDescriptorPoolCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #maxSets(int) maxSets}. */
    public static void nmaxSets(long struct, int value) { memPutInt(struct + VkDescriptorPoolCreateInfo.MAXSETS, value); }
    /** Sets the specified value to the {@code poolSizeCount} field of the specified {@code struct}. */
    public static void npoolSizeCount(long struct, int value) { memPutInt(struct + VkDescriptorPoolCreateInfo.POOLSIZECOUNT, value); }
    /** Unsafe version of {@link #pPoolSizes(VkDescriptorPoolSize.Buffer) pPoolSizes}. */
    public static void npPoolSizes(long struct, VkDescriptorPoolSize.@Nullable Buffer value) { memPutAddress(struct + VkDescriptorPoolCreateInfo.PPOOLSIZES, memAddressSafe(value)); npoolSizeCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (npoolSizeCount(struct) != 0) {
            check(memGetAddress(struct + VkDescriptorPoolCreateInfo.PPOOLSIZES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkDescriptorPoolCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorPoolCreateInfo, Buffer> implements NativeResource {

        private static final VkDescriptorPoolCreateInfo ELEMENT_FACTORY = VkDescriptorPoolCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkDescriptorPoolCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorPoolCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorPoolCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorPoolCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDescriptorPoolCreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkDescriptorPoolCreateFlags")
        public int flags() { return VkDescriptorPoolCreateInfo.nflags(address()); }
        /** @return the value of the {@code maxSets} field. */
        @NativeType("uint32_t")
        public int maxSets() { return VkDescriptorPoolCreateInfo.nmaxSets(address()); }
        /** @return the value of the {@code poolSizeCount} field. */
        @NativeType("uint32_t")
        public int poolSizeCount() { return VkDescriptorPoolCreateInfo.npoolSizeCount(address()); }
        /** @return a {@link VkDescriptorPoolSize.Buffer} view of the struct array pointed to by the {@code pPoolSizes} field. */
        @NativeType("VkDescriptorPoolSize const *")
        public VkDescriptorPoolSize.@Nullable Buffer pPoolSizes() { return VkDescriptorPoolCreateInfo.npPoolSizes(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDescriptorPoolCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorPoolCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO} value to the {@code sType} field. */
        public VkDescriptorPoolCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDescriptorPoolCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorPoolCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDataGraphProcessingEngineCreateInfoARM} value to the {@code pNext} chain. */
        public VkDescriptorPoolCreateInfo.Buffer pNext(VkDataGraphProcessingEngineCreateInfoARM value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDescriptorPoolInlineUniformBlockCreateInfo} value to the {@code pNext} chain. */
        public VkDescriptorPoolCreateInfo.Buffer pNext(VkDescriptorPoolInlineUniformBlockCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDescriptorPoolInlineUniformBlockCreateInfoEXT} value to the {@code pNext} chain. */
        public VkDescriptorPoolCreateInfo.Buffer pNext(VkDescriptorPoolInlineUniformBlockCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMutableDescriptorTypeCreateInfoEXT} value to the {@code pNext} chain. */
        public VkDescriptorPoolCreateInfo.Buffer pNext(VkMutableDescriptorTypeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMutableDescriptorTypeCreateInfoVALVE} value to the {@code pNext} chain. */
        public VkDescriptorPoolCreateInfo.Buffer pNext(VkMutableDescriptorTypeCreateInfoVALVE value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkDescriptorPoolCreateInfo.Buffer flags(@NativeType("VkDescriptorPoolCreateFlags") int value) { VkDescriptorPoolCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code maxSets} field. */
        public VkDescriptorPoolCreateInfo.Buffer maxSets(@NativeType("uint32_t") int value) { VkDescriptorPoolCreateInfo.nmaxSets(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorPoolSize.Buffer} to the {@code pPoolSizes} field. */
        public VkDescriptorPoolCreateInfo.Buffer pPoolSizes(@NativeType("VkDescriptorPoolSize const *") VkDescriptorPoolSize.@Nullable Buffer value) { VkDescriptorPoolCreateInfo.npPoolSizes(address(), value); return this; }

    }

}