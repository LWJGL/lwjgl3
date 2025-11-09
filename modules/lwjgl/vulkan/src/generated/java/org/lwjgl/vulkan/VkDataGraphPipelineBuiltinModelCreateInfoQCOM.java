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
 * struct VkDataGraphPipelineBuiltinModelCreateInfoQCOM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkPhysicalDeviceDataGraphOperationSupportARM VkPhysicalDeviceDataGraphOperationSupportARM} const * pOperation;
 * }</code></pre>
 */
public class VkDataGraphPipelineBuiltinModelCreateInfoQCOM extends Struct<VkDataGraphPipelineBuiltinModelCreateInfoQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        POPERATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        POPERATION = layout.offsetof(2);
    }

    protected VkDataGraphPipelineBuiltinModelCreateInfoQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphPipelineBuiltinModelCreateInfoQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphPipelineBuiltinModelCreateInfoQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM(ByteBuffer container) {
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
    /** @return a {@link VkPhysicalDeviceDataGraphOperationSupportARM} view of the struct pointed to by the {@code pOperation} field. */
    @NativeType("VkPhysicalDeviceDataGraphOperationSupportARM const *")
    public VkPhysicalDeviceDataGraphOperationSupportARM pOperation() { return npOperation(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMDataGraphModel#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_BUILTIN_MODEL_CREATE_INFO_QCOM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_BUILTIN_MODEL_CREATE_INFO_QCOM} value to the {@code sType} field. */
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM sType$Default() { return sType(QCOMDataGraphModel.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_BUILTIN_MODEL_CREATE_INFO_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkPhysicalDeviceDataGraphOperationSupportARM} to the {@code pOperation} field. */
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM pOperation(@NativeType("VkPhysicalDeviceDataGraphOperationSupportARM const *") VkPhysicalDeviceDataGraphOperationSupportARM value) { npOperation(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM set(
        int sType,
        long pNext,
        VkPhysicalDeviceDataGraphOperationSupportARM pOperation
    ) {
        sType(sType);
        pNext(pNext);
        pOperation(pOperation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM set(VkDataGraphPipelineBuiltinModelCreateInfoQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphPipelineBuiltinModelCreateInfoQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM malloc() {
        return new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineBuiltinModelCreateInfoQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM calloc() {
        return new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineBuiltinModelCreateInfoQCOM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphPipelineBuiltinModelCreateInfoQCOM} instance for the specified memory address. */
    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM create(long address) {
        return new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphPipelineBuiltinModelCreateInfoQCOM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineBuiltinModelCreateInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineBuiltinModelCreateInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineBuiltinModelCreateInfoQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphPipelineBuiltinModelCreateInfoQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineBuiltinModelCreateInfoQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineBuiltinModelCreateInfoQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineBuiltinModelCreateInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineBuiltinModelCreateInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphPipelineBuiltinModelCreateInfoQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphPipelineBuiltinModelCreateInfoQCOM.PNEXT); }
    /** Unsafe version of {@link #pOperation}. */
    public static VkPhysicalDeviceDataGraphOperationSupportARM npOperation(long struct) { return VkPhysicalDeviceDataGraphOperationSupportARM.create(memGetAddress(struct + VkDataGraphPipelineBuiltinModelCreateInfoQCOM.POPERATION)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphPipelineBuiltinModelCreateInfoQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphPipelineBuiltinModelCreateInfoQCOM.PNEXT, value); }
    /** Unsafe version of {@link #pOperation(VkPhysicalDeviceDataGraphOperationSupportARM) pOperation}. */
    public static void npOperation(long struct, VkPhysicalDeviceDataGraphOperationSupportARM value) { memPutAddress(struct + VkDataGraphPipelineBuiltinModelCreateInfoQCOM.POPERATION, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDataGraphPipelineBuiltinModelCreateInfoQCOM.POPERATION));
    }

    // -----------------------------------

    /** An array of {@link VkDataGraphPipelineBuiltinModelCreateInfoQCOM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineBuiltinModelCreateInfoQCOM, Buffer> implements NativeResource {

        private static final VkDataGraphPipelineBuiltinModelCreateInfoQCOM ELEMENT_FACTORY = VkDataGraphPipelineBuiltinModelCreateInfoQCOM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphPipelineBuiltinModelCreateInfoQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphPipelineBuiltinModelCreateInfoQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphPipelineBuiltinModelCreateInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphPipelineBuiltinModelCreateInfoQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDataGraphPipelineBuiltinModelCreateInfoQCOM.npNext(address()); }
        /** @return a {@link VkPhysicalDeviceDataGraphOperationSupportARM} view of the struct pointed to by the {@code pOperation} field. */
        @NativeType("VkPhysicalDeviceDataGraphOperationSupportARM const *")
        public VkPhysicalDeviceDataGraphOperationSupportARM pOperation() { return VkDataGraphPipelineBuiltinModelCreateInfoQCOM.npOperation(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphPipelineBuiltinModelCreateInfoQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphPipelineBuiltinModelCreateInfoQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMDataGraphModel#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_BUILTIN_MODEL_CREATE_INFO_QCOM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_BUILTIN_MODEL_CREATE_INFO_QCOM} value to the {@code sType} field. */
        public VkDataGraphPipelineBuiltinModelCreateInfoQCOM.Buffer sType$Default() { return sType(QCOMDataGraphModel.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_BUILTIN_MODEL_CREATE_INFO_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphPipelineBuiltinModelCreateInfoQCOM.Buffer pNext(@NativeType("void const *") long value) { VkDataGraphPipelineBuiltinModelCreateInfoQCOM.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkPhysicalDeviceDataGraphOperationSupportARM} to the {@code pOperation} field. */
        public VkDataGraphPipelineBuiltinModelCreateInfoQCOM.Buffer pOperation(@NativeType("VkPhysicalDeviceDataGraphOperationSupportARM const *") VkPhysicalDeviceDataGraphOperationSupportARM value) { VkDataGraphPipelineBuiltinModelCreateInfoQCOM.npOperation(address(), value); return this; }

    }

}