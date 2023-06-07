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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing descriptor types that a given descriptor may mutate to.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code descriptorTypeCount} <b>must</b> not be 0 if the corresponding binding is of {@link EXTMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_EXT DESCRIPTOR_TYPE_MUTABLE_EXT}</li>
 * <li>{@code pDescriptorTypes} <b>must</b> be a valid pointer to an array of {@code descriptorTypeCount} valid, unique {@code VkDescriptorType} values if the given binding is of {@link EXTMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_EXT DESCRIPTOR_TYPE_MUTABLE_EXT} type</li>
 * <li>{@code descriptorTypeCount} <b>must</b> be 0 if the corresponding binding is not of {@link EXTMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_EXT DESCRIPTOR_TYPE_MUTABLE_EXT}</li>
 * <li>{@code pDescriptorTypes} <b>must</b> not contain {@link EXTMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_EXT DESCRIPTOR_TYPE_MUTABLE_EXT}</li>
 * <li>{@code pDescriptorTypes} <b>must</b> not contain {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}</li>
 * <li>{@code pDescriptorTypes} <b>must</b> not contain {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}</li>
 * <li>{@code pDescriptorTypes} <b>must</b> not contain {@link VK13#VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>If {@code descriptorTypeCount} is not 0, {@code pDescriptorTypes} <b>must</b> be a valid pointer to an array of {@code descriptorTypeCount} valid {@code VkDescriptorType} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkMutableDescriptorTypeCreateInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMutableDescriptorTypeListEXT {
 *     uint32_t {@link #descriptorTypeCount};
 *     VkDescriptorType const * {@link #pDescriptorTypes};
 * }</code></pre>
 */
public class VkMutableDescriptorTypeListEXT extends Struct<VkMutableDescriptorTypeListEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DESCRIPTORTYPECOUNT,
        PDESCRIPTORTYPES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DESCRIPTORTYPECOUNT = layout.offsetof(0);
        PDESCRIPTORTYPES = layout.offsetof(1);
    }

    protected VkMutableDescriptorTypeListEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMutableDescriptorTypeListEXT create(long address, @Nullable ByteBuffer container) {
        return new VkMutableDescriptorTypeListEXT(address, container);
    }

    /**
     * Creates a {@code VkMutableDescriptorTypeListEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMutableDescriptorTypeListEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the number of elements in {@code pDescriptorTypes}. */
    @NativeType("uint32_t")
    public int descriptorTypeCount() { return ndescriptorTypeCount(address()); }
    /** {@code NULL} or a pointer to an array of {@code descriptorTypeCount} {@code VkDescriptorType} values defining which descriptor types a given binding may mutate to. */
    @Nullable
    @NativeType("VkDescriptorType const *")
    public IntBuffer pDescriptorTypes() { return npDescriptorTypes(address()); }

    /** Sets the address of the specified {@link IntBuffer} to the {@link #pDescriptorTypes} field. */
    public VkMutableDescriptorTypeListEXT pDescriptorTypes(@Nullable @NativeType("VkDescriptorType const *") IntBuffer value) { npDescriptorTypes(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMutableDescriptorTypeListEXT set(VkMutableDescriptorTypeListEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMutableDescriptorTypeListEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMutableDescriptorTypeListEXT malloc() {
        return new VkMutableDescriptorTypeListEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMutableDescriptorTypeListEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMutableDescriptorTypeListEXT calloc() {
        return new VkMutableDescriptorTypeListEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMutableDescriptorTypeListEXT} instance allocated with {@link BufferUtils}. */
    public static VkMutableDescriptorTypeListEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMutableDescriptorTypeListEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkMutableDescriptorTypeListEXT} instance for the specified memory address. */
    public static VkMutableDescriptorTypeListEXT create(long address) {
        return new VkMutableDescriptorTypeListEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMutableDescriptorTypeListEXT createSafe(long address) {
        return address == NULL ? null : new VkMutableDescriptorTypeListEXT(address, null);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeListEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeListEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeListEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeListEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeListEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeListEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMutableDescriptorTypeListEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeListEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMutableDescriptorTypeListEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMutableDescriptorTypeListEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMutableDescriptorTypeListEXT malloc(MemoryStack stack) {
        return new VkMutableDescriptorTypeListEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMutableDescriptorTypeListEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMutableDescriptorTypeListEXT calloc(MemoryStack stack) {
        return new VkMutableDescriptorTypeListEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeListEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeListEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMutableDescriptorTypeListEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMutableDescriptorTypeListEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #descriptorTypeCount}. */
    public static int ndescriptorTypeCount(long struct) { return UNSAFE.getInt(null, struct + VkMutableDescriptorTypeListEXT.DESCRIPTORTYPECOUNT); }
    /** Unsafe version of {@link #pDescriptorTypes() pDescriptorTypes}. */
    @Nullable public static IntBuffer npDescriptorTypes(long struct) { return memIntBufferSafe(memGetAddress(struct + VkMutableDescriptorTypeListEXT.PDESCRIPTORTYPES), ndescriptorTypeCount(struct)); }

    /** Sets the specified value to the {@code descriptorTypeCount} field of the specified {@code struct}. */
    public static void ndescriptorTypeCount(long struct, int value) { UNSAFE.putInt(null, struct + VkMutableDescriptorTypeListEXT.DESCRIPTORTYPECOUNT, value); }
    /** Unsafe version of {@link #pDescriptorTypes(IntBuffer) pDescriptorTypes}. */
    public static void npDescriptorTypes(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkMutableDescriptorTypeListEXT.PDESCRIPTORTYPES, memAddressSafe(value)); ndescriptorTypeCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ndescriptorTypeCount(struct) != 0) {
            check(memGetAddress(struct + VkMutableDescriptorTypeListEXT.PDESCRIPTORTYPES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkMutableDescriptorTypeListEXT} structs. */
    public static class Buffer extends StructBuffer<VkMutableDescriptorTypeListEXT, Buffer> implements NativeResource {

        private static final VkMutableDescriptorTypeListEXT ELEMENT_FACTORY = VkMutableDescriptorTypeListEXT.create(-1L);

        /**
         * Creates a new {@code VkMutableDescriptorTypeListEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMutableDescriptorTypeListEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMutableDescriptorTypeListEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMutableDescriptorTypeListEXT#descriptorTypeCount} field. */
        @NativeType("uint32_t")
        public int descriptorTypeCount() { return VkMutableDescriptorTypeListEXT.ndescriptorTypeCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkMutableDescriptorTypeListEXT#pDescriptorTypes} field. */
        @Nullable
        @NativeType("VkDescriptorType const *")
        public IntBuffer pDescriptorTypes() { return VkMutableDescriptorTypeListEXT.npDescriptorTypes(address()); }

        /** Sets the address of the specified {@link IntBuffer} to the {@link VkMutableDescriptorTypeListEXT#pDescriptorTypes} field. */
        public VkMutableDescriptorTypeListEXT.Buffer pDescriptorTypes(@Nullable @NativeType("VkDescriptorType const *") IntBuffer value) { VkMutableDescriptorTypeListEXT.npDescriptorTypes(address(), value); return this; }

    }

}