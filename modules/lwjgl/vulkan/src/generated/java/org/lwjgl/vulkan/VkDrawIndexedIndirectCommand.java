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
 * Structure specifying an indexed indirect drawing command.
 * 
 * <h5>Description</h5>
 * 
 * <p>The members of {@link VkDrawIndexedIndirectCommand} have the same meaning as the similarly named parameters of {@link VK10#vkCmdDrawIndexed CmdDrawIndexed}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the bound graphics pipeline state was created with {@link VkPipelineVertexInputDivisorStateCreateInfoKHR} in the {@code pNext} chain of {@link VkGraphicsPipelineCreateInfo}{@code ::pVertexInputState}, any member of {@link VkPipelineVertexInputDivisorStateCreateInfoKHR}{@code ::pVertexBindingDivisors} has a value other than 1 in {@code divisor}, and {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR}{@code ::supportsNonZeroFirstInstance} is {@link VK10#VK_FALSE FALSE}, then {@code firstInstance} <b>must</b> be 0</li>
 * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-objects">shader objects</a> are used for drawing or the bound graphics pipeline state was created with the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled, any member of the {@code pVertexBindingDescriptions} parameter to the {@link EXTShaderObject#vkCmdSetVertexInputEXT CmdSetVertexInputEXT} call that sets this dynamic state has a value other than 1 in {@code divisor}, and {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR}{@code ::supportsNonZeroFirstInstance} is {@link VK10#VK_FALSE FALSE}, then {@code firstInstance} <b>must</b> be 0</li>
 * </ul>
 * 
 * <ul>
 * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess2">{@code robustBufferAccess2}</a> is not enabled, <code>(indexSize × (firstIndex + indexCount) + offset)</code> <b>must</b> be less than or equal to the size of the bound index buffer, with {@code indexSize} being based on the type specified by {@code indexType}, where the index buffer, {@code indexType}, and {@code offset} are specified via {@code vkCmdBindIndexBuffer} or {@code vkCmdBindIndexBuffer2KHR}. If {@code vkCmdBindIndexBuffer2KHR} is used to bind the index buffer, the size of the bound index buffer is {@link KHRMaintenance5#vkCmdBindIndexBuffer2KHR CmdBindIndexBuffer2KHR}{@code ::size}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-drawIndirectFirstInstance">{@code drawIndirectFirstInstance}</a> feature is not enabled, {@code firstInstance} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCmdDrawIndexedIndirect CmdDrawIndexedIndirect}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDrawIndexedIndirectCommand {
 *     uint32_t {@link #indexCount};
 *     uint32_t {@link #instanceCount};
 *     uint32_t {@link #firstIndex};
 *     int32_t {@link #vertexOffset};
 *     uint32_t {@link #firstInstance};
 * }</code></pre>
 */
public class VkDrawIndexedIndirectCommand extends Struct<VkDrawIndexedIndirectCommand> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INDEXCOUNT,
        INSTANCECOUNT,
        FIRSTINDEX,
        VERTEXOFFSET,
        FIRSTINSTANCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INDEXCOUNT = layout.offsetof(0);
        INSTANCECOUNT = layout.offsetof(1);
        FIRSTINDEX = layout.offsetof(2);
        VERTEXOFFSET = layout.offsetof(3);
        FIRSTINSTANCE = layout.offsetof(4);
    }

    protected VkDrawIndexedIndirectCommand(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDrawIndexedIndirectCommand create(long address, @Nullable ByteBuffer container) {
        return new VkDrawIndexedIndirectCommand(address, container);
    }

    /**
     * Creates a {@code VkDrawIndexedIndirectCommand} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDrawIndexedIndirectCommand(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the number of vertices to draw. */
    @NativeType("uint32_t")
    public int indexCount() { return nindexCount(address()); }
    /** the number of instances to draw. */
    @NativeType("uint32_t")
    public int instanceCount() { return ninstanceCount(address()); }
    /** the base index within the index buffer. */
    @NativeType("uint32_t")
    public int firstIndex() { return nfirstIndex(address()); }
    /** the value added to the vertex index before indexing into the vertex buffer. */
    @NativeType("int32_t")
    public int vertexOffset() { return nvertexOffset(address()); }
    /** the instance ID of the first instance to draw. */
    @NativeType("uint32_t")
    public int firstInstance() { return nfirstInstance(address()); }

    /** Sets the specified value to the {@link #indexCount} field. */
    public VkDrawIndexedIndirectCommand indexCount(@NativeType("uint32_t") int value) { nindexCount(address(), value); return this; }
    /** Sets the specified value to the {@link #instanceCount} field. */
    public VkDrawIndexedIndirectCommand instanceCount(@NativeType("uint32_t") int value) { ninstanceCount(address(), value); return this; }
    /** Sets the specified value to the {@link #firstIndex} field. */
    public VkDrawIndexedIndirectCommand firstIndex(@NativeType("uint32_t") int value) { nfirstIndex(address(), value); return this; }
    /** Sets the specified value to the {@link #vertexOffset} field. */
    public VkDrawIndexedIndirectCommand vertexOffset(@NativeType("int32_t") int value) { nvertexOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #firstInstance} field. */
    public VkDrawIndexedIndirectCommand firstInstance(@NativeType("uint32_t") int value) { nfirstInstance(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDrawIndexedIndirectCommand set(
        int indexCount,
        int instanceCount,
        int firstIndex,
        int vertexOffset,
        int firstInstance
    ) {
        indexCount(indexCount);
        instanceCount(instanceCount);
        firstIndex(firstIndex);
        vertexOffset(vertexOffset);
        firstInstance(firstInstance);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDrawIndexedIndirectCommand set(VkDrawIndexedIndirectCommand src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDrawIndexedIndirectCommand} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDrawIndexedIndirectCommand malloc() {
        return new VkDrawIndexedIndirectCommand(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDrawIndexedIndirectCommand} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDrawIndexedIndirectCommand calloc() {
        return new VkDrawIndexedIndirectCommand(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDrawIndexedIndirectCommand} instance allocated with {@link BufferUtils}. */
    public static VkDrawIndexedIndirectCommand create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDrawIndexedIndirectCommand(memAddress(container), container);
    }

    /** Returns a new {@code VkDrawIndexedIndirectCommand} instance for the specified memory address. */
    public static VkDrawIndexedIndirectCommand create(long address) {
        return new VkDrawIndexedIndirectCommand(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDrawIndexedIndirectCommand createSafe(long address) {
        return address == NULL ? null : new VkDrawIndexedIndirectCommand(address, null);
    }

    /**
     * Returns a new {@link VkDrawIndexedIndirectCommand.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawIndexedIndirectCommand.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDrawIndexedIndirectCommand.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawIndexedIndirectCommand.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawIndexedIndirectCommand.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawIndexedIndirectCommand.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDrawIndexedIndirectCommand.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDrawIndexedIndirectCommand.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDrawIndexedIndirectCommand.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDrawIndexedIndirectCommand mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDrawIndexedIndirectCommand callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDrawIndexedIndirectCommand mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDrawIndexedIndirectCommand callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDrawIndexedIndirectCommand.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDrawIndexedIndirectCommand.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDrawIndexedIndirectCommand.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDrawIndexedIndirectCommand.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDrawIndexedIndirectCommand} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrawIndexedIndirectCommand malloc(MemoryStack stack) {
        return new VkDrawIndexedIndirectCommand(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDrawIndexedIndirectCommand} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrawIndexedIndirectCommand calloc(MemoryStack stack) {
        return new VkDrawIndexedIndirectCommand(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDrawIndexedIndirectCommand.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrawIndexedIndirectCommand.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawIndexedIndirectCommand.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrawIndexedIndirectCommand.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #indexCount}. */
    public static int nindexCount(long struct) { return memGetInt(struct + VkDrawIndexedIndirectCommand.INDEXCOUNT); }
    /** Unsafe version of {@link #instanceCount}. */
    public static int ninstanceCount(long struct) { return memGetInt(struct + VkDrawIndexedIndirectCommand.INSTANCECOUNT); }
    /** Unsafe version of {@link #firstIndex}. */
    public static int nfirstIndex(long struct) { return memGetInt(struct + VkDrawIndexedIndirectCommand.FIRSTINDEX); }
    /** Unsafe version of {@link #vertexOffset}. */
    public static int nvertexOffset(long struct) { return memGetInt(struct + VkDrawIndexedIndirectCommand.VERTEXOFFSET); }
    /** Unsafe version of {@link #firstInstance}. */
    public static int nfirstInstance(long struct) { return memGetInt(struct + VkDrawIndexedIndirectCommand.FIRSTINSTANCE); }

    /** Unsafe version of {@link #indexCount(int) indexCount}. */
    public static void nindexCount(long struct, int value) { memPutInt(struct + VkDrawIndexedIndirectCommand.INDEXCOUNT, value); }
    /** Unsafe version of {@link #instanceCount(int) instanceCount}. */
    public static void ninstanceCount(long struct, int value) { memPutInt(struct + VkDrawIndexedIndirectCommand.INSTANCECOUNT, value); }
    /** Unsafe version of {@link #firstIndex(int) firstIndex}. */
    public static void nfirstIndex(long struct, int value) { memPutInt(struct + VkDrawIndexedIndirectCommand.FIRSTINDEX, value); }
    /** Unsafe version of {@link #vertexOffset(int) vertexOffset}. */
    public static void nvertexOffset(long struct, int value) { memPutInt(struct + VkDrawIndexedIndirectCommand.VERTEXOFFSET, value); }
    /** Unsafe version of {@link #firstInstance(int) firstInstance}. */
    public static void nfirstInstance(long struct, int value) { memPutInt(struct + VkDrawIndexedIndirectCommand.FIRSTINSTANCE, value); }

    // -----------------------------------

    /** An array of {@link VkDrawIndexedIndirectCommand} structs. */
    public static class Buffer extends StructBuffer<VkDrawIndexedIndirectCommand, Buffer> implements NativeResource {

        private static final VkDrawIndexedIndirectCommand ELEMENT_FACTORY = VkDrawIndexedIndirectCommand.create(-1L);

        /**
         * Creates a new {@code VkDrawIndexedIndirectCommand.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDrawIndexedIndirectCommand#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDrawIndexedIndirectCommand getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDrawIndexedIndirectCommand#indexCount} field. */
        @NativeType("uint32_t")
        public int indexCount() { return VkDrawIndexedIndirectCommand.nindexCount(address()); }
        /** @return the value of the {@link VkDrawIndexedIndirectCommand#instanceCount} field. */
        @NativeType("uint32_t")
        public int instanceCount() { return VkDrawIndexedIndirectCommand.ninstanceCount(address()); }
        /** @return the value of the {@link VkDrawIndexedIndirectCommand#firstIndex} field. */
        @NativeType("uint32_t")
        public int firstIndex() { return VkDrawIndexedIndirectCommand.nfirstIndex(address()); }
        /** @return the value of the {@link VkDrawIndexedIndirectCommand#vertexOffset} field. */
        @NativeType("int32_t")
        public int vertexOffset() { return VkDrawIndexedIndirectCommand.nvertexOffset(address()); }
        /** @return the value of the {@link VkDrawIndexedIndirectCommand#firstInstance} field. */
        @NativeType("uint32_t")
        public int firstInstance() { return VkDrawIndexedIndirectCommand.nfirstInstance(address()); }

        /** Sets the specified value to the {@link VkDrawIndexedIndirectCommand#indexCount} field. */
        public VkDrawIndexedIndirectCommand.Buffer indexCount(@NativeType("uint32_t") int value) { VkDrawIndexedIndirectCommand.nindexCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkDrawIndexedIndirectCommand#instanceCount} field. */
        public VkDrawIndexedIndirectCommand.Buffer instanceCount(@NativeType("uint32_t") int value) { VkDrawIndexedIndirectCommand.ninstanceCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkDrawIndexedIndirectCommand#firstIndex} field. */
        public VkDrawIndexedIndirectCommand.Buffer firstIndex(@NativeType("uint32_t") int value) { VkDrawIndexedIndirectCommand.nfirstIndex(address(), value); return this; }
        /** Sets the specified value to the {@link VkDrawIndexedIndirectCommand#vertexOffset} field. */
        public VkDrawIndexedIndirectCommand.Buffer vertexOffset(@NativeType("int32_t") int value) { VkDrawIndexedIndirectCommand.nvertexOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkDrawIndexedIndirectCommand#firstInstance} field. */
        public VkDrawIndexedIndirectCommand.Buffer firstInstance(@NativeType("uint32_t") int value) { VkDrawIndexedIndirectCommand.nfirstInstance(address(), value); return this; }

    }

}