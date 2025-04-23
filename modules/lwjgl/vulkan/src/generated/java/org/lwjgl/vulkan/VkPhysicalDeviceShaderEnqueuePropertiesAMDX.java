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
 * <pre>{@code
 * struct VkPhysicalDeviceShaderEnqueuePropertiesAMDX {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxExecutionGraphDepth;
 *     uint32_t maxExecutionGraphShaderOutputNodes;
 *     uint32_t maxExecutionGraphShaderPayloadSize;
 *     uint32_t maxExecutionGraphShaderPayloadCount;
 *     uint32_t executionGraphDispatchAddressAlignment;
 *     uint32_t maxExecutionGraphWorkgroupCount[3];
 *     uint32_t maxExecutionGraphWorkgroups;
 * }}</pre>
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
        EXECUTIONGRAPHDISPATCHADDRESSALIGNMENT,
        MAXEXECUTIONGRAPHWORKGROUPCOUNT,
        MAXEXECUTIONGRAPHWORKGROUPS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 3),
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
        MAXEXECUTIONGRAPHWORKGROUPCOUNT = layout.offsetof(7);
        MAXEXECUTIONGRAPHWORKGROUPS = layout.offsetof(8);
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code maxExecutionGraphDepth} field. */
    @NativeType("uint32_t")
    public int maxExecutionGraphDepth() { return nmaxExecutionGraphDepth(address()); }
    /** @return the value of the {@code maxExecutionGraphShaderOutputNodes} field. */
    @NativeType("uint32_t")
    public int maxExecutionGraphShaderOutputNodes() { return nmaxExecutionGraphShaderOutputNodes(address()); }
    /** @return the value of the {@code maxExecutionGraphShaderPayloadSize} field. */
    @NativeType("uint32_t")
    public int maxExecutionGraphShaderPayloadSize() { return nmaxExecutionGraphShaderPayloadSize(address()); }
    /** @return the value of the {@code maxExecutionGraphShaderPayloadCount} field. */
    @NativeType("uint32_t")
    public int maxExecutionGraphShaderPayloadCount() { return nmaxExecutionGraphShaderPayloadCount(address()); }
    /** @return the value of the {@code executionGraphDispatchAddressAlignment} field. */
    @NativeType("uint32_t")
    public int executionGraphDispatchAddressAlignment() { return nexecutionGraphDispatchAddressAlignment(address()); }
    /** @return a {@link IntBuffer} view of the {@code maxExecutionGraphWorkgroupCount} field. */
    @NativeType("uint32_t[3]")
    public IntBuffer maxExecutionGraphWorkgroupCount() { return nmaxExecutionGraphWorkgroupCount(address()); }
    /** @return the value at the specified index of the {@code maxExecutionGraphWorkgroupCount} field. */
    @NativeType("uint32_t")
    public int maxExecutionGraphWorkgroupCount(int index) { return nmaxExecutionGraphWorkgroupCount(address(), index); }
    /** @return the value of the {@code maxExecutionGraphWorkgroups} field. */
    @NativeType("uint32_t")
    public int maxExecutionGraphWorkgroups() { return nmaxExecutionGraphWorkgroups(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDXShaderEnqueue#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX sType$Default() { return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

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
    public static @Nullable VkPhysicalDeviceShaderEnqueuePropertiesAMDX createSafe(long address) {
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
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX.@Nullable Buffer createSafe(long address, int capacity) {
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
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.PNEXT); }
    /** Unsafe version of {@link #maxExecutionGraphDepth}. */
    public static int nmaxExecutionGraphDepth(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHDEPTH); }
    /** Unsafe version of {@link #maxExecutionGraphShaderOutputNodes}. */
    public static int nmaxExecutionGraphShaderOutputNodes(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHSHADEROUTPUTNODES); }
    /** Unsafe version of {@link #maxExecutionGraphShaderPayloadSize}. */
    public static int nmaxExecutionGraphShaderPayloadSize(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHSHADERPAYLOADSIZE); }
    /** Unsafe version of {@link #maxExecutionGraphShaderPayloadCount}. */
    public static int nmaxExecutionGraphShaderPayloadCount(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHSHADERPAYLOADCOUNT); }
    /** Unsafe version of {@link #executionGraphDispatchAddressAlignment}. */
    public static int nexecutionGraphDispatchAddressAlignment(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.EXECUTIONGRAPHDISPATCHADDRESSALIGNMENT); }
    /** Unsafe version of {@link #maxExecutionGraphWorkgroupCount}. */
    public static IntBuffer nmaxExecutionGraphWorkgroupCount(long struct) { return memIntBuffer(struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHWORKGROUPCOUNT, 3); }
    /** Unsafe version of {@link #maxExecutionGraphWorkgroupCount(int) maxExecutionGraphWorkgroupCount}. */
    public static int nmaxExecutionGraphWorkgroupCount(long struct, int index) {
        return memGetInt(struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHWORKGROUPCOUNT + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #maxExecutionGraphWorkgroups}. */
    public static int nmaxExecutionGraphWorkgroups(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.MAXEXECUTIONGRAPHWORKGROUPS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderEnqueuePropertiesAMDX.PNEXT, value); }

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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPhysicalDeviceShaderEnqueuePropertiesAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.npNext(address()); }
        /** @return the value of the {@code maxExecutionGraphDepth} field. */
        @NativeType("uint32_t")
        public int maxExecutionGraphDepth() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphDepth(address()); }
        /** @return the value of the {@code maxExecutionGraphShaderOutputNodes} field. */
        @NativeType("uint32_t")
        public int maxExecutionGraphShaderOutputNodes() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphShaderOutputNodes(address()); }
        /** @return the value of the {@code maxExecutionGraphShaderPayloadSize} field. */
        @NativeType("uint32_t")
        public int maxExecutionGraphShaderPayloadSize() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphShaderPayloadSize(address()); }
        /** @return the value of the {@code maxExecutionGraphShaderPayloadCount} field. */
        @NativeType("uint32_t")
        public int maxExecutionGraphShaderPayloadCount() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphShaderPayloadCount(address()); }
        /** @return the value of the {@code executionGraphDispatchAddressAlignment} field. */
        @NativeType("uint32_t")
        public int executionGraphDispatchAddressAlignment() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nexecutionGraphDispatchAddressAlignment(address()); }
        /** @return a {@link IntBuffer} view of the {@code maxExecutionGraphWorkgroupCount} field. */
        @NativeType("uint32_t[3]")
        public IntBuffer maxExecutionGraphWorkgroupCount() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphWorkgroupCount(address()); }
        /** @return the value at the specified index of the {@code maxExecutionGraphWorkgroupCount} field. */
        @NativeType("uint32_t")
        public int maxExecutionGraphWorkgroupCount(int index) { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphWorkgroupCount(address(), index); }
        /** @return the value of the {@code maxExecutionGraphWorkgroups} field. */
        @NativeType("uint32_t")
        public int maxExecutionGraphWorkgroups() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphWorkgroups(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nsType(address(), value); return this; }
        /** Sets the {@link AMDXShaderEnqueue#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer sType$Default() { return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.npNext(address(), value); return this; }

    }

}