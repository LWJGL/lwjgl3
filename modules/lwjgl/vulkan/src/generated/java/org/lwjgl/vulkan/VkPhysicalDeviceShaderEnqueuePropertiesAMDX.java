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
 * Structure describing shader enqueue limits of an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link AMDXShaderEnqueue#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderEnqueuePropertiesAMDX {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #maxExecutionGraphDepth};
 *     uint32_t {@link #maxExecutionGraphShaderOutputNodes};
 *     uint32_t {@link #maxExecutionGraphShaderPayloadSize};
 *     uint32_t {@link #maxExecutionGraphShaderPayloadCount};
 *     uint32_t {@link #executionGraphDispatchAddressAlignment};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderEnqueuePropertiesAMDX extends Struct<VkPhysicalDeviceShaderEnqueuePropertiesAMDX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXEXECUTIONGRAPHDEPTH,
        MAXEXECUTIONGRAPHSHADEROUTPUTNODES,
        MAXEXECUTIONGRAPHSHADERPAYLOADSIZE,
        MAXEXECUTIONGRAPHSHADERPAYLOADCOUNT,
        EXECUTIONGRAPHDISPATCHADDRESSALIGNMENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXEXECUTIONGRAPHDEPTH = layout.offsetof(2);
        MAXEXECUTIONGRAPHSHADEROUTPUTNODES = layout.offsetof(3);
        MAXEXECUTIONGRAPHSHADERPAYLOADSIZE = layout.offsetof(4);
        MAXEXECUTIONGRAPHSHADERPAYLOADCOUNT = layout.offsetof(5);
        EXECUTIONGRAPHDISPATCHADDRESSALIGNMENT = layout.offsetof(6);
    }

    protected VkPhysicalDeviceShaderEnqueuePropertiesAMDX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderEnqueuePropertiesAMDX create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderEnqueuePropertiesAMDX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** defines the maximum node chain depth in the graph. The dispatched node is at depth 1 and the node enqueued by it is at depth 2, and so on. If a node enqueues itself, each recursive enqueue increases the depth by 1 as well. */
    @NativeType("uint32_t")
    public int maxExecutionGraphDepth() { return nmaxExecutionGraphDepth(address()); }
    /** specifies the maximum number of unique nodes that can be dispatched from a single shader, and must be at least 256. */
    @NativeType("uint32_t")
    public int maxExecutionGraphShaderOutputNodes() { return nmaxExecutionGraphShaderOutputNodes(address()); }
    /** specifies the maximum total size of payload declarations in a shader. For any payload declarations that share resources, indicated by {@code NodeSharesPayloadLimitsWithAMDX} decorations, the maximum size of each set of shared payload declarations is taken. The sum of each shared set’s maximum size and the size of each unshared payload is counted against this limit. */
    @NativeType("uint32_t")
    public int maxExecutionGraphShaderPayloadSize() { return nmaxExecutionGraphShaderPayloadSize(address()); }
    /** specifies the maximum number of output payloads that can be initialized in a single workgroup. */
    @NativeType("uint32_t")
    public int maxExecutionGraphShaderPayloadCount() { return nmaxExecutionGraphShaderPayloadCount(address()); }
    /** specifies the alignment of non-scratch {@code VkDeviceAddress} arguments consumed by graph dispatch commands. */
    @NativeType("uint32_t")
    public int executionGraphDispatchAddressAlignment() { return nexecutionGraphDispatchAddressAlignment(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDXShaderEnqueue#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX sType$Default() { return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #maxExecutionGraphDepth} field. */
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphDepth(@NativeType("uint32_t") int value) { nmaxExecutionGraphDepth(address(), value); return this; }
    /** Sets the specified value to the {@link #maxExecutionGraphShaderOutputNodes} field. */
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderOutputNodes(@NativeType("uint32_t") int value) { nmaxExecutionGraphShaderOutputNodes(address(), value); return this; }
    /** Sets the specified value to the {@link #maxExecutionGraphShaderPayloadSize} field. */
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderPayloadSize(@NativeType("uint32_t") int value) { nmaxExecutionGraphShaderPayloadSize(address(), value); return this; }
    /** Sets the specified value to the {@link #maxExecutionGraphShaderPayloadCount} field. */
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderPayloadCount(@NativeType("uint32_t") int value) { nmaxExecutionGraphShaderPayloadCount(address(), value); return this; }
    /** Sets the specified value to the {@link #executionGraphDispatchAddressAlignment} field. */
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX executionGraphDispatchAddressAlignment(@NativeType("uint32_t") int value) { nexecutionGraphDispatchAddressAlignment(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX set(
        int sType,
        long pNext,
        int maxExecutionGraphDepth,
        int maxExecutionGraphShaderOutputNodes,
        int maxExecutionGraphShaderPayloadSize,
        int maxExecutionGraphShaderPayloadCount,
        int executionGraphDispatchAddressAlignment
    ) {
        sType(sType);
        pNext(pNext);
        maxExecutionGraphDepth(maxExecutionGraphDepth);
        maxExecutionGraphShaderOutputNodes(maxExecutionGraphShaderOutputNodes);
        maxExecutionGraphShaderPayloadSize(maxExecutionGraphShaderPayloadSize);
        maxExecutionGraphShaderPayloadCount(maxExecutionGraphShaderPayloadCount);
        executionGraphDispatchAddressAlignment(executionGraphDispatchAddressAlignment);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX set(VkPhysicalDeviceShaderEnqueuePropertiesAMDX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderEnqueuePropertiesAMDX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX malloc() {
        return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderEnqueuePropertiesAMDX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX calloc() {
        return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderEnqueuePropertiesAMDX} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderEnqueuePropertiesAMDX} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX create(long address) {
        return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderEnqueuePropertiesAMDX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderEnqueuePropertiesAMDX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.PNEXT); }
    /** Unsafe version of {@link #maxExecutionGraphDepth}. */
    public static int nmaxExecutionGraphDepth(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHDEPTH); }
    /** Unsafe version of {@link #maxExecutionGraphShaderOutputNodes}. */
    public static int nmaxExecutionGraphShaderOutputNodes(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHSHADEROUTPUTNODES); }
    /** Unsafe version of {@link #maxExecutionGraphShaderPayloadSize}. */
    public static int nmaxExecutionGraphShaderPayloadSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHSHADERPAYLOADSIZE); }
    /** Unsafe version of {@link #maxExecutionGraphShaderPayloadCount}. */
    public static int nmaxExecutionGraphShaderPayloadCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHSHADERPAYLOADCOUNT); }
    /** Unsafe version of {@link #executionGraphDispatchAddressAlignment}. */
    public static int nexecutionGraphDispatchAddressAlignment(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.EXECUTIONGRAPHDISPATCHADDRESSALIGNMENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.PNEXT, value); }
    /** Unsafe version of {@link #maxExecutionGraphDepth(int) maxExecutionGraphDepth}. */
    public static void nmaxExecutionGraphDepth(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHDEPTH, value); }
    /** Unsafe version of {@link #maxExecutionGraphShaderOutputNodes(int) maxExecutionGraphShaderOutputNodes}. */
    public static void nmaxExecutionGraphShaderOutputNodes(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHSHADEROUTPUTNODES, value); }
    /** Unsafe version of {@link #maxExecutionGraphShaderPayloadSize(int) maxExecutionGraphShaderPayloadSize}. */
    public static void nmaxExecutionGraphShaderPayloadSize(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHSHADERPAYLOADSIZE, value); }
    /** Unsafe version of {@link #maxExecutionGraphShaderPayloadCount(int) maxExecutionGraphShaderPayloadCount}. */
    public static void nmaxExecutionGraphShaderPayloadCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHSHADERPAYLOADCOUNT, value); }
    /** Unsafe version of {@link #executionGraphDispatchAddressAlignment(int) executionGraphDispatchAddressAlignment}. */
    public static void nexecutionGraphDispatchAddressAlignment(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.EXECUTIONGRAPHDISPATCHADDRESSALIGNMENT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderEnqueuePropertiesAMDX, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderEnqueuePropertiesAMDX ELEMENT_FACTORY = VkPhysicalDeviceShaderEnqueuePropertiesAMDX.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderEnqueuePropertiesAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX#maxExecutionGraphDepth} field. */
        @NativeType("uint32_t")
        public int maxExecutionGraphDepth() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphDepth(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX#maxExecutionGraphShaderOutputNodes} field. */
        @NativeType("uint32_t")
        public int maxExecutionGraphShaderOutputNodes() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphShaderOutputNodes(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX#maxExecutionGraphShaderPayloadSize} field. */
        @NativeType("uint32_t")
        public int maxExecutionGraphShaderPayloadSize() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphShaderPayloadSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX#maxExecutionGraphShaderPayloadCount} field. */
        @NativeType("uint32_t")
        public int maxExecutionGraphShaderPayloadCount() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphShaderPayloadCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX#executionGraphDispatchAddressAlignment} field. */
        @NativeType("uint32_t")
        public int executionGraphDispatchAddressAlignment() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nexecutionGraphDispatchAddressAlignment(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX#sType} field. */
        public VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nsType(address(), value); return this; }
        /** Sets the {@link AMDXShaderEnqueue#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX} value to the {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX#sType} field. */
        public VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer sType$Default() { return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX#pNext} field. */
        public VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX#maxExecutionGraphDepth} field. */
        public VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer maxExecutionGraphDepth(@NativeType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphDepth(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX#maxExecutionGraphShaderOutputNodes} field. */
        public VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer maxExecutionGraphShaderOutputNodes(@NativeType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphShaderOutputNodes(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX#maxExecutionGraphShaderPayloadSize} field. */
        public VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer maxExecutionGraphShaderPayloadSize(@NativeType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphShaderPayloadSize(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX#maxExecutionGraphShaderPayloadCount} field. */
        public VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer maxExecutionGraphShaderPayloadCount(@NativeType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphShaderPayloadCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX#executionGraphDispatchAddressAlignment} field. */
        public VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer executionGraphDispatchAddressAlignment(@NativeType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nexecutionGraphDispatchAddressAlignment(address(), value); return this; }

    }

}