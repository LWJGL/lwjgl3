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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPipelineInputAssemblyStateCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineInputAssemblyStateCreateFlags flags;
 *     VkPrimitiveTopology topology;
 *     VkBool32 primitiveRestartEnable;
 * }}</pre>
 */
public class VkPipelineInputAssemblyStateCreateInfo extends Struct<VkPipelineInputAssemblyStateCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        TOPOLOGY,
        PRIMITIVERESTARTENABLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        TOPOLOGY = layout.offsetof(3);
        PRIMITIVERESTARTENABLE = layout.offsetof(4);
    }

    protected VkPipelineInputAssemblyStateCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineInputAssemblyStateCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineInputAssemblyStateCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkPipelineInputAssemblyStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineInputAssemblyStateCreateInfo(ByteBuffer container) {
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
    @NativeType("VkPipelineInputAssemblyStateCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code topology} field. */
    @NativeType("VkPrimitiveTopology")
    public int topology() { return ntopology(address()); }
    /** @return the value of the {@code primitiveRestartEnable} field. */
    @NativeType("VkBool32")
    public boolean primitiveRestartEnable() { return nprimitiveRestartEnable(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineInputAssemblyStateCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO} value to the {@code sType} field. */
    public VkPipelineInputAssemblyStateCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineInputAssemblyStateCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPipelineInputAssemblyStateCreateInfo flags(@NativeType("VkPipelineInputAssemblyStateCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code topology} field. */
    public VkPipelineInputAssemblyStateCreateInfo topology(@NativeType("VkPrimitiveTopology") int value) { ntopology(address(), value); return this; }
    /** Sets the specified value to the {@code primitiveRestartEnable} field. */
    public VkPipelineInputAssemblyStateCreateInfo primitiveRestartEnable(@NativeType("VkBool32") boolean value) { nprimitiveRestartEnable(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineInputAssemblyStateCreateInfo set(
        int sType,
        long pNext,
        int flags,
        int topology,
        boolean primitiveRestartEnable
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        topology(topology);
        primitiveRestartEnable(primitiveRestartEnable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineInputAssemblyStateCreateInfo set(VkPipelineInputAssemblyStateCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineInputAssemblyStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineInputAssemblyStateCreateInfo malloc() {
        return new VkPipelineInputAssemblyStateCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineInputAssemblyStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineInputAssemblyStateCreateInfo calloc() {
        return new VkPipelineInputAssemblyStateCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineInputAssemblyStateCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineInputAssemblyStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineInputAssemblyStateCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineInputAssemblyStateCreateInfo} instance for the specified memory address. */
    public static VkPipelineInputAssemblyStateCreateInfo create(long address) {
        return new VkPipelineInputAssemblyStateCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineInputAssemblyStateCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkPipelineInputAssemblyStateCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineInputAssemblyStateCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineInputAssemblyStateCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineInputAssemblyStateCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineInputAssemblyStateCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineInputAssemblyStateCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineInputAssemblyStateCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineInputAssemblyStateCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineInputAssemblyStateCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineInputAssemblyStateCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineInputAssemblyStateCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineInputAssemblyStateCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineInputAssemblyStateCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineInputAssemblyStateCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineInputAssemblyStateCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineInputAssemblyStateCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineInputAssemblyStateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineInputAssemblyStateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineInputAssemblyStateCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineInputAssemblyStateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineInputAssemblyStateCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineInputAssemblyStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineInputAssemblyStateCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineInputAssemblyStateCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineInputAssemblyStateCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkPipelineInputAssemblyStateCreateInfo.FLAGS); }
    /** Unsafe version of {@link #topology}. */
    public static int ntopology(long struct) { return memGetInt(struct + VkPipelineInputAssemblyStateCreateInfo.TOPOLOGY); }
    /** Unsafe version of {@link #primitiveRestartEnable}. */
    public static int nprimitiveRestartEnable(long struct) { return memGetInt(struct + VkPipelineInputAssemblyStateCreateInfo.PRIMITIVERESTARTENABLE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineInputAssemblyStateCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineInputAssemblyStateCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineInputAssemblyStateCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #topology(int) topology}. */
    public static void ntopology(long struct, int value) { memPutInt(struct + VkPipelineInputAssemblyStateCreateInfo.TOPOLOGY, value); }
    /** Unsafe version of {@link #primitiveRestartEnable(boolean) primitiveRestartEnable}. */
    public static void nprimitiveRestartEnable(long struct, int value) { memPutInt(struct + VkPipelineInputAssemblyStateCreateInfo.PRIMITIVERESTARTENABLE, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineInputAssemblyStateCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineInputAssemblyStateCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineInputAssemblyStateCreateInfo ELEMENT_FACTORY = VkPipelineInputAssemblyStateCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineInputAssemblyStateCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineInputAssemblyStateCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineInputAssemblyStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineInputAssemblyStateCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineInputAssemblyStateCreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkPipelineInputAssemblyStateCreateFlags")
        public int flags() { return VkPipelineInputAssemblyStateCreateInfo.nflags(address()); }
        /** @return the value of the {@code topology} field. */
        @NativeType("VkPrimitiveTopology")
        public int topology() { return VkPipelineInputAssemblyStateCreateInfo.ntopology(address()); }
        /** @return the value of the {@code primitiveRestartEnable} field. */
        @NativeType("VkBool32")
        public boolean primitiveRestartEnable() { return VkPipelineInputAssemblyStateCreateInfo.nprimitiveRestartEnable(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineInputAssemblyStateCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineInputAssemblyStateCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO} value to the {@code sType} field. */
        public VkPipelineInputAssemblyStateCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineInputAssemblyStateCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineInputAssemblyStateCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPipelineInputAssemblyStateCreateInfo.Buffer flags(@NativeType("VkPipelineInputAssemblyStateCreateFlags") int value) { VkPipelineInputAssemblyStateCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code topology} field. */
        public VkPipelineInputAssemblyStateCreateInfo.Buffer topology(@NativeType("VkPrimitiveTopology") int value) { VkPipelineInputAssemblyStateCreateInfo.ntopology(address(), value); return this; }
        /** Sets the specified value to the {@code primitiveRestartEnable} field. */
        public VkPipelineInputAssemblyStateCreateInfo.Buffer primitiveRestartEnable(@NativeType("VkBool32") boolean value) { VkPipelineInputAssemblyStateCreateInfo.nprimitiveRestartEnable(address(), value ? 1 : 0); return this; }

    }

}