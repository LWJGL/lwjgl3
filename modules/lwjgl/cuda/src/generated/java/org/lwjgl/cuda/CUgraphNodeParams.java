/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUgraphNodeParams {
 *     CUgraphNodeType type;
 *     int reserved0[3];
 *     union {
 *         long long reserved1[29];
 *         {@link CUDA_KERNEL_NODE_PARAMS_v3 CUDA_KERNEL_NODE_PARAMS_v3} kernel;
 *         {@link CUDA_MEMCPY_NODE_PARAMS CUDA_MEMCPY_NODE_PARAMS} memcpy;
 *         {@link CUDA_MEMSET_NODE_PARAMS_v2 CUDA_MEMSET_NODE_PARAMS_v2} memset;
 *         {@link CUDA_HOST_NODE_PARAMS_v2 CUDA_HOST_NODE_PARAMS_v2} host;
 *         {@link CUDA_CHILD_GRAPH_NODE_PARAMS CUDA_CHILD_GRAPH_NODE_PARAMS} graph;
 *         {@link CUDA_EVENT_WAIT_NODE_PARAMS CUDA_EVENT_WAIT_NODE_PARAMS} eventWait;
 *         {@link CUDA_EVENT_RECORD_NODE_PARAMS CUDA_EVENT_RECORD_NODE_PARAMS} eventRecord;
 *         {@link CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2} extSemSignal;
 *         {@link CUDA_EXT_SEM_WAIT_NODE_PARAMS_v2 CUDA_EXT_SEM_WAIT_NODE_PARAMS_v2} extSemWait;
 *         {@link CUDA_MEM_ALLOC_NODE_PARAMS CUDA_MEM_ALLOC_NODE_PARAMS} alloc;
 *         {@link CUDA_MEM_FREE_NODE_PARAMS CUDA_MEM_FREE_NODE_PARAMS} free;
 *         {@link CUDA_BATCH_MEM_OP_NODE_PARAMS CUDA_BATCH_MEM_OP_NODE_PARAMS} memOp;
 *         {@link CUDA_CONDITIONAL_NODE_PARAMS CUDA_CONDITIONAL_NODE_PARAMS} conditional;
 *     } params;
 *     long long reserved2;
 * }</code></pre>
 */
public class CUgraphNodeParams extends Struct<CUgraphNodeParams> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        RESERVED0,
        PARAMS,
            PARAMS_RESERVED1,
            PARAMS_KERNEL,
            PARAMS_MEMCPY,
            PARAMS_MEMSET,
            PARAMS_HOST,
            PARAMS_GRAPH,
            PARAMS_EVENTWAIT,
            PARAMS_EVENTRECORD,
            PARAMS_EXTSEMSIGNAL,
            PARAMS_EXTSEMWAIT,
            PARAMS_ALLOC,
            PARAMS_FREE,
            PARAMS_MEMOP,
            PARAMS_CONDITIONAL,
        RESERVED2;

    static {
        Layout layout = __struct(
            __member(4),
            __array(4, 3),
            __union(
                __array(8, 29),
                __member(CUDA_KERNEL_NODE_PARAMS_v3.SIZEOF, CUDA_KERNEL_NODE_PARAMS_v3.ALIGNOF),
                __member(CUDA_MEMCPY_NODE_PARAMS.SIZEOF, CUDA_MEMCPY_NODE_PARAMS.ALIGNOF),
                __member(CUDA_MEMSET_NODE_PARAMS_v2.SIZEOF, CUDA_MEMSET_NODE_PARAMS_v2.ALIGNOF),
                __member(CUDA_HOST_NODE_PARAMS_v2.SIZEOF, CUDA_HOST_NODE_PARAMS_v2.ALIGNOF),
                __member(CUDA_CHILD_GRAPH_NODE_PARAMS.SIZEOF, CUDA_CHILD_GRAPH_NODE_PARAMS.ALIGNOF),
                __member(CUDA_EVENT_WAIT_NODE_PARAMS.SIZEOF, CUDA_EVENT_WAIT_NODE_PARAMS.ALIGNOF),
                __member(CUDA_EVENT_RECORD_NODE_PARAMS.SIZEOF, CUDA_EVENT_RECORD_NODE_PARAMS.ALIGNOF),
                __member(CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.SIZEOF, CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.ALIGNOF),
                __member(CUDA_EXT_SEM_WAIT_NODE_PARAMS_v2.SIZEOF, CUDA_EXT_SEM_WAIT_NODE_PARAMS_v2.ALIGNOF),
                __member(CUDA_MEM_ALLOC_NODE_PARAMS.SIZEOF, CUDA_MEM_ALLOC_NODE_PARAMS.ALIGNOF),
                __member(CUDA_MEM_FREE_NODE_PARAMS.SIZEOF, CUDA_MEM_FREE_NODE_PARAMS.ALIGNOF),
                __member(CUDA_BATCH_MEM_OP_NODE_PARAMS.SIZEOF, CUDA_BATCH_MEM_OP_NODE_PARAMS.ALIGNOF),
                __member(CUDA_CONDITIONAL_NODE_PARAMS.SIZEOF, CUDA_CONDITIONAL_NODE_PARAMS.ALIGNOF)
            ),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        RESERVED0 = layout.offsetof(1);
        PARAMS = layout.offsetof(2);
            PARAMS_RESERVED1 = layout.offsetof(3);
            PARAMS_KERNEL = layout.offsetof(4);
            PARAMS_MEMCPY = layout.offsetof(5);
            PARAMS_MEMSET = layout.offsetof(6);
            PARAMS_HOST = layout.offsetof(7);
            PARAMS_GRAPH = layout.offsetof(8);
            PARAMS_EVENTWAIT = layout.offsetof(9);
            PARAMS_EVENTRECORD = layout.offsetof(10);
            PARAMS_EXTSEMSIGNAL = layout.offsetof(11);
            PARAMS_EXTSEMWAIT = layout.offsetof(12);
            PARAMS_ALLOC = layout.offsetof(13);
            PARAMS_FREE = layout.offsetof(14);
            PARAMS_MEMOP = layout.offsetof(15);
            PARAMS_CONDITIONAL = layout.offsetof(16);
        RESERVED2 = layout.offsetof(17);
    }

    protected CUgraphNodeParams(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUgraphNodeParams create(long address, @Nullable ByteBuffer container) {
        return new CUgraphNodeParams(address, container);
    }

    /**
     * Creates a {@code CUgraphNodeParams} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUgraphNodeParams(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("CUgraphNodeType")
    public int type() { return ntype(address()); }
    /** @return a {@link LongBuffer} view of the {@code params.reserved1} field. */
    @NativeType("long long[29]")
    public LongBuffer params_reserved1() { return nparams_reserved1(address()); }
    /** @return the value at the specified index of the {@code params.reserved1} field. */
    @NativeType("long long")
    public long params_reserved1(int index) { return nparams_reserved1(address(), index); }
    /** @return a {@link CUDA_KERNEL_NODE_PARAMS_v3} view of the {@code params.kernel} field. */
    public CUDA_KERNEL_NODE_PARAMS_v3 params_kernel() { return nparams_kernel(address()); }
    /** @return a {@link CUDA_MEMCPY_NODE_PARAMS} view of the {@code params.memcpy} field. */
    public CUDA_MEMCPY_NODE_PARAMS params_memcpy() { return nparams_memcpy(address()); }
    /** @return a {@link CUDA_MEMSET_NODE_PARAMS_v2} view of the {@code params.memset} field. */
    public CUDA_MEMSET_NODE_PARAMS_v2 params_memset() { return nparams_memset(address()); }
    /** @return a {@link CUDA_HOST_NODE_PARAMS_v2} view of the {@code params.host} field. */
    public CUDA_HOST_NODE_PARAMS_v2 params_host() { return nparams_host(address()); }
    /** @return a {@link CUDA_CHILD_GRAPH_NODE_PARAMS} view of the {@code params.graph} field. */
    public CUDA_CHILD_GRAPH_NODE_PARAMS params_graph() { return nparams_graph(address()); }
    /** @return a {@link CUDA_EVENT_WAIT_NODE_PARAMS} view of the {@code params.eventWait} field. */
    public CUDA_EVENT_WAIT_NODE_PARAMS params_eventWait() { return nparams_eventWait(address()); }
    /** @return a {@link CUDA_EVENT_RECORD_NODE_PARAMS} view of the {@code params.eventRecord} field. */
    public CUDA_EVENT_RECORD_NODE_PARAMS params_eventRecord() { return nparams_eventRecord(address()); }
    /** @return a {@link CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2} view of the {@code params.extSemSignal} field. */
    public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 params_extSemSignal() { return nparams_extSemSignal(address()); }
    /** @return a {@link CUDA_EXT_SEM_WAIT_NODE_PARAMS_v2} view of the {@code params.extSemWait} field. */
    public CUDA_EXT_SEM_WAIT_NODE_PARAMS_v2 params_extSemWait() { return nparams_extSemWait(address()); }
    /** @return a {@link CUDA_MEM_ALLOC_NODE_PARAMS} view of the {@code params.alloc} field. */
    public CUDA_MEM_ALLOC_NODE_PARAMS params_alloc() { return nparams_alloc(address()); }
    /** @return a {@link CUDA_MEM_FREE_NODE_PARAMS} view of the {@code params.free} field. */
    public CUDA_MEM_FREE_NODE_PARAMS params_free() { return nparams_free(address()); }
    /** @return a {@link CUDA_BATCH_MEM_OP_NODE_PARAMS} view of the {@code params.memOp} field. */
    public CUDA_BATCH_MEM_OP_NODE_PARAMS params_memOp() { return nparams_memOp(address()); }
    /** @return a {@link CUDA_CONDITIONAL_NODE_PARAMS} view of the {@code params.conditional} field. */
    public CUDA_CONDITIONAL_NODE_PARAMS params_conditional() { return nparams_conditional(address()); }

    /** Sets the specified value to the {@code type} field. */
    public CUgraphNodeParams type(@NativeType("CUgraphNodeType") int value) { ntype(address(), value); return this; }
    /** Copies the specified {@link LongBuffer} to the {@code reserved1} field. */
    public CUgraphNodeParams params_reserved1(@NativeType("long long[29]") LongBuffer value) { nparams_reserved1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code reserved1} field. */
    public CUgraphNodeParams params_reserved1(int index, @NativeType("long long") long value) { nparams_reserved1(address(), index, value); return this; }
    /** Copies the specified {@link CUDA_KERNEL_NODE_PARAMS_v3} to the {@code kernel} field. */
    public CUgraphNodeParams params_kernel(CUDA_KERNEL_NODE_PARAMS_v3 value) { nparams_kernel(address(), value); return this; }
    /** Passes the {@code kernel} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUgraphNodeParams params_kernel(java.util.function.Consumer<CUDA_KERNEL_NODE_PARAMS_v3> consumer) { consumer.accept(params_kernel()); return this; }
    /** Copies the specified {@link CUDA_MEMCPY_NODE_PARAMS} to the {@code memcpy} field. */
    public CUgraphNodeParams params_memcpy(CUDA_MEMCPY_NODE_PARAMS value) { nparams_memcpy(address(), value); return this; }
    /** Passes the {@code memcpy} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUgraphNodeParams params_memcpy(java.util.function.Consumer<CUDA_MEMCPY_NODE_PARAMS> consumer) { consumer.accept(params_memcpy()); return this; }
    /** Copies the specified {@link CUDA_MEMSET_NODE_PARAMS_v2} to the {@code memset} field. */
    public CUgraphNodeParams params_memset(CUDA_MEMSET_NODE_PARAMS_v2 value) { nparams_memset(address(), value); return this; }
    /** Passes the {@code memset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUgraphNodeParams params_memset(java.util.function.Consumer<CUDA_MEMSET_NODE_PARAMS_v2> consumer) { consumer.accept(params_memset()); return this; }
    /** Copies the specified {@link CUDA_HOST_NODE_PARAMS_v2} to the {@code host} field. */
    public CUgraphNodeParams params_host(CUDA_HOST_NODE_PARAMS_v2 value) { nparams_host(address(), value); return this; }
    /** Passes the {@code host} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUgraphNodeParams params_host(java.util.function.Consumer<CUDA_HOST_NODE_PARAMS_v2> consumer) { consumer.accept(params_host()); return this; }
    /** Copies the specified {@link CUDA_CHILD_GRAPH_NODE_PARAMS} to the {@code graph} field. */
    public CUgraphNodeParams params_graph(CUDA_CHILD_GRAPH_NODE_PARAMS value) { nparams_graph(address(), value); return this; }
    /** Passes the {@code graph} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUgraphNodeParams params_graph(java.util.function.Consumer<CUDA_CHILD_GRAPH_NODE_PARAMS> consumer) { consumer.accept(params_graph()); return this; }
    /** Copies the specified {@link CUDA_EVENT_WAIT_NODE_PARAMS} to the {@code eventWait} field. */
    public CUgraphNodeParams params_eventWait(CUDA_EVENT_WAIT_NODE_PARAMS value) { nparams_eventWait(address(), value); return this; }
    /** Passes the {@code eventWait} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUgraphNodeParams params_eventWait(java.util.function.Consumer<CUDA_EVENT_WAIT_NODE_PARAMS> consumer) { consumer.accept(params_eventWait()); return this; }
    /** Copies the specified {@link CUDA_EVENT_RECORD_NODE_PARAMS} to the {@code eventRecord} field. */
    public CUgraphNodeParams params_eventRecord(CUDA_EVENT_RECORD_NODE_PARAMS value) { nparams_eventRecord(address(), value); return this; }
    /** Passes the {@code eventRecord} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUgraphNodeParams params_eventRecord(java.util.function.Consumer<CUDA_EVENT_RECORD_NODE_PARAMS> consumer) { consumer.accept(params_eventRecord()); return this; }
    /** Copies the specified {@link CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2} to the {@code extSemSignal} field. */
    public CUgraphNodeParams params_extSemSignal(CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 value) { nparams_extSemSignal(address(), value); return this; }
    /** Passes the {@code extSemSignal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUgraphNodeParams params_extSemSignal(java.util.function.Consumer<CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2> consumer) { consumer.accept(params_extSemSignal()); return this; }
    /** Copies the specified {@link CUDA_EXT_SEM_WAIT_NODE_PARAMS_v2} to the {@code extSemWait} field. */
    public CUgraphNodeParams params_extSemWait(CUDA_EXT_SEM_WAIT_NODE_PARAMS_v2 value) { nparams_extSemWait(address(), value); return this; }
    /** Passes the {@code extSemWait} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUgraphNodeParams params_extSemWait(java.util.function.Consumer<CUDA_EXT_SEM_WAIT_NODE_PARAMS_v2> consumer) { consumer.accept(params_extSemWait()); return this; }
    /** Copies the specified {@link CUDA_MEM_ALLOC_NODE_PARAMS} to the {@code alloc} field. */
    public CUgraphNodeParams params_alloc(CUDA_MEM_ALLOC_NODE_PARAMS value) { nparams_alloc(address(), value); return this; }
    /** Passes the {@code alloc} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUgraphNodeParams params_alloc(java.util.function.Consumer<CUDA_MEM_ALLOC_NODE_PARAMS> consumer) { consumer.accept(params_alloc()); return this; }
    /** Copies the specified {@link CUDA_MEM_FREE_NODE_PARAMS} to the {@code free} field. */
    public CUgraphNodeParams params_free(CUDA_MEM_FREE_NODE_PARAMS value) { nparams_free(address(), value); return this; }
    /** Passes the {@code free} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUgraphNodeParams params_free(java.util.function.Consumer<CUDA_MEM_FREE_NODE_PARAMS> consumer) { consumer.accept(params_free()); return this; }
    /** Copies the specified {@link CUDA_BATCH_MEM_OP_NODE_PARAMS} to the {@code memOp} field. */
    public CUgraphNodeParams params_memOp(CUDA_BATCH_MEM_OP_NODE_PARAMS value) { nparams_memOp(address(), value); return this; }
    /** Passes the {@code memOp} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUgraphNodeParams params_memOp(java.util.function.Consumer<CUDA_BATCH_MEM_OP_NODE_PARAMS> consumer) { consumer.accept(params_memOp()); return this; }
    /** Copies the specified {@link CUDA_CONDITIONAL_NODE_PARAMS} to the {@code conditional} field. */
    public CUgraphNodeParams params_conditional(CUDA_CONDITIONAL_NODE_PARAMS value) { nparams_conditional(address(), value); return this; }
    /** Passes the {@code conditional} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUgraphNodeParams params_conditional(java.util.function.Consumer<CUDA_CONDITIONAL_NODE_PARAMS> consumer) { consumer.accept(params_conditional()); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUgraphNodeParams set(CUgraphNodeParams src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUgraphNodeParams} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUgraphNodeParams malloc() {
        return new CUgraphNodeParams(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUgraphNodeParams} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUgraphNodeParams calloc() {
        return new CUgraphNodeParams(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUgraphNodeParams} instance allocated with {@link BufferUtils}. */
    public static CUgraphNodeParams create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUgraphNodeParams(memAddress(container), container);
    }

    /** Returns a new {@code CUgraphNodeParams} instance for the specified memory address. */
    public static CUgraphNodeParams create(long address) {
        return new CUgraphNodeParams(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUgraphNodeParams createSafe(long address) {
        return address == NULL ? null : new CUgraphNodeParams(address, null);
    }

    /**
     * Returns a new {@link CUgraphNodeParams.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUgraphNodeParams.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUgraphNodeParams.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUgraphNodeParams.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUgraphNodeParams.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUgraphNodeParams.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUgraphNodeParams.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUgraphNodeParams.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUgraphNodeParams.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUgraphNodeParams} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUgraphNodeParams malloc(MemoryStack stack) {
        return new CUgraphNodeParams(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUgraphNodeParams} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUgraphNodeParams calloc(MemoryStack stack) {
        return new CUgraphNodeParams(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUgraphNodeParams.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUgraphNodeParams.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUgraphNodeParams.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUgraphNodeParams.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + CUgraphNodeParams.TYPE); }
    public static IntBuffer nreserved0(long struct) { return memIntBuffer(struct + CUgraphNodeParams.RESERVED0, 3); }
    public static int nreserved0(long struct, int index) {
        return memGetInt(struct + CUgraphNodeParams.RESERVED0 + check(index, 3) * 4);
    }
    public static LongBuffer nparams_reserved1(long struct) { return memLongBuffer(struct + CUgraphNodeParams.PARAMS_RESERVED1, 29); }
    public static long nparams_reserved1(long struct, int index) {
        return memGetLong(struct + CUgraphNodeParams.PARAMS_RESERVED1 + check(index, 29) * 8);
    }
    /** Unsafe version of {@link #params_kernel}. */
    public static CUDA_KERNEL_NODE_PARAMS_v3 nparams_kernel(long struct) { return CUDA_KERNEL_NODE_PARAMS_v3.create(struct + CUgraphNodeParams.PARAMS_KERNEL); }
    /** Unsafe version of {@link #params_memcpy}. */
    public static CUDA_MEMCPY_NODE_PARAMS nparams_memcpy(long struct) { return CUDA_MEMCPY_NODE_PARAMS.create(struct + CUgraphNodeParams.PARAMS_MEMCPY); }
    /** Unsafe version of {@link #params_memset}. */
    public static CUDA_MEMSET_NODE_PARAMS_v2 nparams_memset(long struct) { return CUDA_MEMSET_NODE_PARAMS_v2.create(struct + CUgraphNodeParams.PARAMS_MEMSET); }
    /** Unsafe version of {@link #params_host}. */
    public static CUDA_HOST_NODE_PARAMS_v2 nparams_host(long struct) { return CUDA_HOST_NODE_PARAMS_v2.create(struct + CUgraphNodeParams.PARAMS_HOST); }
    /** Unsafe version of {@link #params_graph}. */
    public static CUDA_CHILD_GRAPH_NODE_PARAMS nparams_graph(long struct) { return CUDA_CHILD_GRAPH_NODE_PARAMS.create(struct + CUgraphNodeParams.PARAMS_GRAPH); }
    /** Unsafe version of {@link #params_eventWait}. */
    public static CUDA_EVENT_WAIT_NODE_PARAMS nparams_eventWait(long struct) { return CUDA_EVENT_WAIT_NODE_PARAMS.create(struct + CUgraphNodeParams.PARAMS_EVENTWAIT); }
    /** Unsafe version of {@link #params_eventRecord}. */
    public static CUDA_EVENT_RECORD_NODE_PARAMS nparams_eventRecord(long struct) { return CUDA_EVENT_RECORD_NODE_PARAMS.create(struct + CUgraphNodeParams.PARAMS_EVENTRECORD); }
    /** Unsafe version of {@link #params_extSemSignal}. */
    public static CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 nparams_extSemSignal(long struct) { return CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.create(struct + CUgraphNodeParams.PARAMS_EXTSEMSIGNAL); }
    /** Unsafe version of {@link #params_extSemWait}. */
    public static CUDA_EXT_SEM_WAIT_NODE_PARAMS_v2 nparams_extSemWait(long struct) { return CUDA_EXT_SEM_WAIT_NODE_PARAMS_v2.create(struct + CUgraphNodeParams.PARAMS_EXTSEMWAIT); }
    /** Unsafe version of {@link #params_alloc}. */
    public static CUDA_MEM_ALLOC_NODE_PARAMS nparams_alloc(long struct) { return CUDA_MEM_ALLOC_NODE_PARAMS.create(struct + CUgraphNodeParams.PARAMS_ALLOC); }
    /** Unsafe version of {@link #params_free}. */
    public static CUDA_MEM_FREE_NODE_PARAMS nparams_free(long struct) { return CUDA_MEM_FREE_NODE_PARAMS.create(struct + CUgraphNodeParams.PARAMS_FREE); }
    /** Unsafe version of {@link #params_memOp}. */
    public static CUDA_BATCH_MEM_OP_NODE_PARAMS nparams_memOp(long struct) { return CUDA_BATCH_MEM_OP_NODE_PARAMS.create(struct + CUgraphNodeParams.PARAMS_MEMOP); }
    /** Unsafe version of {@link #params_conditional}. */
    public static CUDA_CONDITIONAL_NODE_PARAMS nparams_conditional(long struct) { return CUDA_CONDITIONAL_NODE_PARAMS.create(struct + CUgraphNodeParams.PARAMS_CONDITIONAL); }
    public static long nreserved2(long struct) { return memGetLong(struct + CUgraphNodeParams.RESERVED2); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + CUgraphNodeParams.TYPE, value); }
    public static void nreserved0(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + CUgraphNodeParams.RESERVED0, value.remaining() * 4);
    }
    public static void nreserved0(long struct, int index, int value) {
        memPutInt(struct + CUgraphNodeParams.RESERVED0 + check(index, 3) * 4, value);
    }
    public static void nparams_reserved1(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 29); }
        memCopy(memAddress(value), struct + CUgraphNodeParams.PARAMS_RESERVED1, value.remaining() * 8);
    }
    public static void nparams_reserved1(long struct, int index, long value) {
        memPutLong(struct + CUgraphNodeParams.PARAMS_RESERVED1 + check(index, 29) * 8, value);
    }
    /** Unsafe version of {@link #params_kernel(CUDA_KERNEL_NODE_PARAMS_v3) params_kernel}. */
    public static void nparams_kernel(long struct, CUDA_KERNEL_NODE_PARAMS_v3 value) { memCopy(value.address(), struct + CUgraphNodeParams.PARAMS_KERNEL, CUDA_KERNEL_NODE_PARAMS_v3.SIZEOF); }
    /** Unsafe version of {@link #params_memcpy(CUDA_MEMCPY_NODE_PARAMS) params_memcpy}. */
    public static void nparams_memcpy(long struct, CUDA_MEMCPY_NODE_PARAMS value) { memCopy(value.address(), struct + CUgraphNodeParams.PARAMS_MEMCPY, CUDA_MEMCPY_NODE_PARAMS.SIZEOF); }
    /** Unsafe version of {@link #params_memset(CUDA_MEMSET_NODE_PARAMS_v2) params_memset}. */
    public static void nparams_memset(long struct, CUDA_MEMSET_NODE_PARAMS_v2 value) { memCopy(value.address(), struct + CUgraphNodeParams.PARAMS_MEMSET, CUDA_MEMSET_NODE_PARAMS_v2.SIZEOF); }
    /** Unsafe version of {@link #params_host(CUDA_HOST_NODE_PARAMS_v2) params_host}. */
    public static void nparams_host(long struct, CUDA_HOST_NODE_PARAMS_v2 value) { memCopy(value.address(), struct + CUgraphNodeParams.PARAMS_HOST, CUDA_HOST_NODE_PARAMS_v2.SIZEOF); }
    /** Unsafe version of {@link #params_graph(CUDA_CHILD_GRAPH_NODE_PARAMS) params_graph}. */
    public static void nparams_graph(long struct, CUDA_CHILD_GRAPH_NODE_PARAMS value) { memCopy(value.address(), struct + CUgraphNodeParams.PARAMS_GRAPH, CUDA_CHILD_GRAPH_NODE_PARAMS.SIZEOF); }
    /** Unsafe version of {@link #params_eventWait(CUDA_EVENT_WAIT_NODE_PARAMS) params_eventWait}. */
    public static void nparams_eventWait(long struct, CUDA_EVENT_WAIT_NODE_PARAMS value) { memCopy(value.address(), struct + CUgraphNodeParams.PARAMS_EVENTWAIT, CUDA_EVENT_WAIT_NODE_PARAMS.SIZEOF); }
    /** Unsafe version of {@link #params_eventRecord(CUDA_EVENT_RECORD_NODE_PARAMS) params_eventRecord}. */
    public static void nparams_eventRecord(long struct, CUDA_EVENT_RECORD_NODE_PARAMS value) { memCopy(value.address(), struct + CUgraphNodeParams.PARAMS_EVENTRECORD, CUDA_EVENT_RECORD_NODE_PARAMS.SIZEOF); }
    /** Unsafe version of {@link #params_extSemSignal(CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2) params_extSemSignal}. */
    public static void nparams_extSemSignal(long struct, CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 value) { memCopy(value.address(), struct + CUgraphNodeParams.PARAMS_EXTSEMSIGNAL, CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2.SIZEOF); }
    /** Unsafe version of {@link #params_extSemWait(CUDA_EXT_SEM_WAIT_NODE_PARAMS_v2) params_extSemWait}. */
    public static void nparams_extSemWait(long struct, CUDA_EXT_SEM_WAIT_NODE_PARAMS_v2 value) { memCopy(value.address(), struct + CUgraphNodeParams.PARAMS_EXTSEMWAIT, CUDA_EXT_SEM_WAIT_NODE_PARAMS_v2.SIZEOF); }
    /** Unsafe version of {@link #params_alloc(CUDA_MEM_ALLOC_NODE_PARAMS) params_alloc}. */
    public static void nparams_alloc(long struct, CUDA_MEM_ALLOC_NODE_PARAMS value) { memCopy(value.address(), struct + CUgraphNodeParams.PARAMS_ALLOC, CUDA_MEM_ALLOC_NODE_PARAMS.SIZEOF); }
    /** Unsafe version of {@link #params_free(CUDA_MEM_FREE_NODE_PARAMS) params_free}. */
    public static void nparams_free(long struct, CUDA_MEM_FREE_NODE_PARAMS value) { memCopy(value.address(), struct + CUgraphNodeParams.PARAMS_FREE, CUDA_MEM_FREE_NODE_PARAMS.SIZEOF); }
    /** Unsafe version of {@link #params_memOp(CUDA_BATCH_MEM_OP_NODE_PARAMS) params_memOp}. */
    public static void nparams_memOp(long struct, CUDA_BATCH_MEM_OP_NODE_PARAMS value) { memCopy(value.address(), struct + CUgraphNodeParams.PARAMS_MEMOP, CUDA_BATCH_MEM_OP_NODE_PARAMS.SIZEOF); }
    /** Unsafe version of {@link #params_conditional(CUDA_CONDITIONAL_NODE_PARAMS) params_conditional}. */
    public static void nparams_conditional(long struct, CUDA_CONDITIONAL_NODE_PARAMS value) { memCopy(value.address(), struct + CUgraphNodeParams.PARAMS_CONDITIONAL, CUDA_CONDITIONAL_NODE_PARAMS.SIZEOF); }
    public static void nreserved2(long struct, long value) { memPutLong(struct + CUgraphNodeParams.RESERVED2, value); }

    // -----------------------------------

    /** An array of {@link CUgraphNodeParams} structs. */
    public static class Buffer extends StructBuffer<CUgraphNodeParams, Buffer> implements NativeResource {

        private static final CUgraphNodeParams ELEMENT_FACTORY = CUgraphNodeParams.create(-1L);

        /**
         * Creates a new {@code CUgraphNodeParams.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUgraphNodeParams#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUgraphNodeParams getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("CUgraphNodeType")
        public int type() { return CUgraphNodeParams.ntype(address()); }
        /** @return a {@link LongBuffer} view of the {@code params.reserved1} field. */
        @NativeType("long long[29]")
        public LongBuffer params_reserved1() { return CUgraphNodeParams.nparams_reserved1(address()); }
        /** @return the value at the specified index of the {@code params.reserved1} field. */
        @NativeType("long long")
        public long params_reserved1(int index) { return CUgraphNodeParams.nparams_reserved1(address(), index); }
        /** @return a {@link CUDA_KERNEL_NODE_PARAMS_v3} view of the {@code params.kernel} field. */
        public CUDA_KERNEL_NODE_PARAMS_v3 params_kernel() { return CUgraphNodeParams.nparams_kernel(address()); }
        /** @return a {@link CUDA_MEMCPY_NODE_PARAMS} view of the {@code params.memcpy} field. */
        public CUDA_MEMCPY_NODE_PARAMS params_memcpy() { return CUgraphNodeParams.nparams_memcpy(address()); }
        /** @return a {@link CUDA_MEMSET_NODE_PARAMS_v2} view of the {@code params.memset} field. */
        public CUDA_MEMSET_NODE_PARAMS_v2 params_memset() { return CUgraphNodeParams.nparams_memset(address()); }
        /** @return a {@link CUDA_HOST_NODE_PARAMS_v2} view of the {@code params.host} field. */
        public CUDA_HOST_NODE_PARAMS_v2 params_host() { return CUgraphNodeParams.nparams_host(address()); }
        /** @return a {@link CUDA_CHILD_GRAPH_NODE_PARAMS} view of the {@code params.graph} field. */
        public CUDA_CHILD_GRAPH_NODE_PARAMS params_graph() { return CUgraphNodeParams.nparams_graph(address()); }
        /** @return a {@link CUDA_EVENT_WAIT_NODE_PARAMS} view of the {@code params.eventWait} field. */
        public CUDA_EVENT_WAIT_NODE_PARAMS params_eventWait() { return CUgraphNodeParams.nparams_eventWait(address()); }
        /** @return a {@link CUDA_EVENT_RECORD_NODE_PARAMS} view of the {@code params.eventRecord} field. */
        public CUDA_EVENT_RECORD_NODE_PARAMS params_eventRecord() { return CUgraphNodeParams.nparams_eventRecord(address()); }
        /** @return a {@link CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2} view of the {@code params.extSemSignal} field. */
        public CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 params_extSemSignal() { return CUgraphNodeParams.nparams_extSemSignal(address()); }
        /** @return a {@link CUDA_EXT_SEM_WAIT_NODE_PARAMS_v2} view of the {@code params.extSemWait} field. */
        public CUDA_EXT_SEM_WAIT_NODE_PARAMS_v2 params_extSemWait() { return CUgraphNodeParams.nparams_extSemWait(address()); }
        /** @return a {@link CUDA_MEM_ALLOC_NODE_PARAMS} view of the {@code params.alloc} field. */
        public CUDA_MEM_ALLOC_NODE_PARAMS params_alloc() { return CUgraphNodeParams.nparams_alloc(address()); }
        /** @return a {@link CUDA_MEM_FREE_NODE_PARAMS} view of the {@code params.free} field. */
        public CUDA_MEM_FREE_NODE_PARAMS params_free() { return CUgraphNodeParams.nparams_free(address()); }
        /** @return a {@link CUDA_BATCH_MEM_OP_NODE_PARAMS} view of the {@code params.memOp} field. */
        public CUDA_BATCH_MEM_OP_NODE_PARAMS params_memOp() { return CUgraphNodeParams.nparams_memOp(address()); }
        /** @return a {@link CUDA_CONDITIONAL_NODE_PARAMS} view of the {@code params.conditional} field. */
        public CUDA_CONDITIONAL_NODE_PARAMS params_conditional() { return CUgraphNodeParams.nparams_conditional(address()); }

        /** Sets the specified value to the {@code type} field. */
        public CUgraphNodeParams.Buffer type(@NativeType("CUgraphNodeType") int value) { CUgraphNodeParams.ntype(address(), value); return this; }
        /** Copies the specified {@link LongBuffer} to the {@code reserved1} field. */
        public CUgraphNodeParams.Buffer params_reserved1(@NativeType("long long[29]") LongBuffer value) { CUgraphNodeParams.nparams_reserved1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code reserved1} field. */
        public CUgraphNodeParams.Buffer params_reserved1(int index, @NativeType("long long") long value) { CUgraphNodeParams.nparams_reserved1(address(), index, value); return this; }
        /** Copies the specified {@link CUDA_KERNEL_NODE_PARAMS_v3} to the {@code kernel} field. */
        public CUgraphNodeParams.Buffer params_kernel(CUDA_KERNEL_NODE_PARAMS_v3 value) { CUgraphNodeParams.nparams_kernel(address(), value); return this; }
        /** Passes the {@code kernel} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUgraphNodeParams.Buffer params_kernel(java.util.function.Consumer<CUDA_KERNEL_NODE_PARAMS_v3> consumer) { consumer.accept(params_kernel()); return this; }
        /** Copies the specified {@link CUDA_MEMCPY_NODE_PARAMS} to the {@code memcpy} field. */
        public CUgraphNodeParams.Buffer params_memcpy(CUDA_MEMCPY_NODE_PARAMS value) { CUgraphNodeParams.nparams_memcpy(address(), value); return this; }
        /** Passes the {@code memcpy} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUgraphNodeParams.Buffer params_memcpy(java.util.function.Consumer<CUDA_MEMCPY_NODE_PARAMS> consumer) { consumer.accept(params_memcpy()); return this; }
        /** Copies the specified {@link CUDA_MEMSET_NODE_PARAMS_v2} to the {@code memset} field. */
        public CUgraphNodeParams.Buffer params_memset(CUDA_MEMSET_NODE_PARAMS_v2 value) { CUgraphNodeParams.nparams_memset(address(), value); return this; }
        /** Passes the {@code memset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUgraphNodeParams.Buffer params_memset(java.util.function.Consumer<CUDA_MEMSET_NODE_PARAMS_v2> consumer) { consumer.accept(params_memset()); return this; }
        /** Copies the specified {@link CUDA_HOST_NODE_PARAMS_v2} to the {@code host} field. */
        public CUgraphNodeParams.Buffer params_host(CUDA_HOST_NODE_PARAMS_v2 value) { CUgraphNodeParams.nparams_host(address(), value); return this; }
        /** Passes the {@code host} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUgraphNodeParams.Buffer params_host(java.util.function.Consumer<CUDA_HOST_NODE_PARAMS_v2> consumer) { consumer.accept(params_host()); return this; }
        /** Copies the specified {@link CUDA_CHILD_GRAPH_NODE_PARAMS} to the {@code graph} field. */
        public CUgraphNodeParams.Buffer params_graph(CUDA_CHILD_GRAPH_NODE_PARAMS value) { CUgraphNodeParams.nparams_graph(address(), value); return this; }
        /** Passes the {@code graph} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUgraphNodeParams.Buffer params_graph(java.util.function.Consumer<CUDA_CHILD_GRAPH_NODE_PARAMS> consumer) { consumer.accept(params_graph()); return this; }
        /** Copies the specified {@link CUDA_EVENT_WAIT_NODE_PARAMS} to the {@code eventWait} field. */
        public CUgraphNodeParams.Buffer params_eventWait(CUDA_EVENT_WAIT_NODE_PARAMS value) { CUgraphNodeParams.nparams_eventWait(address(), value); return this; }
        /** Passes the {@code eventWait} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUgraphNodeParams.Buffer params_eventWait(java.util.function.Consumer<CUDA_EVENT_WAIT_NODE_PARAMS> consumer) { consumer.accept(params_eventWait()); return this; }
        /** Copies the specified {@link CUDA_EVENT_RECORD_NODE_PARAMS} to the {@code eventRecord} field. */
        public CUgraphNodeParams.Buffer params_eventRecord(CUDA_EVENT_RECORD_NODE_PARAMS value) { CUgraphNodeParams.nparams_eventRecord(address(), value); return this; }
        /** Passes the {@code eventRecord} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUgraphNodeParams.Buffer params_eventRecord(java.util.function.Consumer<CUDA_EVENT_RECORD_NODE_PARAMS> consumer) { consumer.accept(params_eventRecord()); return this; }
        /** Copies the specified {@link CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2} to the {@code extSemSignal} field. */
        public CUgraphNodeParams.Buffer params_extSemSignal(CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2 value) { CUgraphNodeParams.nparams_extSemSignal(address(), value); return this; }
        /** Passes the {@code extSemSignal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUgraphNodeParams.Buffer params_extSemSignal(java.util.function.Consumer<CUDA_EXT_SEM_SIGNAL_NODE_PARAMS_v2> consumer) { consumer.accept(params_extSemSignal()); return this; }
        /** Copies the specified {@link CUDA_EXT_SEM_WAIT_NODE_PARAMS_v2} to the {@code extSemWait} field. */
        public CUgraphNodeParams.Buffer params_extSemWait(CUDA_EXT_SEM_WAIT_NODE_PARAMS_v2 value) { CUgraphNodeParams.nparams_extSemWait(address(), value); return this; }
        /** Passes the {@code extSemWait} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUgraphNodeParams.Buffer params_extSemWait(java.util.function.Consumer<CUDA_EXT_SEM_WAIT_NODE_PARAMS_v2> consumer) { consumer.accept(params_extSemWait()); return this; }
        /** Copies the specified {@link CUDA_MEM_ALLOC_NODE_PARAMS} to the {@code alloc} field. */
        public CUgraphNodeParams.Buffer params_alloc(CUDA_MEM_ALLOC_NODE_PARAMS value) { CUgraphNodeParams.nparams_alloc(address(), value); return this; }
        /** Passes the {@code alloc} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUgraphNodeParams.Buffer params_alloc(java.util.function.Consumer<CUDA_MEM_ALLOC_NODE_PARAMS> consumer) { consumer.accept(params_alloc()); return this; }
        /** Copies the specified {@link CUDA_MEM_FREE_NODE_PARAMS} to the {@code free} field. */
        public CUgraphNodeParams.Buffer params_free(CUDA_MEM_FREE_NODE_PARAMS value) { CUgraphNodeParams.nparams_free(address(), value); return this; }
        /** Passes the {@code free} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUgraphNodeParams.Buffer params_free(java.util.function.Consumer<CUDA_MEM_FREE_NODE_PARAMS> consumer) { consumer.accept(params_free()); return this; }
        /** Copies the specified {@link CUDA_BATCH_MEM_OP_NODE_PARAMS} to the {@code memOp} field. */
        public CUgraphNodeParams.Buffer params_memOp(CUDA_BATCH_MEM_OP_NODE_PARAMS value) { CUgraphNodeParams.nparams_memOp(address(), value); return this; }
        /** Passes the {@code memOp} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUgraphNodeParams.Buffer params_memOp(java.util.function.Consumer<CUDA_BATCH_MEM_OP_NODE_PARAMS> consumer) { consumer.accept(params_memOp()); return this; }
        /** Copies the specified {@link CUDA_CONDITIONAL_NODE_PARAMS} to the {@code conditional} field. */
        public CUgraphNodeParams.Buffer params_conditional(CUDA_CONDITIONAL_NODE_PARAMS value) { CUgraphNodeParams.nparams_conditional(address(), value); return this; }
        /** Passes the {@code conditional} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUgraphNodeParams.Buffer params_conditional(java.util.function.Consumer<CUDA_CONDITIONAL_NODE_PARAMS> consumer) { consumer.accept(params_conditional()); return this; }

    }

}