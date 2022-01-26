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
 * Structure specifying parameters of a newly created query pool.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code pipelineStatistics} is ignored if {@code queryType} is not {@link VK10#VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineStatisticsQuery">pipeline statistics queries</a> feature is not enabled, {@code queryType} <b>must</b> not be {@link VK10#VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS}</li>
 * <li>If {@code queryType} is {@link VK10#VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS}, {@code pipelineStatistics} <b>must</b> be a valid combination of {@code VkQueryPipelineStatisticFlagBits} values</li>
 * <li>If {@code queryType} is {@link KHRPerformanceQuery#VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR QUERY_TYPE_PERFORMANCE_QUERY_KHR}, the {@code pNext} chain <b>must</b> include a {@link VkQueryPoolPerformanceCreateInfoKHR} structure</li>
 * <li>{@code queryCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkQueryPoolPerformanceCreateInfoKHR}, {@link VkQueryPoolPerformanceQueryCreateInfoINTEL}, {@link VkVideoDecodeH264ProfileEXT}, {@link VkVideoDecodeH265ProfileEXT}, {@link VkVideoEncodeH264ProfileEXT}, {@link VkVideoEncodeH265ProfileEXT}, or {@link VkVideoProfileKHR}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code queryType} <b>must</b> be a valid {@code VkQueryType} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCreateQueryPool CreateQueryPool}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkQueryPoolCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkQueryPoolCreateFlags {@link #flags};
 *     VkQueryType {@link #queryType};
 *     uint32_t {@link #queryCount};
 *     VkQueryPipelineStatisticFlags {@link #pipelineStatistics};
 * }</code></pre>
 */
public class VkQueryPoolCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        QUERYTYPE,
        QUERYCOUNT,
        PIPELINESTATISTICS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        QUERYTYPE = layout.offsetof(3);
        QUERYCOUNT = layout.offsetof(4);
        PIPELINESTATISTICS = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkQueryPoolCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueryPoolCreateInfo(ByteBuffer container) {
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
    /** reserved for future use. */
    @NativeType("VkQueryPoolCreateFlags")
    public int flags() { return nflags(address()); }
    /** a {@code VkQueryType} value specifying the type of queries managed by the pool. */
    @NativeType("VkQueryType")
    public int queryType() { return nqueryType(address()); }
    /** the number of queries managed by the pool. */
    @NativeType("uint32_t")
    public int queryCount() { return nqueryCount(address()); }
    /** a bitmask of {@code VkQueryPipelineStatisticFlagBits} specifying which counters will be returned in queries on the new pool, as described below in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#queries-pipestats">Pipeline Statistics Queries</a>. */
    @NativeType("VkQueryPipelineStatisticFlags")
    public int pipelineStatistics() { return npipelineStatistics(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkQueryPoolCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO} value to the {@link #sType} field. */
    public VkQueryPoolCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkQueryPoolCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkQueryPoolCreateInfoINTEL} value to the {@code pNext} chain. */
    public VkQueryPoolCreateInfo pNext(VkQueryPoolCreateInfoINTEL value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkQueryPoolPerformanceCreateInfoKHR} value to the {@code pNext} chain. */
    public VkQueryPoolCreateInfo pNext(VkQueryPoolPerformanceCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkQueryPoolPerformanceQueryCreateInfoINTEL} value to the {@code pNext} chain. */
    public VkQueryPoolCreateInfo pNext(VkQueryPoolPerformanceQueryCreateInfoINTEL value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH264ProfileEXT} value to the {@code pNext} chain. */
    public VkQueryPoolCreateInfo pNext(VkVideoDecodeH264ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoDecodeH265ProfileEXT} value to the {@code pNext} chain. */
    public VkQueryPoolCreateInfo pNext(VkVideoDecodeH265ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH264ProfileEXT} value to the {@code pNext} chain. */
    public VkQueryPoolCreateInfo pNext(VkVideoEncodeH264ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265ProfileEXT} value to the {@code pNext} chain. */
    public VkQueryPoolCreateInfo pNext(VkVideoEncodeH265ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoProfileKHR} value to the {@code pNext} chain. */
    public VkQueryPoolCreateInfo pNext(VkVideoProfileKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkQueryPoolCreateInfo flags(@NativeType("VkQueryPoolCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #queryType} field. */
    public VkQueryPoolCreateInfo queryType(@NativeType("VkQueryType") int value) { nqueryType(address(), value); return this; }
    /** Sets the specified value to the {@link #queryCount} field. */
    public VkQueryPoolCreateInfo queryCount(@NativeType("uint32_t") int value) { nqueryCount(address(), value); return this; }
    /** Sets the specified value to the {@link #pipelineStatistics} field. */
    public VkQueryPoolCreateInfo pipelineStatistics(@NativeType("VkQueryPipelineStatisticFlags") int value) { npipelineStatistics(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkQueryPoolCreateInfo set(
        int sType,
        long pNext,
        int flags,
        int queryType,
        int queryCount,
        int pipelineStatistics
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        queryType(queryType);
        queryCount(queryCount);
        pipelineStatistics(pipelineStatistics);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkQueryPoolCreateInfo set(VkQueryPoolCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkQueryPoolCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueryPoolCreateInfo malloc() {
        return wrap(VkQueryPoolCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkQueryPoolCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueryPoolCreateInfo calloc() {
        return wrap(VkQueryPoolCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkQueryPoolCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkQueryPoolCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkQueryPoolCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkQueryPoolCreateInfo} instance for the specified memory address. */
    public static VkQueryPoolCreateInfo create(long address) {
        return wrap(VkQueryPoolCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueryPoolCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkQueryPoolCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkQueryPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueryPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueryPoolCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkQueryPoolCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueryPoolCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkQueryPoolCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkQueryPoolCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkQueryPoolCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkQueryPoolCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkQueryPoolCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkQueryPoolCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkQueryPoolCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkQueryPoolCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkQueryPoolCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueryPoolCreateInfo malloc(MemoryStack stack) {
        return wrap(VkQueryPoolCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkQueryPoolCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueryPoolCreateInfo calloc(MemoryStack stack) {
        return wrap(VkQueryPoolCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkQueryPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueryPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkQueryPoolCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkQueryPoolCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkQueryPoolCreateInfo.FLAGS); }
    /** Unsafe version of {@link #queryType}. */
    public static int nqueryType(long struct) { return UNSAFE.getInt(null, struct + VkQueryPoolCreateInfo.QUERYTYPE); }
    /** Unsafe version of {@link #queryCount}. */
    public static int nqueryCount(long struct) { return UNSAFE.getInt(null, struct + VkQueryPoolCreateInfo.QUERYCOUNT); }
    /** Unsafe version of {@link #pipelineStatistics}. */
    public static int npipelineStatistics(long struct) { return UNSAFE.getInt(null, struct + VkQueryPoolCreateInfo.PIPELINESTATISTICS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkQueryPoolCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkQueryPoolCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkQueryPoolCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #queryType(int) queryType}. */
    public static void nqueryType(long struct, int value) { UNSAFE.putInt(null, struct + VkQueryPoolCreateInfo.QUERYTYPE, value); }
    /** Unsafe version of {@link #queryCount(int) queryCount}. */
    public static void nqueryCount(long struct, int value) { UNSAFE.putInt(null, struct + VkQueryPoolCreateInfo.QUERYCOUNT, value); }
    /** Unsafe version of {@link #pipelineStatistics(int) pipelineStatistics}. */
    public static void npipelineStatistics(long struct, int value) { UNSAFE.putInt(null, struct + VkQueryPoolCreateInfo.PIPELINESTATISTICS, value); }

    // -----------------------------------

    /** An array of {@link VkQueryPoolCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkQueryPoolCreateInfo, Buffer> implements NativeResource {

        private static final VkQueryPoolCreateInfo ELEMENT_FACTORY = VkQueryPoolCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkQueryPoolCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueryPoolCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkQueryPoolCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkQueryPoolCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkQueryPoolCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkQueryPoolCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkQueryPoolCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkQueryPoolCreateInfo#flags} field. */
        @NativeType("VkQueryPoolCreateFlags")
        public int flags() { return VkQueryPoolCreateInfo.nflags(address()); }
        /** @return the value of the {@link VkQueryPoolCreateInfo#queryType} field. */
        @NativeType("VkQueryType")
        public int queryType() { return VkQueryPoolCreateInfo.nqueryType(address()); }
        /** @return the value of the {@link VkQueryPoolCreateInfo#queryCount} field. */
        @NativeType("uint32_t")
        public int queryCount() { return VkQueryPoolCreateInfo.nqueryCount(address()); }
        /** @return the value of the {@link VkQueryPoolCreateInfo#pipelineStatistics} field. */
        @NativeType("VkQueryPipelineStatisticFlags")
        public int pipelineStatistics() { return VkQueryPoolCreateInfo.npipelineStatistics(address()); }

        /** Sets the specified value to the {@link VkQueryPoolCreateInfo#sType} field. */
        public VkQueryPoolCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkQueryPoolCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO} value to the {@link VkQueryPoolCreateInfo#sType} field. */
        public VkQueryPoolCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO); }
        /** Sets the specified value to the {@link VkQueryPoolCreateInfo#pNext} field. */
        public VkQueryPoolCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkQueryPoolCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkQueryPoolCreateInfoINTEL} value to the {@code pNext} chain. */
        public VkQueryPoolCreateInfo.Buffer pNext(VkQueryPoolCreateInfoINTEL value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkQueryPoolPerformanceCreateInfoKHR} value to the {@code pNext} chain. */
        public VkQueryPoolCreateInfo.Buffer pNext(VkQueryPoolPerformanceCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkQueryPoolPerformanceQueryCreateInfoINTEL} value to the {@code pNext} chain. */
        public VkQueryPoolCreateInfo.Buffer pNext(VkQueryPoolPerformanceQueryCreateInfoINTEL value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH264ProfileEXT} value to the {@code pNext} chain. */
        public VkQueryPoolCreateInfo.Buffer pNext(VkVideoDecodeH264ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoDecodeH265ProfileEXT} value to the {@code pNext} chain. */
        public VkQueryPoolCreateInfo.Buffer pNext(VkVideoDecodeH265ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH264ProfileEXT} value to the {@code pNext} chain. */
        public VkQueryPoolCreateInfo.Buffer pNext(VkVideoEncodeH264ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265ProfileEXT} value to the {@code pNext} chain. */
        public VkQueryPoolCreateInfo.Buffer pNext(VkVideoEncodeH265ProfileEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoProfileKHR} value to the {@code pNext} chain. */
        public VkQueryPoolCreateInfo.Buffer pNext(VkVideoProfileKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkQueryPoolCreateInfo#flags} field. */
        public VkQueryPoolCreateInfo.Buffer flags(@NativeType("VkQueryPoolCreateFlags") int value) { VkQueryPoolCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkQueryPoolCreateInfo#queryType} field. */
        public VkQueryPoolCreateInfo.Buffer queryType(@NativeType("VkQueryType") int value) { VkQueryPoolCreateInfo.nqueryType(address(), value); return this; }
        /** Sets the specified value to the {@link VkQueryPoolCreateInfo#queryCount} field. */
        public VkQueryPoolCreateInfo.Buffer queryCount(@NativeType("uint32_t") int value) { VkQueryPoolCreateInfo.nqueryCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkQueryPoolCreateInfo#pipelineStatistics} field. */
        public VkQueryPoolCreateInfo.Buffer pipelineStatistics(@NativeType("VkQueryPipelineStatisticFlags") int value) { VkQueryPoolCreateInfo.npipelineStatistics(address(), value); return this; }

    }

}