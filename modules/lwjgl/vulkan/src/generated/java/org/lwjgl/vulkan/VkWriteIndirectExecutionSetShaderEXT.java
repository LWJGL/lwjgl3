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
 * Struct specifying shader object update information for an indirect execution set.
 * 
 * <h5>Description</h5>
 * 
 * <p>Shaders need not be stored in the Indirect Execution Set according to their stage. The only restriction for shader indices within a set is that the value of the index <b>must</b> be less than the maximum number of shaders in the set.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code index} <b>must</b> be less than {@link VkIndirectExecutionSetShaderInfoEXT}{@code ::maxShaderCount}</li>
 * <li>{@code shader} <b>must</b> have been created with {@link EXTDeviceGeneratedCommands#VK_SHADER_CREATE_INDIRECT_BINDABLE_BIT_EXT SHADER_CREATE_INDIRECT_BINDABLE_BIT_EXT}</li>
 * <li>A shader created with the same {@code VkShaderStageFlagBits} <b>must</b> have been passed in the {@link VkIndirectExecutionSetShaderInfoEXT}{@code ::pInitialShaders} array</li>
 * <li>{@code index} <b>must</b> not be in use by submitted command buffers</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT}</li>
 * <li>{@code shader} <b>must</b> be a valid {@code VkShaderEXT} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTDeviceGeneratedCommands#vkUpdateIndirectExecutionSetShaderEXT UpdateIndirectExecutionSetShaderEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkWriteIndirectExecutionSetShaderEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #index};
 *     VkShaderEXT {@link #shader};
 * }</code></pre>
 */
public class VkWriteIndirectExecutionSetShaderEXT extends Struct<VkWriteIndirectExecutionSetShaderEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        INDEX,
        SHADER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INDEX = layout.offsetof(2);
        SHADER = layout.offsetof(3);
    }

    protected VkWriteIndirectExecutionSetShaderEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkWriteIndirectExecutionSetShaderEXT create(long address, @Nullable ByteBuffer container) {
        return new VkWriteIndirectExecutionSetShaderEXT(address, container);
    }

    /**
     * Creates a {@code VkWriteIndirectExecutionSetShaderEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkWriteIndirectExecutionSetShaderEXT(ByteBuffer container) {
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
    /** the element of the set to update */
    @NativeType("uint32_t")
    public int index() { return nindex(address()); }
    /** the shader to store in the indirect execution set */
    @NativeType("VkShaderEXT")
    public long shader() { return nshader(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkWriteIndirectExecutionSetShaderEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT} value to the {@link #sType} field. */
    public VkWriteIndirectExecutionSetShaderEXT sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkWriteIndirectExecutionSetShaderEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #index} field. */
    public VkWriteIndirectExecutionSetShaderEXT index(@NativeType("uint32_t") int value) { nindex(address(), value); return this; }
    /** Sets the specified value to the {@link #shader} field. */
    public VkWriteIndirectExecutionSetShaderEXT shader(@NativeType("VkShaderEXT") long value) { nshader(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkWriteIndirectExecutionSetShaderEXT set(
        int sType,
        long pNext,
        int index,
        long shader
    ) {
        sType(sType);
        pNext(pNext);
        index(index);
        shader(shader);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkWriteIndirectExecutionSetShaderEXT set(VkWriteIndirectExecutionSetShaderEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkWriteIndirectExecutionSetShaderEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkWriteIndirectExecutionSetShaderEXT malloc() {
        return new VkWriteIndirectExecutionSetShaderEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkWriteIndirectExecutionSetShaderEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkWriteIndirectExecutionSetShaderEXT calloc() {
        return new VkWriteIndirectExecutionSetShaderEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkWriteIndirectExecutionSetShaderEXT} instance allocated with {@link BufferUtils}. */
    public static VkWriteIndirectExecutionSetShaderEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkWriteIndirectExecutionSetShaderEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkWriteIndirectExecutionSetShaderEXT} instance for the specified memory address. */
    public static VkWriteIndirectExecutionSetShaderEXT create(long address) {
        return new VkWriteIndirectExecutionSetShaderEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkWriteIndirectExecutionSetShaderEXT createSafe(long address) {
        return address == NULL ? null : new VkWriteIndirectExecutionSetShaderEXT(address, null);
    }

    /**
     * Returns a new {@link VkWriteIndirectExecutionSetShaderEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteIndirectExecutionSetShaderEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkWriteIndirectExecutionSetShaderEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteIndirectExecutionSetShaderEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteIndirectExecutionSetShaderEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteIndirectExecutionSetShaderEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkWriteIndirectExecutionSetShaderEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkWriteIndirectExecutionSetShaderEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkWriteIndirectExecutionSetShaderEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkWriteIndirectExecutionSetShaderEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteIndirectExecutionSetShaderEXT malloc(MemoryStack stack) {
        return new VkWriteIndirectExecutionSetShaderEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkWriteIndirectExecutionSetShaderEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteIndirectExecutionSetShaderEXT calloc(MemoryStack stack) {
        return new VkWriteIndirectExecutionSetShaderEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkWriteIndirectExecutionSetShaderEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteIndirectExecutionSetShaderEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteIndirectExecutionSetShaderEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteIndirectExecutionSetShaderEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkWriteIndirectExecutionSetShaderEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkWriteIndirectExecutionSetShaderEXT.PNEXT); }
    /** Unsafe version of {@link #index}. */
    public static int nindex(long struct) { return memGetInt(struct + VkWriteIndirectExecutionSetShaderEXT.INDEX); }
    /** Unsafe version of {@link #shader}. */
    public static long nshader(long struct) { return memGetLong(struct + VkWriteIndirectExecutionSetShaderEXT.SHADER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkWriteIndirectExecutionSetShaderEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkWriteIndirectExecutionSetShaderEXT.PNEXT, value); }
    /** Unsafe version of {@link #index(int) index}. */
    public static void nindex(long struct, int value) { memPutInt(struct + VkWriteIndirectExecutionSetShaderEXT.INDEX, value); }
    /** Unsafe version of {@link #shader(long) shader}. */
    public static void nshader(long struct, long value) { memPutLong(struct + VkWriteIndirectExecutionSetShaderEXT.SHADER, value); }

    // -----------------------------------

    /** An array of {@link VkWriteIndirectExecutionSetShaderEXT} structs. */
    public static class Buffer extends StructBuffer<VkWriteIndirectExecutionSetShaderEXT, Buffer> implements NativeResource {

        private static final VkWriteIndirectExecutionSetShaderEXT ELEMENT_FACTORY = VkWriteIndirectExecutionSetShaderEXT.create(-1L);

        /**
         * Creates a new {@code VkWriteIndirectExecutionSetShaderEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkWriteIndirectExecutionSetShaderEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkWriteIndirectExecutionSetShaderEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkWriteIndirectExecutionSetShaderEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkWriteIndirectExecutionSetShaderEXT.nsType(address()); }
        /** @return the value of the {@link VkWriteIndirectExecutionSetShaderEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkWriteIndirectExecutionSetShaderEXT.npNext(address()); }
        /** @return the value of the {@link VkWriteIndirectExecutionSetShaderEXT#index} field. */
        @NativeType("uint32_t")
        public int index() { return VkWriteIndirectExecutionSetShaderEXT.nindex(address()); }
        /** @return the value of the {@link VkWriteIndirectExecutionSetShaderEXT#shader} field. */
        @NativeType("VkShaderEXT")
        public long shader() { return VkWriteIndirectExecutionSetShaderEXT.nshader(address()); }

        /** Sets the specified value to the {@link VkWriteIndirectExecutionSetShaderEXT#sType} field. */
        public VkWriteIndirectExecutionSetShaderEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkWriteIndirectExecutionSetShaderEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT} value to the {@link VkWriteIndirectExecutionSetShaderEXT#sType} field. */
        public VkWriteIndirectExecutionSetShaderEXT.Buffer sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT); }
        /** Sets the specified value to the {@link VkWriteIndirectExecutionSetShaderEXT#pNext} field. */
        public VkWriteIndirectExecutionSetShaderEXT.Buffer pNext(@NativeType("void const *") long value) { VkWriteIndirectExecutionSetShaderEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkWriteIndirectExecutionSetShaderEXT#index} field. */
        public VkWriteIndirectExecutionSetShaderEXT.Buffer index(@NativeType("uint32_t") int value) { VkWriteIndirectExecutionSetShaderEXT.nindex(address(), value); return this; }
        /** Sets the specified value to the {@link VkWriteIndirectExecutionSetShaderEXT#shader} field. */
        public VkWriteIndirectExecutionSetShaderEXT.Buffer shader(@NativeType("VkShaderEXT") long value) { VkWriteIndirectExecutionSetShaderEXT.nshader(address(), value); return this; }

    }

}