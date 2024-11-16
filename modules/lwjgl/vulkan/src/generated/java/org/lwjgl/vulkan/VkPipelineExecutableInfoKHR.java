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
 * Structure describing a pipeline executable to query for associated statistics or internal representations.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code executableIndex} <b>must</b> be less than the number of pipeline executables associated with {@code pipeline} as returned in the {@code pExecutableCount} parameter of {@code vkGetPipelineExecutablePropertiesKHR}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPipelineExecutableProperties#VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRPipelineExecutableProperties#vkGetPipelineExecutableInternalRepresentationsKHR GetPipelineExecutableInternalRepresentationsKHR}, {@link KHRPipelineExecutableProperties#vkGetPipelineExecutableStatisticsKHR GetPipelineExecutableStatisticsKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineExecutableInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipeline {@link #pipeline};
 *     uint32_t {@link #executableIndex};
 * }</code></pre>
 */
public class VkPipelineExecutableInfoKHR extends Struct<VkPipelineExecutableInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINE,
        EXECUTABLEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINE = layout.offsetof(2);
        EXECUTABLEINDEX = layout.offsetof(3);
    }

    protected VkPipelineExecutableInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineExecutableInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineExecutableInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkPipelineExecutableInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineExecutableInfoKHR(ByteBuffer container) {
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
    /** the pipeline to query. */
    @NativeType("VkPipeline")
    public long pipeline() { return npipeline(address()); }
    /** the index of the pipeline executable to query in the array of executable properties returned by {@link KHRPipelineExecutableProperties#vkGetPipelineExecutablePropertiesKHR GetPipelineExecutablePropertiesKHR}. */
    @NativeType("uint32_t")
    public int executableIndex() { return nexecutableIndex(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineExecutableInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPipelineExecutableProperties#VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR} value to the {@link #sType} field. */
    public VkPipelineExecutableInfoKHR sType$Default() { return sType(KHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineExecutableInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #pipeline} field. */
    public VkPipelineExecutableInfoKHR pipeline(@NativeType("VkPipeline") long value) { npipeline(address(), value); return this; }
    /** Sets the specified value to the {@link #executableIndex} field. */
    public VkPipelineExecutableInfoKHR executableIndex(@NativeType("uint32_t") int value) { nexecutableIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineExecutableInfoKHR set(
        int sType,
        long pNext,
        long pipeline,
        int executableIndex
    ) {
        sType(sType);
        pNext(pNext);
        pipeline(pipeline);
        executableIndex(executableIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineExecutableInfoKHR set(VkPipelineExecutableInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineExecutableInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineExecutableInfoKHR malloc() {
        return new VkPipelineExecutableInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineExecutableInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineExecutableInfoKHR calloc() {
        return new VkPipelineExecutableInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineExecutableInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineExecutableInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineExecutableInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineExecutableInfoKHR} instance for the specified memory address. */
    public static VkPipelineExecutableInfoKHR create(long address) {
        return new VkPipelineExecutableInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineExecutableInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkPipelineExecutableInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkPipelineExecutableInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineExecutableInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineExecutableInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineExecutableInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineExecutableInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineExecutableInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineExecutableInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineExecutableInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineExecutableInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineExecutableInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineExecutableInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineExecutableInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineExecutableInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineExecutableInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineExecutableInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pipeline}. */
    public static long npipeline(long struct) { return memGetLong(struct + VkPipelineExecutableInfoKHR.PIPELINE); }
    /** Unsafe version of {@link #executableIndex}. */
    public static int nexecutableIndex(long struct) { return memGetInt(struct + VkPipelineExecutableInfoKHR.EXECUTABLEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineExecutableInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineExecutableInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pipeline(long) pipeline}. */
    public static void npipeline(long struct, long value) { memPutLong(struct + VkPipelineExecutableInfoKHR.PIPELINE, value); }
    /** Unsafe version of {@link #executableIndex(int) executableIndex}. */
    public static void nexecutableIndex(long struct, int value) { memPutInt(struct + VkPipelineExecutableInfoKHR.EXECUTABLEINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineExecutableInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPipelineExecutableInfoKHR, Buffer> implements NativeResource {

        private static final VkPipelineExecutableInfoKHR ELEMENT_FACTORY = VkPipelineExecutableInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineExecutableInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineExecutableInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineExecutableInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineExecutableInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineExecutableInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkPipelineExecutableInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineExecutableInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkPipelineExecutableInfoKHR#pipeline} field. */
        @NativeType("VkPipeline")
        public long pipeline() { return VkPipelineExecutableInfoKHR.npipeline(address()); }
        /** @return the value of the {@link VkPipelineExecutableInfoKHR#executableIndex} field. */
        @NativeType("uint32_t")
        public int executableIndex() { return VkPipelineExecutableInfoKHR.nexecutableIndex(address()); }

        /** Sets the specified value to the {@link VkPipelineExecutableInfoKHR#sType} field. */
        public VkPipelineExecutableInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineExecutableInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPipelineExecutableProperties#VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR} value to the {@link VkPipelineExecutableInfoKHR#sType} field. */
        public VkPipelineExecutableInfoKHR.Buffer sType$Default() { return sType(KHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR); }
        /** Sets the specified value to the {@link VkPipelineExecutableInfoKHR#pNext} field. */
        public VkPipelineExecutableInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPipelineExecutableInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineExecutableInfoKHR#pipeline} field. */
        public VkPipelineExecutableInfoKHR.Buffer pipeline(@NativeType("VkPipeline") long value) { VkPipelineExecutableInfoKHR.npipeline(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineExecutableInfoKHR#executableIndex} field. */
        public VkPipelineExecutableInfoKHR.Buffer executableIndex(@NativeType("uint32_t") int value) { VkPipelineExecutableInfoKHR.nexecutableIndex(address(), value); return this; }

    }

}