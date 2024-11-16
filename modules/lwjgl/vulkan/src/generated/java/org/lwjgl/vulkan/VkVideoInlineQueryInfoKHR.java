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
 * Structure specifying inline query information for video coding commands.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure <b>can</b> be included in the {@code pNext} chain of the input parameter structure of video coding commands.</p>
 * 
 * <ul>
 * <li>In the {@code pNext} chain of the {@code pDecodeInfo} parameter of the {@link KHRVideoDecodeQueue#vkCmdDecodeVideoKHR CmdDecodeVideoKHR} command to execute a query for each video decode operation issued by the command.</li>
 * <li>In the {@code pNext} chain of the {@code pEncodeInfo} parameter of the {@link KHRVideoEncodeQueue#vkCmdEncodeVideoKHR CmdEncodeVideoKHR} command to execute a query for each video encode operation issued by the command.</li>
 * </ul>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code queryPool} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then {@code firstQuery} <b>must</b> be less than the number of queries in {@code queryPool}</li>
 * <li>If {@code queryPool} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then the sum of {@code firstQuery} and {@code queryCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoMaintenance1#VK_STRUCTURE_TYPE_VIDEO_INLINE_QUERY_INFO_KHR STRUCTURE_TYPE_VIDEO_INLINE_QUERY_INFO_KHR}</li>
 * <li>If {@code queryPool} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoInlineQueryInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkQueryPool {@link #queryPool};
 *     uint32_t {@link #firstQuery};
 *     uint32_t {@link #queryCount};
 * }</code></pre>
 */
public class VkVideoInlineQueryInfoKHR extends Struct<VkVideoInlineQueryInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        QUERYPOOL,
        FIRSTQUERY,
        QUERYCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        QUERYPOOL = layout.offsetof(2);
        FIRSTQUERY = layout.offsetof(3);
        QUERYCOUNT = layout.offsetof(4);
    }

    protected VkVideoInlineQueryInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoInlineQueryInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoInlineQueryInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoInlineQueryInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoInlineQueryInfoKHR(ByteBuffer container) {
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
    /** {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a valid handle to a {@code VkQueryPool} object that will manage the results of the queries. */
    @NativeType("VkQueryPool")
    public long queryPool() { return nqueryPool(address()); }
    /** the query index within the query pool that will contain the query results for the first video coding operation. The query results of subsequent video coding operations will be contained by subsequent query indices. */
    @NativeType("uint32_t")
    public int firstQuery() { return nfirstQuery(address()); }
    /**
     * the number of queries to execute.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>In practice, if {@code queryPool} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then {@code queryCount} will always have to match the number of video coding operations issued by the video coding command this structure is specified to, meaning that using inline queries in a video coding command will always execute a query for each issued video coding operation.</p>
     * </div>
     */
    @NativeType("uint32_t")
    public int queryCount() { return nqueryCount(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoInlineQueryInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoMaintenance1#VK_STRUCTURE_TYPE_VIDEO_INLINE_QUERY_INFO_KHR STRUCTURE_TYPE_VIDEO_INLINE_QUERY_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoInlineQueryInfoKHR sType$Default() { return sType(KHRVideoMaintenance1.VK_STRUCTURE_TYPE_VIDEO_INLINE_QUERY_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoInlineQueryInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #queryPool} field. */
    public VkVideoInlineQueryInfoKHR queryPool(@NativeType("VkQueryPool") long value) { nqueryPool(address(), value); return this; }
    /** Sets the specified value to the {@link #firstQuery} field. */
    public VkVideoInlineQueryInfoKHR firstQuery(@NativeType("uint32_t") int value) { nfirstQuery(address(), value); return this; }
    /** Sets the specified value to the {@link #queryCount} field. */
    public VkVideoInlineQueryInfoKHR queryCount(@NativeType("uint32_t") int value) { nqueryCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoInlineQueryInfoKHR set(
        int sType,
        long pNext,
        long queryPool,
        int firstQuery,
        int queryCount
    ) {
        sType(sType);
        pNext(pNext);
        queryPool(queryPool);
        firstQuery(firstQuery);
        queryCount(queryCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoInlineQueryInfoKHR set(VkVideoInlineQueryInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoInlineQueryInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoInlineQueryInfoKHR malloc() {
        return new VkVideoInlineQueryInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoInlineQueryInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoInlineQueryInfoKHR calloc() {
        return new VkVideoInlineQueryInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoInlineQueryInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoInlineQueryInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoInlineQueryInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoInlineQueryInfoKHR} instance for the specified memory address. */
    public static VkVideoInlineQueryInfoKHR create(long address) {
        return new VkVideoInlineQueryInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoInlineQueryInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoInlineQueryInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoInlineQueryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoInlineQueryInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoInlineQueryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoInlineQueryInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoInlineQueryInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoInlineQueryInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoInlineQueryInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoInlineQueryInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoInlineQueryInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoInlineQueryInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoInlineQueryInfoKHR malloc(MemoryStack stack) {
        return new VkVideoInlineQueryInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoInlineQueryInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoInlineQueryInfoKHR calloc(MemoryStack stack) {
        return new VkVideoInlineQueryInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoInlineQueryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoInlineQueryInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoInlineQueryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoInlineQueryInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoInlineQueryInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoInlineQueryInfoKHR.PNEXT); }
    /** Unsafe version of {@link #queryPool}. */
    public static long nqueryPool(long struct) { return memGetLong(struct + VkVideoInlineQueryInfoKHR.QUERYPOOL); }
    /** Unsafe version of {@link #firstQuery}. */
    public static int nfirstQuery(long struct) { return memGetInt(struct + VkVideoInlineQueryInfoKHR.FIRSTQUERY); }
    /** Unsafe version of {@link #queryCount}. */
    public static int nqueryCount(long struct) { return memGetInt(struct + VkVideoInlineQueryInfoKHR.QUERYCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoInlineQueryInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoInlineQueryInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #queryPool(long) queryPool}. */
    public static void nqueryPool(long struct, long value) { memPutLong(struct + VkVideoInlineQueryInfoKHR.QUERYPOOL, value); }
    /** Unsafe version of {@link #firstQuery(int) firstQuery}. */
    public static void nfirstQuery(long struct, int value) { memPutInt(struct + VkVideoInlineQueryInfoKHR.FIRSTQUERY, value); }
    /** Unsafe version of {@link #queryCount(int) queryCount}. */
    public static void nqueryCount(long struct, int value) { memPutInt(struct + VkVideoInlineQueryInfoKHR.QUERYCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoInlineQueryInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoInlineQueryInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoInlineQueryInfoKHR ELEMENT_FACTORY = VkVideoInlineQueryInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoInlineQueryInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoInlineQueryInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoInlineQueryInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoInlineQueryInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoInlineQueryInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoInlineQueryInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoInlineQueryInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoInlineQueryInfoKHR#queryPool} field. */
        @NativeType("VkQueryPool")
        public long queryPool() { return VkVideoInlineQueryInfoKHR.nqueryPool(address()); }
        /** @return the value of the {@link VkVideoInlineQueryInfoKHR#firstQuery} field. */
        @NativeType("uint32_t")
        public int firstQuery() { return VkVideoInlineQueryInfoKHR.nfirstQuery(address()); }
        /** @return the value of the {@link VkVideoInlineQueryInfoKHR#queryCount} field. */
        @NativeType("uint32_t")
        public int queryCount() { return VkVideoInlineQueryInfoKHR.nqueryCount(address()); }

        /** Sets the specified value to the {@link VkVideoInlineQueryInfoKHR#sType} field. */
        public VkVideoInlineQueryInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoInlineQueryInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoMaintenance1#VK_STRUCTURE_TYPE_VIDEO_INLINE_QUERY_INFO_KHR STRUCTURE_TYPE_VIDEO_INLINE_QUERY_INFO_KHR} value to the {@link VkVideoInlineQueryInfoKHR#sType} field. */
        public VkVideoInlineQueryInfoKHR.Buffer sType$Default() { return sType(KHRVideoMaintenance1.VK_STRUCTURE_TYPE_VIDEO_INLINE_QUERY_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoInlineQueryInfoKHR#pNext} field. */
        public VkVideoInlineQueryInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoInlineQueryInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoInlineQueryInfoKHR#queryPool} field. */
        public VkVideoInlineQueryInfoKHR.Buffer queryPool(@NativeType("VkQueryPool") long value) { VkVideoInlineQueryInfoKHR.nqueryPool(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoInlineQueryInfoKHR#firstQuery} field. */
        public VkVideoInlineQueryInfoKHR.Buffer firstQuery(@NativeType("uint32_t") int value) { VkVideoInlineQueryInfoKHR.nfirstQuery(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoInlineQueryInfoKHR#queryCount} field. */
        public VkVideoInlineQueryInfoKHR.Buffer queryCount(@NativeType("uint32_t") int value) { VkVideoInlineQueryInfoKHR.nqueryCount(address(), value); return this; }

    }

}