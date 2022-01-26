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
 * Structure specifying a indirect drawing command.
 * 
 * <h5>Description</h5>
 * 
 * <p>The members of {@link VkDrawIndirectCommand} have the same meaning as the similarly named parameters of {@link VK10#vkCmdDraw CmdDraw}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fxvertex-input">Vertex Input Description</a></li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-drawIndirectFirstInstance">drawIndirectFirstInstance</a> feature is not enabled, {@code firstInstance} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCmdDrawIndirect CmdDrawIndirect}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDrawIndirectCommand {
 *     uint32_t {@link #vertexCount};
 *     uint32_t {@link #instanceCount};
 *     uint32_t {@link #firstVertex};
 *     uint32_t {@link #firstInstance};
 * }</code></pre>
 */
public class VkDrawIndirectCommand extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERTEXCOUNT,
        INSTANCECOUNT,
        FIRSTVERTEX,
        FIRSTINSTANCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERTEXCOUNT = layout.offsetof(0);
        INSTANCECOUNT = layout.offsetof(1);
        FIRSTVERTEX = layout.offsetof(2);
        FIRSTINSTANCE = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkDrawIndirectCommand} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDrawIndirectCommand(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the number of vertices to draw. */
    @NativeType("uint32_t")
    public int vertexCount() { return nvertexCount(address()); }
    /** the number of instances to draw. */
    @NativeType("uint32_t")
    public int instanceCount() { return ninstanceCount(address()); }
    /** the index of the first vertex to draw. */
    @NativeType("uint32_t")
    public int firstVertex() { return nfirstVertex(address()); }
    /** the instance ID of the first instance to draw. */
    @NativeType("uint32_t")
    public int firstInstance() { return nfirstInstance(address()); }

    /** Sets the specified value to the {@link #vertexCount} field. */
    public VkDrawIndirectCommand vertexCount(@NativeType("uint32_t") int value) { nvertexCount(address(), value); return this; }
    /** Sets the specified value to the {@link #instanceCount} field. */
    public VkDrawIndirectCommand instanceCount(@NativeType("uint32_t") int value) { ninstanceCount(address(), value); return this; }
    /** Sets the specified value to the {@link #firstVertex} field. */
    public VkDrawIndirectCommand firstVertex(@NativeType("uint32_t") int value) { nfirstVertex(address(), value); return this; }
    /** Sets the specified value to the {@link #firstInstance} field. */
    public VkDrawIndirectCommand firstInstance(@NativeType("uint32_t") int value) { nfirstInstance(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDrawIndirectCommand set(
        int vertexCount,
        int instanceCount,
        int firstVertex,
        int firstInstance
    ) {
        vertexCount(vertexCount);
        instanceCount(instanceCount);
        firstVertex(firstVertex);
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
    public VkDrawIndirectCommand set(VkDrawIndirectCommand src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDrawIndirectCommand} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDrawIndirectCommand malloc() {
        return wrap(VkDrawIndirectCommand.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDrawIndirectCommand} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDrawIndirectCommand calloc() {
        return wrap(VkDrawIndirectCommand.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDrawIndirectCommand} instance allocated with {@link BufferUtils}. */
    public static VkDrawIndirectCommand create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDrawIndirectCommand.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDrawIndirectCommand} instance for the specified memory address. */
    public static VkDrawIndirectCommand create(long address) {
        return wrap(VkDrawIndirectCommand.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDrawIndirectCommand createSafe(long address) {
        return address == NULL ? null : wrap(VkDrawIndirectCommand.class, address);
    }

    /**
     * Returns a new {@link VkDrawIndirectCommand.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCommand.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDrawIndirectCommand.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCommand.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawIndirectCommand.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCommand.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDrawIndirectCommand.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCommand.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDrawIndirectCommand.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDrawIndirectCommand mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDrawIndirectCommand callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDrawIndirectCommand mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDrawIndirectCommand callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDrawIndirectCommand.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDrawIndirectCommand.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDrawIndirectCommand.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDrawIndirectCommand.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDrawIndirectCommand} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrawIndirectCommand malloc(MemoryStack stack) {
        return wrap(VkDrawIndirectCommand.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDrawIndirectCommand} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrawIndirectCommand calloc(MemoryStack stack) {
        return wrap(VkDrawIndirectCommand.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDrawIndirectCommand.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCommand.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawIndirectCommand.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCommand.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vertexCount}. */
    public static int nvertexCount(long struct) { return UNSAFE.getInt(null, struct + VkDrawIndirectCommand.VERTEXCOUNT); }
    /** Unsafe version of {@link #instanceCount}. */
    public static int ninstanceCount(long struct) { return UNSAFE.getInt(null, struct + VkDrawIndirectCommand.INSTANCECOUNT); }
    /** Unsafe version of {@link #firstVertex}. */
    public static int nfirstVertex(long struct) { return UNSAFE.getInt(null, struct + VkDrawIndirectCommand.FIRSTVERTEX); }
    /** Unsafe version of {@link #firstInstance}. */
    public static int nfirstInstance(long struct) { return UNSAFE.getInt(null, struct + VkDrawIndirectCommand.FIRSTINSTANCE); }

    /** Unsafe version of {@link #vertexCount(int) vertexCount}. */
    public static void nvertexCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDrawIndirectCommand.VERTEXCOUNT, value); }
    /** Unsafe version of {@link #instanceCount(int) instanceCount}. */
    public static void ninstanceCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDrawIndirectCommand.INSTANCECOUNT, value); }
    /** Unsafe version of {@link #firstVertex(int) firstVertex}. */
    public static void nfirstVertex(long struct, int value) { UNSAFE.putInt(null, struct + VkDrawIndirectCommand.FIRSTVERTEX, value); }
    /** Unsafe version of {@link #firstInstance(int) firstInstance}. */
    public static void nfirstInstance(long struct, int value) { UNSAFE.putInt(null, struct + VkDrawIndirectCommand.FIRSTINSTANCE, value); }

    // -----------------------------------

    /** An array of {@link VkDrawIndirectCommand} structs. */
    public static class Buffer extends StructBuffer<VkDrawIndirectCommand, Buffer> implements NativeResource {

        private static final VkDrawIndirectCommand ELEMENT_FACTORY = VkDrawIndirectCommand.create(-1L);

        /**
         * Creates a new {@code VkDrawIndirectCommand.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDrawIndirectCommand#SIZEOF}, and its mark will be undefined.
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
        protected VkDrawIndirectCommand getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDrawIndirectCommand#vertexCount} field. */
        @NativeType("uint32_t")
        public int vertexCount() { return VkDrawIndirectCommand.nvertexCount(address()); }
        /** @return the value of the {@link VkDrawIndirectCommand#instanceCount} field. */
        @NativeType("uint32_t")
        public int instanceCount() { return VkDrawIndirectCommand.ninstanceCount(address()); }
        /** @return the value of the {@link VkDrawIndirectCommand#firstVertex} field. */
        @NativeType("uint32_t")
        public int firstVertex() { return VkDrawIndirectCommand.nfirstVertex(address()); }
        /** @return the value of the {@link VkDrawIndirectCommand#firstInstance} field. */
        @NativeType("uint32_t")
        public int firstInstance() { return VkDrawIndirectCommand.nfirstInstance(address()); }

        /** Sets the specified value to the {@link VkDrawIndirectCommand#vertexCount} field. */
        public VkDrawIndirectCommand.Buffer vertexCount(@NativeType("uint32_t") int value) { VkDrawIndirectCommand.nvertexCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkDrawIndirectCommand#instanceCount} field. */
        public VkDrawIndirectCommand.Buffer instanceCount(@NativeType("uint32_t") int value) { VkDrawIndirectCommand.ninstanceCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkDrawIndirectCommand#firstVertex} field. */
        public VkDrawIndirectCommand.Buffer firstVertex(@NativeType("uint32_t") int value) { VkDrawIndirectCommand.nfirstVertex(address(), value); return this; }
        /** Sets the specified value to the {@link VkDrawIndirectCommand#firstInstance} field. */
        public VkDrawIndirectCommand.Buffer firstInstance(@NativeType("uint32_t") int value) { VkDrawIndirectCommand.nfirstInstance(address(), value); return this; }

    }

}